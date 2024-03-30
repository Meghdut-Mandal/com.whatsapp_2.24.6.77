package com.whatsapp.payments;

import X.AF7;
import X.AnonymousClass001;
import X.AnonymousClass141;
import X.AnonymousClass185;
import X.AnonymousClass1EV;
import X.AnonymousClass1NG;
import X.AnonymousClass22g;
import X.AnonymousClass32b;
import X.AnonymousClass3L0;
import X.C18800tq;
import X.C18830tt;
import X.C195479Ul;
import X.C202939my;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C81123wV;
import X.C89344We;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.payments.ui.PaymentInvitePickerActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IndiaUpiPaymentInvitePickerActivity extends PaymentInvitePickerActivity {
    public AnonymousClass185 A00;
    public C202939my A01;
    public AnonymousClass1EV A02;
    public C195479Ul A03;
    public AF7 A04;
    public AnonymousClass32b A05;
    public boolean A06;
    public boolean A07;

    public void A2F() {
        if (!this.A07) {
            this.A07 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r3 = A0L.A5g;
            C36321k7.A0c(r3, this);
            C18830tt r2 = r3.A00;
            C36321k7.A0X(r3, r2, this, C36321k7.A05(r3, r2, this));
            AnonymousClass22g.A0l(this);
            AnonymousClass22g.A0h(r3, r2, this);
            AnonymousClass22g.A0L(A0L, r3, this);
            this.A00 = C36381kD.A0f(r3);
            this.A02 = C36361kB.A0e(r3);
            this.A05 = new AnonymousClass32b((AnonymousClass1NG) r3.A0v.get());
            this.A00 = C36371kC.A0U(r3);
            this.A02 = C36371kC.A0h(r3);
            this.A03 = C27111My.A2p(A0L);
            this.A04 = C36371kC.A0i(r3);
            this.A01 = r2.A7n();
        }
    }

    public void A3q() {
        if (this.A02.A02.A0E(783)) {
            this.A06 = true;
            this.A04.Boy(new C81123wV((Object) this, 49));
        }
    }

    public void A3u(View view, View view2, View view3, View view4) {
        if (this.A02.A02.A0E(783)) {
            View inflate = getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null, false);
            ((ViewGroup) view4.getParent()).addView(inflate, 0);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(R.id.contact_list_shimmer_container);
            if (shimmerFrameLayout != null) {
                shimmerFrameLayout.setVisibility(0);
                shimmerFrameLayout.A03();
            }
            C36361kB.A15(view4, view, view2, 8);
            view3.setVisibility(0);
            return;
        }
        super.A3u(view, view2, view3, view4);
    }

    public IndiaUpiPaymentInvitePickerActivity(int i) {
        this.A07 = false;
        C89344We.A00(this, 36);
    }

    public void A3t(View view, View view2, View view3, View view4) {
        super.A3t(view, view2, view3, view4);
        if (this.A02.A02.A0E(783)) {
            C36331k8.A11(this, R.id.contact_list_shimmer_container);
        }
    }

    public void A45(List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass141 A0f = C36391kE.A0f(it);
            AnonymousClass3L0 A012 = this.A00.A01(C36391kE.A0i(A0f));
            if (A012 == null || (!A012.A02() && !A012.A01())) {
                A0I.add(A0f);
            }
        }
        super.A45(A0I);
    }

    public /* synthetic */ void A49() {
        super.onBackPressed();
    }

    public IndiaUpiPaymentInvitePickerActivity() {
        this(0);
        this.A06 = false;
    }
}
