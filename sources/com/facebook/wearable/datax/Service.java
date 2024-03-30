package com.facebook.wearable.datax;

import X.AnonymousClass00C;
import X.AnonymousClass953;
import X.AnonymousClass956;
import X.C006302t;
import X.C009003v;
import X.C196589a6;
import X.C197549bt;
import X.C21857Abh;
import X.C22314Akc;
import java.nio.ByteBuffer;

public class Service extends C196589a6 {
    public static final AnonymousClass956 Companion = new AnonymousClass956();
    public static final String TAG = "DataXService";
    public final int id;

    /* renamed from: native  reason: not valid java name */
    public final C21857Abh f18native;
    public C006302t onConnected;
    public C006302t onDisconnected;
    public C009003v onReceived;

    private final native long allocateNative(int i);

    public static final native void deallocateNative(long j);

    public static /* synthetic */ void getNative$annotations() {
    }

    private final native long handleNative(long j);

    private final native void unregisterNative(long j);

    public void onConnected(RemoteChannel remoteChannel) {
    }

    public void onDisconnected(RemoteChannel remoteChannel) {
    }

    public void onReceived(RemoteChannel remoteChannel, C197549bt r2) {
    }

    public void onUnregister() {
    }

    private final void handleConnected(RemoteChannel remoteChannel) {
        C006302t r0 = this.onConnected;
        if (r0 != null) {
            r0.invoke(remoteChannel);
        }
    }

    private final void handleDisconnected(RemoteChannel remoteChannel) {
        C006302t r0 = this.onDisconnected;
        if (r0 != null) {
            r0.invoke(remoteChannel);
        }
        AnonymousClass953.A00();
    }

    public final long getHandle$fbandroid_java_com_facebook_wearable_datax_datax() {
        return handleNative(this.f18native.A00());
    }

    public final void unregister() {
        unregisterNative(this.f18native.A00());
        AnonymousClass953.A00();
    }

    public Service(int i) {
        this.id = i;
        this.f18native = new C21857Abh(this, new C22314Akc(this), allocateNative(i));
    }

    private final void handleReceived(RemoteChannel remoteChannel, int i, ByteBuffer byteBuffer) {
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        AnonymousClass00C.A08(asReadOnlyBuffer);
        C197549bt r2 = new C197549bt(i, asReadOnlyBuffer);
        try {
            ByteBuffer byteBuffer2 = r2.A00;
            if (byteBuffer2 != null) {
                byteBuffer2.rewind();
            }
            C009003v r0 = this.onReceived;
            if (r0 != null) {
                r0.invoke(remoteChannel, r2);
            }
        } finally {
            r2.A00 = null;
        }
    }

    public final int getId() {
        return this.id;
    }

    public final C006302t getOnConnected() {
        return this.onConnected;
    }

    public final C006302t getOnDisconnected() {
        return this.onDisconnected;
    }

    public final C009003v getOnReceived() {
        return this.onReceived;
    }

    public final void setOnConnected(C006302t r1) {
        this.onConnected = r1;
    }

    public final void setOnDisconnected(C006302t r1) {
        this.onDisconnected = r1;
    }

    public final void setOnReceived(C009003v r1) {
        this.onReceived = r1;
    }
}
