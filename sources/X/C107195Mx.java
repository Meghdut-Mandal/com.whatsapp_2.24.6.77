package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Mx  reason: invalid class name and case insensitive filesystem */
public class C107195Mx extends C132446Tt {
    public final int A00;
    public final C19700wN A01;
    public final C20690y0 A02;
    public final AnonymousClass17Y A03;
    public final AnonymousClass1XY A04;
    public final AnonymousClass1X4 A05;
    public final C19630wG A06;
    public final C19420v0 A07;
    public final AnonymousClass3XT A08;
    public final C20810yC A09;
    public final C21010yW A0A;
    public final C132366Tg A0B;
    public final AnonymousClass1D5 A0C;
    public final C25491Gn A0D;
    public final C117485mL A0E;
    public final C158477gz A0F;
    public final C105005Cx A0G;
    public final C1271167a A0H;
    public final AnonymousClass1YL A0I;
    public final AnonymousClass3T1 A0J;
    public final AnonymousClass1GX A0K;
    public final Integer A0L;
    public final Collection A0M;
    public final HashSet A0N;
    public final HashSet A0O;
    public final List A0P;
    public final List A0Q;
    public final Map A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final long A0Y;
    public final long A0Z;
    public final C19970wo A0a;
    public final AnonymousClass6BX A0b;
    public final Long A0c;
    public final Long A0d;
    public final Long A0e;

