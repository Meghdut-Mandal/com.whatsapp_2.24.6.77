package X;

import java.util.concurrent.Callable;

public class B8X implements Callable {
    public Object A00;
    public Object A01;
    public final int A02;

    public B8X(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static void A00(A28 a28, int i) {
        AnonymousClass9Yv.A01(a28.A07, a28.A0B, a28.A0F, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02bd, code lost:
        if (r5 == 1) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0173, code lost:
        if (X.AnonymousClass000.A0I(r4.A0B.A08(r1)) == 1) goto L_0x0175;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r16 = this;
            r7 = r16
            int r0 = r7.A02
            switch(r0) {
                case 0: goto L_0x0055;
                case 1: goto L_0x051b;
                case 2: goto L_0x050d;
                case 3: goto L_0x04e9;
                case 4: goto L_0x04ca;
                case 5: goto L_0x0495;
                case 6: goto L_0x0014;
                case 7: goto L_0x046d;
                case 8: goto L_0x0338;
                case 9: goto L_0x0140;
                case 10: goto L_0x052a;
                case 11: goto L_0x0136;
                case 12: goto L_0x0129;
                case 13: goto L_0x0118;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r7.A00
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r1 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r1
            java.lang.Object r0 = r7.A01
            com.whatsapp.voipcalling.camera.VoipCamera r0 = (com.whatsapp.voipcalling.camera.VoipCamera) r0
            java.lang.Integer r4 = r1.m74lambda$registerVirtualCamera$7$comwhatsappvoipcallingcameraVoipPhysicalCamera(r0)
        L_0x0013:
            return r4
        L_0x0014:
            java.lang.Object r5 = r7.A00
            X.A29 r5 = (X.A29) r5
            X.9Rn r1 = r5.A0K
            java.lang.Object r3 = r7.A01
            android.hardware.Camera r3 = (android.hardware.Camera) r3
            r0 = 1
            r1.A00(r0, r3)
            r4 = 0
            r3.setPreviewTexture(r4)     // Catch:{ IOException -> 0x0027 }
            goto L_0x002f
        L_0x0027:
            r2 = move-exception
            java.lang.String r1 = "Camera1Device"
            java.lang.String r0 = "Unable to remove the current SurfaceTexture"
            android.util.Log.e(r1, r0, r2)
        L_0x002f:
            X.9XH r0 = r5.A0L
            r0.A01(r3)
            r3.release()
            X.9PG r3 = r5.A0c
            if (r3 == 0) goto L_0x0013
            X.9jb r0 = r5.A0R
            X.9gr r1 = r0.A02
            monitor-enter(r1)
            java.lang.String r2 = r0.A01     // Catch:{ all -> 0x0580 }
            monitor-exit(r1)     // Catch:{ all -> 0x0580 }
            java.util.concurrent.CopyOnWriteArraySet r0 = r3.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0013
            r1 = 6
            X.751 r0 = new X.751
            r0.<init>(r1, r2, r3)
            X.C202399lk.A00(r0)
            return r4
        L_0x0055:
            java.lang.Object r1 = r7.A00
            X.A29 r1 = (X.A29) r1
            java.lang.Object r8 = r7.A01
            android.graphics.Rect r8 = (android.graphics.Rect) r8
            boolean r0 = r1.isConnected()
            r4 = 0
            if (r0 == 0) goto L_0x0013
            X.A29.A07(r1)
            X.9eX r5 = r1.A0J
            r7 = 1
            X.B9F r3 = new X.B9F
            r3.<init>(r1, r7)
            X.9gr r1 = r5.A06
            java.lang.String r0 = "Focus requests must be on the Optic thread. "
            r1.A06(r0)
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0013
            X.9WX r9 = r5.A05
            int r0 = r5.A00
            X.9dX r1 = r9.A01(r0)
            X.9Ci r0 = X.C198429dX.A0Q
            boolean r0 = X.C198429dX.A04(r0, r1)
            if (r0 == 0) goto L_0x009e
            int r0 = r5.A00
            X.88o r6 = r9.A00(r0)
            java.util.ArrayList r2 = X.C202799mg.A01(r8)
            X.9Up r1 = r6.A00
            X.9Cj r0 = X.C201049ih.A0e
            r1.A01(r0, r2)
            r6.A02()
        L_0x009e:
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0013
            int r0 = r5.A00
            X.9dX r1 = r9.A01(r0)
            X.9Ci r2 = X.C198429dX.A0P
            boolean r0 = X.C198429dX.A04(r2, r1)
            if (r0 != 0) goto L_0x00b8
            X.9Ci r0 = X.C198429dX.A03
            boolean r0 = X.C198429dX.A04(r0, r1)
            if (r0 == 0) goto L_0x0013
        L_0x00b8:
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x00c4
            android.hardware.Camera r0 = r5.A01
            java.util.Objects.requireNonNull(r0)
            r0.cancelAutoFocus()
        L_0x00c4:
            r1 = 0
            r5.A07 = r1
            r5.A08 = r7
            r5.A0A = r1
            int r0 = r5.A00
            X.88o r6 = r9.A00(r0)
            int r0 = r5.A00
            X.9dX r0 = r9.A01(r0)
            boolean r0 = X.C198429dX.A04(r2, r0)
            if (r0 == 0) goto L_0x0112
            java.util.ArrayList r2 = X.C202799mg.A01(r8)
            X.9Up r1 = r6.A00
            X.9Cj r0 = X.C201049ih.A0B
            r1.A01(r0, r2)
            int r1 = r8.centerX()
            int r0 = r8.centerY()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r1, r0)
        L_0x00f5:
            X.9Cj r0 = X.C201049ih.A0C
            X.C191299Ck.A02(r0, r6, r7)
            r6.A02()
            java.lang.Integer r1 = X.C023109s.A00
            X.7eh r0 = r5.A02
            X.C198999eX.A00(r2, r0, r5, r1)
            android.hardware.Camera r1 = r5.A01
            java.util.Objects.requireNonNull(r1)
            X.9pb r0 = new X.9pb
            r0.<init>(r2, r3, r5)
            r1.autoFocus(r0)
            return r4
        L_0x0112:
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r1, r1)
            goto L_0x00f5
        L_0x0118:
            java.lang.Object r1 = r7.A00
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r1 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r1
            java.lang.Object r0 = r7.A01
            com.whatsapp.voipcalling.VideoPort r0 = (com.whatsapp.voipcalling.VideoPort) r0
            int r0 = r1.m75lambda$setVideoPort$3$comwhatsappvoipcallingcameraVoipPhysicalCamera(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x0129:
            java.lang.Object r1 = r7.A00
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r1 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r1
            java.lang.Object r0 = r7.A01
            com.whatsapp.voipcalling.camera.VoipCamera r0 = (com.whatsapp.voipcalling.camera.VoipCamera) r0
            java.lang.Integer r4 = r1.m79lambda$unregisterVirtualCamera$8$comwhatsappvoipcallingcameraVoipPhysicalCamera(r0)
            return r4
        L_0x0136:
            java.lang.Object r4 = r7.A01
            X.A2Q r4 = (X.A2Q) r4
            X.9WY r0 = r4.A00
            r0.A01()
            return r4
        L_0x0140:
            java.lang.Object r4 = r7.A00
            X.A28 r4 = (X.A28) r4
            X.88m r0 = r4.A0B
            if (r0 == 0) goto L_0x0331
            android.hardware.camera2.CaptureRequest$Builder r0 = r4.A07
            if (r0 == 0) goto L_0x0331
            android.hardware.camera2.CameraDevice r0 = r4.A0j
            if (r0 == 0) goto L_0x0331
            X.9dX r0 = r4.A0F
            if (r0 == 0) goto L_0x0331
            X.88m r0 = r4.A0B
            X.9Cj r5 = X.C201049ih.A0I
            boolean r6 = X.C201049ih.A07(r5, r0)
            X.88m r0 = r4.A0B
            if (r0 == 0) goto L_0x032e
            X.9Cj r1 = X.C201049ih.A0d
            java.lang.Object r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x032e
            X.88m r0 = r4.A0B
            java.lang.Object r0 = r0.A08(r1)
            int r0 = X.AnonymousClass000.A0I(r0)
            r3 = 1
            if (r0 != r3) goto L_0x032e
        L_0x0175:
            X.88m r0 = r4.A0B
            X.9Cj r8 = X.C201049ih.A0L
            boolean r10 = X.C201049ih.A07(r8, r0)
            X.88m r0 = r4.A0B
            X.9Cj r11 = X.C201049ih.A02
            java.lang.Object r0 = r0.A08(r11)
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 == 0) goto L_0x0328
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>(r0)
        L_0x018e:
            X.88m r1 = r4.A0B
            java.lang.Object r0 = r7.A01
            X.9T3 r0 = (X.AnonymousClass9T3) r0
            boolean r0 = r1.A0A(r0)
            if (r0 == 0) goto L_0x01d3
            X.9n4 r2 = r4.A0R
            boolean r0 = r2.A0Q
            if (r0 == 0) goto L_0x01d3
            X.B43 r0 = r4.A0D
            r1 = 1
            if (r0 == 0) goto L_0x01db
            X.88m r0 = r4.A0B
            boolean r8 = X.C201049ih.A07(r8, r0)
            X.88m r0 = r4.A0B
            java.lang.Object r7 = r0.A08(r11)
            java.util.HashMap r7 = (java.util.HashMap) r7
            if (r7 == 0) goto L_0x01d6
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r7)
        L_0x01ba:
            if (r10 != r8) goto L_0x01d3
            if (r10 == 0) goto L_0x01db
            if (r8 == 0) goto L_0x01db
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x01db
            X.A28.A06(r4, r1)
            android.hardware.camera2.CameraDevice r0 = r4.A0j
            java.lang.String r1 = r0.getId()
            r0 = 0
            X.A28.A03(r4, r0, r1)
        L_0x01d3:
            X.88m r4 = r4.A0B
            return r4
        L_0x01d6:
            java.util.HashMap r0 = X.AnonymousClass001.A0J()
            goto L_0x01ba
        L_0x01db:
            X.88m r7 = r4.A0B
            X.9Cj r0 = X.C201049ih.A0T
            boolean r0 = X.C201049ih.A07(r0, r7)
            r4.A0m = r0
            X.88m r7 = r4.A0B
            X.9Cj r0 = X.C201049ih.A0P
            boolean r0 = X.C201049ih.A07(r0, r7)
            if (r0 == 0) goto L_0x01fa
            X.A2F r0 = r4.A0l
            if (r0 == 0) goto L_0x01fa
            X.9YE r7 = r4.A0P
            X.A2F r0 = r4.A0l
            r7.A03(r0)
        L_0x01fa:
            r2.A06()
            r0 = 0
            A00(r4, r0)
            A00(r4, r1)
            r0 = 2
            A00(r4, r0)
            r0 = 3
            A00(r4, r0)
            android.hardware.camera2.CaptureRequest$Builder r9 = r4.A07
            X.88m r8 = r4.A0B
            X.9dX r7 = r4.A0F
            r0 = 4
            X.AnonymousClass9Yv.A01(r9, r8, r7, r0)
            r7 = 5
            A00(r4, r7)
            r7 = 6
            A00(r4, r7)
            r7 = 7
            A00(r4, r7)
            r7 = 8
            A00(r4, r7)
            r7 = 9
            A00(r4, r7)
            r7 = 10
            A00(r4, r7)
            r7 = 11
            A00(r4, r7)
            r7 = 12
            A00(r4, r7)
            r7 = 13
            A00(r4, r7)
            r7 = 14
            A00(r4, r7)
            r7 = 15
            A00(r4, r7)
            r13 = 0
            android.hardware.camera2.CameraManager r8 = r4.A0M
            android.hardware.camera2.CameraDevice r7 = r4.A0j
            java.lang.String r12 = r7.getId()
            android.hardware.camera2.CaptureRequest$Builder r9 = r4.A07
            X.88m r10 = r4.A0B
            X.9dX r11 = r4.A0F
            X.AnonymousClass9Yv.A00(r8, r9, r10, r11, r12, r13)
            android.hardware.camera2.CameraDevice r7 = r4.A0j
            java.lang.String r12 = r7.getId()
            android.hardware.camera2.CaptureRequest$Builder r9 = r4.A07
            X.88m r10 = r4.A0B
            X.9dX r11 = r4.A0F
            r13 = 1
            X.AnonymousClass9Yv.A00(r8, r9, r10, r11, r12, r13)
            X.9dX r8 = r4.A0F
            X.9Ci r7 = X.C198429dX.A0B
            boolean r7 = X.C198429dX.A04(r7, r8)
            if (r7 == 0) goto L_0x027d
            X.88m r8 = r4.A0B
            X.9Cj r7 = X.C201049ih.A0k
            r8.A08(r7)
        L_0x027d:
            X.88m r9 = r2.A0A
            if (r9 == 0) goto L_0x028d
            X.A2F r8 = r2.A08
            if (r8 == 0) goto L_0x028d
            X.9Cj r7 = X.C201049ih.A0R
            boolean r7 = X.C201049ih.A07(r7, r9)
            r8.A0G = r7
        L_0x028d:
            X.88m r7 = r4.A0B
            boolean r5 = X.C201049ih.A07(r5, r7)
            if (r5 == r6) goto L_0x02a6
            X.A28.A06(r4, r1)
            android.hardware.camera2.CameraDevice r0 = r4.A0j
            java.lang.String r1 = r0.getId()
            r0 = 0
            X.A28.A03(r4, r0, r1)
            r4.A0n = r5
            goto L_0x01d3
        L_0x02a6:
            X.88m r5 = r4.A0B
            if (r5 == 0) goto L_0x0321
            X.9Cj r6 = X.C201049ih.A0d
            java.lang.Object r5 = r5.A08(r6)
            if (r5 == 0) goto L_0x0321
            X.88m r5 = r4.A0B
            java.lang.Object r5 = r5.A08(r6)
            int r5 = X.AnonymousClass000.A0I(r5)
            r6 = 1
            if (r5 != r1) goto L_0x0321
        L_0x02bf:
            X.9dX r5 = r4.A0F
            boolean r5 = r5 instanceof X.C1692688k
            if (r5 == 0) goto L_0x0323
            X.9fa r5 = r4.A0Q
            boolean r5 = r5.A0F
            if (r5 != 0) goto L_0x0323
            X.9St r5 = r4.A0S
            boolean r5 = r5.A0D
            if (r5 != 0) goto L_0x0323
            if (r6 == r3) goto L_0x0323
            r2 = 0
            X.9mL r3 = r4.A0A
            if (r3 == 0) goto L_0x02fa
            float r2 = r3.A04()
            float r5 = X.C202639mL.A01(r3, r2)
            r2 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 * r2
            java.lang.String r3 = android.os.Build.BRAND
            java.lang.String r2 = "Google"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x031e
            r2 = 1063423094(0x3f628c76, float:0.88495576)
            if (r6 == 0) goto L_0x02f5
            r2 = 1066443735(0x3f90a3d7, float:1.13)
        L_0x02f5:
            float r5 = r5 * r2
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
        L_0x02fa:
            X.A28.A06(r4, r1)
            X.9dX r1 = r4.A0F
            X.88k r1 = (X.C1692688k) r1
            if (r6 != 0) goto L_0x0304
            r0 = -1
        L_0x0304:
            r1.A07(r0)
            android.hardware.camera2.CameraDevice r0 = r4.A0j
            java.lang.String r0 = r0.getId()
            X.A28.A05(r4, r0)
            X.A28.A01(r4)
            android.hardware.camera2.CameraDevice r0 = r4.A0j
            java.lang.String r0 = r0.getId()
            X.A28.A03(r4, r2, r0)
            goto L_0x01d3
        L_0x031e:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x02f5
        L_0x0321:
            r6 = 0
            goto L_0x02bf
        L_0x0323:
            r2.A05()
            goto L_0x01d3
        L_0x0328:
            java.util.HashMap r9 = X.AnonymousClass001.A0J()
            goto L_0x018e
        L_0x032e:
            r3 = 0
            goto L_0x0175
        L_0x0331:
            java.lang.String r0 = "Cannot modify settings, camera was closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0338:
            java.lang.Object r3 = r7.A00
            X.A28 r3 = (X.A28) r3
            java.lang.Object r6 = r7.A01
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            r0 = 2
            float[] r14 = new float[r0]
            int r0 = r6.centerX()
            float r1 = (float) r0
            r0 = 0
            r14[r0] = r1
            int r0 = r6.centerY()
            float r0 = (float) r0
            r5 = 1
            r14[r5] = r0
            android.graphics.Matrix r0 = r3.A05
            if (r0 == 0) goto L_0x0363
            android.graphics.Matrix r1 = X.C90524aI.A0B()
            android.graphics.Matrix r0 = r3.A05
            r0.invert(r1)
            r1.mapPoints(r14)
        L_0x0363:
            X.9YE r12 = r3.A0P
            boolean r15 = r3.A0I
            android.hardware.camera2.CaptureRequest$Builder r11 = r3.A07
            X.B43 r2 = r3.A0D
            X.A2F r13 = r3.A0l
            X.9VN r1 = r12.A0A
            java.lang.String r0 = "Cannot perform focus, not on Optic thread."
            r1.A01(r0)
            java.lang.String r0 = "Can only check if the prepared on the Optic thread"
            r1.A01(r0)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0528
            X.9CY r0 = r12.A03
            java.util.Objects.requireNonNull(r0)
            X.A28 r0 = r0.A00
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x0528
            X.9n4 r0 = r12.A04
            if (r0 == 0) goto L_0x0528
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x0528
            if (r11 == 0) goto L_0x0528
            if (r13 == 0) goto L_0x0528
            X.9dX r1 = r12.A07
            java.util.Objects.requireNonNull(r1)
            X.9Ci r0 = X.C198429dX.A0P
            boolean r0 = X.C198429dX.A04(r0, r1)
            if (r0 == 0) goto L_0x0528
            if (r2 == 0) goto L_0x0528
            X.9mL r0 = r12.A05
            if (r0 == 0) goto L_0x0528
            boolean r0 = r12.A0D
            if (r0 == 0) goto L_0x0528
            X.9n4 r0 = r12.A04
            X.B31 r4 = r0.A09
            if (r4 == 0) goto L_0x0528
            r12.A00()
            java.lang.Integer r0 = X.C023109s.A00
            r12.A04(r0, r14)
            android.hardware.camera2.params.MeteringRectangle[] r3 = new android.hardware.camera2.params.MeteringRectangle[r5]
            X.9mL r0 = r12.A05
            android.graphics.Rect r10 = r0.A05
            android.graphics.Rect r2 = r0.A04
            if (r10 == 0) goto L_0x041c
            if (r2 == 0) goto L_0x041c
            int r0 = r2.width()
            float r9 = (float) r0
            int r0 = r10.width()
            float r0 = (float) r0
            float r9 = r9 / r0
            int r0 = r2.height()
            float r8 = (float) r0
            int r0 = r10.height()
            float r0 = (float) r0
            float r8 = r8 / r0
            int r1 = r10.width()
            int r0 = r2.width()
            int r1 = r1 - r0
            int r7 = r1 / 2
            int r1 = r10.height()
            int r0 = r2.height()
            int r1 = r1 - r0
            int r2 = r1 / 2
            int r0 = r6.centerX()
            float r1 = (float) r0
            float r1 = r1 * r9
            float r0 = (float) r7
            float r1 = r1 + r0
            int r7 = (int) r1
            int r0 = r6.centerY()
            float r1 = (float) r0
            float r1 = r1 * r8
            float r0 = (float) r2
            float r1 = r1 + r0
            int r0 = (int) r1
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r7, r0, r7, r0)
            int r0 = r6.width()
            int r0 = -r0
            int r1 = r0 / 2
            int r0 = r6.height()
            int r0 = -r0
            int r0 = r0 / 2
            r2.inset(r1, r0)
            r6 = r2
        L_0x041c:
            r1 = 1000(0x3e8, float:1.401E-42)
            android.hardware.camera2.params.MeteringRectangle r0 = new android.hardware.camera2.params.MeteringRectangle
            r0.<init>(r6, r1)
            r7 = 0
            r3[r7] = r0
            r2 = 0
            r13.A04 = r2
            X.A2D r10 = new X.A2D
            r10.<init>(r11, r12, r13, r14, r15)
            r13.A06 = r10
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r11.set(r0, r6)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            r11.set(r0, r3)
            r12.A0C = r5
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r0 = 2
            X.C165577te.A0v(r11, r1, r0)
            android.hardware.camera2.CaptureRequest r0 = r11.build()
            r4.B2a(r0, r2, r13)
            X.C165577te.A0v(r11, r1, r7)
            android.hardware.camera2.CaptureRequest r0 = r11.build()
            r4.Brx(r0, r2, r13)
            r11.set(r1, r6)
            android.hardware.camera2.CaptureRequest r0 = r11.build()
            r4.B2a(r0, r2, r13)
            if (r15 == 0) goto L_0x046a
            r0 = 6000(0x1770, double:2.9644E-320)
        L_0x0465:
            r12.A02(r11, r13, r0)
            goto L_0x0528
        L_0x046a:
            r0 = 4000(0xfa0, double:1.9763E-320)
            goto L_0x0465
        L_0x046d:
            java.lang.Object r0 = r7.A00
            X.88f r0 = (X.C1692188f) r0
            java.lang.Object r1 = r7.A01
            X.9e8 r1 = (X.C198749e8) r1
            X.A29 r2 = r0.A01
            X.9Cm r0 = X.C198749e8.A04
            boolean r1 = X.C198749e8.A00(r0, r1)
            java.lang.String r0 = "Performing post photo capture on UI thread"
            X.C202399lk.A01(r0)
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x0528
            if (r1 == 0) goto L_0x048d
            X.A29.A05(r2)
        L_0x048d:
            X.9PE r1 = r2.A0M
            r0 = 0
            r1.A00(r0)
            goto L_0x0528
        L_0x0495:
            java.lang.Object r3 = r7.A00
            X.A29 r3 = (X.A29) r3
            java.lang.Object r2 = r7.A01
            X.9jb r1 = r3.A0R     // Catch:{ Exception -> 0x04b2 }
            java.util.UUID r0 = r1.A03     // Catch:{ Exception -> 0x04b2 }
            java.util.Objects.equals(r2, r0)     // Catch:{ Exception -> 0x04b2 }
            r4 = 0
            X.C202389lj.A00()     // Catch:{ Exception -> 0x04b2 }
            X.A29.A04(r3)     // Catch:{ Exception -> 0x04b2 }
            java.util.UUID r0 = r1.A03
            java.util.Objects.equals(r2, r0)
            X.C202389lj.A00()
            return r4
        L_0x04b2:
            r1 = move-exception
            X.9jb r0 = r3.A0R     // Catch:{ all -> 0x04be }
            java.util.UUID r0 = r0.A03     // Catch:{ all -> 0x04be }
            java.util.Objects.equals(r2, r0)     // Catch:{ all -> 0x04be }
            X.C202389lj.A00()     // Catch:{ all -> 0x04be }
            throw r1     // Catch:{ all -> 0x04be }
        L_0x04be:
            r1 = move-exception
            X.9jb r0 = r3.A0R
            java.util.UUID r0 = r0.A03
            java.util.Objects.equals(r2, r0)
            X.C202389lj.A00()
            throw r1
        L_0x04ca:
            java.lang.Object r3 = r7.A00
            X.A29 r3 = (X.A29) r3
            java.lang.Object r2 = r7.A01
            X.9T3 r2 = (X.AnonymousClass9T3) r2
            java.lang.String r0 = "Cannot modify settings"
            X.A29.A0A(r3, r0)
            int r0 = r3.A01
            X.9WX r1 = r3.A0O
            X.88o r0 = r1.A00(r0)
            r0.A04(r2)
            int r0 = r3.A01
            X.9ih r4 = r1.A02(r0)
            return r4
        L_0x04e9:
            java.lang.Object r1 = r7.A00
            X.A29 r1 = (X.A29) r1
            java.lang.Object r4 = r7.A01
            X.9ih r4 = (X.C201049ih) r4
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L_0x0528
            X.9XH r3 = r1.A0L
            android.hardware.Camera r2 = r1.A0a
            X.9Cj r0 = X.C201049ih.A0p
            java.lang.Object r1 = r4.A08(r0)
            X.9W3 r1 = (X.AnonymousClass9W3) r1
            X.9Cj r0 = X.C201049ih.A0l
            int r0 = X.C201049ih.A02(r0, r4)
            r3.A02(r2, r1, r0)
            goto L_0x0528
        L_0x050d:
            java.lang.Object r0 = r7.A00
            X.A29 r0 = (X.A29) r0
            java.lang.Object r1 = r7.A01
            X.9Rn r0 = r0.A0K
            X.9VB r0 = r0.A01
            r0.A02(r1)
            goto L_0x0528
        L_0x051b:
            java.lang.Object r0 = r7.A00
            X.A29 r0 = (X.A29) r0
            java.lang.Object r1 = r7.A01
            X.9Rn r0 = r0.A0K
            X.9VB r0 = r0.A01
            r0.A01(r1)
        L_0x0528:
            r4 = 0
            return r4
        L_0x052a:
            java.lang.Object r3 = r7.A01     // Catch:{ Exception -> 0x055a }
            java.util.UUID r3 = (java.util.UUID) r3     // Catch:{ Exception -> 0x055a }
            java.lang.Object r2 = r7.A00     // Catch:{ Exception -> 0x055a }
            X.A28 r2 = (X.A28) r2     // Catch:{ Exception -> 0x055a }
            X.9jb r1 = r2.A0W     // Catch:{ Exception -> 0x055a }
            java.util.UUID r0 = r1.A03     // Catch:{ Exception -> 0x055a }
            java.util.Objects.equals(r3, r0)     // Catch:{ Exception -> 0x055a }
            r4 = 0
            X.C202389lj.A00()     // Catch:{ Exception -> 0x055a }
            X.A28.A00(r2)     // Catch:{ Exception -> 0x055a }
            X.B3b r0 = r2.A0k     // Catch:{ Exception -> 0x055a }
            if (r0 == 0) goto L_0x054d
            X.B3b r0 = r2.A0k     // Catch:{ Exception -> 0x055a }
            r0.BnV(r4)     // Catch:{ Exception -> 0x055a }
            r2.A0k = r4     // Catch:{ Exception -> 0x055a }
            r2.A0D = r4     // Catch:{ Exception -> 0x055a }
        L_0x054d:
            r2.A09 = r4     // Catch:{ Exception -> 0x055a }
            r2.A0E = r4     // Catch:{ Exception -> 0x055a }
            java.util.UUID r0 = r1.A03
            java.util.Objects.equals(r3, r0)
            X.C202389lj.A00()
            return r4
        L_0x055a:
            r2 = move-exception
            java.lang.Object r1 = r7.A01     // Catch:{ all -> 0x056e }
            java.util.UUID r1 = (java.util.UUID) r1     // Catch:{ all -> 0x056e }
            java.lang.Object r0 = r7.A00     // Catch:{ all -> 0x056e }
            X.A28 r0 = (X.A28) r0     // Catch:{ all -> 0x056e }
            X.9jb r0 = r0.A0W     // Catch:{ all -> 0x056e }
            java.util.UUID r0 = r0.A03     // Catch:{ all -> 0x056e }
            java.util.Objects.equals(r1, r0)     // Catch:{ all -> 0x056e }
            X.C202389lj.A00()     // Catch:{ all -> 0x056e }
            throw r2     // Catch:{ all -> 0x056e }
        L_0x056e:
            r2 = move-exception
            java.lang.Object r1 = r7.A01
            java.lang.Object r0 = r7.A00
            X.A28 r0 = (X.A28) r0
            X.9jb r0 = r0.A0W
            java.util.UUID r0 = r0.A03
            java.util.Objects.equals(r1, r0)
            X.C202389lj.A00()
            throw r2
        L_0x0580:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0580 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B8X.call():java.lang.Object");
    }
}
