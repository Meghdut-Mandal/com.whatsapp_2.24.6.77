package X;

import java.util.concurrent.Callable;

public class B8Y implements Callable {
    public int A00;
    public Object A01;
    public final int A02;

    public B8Y(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011d, code lost:
        if (r8 >= r1) goto L_0x011f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r14 = this;
            int r0 = r14.A02
            switch(r0) {
                case 0: goto L_0x01b0;
                case 1: goto L_0x0010;
                case 2: goto L_0x0140;
                case 3: goto L_0x0124;
                case 4: goto L_0x003e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r14.A01
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r1 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r1
            int r0 = r14.A00
            java.lang.Integer r4 = r1.m73lambda$maybeUpdateCameraProcessorOrientation$2$comwhatsappvoipcallingcameraVoipPhysicalCamera(r0)
        L_0x000f:
            return r4
        L_0x0010:
            java.lang.Object r1 = r14.A01
            X.A29 r1 = (X.A29) r1
            int r0 = r14.A00
            X.C202389lj.A00()
            android.hardware.Camera r4 = android.hardware.Camera.open(r0)
            X.C202389lj.A00()
            X.9PG r3 = r1.A0c
            if (r3 == 0) goto L_0x000f
            X.9jb r0 = r1.A0R
            X.9gr r1 = r0.A02
            monitor-enter(r1)
            java.lang.String r2 = r0.A01     // Catch:{ all -> 0x01e3 }
            monitor-exit(r1)     // Catch:{ all -> 0x01e3 }
            java.util.concurrent.CopyOnWriteArraySet r0 = r3.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x000f
            r1 = 5
            X.751 r0 = new X.751
            r0.<init>(r1, r2, r3)
            X.C202399lk.A00(r0)
            return r4
        L_0x003e:
            java.lang.Object r6 = r14.A01
            X.A28 r6 = (X.A28) r6
            int r3 = r14.A00
            boolean r0 = r6.isConnected()
            if (r0 == 0) goto L_0x0121
            X.9n4 r5 = r6.A0R
            X.9VN r1 = r5.A0J
            java.lang.String r0 = "Can only check if the prepared on the Optic thread"
            r1.A01(r0)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0121
            X.9mL r7 = r6.A0A
            if (r7 == 0) goto L_0x0121
            X.9dX r1 = r7.A08
            X.88m r0 = r7.A06
            X.88n r10 = r7.A07
            android.graphics.Rect r4 = r7.A05
            android.graphics.Rect r2 = r7.A04
            java.util.List r9 = r7.A0A
            if (r0 == 0) goto L_0x0077
            if (r10 == 0) goto L_0x0077
            if (r1 == 0) goto L_0x0077
            if (r9 == 0) goto L_0x0077
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x0082
            java.util.List r0 = r7.A09
            if (r0 != 0) goto L_0x0082
        L_0x0077:
            X.9mL r0 = r6.A0A
            int r0 = r0.A05()
        L_0x007d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x0082:
            if (r2 == 0) goto L_0x0077
            if (r4 == 0) goto L_0x0077
            int r0 = r7.A03
            int r1 = java.lang.Math.max(r3, r0)
            int r0 = r7.A02
            int r3 = java.lang.Math.min(r1, r0)
            int r0 = r7.A05()
            if (r3 == r0) goto L_0x0077
            float r11 = (float) r3
            int r0 = r7.A03
            float r12 = (float) r0
            int r0 = r7.A02
            float r8 = (float) r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r12 = X.C202639mL.A00(r11, r12, r8, r1, r0)
            float r8 = r7.A04()
            float r1 = r7.A01
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0116
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0116
            r13 = 1
        L_0x00b6:
            int r0 = r7.A03
            float r12 = (float) r0
            int r0 = r7.A02
            float r8 = (float) r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r8 = X.C202639mL.A00(r11, r12, r8, r1, r0)
            X.9Cj r1 = X.C201049ih.A0z
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.C1692988n.A00(r10, r1, r0)
            X.9Cj r1 = X.C201049ih.A0s
            java.lang.Float r0 = java.lang.Float.valueOf(r8)
            X.C1692988n.A00(r10, r1, r0)
            boolean r0 = r7.A0B
            if (r0 != 0) goto L_0x00e4
            float r1 = X.C165577te.A01(r9, r3)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            X.C202639mL.A02(r4, r2, r1)
        L_0x00e4:
            android.os.Handler r2 = r7.A0E
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0 = 1
            android.os.Message r0 = r2.obtainMessage(r0, r3, r0, r1)
            r2.sendMessage(r0)
            X.9mL r1 = r6.A0A
            float r0 = r1.A04()
            float r4 = X.C202639mL.A01(r1, r0)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r0
            X.9mL r1 = r6.A0A
            android.graphics.Rect r3 = r1.A04
            android.hardware.camera2.params.MeteringRectangle[] r0 = r1.A0D
            android.hardware.camera2.params.MeteringRectangle[] r2 = X.C202639mL.A03(r1, r0)
            X.9mL r1 = r6.A0A
            android.hardware.camera2.params.MeteringRectangle[] r0 = r1.A0C
            android.hardware.camera2.params.MeteringRectangle[] r0 = X.C202639mL.A03(r1, r0)
            r5.A07(r3, r2, r0, r4)
            goto L_0x0077
        L_0x0116:
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x011f
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r13 = 2
            if (r0 < 0) goto L_0x00b6
        L_0x011f:
            r13 = 0
            goto L_0x00b6
        L_0x0121:
            r0 = 0
            goto L_0x007d
        L_0x0124:
            java.lang.Object r2 = r14.A01
            X.A29 r2 = (X.A29) r2
            int r1 = r14.A00
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x013e
            boolean r0 = r2.A0f
            if (r0 == 0) goto L_0x013e
            X.9pc r0 = r2.A0N
            r0.A00(r1)
        L_0x0139:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            return r4
        L_0x013e:
            r1 = 0
            goto L_0x0139
        L_0x0140:
            java.lang.Object r4 = r14.A01
            X.A29 r4 = (X.A29) r4
            int r1 = r14.A00
            java.lang.String r0 = "Can not update preview display rotation"
            X.A29.A0A(r4, r0)
            r4.A02 = r1
            android.hardware.Camera r0 = r4.A0a
            java.util.Objects.requireNonNull(r0)
            X.B3b r0 = r4.A0b
            android.hardware.Camera r1 = r4.A0a
            if (r0 != 0) goto L_0x018e
            int r0 = r4.A02
            int r0 = X.A29.A00(r4, r0)
            r1.setDisplayOrientation(r0)
        L_0x0161:
            java.lang.String r0 = "Cannot get camera settings"
            X.A29.A0A(r4, r0)
            X.9WX r1 = r4.A0O
            int r0 = r4.A01
            X.9ih r3 = r1.A02(r0)
            X.9Cj r0 = X.C201049ih.A0p
            java.lang.Object r0 = X.C201049ih.A04(r0, r3)
            X.9W3 r0 = (X.AnonymousClass9W3) r0
            int r1 = r0.A02
            int r0 = r0.A01
            X.A29.A09(r4, r1, r0)
            int r2 = r4.A01
            X.9dX r1 = r4.B9Q()
            X.9JO r0 = new X.9JO
            r0.<init>(r1, r3, r2)
            X.9JP r4 = new X.9JP
            r4.<init>(r0)
            return r4
        L_0x018e:
            r0 = 0
            int r0 = X.A29.A00(r4, r0)
            r1.setDisplayOrientation(r0)
            X.B3b r3 = r4.A0b
            int r2 = r4.A02
            r0 = 1
            if (r2 == r0) goto L_0x01ad
            r0 = 2
            if (r2 == r0) goto L_0x01aa
            r1 = 3
            r0 = 270(0x10e, float:3.78E-43)
            if (r2 == r1) goto L_0x01a6
            r0 = 0
        L_0x01a6:
            r3.BSy(r0)
            goto L_0x0161
        L_0x01aa:
            r0 = 180(0xb4, float:2.52E-43)
            goto L_0x01a6
        L_0x01ad:
            r0 = 90
            goto L_0x01a6
        L_0x01b0:
            java.lang.Object r1 = r14.A01
            com.airbnb.lottie.LottieAnimationView r1 = (com.airbnb.lottie.LottieAnimationView) r1
            int r4 = r14.A00
            boolean r0 = r1.A03
            android.content.Context r3 = r1.getContext()
            if (r0 == 0) goto L_0x01e1
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "rawRes"
            r2.append(r0)
            android.content.res.Configuration r0 = X.AnonymousClass000.A0U(r3)
            int r0 = r0.uiMode
            r1 = r0 & 48
            r0 = 32
            if (r1 != r0) goto L_0x01de
            java.lang.String r0 = "_night_"
        L_0x01d5:
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r2, r4)
        L_0x01d9:
            X.6Nn r4 = X.C203529oE.A00(r3, r0, r4)
            return r4
        L_0x01de:
            java.lang.String r0 = "_day_"
            goto L_0x01d5
        L_0x01e1:
            r0 = 0
            goto L_0x01d9
        L_0x01e3:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01e3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B8Y.call():java.lang.Object");
    }
}
