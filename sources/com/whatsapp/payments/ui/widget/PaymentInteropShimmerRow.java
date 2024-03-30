package com.whatsapp.payments.ui.widget;

import X.AnonymousClass1EU;
import X.AnonymousClass9v0;
import X.C159647jh;
import X.C166447vp;
import X.C202179lC;
import X.C202319lY;
import X.C36351kA;
import X.C36391kE;
import X.C90504aG;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class PaymentInteropShimmerRow extends C166447vp implements C159647jh {
    public C202319lY A00;
    public AnonymousClass1EU A01;
    public C202179lC A02;
    public View A03;
    public View A04;

    /* renamed from: A02 */
    public void B1s(C202319lY r5) {
        boolean contains;
        this.A00 = r5;
        C202179lC r2 = this.A02;
        String str = r5.A0K;
        if (TextUtils.isEmpty(str)) {
            contains = false;
        } else {
            contains = r2.A00.contains(str);
        }
        View view = this.A03;
        if (contains) {
            view.setVisibility(8);
            this.A04.setVisibility(0);
            return;
        }
        view.setVisibility(0);
        this.A04.setVisibility(8);
    }

    public void BnW() {
        C202319lY r0 = this.A00;
        if (r0 != null) {
            B1s(r0);
        }
    }

    public PaymentInteropShimmerRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    private void A00() {
        C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this);
        setOrientation(1);
        this.A03 = findViewById(R.id.payment_shimmer);
        this.A04 = findViewById(R.id.static_shimmer);
        C90504aG.A11(getContext(), C36391kE.A0N(this, R.id.transaction_loading_error), R.color.f6nameremoved);
        setOnClickListener(new AnonymousClass9v0(this, 43));
    }

    public PaymentInteropShimmerRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public PaymentInteropShimmerRow(Context context) {
        super(context);
        A00();
    }
}
