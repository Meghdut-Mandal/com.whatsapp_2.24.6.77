package com.facebook.cameracore.mediapipeline.services.instruction;

import X.AnonymousClass842;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class InstructionServiceConfigurationHybrid extends ServiceConfiguration {
    public final AnonymousClass842 mConfiguration;

    public static native HybridData initHybrid(InstructionServiceListenerWrapper instructionServiceListenerWrapper);

    public InstructionServiceConfigurationHybrid(AnonymousClass842 r2) {
        super(initHybrid(r2.A00));
        this.mConfiguration = r2;
    }
}