    public static int A00(C107195Mx r1, int i) {
        if (r1.A09.A0E(1516)) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 4;
            }
            if (i == 3) {
                return 3;
            }
            if (i == 5) {
                return 12;
            }
            if (i == 7) {
                return 1;
            }
            if (i == 30) {
                return 4;
            }
            switch (i) {
                case 10:
                case 11:
                    return 4;
                case 12:
                case 18:
                    return 1;
                case 13:
                case 14:
                case 19:
                case 20:
                case 21:
                    return 2;
                case 15:
                    return 10;
                case 16:
                case 17:
                    return 11;
            }
        } else if (i == 2 || i == 10 || i == 11) {
            return 4;
        } else {
            switch (i) {
                case 15:
                case 16:
                case 17:
                    return 5;
            }
        }
        return 0;
    }

    private C1042358u A01(int i, boolean z) {
        List list = this.A0Q;
        boolean contains = list.contains(C177528dw.A00);
        int size = list.size();
        int i2 = this.A00;
        long j = this.A0Z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = this.A0U;
        boolean z3 = this.A0V;
        long j2 = this.A0Y;
        C20810yC r6 = this.A09;
        return C111065bg.A00(this.A07, r6, this.A0b, this.A0L, this.A0c, this.A0d, this.A0e, i, size, i2, j, elapsedRealtime, j2, contains, z, z2, z3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x039a, code lost:
        if (r15 != 3) goto L_0x039c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x051b, code lost:
        if (r2.A01() != 0) goto L_0x051d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x052f, code lost:
        if (r8.intValue() == 3) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0531, code lost:
        r36 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0582, code lost:
        if (r8 != null) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0601, code lost:
        if (r1 == false) goto L_0x0603;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0254, code lost:
        if (r10 == 44) goto L_0x0256;
     */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x063b  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x063f  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0657  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0685  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x068c  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x06cf  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x06d9  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x002d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r42) {
        /*
            r41 = this;
            r0 = r41
            X.5mL r2 = r0.A0E
            boolean r1 = r0.A0T
            r20 = r1
            X.0ze r9 = r2.A00
            r3 = 453122092(0x1b02182c, float:1.0761158E-22)
            r2 = 1
            r9.markerStart(r3, r2)
            java.lang.String r1 = "SEND_TASK_START"
            r9.markerPoint((int) r3, (int) r2, (java.lang.String) r1)
            if (r20 == 0) goto L_0x06ed
            java.lang.String r1 = "ACTUAL_SEND"
        L_0x001a:
            r9.markerPoint((int) r3, (int) r2, (java.lang.String) r1)
            java.util.HashMap r19 = X.AnonymousClass001.A0J()
            java.util.ArrayList r18 = X.AnonymousClass001.A0I()
            java.util.List r1 = r0.A0P
            r40 = r1
            java.util.Iterator r21 = r40.iterator()
        L_0x002d:
            boolean r1 = r21.hasNext()
            if (r1 == 0) goto L_0x06f4
            java.lang.Object r3 = r21.next()
            android.net.Uri r3 = (android.net.Uri) r3
            X.0v0 r5 = r0.A07
            r4 = 1
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r5)
            java.lang.String r1 = "media_quality_has_send_media"
            X.C36331k8.A0w(r2, r1, r4)
            java.lang.Integer r8 = r0.A0L
            int r2 = r8.intValue()
            r1 = 3
            if (r2 != r1) goto L_0x005f
            java.util.HashSet r1 = r0.A0O
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x005f
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r5)
            java.lang.String r1 = "media_quality_has_send_hd_media"
            X.C36331k8.A0w(r2, r1, r4)
        L_0x005f:
            X.6Tg r10 = r0.A0B
            X.6QO r2 = r10.A03(r3)
            boolean r5 = r0.A0X
            if (r5 == 0) goto L_0x00e4
            java.io.File r7 = X.AnonymousClass6YY.A03(r3)
            if (r7 == 0) goto L_0x00d7
            X.0y0 r6 = r0.A02     // Catch:{ IOException -> 0x00c7 }
            java.lang.String r4 = r7.getCanonicalPath()     // Catch:{ IOException -> 0x00c7 }
            X.3BP r1 = r6.A08()     // Catch:{ IOException -> 0x00c7 }
            java.io.File r1 = r1.A06     // Catch:{ IOException -> 0x00c7 }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x00c7 }
            boolean r1 = r4.startsWith(r1)     // Catch:{ IOException -> 0x00c7 }
            if (r1 != 0) goto L_0x0099
            java.lang.String r4 = r7.getCanonicalPath()     // Catch:{ IOException -> 0x00c7 }
            X.3BP r1 = r6.A08()     // Catch:{ IOException -> 0x00c7 }
            java.io.File r1 = r1.A07     // Catch:{ IOException -> 0x00c7 }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x00c7 }
            boolean r1 = r4.startsWith(r1)     // Catch:{ IOException -> 0x00c7 }
            if (r1 == 0) goto L_0x00d7
        L_0x0099:
            boolean r1 = r7.delete()     // Catch:{ IOException -> 0x00c7 }
            r7 = 0
            if (r1 != 0) goto L_0x00ab
            X.0wN r6 = r0.A01     // Catch:{ IOException -> 0x00c7 }
            java.lang.String r4 = "MediaComposerActivity/failed to delete capture"
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x00c7 }
            r6.A0E(r4, r1, r7)     // Catch:{ IOException -> 0x00c7 }
        L_0x00ab:
            java.io.File r1 = r2.A07()     // Catch:{ IOException -> 0x00c7 }
            if (r1 == 0) goto L_0x00bb
            java.io.File r1 = r2.A07()     // Catch:{ IOException -> 0x00c7 }
            boolean r1 = r1.exists()     // Catch:{ IOException -> 0x00c7 }
            if (r1 != 0) goto L_0x00d7
        L_0x00bb:
            X.0wN r6 = r0.A01     // Catch:{ IOException -> 0x00c7 }
            java.lang.String r4 = "MediaComposerActivity/file missing"
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x00c7 }
            r6.A0E(r4, r1, r7)     // Catch:{ IOException -> 0x00c7 }
            goto L_0x00d7
        L_0x00c7:
            r1 = move-exception
            java.lang.String r7 = "MediaComposerActivity/deleteInternalCaptureForViewOnce"
            com.whatsapp.util.Log.e(r7, r1)
            X.0wN r6 = r0.A01
            java.lang.String r4 = r1.getMessage()
            r1 = 1
            r6.A0E(r7, r4, r1)
        L_0x00d7:
            boolean r1 = r0.A0W
            if (r1 == 0) goto L_0x01aa
            java.io.File r1 = X.AnonymousClass6YY.A03(r3)
            r1.delete()     // Catch:{ Exception -> 0x019a }
            goto L_0x01aa
        L_0x00e4:
            X.1GX r12 = r0.A0K
            java.io.File r11 = X.AnonymousClass6YY.A03(r3)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "mediafileutils/move "
            X.C36321k7.A1K(r11, r1, r4)
            if (r11 == 0) goto L_0x01aa
            java.lang.String r7 = r11.getName()     // Catch:{ IOException -> 0x018f }
            X.0y0 r6 = r12.A00     // Catch:{ IOException -> 0x018f }
            java.lang.String r4 = r11.getCanonicalPath()     // Catch:{ IOException -> 0x018f }
            X.3BP r1 = r6.A08()     // Catch:{ IOException -> 0x018f }
            java.io.File r1 = r1.A06     // Catch:{ IOException -> 0x018f }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x018f }
            boolean r1 = r4.startsWith(r1)     // Catch:{ IOException -> 0x018f }
            if (r1 == 0) goto L_0x0128
            X.3BP r1 = r6.A08()     // Catch:{ IOException -> 0x018f }
            java.io.File r1 = r1.A05     // Catch:{ IOException -> 0x018f }
            java.io.File r4 = X.AnonymousClass1GW.A0I(r1, r7)     // Catch:{ IOException -> 0x018f }
            X.1Aw r1 = r12.A03     // Catch:{ IOException -> 0x018f }
            X.AnonymousClass6YY.A0C(r1, r11, r4)     // Catch:{ IOException -> 0x018f }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x018f }
            java.lang.String r1 = "mediafileutils/moved image "
            X.C36321k7.A1K(r4, r1, r6)     // Catch:{ IOException -> 0x018f }
            goto L_0x0154
        L_0x0128:
            java.lang.String r4 = r11.getCanonicalPath()     // Catch:{ IOException -> 0x018f }
            X.3BP r1 = r6.A08()     // Catch:{ IOException -> 0x018f }
            java.io.File r1 = r1.A07     // Catch:{ IOException -> 0x018f }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x018f }
            boolean r1 = r4.startsWith(r1)     // Catch:{ IOException -> 0x018f }
            if (r1 == 0) goto L_0x01aa
            X.3BP r1 = r6.A08()     // Catch:{ IOException -> 0x018f }
            java.io.File r1 = r1.A0N     // Catch:{ IOException -> 0x018f }
            java.io.File r4 = X.AnonymousClass1GW.A0I(r1, r7)     // Catch:{ IOException -> 0x018f }
            X.1Aw r1 = r12.A03     // Catch:{ IOException -> 0x018f }
            X.AnonymousClass6YY.A0C(r1, r11, r4)     // Catch:{ IOException -> 0x018f }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x018f }
            java.lang.String r1 = "mediafileutils/moved video"
            X.C36321k7.A1K(r4, r1, r6)     // Catch:{ IOException -> 0x018f }
        L_0x0154:
            X.6QO r7 = r10.A03(r3)
            java.util.Map r1 = r10.A00
            r1.remove(r3)
            android.net.Uri r1 = android.net.Uri.fromFile(r4)
            android.net.Uri$Builder r11 = r1.buildUpon()
            r1 = 0
            X.AnonymousClass1GX.A0W(r11, r3, r1)
            java.lang.String r6 = "flip-h"
            java.lang.String r1 = r3.getQueryParameter(r6)
            if (r1 == 0) goto L_0x0178
            java.lang.String r1 = r3.getQueryParameter(r6)
            r11.appendQueryParameter(r6, r1)
        L_0x0178:
            android.net.Uri r3 = r11.build()
            X.6QO r1 = new X.6QO
            r1.<init>(r3, r7)
            r1.A0F(r4)
            r10.A06(r1)
            X.0wG r1 = r0.A06
            android.content.Context r1 = r1.A00
            X.AnonymousClass1GW.A0O(r1, r3)
            goto L_0x01aa
        L_0x018f:
            r6 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "mediafileutils/unable to move capture to external "
            X.C36321k7.A1M(r11, r1, r4, r6)
            goto L_0x01aa
        L_0x019a:
            r1 = move-exception
            java.lang.String r7 = "MediaComposerActivity/deleteExternalViewOnceIfNewContent"
            com.whatsapp.util.Log.e(r7, r1)
            X.0wN r6 = r0.A01
            java.lang.String r4 = r1.getMessage()
            r1 = 1
            r6.A0E(r7, r4, r1)
        L_0x01aa:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "MediaComposerActivity/sendmedia/uri = "
            X.C36321k7.A1K(r3, r1, r4)
            boolean r1 = r2.A0K()
            if (r1 == 0) goto L_0x0226
            r6 = 13
        L_0x01bb:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r1 = r19
            java.lang.Object r1 = r1.get(r7)
            X.58u r1 = (X.C1042358u) r1
            if (r1 != 0) goto L_0x01d2
            X.58u r1 = r0.A01(r6, r5)
            r4 = r19
            r4.put(r7, r1)
        L_0x01d2:
            java.lang.Long r4 = r1.A0H
            if (r4 != 0) goto L_0x01dc
            java.lang.Long r4 = X.C36411kG.A0t()
            r1.A0H = r4
        L_0x01dc:
            java.lang.Long r4 = X.C90464aC.A0S(r4)
            r1.A0H = r4
            r4 = 1
            if (r6 == r4) goto L_0x0445
            r4 = 3
            if (r6 == r4) goto L_0x031b
            r4 = 13
            if (r6 == r4) goto L_0x031b
            r4 = 20
            if (r6 != r4) goto L_0x002d
            java.lang.String r4 = "MediaComposerActivity/sendSticker"
            com.whatsapp.util.Log.i((java.lang.String) r4)
            r6 = 453122092(0x1b02182c, float:1.0761158E-22)
            r5 = 1
            java.lang.String r4 = "SEND_TASK_IMAGE_START"
            r9.markerPoint((int) r6, (int) r5, (java.lang.String) r4)
            X.5Cx r12 = r0.A0G
            X.1GX r11 = r12.A00
            android.net.Uri$Builder r10 = X.C105005Cx.A00(r1, r2, r11)
            r12.A04(r10, r3)
            X.AnonymousClass1GX.A0X(r10, r2)
            int r8 = r2.A01()
            X.6VQ r7 = r12.A03(r2)
            r6 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            X.1D1 r4 = r12.A02
            r2 = 1
            X.63a r2 = r4.A00(r5, r2, r6)
            X.C18740tg.A06(r2)
            int r4 = r2.A00
            goto L_0x0239
        L_0x0226:
            int r1 = r0.A00
            boolean r1 = X.C111075bh.A00(r1)
            if (r1 == 0) goto L_0x0231
            r6 = 20
            goto L_0x01bb
        L_0x0231:
            X.1Gn r1 = r0.A0D
            int r1 = X.AnonymousClass6QO.A00(r2, r1)
            byte r6 = (byte) r1
            goto L_0x01bb
        L_0x0239:
            android.net.Uri r2 = r10.build()     // Catch:{ 1X5 | IOException -> 0x04e6 }
            android.graphics.Bitmap r2 = r11.A0e(r2, r4, r4)     // Catch:{ 1X5 | IOException -> 0x04e6 }
            android.graphics.Bitmap r4 = X.C132106Se.A01(r2)
            java.lang.Integer r2 = r1.A06
            if (r2 == 0) goto L_0x0265
            int r10 = r2.intValue()
            r2 = 42
            if (r10 == r2) goto L_0x0256
            r2 = 44
            r5 = 0
            if (r10 != r2) goto L_0x0257
        L_0x0256:
            r5 = 1
        L_0x0257:
            if (r7 != 0) goto L_0x0307
            if (r5 != 0) goto L_0x0265
            X.6Se r2 = r12.A03
            android.graphics.Bitmap r2 = r2.A02(r4)
        L_0x0261:
            r4.recycle()
            r4 = r2
        L_0x0265:
            if (r8 == 0) goto L_0x027d
            boolean r2 = r4.isMutable()
            X.C18740tg.A0B(r2)
            X.54s r2 = r12.A01
            com.whatsapp.filter.FilterUtils.A00(r4, r2, r8, r6)
            java.lang.Long r2 = r1.A0G
            if (r2 == 0) goto L_0x027d
            java.lang.Long r2 = X.C90464aC.A0S(r2)
            r1.A0G = r2
        L_0x027d:
            if (r7 == 0) goto L_0x0282
            X.C105005Cx.A02(r4, r1, r7)
        L_0x0282:
            android.graphics.Bitmap r5 = X.AnonymousClass6Y8.A03(r4)
            r4 = 512(0x200, float:7.175E-43)
            r2 = 16
            android.graphics.Bitmap r4 = X.AnonymousClass6Y8.A04(r5, r4, r2)
            r5.recycle()
            if (r4 == 0) goto L_0x002d
            java.lang.Long r2 = r1.A0C
            if (r2 == 0) goto L_0x029d
            java.lang.Long r2 = X.C90464aC.A0S(r2)
            r1.A0C = r2
        L_0x029d:
            X.1XY r5 = r0.A04
            java.util.List r8 = r0.A0Q
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            long r1 = java.lang.System.currentTimeMillis()
            r6.append(r1)
            java.lang.String r1 = "_"
            java.lang.String r1 = X.AnonymousClass000.A0l(r4, r1, r6)
            X.1YP r6 = r5.A0E
            r31 = 0
            X.6c4 r2 = r6.A01(r4, r1)
            r23 = 0
            r30 = 4
            r7 = 1
            X.3S2 r1 = new X.3S2
            r25 = r23
            r26 = r23
            r27 = r23
            r28 = r23
            r29 = r23
            r32 = 1
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r22 = r1
            r24 = r23
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r2.A04 = r1
            r6.A03(r2)
            r4.recycle()
            X.1X4 r4 = r5.A02
            r1 = 8
            X.33E r4 = r4.A0B(r2, r8, r1)
            if (r4 == 0) goto L_0x02fd
            X.7gz r1 = r0.A0F
            if (r1 == 0) goto L_0x02fd
            r1 = 6
            X.7si r2 = new X.7si
            r2.<init>(r3, r0, r1)
            X.3ty r1 = r4.A00
            r1.A0A(r2)
        L_0x02fd:
            r2 = 453122092(0x1b02182c, float:1.0761158E-22)
            java.lang.String r1 = "SEND_TASK_IMAGE_END"
            r9.markerPoint((int) r2, (int) r7, (java.lang.String) r1)
            goto L_0x002d
        L_0x0307:
            X.6Se r2 = r12.A03
            if (r5 == 0) goto L_0x0311
            android.graphics.Bitmap r2 = X.C132106Se.A00(r4)
            goto L_0x0261
        L_0x0311:
            android.graphics.Bitmap r2 = r2.A02(r4)
            android.graphics.Bitmap r2 = X.C132106Se.A00(r2)
            goto L_0x0261
        L_0x031b:
            r6 = 453122092(0x1b02182c, float:1.0761158E-22)
            r5 = 1
            java.lang.String r4 = "SEND_TASK_VIDEO_START"
            r9.markerPoint((int) r6, (int) r5, (java.lang.String) r4)
            java.util.HashSet r5 = r0.A0O
            boolean r4 = r5.contains(r3)
            if (r4 != 0) goto L_0x0335
            android.net.Uri r4 = r2.A0J
            boolean r4 = r5.contains(r4)
            if (r4 != 0) goto L_0x0335
            r8 = 0
        L_0x0335:
            android.graphics.Point r7 = r2.A03()
            monitor-enter(r2)
            long r4 = r2.A02     // Catch:{ all -> 0x06f1 }
            monitor-exit(r2)
            int r6 = (int) r4
            r5 = 0
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>(r5, r6)
            if (r7 == 0) goto L_0x0356
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x0356
            int r4 = r7.x
            long r5 = (long) r4
            int r4 = r7.y
            long r12 = (long) r4
            r17 = 0
        L_0x0354:
            monitor-enter(r2)
            goto L_0x035d
        L_0x0356:
            r12 = 0
            r17 = 1
            r5 = 0
            goto L_0x0354
        L_0x035d:
            android.graphics.Point r4 = r2.A03     // Catch:{ all -> 0x06f1 }
            monitor-exit(r2)
            if (r4 == 0) goto L_0x0384
            int r11 = r4.x
            int r7 = r4.y
            r17 = 0
        L_0x0368:
            X.6QO r4 = r10.A03(r3)
            java.io.File r10 = r4.A08()
            X.C18740tg.A06(r10)
            X.3Qj r4 = new X.3Qj
            r4.<init>()
            r4.A0I = r10
            r4.A0F = r5
            r4.A0G = r12
            r4.A08 = r11
            r4.A07 = r7
            monitor-enter(r2)
            goto L_0x0387
        L_0x0384:
            r7 = 0
            r11 = 0
            goto L_0x0368
        L_0x0387:
            android.graphics.RectF r14 = r2.A06     // Catch:{ all -> 0x06f1 }
            monitor-exit(r2)
            r4.A0H = r14
            monitor-enter(r2)
            boolean r14 = r2.A0D     // Catch:{ all -> 0x06f1 }
            monitor-exit(r2)
            r4.A0T = r14
            if (r8 == 0) goto L_0x039c
            int r15 = r8.intValue()
            r14 = 3
            r8 = 1
            if (r15 == r14) goto L_0x039d
        L_0x039c:
            r8 = 0
        L_0x039d:
            r4.A0S = r8
            X.67a r14 = r0.A0H
            X.6VQ r8 = r14.A03(r2)
            if (r8 == 0) goto L_0x03a9
            r17 = 0
        L_0x03a9:
            r28 = 1000(0x3e8, double:4.94E-321)
            if (r8 != 0) goto L_0x03f1
            if (r11 <= 0) goto L_0x0627
            if (r7 <= 0) goto L_0x0627
            long r28 = r28 * r5
            monitor-enter(r2)
            android.graphics.RectF r15 = r2.A06     // Catch:{ all -> 0x06f1 }
            monitor-exit(r2)
            r8 = 0
            r27 = 0
            if (r10 != 0) goto L_0x03c3
            java.lang.String r7 = "mediafileutils/createVideoThumbnail/file=null"
            com.whatsapp.util.Log.e((java.lang.String) r7)
            goto L_0x06e5
        L_0x03c3:
            X.C21656ATx.A04(r10)     // Catch:{ IOException -> 0x03d8 }
            android.graphics.Bitmap r8 = X.C21656ATx.A00(r10)     // Catch:{ IOException | IllegalArgumentException -> 0x03d0, Exception -> 0x03cc }
            goto L_0x06e5
        L_0x03cc:
            r10 = move-exception
            java.lang.String r7 = "mediafileutils/createGifThumbnail/unexpected gif exception "
            goto L_0x03d3
        L_0x03d0:
            r10 = move-exception
            java.lang.String r7 = "mediafileutils/createGifThumbnail/gif file not read "
        L_0x03d3:
            com.whatsapp.util.Log.e(r7, r10)
            goto L_0x06e5
        L_0x03d8:
            r26 = -1
            X.6vW r8 = new X.6vW
            r8.<init>(r10)
            r30 = 0
            r31 = 0
            r22 = r15
            r23 = r8
            r24 = r11
            r25 = r7
            android.graphics.Bitmap r8 = X.C25541Gs.A00(r22, r23, r24, r25, r26, r27, r28, r30, r31)
            goto L_0x06e5
        L_0x03f1:
            java.io.File r7 = r4.A0I
            long r10 = r5 * r28
            android.graphics.Bitmap r10 = X.C25541Gs.A02(r7, r10)
            if (r10 == 0) goto L_0x0440
            boolean r7 = r10.isMutable()
            if (r7 != 0) goto L_0x040a
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888
            r7 = 1
            android.graphics.Bitmap r10 = r10.copy(r11, r7)
            if (r10 == 0) goto L_0x0440
        L_0x040a:
            int r7 = r10.getWidth()
            float r11 = (float) r7
            int r7 = r10.getHeight()
            float r7 = (float) r7
            java.util.ArrayList r23 = r8.A03(r11, r7)
            r7 = 0
            r8.A05(r10, r7, r7, r7)
            r7 = 100
            byte[] r25 = X.C25541Gs.A03(r10, r7)
        L_0x0422:
            r8.A07(r1)
            java.util.List r7 = r8.A04
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x042f
            r17 = 0
        L_0x042f:
            java.lang.String r10 = X.AnonymousClass1GW.A0K()
            r4.A0K = r10
            X.0y0 r7 = r0.A02
            java.io.File r7 = X.AnonymousClass1GW.A0H(r7, r10)
            r8.A08(r7)
            goto L_0x0635
        L_0x0440:
            r23 = 0
            r25 = 0
            goto L_0x0422
        L_0x0445:
            java.lang.String r6 = "MediaComposerActivity/sendimage"
            com.whatsapp.util.Log.i((java.lang.String) r6)
            r7 = 453122092(0x1b02182c, float:1.0761158E-22)
            java.lang.String r6 = "SEND_TASK_IMAGE_START"
            r9.markerPoint((int) r7, (int) r4, (java.lang.String) r6)
            java.util.HashSet r7 = r0.A0O
            boolean r6 = r7.contains(r3)
            r31 = 0
            if (r6 != 0) goto L_0x0466
            android.net.Uri r6 = r2.A0J
            boolean r6 = r7.contains(r6)
            if (r6 != 0) goto L_0x0466
            r8 = r31
        L_0x0466:
            X.5Cx r10 = r0.A0G
            java.util.List r15 = r0.A0Q
            X.8dw r6 = X.C177528dw.A00
            boolean r11 = r15.contains(r6)
            X.1GX r14 = r10.A00
            android.net.Uri$Builder r7 = X.C105005Cx.A00(r1, r2, r14)
            r10.A04(r7, r3)
            X.AnonymousClass1GX.A0X(r7, r2)
            int r13 = r2.A01()
            X.6VQ r12 = r10.A03(r2)
            if (r13 != 0) goto L_0x0488
            if (r12 == 0) goto L_0x04ee
        L_0x0488:
            X.1D1 r6 = r10.A02
            X.63a r11 = r6.A00(r8, r4, r11)
            X.C18740tg.A06(r11)
            int r6 = r11.A00
            android.net.Uri r7 = r7.build()     // Catch:{ 1X5 | IOException -> 0x04e6 }
            android.graphics.Bitmap r6 = r14.A0e(r7, r6, r6)     // Catch:{ 1X5 | IOException -> 0x04e6 }
            if (r13 == 0) goto L_0x04b4
            boolean r7 = r6.isMutable()
            X.C18740tg.A0B(r7)
            r14 = 0
            X.54s r7 = r10.A01
            com.whatsapp.filter.FilterUtils.A00(r6, r7, r13, r14)
            java.lang.Long r7 = r1.A0G
            if (r7 == 0) goto L_0x04b4
            java.lang.Long r7 = X.C90464aC.A0S(r7)
            r1.A0G = r7
        L_0x04b4:
            if (r12 == 0) goto L_0x04b9
            X.C105005Cx.A02(r6, r1, r12)
        L_0x04b9:
            X.0y0 r7 = r10.A00
            java.io.File r13 = X.C105005Cx.A01(r3, r7)
            android.net.Uri r7 = android.net.Uri.fromFile(r13)
            android.net.Uri$Builder r7 = r7.buildUpon()
            int r12 = r11.A03     // Catch:{ IOException -> 0x04e2 }
            boolean r11 = r11 instanceof X.C104845Bq     // Catch:{ IOException -> 0x04e2 }
            com.whatsapp.media.transcode.Mozjpeg r22 = X.AnonymousClass6IR.A00     // Catch:{ IOException -> 0x04e2 }
            java.lang.String r24 = r13.getAbsolutePath()     // Catch:{ IOException -> 0x04e2 }
            r27 = 0
            r26 = 1
            r23 = r6
            r25 = r12
            r28 = r11
            r22.A00(r23, r24, r25, r26, r27, r28)     // Catch:{ IOException -> 0x04e2 }
            if (r7 != 0) goto L_0x04ee
            goto L_0x002d
        L_0x04e2:
            r2 = move-exception
            java.lang.String r1 = "PrepareAndSendMediaTask/can't compress bitmap"
            goto L_0x04e9
        L_0x04e6:
            r2 = move-exception
            java.lang.String r1 = "PrepareAndSendMediaTask/can't load image"
        L_0x04e9:
            com.whatsapp.util.Log.e(r1, r2)
            goto L_0x002d
        L_0x04ee:
            java.lang.String r11 = r2.A0A()
            if (r11 == 0) goto L_0x04f9
            java.lang.String r6 = "caption"
            r7.appendQueryParameter(r6, r11)
        L_0x04f9:
            java.lang.String r11 = r2.A0C()
            if (r11 == 0) goto L_0x0588
            java.lang.String r6 = "mentions"
            r7.appendQueryParameter(r6, r11)
        L_0x0504:
            int r6 = r2.A02()
            if (r6 != 0) goto L_0x051d
            java.io.File r6 = r2.A06()
            if (r6 != 0) goto L_0x051d
            X.6VQ r6 = r10.A03(r2)
            if (r6 != 0) goto L_0x051d
            int r10 = r2.A01()
            r6 = 0
            if (r10 == 0) goto L_0x051e
        L_0x051d:
            r6 = 1
        L_0x051e:
            if (r6 == 0) goto L_0x0570
            java.lang.Long r6 = r1.A0C
            java.lang.Long r6 = X.C90494aF.A0W(r6)
            r1.A0C = r6
        L_0x0528:
            if (r8 == 0) goto L_0x0585
            int r6 = r8.intValue()
            r1 = 3
            if (r6 != r1) goto L_0x0585
        L_0x0531:
            r36 = 1
        L_0x0533:
            android.net.Uri r6 = r7.build()
            if (r20 == 0) goto L_0x061e
            X.67a r1 = r0.A0H
            X.6VQ r7 = r1.A03(r2)
            if (r7 == 0) goto L_0x054f
            android.graphics.RectF r1 = r7.A02
            float r2 = r1.width()
            float r1 = r1.height()
            java.util.ArrayList r31 = r7.A03(r2, r1)
        L_0x054f:
            android.net.Uri r1 = X.AnonymousClass1GX.A0U(r6)
            android.net.Uri$Builder r1 = r1.buildUpon()
            if (r36 != 0) goto L_0x056e
            if (r5 != 0) goto L_0x056e
            java.util.Map r2 = r0.A0R
            android.net.Uri r1 = r1.build()
            java.lang.Object r2 = r2.get(r1)
            X.4R0 r2 = (X.AnonymousClass4R0) r2
        L_0x0567:
            X.3T1 r1 = r0.A0J
            r17 = r1
            java.lang.String r1 = "sendmedia/sendimages/share-failed/ "
            goto L_0x058c
        L_0x056e:
            r2 = 0
            goto L_0x0567
        L_0x0570:
            java.lang.Long r6 = r1.A0I
            java.lang.Long r6 = X.C90494aF.A0W(r6)
            r1.A0I = r6
            X.0yC r6 = r0.A09
            r1 = 7970(0x1f22, float:1.1168E-41)
            boolean r1 = r6.A0E(r1)
            if (r1 != 0) goto L_0x0528
            if (r8 == 0) goto L_0x0585
            goto L_0x0531
        L_0x0585:
            r36 = 0
            goto L_0x0533
        L_0x0588:
            if (r7 != 0) goto L_0x0504
            goto L_0x002d
        L_0x058c:
            X.1XY r7 = r0.A04     // Catch:{ IOException -> 0x05f0, OutOfMemoryError -> 0x05e8, SecurityException -> 0x060b, 1X5 -> 0x05e0 }
            int r10 = r0.A00     // Catch:{ IOException -> 0x05f0, OutOfMemoryError -> 0x05e8, SecurityException -> 0x060b, 1X5 -> 0x05e0 }
            int r32 = A00(r0, r10)     // Catch:{ IOException -> 0x05f0, OutOfMemoryError -> 0x05e8, SecurityException -> 0x060b, 1X5 -> 0x05e0 }
            boolean r10 = r0.A0S     // Catch:{ IOException -> 0x05f0, OutOfMemoryError -> 0x05e8, SecurityException -> 0x060b, 1X5 -> 0x05e0 }
            r16 = r10
            X.3XT r14 = r0.A08     // Catch:{ IOException -> 0x05f0, OutOfMemoryError -> 0x05e8, SecurityException -> 0x060b, 1X5 -> 0x05e0 }
            boolean r13 = r0.A0U     // Catch:{ IOException -> 0x05f0, OutOfMemoryError -> 0x05e8, SecurityException -> 0x060b, 1X5 -> 0x05e0 }
            boolean r12 = r0.A0V     // Catch:{ IOException -> 0x05f0, OutOfMemoryError -> 0x05e8, SecurityException -> 0x060b, 1X5 -> 0x05e0 }
            int r34 = r40.size()     // Catch:{ IOException -> 0x05f0, OutOfMemoryError -> 0x05e8, SecurityException -> 0x060b, 1X5 -> 0x05e0 }
            X.1YL r11 = r7.A0B     // Catch:{ IOException -> 0x05f0, OutOfMemoryError -> 0x05e8, SecurityException -> 0x060b, 1X5 -> 0x05e0 }
            java.lang.String r10 = "mentions"
            java.lang.String r10 = r6.getQueryParameter(r10)     // Catch:{ IOException -> 0x05f0, OutOfMemoryError -> 0x05e8, SecurityException -> 0x060b, 1X5 -> 0x05e0 }
            java.util.List r30 = r11.A00(r10)     // Catch:{ IOException -> 0x05f0, OutOfMemoryError -> 0x05e8, SecurityException -> 0x060b, 1X5 -> 0x05e0 }
            java.lang.String r10 = "caption"
            java.lang.String r28 = r6.getQueryParameter(r10)     // Catch:{ IOException -> 0x05f0, OutOfMemoryError -> 0x05e8, SecurityException -> 0x060b, 1X5 -> 0x05e0 }
            r33 = 0
            r22 = r7
            r23 = r6
            r24 = r14
            r25 = r2
            r26 = r17
            r27 = r8
            r29 = r15
            r35 = r16
            r37 = r5
            r38 = r13
            r39 = r12
            X.33E r7 = r22.A02(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ IOException -> 0x05f0, OutOfMemoryError -> 0x05e8, SecurityException -> 0x060b, 1X5 -> 0x05e0 }
            X.7gz r2 = r0.A0F     // Catch:{ IOException -> 0x05f0, OutOfMemoryError -> 0x05e8, SecurityException -> 0x060b, 1X5 -> 0x05e0 }
            if (r2 == 0) goto L_0x061e
            r2 = 6
            X.7si r5 = new X.7si     // Catch:{ IOException -> 0x05f0, OutOfMemoryError -> 0x05e8, SecurityException -> 0x060b, 1X5 -> 0x05e0 }
            r5.<init>(r3, r0, r2)     // Catch:{ IOException -> 0x05f0, OutOfMemoryError -> 0x05e8, SecurityException -> 0x060b, 1X5 -> 0x05e0 }
            X.3ty r2 = r7.A00     // Catch:{ IOException -> 0x05f0, OutOfMemoryError -> 0x05e8, SecurityException -> 0x060b, 1X5 -> 0x05e0 }
            r2.A0A(r5)     // Catch:{ IOException -> 0x05f0, OutOfMemoryError -> 0x05e8, SecurityException -> 0x060b, 1X5 -> 0x05e0 }
            goto L_0x061e
        L_0x05e0:
            r2 = move-exception
            com.whatsapp.util.Log.e(r1, r2)
            r5 = 2131889286(0x7f120c86, float:1.9413231E38)
            goto L_0x0612
        L_0x05e8:
            r2 = move-exception
            com.whatsapp.util.Log.e(r1, r2)
            r5 = 2131889315(0x7f120ca3, float:1.941329E38)
            goto L_0x0612
        L_0x05f0:
            r2 = move-exception
            com.whatsapp.util.Log.e(r1, r2)
            java.lang.String r1 = r2.getMessage()
            if (r1 == 0) goto L_0x0603
            boolean r1 = X.C90504aG.A1Y(r2)
            r5 = 2131889309(0x7f120c9d, float:1.9413278E38)
            if (r1 != 0) goto L_0x0612
        L_0x0603:
            r5 = 2131894328(0x7f122038, float:1.9423458E38)
            X.17Y r3 = r0.A03
            r2 = 45
            goto L_0x0616
        L_0x060b:
            r2 = move-exception
            com.whatsapp.util.Log.e(r1, r2)
            r5 = 2131891585(0x7f121581, float:1.9417894E38)
        L_0x0612:
            X.17Y r3 = r0.A03
            r2 = 44
        L_0x0616:
            X.3wl r1 = new X.3wl
            r1.<init>((X.C107195Mx) r0, (int) r5, (int) r2)
            r3.A0H(r1)
        L_0x061e:
            r2 = 453122092(0x1b02182c, float:1.0761158E-22)
            java.lang.String r1 = "SEND_TASK_IMAGE_END"
            r9.markerPoint((int) r2, (int) r4, (java.lang.String) r1)
            goto L_0x0683
        L_0x0627:
            long r7 = r5 * r28
            r15 = 0
            int r11 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r11 != 0) goto L_0x06e1
            byte[] r25 = X.C25541Gs.A04(r10)
        L_0x0633:
            r23 = 0
        L_0x0635:
            boolean r7 = r2.A0K()
            if (r7 == 0) goto L_0x06d9
            r30 = 13
        L_0x063d:
            if (r17 == 0) goto L_0x06cf
            java.lang.Long r7 = r1.A0I
            java.lang.Long r7 = X.C90494aF.A0W(r7)
            r1.A0I = r7
        L_0x0647:
            java.lang.String r7 = r2.A0A()
            X.1YL r8 = r0.A0I
            java.lang.String r1 = r2.A0C()
            java.util.List r1 = r8.A00(r1)
            if (r20 == 0) goto L_0x068c
            X.17Y r5 = r0.A03
            r31 = 1
            X.746 r2 = new X.746
            r22 = r2
            r24 = r1
            r26 = r0
            r27 = r3
            r28 = r4
            r29 = r7
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r5.A0H(r2)
            android.net.Uri$Builder r10 = r3.buildUpon()
        L_0x0673:
            r14.A04(r10, r3)
            android.net.Uri r6 = r10.build()
            r3 = 453122092(0x1b02182c, float:1.0761158E-22)
            r2 = 1
            java.lang.String r1 = "SEND_TASK_VIDEO_END"
            r9.markerPoint((int) r3, (int) r2, (java.lang.String) r1)
        L_0x0683:
            if (r6 == 0) goto L_0x002d
            r1 = r18
            r1.add(r6)
            goto L_0x002d
        L_0x068c:
            android.net.Uri$Builder r10 = r3.buildUpon()
            if (r7 == 0) goto L_0x0697
            java.lang.String r11 = "caption"
            r10.appendQueryParameter(r11, r7)
        L_0x0697:
            if (r1 == 0) goto L_0x06a9
            java.lang.String r7 = r2.A0C()
            r8.A01(r7, r1)
            java.lang.String r2 = r2.A0C()
            java.lang.String r1 = "mentions"
            r10.appendQueryParameter(r1, r2)
        L_0x06a9:
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x06b3
            int r1 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x06c5
        L_0x06b3:
            java.lang.String r2 = java.lang.Long.toString(r5)
            java.lang.String r1 = "from"
            r10.appendQueryParameter(r1, r2)
            java.lang.String r2 = java.lang.Long.toString(r12)
            java.lang.String r1 = "to"
            r10.appendQueryParameter(r1, r2)
        L_0x06c5:
            java.lang.String r2 = r4.A0K
            if (r2 == 0) goto L_0x0673
            java.lang.String r1 = "doodle"
            r10.appendQueryParameter(r1, r2)
            goto L_0x0673
        L_0x06cf:
            java.lang.Long r7 = r1.A0C
            java.lang.Long r7 = X.C90494aF.A0W(r7)
            r1.A0C = r7
            goto L_0x0647
        L_0x06d9:
            X.1Gn r7 = r0.A0D
            int r30 = X.AnonymousClass6QO.A00(r2, r7)
            goto L_0x063d
        L_0x06e1:
            android.graphics.Bitmap r8 = X.C25541Gs.A02(r10, r7)
        L_0x06e5:
            r7 = 100
            byte[] r25 = X.C25541Gs.A03(r8, r7)
            goto L_0x0633
        L_0x06ed:
            java.lang.String r1 = "INFO_UPDATE"
            goto L_0x001a
        L_0x06f1:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x06f4:
            r5 = 453122092(0x1b02182c, float:1.0761158E-22)
            r4 = 1
            java.lang.String r1 = "TASK_CLEAN_UP_START"
            r9.markerPoint((int) r5, (int) r4, (java.lang.String) r1)
            java.util.HashSet r6 = r0.A0N
            java.util.Iterator r8 = r6.iterator()
        L_0x0703:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x073f
            java.lang.Object r2 = r8.next()
            X.6QO r2 = (X.AnonymousClass6QO) r2
            X.1Gn r1 = r0.A0D
            int r7 = X.AnonymousClass6QO.A00(r2, r1)
            boolean r1 = r2.A0K()
            if (r1 == 0) goto L_0x071d
            r7 = 13
        L_0x071d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r1 = r19
            java.lang.Object r2 = r1.get(r3)
            X.58u r2 = (X.C1042358u) r2
            if (r2 != 0) goto L_0x0736
            boolean r1 = r0.A0X
            X.58u r2 = r0.A01(r7, r1)
            r1 = r19
            r1.put(r3, r2)
        L_0x0736:
            java.lang.Long r1 = r2.A0E
            java.lang.Long r1 = X.C90464aC.A0S(r1)
            r2.A0E = r1
            goto L_0x0703
        L_0x073f:
            X.1GX r2 = r0.A0K
            java.util.Collection r1 = r0.A0M
            java.util.HashSet r1 = X.C90524aI.A0k(r1)
            X.AnonymousClass1GX.A0Y(r2, r1, r6)
            java.lang.String r1 = "TASK_CLEAN_UP_END"
            r9.markerPoint((int) r5, (int) r4, (java.lang.String) r1)
            java.util.Iterator r3 = X.C36391kE.A10(r19)
        L_0x0753:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0765
            java.lang.Object r2 = r3.next()
            X.0yK r2 = (X.C20890yK) r2
            X.0yW r1 = r0.A0A
            r1.Blw(r2)
            goto L_0x0753
        L_0x0765:
            java.lang.String r0 = "SEND_TASK_END"
            r9.markerPoint((int) r5, (int) r4, (java.lang.String) r0)
            r0 = 2
            r9.markerEnd(r5, r4, r0)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107195Mx.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        C161947nj r0 = (C161947nj) A07(C161947nj.class);
        if (r0 != null) {
            r0.Bal(arrayList);
        }
    }

    public C107195Mx(C19700wN r3, C20690y0 r4, AnonymousClass17Y r5, AnonymousClass1XY r6, AnonymousClass1X4 r7, C19970wo r8, C19630wG r9, C19420v0 r10, AnonymousClass3XT r11, C20810yC r12, C21010yW r13, C132366Tg r14, AnonymousClass1D5 r15, C25491Gn r16, C117485mL r17, AnonymousClass6BX r18, C161947nj r19, C158477gz r20, C105005Cx r21, C1271167a r22, AnonymousClass1YL r23, AnonymousClass3T1 r24, AnonymousClass1GX r25, Integer num, Long l, Long l2, Long l3, Collection collection, HashSet hashSet, HashSet hashSet2, List list, List list2, Map map, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(r19, true);
        this.A0a = r8;
        this.A06 = r9;
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r6;
        this.A0E = r17;
        this.A02 = r4;
        this.A0A = r13;
        this.A05 = r7;
        this.A0C = r15;
        this.A0I = r23;
        this.A0K = r25;
        this.A0D = r16;
        this.A0H = r22;
        this.A0G = r21;
        this.A0Q = list;
        this.A0P = list2;
        this.A0M = collection;
        this.A0B = r14;
        this.A0J = r24;
        this.A0Z = j;
        this.A0S = z;
        this.A00 = i;
        this.A0T = z2;
        this.A0F = r20;
        this.A0R = map;
        this.A0N = hashSet;
        this.A0X = z3;
        this.A0W = z4;
        this.A08 = r11;
        this.A0U = z5;
        this.A0V = z6;
        this.A0Y = j2;
        this.A09 = r12;
        this.A0L = num;
        this.A0O = hashSet2;
        this.A07 = r10;
        this.A0c = l;
        this.A0d = l2;
        this.A0e = l3;
        this.A0b = r18;
    }
}
