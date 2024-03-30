package X;

import android.content.Context;
import android.media.MediaFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: X.6n8  reason: invalid class name and case insensitive filesystem */
public class C141376n8 implements C160987lu {
    public AnonymousClass65N A00;
    public final Context A01;
    public final MediaFormat A02;
    public final AnonymousClass7ez A03;
    public final C131456Pc A04;
    public final C141246mu A05;
    public final C125085zI A06;
    public final ExecutorService A07;
    public final C159107ip A08;
    public volatile C161017ly A09;
    public volatile boolean A0A;
    public volatile Future A0B;

    public static boolean A02(AnonymousClass65N r4, int i) {
        HashMap hashMap = r4.A0J;
        if (hashMap != null) {
            AnonymousClass5TE r1 = AnonymousClass5TE.VIDEO;
            if (hashMap.get(r1) != null) {
                Iterator A10 = C36391kE.A10((AbstractMap) hashMap.get(r1));
                loop0:
                while (A10.hasNext()) {
                    Iterator A13 = C90514aH.A13(A10.next());
                    while (true) {
                        if (A13.hasNext()) {
                            if (((AnonymousClass65N) A13.next()).A02 != i) {
                                break loop0;
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void cancel() {
        this.A0A = true;
        if (this.A0B != null) {
            if (!this.A0B.isDone()) {
                this.A0B.cancel(true);
            }
            try {
                this.A0B.get();
            } catch (Throwable unused) {
            }
        }
        release();
    }

    public static void A01(C141376n8 r2) {
        if (r2.A09 != null) {
            MediaFormat BEp = r2.A09.BEp();
            C141246mu r1 = r2.A05;
            r1.A03 = BEp;
            r1.A00 = r2.A09.BEt();
            r2.A04.A0K = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2 A[Catch:{ all -> 0x0064, all -> 0x020b }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fb A[Catch:{ all -> 0x0064, all -> 0x020b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r29 = this;
            r3 = r29
            X.7ip r0 = r3.A08
            X.7ly r0 = r0.B4U()
            r3.A09 = r0
            X.5zI r2 = r3.A06
            boolean r0 = X.C129256Gb.A01(r2)
            if (r0 != 0) goto L_0x022b
            r1 = 1
            X.65W r0 = r2.A07
            r28 = r0
            int r25 = java.lang.Math.max(r1, r1)
        L_0x001b:
            int r25 = r25 + -1
            if (r25 < 0) goto L_0x022b
            X.6Pc r6 = r3.A04     // Catch:{ all -> 0x020b }
            long r4 = r6.A08     // Catch:{ all -> 0x020b }
            r0 = 1
            long r4 = r4 + r0
            r6.A08 = r4     // Catch:{ all -> 0x020b }
            X.6OY r4 = r2.A04     // Catch:{ all -> 0x020b }
            X.6Ay r0 = r4.A0C     // Catch:{ all -> 0x020b }
            if (r0 != 0) goto L_0x01f8
            X.5Yo r0 = r2.A06     // Catch:{ all -> 0x020b }
            r27 = r0
            boolean r0 = r4.A0G     // Catch:{ all -> 0x020b }
            r6 = 1
            r24 = 0
            if (r0 == 0) goto L_0x007f
            java.util.ArrayList r7 = r3.A00()     // Catch:{ all -> 0x020b }
        L_0x003d:
            java.util.Iterator r9 = r7.iterator()     // Catch:{ all -> 0x020b }
        L_0x0041:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x020b }
            if (r0 == 0) goto L_0x022b
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x020b }
            X.6Ay r8 = (X.C128116Ay) r8     // Catch:{ all -> 0x020b }
            r4.A0C = r8     // Catch:{ all -> 0x0064 }
            X.7ly r5 = r3.A09     // Catch:{ all -> 0x0064 }
            android.content.Context r1 = r3.A01     // Catch:{ all -> 0x0064 }
            X.65N r0 = r3.A00     // Catch:{ all -> 0x0064 }
            r16 = 0
            r10 = r5
            r11 = r1
            r12 = r0
            r13 = r4
            r14 = r27
            r15 = r28
            r10.Bm7(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0064 }
            goto L_0x022b
        L_0x0064:
            r7 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ all -> 0x020b }
            r5[r24] = r8     // Catch:{ all -> 0x020b }
            java.lang.String r1 = "VideoEncodeMuxerWrapper"
            java.lang.String r0 = "error preparing %s"
            X.AnonymousClass6YR.A0E(r1, r0, r7, r5)     // Catch:{ all -> 0x020b }
            int r0 = r8.A01     // Catch:{ all -> 0x020b }
            if (r6 != r0) goto L_0x0041
            X.5Tf r1 = X.C108365Tf.CODEC_VIDEO_H264     // Catch:{ all -> 0x020b }
            X.5Tf r0 = r8.A02     // Catch:{ all -> 0x020b }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x020b }
            if (r0 == 0) goto L_0x0041
            throw r7     // Catch:{ all -> 0x020b }
        L_0x007f:
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x020b }
            X.6QD r5 = r2.A05     // Catch:{ all -> 0x020b }
            r8 = 1
            r1 = 7
            if (r5 != 0) goto L_0x0090
            X.65N r10 = r3.A00     // Catch:{ all -> 0x020b }
            int r0 = r10.A02     // Catch:{ all -> 0x020b }
            if (r0 != r1) goto L_0x009e
            goto L_0x009f
        L_0x0090:
            X.65N r10 = r3.A00     // Catch:{ all -> 0x020b }
            boolean r0 = A02(r10, r1)     // Catch:{ all -> 0x020b }
            if (r0 == 0) goto L_0x009e
            X.5TE r0 = X.AnonymousClass5TE.VIDEO     // Catch:{ all -> 0x020b }
            X.AnonymousClass6U7.A03(r0, r5)     // Catch:{ all -> 0x020b }
            goto L_0x009f
        L_0x009e:
            r8 = 0
        L_0x009f:
            r9 = 2
            if (r8 == 0) goto L_0x00c1
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x020b }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x020b }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x020b }
        L_0x00ae:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x020b }
            if (r0 == 0) goto L_0x00be
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x020b }
            X.6Ay r0 = (X.C128116Ay) r0     // Catch:{ all -> 0x020b }
            r8.add(r0)     // Catch:{ all -> 0x020b }
            goto L_0x00ae
        L_0x00be:
            r7.addAll(r8)     // Catch:{ all -> 0x020b }
        L_0x00c1:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x020b }
            r0 = 29
            if (r1 < r0) goto L_0x00d5
            r0 = 6
            if (r5 == 0) goto L_0x00d5
            boolean r0 = A02(r10, r0)     // Catch:{ all -> 0x020b }
            if (r0 == 0) goto L_0x00d5
            X.5TE r0 = X.AnonymousClass5TE.VIDEO     // Catch:{ all -> 0x020b }
            X.AnonymousClass6U7.A03(r0, r5)     // Catch:{ all -> 0x020b }
        L_0x00d5:
            r8 = 64
            r1 = 1024(0x400, float:1.435E-42)
            r0 = 4
            java.lang.String r23 = "VideoEncodeMuxerWrapper"
            java.lang.Integer[] r5 = new java.lang.Integer[r0]     // Catch:{ all -> 0x020b }
            r0 = 0
            X.AnonymousClass000.A1L(r5, r1, r0)     // Catch:{ all -> 0x020b }
            r0 = 256(0x100, float:3.59E-43)
            X.C36331k8.A1X(r5, r0, r6, r8, r9)     // Catch:{ all -> 0x020b }
            r1 = 16
            r0 = 3
            X.AnonymousClass000.A1L(r5, r1, r0)     // Catch:{ all -> 0x020b }
            java.util.List r0 = java.util.Arrays.asList(r5)     // Catch:{ all -> 0x020b }
            java.util.Iterator r22 = r0.iterator()     // Catch:{ all -> 0x020b }
        L_0x00f5:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x020b }
            if (r0 == 0) goto L_0x01e8
            java.lang.Object r13 = r22.next()     // Catch:{ all -> 0x020b }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x020b }
            int r12 = r13.intValue()     // Catch:{ all -> 0x020b }
            java.util.ArrayList r21 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x020b }
            java.lang.String r20 = "EncoderCheck"
            X.5Tf r11 = X.C108365Tf.CODEC_VIDEO_HEVC     // Catch:{ RuntimeException -> 0x01bf }
            java.util.HashSet r19 = X.C36441kJ.A16()     // Catch:{ RuntimeException -> 0x01bf }
            r10 = 0
        L_0x0112:
            int r0 = android.media.MediaCodecList.getCodecCount()     // Catch:{ RuntimeException -> 0x01bf }
            if (r10 >= r0) goto L_0x01b1
            android.media.MediaCodecInfo r5 = android.media.MediaCodecList.getCodecInfoAt(r10)     // Catch:{ RuntimeException -> 0x01bf }
            boolean r0 = r5.isEncoder()     // Catch:{ RuntimeException -> 0x01bf }
            if (r0 != r6) goto L_0x01ad
            java.lang.String r8 = r11.value     // Catch:{ RuntimeException -> 0x01bf }
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()     // Catch:{ RuntimeException -> 0x01bf }
            java.lang.String[] r0 = r5.getSupportedTypes()     // Catch:{ RuntimeException -> 0x01bf }
            java.util.Collections.addAll(r1, r0)     // Catch:{ RuntimeException -> 0x01bf }
            boolean r0 = r1.contains(r8)     // Catch:{ RuntimeException -> 0x01bf }
            if (r0 == 0) goto L_0x01ad
            java.lang.String r0 = r5.getName()     // Catch:{ RuntimeException -> 0x01bf }
            java.lang.String r1 = r0.toLowerCase()     // Catch:{ RuntimeException -> 0x01bf }
            java.lang.String r0 = ".mtk."
            boolean r0 = r1.contains(r0)     // Catch:{ RuntimeException -> 0x01bf }
            if (r0 == 0) goto L_0x0151
            java.lang.String r5 = r5.getName()     // Catch:{ RuntimeException -> 0x01bf }
            java.lang.String r1 = "MediaCodecListWrapper"
            java.lang.String r0 = "skip codec %s "
            X.AnonymousClass6YR.A02(r5, r1, r0)     // Catch:{ RuntimeException -> 0x01bf }
            goto L_0x01ad
        L_0x0151:
            java.lang.String r0 = r11.value     // Catch:{ RuntimeException -> 0x01bf }
            android.media.MediaCodecInfo$CodecCapabilities r0 = r5.getCapabilitiesForType(r0)     // Catch:{ RuntimeException -> 0x01bf }
            if (r0 == 0) goto L_0x01ad
            android.media.MediaCodecInfo$CodecProfileLevel[] r9 = r0.profileLevels     // Catch:{ RuntimeException -> 0x01bf }
            if (r9 == 0) goto L_0x01ad
            int r0 = r9.length     // Catch:{ RuntimeException -> 0x01bf }
            r26 = r0
            r8 = 0
        L_0x0161:
            r0 = r26
            if (r8 >= r0) goto L_0x01ad
            r14 = r9[r8]     // Catch:{ RuntimeException -> 0x01bf }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)     // Catch:{ RuntimeException -> 0x01bf }
            int r0 = r14.profile     // Catch:{ RuntimeException -> 0x01bf }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ RuntimeException -> 0x01bf }
            int r0 = r14.level     // Catch:{ RuntimeException -> 0x01bf }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r0)     // Catch:{ RuntimeException -> 0x01bf }
            java.lang.String r17 = "MediaCodecListWrapper"
            java.lang.String r16 = "requesting profile,level: [%s,%s], found [%s,%s]"
            X.7m1 r1 = X.AnonymousClass6YR.A01     // Catch:{ RuntimeException -> 0x01bf }
            r0 = 3
            boolean r0 = r1.BMH(r0)     // Catch:{ RuntimeException -> 0x01bf }
            if (r0 == 0) goto L_0x0191
            r1 = r18
            r0 = r16
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r15, r13, r5, r1)     // Catch:{ RuntimeException -> 0x01bf }
            r0 = r17
            X.AnonymousClass6YR.A04(r0, r1)     // Catch:{ RuntimeException -> 0x01bf }
        L_0x0191:
            int r0 = r14.profile     // Catch:{ RuntimeException -> 0x01bf }
            if (r0 != r6) goto L_0x01aa
            int r5 = r14.level     // Catch:{ RuntimeException -> 0x01bf }
            r0 = -1
            if (r5 >= r12) goto L_0x019d
            if (r12 != r0) goto L_0x01aa
            goto L_0x01a0
        L_0x019d:
            if (r12 == r0) goto L_0x01a0
            r5 = r12
        L_0x01a0:
            X.6Ay r1 = new X.6Ay     // Catch:{ RuntimeException -> 0x01bf }
            r1.<init>(r11, r6, r5)     // Catch:{ RuntimeException -> 0x01bf }
            r0 = r19
            r0.add(r1)     // Catch:{ RuntimeException -> 0x01bf }
        L_0x01aa:
            int r8 = r8 + 1
            goto L_0x0161
        L_0x01ad:
            int r10 = r10 + 1
            goto L_0x0112
        L_0x01b1:
            java.lang.String r5 = "encoder support for hevc? %s"
            r1 = r20
            r0 = r19
            X.AnonymousClass6YR.A02(r0, r1, r5)     // Catch:{ RuntimeException -> 0x01bf }
            java.util.ArrayList r0 = X.C36441kJ.A15(r19)     // Catch:{ RuntimeException -> 0x01bf }
            goto L_0x01cb
        L_0x01bf:
            r5 = move-exception
            java.lang.String r1 = "hevc support check error"
            r0 = r20
            X.AnonymousClass6YR.A0A(r0, r1, r5)     // Catch:{ all -> 0x020b }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x020b }
        L_0x01cb:
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x020b }
        L_0x01cf:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x020b }
            if (r0 == 0) goto L_0x01e1
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x020b }
            X.6Ay r1 = (X.C128116Ay) r1     // Catch:{ all -> 0x020b }
            r0 = r21
            r0.add(r1)     // Catch:{ all -> 0x020b }
            goto L_0x01cf
        L_0x01e1:
            r0 = r21
            r7.addAll(r0)     // Catch:{ all -> 0x020b }
            goto L_0x00f5
        L_0x01e8:
            java.util.ArrayList r0 = r3.A00()     // Catch:{ all -> 0x020b }
            r7.addAll(r0)     // Catch:{ all -> 0x020b }
            java.lang.String r1 = "codec setting fallback loop: %s"
            r0 = r23
            X.AnonymousClass6YR.A02(r7, r0, r1)     // Catch:{ all -> 0x020b }
            goto L_0x003d
        L_0x01f8:
            X.7ly r6 = r3.A09     // Catch:{ all -> 0x020b }
            android.content.Context r5 = r3.A01     // Catch:{ all -> 0x020b }
            X.5Yo r1 = r2.A06     // Catch:{ all -> 0x020b }
            r12 = 0
            X.65N r0 = r3.A00     // Catch:{ all -> 0x020b }
            r7 = r5
            r8 = r0
            r9 = r4
            r10 = r1
            r11 = r28
            r6.Bm7(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x020b }
            goto L_0x022b
        L_0x020b:
            r4 = move-exception
            if (r25 <= 0) goto L_0x022a
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L_0x022a
            java.lang.Throwable r1 = r4.getCause()
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1
            boolean r0 = r1.isTransient()
            if (r0 != 0) goto L_0x001b
            boolean r0 = r1.isRecoverable()
            if (r0 == 0) goto L_0x022a
            goto L_0x001b
        L_0x022a:
            throw r4
        L_0x022b:
            X.6Pc r4 = r3.A04
            X.7ly r0 = r3.A09
            java.lang.String r0 = r0.BBW()
            r4.A0E = r0
            X.6OY r0 = r2.A04
            if (r0 == 0) goto L_0x024d
            X.6Ay r0 = r0.A0C
            if (r0 == 0) goto L_0x024d
            int r1 = r0.A01
            r0 = 1
            if (r1 == r0) goto L_0x0254
            r0 = 2
            if (r1 == r0) goto L_0x0251
            r0 = 8
            if (r1 == r0) goto L_0x024e
            java.lang.String r0 = ""
        L_0x024b:
            r4.A0F = r0
        L_0x024d:
            return
        L_0x024e:
            java.lang.String r0 = "high"
            goto L_0x024b
        L_0x0251:
            java.lang.String r0 = "main"
            goto L_0x024b
        L_0x0254:
            java.lang.String r0 = "baseline"
            goto L_0x024b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C141376n8.A03():void");
    }

    public void B0o(int i) {
        C161017ly r0 = this.A09;
        Objects.requireNonNull(r0);
        r0.B0o(i);
    }

    public void B5j(long j) {
        if (j >= 0) {
            this.A09.B5j(j);
        }
    }

    public boolean BLQ() {
        if (this.A0B == null || !this.A0B.isDone()) {
            return false;
        }
        this.A0B.get();
        return true;
    }

    public void Bo2(int i) {
        Objects.requireNonNull(this.A09);
    }

    public void Bo7(long j) {
        if (j >= 0) {
            this.A09.Bo7(j);
        }
    }

    public boolean BuB() {
        this.A09.BuA();
        return true;
    }

    public void BuN(C132186So r10, int i) {
        AnonymousClass5TE r3 = AnonymousClass5TE.VIDEO;
        long A002 = C129266Gc.A00(this.A01, this.A03, r3, this.A06);
        this.A0B = this.A07.submit(new C163697qc(r10, this, i, 1, A002));
    }

    public void BxP() {
        if (this.A0B != null) {
            this.A0B.get();
        }
    }

    public void flush() {
        this.A09.flush();
    }

    public void release() {
        AnonymousClass6MV r1 = new AnonymousClass6MV();
        try {
            if (this.A09 != null) {
                this.A09.finish();
                this.A09 = null;
            }
        } catch (Throwable th) {
            AnonymousClass6MV.A00(r1, th);
        }
        Throwable th2 = r1.A01;
        if (th2 != null) {
            throw th2;
        }
    }

    public C141376n8(Context context, MediaFormat mediaFormat, AnonymousClass65N r3, AnonymousClass7ez r4, C131456Pc r5, C141246mu r6, C125085zI r7, C159107ip r8, ExecutorService executorService) {
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = mediaFormat;
        this.A07 = executorService;
        this.A03 = r4;
        this.A01 = context;
        this.A05 = r6;
        this.A08 = r8;
        this.A00 = r3;
    }

    private ArrayList A00() {
        String str;
        C128116Ay r0;
        int i;
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        Integer[] A002 = C023109s.A00(3);
        int length = A002.length;
        for (int i2 = 0; i2 < length; i2++) {
            switch (C90524aI.A06(A002, i2)) {
                case 1:
                    str = "Main";
                    break;
                case 2:
                    str = "Baseline";
                    break;
                default:
                    str = "High";
                    break;
            }
            if ("high".equalsIgnoreCase(str)) {
                i = 8;
            } else if ("main".equalsIgnoreCase(str)) {
                i = 2;
            } else if ("baseline".equalsIgnoreCase(str)) {
                i = 1;
            } else {
                r0 = null;
                A0I2.add(r0);
            }
            r0 = new C128116Ay(C108365Tf.CODEC_VIDEO_H264, i, 256);
            A0I2.add(r0);
        }
        Iterator it = A0I2.iterator();
        while (it.hasNext()) {
            A0I.add(it.next());
        }
        return A0I;
    }
}
