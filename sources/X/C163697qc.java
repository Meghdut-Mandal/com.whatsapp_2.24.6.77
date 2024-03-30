package X;

import java.util.concurrent.Callable;

/* renamed from: X.7qc  reason: invalid class name and case insensitive filesystem */
public class C163697qc implements Callable {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C163697qc(Object obj, Object obj2, int i, int i2, long j) {
        this.A04 = i2;
        this.A02 = obj2;
        this.A00 = i;
        this.A03 = obj;
        this.A01 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01bb, code lost:
        if (r4.A01 == null) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0227, code lost:
        if (r4.A01 == null) goto L_0x0229;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r21 = this;
            r5 = r21
            int r0 = r5.A04
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "EncodeMuxerWrapper.setup"
            android.os.Trace.beginSection(r0)
            int r0 = r5.A00
            int r0 = r0 + -1
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r10 = r5.A02
            X.6n8 r10 = (X.C141376n8) r10
            android.os.Trace.endSection()
            r3 = 0
        L_0x001a:
            boolean r0 = r10.A0A
            if (r0 != 0) goto L_0x02c0
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L_0x02c0
            java.lang.String r0 = "EncodeMuxerWrapper.loop"
            android.os.Trace.beginSection(r0)
            java.lang.String r0 = "EncodeMuxerWrapper.dequeue"
            android.os.Trace.beginSection(r0)
            X.7ly r2 = r10.A09
            r0 = 250000(0x3d090, double:1.235164E-318)
            X.6mq r9 = r2.B5I(r0)
            android.os.Trace.endSection()
            if (r9 == 0) goto L_0x0069
            java.lang.String r0 = "EncodeMuxerWrapper.mux"
            android.os.Trace.beginSection(r0)
            java.lang.Object r8 = r5.A03
            X.6So r8 = (X.C132186So) r8
            long r11 = r5.A01
            int r0 = r9.A02
            if (r0 < 0) goto L_0x00b8
            android.media.MediaCodec$BufferInfo r13 = r9.A00
            int r0 = r13.flags
            r0 = r0 & 4
            r1 = 1
            if (r0 == 0) goto L_0x006f
            r3 = 1
        L_0x0059:
            android.os.Trace.endSection()
            java.lang.String r0 = "EncodeMuxerWrapper.release"
            android.os.Trace.beginSection(r0)
            X.7ly r0 = r10.A09
            r0.BnS(r9)
            android.os.Trace.endSection()
        L_0x0069:
            android.os.Trace.endSection()
            if (r3 != 0) goto L_0x02c0
            goto L_0x001a
        L_0x006f:
            X.6Pc r4 = r10.A04
            r4.A0M = r1
            long r6 = r13.presentationTimeUs
            long r2 = r4.A05
            r15 = 1
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00a4
            boolean r0 = r4.A0S
            if (r0 != 0) goto L_0x0087
            r4.A0S = r1
            long r0 = r6 - r2
            r4.A0B = r0
        L_0x0087:
            X.5zI r0 = r10.A06
            X.6OY r0 = r0.A04
            if (r0 == 0) goto L_0x00a4
            X.6Ay r14 = r0.A0C
            if (r14 == 0) goto L_0x00a4
            int r1 = r14.A01
            r0 = 1
            if (r0 != r1) goto L_0x00a4
            X.5Tf r1 = X.C108365Tf.CODEC_VIDEO_H264
            X.5Tf r0 = r14.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a4
            long r2 = r2 + r15
            r13.presentationTimeUs = r2
            r6 = r2
        L_0x00a4:
            double r2 = (double) r6
            double r0 = (double) r11
            double r2 = r2 / r0
            r8.A00(r2)
            java.lang.String r0 = "EncodeMuxerWrapper.writeVideoSampleData"
            android.os.Trace.beginSection(r0)     // Catch:{ Exception -> 0x00f1 }
            X.6mu r0 = r10.A05     // Catch:{ Exception -> 0x00f1 }
            r0.Bxg(r9)     // Catch:{ Exception -> 0x00f1 }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x00f1 }
            goto L_0x00f6
        L_0x00b8:
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x0101
            java.lang.String r0 = "EncodeMuxerWrapper.initTracksAndStartMuxer"
            android.os.Trace.beginSection(r0)
            X.5zI r0 = r10.A06
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x00e0
            android.media.MediaFormat r1 = r10.A02
            if (r1 == 0) goto L_0x00d4
            X.6mu r0 = r10.A05
            r0.A02 = r1
            X.6Pc r1 = r10.A04
            r0 = 1
            r1.A0J = r0
        L_0x00d4:
            X.C141376n8.A01(r10)
        L_0x00d7:
            X.6mu r0 = r10.A05
            r0.start()
            android.os.Trace.endSection()
            goto L_0x0101
        L_0x00e0:
            X.C141376n8.A01(r10)
            android.media.MediaFormat r1 = r10.A02
            if (r1 == 0) goto L_0x00d7
            X.6mu r0 = r10.A05
            r0.A02 = r1
            X.6Pc r1 = r10.A04
            r0 = 1
            r1.A0J = r0
            goto L_0x00d7
        L_0x00f1:
            long r0 = r4.A09
            long r0 = r0 + r15
            r4.A09 = r0
        L_0x00f6:
            android.media.MediaCodec$BufferInfo r0 = r9.A00
            long r0 = r0.presentationTimeUs
            r4.A05 = r0
            long r0 = r4.A0A
            long r0 = r0 + r15
            r4.A0A = r0
        L_0x0101:
            r3 = 0
            goto L_0x0059
        L_0x0104:
            java.lang.String r0 = "AudioEncodeMuxerWrapper.setup"
            android.os.Trace.beginSection(r0)
            int r0 = r5.A00
            int r0 = r0 + -1
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r4 = r5.A02
            X.6n7 r4 = (X.C141366n7) r4
            android.os.Trace.endSection()
            r3 = 0
        L_0x0118:
            boolean r0 = r4.A0C
            if (r0 != 0) goto L_0x02bb
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L_0x02bb
            java.lang.String r0 = "AudioEncodeMuxerWrapper.loop"
            android.os.Trace.beginSection(r0)
            X.60L r0 = r4.A0B
            r1 = 5000(0x1388, double:2.4703E-320)
            X.6Em r0 = r0.A00
            X.6mq r8 = r0.A01(r1)
            if (r8 == 0) goto L_0x0164
            java.lang.Object r11 = r5.A03
            X.6So r11 = (X.C132186So) r11
            long r12 = r5.A01
            android.media.MediaCodec$BufferInfo r2 = r8.A00
            int r10 = r8.A02
            if (r10 < 0) goto L_0x01fa
            int r1 = r2.flags
            r0 = r1 & 2
            if (r0 != 0) goto L_0x02b8
            r0 = r1 & 4
            r1 = 1
            if (r0 == 0) goto L_0x016a
            r3 = 1
        L_0x014f:
            X.60L r0 = r4.A0B
            X.6Em r2 = r0.A00
            boolean r1 = r2.A07
            java.lang.String r0 = "MediaCodecWrapper.releaseOutputBuffer"
            android.os.Trace.beginSection(r0)
            if (r10 < 0) goto L_0x0161
            android.media.MediaCodec r0 = r2.A04
            r0.releaseOutputBuffer(r10, r1)
        L_0x0161:
            android.os.Trace.endSection()
        L_0x0164:
            android.os.Trace.endSection()
            if (r3 != 0) goto L_0x02bb
            goto L_0x0118
        L_0x016a:
            X.6Pc r9 = r4.A03
            r9.A0L = r1
            long r6 = r2.presentationTimeUs
            long r2 = r9.A03
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0180
            boolean r0 = r9.A0S
            if (r0 != 0) goto L_0x0180
            r9.A0S = r1
            long r0 = r6 - r2
            r9.A0B = r0
        L_0x0180:
            if (r11 == 0) goto L_0x0188
            double r2 = (double) r6
            double r0 = (double) r12
            double r2 = r2 / r0
            r11.A00(r2)
        L_0x0188:
            r13 = 1
            boolean r0 = r4.A09     // Catch:{ Exception -> 0x02a8 }
            if (r0 == 0) goto L_0x01f3
            android.media.MediaCodec$BufferInfo r2 = r8.A00     // Catch:{ Exception -> 0x02a8 }
            int r0 = r2.size     // Catch:{ Exception -> 0x02a8 }
            byte[] r7 = r4.A0A     // Catch:{ Exception -> 0x02a8 }
            int r6 = r0 + 7
            r12 = r6 & 7
            int r0 = r6 >> 3
            r11 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r6 >> 11
            r3 = 3
            r1 = r0 & 3
            byte r0 = r7[r3]     // Catch:{ Exception -> 0x02a8 }
            r0 = r0 & 252(0xfc, float:3.53E-43)
            r1 = r1 | r0
            byte r0 = (byte) r1     // Catch:{ Exception -> 0x02a8 }
            r7[r3] = r0     // Catch:{ Exception -> 0x02a8 }
            byte r1 = (byte) r11     // Catch:{ Exception -> 0x02a8 }
            r0 = 4
            r7[r0] = r1     // Catch:{ Exception -> 0x02a8 }
            r1 = 5
            int r12 = r12 << r1
            r0 = r12 | 31
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x02a8 }
            r7[r1] = r0     // Catch:{ Exception -> 0x02a8 }
            java.nio.ByteBuffer r3 = r4.A06     // Catch:{ Exception -> 0x02a8 }
            if (r3 == 0) goto L_0x01bd
            android.media.MediaCodec$BufferInfo r0 = r4.A01     // Catch:{ Exception -> 0x02a8 }
            r1 = 1
            if (r0 != 0) goto L_0x01be
        L_0x01bd:
            r1 = 0
        L_0x01be:
            java.lang.String r0 = "Temporary buffers are null"
            X.C131736Qi.A02(r1, r0)     // Catch:{ Exception -> 0x02a8 }
            r3.clear()     // Catch:{ Exception -> 0x02a8 }
            r3.limit(r6)     // Catch:{ Exception -> 0x02a8 }
            r3.put(r7)     // Catch:{ Exception -> 0x02a8 }
            java.nio.ByteBuffer r0 = r8.B95()     // Catch:{ Exception -> 0x02a8 }
            X.C90464aC.A0s(r2, r0)     // Catch:{ Exception -> 0x02a8 }
            r3.put(r0)     // Catch:{ Exception -> 0x02a8 }
            android.media.MediaCodec$BufferInfo r15 = r4.A01     // Catch:{ Exception -> 0x02a8 }
            r16 = 0
            long r0 = r2.presentationTimeUs     // Catch:{ Exception -> 0x02a8 }
            int r2 = r2.flags     // Catch:{ Exception -> 0x02a8 }
            r17 = r6
            r18 = r0
            r20 = r2
            r15.set(r16, r17, r18, r20)     // Catch:{ Exception -> 0x02a8 }
            X.7lm r1 = r4.A04     // Catch:{ Exception -> 0x02a8 }
            X.6mq r0 = new X.6mq     // Catch:{ Exception -> 0x02a8 }
            r0.<init>(r10, r3, r15)     // Catch:{ Exception -> 0x02a8 }
            r1.BxZ(r0)     // Catch:{ Exception -> 0x02a8 }
            goto L_0x02ad
        L_0x01f3:
            X.7lm r0 = r4.A04     // Catch:{ Exception -> 0x02a8 }
            r0.BxZ(r8)     // Catch:{ Exception -> 0x02a8 }
            goto L_0x02ad
        L_0x01fa:
            r12 = 0
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x02b8
            X.60L r0 = r4.A0B
            X.6Em r0 = r0.A00
            android.media.MediaFormat r2 = r0.A00
            X.7lm r6 = r4.A04
            r6.BqF(r2)
            r6.start()
            r1 = 0
            java.lang.String r0 = "csd-0"
            java.nio.ByteBuffer r3 = r2.getByteBuffer(r0)
            if (r3 == 0) goto L_0x0217
            r1 = 1
        L_0x0217:
            java.lang.String r0 = "CSD should not be null. Verify encoder was configured properly."
            X.C131736Qi.A02(r1, r0)
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0255
            java.nio.ByteBuffer r2 = r4.A06
            if (r2 == 0) goto L_0x0229
            android.media.MediaCodec$BufferInfo r0 = r4.A01
            r1 = 1
            if (r0 != 0) goto L_0x022a
        L_0x0229:
            r1 = 0
        L_0x022a:
            java.lang.String r0 = "Temporary buffers are null"
            X.C131736Qi.A02(r1, r0)
            android.media.MediaCodec$BufferInfo r11 = r4.A01
            int r13 = r3.limit()
            r14 = 0
            r16 = 2
            r11.set(r12, r13, r14, r16)
            r2.clear()
            int r0 = r3.limit()
            r2.limit(r0)
            r3.position(r12)
            r2.put(r3)
            r1 = -1
            X.6mq r0 = new X.6mq
            r0.<init>(r1, r2, r11)
            r6.BxZ(r0)
        L_0x0255:
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x02a2
            byte[] r6 = r4.A0A
            byte r0 = r3.get(r12)
            r9 = 3
            int r0 = r0 >> r9
            r2 = r0 & 31
            byte r0 = r3.get(r12)
            r8 = r0 & 7
            r1 = 1
            int r8 = r8 << r1
            byte r0 = r3.get(r1)
            int r0 = r0 >> 7
            r0 = r0 & 1
            r8 = r8 | r0
            byte r0 = r3.get(r1)
            int r0 = r0 >> r9
            r7 = r0 & 15
            r0 = -1
            r6[r12] = r0
            r0 = -15
            r6[r1] = r0
            r3 = 6
            int r2 = r2 << r3
            byte r0 = (byte) r2
            r2 = 2
            r6[r2] = r0
            int r8 = r8 << r2
            r0 = r0 | r8
            byte r1 = (byte) r0
            r6[r2] = r1
            int r0 = r7 >> 2
            r1 = r1 | r0
            byte r0 = (byte) r1
            r6[r2] = r0
            r0 = r7 & 3
            int r0 = r0 << r3
            byte r0 = (byte) r0
            r6[r9] = r0
            r0 = 4
            r6[r0] = r12
            r0 = 5
            r6[r0] = r12
            r0 = -4
            r6[r3] = r0
        L_0x02a2:
            X.6Pc r1 = r4.A03
            r0 = 1
            r1.A0J = r0
            goto L_0x02b8
        L_0x02a8:
            long r0 = r9.A06
            long r0 = r0 + r13
            r9.A06 = r0
        L_0x02ad:
            android.media.MediaCodec$BufferInfo r0 = r8.A00
            long r0 = r0.presentationTimeUs
            r9.A03 = r0
            long r0 = r9.A07
            long r0 = r0 + r13
            r9.A07 = r0
        L_0x02b8:
            r3 = 0
            goto L_0x014f
        L_0x02bb:
            X.7lm r0 = r4.A04
            r0.stop()
        L_0x02c0:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163697qc.call():java.lang.Object");
    }
}
