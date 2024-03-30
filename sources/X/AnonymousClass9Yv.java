package X;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import java.util.Objects;

/* renamed from: X.9Yv  reason: invalid class name */
public abstract class AnonymousClass9Yv {
    public static int A00(CameraManager cameraManager, CaptureRequest.Builder builder, C1692888m r7, C198429dX r8, String str, int i) {
        CaptureRequest.Key key;
        if (r7 == null || r8 == null) {
            throw AnonymousClass001.A09("Trying to update builder after camera closed.");
        }
        int i2 = 0;
        if (i != 0) {
            int A02 = C201049ih.A02(C201049ih.A0x, r7);
            if (A02 == -1) {
                return A02;
            }
            if (A02 == 1 && C198429dX.A04(C198429dX.A0A, r8)) {
                i2 = 1;
            }
            key = CaptureRequest.CONTROL_AWB_MODE;
        } else {
            int A022 = C201049ih.A02(C201049ih.A0C, r7);
            if (A022 == 4) {
                if (C198429dX.A04(C198429dX.A08, r8)) {
                    i2 = 4;
                }
            } else if (A022 == 3) {
                if (C198429dX.A04(C198429dX.A09, r8)) {
                    i2 = 3;
                }
            } else if (A022 == 1) {
                if (C198429dX.A04(C198429dX.A07, r8)) {
                    i2 = 1;
                }
            } else if (A022 == 0 && C198429dX.A04(C198429dX.A0I, r8)) {
                Number number = (Number) C201049ih.A04(C201049ih.A0c, r7);
                float floatValue = number.floatValue();
                CameraCharacteristics.Key key2 = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
                if (str != null) {
                    Object obj = C196509Zy.A00(cameraManager, str).get(key2);
                    Objects.requireNonNull(obj);
                    if (floatValue >= C36441kJ.A03(obj)) {
                        builder.set(CaptureRequest.LENS_FOCUS_DISTANCE, number);
                    }
                } else {
                    throw new C21829Ab6("Camera ID must be provided to check supported modes.");
                }
            }
            key = CaptureRequest.CONTROL_AF_MODE;
        }
        C165577te.A0v(builder, key, i2);
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01f3, code lost:
        X.C202389lj.A03(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x021f, code lost:
        r2 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0229, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x027c, code lost:
        r8.set(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x027f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        if (r1 != 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011e, code lost:
        if (X.C201049ih.A02(r1, r9) != 3) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0141, code lost:
        if (r0 != false) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x017b, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        r8.set(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x018d, code lost:
        r4 = r9.A08(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01d7, code lost:
        if (X.C201049ih.A02(r1, r9) != 3) goto L_0x01d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.hardware.camera2.CaptureRequest.Builder r8, X.C1692888m r9, X.C198429dX r10, int r11) {
        /*
            if (r9 == 0) goto L_0x028c
            if (r10 == 0) goto L_0x028c
            r4 = 3
            r5 = 2
            r7 = 1
            r6 = 0
            switch(r11) {
                case 0: goto L_0x022e;
                case 1: goto L_0x0181;
                case 2: goto L_0x01c3;
                case 3: goto L_0x0040;
                case 4: goto L_0x0169;
                case 5: goto L_0x01f7;
                case 6: goto L_0x0131;
                case 7: goto L_0x010a;
                case 8: goto L_0x00f8;
                case 9: goto L_0x0032;
                case 10: goto L_0x00e1;
                case 11: goto L_0x00b8;
                case 12: goto L_0x00aa;
                case 13: goto L_0x0089;
                case 14: goto L_0x0144;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.9Cj r0 = X.C201049ih.A0m
            java.lang.Object r1 = r9.A08(r0)
            int[] r1 = (int[]) r1
            X.9Ci r0 = X.C198429dX.A0y
            java.util.List r0 = X.C198429dX.A03(r0, r10)
            boolean r0 = X.C202989n4.A03(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.Objects.requireNonNull(r1)
            X.9Ci r0 = X.C198429dX.A0g
            boolean r0 = X.C198429dX.A04(r0, r10)
            android.util.Range r2 = X.C165607th.A0J(r1, r0)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
        L_0x002e:
            r8.set(r0, r2)
        L_0x0031:
            return
        L_0x0032:
            java.util.HashSet r0 = X.C197019az.A00
            boolean r0 = X.C200349hC.A02(r0)
            if (r0 != 0) goto L_0x0031
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            X.9Cj r0 = X.C201049ih.A07
            goto L_0x018d
        L_0x0040:
            java.util.HashSet r0 = X.C197019az.A00
            boolean r0 = X.C200349hC.A02(r0)
            r3 = 22
            if (r0 != 0) goto L_0x0193
            X.9Cj r0 = X.C201049ih.A0r
            java.lang.Object r2 = X.C201049ih.A04(r0, r9)
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r2.intValue()
            r0 = 17
            if (r1 != r0) goto L_0x0078
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x007a
            X.9Cj r0 = X.C201049ih.A0V
            boolean r0 = X.C201049ih.A07(r0, r9)
            if (r0 == 0) goto L_0x007a
            X.9Ci r0 = X.C198429dX.A0G
            boolean r0 = X.C198429dX.A04(r0, r10)
            if (r0 == 0) goto L_0x007a
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            r0 = 18
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L_0x027c
        L_0x0078:
            if (r1 == 0) goto L_0x0085
        L_0x007a:
            X.9Ci r0 = X.C198429dX.A13
            boolean r0 = X.C198429dX.A05(r0, r10, r2)
            if (r0 == 0) goto L_0x0085
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            goto L_0x002e
        L_0x0085:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            goto L_0x017b
        L_0x0089:
            X.9Ci r0 = X.C198429dX.A06
            boolean r0 = X.C198429dX.A04(r0, r10)
            if (r0 == 0) goto L_0x0031
            X.9Cj r0 = X.C201049ih.A04
            int r0 = X.C201049ih.A02(r0, r9)
            if (r0 != 0) goto L_0x0031
            X.9Cj r0 = X.C201049ih.A05
            java.lang.Object r0 = X.C201049ih.A04(r0, r9)
            int[] r0 = (int[]) r0
            android.hardware.camera2.params.ColorSpaceTransform r4 = new android.hardware.camera2.params.ColorSpaceTransform
            r4.<init>(r0)
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_TRANSFORM
            goto L_0x027c
        L_0x00aa:
            X.9Ci r0 = X.C198429dX.A06
            boolean r0 = X.C198429dX.A04(r0, r10)
            if (r0 == 0) goto L_0x0031
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_MODE
            X.9Cj r0 = X.C201049ih.A04
            goto L_0x018d
        L_0x00b8:
            X.9Ci r0 = X.C198429dX.A06
            boolean r0 = X.C198429dX.A04(r0, r10)
            if (r0 == 0) goto L_0x0031
            X.9Cj r0 = X.C201049ih.A04
            int r0 = X.C201049ih.A02(r0, r9)
            if (r0 != 0) goto L_0x0031
            X.9Cj r0 = X.C201049ih.A03
            java.lang.Object r0 = X.C201049ih.A04(r0, r9)
            float[] r0 = (float[]) r0
            r3 = r0[r6]
            r2 = r0[r7]
            r1 = r0[r5]
            r0 = r0[r4]
            android.hardware.camera2.params.RggbChannelVector r4 = new android.hardware.camera2.params.RggbChannelVector
            r4.<init>(r3, r2, r1, r0)
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_GAINS
            goto L_0x027c
        L_0x00e1:
            X.9Ci r0 = X.C198429dX.A0T
            boolean r0 = X.C198429dX.A04(r0, r10)
            if (r0 == 0) goto L_0x0031
            X.9Cj r1 = X.C201049ih.A07
            int r0 = X.C201049ih.A02(r1, r9)
            if (r0 == 0) goto L_0x01b4
            int r0 = X.C201049ih.A02(r1, r9)
            if (r0 == r4) goto L_0x01b4
            return
        L_0x00f8:
            X.9Cj r0 = X.C201049ih.A00
            java.lang.Object r2 = X.C201049ih.A04(r0, r9)
            X.9Ci r0 = X.C198429dX.A0h
            boolean r0 = X.C198429dX.A05(r0, r10, r2)
            if (r0 == 0) goto L_0x0031
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_ANTIBANDING_MODE
            goto L_0x002e
        L_0x010a:
            X.9Cj r0 = X.C201049ih.A0N
            boolean r0 = X.C201049ih.A07(r0, r9)
            if (r0 == 0) goto L_0x012f
            X.9Cj r1 = X.C201049ih.A07
            int r0 = X.C201049ih.A02(r1, r9)
            if (r0 == 0) goto L_0x012f
            int r0 = X.C201049ih.A02(r1, r9)
            if (r0 == r4) goto L_0x012f
        L_0x0120:
            X.9Ci r0 = X.C198429dX.A0H
            boolean r0 = X.C198429dX.A04(r0, r10)
            if (r0 == 0) goto L_0x01be
            if (r7 != 0) goto L_0x01be
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.SENSOR_SENSITIVITY
            X.9Cj r0 = X.C201049ih.A0K
            goto L_0x018d
        L_0x012f:
            r7 = 0
            goto L_0x0120
        L_0x0131:
            X.9Ci r0 = X.C198429dX.A0L
            boolean r0 = X.C198429dX.A04(r0, r10)
            if (r0 == 0) goto L_0x0031
            X.9Cj r0 = X.C201049ih.A0W
            boolean r0 = X.C201049ih.A07(r0, r9)
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE
            if (r0 == 0) goto L_0x0229
            goto L_0x017b
        L_0x0144:
            X.9Ci r0 = X.C198429dX.A01
            boolean r0 = X.C198429dX.A04(r0, r10)
            if (r0 == 0) goto L_0x0157
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK
            X.9Cj r0 = X.C201049ih.A0O
            java.lang.Object r0 = r9.A08(r0)
            r8.set(r1, r0)
        L_0x0157:
            X.9Ci r0 = X.C198429dX.A04
            boolean r0 = X.C198429dX.A04(r0, r10)
            if (r0 == 0) goto L_0x0031
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_LOCK
            X.9Cj r0 = X.C201049ih.A0Q
            java.lang.Object r4 = r9.A08(r0)
            goto L_0x027c
        L_0x0169:
            X.9Ci r0 = X.C198429dX.A0V
            boolean r0 = X.C198429dX.A04(r0, r10)
            if (r0 == 0) goto L_0x0031
            X.9Cj r0 = X.C201049ih.A0Y
            boolean r0 = X.C201049ih.A07(r0, r9)
            if (r0 == 0) goto L_0x021f
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
        L_0x017b:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            goto L_0x027c
        L_0x0181:
            X.9Ci r0 = X.C198429dX.A0C
            boolean r0 = X.C198429dX.A04(r0, r10)
            if (r0 == 0) goto L_0x0031
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION
            X.9Cj r0 = X.C201049ih.A08
        L_0x018d:
            java.lang.Object r4 = r9.A08(r0)
            goto L_0x027c
        L_0x0193:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x0222
            X.9Cj r1 = X.C201049ih.A0r
            int r0 = X.C201049ih.A02(r1, r9)
            if (r0 == 0) goto L_0x0222
            X.9Ci r0 = X.C198429dX.A0G
            boolean r0 = X.C198429dX.A04(r0, r10)
            if (r0 == 0) goto L_0x0222
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            X.C165577te.A0v(r8, r0, r5)
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            java.lang.Object r4 = r9.A08(r1)
            goto L_0x027c
        L_0x01b4:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.LENS_APERTURE
            X.9Cj r0 = X.C201049ih.A01
            java.lang.Object r4 = r9.A08(r0)
            goto L_0x027c
        L_0x01be:
            java.lang.String r1 = "CaptureRequestHelper"
            java.lang.String r0 = "ISO_RANGE not supported or AE on"
            goto L_0x01f3
        L_0x01c3:
            X.9Cj r0 = X.C201049ih.A0N
            boolean r0 = X.C201049ih.A07(r0, r9)
            if (r0 == 0) goto L_0x01ed
            X.9Cj r1 = X.C201049ih.A07
            int r0 = X.C201049ih.A02(r1, r9)
            if (r0 == 0) goto L_0x01ed
            int r0 = X.C201049ih.A02(r1, r9)
            if (r0 == r4) goto L_0x01ed
        L_0x01d9:
            X.9Ci r0 = X.C198429dX.A0D
            boolean r0 = X.C198429dX.A04(r0, r10)
            if (r0 == 0) goto L_0x01ef
            if (r7 != 0) goto L_0x01ef
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.SENSOR_EXPOSURE_TIME
            X.9Cj r0 = X.C201049ih.A09
            java.lang.Object r4 = r9.A08(r0)
            goto L_0x027c
        L_0x01ed:
            r7 = 0
            goto L_0x01d9
        L_0x01ef:
            java.lang.String r1 = "CaptureRequestHelper"
            java.lang.String r0 = "EXPOSURE_TIME not supported or AE on"
        L_0x01f3:
            X.C202389lj.A03(r1, r0)
            return
        L_0x01f7:
            X.9Cj r0 = X.C201049ih.A0X
            boolean r0 = X.C201049ih.A07(r0, r9)
            if (r0 == 0) goto L_0x021f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L_0x0214
            X.9Ci r0 = X.C198429dX.A0M
            boolean r0 = X.C198429dX.A04(r0, r10)
            if (r0 == 0) goto L_0x0214
        L_0x020d:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            goto L_0x027c
        L_0x0214:
            X.9Ci r0 = X.C198429dX.A0N
            boolean r0 = X.C198429dX.A04(r0, r10)
            boolean r5 = X.AnonymousClass000.A1P(r0)
            goto L_0x020d
        L_0x021f:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            goto L_0x0229
        L_0x0222:
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            X.C165577te.A0v(r8, r0, r7)
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
        L_0x0229:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            goto L_0x027c
        L_0x022e:
            X.9Cj r0 = X.C201049ih.A0N
            boolean r3 = X.C201049ih.A07(r0, r9)
            X.9Cj r0 = X.C201049ih.A0A
            java.lang.Object r2 = X.C201049ih.A04(r0, r9)
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r2.intValue()
            X.9Ci r0 = X.C198429dX.A0p
            boolean r0 = X.C198429dX.A05(r0, r10, r2)
            if (r0 == 0) goto L_0x0259
            if (r1 == 0) goto L_0x0285
            if (r1 == r7) goto L_0x026f
            if (r1 == r5) goto L_0x0265
            if (r1 != r4) goto L_0x0259
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
        L_0x0256:
            r8.set(r1, r0)
        L_0x0259:
            r4 = r3
        L_0x025a:
            if (r3 != 0) goto L_0x0276
            X.9Ci r0 = X.C198429dX.A00
            boolean r0 = X.C198429dX.A04(r0, r10)
            if (r0 != 0) goto L_0x0276
            return
        L_0x0265:
            int r4 = X.C165587tf.A03(r3)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            X.C165577te.A0v(r8, r0, r6)
            goto L_0x025a
        L_0x026f:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            if (r3 == 0) goto L_0x0280
            X.C165577te.A0v(r8, r1, r6)
        L_0x0276:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x027c:
            r8.set(r2, r4)
            return
        L_0x0280:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            goto L_0x0256
        L_0x0285:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            goto L_0x0256
        L_0x028c:
            java.lang.String r0 = "Trying to update builder after camera closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Yv.A01(android.hardware.camera2.CaptureRequest$Builder, X.88m, X.9dX, int):void");
    }
}
