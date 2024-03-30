package com.whatsapp.payments.ui;

import X.A8P;
import X.AnonymousClass000;
import X.AnonymousClass00F;
import X.AnonymousClass07B;
import X.AnonymousClass1FR;
import X.AnonymousClass1N0;
import X.AnonymousClass1Pp;
import X.AnonymousClass3LW;
import X.AnonymousClass3SJ;
import X.B7Z;
import X.B84;
import X.C135086c7;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C18800tq;
import X.C18830tt;
import X.C196129Xv;
import X.C21235ADr;
import X.C225314u;
import X.C24611Dc;
import X.C24631De;
import X.C29121Vk;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C39001qm;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.CopyableTextView;
import com.whatsapp.R;

public class IndiaUpiVpaContactInfoActivity extends C225314u implements View.OnClickListener {
    public AnonymousClass1Pp A00;
    public C135086c7 A01;
    public C196129Xv A02;
    public A8P A03;
    public C29121Vk A04;
    public C24631De A05;
    public AnonymousClass1FR A06;
    public View A07;
    public LinearLayout A08;
    public C135086c7 A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public final C24611Dc A0F;

    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            return super.onCreateDialog(i);
        }
        C39001qm A002 = AnonymousClass3LW.A00(this);
        C165587tf.A0t(this, A002, new Object[]{C165577te.A0g(this.A09)}, R.string.f12nameremoved);
        B84.A00(A002, this, 39, R.string.f12nameremoved);
        A002.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
        return A002.create();
    }

    private Intent A01() {
        Intent A012 = this.A03.A01(this, false, true);
        C165597tg.A0z(A012, this.A0B);
        A012.putExtra("extra_payment_handle", this.A01);
        A012.putExtra("extra_payment_handle_id", this.A0C);
        A012.putExtra("extra_payee_name", this.A09);
        A012.putExtra("extra_merchant_code", this.A0A);
        return A012;
    }

    public static void A07(IndiaUpiVpaContactInfoActivity indiaUpiVpaContactInfoActivity, boolean z) {
        int i;
        indiaUpiVpaContactInfoActivity.A0E = z;
        ImageView A0Q = C36411kG.A0Q(indiaUpiVpaContactInfoActivity, R.id.block_vpa_icon);
        TextView A0Q2 = C36391kE.A0Q(indiaUpiVpaContactInfoActivity, R.id.block_vpa_text);
        int i2 = 8;
        indiaUpiVpaContactInfoActivity.A07.setVisibility(C36381kD.A00(z ? 1 : 0));
        LinearLayout linearLayout = indiaUpiVpaContactInfoActivity.A08;
        if (!z) {
            i2 = 0;
        }
        linearLayout.setVisibility(i2);
        if (z) {
            A0Q.setColorFilter(AnonymousClass00F.A00(indiaUpiVpaContactInfoActivity, R.color.f6nameremoved));
            C36331k8.A0r(indiaUpiVpaContactInfoActivity, A0Q2, R.color.f6nameremoved);
            i = R.string.f12nameremoved;
        } else {
            A0Q.setColorFilter(AnonymousClass00F.A00(indiaUpiVpaContactInfoActivity, R.color.f6nameremoved));
            C36331k8.A0r(indiaUpiVpaContactInfoActivity, A0Q2, R.color.f6nameremoved);
            i = R.string.f12nameremoved;
        }
        A0Q2.setText(i);
    }

    public void A2F() {
        if (!this.A0D) {
            this.A0D = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C165567td.A11(A0B2, this);
            C18830tt r1 = A0B2.A00;
            this.A0B = (AnonymousClass1N0) r1.A3P.get();
            this.A00 = C36361kB.A0V(A0B2);
            this.A06 = C36431kI.A0p(A0B2);
            this.A04 = C165587tf.A0T(A0B2);
            this.A05 = (C24631De) C165577te.A0f(A0B2);
            this.A03 = (A8P) r1.AAX.get();
            this.A02 = (C196129Xv) r1.A2G.get();
        }
    }

    public IndiaUpiVpaContactInfoActivity(int i) {
        this.A0D = false;
        B7Z.A00(this, 42);
    }

    public void onClick(View view) {
        Intent A012;
        String str;
        int i;
        if (view.getId() == R.id.send_payment_container) {
            C24611Dc r2 = this.A0F;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("send payment to vpa: ");
            C165567td.A17(r2, this.A01, A0u);
            A012 = A01();
            str = "extra_transfer_direction";
            i = 0;
        } else if (view.getId() == R.id.request_payment_container) {
            C24611Dc r22 = this.A0F;
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("request payment from vpa: ");
            C165567td.A17(r22, this.A01, A0u2);
            A012 = A01();
            str = "extra_transfer_direction";
            i = 1;
        } else if (view.getId() == R.id.block_vpa_btn) {
            boolean z = this.A0E;
            C24611Dc r23 = this.A0F;
            StringBuilder A0u3 = AnonymousClass000.A0u();
            if (z) {
                A0u3.append("unblock vpa: ");
                C165567td.A17(r23, this.A01, A0u3);
                this.A02.A01(this, new C21235ADr(this, false), this.A04, (String) C165577te.A0g(this.A01), false);
                return;
            }
            A0u3.append("block vpa: ");
            C165567td.A17(r23, this.A01, A0u3);
            AnonymousClass3SJ.A01(this, 1);
            return;
        } else {
            return;
        }
        A012.putExtra(str, i);
        startActivity(A012);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
            supportActionBar.A0I(R.string.f12nameremoved);
        }
        this.A01 = (C135086c7) getIntent().getParcelableExtra("extra_payment_handle");
        this.A0C = getIntent().getStringExtra("extra_payment_handle_id");
        this.A09 = (C135086c7) getIntent().getParcelableExtra("extra_payee_name");
        this.A0B = C165587tf.A0g(this);
        this.A0A = getIntent().getStringExtra("extra_merchant_code");
        this.A07 = findViewById(R.id.payment_separator);
        findViewById(R.id.send_payment_container).setOnClickListener(this);
        findViewById(R.id.request_payment_container).setOnClickListener(this);
        this.A08 = (LinearLayout) findViewById(R.id.send_and_request_payment_container);
        CopyableTextView copyableTextView = (CopyableTextView) findViewById(R.id.account_id_handle);
        C36341k9.A0s(this, copyableTextView, new Object[]{C165577te.A0g(this.A01)}, R.string.f12nameremoved);
        copyableTextView.A02 = (String) C165577te.A0g(this.A01);
        C165607th.A1A(C36391kE.A0Q(this, R.id.vpa_name), C165577te.A0g(this.A09));
        this.A00.A06(C36411kG.A0Q(this, R.id.avatar), R.drawable.avatar_contact);
        View findViewById = findViewById(R.id.block_vpa_btn);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(this);
        A07(this, this.A02.A03(this.A01));
    }

    public IndiaUpiVpaContactInfoActivity() {
        this(0);
        this.A0F = C165587tf.A0X("IndiaUpiVpaContactInfoActivity");
    }
}
