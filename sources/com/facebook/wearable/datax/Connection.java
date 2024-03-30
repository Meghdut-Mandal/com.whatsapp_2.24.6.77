package com.facebook.wearable.datax;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass6P8;
import X.AnonymousClass951;
import X.AnonymousClass953;
import X.AnonymousClass97B;
import X.AnonymousClass9PN;
import X.C006302t;
import X.C009003v;
import X.C019408g;
import X.C165597tg;
import X.C187298xc;
import X.C196589a6;
import X.C21857Abh;
import X.C36371kC;
import com.facebook.wearable.datax.util.MessageInfo;
import java.io.Closeable;
import java.nio.ByteBuffer;

public final class Connection extends C196589a6 implements Closeable {
    public static final AnonymousClass951 Companion = new AnonymousClass951();

    /* renamed from: native  reason: not valid java name */
    public final C21857Abh f15native;
    public C006302t onRead;
    public C019408g onWriteError;
    public final AnonymousClass9PN receiveFragment;
    public final C009003v writer;

    private final native long allocateNative(long j);

    private final native void closeNative(long j);

    private final native boolean closedNative(long j);

    public static final native void deallocateNative(long j);

    private final native MessageInfo getMessageInfoNative(long j, ByteBuffer byteBuffer, int i, int i2, boolean z);

    private final native long handleNative(long j);

    private final native int interruptCodeNative(long j);

    private final native void interruptNative(long j, int i);

    private final native int mtuNative(long j);

    private final native boolean onReceivedNative(long j, ByteBuffer byteBuffer, int i, int i2);

    /* access modifiers changed from: private */
    public final native int pollReceiveFragmentNative(long j, ByteBuffer byteBuffer, int i);

    private final native void registerServiceNative(long j, long j2);

    private final native void resetNative(long j);

    private final native int versionNative(long j);

    public final MessageInfo getMessageInfo(ByteBuffer byteBuffer, boolean z) {
        AnonymousClass00C.A0D(byteBuffer, 0);
        return getMessageInfoNative(this.f15native.A00(), byteBuffer, byteBuffer.remaining(), byteBuffer.position(), z);
    }

    public final void interruptWithError(AnonymousClass6P8 r4) {
        AnonymousClass00C.A0D(r4, 0);
        interruptNative(this.f15native.A00(), r4.A00);
    }

    public final void onReceived(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        AnonymousClass00C.A0D(byteBuffer, 0);
        if (!byteBuffer.isDirect()) {
            throw AnonymousClass001.A09("Bytes buffer must be direct");
        } else if (onReceivedNative(this.f15native.A00(), byteBuffer2, byteBuffer.position(), byteBuffer.remaining())) {
            C165597tg.A1K(byteBuffer);
        } else {
            throw new C187298xc(AnonymousClass6P8.A05);
        }
    }

    public final AnonymousClass6P8 onReceivedWithInterrupt(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        AnonymousClass00C.A0D(byteBuffer, 0);
        if (byteBuffer.isDirect()) {
            int position = byteBuffer.position();
            int remaining = byteBuffer.remaining();
            C165597tg.A1K(byteBuffer);
            if (onReceivedNative(this.f15native.A00(), byteBuffer2, position, remaining)) {
                int interruptCodeNative = interruptCodeNative(this.f15native.A00());
                if (interruptCodeNative != 0) {
                    return new AnonymousClass6P8(interruptCodeNative);
                }
                return AnonymousClass6P8.A06;
            }
            throw new C187298xc(AnonymousClass6P8.A05);
        }
        throw AnonymousClass001.A09("Bytes buffer must be direct");
    }

    public final void register(Service service) {
        AnonymousClass00C.A0D(service, 0);
        registerServiceNative(this.f15native.A00(), service.getHandle$fbandroid_java_com_facebook_wearable_datax_datax());
    }

    private final void handleRead(MessageInfo messageInfo) {
        C006302t r0 = this.onRead;
        if (r0 != null) {
            r0.invoke(messageInfo);
        }
    }

    private final int handleWrite(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        C009003v r0 = this.writer;
        if (r0 != null) {
            return ((AnonymousClass6P8) r0.invoke(byteBuffer, byteBuffer2)).A00;
        }
        throw AnonymousClass001.A09("invalid connection configuration");
    }

    private final int handleWriteError(int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        AnonymousClass6P8 r0;
        C019408g r1 = this.onWriteError;
        if (r1 == null || (r0 = (AnonymousClass6P8) r1.BKt(new AnonymousClass6P8(i), byteBuffer, byteBuffer2)) == null) {
            return i;
        }
        return r0.A00;
    }

    public void close() {
        closeNative(this.f15native.A00());
        AnonymousClass953.A00();
    }

    public final boolean getClosed() {
        if (this.f15native.A01.get() == 0 || closedNative(this.f15native.A00())) {
            return true;
        }
        return false;
    }

    public final long getHandle$fbandroid_java_com_facebook_wearable_datax_datax() {
        return handleNative(this.f15native.A00());
    }

    public final int getMtu() {
        return mtuNative(this.f15native.A00());
    }

    public final int getVersion() {
        return versionNative(this.f15native.A00());
    }

    public final LocalChannel openChannel(int i) {
        return new LocalChannel(this, i);
    }

    public final void reset() {
        resetNative(this.f15native.A00());
    }

    public Connection(Long l, C009003v r6) {
        this.writer = r6;
        this.f15native = new C21857Abh(this, AnonymousClass97B.A00(Companion, 1), allocateNative(C36371kC.A0A(l)));
        this.receiveFragment = new AnonymousClass9PN(this);
    }

    public final C006302t getOnRead() {
        return this.onRead;
    }

    public final C019408g getOnWriteError() {
        return this.onWriteError;
    }

    public final AnonymousClass9PN getReceiveFragment() {
        return this.receiveFragment;
    }

    public final void setOnRead(C006302t r1) {
        this.onRead = r1;
    }

    public final void setOnWriteError(C019408g r1) {
        this.onWriteError = r1;
    }

    public Connection(long j) {
        this(Long.valueOf(j), (C009003v) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Connection(C009003v r2) {
        this((Long) null, r2);
        AnonymousClass00C.A0D(r2, 1);
    }
}
