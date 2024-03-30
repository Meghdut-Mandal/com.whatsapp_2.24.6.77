package com.facebook.cameracore.mediapipeline.engine.provider.whatsapp;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public class WhatsAppPluginConfigProvider extends PluginConfigProvider {
    public static native HybridData initHybrid(Context context);

    static {
        SoLoader.A06("graphicsengine-whatsapp-native");
    }

    public WhatsAppPluginConfigProvider(Context context) {
        this.mHybridData = initHybrid(context);
    }
}
