/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public enum IconSize {
  xxSmall(0),
  xSmall,
  Small,
  Standard,
  Medium,
  Large,
  xLarge,
  xxLarge;

  public final int swigValue() {
    return swigValue;
  }

  public static IconSize swigToEnum(int swigValue) {
    IconSize[] swigValues = IconSize.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (IconSize swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + IconSize.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private IconSize() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private IconSize(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private IconSize(IconSize swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
