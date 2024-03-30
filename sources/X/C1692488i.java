package X;

import java.util.List;

/* renamed from: X.88i  reason: invalid class name and case insensitive filesystem */
public final class C1692488i extends C198429dX {
    public final AnonymousClass9ML A00;
    public final AnonymousClass9W3 A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Boolean A0C;
    public final Boolean A0D;
    public final Boolean A0E;
    public final Float A0F;
    public final Float A0G;
    public final Float A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final Integer A0K;
    public final Integer A0L;
    public final Integer A0M;
    public final Integer A0N;
    public final List A0O;
    public final List A0P;
    public final List A0Q;
    public final List A0R;
    public final List A0S;
    public final List A0T;
    public final List A0U;
    public final List A0V;
    public final List A0W;
    public final List A0X;
    public final List A0Y;
    public final List A0Z;
    public final List A0a;
    public final List A0b;
    public final List A0c;
    public final List A0d;

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0375, code lost:
        if (r7.contains(X.C36431kI.A13()) == false) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ad, code lost:
        if (r1 == 0) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02f8 A[LOOP:8: B:134:0x02f6->B:135:0x02f8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0451  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1692488i(android.hardware.Camera.Parameters r21) {
        /*
            r20 = this;
            r5 = r20
            r5.<init>()
            r11 = r21
            int r19 = r11.getMaxNumDetectedFaces()
            int r18 = r11.getMaxNumFocusAreas()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r5.A0J = r0
            int r17 = r11.getMaxNumMeteringAreas()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r5.A0K = r0
            boolean r8 = r11.isZoomSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r5.A0E = r0
            r4 = 0
            if (r8 == 0) goto L_0x0063
            int r0 = r11.getMaxZoom()
        L_0x0030:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r5.A0L = r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r5.A0N = r0
            boolean r0 = r11.isSmoothZoomSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A0D = r0
            if (r8 == 0) goto L_0x0065
            android.graphics.Rect r0 = X.C202799mg.A00
            java.util.List r6 = r11.getZoomRatios()
            int r3 = r6.size()
            java.util.ArrayList r2 = X.C36441kJ.A14(r3)
            r1 = 0
        L_0x0057:
            if (r1 >= r3) goto L_0x0066
            float r0 = X.C165577te.A01(r6, r1)
            X.C165587tf.A1Q(r2, r0)
            int r1 = r1 + 1
            goto L_0x0057
        L_0x0063:
            r0 = 0
            goto L_0x0030
        L_0x0065:
            r2 = 0
        L_0x0066:
            java.util.List r1 = X.C196539a1.A00(r2)
            r5.A0d = r1
            r3 = 0
            if (r8 == 0) goto L_0x0125
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0125
            float r0 = X.C165577te.A01(r1, r4)
        L_0x0079:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.A0H = r0
            if (r8 == 0) goto L_0x0122
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0122
            int r0 = r7.intValue()
            float r0 = X.C165577te.A01(r1, r0)
        L_0x008f:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.A0G = r0
            int r2 = r11.getMinExposureCompensation()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.A0M = r0
            int r1 = r11.getMaxExposureCompensation()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.A0I = r0
            r6 = 1
            if (r2 == 0) goto L_0x00af
            r0 = 1
            if (r1 != 0) goto L_0x00b0
        L_0x00af:
            r0 = 0
        L_0x00b0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A05 = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00c0
            float r3 = r11.getExposureCompensationStep()
        L_0x00c0:
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            r5.A0F = r0
            boolean r0 = r11.isAutoExposureLockSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A02 = r0
            boolean r0 = r11.isAutoWhiteBalanceLockSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A04 = r0
            boolean r0 = r11.isVideoSnapshotSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A0B = r0
            boolean r0 = r11.isVideoStabilizationSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A0C = r0
            java.util.List r0 = r11.getSupportedPreviewFrameRates()
            java.util.List r0 = X.C196539a1.A00(r0)
            r5.A0Y = r0
            android.graphics.Rect r0 = X.C202799mg.A00
            java.util.List r8 = r11.getSupportedFocusModes()
            if (r8 == 0) goto L_0x0128
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0128
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            int r3 = r8.size()
            r2 = 0
        L_0x010f:
            if (r2 >= r3) goto L_0x012b
            java.lang.String r0 = X.C36401kF.A0s(r8, r2)
            int r1 = X.C202729mX.A03(r0)
            r0 = -1
            if (r1 == r0) goto L_0x011f
            X.AnonymousClass000.A1F(r7, r1)
        L_0x011f:
            int r2 = r2 + 1
            goto L_0x010f
        L_0x0122:
            r0 = 0
            goto L_0x008f
        L_0x0125:
            r0 = 0
            goto L_0x0079
        L_0x0128:
            java.util.List r8 = X.C196539a1.A00
            goto L_0x012f
        L_0x012b:
            java.util.List r8 = X.C196539a1.A00(r7)
        L_0x012f:
            r5.A0S = r8
            java.util.List r9 = r11.getSupportedAntibanding()
            if (r9 == 0) goto L_0x0159
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0159
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            int r3 = r9.size()
            r2 = 0
        L_0x0146:
            if (r2 >= r3) goto L_0x015c
            java.lang.String r0 = X.C36401kF.A0s(r9, r2)
            int r1 = X.C202729mX.A00(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0156
            X.AnonymousClass000.A1F(r7, r1)
        L_0x0156:
            int r2 = r2 + 1
            goto L_0x0146
        L_0x0159:
            java.util.List r0 = X.C196539a1.A00
            goto L_0x0160
        L_0x015c:
            java.util.List r0 = X.C196539a1.A00(r7)
        L_0x0160:
            r5.A0P = r0
            java.util.List r9 = r11.getSupportedColorEffects()
            if (r9 == 0) goto L_0x018a
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x018a
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            int r3 = r9.size()
            r2 = 0
        L_0x0177:
            if (r2 >= r3) goto L_0x018d
            java.lang.String r0 = X.C36401kF.A0s(r9, r2)
            int r1 = X.C202729mX.A01(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0187
            X.AnonymousClass000.A1F(r7, r1)
        L_0x0187:
            int r2 = r2 + 1
            goto L_0x0177
        L_0x018a:
            java.util.List r0 = X.C196539a1.A00
            goto L_0x0191
        L_0x018d:
            java.util.List r0 = X.C196539a1.A00(r7)
        L_0x0191:
            r5.A0Q = r0
            java.util.List r9 = r11.getSupportedFlashModes()
            if (r9 == 0) goto L_0x01bb
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x01bb
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            int r3 = r9.size()
            r2 = 0
        L_0x01a8:
            if (r2 >= r3) goto L_0x01be
            java.lang.String r0 = X.C36401kF.A0s(r9, r2)
            int r1 = X.C202729mX.A02(r0)
            r0 = -1
            if (r1 == r0) goto L_0x01b8
            X.AnonymousClass000.A1F(r7, r1)
        L_0x01b8:
            int r2 = r2 + 1
            goto L_0x01a8
        L_0x01bb:
            java.util.List r9 = X.C196539a1.A00
            goto L_0x01c2
        L_0x01be:
            java.util.List r9 = X.C196539a1.A00(r7)
        L_0x01c2:
            r5.A0R = r9
            java.util.List r0 = r11.getSupportedPictureFormats()
            java.util.List r0 = X.C196539a1.A00(r0)
            r5.A0U = r0
            java.lang.String r0 = "preview-fps-range-values"
            java.lang.String r13 = r11.get(r0)
            r16 = 0
            if (r13 == 0) goto L_0x0249
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0249
            r1 = 0
            char r0 = r13.charAt(r4)
            r12 = 40
            if (r0 != r12) goto L_0x0249
            int r0 = r13.length()
            int r0 = r0 + -1
            char r0 = r13.charAt(r0)
            r10 = 41
            if (r0 != r10) goto L_0x0249
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
        L_0x01f9:
            int r3 = r13.indexOf(r10, r1)
            int r0 = r3 + 1
            java.lang.String r14 = r13.substring(r1, r0)
            java.lang.String r2 = "Invalid range list string="
            if (r14 == 0) goto L_0x023f
            char r0 = r14.charAt(r4)
            if (r0 != r12) goto L_0x023f
            int r0 = r14.length()
            int r0 = r0 - r6
            char r0 = r14.charAt(r0)
            if (r0 != r10) goto L_0x023f
            int[] r1 = X.C36441kJ.A1O()
            r0 = 44
            int r15 = r14.indexOf(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0235 }
            int r0 = X.C165587tf.A07(r14, r6, r15)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0235 }
            r1[r4] = r0     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0235 }
            int r15 = r15 + 1
            int r0 = r14.indexOf(r10, r15)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0235 }
            int r0 = X.C165587tf.A07(r14, r15, r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0235 }
            r1[r6] = r0     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0235 }
            goto L_0x0259
        L_0x0235:
            java.lang.String r1 = "ParametersHelper"
            java.lang.String r0 = X.C36321k7.A0D(r2, r14)
            android.util.Log.e(r1, r0)
            goto L_0x025c
        L_0x023f:
            java.lang.String r1 = "ParametersHelper"
            java.lang.String r0 = X.C36321k7.A0D(r2, r14)
            android.util.Log.e(r1, r0)
            goto L_0x025c
        L_0x0249:
            java.lang.String r2 = "ParametersHelper"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid range list string="
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r13, r1)
            android.util.Log.e(r2, r0)
            goto L_0x026b
        L_0x0259:
            r7.add(r1)
        L_0x025c:
            int r1 = r13.indexOf(r12, r3)
            r0 = -1
            if (r1 != r0) goto L_0x01f9
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x026b
            r16 = r7
        L_0x026b:
            java.util.List r0 = X.C196539a1.A00(r16)
            r5.A0X = r0
            java.util.List r10 = r11.getSupportedSceneModes()
            if (r10 == 0) goto L_0x0299
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0299
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            int r3 = r10.size()
            r2 = 0
        L_0x0286:
            if (r2 >= r3) goto L_0x029c
            java.lang.String r0 = X.C36401kF.A0s(r10, r2)
            int r1 = X.C202729mX.A04(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0296
            X.AnonymousClass000.A1F(r7, r1)
        L_0x0296:
            int r2 = r2 + 1
            goto L_0x0286
        L_0x0299:
            java.util.List r7 = X.C196539a1.A00
            goto L_0x02a0
        L_0x029c:
            java.util.List r7 = X.C196539a1.A00(r7)
        L_0x02a0:
            r5.A0a = r7
            java.util.List r0 = r11.getSupportedPreviewFormats()
            java.util.List r0 = X.C196539a1.A00(r0)
            r5.A0W = r0
            java.util.List r12 = r11.getSupportedWhiteBalance()
            if (r12 == 0) goto L_0x02d4
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x02d4
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            int r3 = r12.size()
            r2 = 0
        L_0x02c1:
            if (r2 >= r3) goto L_0x02d7
            java.lang.String r0 = X.C36401kF.A0s(r12, r2)
            int r1 = X.C202729mX.A05(r0)
            r0 = -1
            if (r1 == r0) goto L_0x02d1
            X.AnonymousClass000.A1F(r10, r1)
        L_0x02d1:
            int r2 = r2 + 1
            goto L_0x02c1
        L_0x02d4:
            java.util.List r0 = X.C196539a1.A00
            goto L_0x02db
        L_0x02d7:
            java.util.List r0 = X.C196539a1.A00(r10)
        L_0x02db:
            r5.A0c = r0
            java.util.List r3 = r11.getSupportedJpegThumbnailSizes()
            if (r3 != 0) goto L_0x02fe
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x02e7:
            r5.A0T = r0
            java.util.List r3 = r11.getSupportedPictureSizes()
            int r2 = r3.size()
            java.util.ArrayList r1 = X.C36441kJ.A14(r2)
            r0 = 0
        L_0x02f6:
            if (r0 >= r2) goto L_0x0314
            X.AnonymousClass9W3.A01(r1, r3, r0)
            int r0 = r0 + 1
            goto L_0x02f6
        L_0x02fe:
            int r2 = r3.size()
            java.util.ArrayList r1 = X.C36441kJ.A14(r2)
            r0 = 0
        L_0x0307:
            if (r0 >= r2) goto L_0x030f
            X.AnonymousClass9W3.A01(r1, r3, r0)
            int r0 = r0 + 1
            goto L_0x0307
        L_0x030f:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L_0x02e7
        L_0x0314:
            java.util.HashMap r0 = X.C197119bA.A00
            java.util.List r0 = X.C197119bA.A01(r0, r1)
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            r5.A0V = r3
            java.util.List r10 = r11.getSupportedPreviewSizes()
            if (r10 != 0) goto L_0x0400
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x032a:
            r5.A0Z = r0
            java.util.List r10 = r11.getSupportedVideoSizes()
            if (r10 != 0) goto L_0x03e3
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x0336:
            r5.A0b = r0
            java.lang.Integer r0 = X.C36371kC.A0n()
            boolean r0 = r9.contains(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A0A = r0
            boolean r0 = X.C165607th.A1X(r8, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A03 = r0
            boolean r0 = X.AnonymousClass000.A1R(r17)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A09 = r0
            boolean r0 = X.AnonymousClass000.A1R(r18)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A08 = r0
            java.util.HashSet r0 = X.C197119bA.A03
            boolean r0 = X.C200349hC.A02(r0)
            if (r0 != 0) goto L_0x0377
            java.lang.Integer r0 = X.C36431kI.A13()
            boolean r1 = r7.contains(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0378
        L_0x0377:
            r0 = 0
        L_0x0378:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A07 = r0
            if (r19 <= 0) goto L_0x0381
            r4 = 1
        L_0x0381:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r5.A06 = r0
            java.lang.String r0 = "preferred-preview-size-for-video"
            java.lang.String r1 = r11.get(r0)
            if (r1 == 0) goto L_0x0417
            java.lang.String r0 = "null"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0417
            java.lang.String r0 = "x"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0417
            java.util.ArrayList r8 = X.C202799mg.A02(r1)
            int r7 = r8.size()
            r4 = 0
        L_0x03a8:
            if (r4 >= r7) goto L_0x0417
            java.lang.Object r9 = r8.get(r4)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x03e0
            r0 = 120(0x78, float:1.68E-43)
            int r1 = r9.indexOf(r0)
            r0 = -1
            java.lang.String r2 = "Invalid size parameter string="
            if (r1 == r0) goto L_0x03cd
            r0 = 0
            java.lang.String r0 = r9.substring(r0, r1)     // Catch:{ NumberFormatException -> 0x03d7 }
            java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x03d7 }
            java.lang.String r0 = X.C165607th.A0o(r1, r9)     // Catch:{ NumberFormatException -> 0x03d7 }
            java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x03d7 }
            goto L_0x0417
        L_0x03cd:
            java.lang.String r1 = "ParametersHelper"
            java.lang.String r0 = X.C36321k7.A0D(r2, r9)
            android.util.Log.e(r1, r0)
            goto L_0x03e0
        L_0x03d7:
            java.lang.String r1 = "ParametersHelper"
            java.lang.String r0 = X.C36321k7.A0D(r2, r9)
            android.util.Log.e(r1, r0)
        L_0x03e0:
            int r4 = r4 + 1
            goto L_0x03a8
        L_0x03e3:
            int r2 = r10.size()
            java.util.ArrayList r1 = X.C36441kJ.A14(r2)
            r0 = 0
        L_0x03ec:
            if (r0 >= r2) goto L_0x03f4
            X.AnonymousClass9W3.A01(r1, r10, r0)
            int r0 = r0 + 1
            goto L_0x03ec
        L_0x03f4:
            java.util.HashMap r0 = X.C197119bA.A01
            java.util.List r0 = X.C197119bA.A01(r0, r1)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            goto L_0x0336
        L_0x0400:
            int r2 = r10.size()
            java.util.ArrayList r1 = X.C36441kJ.A14(r2)
            r0 = 0
        L_0x0409:
            if (r0 >= r2) goto L_0x0411
            X.AnonymousClass9W3.A01(r1, r10, r0)
            int r0 = r0 + 1
            goto L_0x0409
        L_0x0411:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L_0x032a
        L_0x0417:
            java.lang.String r0 = "iso-values"
            java.lang.String r2 = r11.get(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r1 = "iso"
            if (r0 == 0) goto L_0x0472
            java.lang.String r0 = "iso-mode-values"
            java.lang.String r2 = r11.get(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0472
            java.lang.String r0 = "iso-speed-values"
            java.lang.String r1 = r11.get(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0461
            java.lang.String r0 = "iso-speed"
        L_0x043f:
            X.9ML r0 = X.C202799mg.A00(r11, r0, r1)
        L_0x0443:
            r5.A00 = r0
            r7 = 0
            X.9W3 r4 = new X.9W3
            r4.<init>(r7, r7)
        L_0x044b:
            int r0 = r3.size()
            if (r7 >= r0) goto L_0x0477
            java.lang.Object r2 = r3.get(r7)
            X.9W3 r2 = (X.AnonymousClass9W3) r2
            int r1 = r2.A00
            int r0 = r4.A00
            if (r1 <= r0) goto L_0x045e
            r4 = r2
        L_0x045e:
            int r7 = r7 + 1
            goto L_0x044b
        L_0x0461:
            java.lang.String r0 = "nv-picture-iso-values"
            java.lang.String r1 = r11.get(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0470
            java.lang.String r0 = "nv-picture-iso"
            goto L_0x043f
        L_0x0470:
            r0 = 0
            goto L_0x0443
        L_0x0472:
            X.9ML r0 = X.C202799mg.A00(r11, r1, r2)
            goto L_0x0443
        L_0x0477:
            r5.A01 = r4
            float r4 = r11.getFocalLength()
            float r0 = r11.getHorizontalViewAngle()
            double r7 = (double) r0
            r9 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r7 = r7 * r9
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r7 = r7 / r2
            float r0 = r11.getVerticalViewAngle()
            double r0 = (double) r0
            double r0 = r0 * r9
            double r0 = r0 / r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r2
            double r2 = (double) r4
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 / r9
            double r0 = java.lang.Math.tan(r0)
            double r0 = r0 * r2
            double r0 = java.lang.Math.abs(r0)
            float r4 = (float) r0
            double r7 = r7 / r9
            double r0 = java.lang.Math.tan(r7)
            double r2 = r2 * r0
            double r0 = java.lang.Math.abs(r2)
            float r3 = (float) r0
            r0 = 2
            java.lang.Float[] r2 = new java.lang.Float[r0]
            java.lang.Float r1 = java.lang.Float.valueOf(r4)
            r0 = 0
            r2[r0] = r1
            X.AnonymousClass000.A1I(r2, r3, r6)
            java.util.List r0 = java.util.Arrays.asList(r2)
            r5.A0O = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1692488i.<init>(android.hardware.Camera$Parameters):void");
    }
}
