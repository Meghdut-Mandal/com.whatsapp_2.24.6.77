package X;

/* renamed from: X.3vk  reason: invalid class name and case insensitive filesystem */
public class C80653vk implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public C80653vk(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A05 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
        this.A03 = obj3;
        this.A04 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0081, code lost:
        if (r2.A04.A0E(4643) == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a0, code lost:
        if (r2.A04.A0E(6222) == false) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.A05
            switch(r1) {
                case 0: goto L_0x0130;
                case 1: goto L_0x0020;
                case 2: goto L_0x011a;
                case 3: goto L_0x0031;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r0.A01
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.lang.Object r4 = r0.A02
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r4 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r4
            int r3 = r0.A00
            java.lang.Object r2 = r0.A03
            java.lang.Object r1 = r0.A04
            X.1qW r1 = (X.C38941qW) r1
            if (r5 == 0) goto L_0x0021
            android.net.Uri[] r0 = r4.A0M
            r0[r3] = r2
            r1.setScreenshot(r5)
        L_0x0020:
            return
        L_0x0021:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "InAppBugReporting/screenshot/bitmap is null "
            X.C36321k7.A1J(r2, r0, r1)
            r0 = 2131889297(0x7f120c91, float:1.9413254E38)
            r4.BO5(r0)
            return
        L_0x0031:
            java.lang.Object r13 = r0.A01
            android.view.View r13 = (android.view.View) r13
            java.lang.Object r6 = r0.A02
            X.4mL r6 = (X.C95824mL) r6
            java.lang.Object r5 = r0.A03
            X.6bq r5 = (X.C134936bq) r5
            int r4 = r0.A00
            java.lang.Object r3 = r0.A04
            X.6c4 r3 = (X.C135066c4) r3
            r15 = 0
            X.AnonymousClass00C.A0D(r13, r15)
            r1 = 1
            android.content.Context r12 = r13.getContext()
            X.0yC r8 = r6.A04
            int r16 = X.C55822vF.A00(r8)
            r14 = 8388613(0x800005, float:1.175495E-38)
            X.0Ws r11 = new X.0Ws
            r11.<init>(r12, r13, r14, r15, r16)
            android.content.Context r0 = r11.A02
            X.0EG r2 = new X.0EG
            r2.<init>(r0)
            r0 = 2131820560(0x7f110010, float:1.9273838E38)
            X.07a r7 = r11.A03
            r2.inflate(r0, r7)
            r0 = 2131430448(0x7f0b0c30, float:1.8482597E38)
            android.view.MenuItem r10 = r7.findItem(r0)
            X.3Kn r2 = r6.A05
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x0083
            X.0yC r9 = r2.A04
            r0 = 4643(0x1223, float:6.506E-42)
            boolean r9 = r9.A0E(r0)
            r0 = 1
            if (r9 != 0) goto L_0x0084
        L_0x0083:
            r0 = 0
        L_0x0084:
            r10.setVisible(r0)
            r0 = 2131430446(0x7f0b0c2e, float:1.8482593E38)
            r9 = 2131430446(0x7f0b0c2e, float:1.8482593E38)
            android.view.MenuItem r10 = r7.findItem(r0)
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x00a2
            X.0yC r2 = r2.A04
            r0 = 6222(0x184e, float:8.719E-42)
            boolean r2 = r2.A0E(r0)
            r0 = 1
            if (r2 != 0) goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            r10.setVisible(r0)
            android.view.MenuItem r10 = r7.findItem(r9)
            android.content.Context r2 = r13.getContext()
            r0 = 2131897044(0x7f122ad4, float:1.9428966E38)
            java.lang.String r0 = r2.getString(r0)
            r10.setTitle(r0)
            X.1AP r0 = r6.A00
            boolean r0 = r0.A0G(r3)
            if (r0 == 0) goto L_0x00d2
            android.view.MenuItem r9 = r7.findItem(r9)
            android.content.Context r2 = r13.getContext()
            r0 = 2131894601(0x7f122149, float:1.9424011E38)
            java.lang.String r0 = r2.getString(r0)
            r9.setTitle(r0)
        L_0x00d2:
            r7.setGroupDividerEnabled(r1)
            boolean r0 = X.C36361kB.A1Y(r8)
            if (r0 == 0) goto L_0x00dd
            r7.A0C = r1
        L_0x00dd:
            X.3XM r9 = r6.A06
            if (r9 == 0) goto L_0x0107
            r0 = 2131430451(0x7f0b0c33, float:1.8482603E38)
            android.view.MenuItem r8 = r7.findItem(r0)
            if (r8 == 0) goto L_0x0107
            android.content.Context r7 = X.C36371kC.A0B(r13)
            java.lang.Boolean r0 = r9.A00
            boolean r0 = X.C36371kC.A1X(r0, r1)
            r2 = 2131896964(0x7f122a84, float:1.9428804E38)
            if (r0 == 0) goto L_0x00fc
            r2 = 2131894073(0x7f121f39, float:1.942294E38)
        L_0x00fc:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r9.A02
            java.lang.String r0 = X.C36351kA.A0x(r7, r0, r1, r15, r2)
            r8.setTitle(r0)
        L_0x0107:
            X.3a2 r0 = new X.3a2
            r0.<init>(r6, r5, r3, r4)
            r11.A01 = r0
            X.17Y r1 = r6.A03
            r0 = 13
            X.3v5 r0 = X.C80243v5.A00(r11, r0)
            r1.A0H(r0)
            return
        L_0x011a:
            java.lang.Object r4 = r0.A01
            com.whatsapp.calling.service.VoiceServiceEventCallback r4 = (com.whatsapp.calling.service.VoiceServiceEventCallback) r4
            java.lang.Object r3 = r0.A02
            com.whatsapp.voipcalling.Voip$RecordingInfo[] r3 = (com.whatsapp.voipcalling.Voip.RecordingInfo[]) r3
            java.lang.Object r2 = r0.A03
            com.whatsapp.voipcalling.Voip$DebugTapType r2 = (com.whatsapp.voipcalling.Voip.DebugTapType) r2
            java.lang.Object r1 = r0.A04
            byte[] r1 = (byte[]) r1
            int r0 = r0.A00
            r4.m9lambda$callCaptureBufferFilled$1$comwhatsappcallingserviceVoiceServiceEventCallback(r3, r2, r1, r0)
            return
        L_0x0130:
            java.lang.Object r4 = r0.A03
            X.3Oq r4 = (X.C64603Oq) r4
            java.lang.Object r3 = r0.A02
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r0.A04
            X.6KW r2 = (X.AnonymousClass6KW) r2
            java.lang.Object r1 = r0.A01
            X.67i r1 = (X.C1271967i) r1
            int r0 = r0.A00
            X.6Mp r0 = X.AnonymousClass6KW.A00(r2, r1, r0)
            r4.A01(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80653vk.run():void");
    }
}
