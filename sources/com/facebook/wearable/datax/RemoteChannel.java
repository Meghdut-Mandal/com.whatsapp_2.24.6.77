package com.facebook.wearable.datax;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass6P8;
import X.AnonymousClass955;
import X.AnonymousClass97B;
import X.C165597tg;
import X.C187298xc;
import X.C196589a6;
import X.C197549bt;
import X.C21857Abh;
import java.nio.ByteBuffer;

public final class RemoteChannel extends C196589a6 {
    public static final AnonymousClass955 Companion = new AnonymousClass955();

    /* renamed from: native  reason: not valid java name */
    public final C21857Abh f17native;

    private final native long allocateNative(long j);

    public static final native void deallocateNative(long j);

    private final native int idNative(long j);

    private final native int sendErrorNative(long j, int i);

    private final native int sendNative(long j, int i, ByteBuffer byteBuffer, int i2, int i3);

    public final void send(C197549bt r9) {
        AnonymousClass00C.A0D(r9, 0);
        ByteBuffer byteBuffer = r9.A00;
        if (byteBuffer != null) {
            AnonymousClass6P8 r1 = new AnonymousClass6P8(sendNative(this.f17native.A00(), r9.A01, byteBuffer, byteBuffer.position(), byteBuffer.remaining()));
            if (r1.equals(AnonymousClass6P8.A06)) {
                C165597tg.A1K(byteBuffer);
                return;
            }
            throw new C187298xc(r1);
        }
        throw AnonymousClass001.A09("invalid buffer");
    }

    public final int getId() {
        return idNative(this.f17native.A00());
    }

    public RemoteChannel(long j) {
        this.f17native = new C21857Abh(this, AnonymousClass97B.A00(Companion, 3), allocateNative(j));
    }

    public final void send(AnonymousClass6P8 r4) {
        AnonymousClass00C.A0D(r4, 0);
        AnonymousClass6P8 r1 = new AnonymousClass6P8(sendErrorNative(this.f17native.A00(), r4.A00));
        if (!r1.equals(AnonymousClass6P8.A06)) {
            throw new C187298xc(r1);
        }
    }
}
