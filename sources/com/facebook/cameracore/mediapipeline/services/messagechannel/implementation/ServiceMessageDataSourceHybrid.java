package com.facebook.cameracore.mediapipeline.services.messagechannel.implementation;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.C1891092d;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public final class ServiceMessageDataSourceHybrid {
    public final C1891092d dataSource;
    public final HybridData mHybridData = initHybrid();

    public ServiceMessageDataSourceHybrid(C1891092d r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.dataSource = r2;
    }

    private final native HybridData initHybrid();

    public native void didReceiveMessageFromPlatform(int i, ByteBuffer byteBuffer, int i2);

    public native void setConfiguration(int i, ByteBuffer byteBuffer, int i2);

    public final void didReceiveFromXplat(int i, byte[] bArr) {
        ByteBuffer.wrap(bArr);
        throw AnonymousClass001.A0A("didReceiveFromXplat");
    }
}
