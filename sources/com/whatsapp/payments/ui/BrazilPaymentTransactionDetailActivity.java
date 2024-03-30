package com.whatsapp.payments.ui;

import X.AnonymousClass0D3;
import X.AnonymousClass17Y;
import X.AnonymousClass3LW;
import X.AnonymousClass9Ls;
import X.AnonymousClass9Op;
import X.B7Y;
import X.B8F;
import X.C131606Ps;
import X.C165567td;
import X.C173878Tm;
import X.C179738kc;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C193689Ml;
import X.C194139Og;
import X.C19730wQ;
import X.C200899iR;
import X.C201649k3;
import X.C202319lY;
import X.C203049nB;
import X.C203419nz;
import X.C23075B3f;
import X.C27111My;
import X.C29121Vk;
import X.C29221Vu;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36401kF;
import X.C36441kJ;
import X.C39001qm;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.whatsapp.R;

public class BrazilPaymentTransactionDetailActivity extends PaymentTransactionDetailsListActivity {
    public AnonymousClass9Ls A00;
    public C23075B3f A01;
    public C201649k3 A02;
    public AnonymousClass9Op A03;
    public boolean A04;

    private void A0I(C194139Og r10, Integer num, String str) {
        C202319lY r3;
        C131606Ps A0F;
        C193689Ml r0 = this.A0O.A06;
        if (r0 != null) {
            r3 = r0.A01;
        } else {
            r3 = r10.A05;
        }
        if (r3 == null || !C200899iR.A01(r3)) {
            A0F = C165567td.A0F();
        } else {
            A0F = C203049nB.A00();
            A0F.A03("transaction_id", r3.A0K);
            A0F.A03("transaction_status", C203419nz.A03(r3.A03, r3.A02));
            C18820ts r2 = this.A0A;
            A0F.A03("transaction_status_name", C36401kF.A0o(r2.A00, this.A0R.A0C(r3)));
        }
        A0F.A03("hc_entrypoint", str);
        A0F.A03("app_type", "consumer");
        this.A01.BOp(A0F, C36361kB.A0i(), num, "payment_transaction_details", (String) null);
    }

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r1 = A0L.A5g;
            C165567td.A11(r1, this);
            C18830tt r2 = r1.A00;
            C165567td.A0v(r1, r2, this, C36321k7.A05(r1, r2, this));
            C173878Tm.A0H(r1, r2, this);
            C173878Tm.A0G(r1, r2, this);
            C173878Tm.A0F(A0L, r1, r2, this, C173878Tm.A01(r1, this));
            C173878Tm.A07(A0L, r1, r2, this);
            this.A02 = (C201649k3) r2.A5T.get();
            this.A03 = (AnonymousClass9Op) r2.A5X.get();
            this.A01 = (C23075B3f) r2.A0R.get();
            this.A00 = new AnonymousClass9Ls((AnonymousClass17Y) r1.A3e.get(), (C19730wQ) r1.A4g.get(), (C29221Vu) r1.A6A.get(), (C29121Vk) r1.A6I.get());
        }
    }

    public AnonymousClass0D3 A3i(ViewGroup viewGroup, int i) {
        if (i == 217) {
            return new C179738kc(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
        }
        return super.A3i(viewGroup, i);
    }

    public void A3l(C194139Og r6) {
        C202319lY r2;
        int i = r6.A00;
        if (i != 10) {
            if (i != 201) {
                switch (i) {
                    case 22:
                        break;
                    case 23:
                        A0I(r6, 124, "wa_p2m_receipt_report_transaction");
                        break;
                    case 24:
                        Intent A0H = C36441kJ.A0H(this, BrazilPaymentSettingsActivity.class);
                        A0H.putExtra("referral_screen", "chat");
                        startActivity(A0H);
                        finish();
                        return;
                }
            } else {
                C202319lY r4 = r6.A05;
                if (r4 != null) {
                    C39001qm A002 = AnonymousClass3LW.A00(this);
                    A002.A0d(R.string.f12nameremoved);
                    C39001qm.A02(getBaseContext(), A002, R.string.f12nameremoved);
                    A002.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
                    A002.A0h(new B8F(r4, this, 11), R.string.f12nameremoved);
                    C36341k9.A11(A002);
                    A3m(C36361kB.A0i(), 161);
                    return;
                }
                return;
            }
        }
        if (i == 22) {
            C193689Ml r0 = this.A0O.A06;
            if (r0 != null) {
                r2 = r0.A01;
            } else {
                r2 = r6.A05;
            }
            String str = null;
            if (r2 != null && C200899iR.A01(r2)) {
                str = r2.A03 == 200 ? "wa_smb_p2m_payment_details" : "wa_p2m_receipt_support";
            }
            A0I(r6, 39, str);
        } else {
            A3m(C36361kB.A0i(), 39);
        }
        super.A3l(r6);
    }

    public BrazilPaymentTransactionDetailActivity(int i) {
        this.A04 = false;
        B7Y.A00(this, 41);
    }

    public void onBackPressed() {
        super.onBackPressed();
        Integer A0i = C36361kB.A0i();
        A3m(A0i, A0i);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            Integer A0i = C36361kB.A0i();
            A3m(A0i, A0i);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public BrazilPaymentTransactionDetailActivity() {
        this(0);
    }
}
