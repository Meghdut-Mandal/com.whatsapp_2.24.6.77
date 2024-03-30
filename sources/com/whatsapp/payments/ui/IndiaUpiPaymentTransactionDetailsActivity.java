package com.whatsapp.payments.ui;

import X.AF7;
import X.AnonymousClass02E;
import X.AnonymousClass04H;
import X.AnonymousClass0D3;
import X.AnonymousClass0FM;
import X.AnonymousClass3LW;
import X.AnonymousClass3UF;
import X.AnonymousClass4OT;
import X.AnonymousClass5YM;
import X.AnonymousClass7hI;
import X.AnonymousClass9DY;
import X.AnonymousClass9DZ;
import X.AnonymousClass9FZ;
import X.AnonymousClass9RT;
import X.AnonymousClass9c5;
import X.B7Z;
import X.B84;
import X.B9J;
import X.C164717sG;
import X.C165567td;
import X.C165587tf;
import X.C165617ti;
import X.C167797yq;
import X.C173878Tm;
import X.C175928bI;
import X.C176658cT;
import X.C179678kW;
import X.C179698kY;
import X.C179708kZ;
import X.C179728kb;
import X.C179748kd;
import X.C179758ke;
import X.C179798ki;
import X.C180228lP;
import X.C180338lb;
import X.C18800tq;
import X.C18830tt;
import X.C193689Ml;
import X.C195389Uc;
import X.C201599jw;
import X.C201659k4;
import X.C202319lY;
import X.C204139pW;
import X.C21263AEt;
import X.C24611Dc;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C39001qm;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;
import java.util.GregorianCalendar;
import java.util.List;

public class IndiaUpiPaymentTransactionDetailsActivity extends PaymentTransactionDetailsListActivity implements AnonymousClass7hI, AnonymousClass4OT {
    public AnonymousClass9DY A00;
    public AnonymousClass9DZ A01;
    public C201659k4 A02;
    public C195389Uc A03;
    public AnonymousClass9RT A04;
    public AF7 A05;
    public IndiaUpiDobPickerBottomSheet A06;
    public C180338lb A07;
    public AnonymousClass9c5 A08;
    public boolean A09;
    public final C176658cT A0A;
    public final C24611Dc A0B;

    private void A0I() {
        this.A05.BOm(C36361kB.A0i(), 138, "payment_transaction_details", (String) null);
    }

    public void A2F() {
        if (!this.A09) {
            this.A09 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173878Tm.A0H(r2, r1, this);
            C173878Tm.A0G(r2, r1, this);
            C173878Tm.A0F(A0L, r2, r1, this, C173878Tm.A01(r2, this));
            C173878Tm.A07(A0L, r2, r1, this);
            this.A02 = (C201659k4) r2.APO.get();
            this.A08 = (AnonymousClass9c5) r1.A7P.get();
            this.A05 = C165587tf.A0V(r2);
            this.A03 = C165587tf.A0U(r1);
            this.A04 = (AnonymousClass9RT) r1.AAk.get();
            this.A00 = (AnonymousClass9DY) A0L.A2q.get();
            this.A01 = (AnonymousClass9DZ) A0L.A2r.get();
        }
    }

