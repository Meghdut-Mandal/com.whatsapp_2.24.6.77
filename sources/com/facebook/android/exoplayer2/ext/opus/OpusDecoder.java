package com.facebook.android.exoplayer2.ext.opus;

import X.AnonymousClass000;
import X.AnonymousClass82P;
import X.AnonymousClass82X;
import X.AnonymousClass82Z;
import X.C1888991e;
import X.C1890491w;
import X.C200319h9;
import X.C209039zM;
import com.facebook.android.exoplayer2.decoder.SimpleOutputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

public final class OpusDecoder extends C209039zM {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;

    private native void opusClose(long j);

    private native int opusDecode(long j, long j2, ByteBuffer byteBuffer, int i, SimpleOutputBuffer simpleOutputBuffer);

    private native int opusGetErrorCode(long j);

    private native String opusGetErrorMessage(long j);

    private native long opusInit(int i, int i2, int i3, int i4, int i5, byte[] bArr);

    private native void opusReset(long j);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpusDecoder(List list, int i) {
        super(new AnonymousClass82Z[16], new SimpleOutputBuffer[16]);
        byte b;
        boolean z;
        int i2;
        List list2 = list;
        byte[] bArr = (byte[]) list2.get(0);
        int length = bArr.length;
        if (length >= 19) {
            byte b2 = bArr[9] & 255;
            this.A01 = b2;
            if (b2 <= 8) {
                byte b3 = ((bArr[11] & 255) << 8) | (bArr[10] & 255);
                byte b4 = ((bArr[17] & 255) << 8) | (bArr[16] & 255);
                byte[] bArr2 = new byte[8];
                if (bArr[18] == 0) {
                    if (b2 <= 2) {
                        z = AnonymousClass000.A1S(b2, 2);
                        bArr2[0] = 0;
                        bArr2[1] = 1;
                        b = 1;
                    } else {
                        throw new AnonymousClass82P("Invalid Header, missing stream map.");
                    }
                } else if (length >= b2 + 21) {
                    b = bArr[19] & 255;
                    z = bArr[20] & true;
                    System.arraycopy(bArr, 21, bArr2, 0, b2);
                } else {
                    throw new AnonymousClass82P("Header size is too small.");
                }
                if (list2.size() != 3) {
                    this.A03 = b3;
                    i2 = 3840;
                } else if (((byte[]) list2.get(1)).length == 8 && ((byte[]) list2.get(2)).length == 8) {
                    long j = ByteBuffer.wrap((byte[]) list2.get(1)).order(ByteOrder.nativeOrder()).getLong();
                    long j2 = ByteBuffer.wrap((byte[]) list2.get(2)).order(ByteOrder.nativeOrder()).getLong();
                    this.A03 = (int) ((j * 48000) / 1000000000);
                    i2 = (int) ((j2 * 48000) / 1000000000);
                } else {
                    throw new AnonymousClass82P("Invalid Codec Delay or Seek Preroll");
                }
                this.A02 = i2;
                long opusInit = opusInit(48000, b2, b, z ? 1 : 0, b4, bArr2);
                this.A04 = opusInit;
                if (opusInit != 0) {
                    int i3 = this.A00;
                    C200319h9.A02(AnonymousClass000.A1S(i3, r2));
                    for (AnonymousClass82Z A002 : this.A0A) {
                        A002.A00(i);
                    }
                    return;
                }
                throw new AnonymousClass82P("Failed to initialize decoder");
            }
            throw new AnonymousClass82P(AnonymousClass000.A0r("Invalid channel count: ", AnonymousClass000.A0u(), b2));
        }
        throw new AnonymousClass82P("Header size is too small.");
    }

    public /* bridge */ /* synthetic */ C1890491w A01(AnonymousClass82Z r15, AnonymousClass82X r16, boolean z) {
        int i;
        SimpleOutputBuffer simpleOutputBuffer = (SimpleOutputBuffer) r16;
        if (z) {
            opusReset(this.A04);
            if (r15.A00 == 0) {
                i = this.A03;
            } else {
                i = this.A02;
            }
            this.A00 = i;
        }
        ByteBuffer byteBuffer = r15.A01;
        if (!AnonymousClass000.A1S(r15.A00 & 1073741824, 1073741824)) {
            int opusDecode = opusDecode(this.A04, r15.A00, byteBuffer, byteBuffer.limit(), simpleOutputBuffer);
            if (opusDecode >= 0) {
                ByteBuffer byteBuffer2 = simpleOutputBuffer.data;
                byteBuffer2.position(0);
                byteBuffer2.limit(opusDecode);
                int i2 = this.A00;
                if (i2 <= 0) {
                    return null;
                }
                int i3 = this.A01 * 2;
                int i4 = i2 * i3;
                if (opusDecode <= i4) {
                    this.A00 = i2 - (opusDecode / i3);
                    simpleOutputBuffer.A00 = Integer.MIN_VALUE | simpleOutputBuffer.A00;
                    byteBuffer2.position(opusDecode);
                    return null;
                }
                this.A00 = 0;
                byteBuffer2.position(i4);
                return null;
            } else if (opusDecode != -2) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Decode error: ");
                return new AnonymousClass82P(AnonymousClass000.A0q(opusGetErrorMessage((long) opusDecode), A0u));
            }
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("Drm error: ");
        long j = this.A04;
        String A0q = AnonymousClass000.A0q(opusGetErrorMessage(j), A0u2);
        return new AnonymousClass82P(A0q, new C1888991e(opusGetErrorCode(j), A0q));
    }

    public String getName() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("libopus");
        return AnonymousClass000.A0q(OpusLibrary.opusGetVersion(), A0u);
    }

    public void release() {
        super.release();
        opusClose(this.A04);
    }
}
