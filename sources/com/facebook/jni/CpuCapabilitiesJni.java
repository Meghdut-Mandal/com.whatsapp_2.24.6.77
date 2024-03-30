package com.facebook.jni;

import X.AnonymousClass10O;

public class CpuCapabilitiesJni {
    public static native boolean nativeDeviceSupportsNeon();

    public static native boolean nativeDeviceSupportsVFPFP16();

    public static native boolean nativeDeviceSupportsX86();

    static {
        AnonymousClass10O.A00("fb");
    }
}