    public C167797yq A3k(Bundle bundle) {
        AnonymousClass04H A0A2;
        Class cls;
        if (bundle == null) {
            bundle = C36371kC.A0H(this);
        }
        if (bundle == null || !bundle.getBoolean("extra_new_mandate_transaction", false)) {
            A0A2 = C165617ti.A0A(new B9J(bundle, this, 3), this);
            cls = C180338lb.class;
        } else {
            A0A2 = C165617ti.A0A(new B9J(bundle, this, 2), this);
            cls = C180228lP.class;
        }
        C180338lb r0 = (C180338lb) A0A2.A00(cls);
        this.A07 = r0;
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x024b, code lost:
        r1.A0c(r0);
        r1.A0h((android.content.DialogInterface.OnClickListener) null, com.whatsapp.R.string.f12nameremoved);
        r1.A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0257, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x027e, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0281, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3l(X.C194139Og r13) {
        /*
            r12 = this;
            X.9lY r3 = r13.A05
            if (r3 == 0) goto L_0x000e
            X.8cT r1 = r12.A0A
            boolean r0 = r3.A0Q
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
        L_0x000e:
            int r2 = r13.A00
            r0 = 4
            java.lang.String r9 = "payment_transaction_details"
            r11 = 1
            if (r2 == r0) goto L_0x00aa
            r0 = 9
            if (r2 == r0) goto L_0x008a
            r0 = 10
            if (r2 != r0) goto L_0x002b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0 = 39
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.A3m(r1, r0)
        L_0x002b:
            boolean r0 = r13 instanceof X.C180268lU
            r1 = 7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            if (r0 == 0) goto L_0x006d
            r5 = r13
            X.8lU r5 = (X.C180268lU) r5
            r6 = 4
            r4 = 0
            r3 = 0
            switch(r2) {
                case 101: goto L_0x00c4;
                case 102: goto L_0x0120;
                case 103: goto L_0x0180;
                case 104: goto L_0x003d;
                case 105: goto L_0x019c;
                case 106: goto L_0x01d5;
                case 107: goto L_0x01e0;
                case 108: goto L_0x01ee;
                case 109: goto L_0x01fc;
                case 110: goto L_0x020d;
                case 111: goto L_0x021e;
                case 112: goto L_0x0227;
                case 113: goto L_0x0041;
                case 114: goto L_0x023e;
                case 115: goto L_0x0258;
                case 116: goto L_0x0272;
                default: goto L_0x003d;
            }
        L_0x003d:
            super.A3l(r13)
            return
        L_0x0041:
            java.lang.Class<com.whatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity> r0 = com.whatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity.class
            android.content.Intent r2 = X.C36441kJ.A0H(r12, r0)
            java.lang.String r0 = "extra_disable_search"
            r2.putExtra(r0, r11)
            X.9tb r1 = r5.A01
            if (r1 == 0) goto L_0x0067
            java.lang.String r0 = "extra_predefined_search_filter"
            r2.putExtra(r0, r1)
        L_0x0055:
            java.lang.String r0 = "extra_payment_flow_entry_point"
            r2.putExtra(r0, r6)
            r0 = 2131892630(0x7f121996, float:1.9420014E38)
            java.lang.String r1 = r12.getString(r0)
            java.lang.String r0 = "extra_list_screen_configurable_title"
            r2.putExtra(r0, r1)
            goto L_0x0084
        L_0x0067:
            java.lang.String r0 = "extra_show_empty_list_screen"
            r2.putExtra(r0, r11)
            goto L_0x0055
        L_0x006d:
            if (r2 != r1) goto L_0x003d
            X.9un r1 = r13.A04
            X.C18740tg.A06(r1)
            X.8az r1 = (X.C175748az) r1
            if (r1 == 0) goto L_0x0088
            X.8bF r0 = r1.A08
            if (r0 == 0) goto L_0x0088
            X.8b6 r0 = (X.C175818b6) r0
            java.lang.String r0 = r0.A0A
        L_0x0080:
            android.content.Intent r2 = com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A0z(r12, r1, r0, r11)
        L_0x0084:
            r12.startActivity(r2)
            return
        L_0x0088:
            r0 = 0
            goto L_0x0080
        L_0x008a:
            X.8cT r1 = r12.A0A
            X.C176658cT.A02(r1, r11)
            r0 = 59
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A07 = r0
            r1.A0b = r9
            java.lang.String r0 = r12.A0a
            r1.A0a = r0
            if (r3 == 0) goto L_0x00bd
            boolean r0 = X.C200899iR.A01(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A06 = r0
            goto L_0x00bd
        L_0x00aa:
            X.8cT r1 = r12.A0A
            X.C176658cT.A02(r1, r11)
            r0 = 60
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A07 = r0
            r1.A0b = r9
            java.lang.String r0 = r12.A0a
            r1.A0a = r0
        L_0x00bd:
            X.AF7 r0 = r12.A05
            r0.BOl(r1)
            goto L_0x002b
        L_0x00c4:
            X.1Dc r1 = r12.A0B
            java.lang.String r0 = "return back to caller without getting the finalized status"
            r1.A06(r0)
            r2 = -1
            java.lang.String r8 = r5.A03
            java.lang.String r7 = r5.A06
            java.lang.String r6 = r5.A05
            java.lang.String r5 = r5.A04
            android.content.Intent r3 = X.C36431kI.A0D()
            r0 = 4
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "txnId="
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r8, r1)
            r0 = 0
            r4[r0] = r1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "txnRef="
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r7, r1)
            r4[r11] = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Status="
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r6, r1)
            r0 = 2
            r4[r0] = r1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "responseCode="
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r5, r1)
            r0 = 3
            java.util.List r1 = X.C90524aI.A0p(r1, r4, r0)
            java.lang.String r0 = "&"
            java.lang.String r1 = android.text.TextUtils.join(r0, r1)
            java.lang.String r0 = "response"
            r3.putExtra(r0, r1)
            r12.setResult(r2, r3)
            goto L_0x027e
        L_0x0120:
            X.9c5 r6 = r12.A08
            java.lang.String r0 = r5.A07
            android.net.Uri r5 = android.net.Uri.parse(r0)
            X.0wG r0 = r6.A01
            android.content.Context r9 = r0.A00
            r8 = 2131890719(0x7f12121f, float:1.9416138E38)
            java.lang.Object[] r7 = new java.lang.Object[r11]
            java.lang.String r10 = r5.toString()
            int r2 = r10.length()
            r0 = 96
            if (r2 <= r0) goto L_0x0155
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r0 = 64
            X.C165577te.A1O(r10, r1, r4, r0)
            java.lang.String r0 = "…"
            r1.append(r0)
            int r0 = r2 + -32
            java.lang.String r0 = r10.substring(r0)
            java.lang.String r10 = X.AnonymousClass000.A0q(r0, r1)
        L_0x0155:
            java.lang.String r0 = X.C36391kE.A0v(r9, r10, r7, r4, r8)
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            android.text.util.Linkify.addLinks(r1, r11)
            r0 = 2132082707(0x7f150013, float:1.9805536E38)
            X.1qm r2 = X.AnonymousClass3LW.A01(r12, r0)
            r2.A0p(r1)
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            r2.A0f(r3, r0)
            r1 = 2131887154(0x7f120432, float:1.9408907E38)
            X.9pI r0 = new X.9pI
            r0.<init>(r12, r5, r6)
            r2.A0h(r0, r1)
            r2.A0b()
            return
        L_0x0180:
            X.9lY r1 = r5.A05
            X.C18740tg.A06(r1)
            boolean r0 = r5.A0I
            if (r0 == 0) goto L_0x018b
            r6 = 9
        L_0x018b:
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A0z(r12, r1, r9, r6)
            r12.startActivity(r0)
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.A3m(r7, r0)
            return
        L_0x019c:
            X.A8P r0 = r12.A0G
            android.content.Intent r2 = r0.A01(r12, r4, r4)
            X.6c7 r1 = r5.A00
            java.lang.String r0 = "extra_payment_handle"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r5.A0E
            java.lang.String r0 = "extra_payment_handle_id"
            r2.putExtra(r0, r1)
            X.6c7 r1 = r5.A07
            java.lang.String r0 = "extra_payee_name"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r5.A02
            java.lang.String r0 = "extra_transaction_token"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = "send_again_button"
            r2.putExtra(r1, r0)
            java.lang.String r0 = "extra_mapper_alias_resolved"
            r2.putExtra(r0, r11)
            java.lang.String r1 = r5.A0B
            java.lang.String r0 = "extra_merchant_code"
            r2.putExtra(r0, r1)
            r12.A33(r2, r4)
            return
        L_0x01d5:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity.class
            android.content.Intent r0 = X.C36441kJ.A0H(r12, r0)
            r12.startActivity(r0)
            goto L_0x027e
        L_0x01e0:
            r12.A0I()
            com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment r0 = new com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment
            r0.<init>()
            r0.A01 = r12
            r12.Btm(r0)
            return
        L_0x01ee:
            X.1qm r1 = X.AnonymousClass3LW.A00(r12)
            r0 = 2131895486(0x7f1224be, float:1.9425806E38)
            r1.A0d(r0)
            r0 = 2131895493(0x7f1224c5, float:1.942582E38)
            goto L_0x024b
        L_0x01fc:
            r12.A0I()
            X.1qm r1 = X.AnonymousClass3LW.A00(r12)
            r0 = 2131895494(0x7f1224c6, float:1.9425823E38)
            r1.A0d(r0)
            r0 = 2131895492(0x7f1224c4, float:1.9425819E38)
            goto L_0x024b
        L_0x020d:
            r12.A0I()
            X.1qm r1 = X.AnonymousClass3LW.A00(r12)
            r0 = 2131895484(0x7f1224bc, float:1.9425802E38)
            r1.A0d(r0)
            r0 = 2131895485(0x7f1224bd, float:1.9425804E38)
            goto L_0x024b
        L_0x021e:
            X.8lb r0 = r12.A07
            r0.A0q(r11)
            r0.A0p(r4)
            return
        L_0x0227:
            X.9lY r0 = r5.A05
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A0z(r12, r0, r9, r1)
            r12.startActivity(r0)
            X.AF7 r6 = r12.A05
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.String r10 = r12.A0a
            r6.BOn(r7, r8, r9, r10, r11)
            return
        L_0x023e:
            X.1qm r1 = X.AnonymousClass3LW.A00(r12)
            r0 = 2131892442(0x7f1218da, float:1.9419632E38)
            r1.A0d(r0)
            r0 = 2131892441(0x7f1218d9, float:1.941963E38)
        L_0x024b:
            r1.A0c(r0)
            r0 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1.A0h(r3, r0)
            r1.A0b()
            return
        L_0x0258:
            X.9un r1 = r13.A04
            if (r1 == 0) goto L_0x0270
            java.lang.String r0 = r1.A0A
            X.6c7 r3 = r1.A09
        L_0x0260:
            com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet r2 = X.C111235bx.A00(r3, r0, r4, r11)
            r12.A06 = r2
            X.01z r1 = r12.getSupportFragmentManager()
            java.lang.String r0 = "IndiaUpiDobPickerBottomSheet"
            r2.A1f(r1, r0)
            return
        L_0x0270:
            r0 = r3
            goto L_0x0260
        L_0x0272:
            X.17Y r1 = r12.A05
            r0 = 2131892202(0x7f1217ea, float:1.9419146E38)
            java.lang.String r0 = r12.getString(r0)
            r1.A0E(r0, r4)
        L_0x027e:
            r12.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity.A3l(X.9Og):void");
    }

    public void BVB(long j, String str) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        this.A03.A00(new C21263AEt(this), "kyc-recollect", str, gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
    }

    public Dialog onCreateDialog(int i) {
        if (i != 100) {
            return super.onCreateDialog(i);
        }
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0c(R.string.f12nameremoved);
        A002.A0r(false);
        B84.A00(A002, this, 13, R.string.f12nameremoved);
        A002.A0d(R.string.f12nameremoved);
        return A002.create();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C193689Ml r0;
        C202319lY r02;
        C201599jw r03;
        C180338lb r04 = this.A07;
        if (!(r04 == null || (r0 = r04.A06) == null || (r02 = r0.A01) == null)) {
            C175928bI r2 = (C175928bI) r02.A0A;
            if (r02.A02 == 415 && r2 != null && (r03 = r2.A0G) != null && r03.A0M) {
                menu.add(0, R.id.menuitem_payment_delete_transaction, 0, R.string.f12nameremoved);
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onNewIntent(Intent intent) {
        C180338lb r2 = this.A07;
        if (r2 != null) {
            r2.A00 = intent.getBooleanExtra("extra_return_after_completion", false);
        }
        super.onNewIntent(intent);
    }

    public IndiaUpiPaymentTransactionDetailsActivity(int i) {
        this.A09 = false;
        B7Z.A00(this, 27);
    }

    public void A22(AnonymousClass02E r3) {
        super.A22(r3);
        if (r3 instanceof ProgressDialogFragment) {
            ((ProgressDialogFragment) r3).A00 = new C164717sG(this, 2);
        }
    }

    public AnonymousClass0D3 A3i(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1000:
                return new C179708kZ(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
            case 1001:
                View A0E = C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved);
                AnonymousClass3UF.A0E(C36391kE.A0N(A0E, R.id.payment_empty_icon), C36341k9.A0F(viewGroup).getColor(R.color.f6nameremoved));
                return new C179748kd(A0E);
            case 1004:
                return new C179798ki(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
            case 1005:
                return new C179698kY(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
            case 1006:
                return new C179678kW(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
            case 1007:
                return new C179728kb(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
            case 1008:
                List list = AnonymousClass0D3.A0I;
                return new C179758ke(C36371kC.A0J(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved, false));
            default:
                return super.A3i(viewGroup, i);
        }
    }

    public void onBackPressed() {
        Integer A0i = C36361kB.A0i();
        A3m(A0i, A0i);
        this.A07.A0d(new AnonymousClass9FZ(301));
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A07.A0d(new AnonymousClass9FZ(2));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_payment_delete_transaction || this.A07 == null) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            C39001qm A002 = AnonymousClass3LW.A00(this);
            A002.A0c(R.string.f12nameremoved);
            A002.A0h((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
            A002.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
            A002.A00.A0V(C204139pW.A00);
            AnonymousClass0FM create = A002.create();
            create.setOnShowListener(new AnonymousClass5YM(this, 6));
            create.show();
            return true;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (C36371kC.A0H(this) != null) {
            bundle.putAll(C36371kC.A0H(this));
        }
        super.onSaveInstanceState(bundle);
    }

    public IndiaUpiPaymentTransactionDetailsActivity() {
        this(0);
        this.A0B = C165587tf.A0X("IndiaUpiPaymentTransactionDetailsActivity");
        this.A0A = new C176658cT();
    }
}
