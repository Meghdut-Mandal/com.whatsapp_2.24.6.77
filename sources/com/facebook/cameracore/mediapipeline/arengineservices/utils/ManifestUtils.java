package com.facebook.cameracore.mediapipeline.arengineservices.utils;

import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;
import com.facebook.soloader.SoLoader;

public final class ManifestUtils {
    public static final ManifestUtils INSTANCE = new ManifestUtils();
    public static boolean forceSOLoad;

    public static final native int[] filterNeededServicesNative(String str, String str2, int[] iArr, ARExperimentConfig aRExperimentConfig);

    static {
        SoLoader.A06("arengineservicesutils");
    }
}
