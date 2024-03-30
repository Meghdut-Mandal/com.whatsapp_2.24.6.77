package X;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.android.exoplayer2.util.Util;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.List;
import java.util.Objects;

/* renamed from: X.82l  reason: invalid class name and case insensitive filesystem */
public class C1688982l extends AnonymousClass82E {
    public static boolean A0n;
    public static boolean A0o;
    public static final int[] A0p = {1920, 1600, 1440, VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH, 960, 854, 640, 540, 480};
    public AnonymousClass9P8 A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public MediaFormat A0O;
    public Surface A0P;
    public Surface A0Q;
    public AnonymousClass9J5 A0R;
    public AnonymousClass9D6 A0S;
    public boolean A0T = true;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X = true;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public int A0c;
    public long A0d;
    public Object A0e;
    public final int A0f;
    public final long A0g;
    public final Context A0h;
    public final C200969iY A0i;
    public final AnonymousClass5o9 A0j;
    public final boolean A0k;
    public final long[] A0l;
    public final long[] A0m;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0061, code lost:
        if ("NVIDIA".equals(com.facebook.android.exoplayer2.util.Util.A03) == false) goto L_0x0063;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1688982l(android.content.Context r17, android.os.Handler r18, X.C200129gf r19, X.B4Y r20, X.AnonymousClass9JW r21, X.C125125zM r22, X.C209409zx r23, java.lang.Object r24, int r25, int r26, int r27, long r28, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35) {
        /*
            r16 = this;
            r4 = 0
            r15 = 1
            r12 = 2
            r7 = r16
            r14 = r26
            r13 = r25
            r11 = r22
            r10 = r21
            r9 = r20
            r8 = r19
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r7.A0X = r15
            r7.A0T = r15
            r5 = 0
            r7.A0Y = r4
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.A0I = r2
            r7.A0W = r4
            r7.A0b = r4
            r0 = r28
            r7.A0g = r0
            r1 = r17
            android.content.Context r0 = r1.getApplicationContext()
            r7.A0h = r0
            r0 = r27
            r7.A0f = r0
            X.9iY r0 = new X.9iY
            r0.<init>(r1)
            r7.A0i = r0
            X.5o9 r0 = new X.5o9
            r6 = r18
            r1 = r23
            r0.<init>(r6, r1)
            r7.A0j = r0
            int r6 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 22
            if (r6 > r0) goto L_0x0063
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A01
            java.lang.String r0 = "foster"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A03
            java.lang.String r0 = "NVIDIA"
            boolean r1 = r0.equals(r1)
            r0 = 1
            if (r1 != 0) goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            r7.A0k = r0
            r0 = 29
            if (r6 != r0) goto L_0x0075
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04
            java.lang.String r0 = "Pixel "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0075
            r5 = 1
        L_0x0075:
            r7.A0U = r5
            r1 = 10
            long[] r0 = new long[r1]
            r7.A0l = r0
            long[] r0 = new long[r1]
            r7.A0m = r0
            r7.A0N = r2
            r7.A0K = r2
            r7.A0J = r2
            r1 = -1
            r7.A07 = r1
            r7.A06 = r1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.A01 = r0
            r7.A02 = r0
            r7.A0G = r15
            r7.A0F = r1
            r7.A0D = r1
            r7.A03 = r0
            r7.A0E = r1
            r0 = r30
            r7.A0X = r0
            r7.A0T = r4
            r0 = r31
            r7.A0Y = r0
            r0 = r32
            r7.A0W = r0
            r0 = r33
            r7.A0b = r0
            r0 = r24
            r7.A0e = r0
            r0 = r34
            r7.A0R = r0
            r0 = r35
            r7.A0Q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688982l.<init>(android.content.Context, android.os.Handler, X.9gf, X.B4Y, X.9JW, X.5zM, X.9zx, java.lang.Object, int, int, int, long, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r4.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r5 = r5 * r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r4.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        r5 = r5 * r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        return (r5 * 3) / (r2 * 2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(java.lang.String r4, int r5, int r6) {
        /*
            r3 = -1
            if (r5 == r3) goto L_0x000d
            if (r6 == r3) goto L_0x000d
            int r0 = r4.hashCode()
            r2 = 4
            switch(r0) {
                case -1664118616: goto L_0x000e;
                case -1662541442: goto L_0x0011;
                case 1187890754: goto L_0x0014;
                case 1331836730: goto L_0x0017;
                case 1599127256: goto L_0x003b;
                case 1599127257: goto L_0x0046;
                default: goto L_0x000d;
            }
        L_0x000d:
            return r3
        L_0x000e:
            java.lang.String r0 = "video/3gpp"
            goto L_0x003d
        L_0x0011:
            java.lang.String r0 = "video/hevc"
            goto L_0x0048
        L_0x0014:
            java.lang.String r0 = "video/mp4v-es"
            goto L_0x003d
        L_0x0017:
            java.lang.String r0 = "video/avc"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04
            java.lang.String r0 = "BRAVIA 4K 2015"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x000d
            r2 = 16
            int r0 = r5 + 16
            int r1 = r0 + -1
            int r1 = r1 / r2
            int r0 = r6 + 16
            int r0 = r0 + -1
            int r0 = r0 / r2
            int r1 = r1 * r0
            int r0 = r1 * 16
            int r5 = r0 * 16
            goto L_0x0044
        L_0x003b:
            java.lang.String r0 = "video/x-vnd.on2.vp8"
        L_0x003d:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            int r5 = r5 * r6
        L_0x0044:
            r2 = 2
            goto L_0x004f
        L_0x0046:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
        L_0x0048:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            int r5 = r5 * r6
        L_0x004f:
            int r1 = r5 * 3
            int r0 = r2 * 2
            int r1 = r1 / r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688982l.A02(java.lang.String, int, int):int");
    }

    public static void A05(C1688982l r2) {
        C23079B3l b3l;
        r2.A0Z = false;
        if (Util.A00 >= 23 && r2.A0a && (b3l = r2.A0C) != null) {
            r2.A00 = new AnonymousClass9P8(b3l, r2);
        }
    }

    public void A0F() {
        this.A07 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0N = -9223372036854775807L;
        this.A0K = -9223372036854775807L;
        this.A0B = 0;
        this.A0F = -1;
        this.A0D = -1;
        this.A03 = -1.0f;
        this.A0E = -1;
        A05(this);
        C200969iY r2 = this.A0i;
        if (r2.A09 != null) {
            C204249ph r1 = r2.A0A;
            if (r1 != null) {
                r1.A00.unregisterDisplayListener(r1);
            }
            r2.A0B.A02.sendEmptyMessage(2);
        }
        this.A00 = null;
        this.A0a = false;
        this.A09 = 0;
        this.A0A = 0;
        try {
            super.A0F();
            synchronized (this.A09) {
            }
            AnonymousClass5o9 r3 = this.A0j;
            AnonymousClass9OH r22 = this.A09;
            synchronized (r22) {
            }
            Handler handler = r3.A00;
            if (handler != null) {
                C165587tf.A0y(handler, r3, r22, 37);
            }
        } catch (Throwable th) {
            synchronized (this.A09) {
                AnonymousClass5o9 r32 = this.A0j;
                AnonymousClass9OH r23 = this.A09;
                synchronized (r23) {
                    Handler handler2 = r32.A00;
                    if (handler2 != null) {
                        C165587tf.A0y(handler2, r32, r23, 37);
                    }
                    throw th;
                }
            }
        }
    }

    public void A0L() {
        try {
            super.A0L();
        } finally {
            this.A04 = 0;
            Surface surface = this.A0P;
            if (surface != null) {
                if (this.A0Q == surface) {
                    this.A0Q = null;
                }
                surface.release();
                this.A0P = null;
            }
        }
    }

    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    public static int A00(C207099uY r6) {
        int i = r6.A0A;
        if (i != -1) {
            List list = r6.A0T;
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += ((byte[]) list.get(i3)).length;
            }
            return i + i2;
        }
        return A02(r6.A0S, r6.A0I, r6.A09);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0191, code lost:
        if (r9 < 800000) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f6, code lost:
        if (r0.length <= 0) goto L_0x00d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(X.C207099uY r13, X.B4Y r14, boolean r15, boolean r16) {
        /*
            java.lang.String r9 = r13.A0S
            java.lang.String r1 = X.C203249nb.A05(r9)
            java.lang.String r0 = "video"
            boolean r0 = r0.equals(r1)
            r6 = 0
            if (r0 != 0) goto L_0x0010
            return r6
        L_0x0010:
            X.AXg r0 = r13.A0L
            r5 = 1
            boolean r4 = X.AnonymousClass000.A1V(r0)
            java.util.List r2 = r14.BAq(r9, r4, r6)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0046
            if (r16 == 0) goto L_0x0046
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.lang.String r0 = X.C203599oN.A01(r13)
            if (r0 == 0) goto L_0x0046
            java.util.List r3 = r14.BAq(r0, r6, r6)
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 26
            if (r1 < r0) goto L_0x0046
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0046
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0046
            r2 = r3
        L_0x0046:
            if (r4 == 0) goto L_0x005a
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x005a
            java.util.List r0 = r14.BAq(r9, r6, r6)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0059
            r5 = 2
        L_0x0059:
            return r5
        L_0x005a:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0063
            r0 = 129(0x81, float:1.81E-43)
            return r0
        L_0x0063:
            int r1 = r13.A06
            if (r1 == 0) goto L_0x006d
            r0 = 2
            if (r1 == r0) goto L_0x006d
            r0 = 130(0x82, float:1.82E-43)
            return r0
        L_0x006d:
            java.lang.Object r8 = r2.get(r6)
            X.9l7 r8 = (X.C202149l7) r8
            java.lang.String r7 = r13.A0O
            if (r7 == 0) goto L_0x00d8
            java.lang.String r12 = r8.A01
            if (r12 == 0) goto L_0x00d8
            java.lang.String r4 = X.C203249nb.A04(r7)
            if (r4 == 0) goto L_0x00d8
            boolean r0 = r12.equals(r4)
            java.lang.String r3 = ", "
            if (r0 != 0) goto L_0x00af
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "codec.mime "
        L_0x008f:
            X.C36321k7.A1O(r0, r7, r3, r4, r1)
            java.lang.String r0 = r1.toString()
            X.C202149l7.A01(r8, r0)
            r4 = 0
        L_0x009a:
            boolean r0 = r8.A03
            r1 = 8
            if (r0 == 0) goto L_0x00a2
            r1 = 16
        L_0x00a2:
            boolean r0 = r8.A09
            if (r0 == 0) goto L_0x00a8
            r6 = 32
        L_0x00a8:
            r0 = 3
            if (r4 == 0) goto L_0x00ac
            r0 = 4
        L_0x00ac:
            r1 = r1 | r6
            r0 = r0 | r1
            return r0
        L_0x00af:
            android.util.Pair r0 = X.C203599oN.A00(r13)
            if (r0 == 0) goto L_0x00d8
            int r2 = X.C36381kD.A04(r0)
            int r1 = X.C36381kD.A03(r0)
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = "video/avc"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0195
            r2 = 8
        L_0x00cf:
            r1 = 0
        L_0x00d0:
            boolean r0 = r8.A05
            if (r0 != 0) goto L_0x00e9
            r0 = 42
            if (r2 == r0) goto L_0x00e9
        L_0x00d8:
            r4 = 1
            int r3 = r13.A0I
            if (r3 <= 0) goto L_0x009a
            int r2 = r13.A09
            if (r2 <= 0) goto L_0x009a
            float r0 = r13.A01
            double r0 = (double) r0
            boolean r4 = r8.A03(r3, r2, r0)
            goto L_0x009a
        L_0x00e9:
            if (r15 == 0) goto L_0x00f9
            android.media.MediaCodecInfo$CodecCapabilities r0 = r8.A00
            if (r0 == 0) goto L_0x00f3
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x00f5
        L_0x00f3:
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r6]
        L_0x00f5:
            int r0 = r0.length
            if (r0 > 0) goto L_0x00f9
            goto L_0x00d8
        L_0x00f9:
            android.media.MediaCodecInfo$CodecCapabilities r10 = r8.A00
            if (r10 == 0) goto L_0x0101
            android.media.MediaCodecInfo$CodecProfileLevel[] r11 = r10.profileLevels
            if (r11 != 0) goto L_0x0103
        L_0x0101:
            android.media.MediaCodecInfo$CodecProfileLevel[] r11 = new android.media.MediaCodecInfo.CodecProfileLevel[r6]
        L_0x0103:
            int r9 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 23
            if (r9 > r0) goto L_0x013c
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x013c
            int r0 = r11.length
            if (r0 != 0) goto L_0x013c
            if (r10 == 0) goto L_0x0193
            android.media.MediaCodecInfo$VideoCapabilities r0 = r10.getVideoCapabilities()
            if (r0 == 0) goto L_0x0193
            android.util.Range r0 = r0.getBitrateRange()
            java.lang.Comparable r0 = r0.getUpper()
            int r9 = X.AnonymousClass000.A0I(r0)
            r0 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r9 < r0) goto L_0x014e
            r10 = 1024(0x400, float:1.435E-42)
        L_0x012f:
            android.media.MediaCodecInfo$CodecProfileLevel r0 = new android.media.MediaCodecInfo$CodecProfileLevel
            r0.<init>()
            r0.profile = r5
            r0.level = r10
            android.media.MediaCodecInfo$CodecProfileLevel[] r11 = new android.media.MediaCodecInfo.CodecProfileLevel[r5]
            r11[r6] = r0
        L_0x013c:
            int r10 = r11.length
            r9 = 0
        L_0x013e:
            if (r9 >= r10) goto L_0x01a0
            r5 = r11[r9]
            int r0 = r5.profile
            if (r0 != r2) goto L_0x014b
            int r0 = r5.level
            if (r0 < r1) goto L_0x014b
            goto L_0x00d8
        L_0x014b:
            int r9 = r9 + 1
            goto L_0x013e
        L_0x014e:
            r0 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r9 < r0) goto L_0x0156
            r10 = 512(0x200, float:7.175E-43)
            goto L_0x012f
        L_0x0156:
            r0 = 60000000(0x3938700, float:8.670878E-37)
            if (r9 < r0) goto L_0x015e
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x012f
        L_0x015e:
            r0 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r9 < r0) goto L_0x0166
            r10 = 128(0x80, float:1.794E-43)
            goto L_0x012f
        L_0x0166:
            r0 = 18000000(0x112a880, float:2.6936858E-38)
            if (r9 < r0) goto L_0x016e
            r10 = 64
            goto L_0x012f
        L_0x016e:
            r0 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r9 < r0) goto L_0x0176
            r10 = 32
            goto L_0x012f
        L_0x0176:
            r0 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r9 < r0) goto L_0x017e
            r10 = 16
            goto L_0x012f
        L_0x017e:
            r0 = 3600000(0x36ee80, float:5.044674E-39)
            if (r9 < r0) goto L_0x0186
            r10 = 8
            goto L_0x012f
        L_0x0186:
            r0 = 1800000(0x1b7740, float:2.522337E-39)
            if (r9 < r0) goto L_0x018d
            r10 = 4
            goto L_0x012f
        L_0x018d:
            r0 = 800000(0xc3500, float:1.121039E-39)
            r10 = 2
            if (r9 >= r0) goto L_0x012f
        L_0x0193:
            r10 = 1
            goto L_0x012f
        L_0x0195:
            java.lang.String r0 = "video/hevc"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00d0
            r2 = 2
            goto L_0x00cf
        L_0x01a0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "codec.profileLevel, "
            goto L_0x008f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688982l.A01(X.9uY, X.B4Y, boolean, boolean):int");
    }

    public static void A06(C1688982l r9) {
        int i = r9.A08;
        if (i > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - r9.A0H;
            AnonymousClass5o9 r4 = r9.A0j;
            Handler handler = r4.A00;
            if (handler != null) {
                handler.post(new AnonymousClass734(r4, i, 0, j));
            }
            r9.A08 = 0;
            r9.A0H = elapsedRealtime;
        }
    }

    public static void A07(C1688982l r7) {
        int i = r7.A0F;
        if (i != -1 || r7.A0D != -1) {
            AnonymousClass5o9 r2 = r7.A0j;
            int i2 = r7.A0D;
            int i3 = r7.A0E;
            float f = r7.A03;
            Handler handler = r2.A00;
            if (handler != null) {
                handler.post(new C1498573a(r2, f, i, i2, i3, 0));
            }
        }
    }

    public static boolean A08(C207099uY r2, C207099uY r3, boolean z) {
        if (!r2.A0S.equals(r3.A0S) || r2.A0E != r3.A0E || ((!z && (r2.A0I != r3.A0I || r2.A09 != r3.A09)) || !Util.A0E(r2.A0N, r3.A0N))) {
            return false;
        }
        return true;
    }

    public static boolean A09(C202149l7 r2, C1688982l r3) {
        if (Util.A00 < 23 || !r3.A0X || r3.A0a || r3.A0S(r2.A02)) {
            return false;
        }
        if (!r2.A07 || C92164dE.A02(r3.A0h)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (r13.A09 == -1) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0N(android.media.MediaCrypto r24, X.C207099uY r25, X.C23079B3l r26, X.C202149l7 r27) {
        /*
            r23 = this;
            r8 = r23
            X.9uY[] r12 = r8.A0A
            java.util.Objects.requireNonNull(r12)
            r10 = r25
            int r7 = r10.A0I
            r22 = r7
            r21 = r7
            int r6 = r10.A09
            r20 = r6
            int r5 = A00(r10)
            int r11 = r12.length
            r0 = 1
            r9 = r27
            if (r11 == r0) goto L_0x00ea
            r4 = 0
            r14 = 0
        L_0x001f:
            if (r4 >= r11) goto L_0x004c
            r13 = r12[r4]
            boolean r0 = r9.A03
            boolean r0 = A08(r10, r13, r0)
            if (r0 == 0) goto L_0x0049
            int r3 = r13.A0I
            r2 = -1
            if (r3 == r2) goto L_0x0035
            int r1 = r13.A09
            r0 = 0
            if (r1 != r2) goto L_0x0036
        L_0x0035:
            r0 = 1
        L_0x0036:
            r14 = r14 | r0
            int r7 = java.lang.Math.max(r7, r3)
            int r0 = r13.A09
            int r6 = java.lang.Math.max(r6, r0)
            int r0 = A00(r13)
            int r5 = java.lang.Math.max(r5, r0)
        L_0x0049:
            int r4 = r4 + 1
            goto L_0x001f
        L_0x004c:
            if (r14 == 0) goto L_0x00ea
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Resolutions unknown. Codec max resolution: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r4 = "x"
            java.lang.String r0 = X.AnonymousClass000.A0r(r4, r1, r6)
            java.lang.String r3 = "MediaCodecVideoRenderer"
            android.util.Log.w(r3, r0)
            r19 = r22
            r2 = 0
            r1 = r20
            r0 = r22
            if (r1 <= r0) goto L_0x01f2
            r18 = 1
            r21 = r1
        L_0x0072:
            r0 = r19
            float r12 = (float) r0
            r0 = r21
            float r0 = (float) r0
            float r12 = r12 / r0
            int[] r17 = A0p
            r13 = 9
        L_0x007d:
            r11 = 0
            if (r2 >= r13) goto L_0x00ea
            r16 = r17[r2]
            r0 = r16
            float r0 = (float) r0
            float r0 = r0 * r12
            int r14 = (int) r0
            r1 = r16
            r0 = r21
            if (r1 <= r0) goto L_0x00ea
            r0 = r19
            if (r14 <= r0) goto L_0x00ea
            r15 = r14
            if (r18 != 0) goto L_0x0097
            r15 = r1
            r16 = r14
        L_0x0097:
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.A00
            if (r0 == 0) goto L_0x00b9
            android.media.MediaCodecInfo$VideoCapabilities r1 = r0.getVideoCapabilities()
            if (r1 == 0) goto L_0x00b9
            int r0 = r1.getWidthAlignment()
            int r11 = r1.getHeightAlignment()
            int r15 = r15 + r0
            int r1 = r15 + -1
            int r1 = r1 / r0
            int r1 = r1 * r0
            int r16 = r16 + r11
            int r0 = r16 + -1
            int r0 = r0 / r11
            int r0 = r0 * r11
            android.graphics.Point r11 = new android.graphics.Point
            r11.<init>(r1, r0)
        L_0x00b9:
            float r1 = r10.A01
            int r0 = r11.x
            r15 = r0
            int r0 = r11.y
            r14 = r0
            double r0 = (double) r1
            boolean r0 = r9.A03(r15, r14, r0)
            if (r0 == 0) goto L_0x01ee
            int r0 = r11.x
            int r7 = java.lang.Math.max(r7, r0)
            int r0 = r11.y
            int r6 = java.lang.Math.max(r6, r0)
            java.lang.String r0 = r10.A0S
            int r0 = A02(r0, r7, r6)
            int r5 = java.lang.Math.max(r5, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Codec max resolution adjusted to: "
            X.C90464aC.A1K(r0, r4, r1, r7, r6)
            X.AnonymousClass000.A1A(r1, r3)
        L_0x00ea:
            X.9J5 r3 = new X.9J5
            r3.<init>(r7, r6, r5)
            r8.A0R = r3
            boolean r5 = r8.A0k
            int r4 = r8.A0c
            android.media.MediaFormat r2 = new android.media.MediaFormat
            r2.<init>()
            java.lang.String r1 = r10.A0S
            java.lang.String r0 = "mime"
            r2.setString(r0, r1)
            java.lang.String r1 = "width"
            r0 = r22
            r2.setInteger(r1, r0)
            java.lang.String r1 = "height"
            r0 = r20
            r2.setInteger(r1, r0)
            java.util.List r0 = r10.A0T
            X.AnonymousClass93m.A00(r2, r0)
            float r6 = r10.A01
            java.lang.String r1 = "frame-rate"
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0121
            r2.setFloat(r1, r6)
        L_0x0121:
            int r6 = r10.A0E
            java.lang.String r1 = "rotation-degrees"
            r0 = -1
            if (r6 == r0) goto L_0x012b
            r2.setInteger(r1, r6)
        L_0x012b:
            X.9tt r7 = r10.A0N
            if (r7 == 0) goto L_0x0158
            int r1 = r7.A03
            java.lang.String r0 = "color-transfer"
            r6 = -1
            if (r1 == r6) goto L_0x0139
            r2.setInteger(r0, r1)
        L_0x0139:
            int r1 = r7.A02
            java.lang.String r0 = "color-standard"
            if (r1 == r6) goto L_0x0142
            r2.setInteger(r0, r1)
        L_0x0142:
            int r1 = r7.A01
            java.lang.String r0 = "color-range"
            if (r1 == r6) goto L_0x014b
            r2.setInteger(r0, r1)
        L_0x014b:
            byte[] r0 = r7.A04
            java.lang.String r1 = "hdr-static-info"
            if (r0 == 0) goto L_0x0158
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r2.setByteBuffer(r1, r0)
        L_0x0158:
            int r1 = r3.A02
            java.lang.String r0 = "max-width"
            r2.setInteger(r0, r1)
            int r1 = r3.A00
            java.lang.String r0 = "max-height"
            r2.setInteger(r0, r1)
            int r3 = r3.A01
            java.lang.String r1 = "max-input-size"
            r0 = -1
            if (r3 == r0) goto L_0x0170
            r2.setInteger(r1, r3)
        L_0x0170:
            int r3 = com.facebook.android.exoplayer2.util.Util.A00
            r1 = 0
            r0 = 23
            if (r3 < r0) goto L_0x017c
            java.lang.String r0 = "priority"
            r2.setInteger(r0, r1)
        L_0x017c:
            if (r5 == 0) goto L_0x0183
            java.lang.String r0 = "auto-frc"
            r2.setInteger(r0, r1)
        L_0x0183:
            if (r4 == 0) goto L_0x0190
            java.lang.String r1 = "tunneled-playback"
            r0 = 1
            r2.setFeatureEnabled(r1, r0)
            java.lang.String r0 = "audio-session-id"
            r2.setInteger(r0, r4)
        L_0x0190:
            android.view.Surface r0 = r8.A0Q
            if (r0 != 0) goto L_0x01ab
            boolean r0 = A09(r9, r8)
            X.C200319h9.A02(r0)
            android.view.Surface r0 = r8.A0P
            if (r0 != 0) goto L_0x01a9
            android.content.Context r1 = r8.A0h
            boolean r0 = r9.A07
            X.4dE r0 = X.C92164dE.A01(r1, r0)
            r8.A0P = r0
        L_0x01a9:
            r8.A0Q = r0
        L_0x01ab:
            r0 = 30
            if (r3 >= r0) goto L_0x01b5
            X.5zM r0 = r8.A0g
            boolean r0 = r0.A0H
            if (r0 == 0) goto L_0x01ce
        L_0x01b5:
            X.5zM r0 = r8.A0g
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x01ce
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.A00
            if (r0 == 0) goto L_0x01ce
            java.lang.String r1 = "low-latency"
            boolean r0 = r0.isFeatureSupported(r1)
            if (r0 == 0) goto L_0x01ce
            r0 = 1
            r2.setFeatureEnabled(r1, r0)
            r2.setInteger(r1, r0)
        L_0x01ce:
            android.view.Surface r1 = r8.A0Q
            r14 = 0
            java.lang.Object r0 = r8.A0e
            r10 = r24
            r4 = r26
            r9 = r4
            r11 = r2
            r12 = r1
            r13 = r0
            r9.B3R(r10, r11, r12, r13, r14)
            r0 = 23
            if (r3 < r0) goto L_0x01ed
            boolean r0 = r8.A0a
            if (r0 == 0) goto L_0x01ed
            X.9P8 r0 = new X.9P8
            r0.<init>(r4, r8)
            r8.A00 = r0
        L_0x01ed:
            return
        L_0x01ee:
            int r2 = r2 + 1
            goto L_0x007d
        L_0x01f2:
            r18 = 0
            r19 = r1
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688982l.A0N(android.media.MediaCrypto, X.9uY, X.B3l, X.9l7):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02c4, code lost:
        if (java.lang.Math.abs((r1 - r11.A05) - (r9 - r11.A04)) > 20000000) goto L_0x02c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bc A[Catch:{ all -> 0x0156, IllegalStateException -> 0x015b }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7 A[Catch:{ all -> 0x0156, IllegalStateException -> 0x015b }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014a A[Catch:{ all -> 0x0156, IllegalStateException -> 0x015b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014c A[Catch:{ all -> 0x0156, IllegalStateException -> 0x015b }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0P(X.C23079B3l r38, java.nio.ByteBuffer r39, int r40, int r41, long r42, long r44, long r46, boolean r48) {
        /*
            r37 = this;
            r0 = r37
            long r3 = r0.A0d
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r14 = r42
            if (r5 != 0) goto L_0x0012
            r0.A0d = r14
            r3 = r14
        L_0x0012:
            long r5 = r0.A0N
            r12 = r46
            long r29 = r46 - r5
            r27 = 1
            r36 = r38
            r35 = r40
            if (r48 == 0) goto L_0x003b
            java.lang.String r3 = "skipVideoBuffer"
            X.C196289Yq.A01(r3)
            r5 = 0
            r4 = r36
            r3 = r35
            r4.BnR(r3, r5)
            X.C196289Yq.A00()
            X.9OH r4 = r0.A09
            int r3 = r4.A09
            int r3 = r3 + 1
            r4.A09 = r3
        L_0x0038:
            r0.A0I = r1
            return r27
        L_0x003b:
            long r25 = r46 - r42
            android.view.Surface r2 = r0.A0Q
            android.view.Surface r1 = r0.A0P
            r5 = 0
            if (r2 != r1) goto L_0x0067
            r2 = -30000(0xffffffffffff8ad0, double:NaN)
            int r1 = (r25 > r2 ? 1 : (r25 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x02da
            java.lang.String r1 = "skipVideoBuffer"
            X.C196289Yq.A01(r1)
            r2 = r36
            r1 = r35
            r2.BnR(r1, r5)
            X.C196289Yq.A00()
            X.9OH r2 = r0.A09
            int r1 = r2.A09
            int r1 = r1 + 1
            r2.A09 = r1
        L_0x0061:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0038
        L_0x0067:
            long r9 = android.os.SystemClock.elapsedRealtime()
            r23 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r23
            int r2 = r0.A01
            r1 = 2
            boolean r2 = X.AnonymousClass000.A1S(r2, r1)
            boolean r1 = r0.A0Z
            if (r1 == 0) goto L_0x008d
            if (r2 == 0) goto L_0x0239
            long r1 = r0.A0L
            long r7 = r9 - r1
            r5 = -30000(0xffffffffffff8ad0, double:NaN)
            int r1 = (r25 > r5 ? 1 : (r25 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x018b
            r5 = 100000(0x186a0, double:4.94066E-319)
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x018b
        L_0x008d:
            long r1 = java.lang.System.nanoTime()     // Catch:{ IllegalStateException -> 0x015b }
        L_0x0091:
            int r7 = r0.A07     // Catch:{ IllegalStateException -> 0x015b }
            r4 = -1
            if (r7 != r4) goto L_0x009a
            int r3 = r0.A06     // Catch:{ IllegalStateException -> 0x015b }
            if (r3 == r4) goto L_0x00d3
        L_0x009a:
            int r3 = r0.A0F     // Catch:{ IllegalStateException -> 0x015b }
            if (r3 != r7) goto L_0x00b1
            int r4 = r0.A0D     // Catch:{ IllegalStateException -> 0x015b }
            int r3 = r0.A06     // Catch:{ IllegalStateException -> 0x015b }
            if (r4 != r3) goto L_0x00b1
            int r4 = r0.A0E     // Catch:{ IllegalStateException -> 0x015b }
            r3 = 0
            if (r4 != r3) goto L_0x00b1
            float r4 = r0.A03     // Catch:{ IllegalStateException -> 0x015b }
            float r3 = r0.A01     // Catch:{ IllegalStateException -> 0x015b }
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00d3
        L_0x00b1:
            X.5o9 r5 = r0.A0j     // Catch:{ IllegalStateException -> 0x015b }
            int r8 = r0.A06     // Catch:{ IllegalStateException -> 0x015b }
            r9 = 0
            float r6 = r0.A01     // Catch:{ IllegalStateException -> 0x015b }
            android.os.Handler r3 = r5.A00     // Catch:{ IllegalStateException -> 0x015b }
            if (r3 == 0) goto L_0x00c5
            X.73a r4 = new X.73a     // Catch:{ IllegalStateException -> 0x015b }
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ IllegalStateException -> 0x015b }
            r3.post(r4)     // Catch:{ IllegalStateException -> 0x015b }
        L_0x00c5:
            int r3 = r0.A07     // Catch:{ IllegalStateException -> 0x015b }
            r0.A0F = r3     // Catch:{ IllegalStateException -> 0x015b }
            int r3 = r0.A06     // Catch:{ IllegalStateException -> 0x015b }
            r0.A0D = r3     // Catch:{ IllegalStateException -> 0x015b }
            r0.A0E = r9     // Catch:{ IllegalStateException -> 0x015b }
            float r3 = r0.A01     // Catch:{ IllegalStateException -> 0x015b }
            r0.A03 = r3     // Catch:{ IllegalStateException -> 0x015b }
        L_0x00d3:
            X.9D6 r3 = r0.A0S     // Catch:{ IllegalStateException -> 0x015b }
            if (r3 == 0) goto L_0x0112
            X.9n2 r4 = r3.A00     // Catch:{ IllegalStateException -> 0x015b }
            X.9Xa r3 = r4.A08     // Catch:{ IllegalStateException -> 0x015b }
            if (r3 == 0) goto L_0x0112
            boolean r3 = r4.A0Q     // Catch:{ IllegalStateException -> 0x015b }
            if (r3 == 0) goto L_0x0112
            X.9bF r3 = r4.A07     // Catch:{ IllegalStateException -> 0x015b }
            if (r3 == 0) goto L_0x0112
            long r29 = r29 / r23
            long r33 = java.lang.System.currentTimeMillis()     // Catch:{ IllegalStateException -> 0x015b }
            X.9LQ r8 = new X.9LQ     // Catch:{ IllegalStateException -> 0x015b }
            r28 = r8
            r31 = r29
            r28.<init>(r29, r31, r33)     // Catch:{ IllegalStateException -> 0x015b }
            java.util.concurrent.BlockingDeque r9 = r3.A00     // Catch:{ IllegalStateException -> 0x015b }
            java.lang.Object r10 = r9.peekLast()     // Catch:{ IllegalStateException -> 0x015b }
            X.9LQ r10 = (X.AnonymousClass9LQ) r10     // Catch:{ IllegalStateException -> 0x015b }
            if (r10 == 0) goto L_0x010f
            long r5 = r10.A03     // Catch:{ IllegalStateException -> 0x015b }
            long r3 = r8.A03     // Catch:{ IllegalStateException -> 0x015b }
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x010f
            long r6 = r10.A01     // Catch:{ IllegalStateException -> 0x015b }
            long r4 = r8.A01     // Catch:{ IllegalStateException -> 0x015b }
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x010f
            goto L_0x0112
        L_0x010f:
            r9.add(r8)     // Catch:{ IllegalStateException -> 0x015b }
        L_0x0112:
            java.lang.String r3 = "releaseOutputBuffer"
            X.C196289Yq.A01(r3)     // Catch:{ all -> 0x0156 }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0156 }
            r4 = r36
            r3 = r35
            r4.BnQ(r3, r1)     // Catch:{ all -> 0x0156 }
            long r3 = r0.A07     // Catch:{ all -> 0x0156 }
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0156 }
            long r1 = r1 - r5
            long r3 = r3 + r1
            r0.A07 = r3     // Catch:{ all -> 0x0156 }
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0156 }
            long r1 = r1 * r23
            r0.A0L = r1     // Catch:{ all -> 0x0156 }
            X.9OH r2 = r0.A09     // Catch:{ all -> 0x0156 }
            int r1 = r2.A07     // Catch:{ all -> 0x0156 }
            int r1 = r1 + 1
            r2.A07 = r1     // Catch:{ all -> 0x0156 }
            r1 = 0
            r0.A05 = r1     // Catch:{ all -> 0x0156 }
            r0.A0Q()     // Catch:{ all -> 0x0156 }
            X.9OH r5 = r0.A09     // Catch:{ all -> 0x0156 }
            long r3 = r0.A07     // Catch:{ all -> 0x0156 }
            int r1 = r5.A07     // Catch:{ all -> 0x0156 }
            if (r1 != 0) goto L_0x014c
            r1 = -1
            goto L_0x014f
        L_0x014c:
            long r1 = (long) r1     // Catch:{ all -> 0x0156 }
            long r3 = r3 / r1
            int r1 = (int) r3     // Catch:{ all -> 0x0156 }
        L_0x014f:
            r5.A00 = r1     // Catch:{ all -> 0x0156 }
            X.C196289Yq.A00()     // Catch:{ IllegalStateException -> 0x015b }
            goto L_0x0061
        L_0x0156:
            r1 = move-exception
            X.C196289Yq.A00()     // Catch:{ IllegalStateException -> 0x015b }
            throw r1     // Catch:{ IllegalStateException -> 0x015b }
        L_0x015b:
            r11 = move-exception
            int r2 = r0.A0f
            r10 = 0
            if (r2 <= 0) goto L_0x02db
            long r6 = r0.A0I
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0175
            long r4 = X.C36441kJ.A0A(r6)
            long r2 = (long) r2
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0176
        L_0x0175:
            r10 = 1
        L_0x0176:
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0187
            java.lang.String r2 = "MediaCodecVideoRenderer"
            java.lang.String r1 = "Render output failed"
            android.util.Log.w(r2, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.A0I = r1
        L_0x0187:
            if (r10 == 0) goto L_0x02db
            goto L_0x0239
        L_0x018b:
            int r1 = (r42 > r3 ? 1 : (r42 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0239
            long r9 = r9 - r44
            long r3 = r25 - r9
            long r21 = java.lang.System.nanoTime()
            long r3 = r3 * r23
            long r1 = r21 + r3
            X.9iY r11 = r0.A0i
            long r9 = r23 * r46
            boolean r7 = r11.A08
            if (r7 == 0) goto L_0x02ca
            long r3 = r11.A02
            int r5 = (r46 > r3 ? 1 : (r46 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x01b4
            long r3 = r11.A01
            r5 = 1
            long r3 = r3 + r5
            r11.A01 = r3
            long r3 = r11.A03
            r11.A00 = r3
        L_0x01b4:
            long r3 = r11.A01
            r16 = 6
            int r5 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r5 < 0) goto L_0x02b1
            long r7 = r11.A04
            long r16 = r9 - r7
            long r16 = r16 / r3
            long r5 = r11.A00
            long r5 = r5 + r16
            long r18 = r5 - r7
            long r3 = r11.A05
            long r16 = r1 - r3
            long r16 = r16 - r18
            long r19 = java.lang.Math.abs(r16)
            r17 = 20000000(0x1312d00, double:9.881313E-317)
            int r16 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r16 > 0) goto L_0x02c6
            long r3 = r3 + r5
            long r1 = r3 - r7
        L_0x01dc:
            r11.A02 = r12
            r11.A03 = r5
            X.9pu r6 = r11.A0B
            if (r6 == 0) goto L_0x020e
            long r3 = r11.A06
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x020e
            long r5 = r6.A04
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x020e
            long r3 = r11.A06
            long r7 = r1 - r5
            long r7 = r7 / r3
            long r7 = r7 * r3
            long r5 = r5 + r7
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x02ac
            long r9 = r5 - r3
        L_0x0202:
            long r7 = r5 - r1
            long r1 = r1 - r9
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x020a
            r5 = r9
        L_0x020a:
            long r1 = r11.A07
            long r5 = r5 - r1
            r1 = r5
        L_0x020e:
            long r8 = r1 - r21
            long r8 = r8 / r23
            r4 = -500000(0xfffffffffff85ee0, double:NaN)
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x023b
            X.B2j r7 = r0.A06
            java.util.Objects.requireNonNull(r7)
            long r5 = r0.A03
            long r3 = r42 - r5
            int r3 = r7.BuD(r3)
            if (r3 == 0) goto L_0x023b
            X.9OH r2 = r0.A09
            int r1 = r2.A04
            int r1 = r1 + 1
            r2.A04 = r1
            int r1 = r0.A04
            int r1 = r1 + r3
            r0.A0R(r1)
            r0.A0K()
        L_0x0239:
            r0 = 0
            return r0
        L_0x023b:
            r4 = -30000(0xffffffffffff8ad0, double:NaN)
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0256
            java.lang.String r1 = "dropVideoBuffer"
            X.C196289Yq.A01(r1)
            r3 = 0
            r2 = r36
            r1 = r35
            r2.BnR(r1, r3)
            X.C196289Yq.A00()
            r1 = 1
            r0.A0R(r1)
            return r27
        L_0x0256:
            r4 = 50000(0xc350, double:2.47033E-319)
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x0091
            X.9uY r1 = r0.A08
            float r11 = r1.A01
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0269
            r11 = 1106247680(0x41f00000, float:30.0)
        L_0x0269:
            java.util.UUID r1 = X.AnonymousClass9B7.A04
            long r1 = com.facebook.android.exoplayer2.util.Util.A05(r14)
            int r10 = (int) r1
            long r1 = com.facebook.android.exoplayer2.util.Util.A05(r25)
            int r9 = (int) r1
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r9 <= r4) goto L_0x0239
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r9 >= r1) goto L_0x0239
            int r8 = r10 + r9
            int r3 = r0.A09
            int r1 = r0.A0A
            int r2 = r3 + r1
            int r1 = r2 + r4
            if (r8 <= r1) goto L_0x0239
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            if (r10 <= r3) goto L_0x02a4
            if (r10 >= r2) goto L_0x02a4
            X.9OH r5 = r0.A09
            int r4 = r5.A0A
            int r8 = r8 - r2
            float r1 = (float) r8
        L_0x0298:
            float r1 = r1 * r11
            double r2 = (double) r1
            double r2 = r2 / r6
            int r1 = (int) r2
            int r4 = r4 + r1
            r5.A0A = r4
        L_0x029f:
            r0.A09 = r10
            r0.A0A = r9
            goto L_0x0239
        L_0x02a4:
            if (r10 <= r2) goto L_0x029f
            X.9OH r5 = r0.A09
            int r4 = r5.A0A
            float r1 = (float) r9
            goto L_0x0298
        L_0x02ac:
            long r3 = r3 + r5
            r9 = r5
            r5 = r3
            goto L_0x0202
        L_0x02b1:
            long r3 = r11.A04
            long r16 = r9 - r3
            long r3 = r11.A05
            long r5 = r1 - r3
            long r5 = r5 - r16
            long r16 = java.lang.Math.abs(r5)
            r4 = 20000000(0x1312d00, double:9.881313E-317)
            int r3 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x02ca
        L_0x02c6:
            r3 = 0
            r11.A08 = r3
            r7 = 0
        L_0x02ca:
            r5 = r9
            if (r7 != 0) goto L_0x01dc
            r11.A04 = r9
            r11.A05 = r1
            r3 = 0
            r11.A01 = r3
            r3 = 1
            r11.A08 = r3
            goto L_0x01dc
        L_0x02da:
            return r5
        L_0x02db:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688982l.A0P(X.B3l, java.nio.ByteBuffer, int, int, long, long, long, boolean):boolean");
    }

    public void A0Q() {
        if (!this.A0Z) {
            this.A0Z = true;
            AnonymousClass5o9 r3 = this.A0j;
            Surface surface = this.A0Q;
            Handler handler = r3.A00;
            if (handler != null) {
                C165587tf.A0y(handler, r3, surface, 35);
            }
        }
    }

    public void A0R(int i) {
        AnonymousClass9OH r3 = this.A09;
        r3.A03 += i;
        int i2 = this.A08 + i;
        this.A08 = i2;
        int i3 = this.A05 + i;
        this.A05 = i3;
        r3.A05 = Math.max(i3, r3.A05);
        if (i2 >= 0) {
            A06(this);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0141, code lost:
        if (r1.equals("Redmi Note 2") != false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0621, code lost:
        if (r1.equals("GIONEE_SWW1609") != false) goto L_0x0623;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0623, code lost:
        A0n = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0S(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = r6.A0b
            r3 = 1
            if (r0 == 0) goto L_0x0006
            return r3
        L_0x0006:
            java.lang.String r0 = "OMX.google"
            boolean r1 = r7.startsWith(r0)
            r0 = 0
            if (r1 != 0) goto L_0x062d
            java.lang.Class<X.82l> r2 = X.C1688982l.class
            monitor-enter(r2)
            boolean r0 = A0o     // Catch:{ all -> 0x062a }
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "dangal"
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A01     // Catch:{ all -> 0x062a }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x062a }
            if (r0 != 0) goto L_0x0143
            int r5 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ all -> 0x062a }
            r4 = 27
            if (r5 > r4) goto L_0x0040
            java.lang.String r0 = "HWEML"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x062a }
            if (r0 != 0) goto L_0x0143
            if (r5 >= r4) goto L_0x0040
            int r0 = r1.hashCode()     // Catch:{ all -> 0x062a }
            switch(r0) {
                case -2144781245: goto L_0x061b;
                case -2144781185: goto L_0x0612;
                case -2144781160: goto L_0x0609;
                case -2097309513: goto L_0x0600;
                case -2022874474: goto L_0x05f7;
                case -1978993182: goto L_0x05ee;
                case -1978990237: goto L_0x05e5;
                case -1936688988: goto L_0x05dc;
                case -1936688066: goto L_0x05d3;
                case -1936688065: goto L_0x05ca;
                case -1931988508: goto L_0x05c1;
                case -1696512866: goto L_0x05b8;
                case -1680025915: goto L_0x05af;
                case -1615810839: goto L_0x05a6;
                case -1554255044: goto L_0x059d;
                case -1481772737: goto L_0x0593;
                case -1481772730: goto L_0x0589;
                case -1481772729: goto L_0x057f;
                case -1320080169: goto L_0x0575;
                case -1217592143: goto L_0x056b;
                case -1180384755: goto L_0x0561;
                case -1139198265: goto L_0x0557;
                case -1052835013: goto L_0x054d;
                case -993250464: goto L_0x0543;
                case -993250458: goto L_0x0539;
                case -965403638: goto L_0x052f;
                case -958336948: goto L_0x0525;
                case -879245230: goto L_0x051b;
                case -842500323: goto L_0x0511;
                case -821392978: goto L_0x0507;
                case -797483286: goto L_0x04fd;
                case -794946968: goto L_0x04f3;
                case -788334647: goto L_0x04e9;
                case -782144577: goto L_0x04df;
                case -575125681: goto L_0x04d5;
                case -521118391: goto L_0x04cb;
                case -430914369: goto L_0x04c1;
                case -290434366: goto L_0x04b7;
                case -282781963: goto L_0x04ad;
                case -277133239: goto L_0x04a3;
                case -173639913: goto L_0x0499;
                case -56598463: goto L_0x048f;
                case 2126: goto L_0x0485;
                case 2564: goto L_0x047b;
                case 2715: goto L_0x0471;
                case 2719: goto L_0x0467;
                case 3483: goto L_0x045d;
                case 73405: goto L_0x0453;
                case 75739: goto L_0x0449;
                case 76779: goto L_0x043f;
                case 78669: goto L_0x0435;
                case 79305: goto L_0x042b;
                case 80618: goto L_0x0421;
                case 88274: goto L_0x0417;
                case 98846: goto L_0x040d;
                case 98848: goto L_0x0403;
                case 99329: goto L_0x03f9;
                case 101481: goto L_0x03ef;
                case 1513190: goto L_0x03e5;
                case 1514184: goto L_0x03db;
                case 1514185: goto L_0x03d1;
                case 2436959: goto L_0x03c7;
                case 2463773: goto L_0x03bd;
                case 2464648: goto L_0x03b3;
                case 2689555: goto L_0x03a9;
                case 3154429: goto L_0x039f;
                case 3284551: goto L_0x0395;
                case 3351335: goto L_0x038b;
                case 3386211: goto L_0x0381;
                case 41325051: goto L_0x0377;
                case 55178625: goto L_0x036d;
                case 61542055: goto L_0x0363;
                case 65355429: goto L_0x0359;
                case 66214468: goto L_0x034f;
                case 66214470: goto L_0x0345;
                case 66214473: goto L_0x033b;
                case 66215429: goto L_0x0331;
                case 66215431: goto L_0x0327;
                case 66215433: goto L_0x031d;
                case 66216390: goto L_0x0313;
                case 76402249: goto L_0x0309;
                case 76404105: goto L_0x02ff;
                case 76404911: goto L_0x02f5;
                case 80963634: goto L_0x02eb;
                case 82882791: goto L_0x02e1;
                case 98715550: goto L_0x02d7;
                case 101370885: goto L_0x02cd;
                case 102844228: goto L_0x02c3;
                case 165221241: goto L_0x02b9;
                case 182191441: goto L_0x02af;
                case 245388979: goto L_0x02a5;
                case 287431619: goto L_0x029b;
                case 307593612: goto L_0x0291;
                case 308517133: goto L_0x0287;
                case 316215098: goto L_0x027d;
                case 316215116: goto L_0x0273;
                case 316246811: goto L_0x0269;
                case 316246818: goto L_0x025f;
                case 407160593: goto L_0x0255;
                case 507412548: goto L_0x024b;
                case 793982701: goto L_0x0241;
                case 794038622: goto L_0x0237;
                case 794040393: goto L_0x022d;
                case 835649806: goto L_0x0223;
                case 917340916: goto L_0x0219;
                case 958008161: goto L_0x020f;
                case 1060579533: goto L_0x0205;
                case 1150207623: goto L_0x01fb;
                case 1176899427: goto L_0x01f1;
                case 1280332038: goto L_0x01e7;
                case 1306947716: goto L_0x01dd;
                case 1349174697: goto L_0x01d3;
                case 1522194893: goto L_0x01c9;
                case 1691543273: goto L_0x01bf;
                case 1709443163: goto L_0x01b5;
                case 1865889110: goto L_0x01ab;
                case 1906253259: goto L_0x01a1;
                case 1977196784: goto L_0x0197;
                case 2006372676: goto L_0x018d;
                case 2029784656: goto L_0x0183;
                case 2030379515: goto L_0x0179;
                case 2033393791: goto L_0x016f;
                case 2047190025: goto L_0x0165;
                case 2047252157: goto L_0x015b;
                case 2048319463: goto L_0x0151;
                case 2048855701: goto L_0x0147;
                default: goto L_0x0037;
            }     // Catch:{ all -> 0x062a }
        L_0x0037:
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04     // Catch:{ all -> 0x062a }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x062a }
            switch(r0) {
                case -2038157993: goto L_0x013b;
                case -2038157992: goto L_0x0132;
                case -1984447159: goto L_0x0129;
                case -1458559768: goto L_0x0120;
                case -1337484257: goto L_0x0117;
                case -1152053872: goto L_0x010e;
                case -1147076792: goto L_0x0105;
                case -708142633: goto L_0x00fc;
                case -594534941: goto L_0x00f3;
                case -581948979: goto L_0x00ea;
                case -401692983: goto L_0x00e1;
                case -399133966: goto L_0x00d8;
                case -154985182: goto L_0x00cf;
                case 2006354: goto L_0x00c6;
                case 2006367: goto L_0x00bd;
                case 81951059: goto L_0x00b3;
                case 439365079: goto L_0x00a9;
                case 511748841: goto L_0x009f;
                case 619782645: goto L_0x0095;
                case 619782647: goto L_0x008b;
                case 632760191: goto L_0x0081;
                case 807317112: goto L_0x0077;
                case 807374834: goto L_0x006d;
                case 1070811680: goto L_0x0063;
                case 1682560972: goto L_0x0059;
                case 1921424370: goto L_0x004f;
                case 2133907258: goto L_0x0045;
                default: goto L_0x0040;
            }     // Catch:{ all -> 0x062a }
        L_0x0040:
            A0o = r3     // Catch:{ all -> 0x062a }
        L_0x0042:
            monitor-exit(r2)     // Catch:{ all -> 0x062a }
            goto L_0x0627
        L_0x0045:
            java.lang.String r0 = "Lenovo K8"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x004f:
            java.lang.String r0 = "Sony Tablet S"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0059:
            java.lang.String r0 = "ASUS_X00AD"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0063:
            java.lang.String r0 = "Lenovo K10a40"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x006d:
            java.lang.String r0 = "LG-M250"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0077:
            java.lang.String r0 = "LG-K430"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0081:
            java.lang.String r0 = "SM-N910R4"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x008b:
            java.lang.String r0 = "ASUS_X00ADC"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0095:
            java.lang.String r0 = "ASUS_X00ADA"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x009f:
            java.lang.String r0 = "SM-J200GU"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00a9:
            java.lang.String r0 = "HUAWEI NXT-L29"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00b3:
            java.lang.String r0 = "VS880"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00bd:
            java.lang.String r0 = "AFTN"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00c6:
            java.lang.String r0 = "AFTA"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00cf:
            java.lang.String r0 = "Andromax A26C4H"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00d8:
            java.lang.String r0 = "SM-J200M"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00e1:
            java.lang.String r0 = "SM-G9350"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00ea:
            java.lang.String r0 = "m2 note"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00f3:
            java.lang.String r0 = "JSN-L21"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00fc:
            java.lang.String r0 = "Redmi 4X"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0105:
            java.lang.String r0 = "Lenovo A2016b30"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x010e:
            java.lang.String r0 = "SUGAR S9"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0117:
            java.lang.String r0 = "Asus_ZB500KL"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0120:
            java.lang.String r0 = "MotoE2(4G-LTE)"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0129:
            java.lang.String r0 = "MotoG3"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0132:
            java.lang.String r0 = "Redmi Note 3"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x013b:
            java.lang.String r0 = "Redmi Note 2"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
        L_0x0143:
            A0n = r3     // Catch:{ all -> 0x062a }
            goto L_0x0040
        L_0x0147:
            java.lang.String r0 = "HWWAS-H"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0151:
            java.lang.String r0 = "HWVNS-H"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x015b:
            java.lang.String r0 = "ELUGA_Prim"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0165:
            java.lang.String r0 = "ELUGA_Note"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x016f:
            java.lang.String r0 = "ASUS_X00AD_2"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0179:
            java.lang.String r0 = "HWCAM-H"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0183:
            java.lang.String r0 = "HWBLN-H"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x018d:
            java.lang.String r0 = "BRAVIA_ATV3_4K"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0197:
            java.lang.String r0 = "Infinix-X572"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01a1:
            java.lang.String r0 = "PB2-670M"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01ab:
            java.lang.String r0 = "santoni"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01b5:
            java.lang.String r0 = "iball8735_9806"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01bf:
            java.lang.String r0 = "CPH1609"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01c9:
            java.lang.String r0 = "woods_f"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01d3:
            java.lang.String r0 = "htc_e56ml_dtul"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01dd:
            java.lang.String r0 = "EverStar_S"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01e7:
            java.lang.String r0 = "hwALE-H"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01f1:
            java.lang.String r0 = "itel_S41"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01fb:
            java.lang.String r0 = "LS-5017"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0205:
            java.lang.String r0 = "panell_d"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x020f:
            java.lang.String r0 = "j2xlteins"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0219:
            java.lang.String r0 = "A7000plus"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0223:
            java.lang.String r0 = "manning"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x022d:
            java.lang.String r0 = "GIONEE_WBL7519"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0237:
            java.lang.String r0 = "GIONEE_WBL7365"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0241:
            java.lang.String r0 = "GIONEE_WBL5708"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x024b:
            java.lang.String r0 = "QM16XE_U"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0255:
            java.lang.String r0 = "Pixi5-10_4G"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x025f:
            java.lang.String r0 = "TB3-850M"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0269:
            java.lang.String r0 = "TB3-850F"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0273:
            java.lang.String r0 = "TB3-730X"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x027d:
            java.lang.String r0 = "TB3-730F"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0287:
            java.lang.String r0 = "A7020a48"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0291:
            java.lang.String r0 = "A7010a48"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x029b:
            java.lang.String r0 = "griffin"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02a5:
            java.lang.String r0 = "marino_f"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02af:
            java.lang.String r0 = "CPY83_I00"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02b9:
            java.lang.String r0 = "A2016a40"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02c3:
            java.lang.String r0 = "le_x6"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02cd:
            java.lang.String r0 = "l5460"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02d7:
            java.lang.String r0 = "i9031"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02e1:
            java.lang.String r0 = "X3_HK"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02eb:
            java.lang.String r0 = "V23GB"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02f5:
            java.lang.String r0 = "Q4310"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02ff:
            java.lang.String r0 = "Q4260"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0309:
            java.lang.String r0 = "PRO7S"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0313:
            java.lang.String r0 = "F3311"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x031d:
            java.lang.String r0 = "F3215"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0327:
            java.lang.String r0 = "F3213"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0331:
            java.lang.String r0 = "F3211"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x033b:
            java.lang.String r0 = "F3116"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0345:
            java.lang.String r0 = "F3113"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x034f:
            java.lang.String r0 = "F3111"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0359:
            java.lang.String r0 = "E5643"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0363:
            java.lang.String r0 = "A1601"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x036d:
            java.lang.String r0 = "Aura_Note_2"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0377:
            java.lang.String r0 = "MEIZU_M5"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0381:
            java.lang.String r0 = "p212"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x038b:
            java.lang.String r0 = "mido"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0395:
            java.lang.String r0 = "kate"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x039f:
            java.lang.String r0 = "fugu"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03a9:
            java.lang.String r0 = "XE2X"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03b3:
            java.lang.String r0 = "Q427"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03bd:
            java.lang.String r0 = "Q350"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03c7:
            java.lang.String r0 = "P681"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03d1:
            java.lang.String r0 = "1714"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03db:
            java.lang.String r0 = "1713"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03e5:
            java.lang.String r0 = "1601"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03ef:
            java.lang.String r0 = "flo"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03f9:
            java.lang.String r0 = "deb"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0403:
            java.lang.String r0 = "cv3"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x040d:
            java.lang.String r0 = "cv1"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0417:
            java.lang.String r0 = "Z80"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0421:
            java.lang.String r0 = "QX1"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x042b:
            java.lang.String r0 = "PLE"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0435:
            java.lang.String r0 = "P85"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x043f:
            java.lang.String r0 = "MX6"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0449:
            java.lang.String r0 = "M5c"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0453:
            java.lang.String r0 = "JGZ"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x045d:
            java.lang.String r0 = "mh"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0467:
            java.lang.String r0 = "V5"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0471:
            java.lang.String r0 = "V1"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x047b:
            java.lang.String r0 = "Q5"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0485:
            java.lang.String r0 = "C1"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x048f:
            java.lang.String r0 = "woods_fn"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0499:
            java.lang.String r0 = "ELUGA_A3_Pro"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04a3:
            java.lang.String r0 = "Z12_PRO"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04ad:
            java.lang.String r0 = "BLACK-1X"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04b7:
            java.lang.String r0 = "taido_row"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04c1:
            java.lang.String r0 = "Pixi4-7_3G"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04cb:
            java.lang.String r0 = "GIONEE_GBL7360"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04d5:
            java.lang.String r0 = "GiONEE_CBL7513"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04df:
            java.lang.String r0 = "OnePlus5T"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04e9:
            java.lang.String r0 = "whyred"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04f3:
            java.lang.String r0 = "watson"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04fd:
            java.lang.String r0 = "SVP-DTV15"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0507:
            java.lang.String r0 = "A7000-a"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0511:
            java.lang.String r0 = "nicklaus_f"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x051b:
            java.lang.String r0 = "tcl_eu"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0525:
            java.lang.String r0 = "ELUGA_Ray_X"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x052f:
            java.lang.String r0 = "s905x018"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0539:
            java.lang.String r0 = "A10-70L"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0543:
            java.lang.String r0 = "A10-70F"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x054d:
            java.lang.String r0 = "namath"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0557:
            java.lang.String r0 = "Slate_Pro"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0561:
            java.lang.String r0 = "iris60"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x056b:
            java.lang.String r0 = "BRAVIA_ATV2"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0575:
            java.lang.String r0 = "GiONEE_GBL7319"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x057f:
            java.lang.String r0 = "panell_dt"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0589:
            java.lang.String r0 = "panell_ds"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0593:
            java.lang.String r0 = "panell_dl"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x059d:
            java.lang.String r0 = "vernee_M5"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05a6:
            java.lang.String r0 = "Phantom6"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05af:
            java.lang.String r0 = "ComioS1"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05b8:
            java.lang.String r0 = "XT1663"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05c1:
            java.lang.String r0 = "AquaPowerM"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05ca:
            java.lang.String r0 = "PGN611"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05d3:
            java.lang.String r0 = "PGN610"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05dc:
            java.lang.String r0 = "PGN528"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05e5:
            java.lang.String r0 = "NX573J"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05ee:
            java.lang.String r0 = "NX541J"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05f7:
            java.lang.String r0 = "CP8676_I02"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0600:
            java.lang.String r0 = "K50a40"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0609:
            java.lang.String r0 = "GIONEE_SWW1631"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0612:
            java.lang.String r0 = "GIONEE_SWW1627"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x061b:
            java.lang.String r0 = "GIONEE_SWW1609"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
        L_0x0623:
            A0n = r3     // Catch:{ all -> 0x062a }
            goto L_0x0037
        L_0x0627:
            boolean r0 = A0n
            return r0
        L_0x062a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x062a }
            throw r0
        L_0x062d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688982l.A0S(java.lang.String):boolean");
    }

    public void A0G(long j, boolean z) {
        long j2;
        super.A0G(j, z);
        A05(this);
        this.A0d = -9223372036854775807L;
        this.A05 = 0;
        this.A0K = -9223372036854775807L;
        this.A09 = 0;
        this.A0A = 0;
        int i = this.A0B;
        if (i != 0) {
            this.A0N = this.A0l[i - 1];
            this.A0B = 0;
        }
        if (z) {
            long j3 = this.A0g;
            if (j3 > 0) {
                j2 = SystemClock.elapsedRealtime() + j3;
            } else {
                j2 = -9223372036854775807L;
            }
            this.A0J = j2;
            return;
        }
        this.A0J = -9223372036854775807L;
    }

    public void A0H(boolean z, boolean z2) {
        super.A0H(z, z2);
        C199319f7 r0 = this.A04;
        Objects.requireNonNull(r0);
        int i = r0.A00;
        this.A0c = i;
        this.A0a = AnonymousClass000.A1P(i);
        AnonymousClass5o9 r3 = this.A0j;
        AnonymousClass9OH r2 = this.A09;
        Handler handler = r3.A00;
        if (handler != null) {
            C165587tf.A0y(handler, r3, r2, 38);
        }
        C200969iY r32 = this.A0i;
        r32.A08 = false;
        if (r32.A09 != null) {
            r32.A0B.A02.sendEmptyMessage(1);
            C204249ph r22 = r32.A0A;
            if (r22 != null) {
                r22.A00.registerDisplayListener(r22, (Handler) null);
            }
            C200969iY.A00(r32);
        }
    }

    public void A0K() {
        super.A0K();
        this.A04 = 0;
    }

    public void A0O(C207099uY r4) {
        super.A0O(r4);
        AnonymousClass5o9 r2 = this.A0j;
        Handler handler = r2.A00;
        if (handler != null) {
            C165587tf.A0y(handler, r2, r4, 36);
        }
        this.A02 = r4.A02;
        this.A0C = r4.A0E;
    }

    public boolean BMw() {
        Surface surface;
        Surface surface2;
        if (super.BMw() && !this.A0Z && (((surface2 = this.A0P) == null || this.A0Q != surface2) && this.A0C != null && !this.A0a)) {
            this.A07 = C023109s.A0R;
        }
        if (!super.BMw() || (!this.A0Z && (((surface = this.A0P) == null || this.A0Q != surface) && this.A0C != null && !this.A0a))) {
            long j = this.A0J;
            if (j != -9223372036854775807L) {
                if (SystemClock.elapsedRealtime() >= j) {
                    this.A0J = -9223372036854775807L;
                }
            }
            return false;
        }
        this.A0J = -9223372036854775807L;
        return true;
    }

    public static void A04(Surface surface, C23079B3l b3l) {
        b3l.BrS(surface);
    }
}
