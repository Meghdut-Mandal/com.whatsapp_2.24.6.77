package com.whatsapp.registration.accountdefence.ui;

import X.AnonymousClass0FM;
import X.AnonymousClass19A;
import X.C19730wQ;
import X.C19970wo;
import X.C63063Ip;
import android.app.Dialog;
import android.view.View;
import android.widget.Button;

public class DeviceConfirmationRegAlertDialogFragment extends Hilt_DeviceConfirmationRegAlertDialogFragment {
    public static C63063Ip A06;
    public View A00;
    public Button A01;
    public Button A02;
    public C19730wQ A03;
    public C19970wo A04;
    public AnonymousClass19A A05;

    public DeviceConfirmationRegAlertDialogFragment(C63063Ip r1) {
        A06 = r1;
    }

    public void A1L() {
        Dialog dialog;
        Dialog dialog2;
        super.A1L();
        if (this.A02 == null && (dialog2 = this.A02) != null) {
            this.A02 = ((AnonymousClass0FM) dialog2).A00.A0H;
        }
        if (this.A01 == null && (dialog = this.A02) != null) {
            this.A01 = ((AnonymousClass0FM) dialog).A00.A0F;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1a(android.os.Bundle r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.A0a()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131624086(0x7f0e0096, float:1.8875342E38)
            r0 = 0
            r4 = 0
            android.view.View r1 = r2.inflate(r1, r0, r4)
            r6.A00 = r1
            r0 = 2131431801(0x7f0b1179, float:1.8485341E38)
            X.C36351kA.A1A(r1, r0, r4)
            android.view.View r1 = r6.A00
            r0 = 2131431287(0x7f0b0f77, float:1.8484299E38)
            android.view.View r1 = X.C012005e.A02(r1, r0)
            r0 = 4
            r1.setVisibility(r0)
            android.view.View r1 = r6.A00
            r0 = 2131431800(0x7f0b1178, float:1.848534E38)
            android.widget.TextView r1 = X.C36391kE.A0O(r1, r0)
            r0 = 2131886261(0x7f1200b5, float:1.9407096E38)
            r1.setText(r0)
            android.view.View r1 = r6.A00
            r0 = 2131431797(0x7f0b1175, float:1.8485333E38)
            android.widget.TextView r3 = X.C36391kE.A0O(r1, r0)
            X.0wQ r0 = r6.A03
            r0.A0G()
            com.whatsapp.Me r1 = r0.A00
            if (r1 == 0) goto L_0x00ce
            java.lang.String r0 = r1.jabber_id
            if (r0 == 0) goto L_0x00ce
            X.0ts r2 = r6.A01
            java.lang.String r1 = r1.cc
            java.lang.String r0 = X.C36431kI.A1B(r1, r0)
            java.lang.String r2 = X.C65983Uf.A0D(r2, r1, r0)
            if (r2 == 0) goto L_0x00ce
            r1 = 2131886257(0x7f1200b1, float:1.9407088E38)
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            java.lang.String r0 = X.C36401kF.A0q(r6, r2, r0, r4, r1)
        L_0x0064:
            r3.setText(r0)
            android.view.View r1 = r6.A00
            r0 = 2131431798(0x7f0b1176, float:1.8485335E38)
            android.widget.TextView r5 = X.C36391kE.A0O(r1, r0)
            X.3Ip r0 = A06
            long r1 = r0.A00
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            X.0wo r3 = r6.A04
            X.0ts r2 = r6.A01
            long r0 = r0.getTime()
            X.AnonymousClass3UY.A0H(r5, r3, r2, r0)
            android.view.View r1 = r6.A00
            r0 = 2131431799(0x7f0b1177, float:1.8485337E38)
            android.widget.TextView r3 = X.C36391kE.A0O(r1, r0)
            X.3Ip r0 = A06
            java.lang.String r2 = r0.A01
            if (r2 != 0) goto L_0x00c2
            r0 = 2131886260(0x7f1200b4, float:1.9407094E38)
            java.lang.String r0 = r6.A0n(r0)
        L_0x009a:
            r3.setText(r0)
            X.1qm r3 = X.AnonymousClass3LW.A05(r6)
            android.view.View r0 = r6.A00
            r3.A0j(r0)
            r2 = 2131886256(0x7f1200b0, float:1.9407086E38)
            r1 = 44
            X.4XO r0 = new X.4XO
            r0.<init>(r6, r1)
            r3.setPositiveButton(r2, r0)
            r2 = 2131886255(0x7f1200af, float:1.9407084E38)
            r1 = 43
            X.4XO r0 = new X.4XO
            r0.<init>(r6, r1)
            X.0FM r0 = X.C36431kI.A0R(r0, r3, r2)
            return r0
        L_0x00c2:
            r1 = 2131886259(0x7f1200b3, float:1.9407092E38)
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            java.lang.String r0 = X.C36401kF.A0q(r6, r2, r0, r4, r1)
            goto L_0x009a
        L_0x00ce:
            r0 = 2131886258(0x7f1200b2, float:1.940709E38)
            java.lang.String r0 = r6.A0n(r0)
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A1a(android.os.Bundle):android.app.Dialog");
    }
}
