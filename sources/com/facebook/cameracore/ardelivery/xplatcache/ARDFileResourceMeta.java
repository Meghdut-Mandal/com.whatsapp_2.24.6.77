package com.facebook.cameracore.ardelivery.xplatcache;

import com.facebook.jni.HybridClassBase;
import com.facebook.soloader.SoLoader;
import java.nio.ByteBuffer;

public class ARDFileResourceMeta extends HybridClassBase {
    public native ByteBuffer getExtra();

    static {
        SoLoader.A06("ardcache-jni");
    }
}
