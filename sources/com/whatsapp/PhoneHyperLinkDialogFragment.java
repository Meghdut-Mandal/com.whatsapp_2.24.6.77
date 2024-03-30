package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass16D;
import X.AnonymousClass17Y;
import X.AnonymousClass1ND;
import X.C194529Qc;
import X.C19730wQ;
import X.C20430xY;
import X.C24801Dv;
import X.C32691e2;
import X.C32811eE;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;

public class PhoneHyperLinkDialogFragment extends Hilt_PhoneHyperLinkDialogFragment {
    public C24801Dv A00;
    public AnonymousClass17Y A01;
    public C32691e2 A02;
    public C19730wQ A03;
    public AnonymousClass1ND A04;
    public AnonymousClass16D A05;
    public C20430xY A06;
    public C194529Qc A07;
    public UserJid A08;
    public C32811eE A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;

    public static PhoneHyperLinkDialogFragment A03(UserJid userJid, String str, String str2, boolean z, boolean z2, boolean z3) {
        PhoneHyperLinkDialogFragment phoneHyperLinkDialogFragment = new PhoneHyperLinkDialogFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putBoolean("isSyncFailure", z);
        A072.putBoolean("isWAAccount", z2);
        A072.putBoolean("isPhoneNumberOwner", z3);
        A072.putString("phoneNumber", str);
        A072.putParcelable("jid", userJid);
        A072.putString("url", str2);
        phoneHyperLinkDialogFragment.A17(A072);
        return phoneHyperLinkDialogFragment;
    }

    public void A1N(int i, int i2, Intent intent) {
        if (i == 1000) {
            this.A06.A08();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1a(android.os.Bundle r8) {
        /*
            r7 = this;
            android.os.Bundle r2 = r7.A0b()
            java.lang.String r0 = "isSyncFailure"
            boolean r0 = r2.getBoolean(r0)
            r7.A0E = r0
            java.lang.String r0 = "isWAAccount"
            boolean r0 = r2.getBoolean(r0)
            r7.A0D = r0
            java.lang.String r0 = "isPhoneNumberOwner"
            boolean r0 = r2.getBoolean(r0)
            r7.A0C = r0
            X.0ts r1 = r7.A01
            java.lang.String r0 = "phoneNumber"
            java.lang.String r0 = X.C36431kI.A17(r2, r0)
            java.lang.String r0 = r1.A0H(r0)
            r7.A0A = r0
            java.lang.String r0 = "jid"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r7.A08 = r0
            java.lang.String r0 = "url"
            java.lang.String r0 = X.C36431kI.A17(r2, r0)
            r7.A0B = r0
            X.1qm r5 = X.AnonymousClass3LW.A04(r7)
            android.view.LayoutInflater r1 = r7.A0c()
            r0 = 2131625840(0x7f0e0770, float:1.88789E38)
            android.view.View r2 = X.C36381kD.A0K(r1, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            boolean r0 = r7.A0E
            if (r0 != 0) goto L_0x0061
            boolean r1 = r7.A0D
            r0 = 2131893004(0x7f121b0c, float:1.9420772E38)
            if (r1 == 0) goto L_0x005b
            r0 = 2131893005(0x7f121b0d, float:1.9420774E38)
        L_0x005b:
            r2.setText(r0)
            r5.A0Y(r2)
        L_0x0061:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            boolean r0 = r7.A0D
            r3 = 0
            r6 = 1
            if (r0 == 0) goto L_0x00cb
            r2 = 2131887846(0x7f1206e6, float:1.941031E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r7.A0A
            java.lang.String r1 = X.C36401kF.A0q(r7, r0, r1, r3, r2)
            X.61f r0 = new X.61f
            r0.<init>(r1, r6)
            r4.add(r0)
            X.0wQ r1 = r7.A03
            com.whatsapp.jid.UserJid r0 = r7.A08
            boolean r0 = r1.A0M(r0)
            if (r0 != 0) goto L_0x0098
            r0 = 2131887463(0x7f120567, float:1.9409534E38)
            java.lang.String r2 = r7.A0n(r0)
            r1 = 4
        L_0x0090:
            X.61f r0 = new X.61f
            r0.<init>(r2, r1)
            r4.add(r0)
        L_0x0098:
            X.0wQ r0 = r7.A03
            boolean r0 = r0.A0L()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00b2
            r0 = 2131886426(0x7f12015a, float:1.940743E38)
            java.lang.String r2 = r7.A0n(r0)
            r1 = 3
            X.61f r0 = new X.61f
            r0.<init>(r2, r1)
            r4.add(r0)
        L_0x00b2:
            android.content.Context r2 = r7.A0a()
            r0 = 2131625839(0x7f0e076f, float:1.8878897E38)
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r1.<init>(r2, r0, r4)
            X.7qC r0 = new X.7qC
            r0.<init>(r4, r7, r3)
            r5.A0O(r0, r1)
            X.0FM r0 = r5.create()
            return r0
        L_0x00cb:
            r2 = 2131888823(0x7f120ab7, float:1.9412292E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r7.A0A
            java.lang.String r2 = X.C36401kF.A0q(r7, r0, r1, r3, r2)
            r1 = 2
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.PhoneHyperLinkDialogFragment.A1a(android.os.Bundle):android.app.Dialog");
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.A07.A00(Boolean.valueOf(this.A0C), Boolean.valueOf(this.A0D), 8);
    }
}
