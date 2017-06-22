package com.inkitt.apptentive;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import com.apptentive.android.sdk.Apptentive;

public class RNApptentiveModule extends ReactContextBaseJavaModule {
    private final static String TAG = RNApptentiveModule.class.getCanonicalName();

    public RNApptentiveModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "RNApptentive";
    }

    @ReactMethod
    public void engage(String eventName) {
        Apptentive.engage(getReactApplicationContext(), eventName);
    }

    @ReactMethod void showMessageCenter() {
        Apptentive.showMessageCenter(getReactApplicationContext());
    }

//    @ReactMethod void register() {
//        Apptentive.register(getReactApplicationContext(), "360ed1e15447654354b1e17b2b087307f7bbc311be12bfb07d7ef648aa0ab5c9");
//    }

    public void onCreate() {
      super.onCreate();
      Apptentive.register(this, "360ed1e15447654354b1e17b2b087307f7bbc311be12bfb07d7ef648aa0ab5c9");
    }

}
