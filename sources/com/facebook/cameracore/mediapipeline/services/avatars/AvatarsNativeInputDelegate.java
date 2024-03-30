package com.facebook.cameracore.mediapipeline.services.avatars;

import X.AnonymousClass945;
import com.facebook.cdl.gltfmemorypointerholder.ColorRampMemoryPointerHolder;
import com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.util.Map;

public final class AvatarsNativeInputDelegate {
    public static final AnonymousClass945 Companion = new AnonymousClass945();
    public final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    public final native void loadAnimationFromFile(String str, String str2);

    public final native void loadAvatarFromMemory(String str, String str2, GltfMemoryPointerWrapper gltfMemoryPointerWrapper);

    public final native void loadColorRampFromMemory(String str, String str2, ColorRampMemoryPointerHolder colorRampMemoryPointerHolder);

    public final native void setAle(ColorRampMemoryPointerHolder colorRampMemoryPointerHolder);

    public final native void setFixedElapsedTimeForAnimation(float f);

    public final native void updateBlendWeightsForPrimitive(ColorRampMemoryPointerHolder colorRampMemoryPointerHolder);

    public final native void updateSliderValues(Map map);

    static {
        SoLoader.A06("avatarsdataprovider");
    }
}
