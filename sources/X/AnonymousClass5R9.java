package X;

import android.media.MediaCodec;
import java.io.File;
import java.io.InputStream;

/* renamed from: X.5R9  reason: invalid class name */
public final class AnonymousClass5R9 extends InputStream {
    public boolean A00;
    public final File A01;
    public final AnonymousClass00T A02 = C36431kI.A1I(new AnonymousClass7N4(this));
    public final AnonymousClass00T A03;
    public final C005002g A04 = new C005002g();
    public final MediaCodec.BufferInfo A05 = new MediaCodec.BufferInfo();
    public final C117915n2 A06 = new C117915n2(new AnonymousClass7N3(this));
    public final C117915n2 A07 = new C117915n2(new AnonymousClass7N5(this));

    public AnonymousClass5R9(File file, AnonymousClass00S r4) {
        AnonymousClass00C.A0D(r4, 2);
        this.A01 = file;
        this.A03 = C36431kI.A1I(new AnonymousClass7OG(this, r4));
    }

    public void close() {
        this.A06.A00.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r0 = r3.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read() {
        /*
            r14 = this;
            X.5n2 r0 = r14.A06
            X.00T r0 = r0.A00
            boolean r0 = r0.BM2()
            if (r0 != 0) goto L_0x009d
            X.00T r0 = r14.A02
            java.lang.Object r0 = r0.getValue()
            X.6Aj r0 = (X.C127976Aj) r0
            android.media.MediaCodec r7 = r0.A01
            X.00T r0 = r14.A03
            java.lang.Object r3 = r0.getValue()
            X.611 r3 = (X.AnonymousClass611) r3
            X.5n2 r0 = r14.A07
            X.00T r0 = r0.A00
            r0.getValue()
        L_0x0023:
            boolean r0 = r14.A00
            r2 = -1
            if (r0 != 0) goto L_0x0084
            X.02g r5 = r14.A04
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0084
            r0 = 0
            int r8 = r7.dequeueInputBuffer(r0)
            r2 = 1
            r9 = 0
            if (r8 < 0) goto L_0x0053
            java.nio.ByteBuffer r1 = r7.getInputBuffer(r8)
            if (r1 == 0) goto L_0x007a
            android.media.MediaExtractor r0 = r3.A00
            int r10 = r0.readSampleData(r1, r9)
            if (r10 < 0) goto L_0x007a
            long r11 = r0.getSampleTime()
            r13 = 0
            r7.queueInputBuffer(r8, r9, r10, r11, r13)
            r0.advance()
        L_0x0053:
            android.media.MediaCodec$BufferInfo r6 = r14.A05
            r0 = 1000000(0xf4240, double:4.940656E-318)
            int r6 = r7.dequeueOutputBuffer(r6, r0)
            if (r6 < 0) goto L_0x0023
            java.nio.ByteBuffer r1 = r7.getOutputBuffer(r6)
            if (r1 == 0) goto L_0x0076
        L_0x0064:
            boolean r0 = r1.hasRemaining()
            if (r0 != r2) goto L_0x0076
            byte r0 = r1.get()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r5.add(r0)
            goto L_0x0064
        L_0x0076:
            r7.releaseOutputBuffer(r6, r9)
            goto L_0x0023
        L_0x007a:
            r11 = 0
            r13 = 4
            r10 = 0
            r7.queueInputBuffer(r8, r9, r10, r11, r13)
            r14.A00 = r2
            goto L_0x0053
        L_0x0084:
            X.02g r1 = r14.A04
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0098
            r0 = 0
        L_0x008d:
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0097
            byte r0 = r0.byteValue()
            r2 = r0 & 255(0xff, float:3.57E-43)
        L_0x0097:
            return r2
        L_0x0098:
            java.lang.Object r0 = r1.A0N()
            goto L_0x008d
        L_0x009d:
            java.lang.String r0 = "Stream already closed"
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5R9.read():int");
    }
}
