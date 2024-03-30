package X;

import android.view.View;
import com.whatsapp.waffle.wfac.ui.WfacBanInfoFragment;

/* renamed from: X.6cx  reason: invalid class name and case insensitive filesystem */
public class C135596cx implements View.OnClickListener {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    public C135596cx(WfacBanInfoFragment wfacBanInfoFragment, int i, int i2, int i3) {
        this.A03 = i3;
        if (1 - i3 != 0) {
            this.A02 = wfacBanInfoFragment;
            this.A00 = i;
        } else {
            this.A02 = wfacBanInfoFragment;
            this.A00 = 1;
        }
        this.A01 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0089, code lost:
        if (X.AnonymousClass1L0.A00(r4, "com.facebook.wakizashi") != -1) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A03
            switch(r0) {
                case 0: goto L_0x0016;
                case 1: goto L_0x0036;
                case 2: goto L_0x0064;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r10.A02
            com.whatsapp.waffle.wfac.ui.WfacUnbanDecisionFragment r2 = (com.whatsapp.waffle.wfac.ui.WfacUnbanDecisionFragment) r2
            int r6 = r10.A00
            int r5 = r10.A01
            com.whatsapp.waffle.wfac.ui.WfacBanViewModel r1 = r2.A01
            if (r1 != 0) goto L_0x00a6
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x0016:
            java.lang.Object r2 = r10.A02
            com.whatsapp.waffle.wfac.ui.WfacBanDecisionFragment r2 = (com.whatsapp.waffle.wfac.ui.WfacBanDecisionFragment) r2
            int r6 = r10.A00
            int r5 = r10.A01
            com.whatsapp.waffle.wfac.ui.WfacBanViewModel r1 = r2.A00
            if (r1 == 0) goto L_0x0031
            X.01I r0 = r2.A0i()
            r1.A0U(r0)
            X.3Fm r1 = r2.A1Z()
            java.lang.String r0 = "reg_new_number_started"
            goto L_0x00b3
        L_0x0031:
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x0036:
            java.lang.Object r6 = r10.A02
            com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment r6 = (com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment) r6
            int r5 = r10.A01
            r4 = 1
            r0 = 3
            X.AnonymousClass00C.A0D(r11, r0)
            android.content.Context r3 = X.C36371kC.A0B(r11)
            X.1Dv r2 = r6.A00
            if (r2 == 0) goto L_0x005d
            java.lang.String r0 = "https://instagram.com"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            r0 = 0
            r2.Bp7(r3, r1, r0)
            X.3Fm r1 = r6.A1Z()
            java.lang.String r0 = "redirect_to_source_app"
            r1.A01(r0, r4, r5)
            return
        L_0x005d:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0064:
            java.lang.Object r7 = r10.A02
            com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment r7 = (com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment) r7
            int r6 = r10.A00
            int r5 = r10.A01
            r0 = 3
            X.AnonymousClass00C.A0D(r11, r0)
            android.content.Context r4 = X.C36371kC.A0B(r11)
            java.lang.String r0 = "com.facebook.katana"
            long r1 = X.AnonymousClass1L0.A00(r4, r0)
            r8 = -1
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = "com.facebook.wakizashi"
            long r2 = X.AnonymousClass1L0.A00(r4, r0)
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r0 = 0
            if (r1 == 0) goto L_0x008c
        L_0x008b:
            r0 = 1
        L_0x008c:
            r2 = 0
            X.1Dv r1 = r7.A00
            if (r1 == 0) goto L_0x00b7
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = "fb://feed/"
        L_0x0095:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.Bp7(r4, r0, r2)
            X.3Fm r1 = r7.A1Z()
            java.lang.String r0 = "redirect_to_source_app"
            goto L_0x00b3
        L_0x00a3:
            java.lang.String r0 = "https://m.facebook.com"
            goto L_0x0095
        L_0x00a6:
            X.01I r0 = r2.A0i()
            r1.A0U(r0)
            X.3Fm r1 = r2.A1Z()
            java.lang.String r0 = "account_verification_started"
        L_0x00b3:
            r1.A01(r0, r6, r5)
            return
        L_0x00b7:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135596cx.onClick(android.view.View):void");
    }

    public C135596cx(Object obj, int i, int i2, int i3) {
        this.A03 = i3;
        this.A02 = obj;
        this.A00 = i;
        this.A01 = i2;
    }
}
