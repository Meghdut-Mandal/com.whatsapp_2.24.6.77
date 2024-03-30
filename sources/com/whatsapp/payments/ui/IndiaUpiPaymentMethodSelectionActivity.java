package com.whatsapp.payments.ui;

import X.AnonymousClass005;
import X.AnonymousClass07B;
import X.AnonymousClass3LW;
import X.B6J;
import X.B7Z;
import X.B84;
import X.B89;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165607th;
import X.C166337vZ;
import X.C173858Tk;
import X.C179128jE;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C199849g7;
import X.C207249un;
import X.C24611Dc;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36431kI;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.AbsListView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.List;

public class IndiaUpiPaymentMethodSelectionActivity extends C179128jE implements B6J {
    public C199849g7 A00;
    public C166337vZ A01;
    public AnonymousClass005 A02;
    public boolean A03;
    public final C24611Dc A04;

    public String BEC(C207249un r2) {
        return null;
    }

    public boolean BtK() {
        return false;
    }

    public /* synthetic */ void Bti(C207249un r1, PaymentMethodRow paymentMethodRow) {
    }

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A00 = C165607th.A0e(r2);
            this.A02 = C18840tu.A00(r1.AAl);
        }
    }

    public String BED(C207249un r3) {
        return this.A00.A02(r3, false);
    }

    public Dialog onCreateDialog(int i) {
        if (i != 29) {
            return super.onCreateDialog(i);
        }
        C39001qm A002 = AnonymousClass3LW.A00(this);
        C165587tf.A16(A002);
        B84.A00(A002, this, 9, R.string.f12nameremoved);
        B84.A01(A002, this, 10, R.string.f12nameremoved);
        return A002.create();
    }

    public IndiaUpiPaymentMethodSelectionActivity(int i) {
        this.A03 = false;
        B7Z.A00(this, 25);
    }

    public /* synthetic */ boolean BtO() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C36431kI.A0F(this, R.layout.f9nameremoved) == null) {
            this.A04.A04("got null bank account or balance; finishing");
            finish();
            return;
        }
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0Q("Select bank account");
            supportActionBar.A0U(true);
        }
        this.A04.A06("onCreate");
        AbsListView absListView = (AbsListView) findViewById(R.id.payment_methods_list);
        C166337vZ r0 = new C166337vZ(this, this.A00, this);
        this.A01 = r0;
        r0.A00 = (List) getIntent().getSerializableExtra("bank_accounts");
        r0.notifyDataSetChanged();
        absListView.setAdapter(this.A01);
        absListView.setOnItemClickListener(new B89(this, 3));
    }

    public /* synthetic */ int BEA(C207249un r2) {
        return 0;
    }

    public /* synthetic */ boolean Bt7(C207249un r2) {
        return false;
    }

    public IndiaUpiPaymentMethodSelectionActivity() {
        this(0);
        this.A04 = C165587tf.A0X("IndiaUpiPaymentMethodSelectionActivity");
    }
}
