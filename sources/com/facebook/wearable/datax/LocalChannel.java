package com.facebook.wearable.datax;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass6P8;
import X.AnonymousClass953;
import X.AnonymousClass954;
import X.AnonymousClass97B;
import X.C006302t;
import X.C165597tg;
import X.C187298xc;
import X.C196589a6;
import X.C197549bt;
import X.C21857Abh;
import java.io.Closeable;
import java.nio.ByteBuffer;

public final class LocalChannel extends C196589a6 implements Closeable {
    public static final AnonymousClass954 Companion = new AnonymousClass954();

    /* renamed from: native  reason: not valid java name */
    public final C21857Abh f16native;
    public AnonymousClass00S onClosed;
    public C006302t onError;
    public C006302t onReceived;
    public final int service;

    public LocalChannel(Connection connection, int i) {
        AnonymousClass00C.A0D(connection, 1);
        this.service = i;
        this.f16native = new C21857Abh(this, AnonymousClass97B.A00(Companion, 2), allocateNative(connection.getHandle$fbandroid_java_com_facebook_wearable_datax_datax(), i));
    }

    private final native long allocateNative(long j, int i);

    private final native void closeNative(long j);

    private final native boolean closedNative(long j);

    public static final native void deallocateNative(long j);

    private final native int idNative(long j);

    private final native int sendNative(long j, int i, ByteBuffer byteBuffer, int i2, int i3);

    public final void send(C197549bt r9) {
        AnonymousClass00C.A0D(r9, 0);
        ByteBuffer byteBuffer = r9.A00;
        if (byteBuffer != null) {
            AnonymousClass6P8 r1 = new AnonymousClass6P8(sendNative(this.f16native.A00(), r9.A01, byteBuffer, byteBuffer.position(), byteBuffer.remaining()));
            if (r1.equals(AnonymousClass6P8.A06)) {
                C165597tg.A1K(byteBuffer);
                return;
            }
            throw new C187298xc(r1);
        }
        throw AnonymousClass001.A09("invalid buffer");
    }

    private final void handleClosed() {
        AnonymousClass00S r0 = this.onClosed;
        if (r0 != null) {
            r0.invoke();
        }
        AnonymousClass953.A00();
    }

    private final void handleError(int i) {
        C006302t r2 = this.onError;
        if (r2 != null) {
            r2.invoke(new C187298xc(new AnonymousClass6P8(i)));
        }
    }

    private final void handleReceived(int i, ByteBuffer byteBuffer) {
        C006302t r1 = this.onReceived;
        if (r1 != null) {
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            AnonymousClass00C.A08(asReadOnlyBuffer);
            C197549bt r2 = new C197549bt(i, asReadOnlyBuffer);
            try {
                r1.invoke(r2);
            } finally {
                r2.A00 = null;
            }
        }
    }

    public void close() {
        closeNative(this.f16native.A00());
    }

    public final boolean getClosed() {
        if (this.f16native.A01.get() == 0 || closedNative(this.f16native.A00())) {
            return true;
        }
        return false;
    }

    public final int getId() {
        return idNative(this.f16native.A00());
    }

    public final AnonymousClass00S getOnClosed() {
        return this.onClosed;
    }

    public final C006302t getOnError() {
        return this.onError;
    }

    public final C006302t getOnReceived() {
        return this.onReceived;
    }

    public final int getService() {
        return this.service;
    }

    public final void setOnClosed(AnonymousClass00S r1) {
        this.onClosed = r1;
    }

    public final void setOnError(C006302t r1) {
        this.onError = r1;
    }

    public final void setOnReceived(C006302t r1) {
        this.onReceived = r1;
    }
}
