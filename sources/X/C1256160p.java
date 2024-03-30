package X;

import com.whatsapp.camera.mode.CameraModeTabLayout;

/* renamed from: X.60p  reason: invalid class name and case insensitive filesystem */
public final class C1256160p {
    public final CameraModeTabLayout A00;

    public C1256160p(C157287ci r3, CameraModeTabLayout cameraModeTabLayout, boolean z) {
        AnonymousClass00C.A0D(cameraModeTabLayout, 2);
        this.A00 = cameraModeTabLayout;
        cameraModeTabLayout.A01 = r3;
        if (z) {
            AnonymousClass6DR r1 = cameraModeTabLayout.A08;
            if (r1.A03 == cameraModeTabLayout) {
                cameraModeTabLayout.A0D(r1.A00);
                return;
            }
            throw AnonymousClass001.A08("Tab does not belong to this TabLayout.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0 != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (X.C36351kA.A1Y(r4.getWhatsAppLocale()) == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (X.C36401kF.A1X(r4.getWhatsAppLocale()) == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(float r7) {
        /*
            r6 = this;
            com.whatsapp.camera.mode.CameraModeTabLayout r4 = r6.A00
            r3 = 1
            r4.A06 = r3
            int r5 = r4.getSelectedTabPosition()
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0019
            X.0ts r0 = r4.getWhatsAppLocale()
            boolean r0 = X.C36351kA.A1Y(r0)
            r2 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0029
            X.0ts r0 = r4.getWhatsAppLocale()
            boolean r1 = X.C36401kF.A1X(r0)
            r0 = 1
            if (r1 != 0) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r2 != 0) goto L_0x0030
            int r2 = r5 + -1
            if (r0 == 0) goto L_0x0032
        L_0x0030:
            int r2 = r5 + 1
        L_0x0032:
            boolean r1 = X.C36431kI.A1P(r2)
            java.util.ArrayList r0 = r4.A0h
            int r0 = r0.size()
            int r0 = r0 - r3
            if (r2 > r0) goto L_0x0040
            r3 = 0
        L_0x0040:
            r1 = r1 | r3
            if (r1 != 0) goto L_0x004c
            X.6DR r0 = r4.A09(r2)
            if (r0 == 0) goto L_0x004c
            r0.A00()
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1256160p.A00(float):void");
    }
}
