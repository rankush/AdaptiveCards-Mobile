/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class Authentication {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected Authentication(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Authentication obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_Authentication(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Authentication() {
    this(AdaptiveCardObjectModelJNI.new_Authentication__SWIG_0(), true);
  }

  public Authentication(String text, String connectionName, TokenExchangeResource tokenExchangeResource, AuthCardButtonVector buttons) {
    this(AdaptiveCardObjectModelJNI.new_Authentication__SWIG_1(text, connectionName, TokenExchangeResource.getCPtr(tokenExchangeResource), tokenExchangeResource, AuthCardButtonVector.getCPtr(buttons), buttons), true);
  }

  public String GetText() {
    return AdaptiveCardObjectModelJNI.Authentication_GetText__SWIG_0(swigCPtr, this);
  }

  public void SetText(String arg0) {
    AdaptiveCardObjectModelJNI.Authentication_SetText(swigCPtr, this, arg0);
  }

  public String GetConnectionName() {
    return AdaptiveCardObjectModelJNI.Authentication_GetConnectionName__SWIG_0(swigCPtr, this);
  }

  public void SetConnectionName(String arg0) {
    AdaptiveCardObjectModelJNI.Authentication_SetConnectionName(swigCPtr, this, arg0);
  }

  public TokenExchangeResource GetTokenExchangeResource() {
    long cPtr = AdaptiveCardObjectModelJNI.Authentication_GetTokenExchangeResource__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new TokenExchangeResource(cPtr, true);
  }

  public void SetTokenExchangeResource(TokenExchangeResource arg0) {
    AdaptiveCardObjectModelJNI.Authentication_SetTokenExchangeResource(swigCPtr, this, TokenExchangeResource.getCPtr(arg0), arg0);
  }

  public AuthCardButtonVector GetButtons() {
    return new AuthCardButtonVector(AdaptiveCardObjectModelJNI.Authentication_GetButtons__SWIG_0(swigCPtr, this), false);
  }

  public void SetButtons(AuthCardButtonVector arg0) {
    AdaptiveCardObjectModelJNI.Authentication_SetButtons(swigCPtr, this, AuthCardButtonVector.getCPtr(arg0), arg0);
  }

  public boolean ShouldSerialize() {
    return AdaptiveCardObjectModelJNI.Authentication_ShouldSerialize(swigCPtr, this);
  }

  public String Serialize() {
    return AdaptiveCardObjectModelJNI.Authentication_Serialize(swigCPtr, this);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.Authentication_SerializeToJsonValue(swigCPtr, this), true);
  }

  public static Authentication Deserialize(ParseContext context, JsonValue json) {
    long cPtr = AdaptiveCardObjectModelJNI.Authentication_Deserialize(ParseContext.getCPtr(context), context, JsonValue.getCPtr(json), json);
    return (cPtr == 0) ? null : new Authentication(cPtr, true);
  }

  public static Authentication DeserializeFromString(ParseContext context, String jsonString) {
    long cPtr = AdaptiveCardObjectModelJNI.Authentication_DeserializeFromString(ParseContext.getCPtr(context), context, jsonString);
    return (cPtr == 0) ? null : new Authentication(cPtr, true);
  }

}