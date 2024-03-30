package com.whatsapp.payments.ui;

import X.AnonymousClass00F;
import X.AnonymousClass012;
import X.AnonymousClass04H;
import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass3UF;
import X.AnonymousClass5M2;
import X.C001700s;
import X.C138456i8;
import X.C163027pX;
import X.C165187t1;
import X.C18800tq;
import X.C18830tt;
import X.C194199Om;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36431kI;
import X.C90464aC;
import X.C95454l5;
import X.C95524lf;
import X.C96164mt;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.StickyHeadersRecyclerView;

public class MerchantPayoutTransactionHistoryActivity extends AnonymousClass155 {
    public FrameLayout A00;
    public C96164mt A01;
    public C194199Om A02;
    public StickyHeadersRecyclerView A03;
    public C95454l5 A04;
    public boolean A05;

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C90464aC.A11(A0B, this);
            C18830tt r1 = A0B.A00;
            C90464aC.A0y(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A02 = (C194199Om) r1.AAh.get();
        }
    }

    public MerchantPayoutTransactionHistoryActivity(int i) {
        this.A05 = false;
        C163027pX.A00(this, 46);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        int A002 = AnonymousClass00F.A00(this, R.color.f6nameremoved);
        AnonymousClass07B A0Q = C36431kI.A0Q(this, (Toolbar) findViewById(R.id.pay_service_toolbar));
        if (A0Q != null) {
            A0Q.A0I(R.string.f12nameremoved);
            A0Q.A0U(true);
            A0Q.A0L(AnonymousClass3UF.A08(getResources().getDrawable(R.drawable.ic_close), A002));
        }
        this.A01 = new C96164mt(this);
        this.A00 = (FrameLayout) findViewById(R.id.loading_container);
        StickyHeadersRecyclerView stickyHeadersRecyclerView = (StickyHeadersRecyclerView) findViewById(R.id.transaction_list);
        this.A03 = stickyHeadersRecyclerView;
        stickyHeadersRecyclerView.setAdapter(this.A01);
        C95454l5 r3 = (C95454l5) new AnonymousClass04H(new C95524lf(this, this.A02), this).A00(C95454l5.class);
        this.A04 = r3;
        C36341k9.A18(r3.A00, true);
        C36341k9.A18(r3.A01, false);
        C36331k8.A1F(new AnonymousClass5M2(r3.A06, r3), r3.A09);
        C95454l5 r5 = this.A04;
        C165187t1 r4 = new C165187t1(this, 28);
        C165187t1 r32 = new C165187t1(this, 29);
        C138456i8 r2 = C138456i8.A00;
        C001700s r0 = r5.A02;
        AnonymousClass012 r1 = r5.A03;
        r0.A08(r1, r4);
        r5.A00.A08(r1, r32);
        r5.A01.A08(r1, r2);
    }

    public MerchantPayoutTransactionHistoryActivity() {
        this(0);
    }
}
