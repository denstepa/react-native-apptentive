package com.krazylabs.apptentive;

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
    public void showMessageCenter() {
        Apptentive.showMessageCenter(getReactApplicationContext());
    }
}
