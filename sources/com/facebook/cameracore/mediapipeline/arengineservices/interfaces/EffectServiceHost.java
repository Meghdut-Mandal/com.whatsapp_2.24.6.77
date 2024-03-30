package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.A0p;
import X.AnonymousClass001;
import X.AnonymousClass3OC;
import X.AnonymousClass9J8;
import X.AnonymousClass9N1;
import X.AnonymousClass9SF;
import X.AnonymousClass9UW;
import X.C111595cX;
import X.C1894793y;
import X.C20957A0q;
import X.C21740AYu;
import X.C36441kJ;
import X.C90514aH;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.arengineservices.whatsapp.WhatsAppEffectServiceHost;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchServiceImpl;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchService;
import com.facebook.cameracore.util.Reference;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class EffectServiceHost {
    public final C111595cX mArExperimentUtil;
    public EffectAttribution mAttribution;
    public final Context mContext;
    public boolean mDestroyed = false;
    public EffectManifest mEffectManifest = new EffectManifest();
    public final EffectServiceHostConfig mEffectServiceHostConfig;
    public HybridData mHybridData;
    public String mProductSessionId;
    public final C1894793y mServiceConfigurationHybridBuilder;
    public List mServiceConfigurations = AnonymousClass001.A0I();
    public final List mServiceModules;
    public AnonymousClass9SF mServicesHostConfiguration;

    public EffectServiceHost(Context context, EffectServiceHostConfig effectServiceHostConfig, C1894793y r5, Collection collection, String str, C111595cX r8) {
        this.mContext = context;
        this.mEffectServiceHostConfig = effectServiceHostConfig;
        this.mServiceConfigurationHybridBuilder = r5;
        this.mServiceModules = C36441kJ.A15(collection);
        this.mProductSessionId = null;
        this.mArExperimentUtil = r8;
    }

    private native void nativeSetCameraSensorRotation(int i);

    private native void nativeSetCurrentOptimizationMode(int i);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, long j, boolean z2, float[] fArr, float[] fArr2, float f, double d, double d2, Reference reference);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, byte[] bArr, long j, boolean z2, float[] fArr, float[] fArr2, float f, double d, double d2, Reference reference);

    public native void cleanupServices();

    public abstract TouchService createTouchService();

    public synchronized void destroy() {
        if (!this.mDestroyed) {
            this.mHybridData.resetNative();
            for (ServiceConfiguration destroy : this.mServiceConfigurations) {
                destroy.destroy();
            }
            this.mServiceConfigurations.clear();
            for (ServiceModule serviceModule : this.mServiceModules) {
                serviceModule.mHybridData.resetNative();
            }
            this.mServiceModules.clear();
            this.mDestroyed = true;
        }
    }

    public abstract void destroyTouchService();

    public native void resetServices();

    public native void stopEffect();

    public static ScheduledExecutorService newSingleBackgroundThreadScheduledExecutor(String str) {
        return Executors.newSingleThreadScheduledExecutor(new C21740AYu(str));
    }

    public void setManifest(EffectManifest effectManifest) {
        this.mEffectManifest = effectManifest;
        TouchService touchService = ((WhatsAppEffectServiceHost) this).touchService;
        if (touchService != null) {
            AnonymousClass9N1 r1 = new AnonymousClass9N1(effectManifest.supportsTapGesture, effectManifest.supportsPanGesture, effectManifest.supportsPinchGesture, effectManifest.supportsRotateGesture, effectManifest.supportsLongPressGesture, effectManifest.supportsRawTouchGesture);
            AnonymousClass3OC r2 = ((TouchServiceImpl) touchService).mGestureProcessor;
            if (r2 != null) {
                r2.A02 = r1;
                Set set = r2.A0A;
                set.clear();
                if (r2.A02.A05) {
                    set.add(Gesture.GestureType.TAP);
                }
                if (r2.A02.A01) {
                    set.add(Gesture.GestureType.PAN);
                }
                if (r2.A02.A02) {
                    set.add(Gesture.GestureType.PINCH);
                }
                if (r2.A02.A04) {
                    set.add(Gesture.GestureType.ROTATE);
                }
                if (r2.A02.A00) {
                    set.add(Gesture.GestureType.LONG_PRESS);
                }
                if (r2.A02.A03) {
                    set.add(Gesture.GestureType.RAW_TOUCH);
                }
            }
        }
    }

    public void updateFrame(C20957A0q a0q, int i, boolean z) {
        int length;
        int i2;
        int i3;
        int i4;
        int i5;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        C20957A0q a0q2 = a0q;
        AnonymousClass9UW r1 = (AnonymousClass9UW) a0q2.get();
        int i6 = r1.A03;
        int i7 = r1.A01;
        AnonymousClass9J8[] r4 = r1.A05;
        if (r4 != null && (length = r4.length) > 0) {
            AnonymousClass9J8 r12 = r4[0];
            int i8 = r12.A01;
            if (i8 == 0) {
                i8 = i6;
            }
            int i9 = r12.A00;
            if (length > 1) {
                AnonymousClass9J8 r0 = r4[1];
                i2 = r0.A01;
                if (i2 == 0) {
                    i2 = i6;
                }
                i3 = r0.A00;
                if (length > 2) {
                    AnonymousClass9J8 r02 = r4[2];
                    i4 = r02.A01;
                    if (i4 == 0) {
                        i4 = i6;
                    }
                    i5 = r02.A00;
                }
                i4 = i6;
                i5 = 0;
            } else {
                i2 = i6;
                i3 = 0;
                i4 = i6;
                i5 = 0;
            }
            int i10 = r1.A02;
            ByteBuffer byteBuffer3 = r12.A02;
            if (length > 1) {
                byteBuffer = r4[1].A02;
                if (length > 2) {
                    byteBuffer2 = r4[2].A02;
                }
                byteBuffer2 = null;
            } else {
                byteBuffer = null;
                byteBuffer2 = null;
            }
            long j = r1.A04;
            double d = (double) 0;
            int i11 = 0;
            do {
                AtomicInteger atomicInteger = a0q2.A02;
                int i12 = atomicInteger.get();
                if (i12 == 0) {
                    throw AnonymousClass001.A09("Trying to lock already released reference.");
                } else if (atomicInteger.compareAndSet(i12, i12 + 1)) {
                    int i13 = i8;
                    int i14 = i9;
                    int i15 = i2;
                    int i16 = i3;
                    int i17 = i4;
                    int i18 = i5;
                    int i19 = i6;
                    int i20 = i7;
                    nativeUpdateFrame(i19, i20, i13, i14, i15, i16, i17, i18, i, z, i10, byteBuffer3, byteBuffer, byteBuffer2, j, false, (float[]) null, (float[]) null, 0.0f, d, d, new A0p(a0q2));
                    return;
                } else {
                    i11++;
                }
            } while (i11 < 10);
            throw C90514aH.A0s("WTF: Could not lock the reference after multiple tries.");
        }
    }

    public void setAttribution(EffectAttribution effectAttribution) {
        this.mAttribution = effectAttribution;
    }
}
