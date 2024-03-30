package com.whatsapp.account.delete;

import X.AnonymousClass000;
import X.AnonymousClass155;
import X.AnonymousClass1C4;
import X.AnonymousClass1EV;
import X.AnonymousClass1RU;
import X.AnonymousClass1UA;
import X.AnonymousClass1WQ;
import X.AnonymousClass1ZW;
import X.AnonymousClass3LW;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C36421kH;
import X.C36441kJ;
import X.C39001qm;
import X.C89314Wb;
import X.C89924Yk;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public class DeleteAccountConfirmation extends AnonymousClass155 {
    public int A00;
    public Handler A01;
    public View A02;
    public ScrollView A03;
    public C19460v5 A04;
    public WaTextView A05;
    public WaTextView A06;
    public AnonymousClass1WQ A07;
    public AnonymousClass1RU A08;
    public AnonymousClass1UA A09;
    public AnonymousClass1C4 A0A;
    public AnonymousClass1EV A0B;
    public WDSButton A0C;
    public AnonymousClass1ZW A0D;
    public boolean A0E;

    public Dialog onCreateDialog(int i) {
        C39001qm r3;
        int i2;
        int i3;
        if (i != 1) {
            if (i == 2) {
                r3 = AnonymousClass3LW.A00(this);
                r3.A0p(C36341k9.A0e(this, new Object[1], R.string.f12nameremoved, 0, R.string.f12nameremoved));
                i2 = R.string.f12nameremoved;
                i3 = 8;
            } else if (i != 3) {
                return super.onCreateDialog(i);
            } else {
                r3 = AnonymousClass3LW.A00(this);
                r3.A0c(R.string.f12nameremoved);
                i2 = R.string.f12nameremoved;
                i3 = 9;
            }
            C39001qm.A0I(r3, this, i3, i2);
            return r3.create();
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        C36391kE.A17(progressDialog, this, R.string.f12nameremoved);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    public void A2F() {
        if (!this.A0E) {
            this.A0E = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A0A = C36421kH.A0Q(A0B2);
            this.A07 = (AnonymousClass1WQ) A0B2.A2g.get();
            this.A08 = C36351kA.A0R(A0B2);
            this.A09 = (AnonymousClass1UA) A0B2.A3F.get();
            this.A0B = C36371kC.A0h(A0B2);
            this.A04 = C19470v6.A00;
        }
    }

    public DeleteAccountConfirmation(int i) {
        this.A0E = false;
        C89314Wb.A00(this, 11);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C89924Yk.A00(this.A03.getViewTreeObserver(), this, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            X.0wQ r0 = r5.A02
            X.13w r0 = r0.A08()
            r3 = 1
            if (r0 != 0) goto L_0x0013
            android.content.Intent r0 = X.AnonymousClass190.A02(r5)
            r5.A33(r0, r3)
        L_0x0013:
            X.12U r1 = r5.A0A
            X.1lq r0 = new X.1lq
            r0.<init>(r5, r1)
            r5.A01 = r0
            X.3ch r0 = new X.3ch
            r0.<init>(r5)
            r5.A0D = r0
            r0 = 2131894130(0x7f121f72, float:1.9423056E38)
            r5.setTitle(r0)
            X.07B r0 = r5.getSupportActionBar()
            if (r0 == 0) goto L_0x0032
            r0.A0U(r3)
        L_0x0032:
            r0 = 2131624785(0x7f0e0351, float:1.887676E38)
            r5.setContentView((int) r0)
            r0 = 2131433566(0x7f0b185e, float:1.8488921E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r5.A03 = r0
            r0 = 2131428151(0x7f0b0337, float:1.8477938E38)
            android.view.View r0 = r5.findViewById(r0)
            r5.A02 = r0
            r0 = 2131429458(0x7f0b0852, float:1.848059E38)
            android.view.View r0 = r5.findViewById(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r5.A0C = r0
            r0 = 2131429456(0x7f0b0850, float:1.8480585E38)
            android.view.View r0 = r5.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r5.A06 = r0
            r0 = 2131429453(0x7f0b084d, float:1.848058E38)
            android.view.View r0 = r5.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r5.A05 = r0
            com.whatsapp.wds.components.button.WDSButton r1 = r5.A0C
            r0 = 22
            X.C66923Xv.A01(r1, r5, r0)
            r4 = 8
            X.1RU r0 = r5.A08     // Catch:{ 0wR -> 0x009e }
            X.3KU r0 = r0.A03()     // Catch:{ 0wR -> 0x009e }
            if (r0 == 0) goto L_0x0093
            X.0ts r2 = r5.A00     // Catch:{ 0wR -> 0x009e }
            java.lang.String r1 = r0.A07     // Catch:{ 0wR -> 0x009e }
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.PhoneUserJid.WHATSAPP_CAPS_SURVEY     // Catch:{ 0wR -> 0x009e }
            com.whatsapp.jid.PhoneUserJid r0 = X.C222913s.A00(r1)     // Catch:{ 0wR -> 0x009e }
            java.lang.String r0 = X.AnonymousClass3U8.A04(r0)     // Catch:{ 0wR -> 0x009e }
            java.lang.String r1 = r2.A0H(r0)     // Catch:{ 0wR -> 0x009e }
            if (r1 == 0) goto L_0x0098
            goto L_0x00ae
        L_0x0093:
            java.lang.String r0 = "DeleteAccountConfirmation/setupDeleteAccountPhoneNumberTextView/currentAccount is null "
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 0wR -> 0x009e }
        L_0x0098:
            com.whatsapp.WaTextView r0 = r5.A06
            r0.setVisibility(r4)
            goto L_0x00b3
        L_0x009e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "DeleteAccountConfirmation/setupDeleteAccountPhoneNumberTextView/InvalidJidException : "
            X.C36321k7.A1J(r2, r0, r1)
            com.whatsapp.WaTextView r0 = r5.A06
            r0.setVisibility(r4)
            goto L_0x00b3
        L_0x00ae:
            com.whatsapp.WaTextView r0 = r5.A06
            r0.setText(r1)
        L_0x00b3:
            r0 = 2131894125(0x7f121f6d, float:1.9423046E38)
            java.lang.String r2 = r5.getString(r0)
            android.content.Context r0 = r5.getApplicationContext()
            boolean r0 = X.C34191gb.A08(r0)
            if (r0 == 0) goto L_0x0114
            X.0v0 r0 = r5.A09
            java.lang.String r0 = r0.A0c()
            if (r0 == 0) goto L_0x0114
            X.1EV r0 = r5.A0B
            boolean r1 = r0.A03()
            r0 = 2131894126(0x7f121f6e, float:1.9423048E38)
            if (r1 == 0) goto L_0x00da
            r0 = 2131894127(0x7f121f6f, float:1.942305E38)
        L_0x00da:
            java.lang.String r2 = X.C36351kA.A0w(r5, r2, r3, r0)
        L_0x00de:
            com.whatsapp.WaTextView r0 = r5.A05
            r0.setText(r2)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131168241(0x7f070bf1, float:1.7950778E38)
            r2 = 2131168241(0x7f070bf1, float:1.7950778E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5.A00 = r0
            X.1WQ r1 = r5.A07
            X.1ZW r0 = r5.A0D
            r1.registerObserver(r0)
            int r0 = X.C36361kB.A02(r5, r2)
            r5.A00 = r0
            android.widget.ScrollView r0 = r5.A03
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r1 = 0
            X.C89634Xh.A00(r0, r5, r1)
            android.widget.ScrollView r0 = r5.A03
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            X.C89924Yk.A00(r0, r5, r1)
            return
        L_0x0114:
            X.1EV r0 = r5.A0B
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x00de
            r0 = 2131894128(0x7f121f70, float:1.9423052E38)
            goto L_0x00da
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.account.delete.DeleteAccountConfirmation.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        this.A07.unregisterObserver(this.A0D);
        this.A01.removeMessages(0);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onResume() {
        super.onResume();
        int A082 = C36441kJ.A08(this);
        if (!this.A0A.A03() && A082 != 6) {
            C36321k7.A1S("DeleteAccountConfirmation/wrong-state bounce to main ", AnonymousClass000.A0u(), A082);
            C36351kA.A12(this);
        }
    }

    public DeleteAccountConfirmation() {
        this(0);
    }
}
