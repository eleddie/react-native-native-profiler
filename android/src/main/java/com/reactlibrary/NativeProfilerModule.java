package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.debug.FpsDebugFrameCallback;

public class NativeProfilerModule extends ReactContextBaseJavaModule {
    private FpsDebugFrameCallback mFrameCallback;
    private int mTotalFramesDropped = 0;

    private final ReactApplicationContext reactContext;

    public NativeProfilerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
        try {
            Thread.sleep(10000);
            mFrameCallback = new FpsDebugFrameCallback(reactContext);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getName() {
        return "NativeProfiler";
    }

    @ReactMethod
    public void getDroppedFrames(Callback callback) {
        if (mFrameCallback == null) {
            mFrameCallback = new FpsDebugFrameCallback(reactContext);
        }
        mTotalFramesDropped += mFrameCallback.getExpectedNumFrames() - mFrameCallback.getNumFrames();
        callback.invoke("Dropped frames: " + mTotalFramesDropped);
    }
}
