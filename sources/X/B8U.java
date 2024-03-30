package X;

import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.concurrent.Callable;

public class B8U implements Callable {
    public Object A00;
    public final int A01;

    public B8U(A28 a28, int i) {
        this.A01 = i;
        switch (i) {
            case 6:
            case 7:
                this.A00 = a28;
                return;
            default:
                this.A00 = a28;
                return;
        }
    }

    public static Object A00(VoipPhysicalCamera voipPhysicalCamera, int i) {
        return voipPhysicalCamera.syncRunOnCameraThread(new B8U((Object) voipPhysicalCamera, i), -100);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        return java.lang.Integer.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x02ce;
                case 1: goto L_0x02a1;
                case 2: goto L_0x0248;
                case 3: goto L_0x01f2;
                case 4: goto L_0x01ed;
                case 5: goto L_0x01e2;
                case 6: goto L_0x01af;
                case 7: goto L_0x015c;
                case 8: goto L_0x014f;
                case 9: goto L_0x00c3;
                case 10: goto L_0x00a4;
                case 11: goto L_0x009b;
                case 12: goto L_0x0092;
                case 13: goto L_0x0070;
                case 14: goto L_0x0024;
                case 15: goto L_0x02ed;
                case 16: goto L_0x02d6;
                case 17: goto L_0x006d;
                case 18: goto L_0x0064;
                case 19: goto L_0x0058;
                case 20: goto L_0x001b;
                case 21: goto L_0x004f;
                case 22: goto L_0x0012;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A00
            org.pjsip.PjCamera r0 = (org.pjsip.PjCamera) r0
            int r0 = r0.updatePreviewOrientationOnCameraThread()
        L_0x000d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x0011:
            return r4
        L_0x0012:
            java.lang.Object r0 = r6.A00
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r0 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r0
            int r0 = r0.startOnCameraThread()
            goto L_0x000d
        L_0x001b:
            java.lang.Object r0 = r6.A00
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r0 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r0
            int r0 = r0.disableAREffectOnCameraThread()
            goto L_0x000d
        L_0x0024:
            java.lang.Object r5 = r6.A00
            X.9n4 r5 = (X.C202989n4) r5
            boolean r0 = r5.A0Q
            r4 = 0
            if (r0 == 0) goto L_0x0011
            java.util.List r1 = r5.A0P
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0011
            r0 = 0
            java.lang.Object r0 = r1.remove(r0)
            X.9Gl r0 = (X.C192299Gl) r0
            if (r0 == 0) goto L_0x0011
            boolean r3 = r0.A00
            boolean r0 = r0.A01
            X.9gr r2 = r5.A0O
            X.AYa r1 = new X.AYa
            r1.<init>(r5, r3, r0)
            java.lang.String r0 = "restart_preview_on_background_thread"
            r2.A07(r0, r1)
            return r4
        L_0x004f:
            java.lang.Object r0 = r6.A00
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r0 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r0
            java.lang.Integer r4 = r0.m77lambda$stop$5$comwhatsappvoipcallingcameraVoipPhysicalCamera()
            return r4
        L_0x0058:
            java.lang.Object r0 = r6.A00
            X.8rQ r0 = (X.C183828rQ) r0
            X.C183828rQ.A02(r0)
            java.lang.Integer r4 = X.C36381kD.A0m()
            return r4
        L_0x0064:
            java.lang.Object r0 = r6.A00
            com.whatsapp.jobqueue.job.SendRetryReceiptJob r0 = (com.whatsapp.jobqueue.job.SendRetryReceiptJob) r0
            android.util.Pair r4 = com.whatsapp.jobqueue.job.SendRetryReceiptJob.A00(r0)
            return r4
        L_0x006d:
            java.lang.Object r4 = r6.A00
            return r4
        L_0x0070:
            java.lang.Object r0 = r6.A00
            X.9Cg r0 = (X.C191259Cg) r0
            X.9n4 r4 = r0.A00
            X.9VN r1 = r4.A0J
            java.lang.String r0 = "Method onCameraSessionActive must be called on Optic Thread."
            r1.A01(r0)
            X.A2Q r3 = new X.A2Q
            r3.<init>()
            X.9gr r2 = r4.A0O
            r0 = 11
            X.B8X r1 = new X.B8X
            r1.<init>(r3, r4, r0)
            java.lang.String r0 = "camera_session_active_on_camera_handler_thread"
            r2.A04(r0, r1)
            goto L_0x02cc
        L_0x0092:
            java.lang.Object r0 = r6.A00
            X.A2B r0 = (X.A2B) r0
            X.A2B.A00(r0)
            goto L_0x02cc
        L_0x009b:
            java.lang.Object r0 = r6.A00
            X.9mz r0 = (X.C202949mz) r0
            X.C202949mz.A03(r0)
            goto L_0x02cc
        L_0x00a4:
            java.lang.Object r1 = r6.A00
            X.A28 r1 = (X.A28) r1
            boolean r0 = X.A28.A07(r1)
            if (r0 != 0) goto L_0x02cc
            X.9n4 r3 = r1.A0R
            boolean r0 = r3.A0Q
            if (r0 == 0) goto L_0x02cc
            r0 = 0
            X.9gr r2 = r3.A0O
            X.AYa r1 = new X.AYa
            r1.<init>(r3, r0, r0)
            java.lang.String r0 = "restart_preview_on_background_thread"
            r2.A07(r0, r1)
            goto L_0x02cc
        L_0x00c3:
            java.lang.Object r2 = r6.A00
            X.A28 r2 = (X.A28) r2
            X.C202389lj.A00()
            android.hardware.camera2.CameraDevice r0 = r2.A0j     // Catch:{ Exception -> 0x0145 }
            if (r0 == 0) goto L_0x012c
            int r0 = r2.A01     // Catch:{ Exception -> 0x0145 }
            r4 = 1
            boolean r3 = X.AnonymousClass000.A1Q(r0)
            X.9mz r1 = r2.A0O     // Catch:{ Exception -> 0x0145 }
            r0 = 1
            if (r3 != r4) goto L_0x00db
            r0 = 0
        L_0x00db:
            boolean r0 = r1.A07(r0)     // Catch:{ Exception -> 0x0145 }
            if (r0 != 0) goto L_0x00f0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r0 = "Cannot switch to "
            r1.append(r0)     // Catch:{ Exception -> 0x0145 }
            if (r3 != r4) goto L_0x00ed
            goto L_0x0134
        L_0x00ed:
            java.lang.String r0 = "BACK"
            goto L_0x0136
        L_0x00f0:
            r2.A0p = r4     // Catch:{ Exception -> 0x0145 }
            java.lang.String r1 = r1.A06(r3)     // Catch:{ Exception -> 0x0145 }
            X.A28.A04(r2, r1)     // Catch:{ Exception -> 0x0145 }
            X.A28.A05(r2, r1)     // Catch:{ Exception -> 0x0145 }
            X.A28.A01(r2)     // Catch:{ Exception -> 0x0145 }
            r0 = 0
            X.A28.A03(r2, r0, r1)     // Catch:{ Exception -> 0x0145 }
            int r4 = r2.A01     // Catch:{ Exception -> 0x0145 }
            X.9dX r3 = r2.B9Q()     // Catch:{ Exception -> 0x0145 }
            boolean r0 = r2.isConnected()     // Catch:{ Exception -> 0x0145 }
            if (r0 == 0) goto L_0x0124
            X.88m r1 = r2.A0B     // Catch:{ Exception -> 0x0145 }
            if (r1 == 0) goto L_0x0124
            X.9JO r0 = new X.9JO     // Catch:{ Exception -> 0x0145 }
            r0.<init>(r3, r1, r4)     // Catch:{ Exception -> 0x0145 }
            X.9JP r4 = new X.9JP     // Catch:{ Exception -> 0x0145 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0145 }
            X.C202389lj.A00()     // Catch:{ Exception -> 0x0145 }
            r0 = 0
            r2.A0p = r0
            return r4
        L_0x0124:
            java.lang.String r1 = "Cannot get camera settings"
            X.Aar r0 = new X.Aar     // Catch:{ Exception -> 0x0145 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0145 }
            throw r0     // Catch:{ Exception -> 0x0145 }
        L_0x012c:
            java.lang.String r0 = "Cannot switch camera, no cameras open."
            X.Ab6 r1 = new X.Ab6     // Catch:{ Exception -> 0x0145 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0145 }
            goto L_0x0144
        L_0x0134:
            java.lang.String r0 = "FRONT"
        L_0x0136:
            r1.append(r0)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r0 = ", camera is not present"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ Exception -> 0x0145 }
            X.Abf r1 = new X.Abf     // Catch:{ Exception -> 0x0145 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0145 }
        L_0x0144:
            throw r1     // Catch:{ Exception -> 0x0145 }
        L_0x0145:
            r0 = move-exception
            X.C202389lj.A00()     // Catch:{ all -> 0x014a }
            throw r0     // Catch:{ all -> 0x014a }
        L_0x014a:
            r1 = move-exception
            r0 = 0
            r2.A0p = r0
            throw r1
        L_0x014f:
            java.lang.Object r0 = r6.A00
            X.9CZ r0 = (X.AnonymousClass9CZ) r0
            X.A28 r0 = r0.A00
            X.9St r0 = r0.A0S
            r0.A00()
            goto L_0x02cc
        L_0x015c:
            java.lang.Object r4 = r6.A00
            X.A28 r4 = (X.A28) r4
            boolean r0 = r4.isConnected()
            if (r0 == 0) goto L_0x01a7
            X.A28.A02(r4)
            X.B3b r0 = r4.A0k
            if (r0 == 0) goto L_0x0184
            X.B3b r3 = r4.A0k
            int r2 = r4.A02
            r0 = 1
            r1 = 90
            if (r2 == r0) goto L_0x0181
            r0 = 2
            r1 = 180(0xb4, float:2.52E-43)
            if (r2 == r0) goto L_0x0181
            r0 = 3
            r1 = 270(0x10e, float:3.78E-43)
            if (r2 == r0) goto L_0x0181
            r1 = 0
        L_0x0181:
            r3.BSy(r1)
        L_0x0184:
            int r3 = r4.A01
            X.9dX r2 = r4.B9Q()
            boolean r0 = r4.isConnected()
            if (r0 == 0) goto L_0x019f
            X.88m r1 = r4.A0B
            if (r1 == 0) goto L_0x019f
            X.9JO r0 = new X.9JO
            r0.<init>(r2, r1, r3)
            X.9JP r4 = new X.9JP
            r4.<init>(r0)
            return r4
        L_0x019f:
            java.lang.String r1 = "Cannot get camera settings"
            X.Aar r0 = new X.Aar
            r0.<init>(r1)
            throw r0
        L_0x01a7:
            java.lang.String r1 = "Can not update preview display rotation"
            X.Aar r0 = new X.Aar
            r0.<init>(r1)
            throw r0
        L_0x01af:
            java.lang.Object r0 = r6.A00
            X.A28 r0 = (X.A28) r0
            X.9n4 r2 = r0.A0R
            X.9VN r1 = r2.A0J
            java.lang.String r0 = "Can only check if is retrieving preview frames from the Optic thread"
            r1.A01(r0)
            java.lang.String r0 = "Can only check if the prepared on the Optic thread"
            r1.A01(r0)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x01cb
            boolean r0 = r2.A0R
            if (r0 == 0) goto L_0x01cb
        L_0x01c9:
            r4 = 0
            return r4
        L_0x01cb:
            r1 = 1
            r0 = 0
            r2.A0B(r1, r0)     // Catch:{ CameraAccessException | IllegalArgumentException -> 0x01c9, Exception -> 0x01d1 }
            goto L_0x01c9
        L_0x01d1:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Could not start preview: "
            java.lang.String r1 = X.C36331k8.A0i(r0, r1, r2)
            X.Ab6 r0 = new X.Ab6
            r0.<init>(r1)
            throw r0
        L_0x01e2:
            java.lang.Object r1 = r6.A00
            X.9pc r1 = (X.C204199pc) r1
            int r0 = r1.A02
            r1.A00(r0)
            goto L_0x02cc
        L_0x01ed:
            X.C202659mN.A02()
            goto L_0x02cc
        L_0x01f2:
            java.lang.Object r4 = r6.A00
            X.A29 r4 = (X.A29) r4
            X.C202389lj.A00()
            java.lang.String r0 = "Cannot switch cameras."
            X.A29.A0A(r4, r0)     // Catch:{ Exception -> 0x0243 }
            int r0 = r4.A01     // Catch:{ Exception -> 0x0243 }
            r3 = 1
            boolean r2 = X.AnonymousClass000.A1Q(r0)
            X.9mN r0 = r4.A0I     // Catch:{ Exception -> 0x0243 }
            boolean r0 = r0.A06(r2)     // Catch:{ Exception -> 0x0243 }
            if (r0 != 0) goto L_0x022c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0243 }
            java.lang.String r0 = "Cannot switch to "
            r1.append(r0)     // Catch:{ Exception -> 0x0243 }
            if (r2 != r3) goto L_0x021b
            java.lang.String r0 = "FRONT"
            goto L_0x021d
        L_0x021b:
            java.lang.String r0 = "BACK"
        L_0x021d:
            r1.append(r0)     // Catch:{ Exception -> 0x0243 }
            java.lang.String r0 = ", camera is not present"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ Exception -> 0x0243 }
            X.Abf r0 = new X.Abf     // Catch:{ Exception -> 0x0243 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0243 }
            throw r0     // Catch:{ Exception -> 0x0243 }
        L_0x022c:
            X.A29.A08(r4, r2)     // Catch:{ Exception -> 0x0243 }
            X.B4X r2 = r4.A08     // Catch:{ Exception -> 0x0243 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ Exception -> 0x0243 }
            X.9U6 r1 = r4.A07     // Catch:{ Exception -> 0x0243 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ Exception -> 0x0243 }
            int r0 = r4.A02     // Catch:{ Exception -> 0x0243 }
            X.9JP r4 = X.A29.A01(r1, r4, r2, r0)     // Catch:{ Exception -> 0x0243 }
            X.C202389lj.A00()     // Catch:{ Exception -> 0x0243 }
            return r4
        L_0x0243:
            r0 = move-exception
            X.C202389lj.A00()
            throw r0
        L_0x0248:
            java.lang.Object r1 = r6.A00
            X.A29 r1 = (X.A29) r1
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L_0x02cc
            boolean r0 = r1.A0e
            if (r0 != 0) goto L_0x02cc
            X.9eX r3 = r1.A0J
            X.9gr r1 = r3.A06
            java.lang.String r0 = "Focus reset must happen on the Optic thread."
            r1.A06(r0)
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x02cc
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x02cc
            r0 = 0
            r3.A07 = r0
            r3.A08 = r0
            java.lang.Integer r2 = X.C023109s.A01
            r1 = 0
            X.7eh r0 = r3.A02
            X.C198999eX.A00(r1, r0, r3, r2)
            android.hardware.Camera r0 = r3.A01
            java.util.Objects.requireNonNull(r0)
            r0.cancelAutoFocus()
            X.9WX r1 = r3.A05
            int r0 = r3.A00
            X.88o r3 = r1.A00(r0)
            X.9Cj r2 = X.C201049ih.A0B
            java.util.List r1 = java.util.Collections.emptyList()
            X.9Up r0 = r3.A00
            r0.A01(r2, r1)
            X.9Cj r2 = X.C201049ih.A0e
            java.util.List r1 = java.util.Collections.emptyList()
            X.9Up r0 = r3.A00
            r0.A01(r2, r1)
            r3.A03()
            r3.A02()
            goto L_0x02cc
        L_0x02a1:
            java.lang.Object r2 = r6.A00
            X.A29 r2 = (X.A29) r2
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x02cc
            X.9XH r1 = r2.A0L
            monitor-enter(r1)
            X.9VB r0 = r1.A03     // Catch:{ all -> 0x02c8 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x02c8 }
            boolean r0 = X.C36401kF.A1a(r0)     // Catch:{ all -> 0x02c8 }
            monitor-exit(r1)
            if (r0 != 0) goto L_0x02cc
            android.hardware.Camera r0 = r2.A0a
            java.util.Objects.requireNonNull(r0)
            r1.A01(r0)
            monitor-enter(r1)
            java.util.ArrayList r0 = r1.A04     // Catch:{ all -> 0x02c8 }
            r0.clear()     // Catch:{ all -> 0x02c8 }
            goto L_0x02cb
        L_0x02c8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x02cb:
            monitor-exit(r1)
        L_0x02cc:
            r4 = 0
            return r4
        L_0x02ce:
            java.lang.Object r0 = r6.A00
            X.6Nn r4 = new X.6Nn
            r4.<init>((java.lang.Object) r0)
            return r4
        L_0x02d6:
            java.lang.Object r1 = r6.A00     // Catch:{ Exception -> 0x0301 }
            X.9n4 r1 = (X.C202989n4) r1     // Catch:{ Exception -> 0x0301 }
            X.B31 r0 = r1.A09     // Catch:{ Exception -> 0x0301 }
            if (r0 == 0) goto L_0x02e5
            r0.close()     // Catch:{ Exception -> 0x0301 }
            r0 = 0
            r1.A09 = r0     // Catch:{ Exception -> 0x0301 }
            goto L_0x030c
        L_0x02e5:
            X.A2R r0 = r1.A0L     // Catch:{ Exception -> 0x0301 }
            X.9WY r0 = r0.A01     // Catch:{ Exception -> 0x0301 }
            r0.A01()     // Catch:{ Exception -> 0x0301 }
            goto L_0x030c
        L_0x02ed:
            java.lang.Object r1 = r6.A00     // Catch:{ Exception -> 0x0301 }
            X.9n4 r1 = (X.C202989n4) r1     // Catch:{ Exception -> 0x0301 }
            X.B31 r0 = r1.A09     // Catch:{ Exception -> 0x0301 }
            if (r0 == 0) goto L_0x02f9
            r0.Azq()     // Catch:{ Exception -> 0x0301 }
            goto L_0x030c
        L_0x02f9:
            X.A2R r0 = r1.A0L     // Catch:{ Exception -> 0x0301 }
            X.9WY r0 = r0.A01     // Catch:{ Exception -> 0x0301 }
            r0.A01()     // Catch:{ Exception -> 0x0301 }
            goto L_0x030c
        L_0x0301:
            java.lang.Object r1 = r6.A00
            X.9n4 r1 = (X.C202989n4) r1
            X.A2R r0 = r1.A0L
            X.9WY r0 = r0.A01
            r0.A01()
        L_0x030c:
            X.A2R r4 = r1.A0L
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B8U.call():java.lang.Object");
    }

    public B8U(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
