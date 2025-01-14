//
//  ACRToggleInputDataSource.mm
//  ACRToggleInputDataSource
//
//  Copyright © 2018 Microsoft. All rights reserved.
//

#import "ACRToggleInputDataSource.h"
#import "ACRColumnSetView.h"
#import "ACRIBaseCardElementRenderer.h"
#import "ACRInputLabelView.h"
#import "ACRUILabel.h"
#import "HostConfig.h"
#import <Foundation/Foundation.h>

using namespace AdaptiveCards;

@implementation ACRToggleInputDataSource

- (instancetype)initWithInputToggle:(std::shared_ptr<ToggleInput> const &)toggleInput
                     WithHostConfig:(std::shared_ptr<HostConfig> const &)hostConfig
{
    self = [super init];

    self.id = [[NSString alloc] initWithCString:toggleInput->GetId().c_str()
                                       encoding:NSUTF8StringEncoding];
    self.valueOn = [[NSString alloc] initWithCString:toggleInput->GetValueOn().c_str()
                                            encoding:NSUTF8StringEncoding];
    self.valueOff = [[NSString alloc] initWithCString:toggleInput->GetValueOff().c_str()
                                             encoding:NSUTF8StringEncoding];
    self.hasValidationProperties = self.isRequired;
    self.delegateSet = [NSMutableSet set];
    return self;
}

- (BOOL)validate:(NSError **)error
{
    if (self.isRequired) {
        return _toggleSwitch.on;
    }
    return YES;
}

- (void)getInput:(NSMutableDictionary *)dictionary
{
    dictionary[self.id] = _toggleSwitch.on ? self.valueOn : self.valueOff;
}

- (void)setFocus:(BOOL)shouldBecomeFirstResponder view:(UIView *)view
{
    [ACRInputLabelView commonSetFocus:shouldBecomeFirstResponder view:_toggleSwitch];
    UIAccessibilityPostNotification(UIAccessibilityLayoutChangedNotification, _toggleSwitch);
}

- (void)addObserverForValueChange:(id<ACRInputChangeDelegate>)delegate 
{
    [_toggleSwitch addTarget:self action:@selector(onSwitchValueChanged:) forControlEvents:UIControlEventValueChanged];
    [delegateSet addObject:delegate];
}

- (void)onSwitchValueChanged:(UISwitch *)sender {
    for (NSObject<ACRInputChangeDelegate> *delegate in delegateSet) {
        if (delegate && [delegate respondsToSelector:@selector(inputValueChanged)]) {
            [delegate inputValueChanged];
        }
    }
}

@synthesize isRequired;
@synthesize hasValidationProperties;
@synthesize hasVisibilityChanged;
@synthesize delegateSet;

@end
