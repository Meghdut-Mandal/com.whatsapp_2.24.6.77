package X;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Objects;

/* renamed from: X.9l7  reason: invalid class name and case insensitive filesystem */
public final class C202149l7 {
    public final MediaCodecInfo.CodecCapabilities A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r9) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r2.isFeatureSupported("tunneled-playback") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        return new X.C202149l7(r2, r3, r10, false, r11, r12, r8, r9, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if ("Nexus 10".equals(r1) == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C202149l7 A00(android.media.MediaCodecInfo.CodecCapabilities r8, java.lang.String r9, java.lang.String r10, boolean r11, boolean r12, boolean r13) {
        /*
            r2 = r8
            r3 = r9
            if (r8 == 0) goto L_0x0034
            java.lang.String r0 = "adaptive-playback"
            boolean r0 = r8.isFeatureSupported(r0)
            if (r0 == 0) goto L_0x0034
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 22
            if (r1 > r0) goto L_0x004c
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04
            java.lang.String r0 = "ODROID-XU3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "Nexus 10"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
        L_0x0024:
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x004c
        L_0x0034:
            r8 = 0
            if (r2 == 0) goto L_0x0040
        L_0x0037:
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r2.isFeatureSupported(r0)
            r9 = 1
            if (r0 != 0) goto L_0x0041
        L_0x0040:
            r9 = 0
        L_0x0041:
            r5 = 0
            X.9l7 r1 = new X.9l7
            r4 = r10
            r6 = r11
            r7 = r12
            r10 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        L_0x004c:
            r8 = 1
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202149l7.A00(android.media.MediaCodecInfo$CodecCapabilities, java.lang.String, java.lang.String, boolean, boolean, boolean):X.9l7");
    }

    public boolean A03(int i, int i2, double d) {
        String obj;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            obj = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                obj = "sizeAndRate.vCaps";
            } else {
                if (Util.A00 >= 29) {
                    int A002 = C1893693k.A00(videoCapabilities, d, i, i2);
                    if (A002 != 2) {
                        if (A002 == 1) {
                            StringBuilder A0u = AnonymousClass000.A0u();
                            C90464aC.A1K("sizeAndRate.cover, ", "x", A0u, i, i2);
                            A0u.append("@");
                            A0u.append(d);
                            obj = A0u.toString();
                        }
                    }
                    return true;
                }
                if (!A02(videoCapabilities, d, i, i2)) {
                    if (i < i2) {
                        String str = this.A02;
                        if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Util.A01)) && A02(videoCapabilities, d, i2, i)) {
                            StringBuilder A0u2 = AnonymousClass000.A0u();
                            C90464aC.A1K("sizeAndRate.rotated, ", "x", A0u2, i, i2);
                            A0u2.append("@");
                            A0u2.append(d);
                            String obj2 = A0u2.toString();
                            StringBuilder A0u3 = AnonymousClass000.A0u();
                            A0u3.append("AssumedSupport [");
                            A0u3.append(obj2);
                            A0u3.append("] [");
                            C90474aD.A1L(A0u3, str);
                            A0u3.append(this.A01);
                            A0u3.append("] [");
                            Log.d("MediaCodecInfo", C165567td.A0Y(Util.A02, A0u3));
                        }
                    }
                    StringBuilder A0u4 = AnonymousClass000.A0u();
                    C90464aC.A1K("sizeAndRate.support, ", "x", A0u4, i, i2);
                    A0u4.append("@");
                    A0u4.append(d);
                    obj = A0u4.toString();
                }
                return true;
            }
        }
        A01(this, obj);
        return false;
    }

    public C202149l7(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Objects.requireNonNull(str);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = codecCapabilities;
        this.A06 = z;
        this.A04 = z2;
        this.A08 = z3;
        this.A03 = z4;
        this.A09 = z5;
        this.A07 = z6;
        this.A05 = "video".equals(C203249nb.A05(str2));
    }

    public static void A01(C202149l7 r3, String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NoSupport [");
        A0u.append(str);
        A0u.append("] [");
        C90474aD.A1L(A0u, r3.A02);
        A0u.append(r3.A01);
        A0u.append("] [");
        Log.d("MediaCodecInfo", C165567td.A0Y(Util.A02, A0u));
    }

    public static boolean A02(MediaCodecInfo.VideoCapabilities videoCapabilities, double d, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public String toString() {
        return this.A02;
    }
}
