/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class ChoiceInput {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected ChoiceInput(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ChoiceInput obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_ChoiceInput(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ChoiceInput() {
    this(AdaptiveCardObjectModelJNI.new_ChoiceInput(), true);
  }

  public String Serialize() {
    return AdaptiveCardObjectModelJNI.ChoiceInput_Serialize(swigCPtr, this);
  }

  public SWIGTYPE_p_Json__Value SerializeToJsonValue() {
    return new SWIGTYPE_p_Json__Value(AdaptiveCardObjectModelJNI.ChoiceInput_SerializeToJsonValue(swigCPtr, this), true);
  }

  public String GetTitle() {
    return AdaptiveCardObjectModelJNI.ChoiceInput_GetTitle(swigCPtr, this);
  }

  public void SetTitle(String value) {
    AdaptiveCardObjectModelJNI.ChoiceInput_SetTitle(swigCPtr, this, value);
  }

  public String GetValue() {
    return AdaptiveCardObjectModelJNI.ChoiceInput_GetValue(swigCPtr, this);
  }

  public void SetValue(String value) {
    AdaptiveCardObjectModelJNI.ChoiceInput_SetValue(swigCPtr, this, value);
  }

  public boolean GetIsSelected() {
    return AdaptiveCardObjectModelJNI.ChoiceInput_GetIsSelected(swigCPtr, this);
  }

  public void SetIsSelected(boolean value) {
    AdaptiveCardObjectModelJNI.ChoiceInput_SetIsSelected(swigCPtr, this, value);
  }

  public static ChoiceInput Deserialize(SWIGTYPE_p_Json__Value root) {
    long cPtr = AdaptiveCardObjectModelJNI.ChoiceInput_Deserialize(SWIGTYPE_p_Json__Value.getCPtr(root));
    return (cPtr == 0) ? null : new ChoiceInput(cPtr, true);
  }

  public static ChoiceInput DeserializeFromString(String jsonString) {
    long cPtr = AdaptiveCardObjectModelJNI.ChoiceInput_DeserializeFromString(jsonString);
    return (cPtr == 0) ? null : new ChoiceInput(cPtr, true);
  }

  public static ChoiceInput dynamic_cast(BaseCardElement baseCardElement) {
    long cPtr = AdaptiveCardObjectModelJNI.ChoiceInput_dynamic_cast(BaseCardElement.getCPtr(baseCardElement), baseCardElement);
    return (cPtr == 0) ? null : new ChoiceInput(cPtr, true);
  }

}
