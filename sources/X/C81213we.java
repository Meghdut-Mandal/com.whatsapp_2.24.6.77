package X;

import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.3we  reason: invalid class name and case insensitive filesystem */
public class C81213we implements Runnable {
    public long A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public C81213we(PhotoView photoView) {
        this.A03 = 2;
        this.A01 = photoView;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.whatsapp.registration.email.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.whatsapp.registration.email.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.3wX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.whatsapp.registration.email.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.whatsapp.email.VerifyEmailActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: X.3wU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: com.whatsapp.registration.email.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: com.whatsapp.registration.email.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: com.whatsapp.registration.email.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: X.3wX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: com.whatsapp.registration.email.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: com.whatsapp.registration.email.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: com.whatsapp.registration.email.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: X.3wX} */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d6, code lost:
        r1.show();
        r0.A05.A0I(r3, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x020e, code lost:
        r0.BO6(r0.getString(r5, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0215, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0216, code lost:
        r0.BO5(com.whatsapp.R.string.f12nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x021c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r22 = this;
            r5 = r22
            int r0 = r5.A03
            switch(r0) {
                case 0: goto L_0x001d;
                case 1: goto L_0x0112;
                case 2: goto L_0x00b6;
                case 3: goto L_0x019a;
                case 4: goto L_0x00e9;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r5.A01
            com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver r3 = (com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver) r3
            long r6 = r5.A00
            boolean r8 = r5.A02
            X.1Jh r0 = r3.A07
            X.3KV r4 = r0.A01(r6)
            if (r4 != 0) goto L_0x0106
            java.lang.String r0 = "ScheduleCallBroadcastReceiver/onScheduleCallStart scheduled call not exist"
        L_0x0019:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x001c:
            return
        L_0x001d:
            java.lang.Object r0 = r5.A01
            X.3bh r0 = (X.C68313bh) r0
            X.3OC r6 = r0.A00
            long r3 = r5.A00
            boolean r2 = r5.A02
            r1 = 1
            int r0 = r6.A01
            int r0 = r0 - r1
            r6.A01 = r0
            if (r2 == 0) goto L_0x005d
            int r0 = r6.A00
            int r0 = r0 + 1
            r6.A00 = r0
            java.util.Map r2 = r6.A07
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            X.2nl r0 = X.C51402nl.GESTURE_IS_HANDLED_BY_ENGINE
            r2.put(r1, r0)
            java.util.Map r0 = r6.A08
            java.lang.Object r5 = r0.remove(r1)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x021d
            r2 = 0
        L_0x004b:
            int r0 = r5.size()
            if (r2 >= r0) goto L_0x0238
            r5.get(r2)
            r1 = 0
            com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchServiceImpl r0 = r6.A04
            r0.sendNativeGesture(r1)
            int r2 = r2 + 1
            goto L_0x004b
        L_0x005d:
            java.util.Map r2 = r6.A07
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            X.2nl r0 = X.C51402nl.GESTURE_IS_HANDLED_BY_CLIENT
            r2.put(r1, r0)
            java.util.Map r0 = r6.A08
            java.lang.Object r1 = r0.remove(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x009a
            int r0 = X.C36431kI.A07(r1)
            r1.get(r0)
        L_0x0079:
            int r0 = r6.A01
            if (r0 != 0) goto L_0x001c
            java.util.List r0 = r6.A05
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r0)
            r0.clear()
            java.util.Set r0 = r6.A09
            r0.addAll(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0090:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001c
            r1.next()
            goto L_0x0090
        L_0x009a:
            java.util.Map r2 = r6.A06
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r1 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.TAP
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r2.get(r1)
            long r1 = X.C36431kI.A09(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0079
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.TAP
            X.AnonymousClass3OC.A00(r6, r0)
            goto L_0x0079
        L_0x00b6:
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x001c
            long r3 = r5.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c8
            long r3 = java.lang.System.currentTimeMillis()
            r5.A00 = r3
        L_0x00c8:
            long r0 = X.C36441kJ.A0A(r3)
            float r3 = (float) r0
            r1 = 0
            float r0 = (float) r1
            float r3 = r3 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x023e
            r0 = 1
            r5.A02 = r0
            java.lang.Object r1 = r5.A01
            android.view.View r1 = (android.view.View) r1
            r1.invalidate()
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x001c
            r1.post(r5)
            return
        L_0x00e9:
            java.lang.Object r4 = r5.A01
            com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver r4 = (com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver) r4
            long r2 = r5.A00
            boolean r1 = r5.A02
            X.1Jh r0 = r4.A07
            X.3KV r2 = r0.A01(r2)
            if (r2 != 0) goto L_0x00fd
            java.lang.String r0 = "ScheduleCallBroadcastReceiver/onAdvanceAlert scheduled call not exist"
            goto L_0x0019
        L_0x00fd:
            if (r1 != 0) goto L_0x001c
            r1 = 1
            X.3Eq r0 = r4.A03
            r0.A00(r2, r1)
            return
        L_0x0106:
            X.17Y r0 = r3.A01
            r5 = 2
            X.3wh r2 = new X.3wh
            r2.<init>(r3, r4, r5, r6, r8)
            r0.A0H(r2)
            return
        L_0x0112:
            java.lang.Object r0 = r5.A01
            com.whatsapp.email.VerifyEmailActivity r0 = (com.whatsapp.email.VerifyEmailActivity) r0
            boolean r4 = r5.A02
            long r1 = r5.A00
            r7 = 0
            X.9Pi r8 = r0.A05
            if (r8 == 0) goto L_0x0193
            java.lang.String r9 = r0.A0A
            int r11 = r0.A00
            r12 = 8
            r13 = 2
            r14 = 1
            r10 = 0
            r8.A00(r9, r10, r11, r12, r13, r14)
            X.AnonymousClass3SJ.A00(r0, r13)
            X.0v0 r3 = r0.A09
            r3.A23(r4)
            if (r4 == 0) goto L_0x0146
            r1 = 44
            X.3wU r3 = new X.3wU
            r3.<init>((java.lang.Object) r0, (int) r1)
            X.0FM r1 = X.C65983Uf.A02(r0)
            if (r1 != 0) goto L_0x01d6
            r3.run()
            return
        L_0x0146:
            X.9Pi r15 = r0.A05
            if (r15 == 0) goto L_0x018c
            java.lang.String r4 = r0.A0A
            int r3 = r0.A00
            java.lang.String r17 = "OTP_CODE_INPUT_ERROR"
            r19 = 8
            r20 = 2
            r21 = 2
            r16 = r4
            r18 = r3
            r15.A00(r16, r17, r18, r19, r20, r21)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r5 = r3.toMillis(r1)
            long r3 = X.C36431kI.A08(r0)
            long r5 = r5 + r3
            r0.A01 = r5
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            com.whatsapp.email.VerifyEmailActivity.A0G(r0, r3)
            r4 = 0
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0216
            r5 = 2131889036(0x7f120b8c, float:1.9412724E38)
            java.lang.Object[] r6 = new java.lang.Object[r14]
            X.0ts r4 = r0.A00
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = r3.toMillis(r1)
            java.lang.String r1 = X.AnonymousClass3UY.A0D(r4, r1)
            r6[r7] = r1
            goto L_0x020e
        L_0x018c:
            java.lang.String r0 = "emailVerificationLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0193:
            java.lang.String r0 = "emailVerificationLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x019a:
            java.lang.Object r0 = r5.A01
            com.whatsapp.registration.email.VerifyEmail r0 = (com.whatsapp.registration.email.VerifyEmail) r0
            boolean r4 = r5.A02
            long r1 = r5.A00
            r9 = 0
            r15 = 2
            X.AnonymousClass3SJ.A00(r0, r15)
            X.9Pi r10 = r0.A3i()
            java.lang.String r11 = r0.A0F
            int r13 = r0.A00
            r6 = 1
            if (r4 == 0) goto L_0x01d1
            r16 = 1
            r12 = 0
        L_0x01b5:
            r14 = 8
            r10.A00(r11, r12, r13, r14, r15, r16)
            X.0v0 r3 = r0.A09
            r3.A23(r4)
            if (r4 == 0) goto L_0x01e1
            r1 = 41
            X.3wX r3 = X.C81143wX.A00(r0, r1)
            X.0FM r1 = X.C65983Uf.A02(r0)
            if (r1 != 0) goto L_0x01d6
            r3.run()
            return
        L_0x01d1:
            r16 = 2
            java.lang.String r12 = "OTP_CODE_INPUT_ERROR"
            goto L_0x01b5
        L_0x01d6:
            r1.show()
            X.17Y r2 = r0.A05
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.A0I(r3, r0)
            return
        L_0x01e1:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r7 = r3.toMillis(r1)
            long r3 = X.C36431kI.A08(r0)
            long r7 = r7 + r3
            r0.A01 = r7
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            com.whatsapp.registration.email.VerifyEmail.A0F(r0, r3)
            r4 = 0
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0216
            r5 = 2131889036(0x7f120b8c, float:1.9412724E38)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            X.0ts r4 = r0.A00
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = r3.toMillis(r1)
            java.lang.String r1 = X.AnonymousClass3UY.A0D(r4, r1)
            r6[r9] = r1
        L_0x020e:
            java.lang.String r1 = r0.getString(r5, r6)
            r0.BO6(r1)
            return
        L_0x0216:
            r1 = 2131889035(0x7f120b8b, float:1.9412722E38)
            r0.BO5(r1)
            return
        L_0x021d:
            java.util.Map r2 = r6.A06
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r1 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.TAP
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0238
            java.lang.Object r0 = r2.get(r1)
            long r1 = X.C36431kI.A09(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0238
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.TAP
            X.AnonymousClass3OC.A00(r6, r0)
        L_0x0238:
            java.util.List r0 = r6.A05
            r0.clear()
            return
        L_0x023e:
            java.lang.String r0 = "left"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81213we.run():void");
    }

    public C81213we(Object obj, int i, long j, boolean z) {
        this.A03 = i;
        this.A01 = obj;
        this.A00 = j;
        this.A02 = z;
    }
}
