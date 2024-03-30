package com.whatsapp.payments.ui.widget;

import X.AnonymousClass1QZ;
import X.AnonymousClass9Kh;
import X.C166397vj;
import X.C18700tb;
import X.C22956Az8;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;

public class TransactionsExpandableView extends C166397vj implements C18700tb {
    public AnonymousClass9Kh A00;
    public AnonymousClass1QZ A01;
    public boolean A02;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setPaymentRequestActionCallback(C22956Az8 az8) {
        this.A00.A02 = az8;
    }

    public TransactionsExpandableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        this.A00 = new AnonymousClass9Kh(context);
    }

    public void setAdapter(AnonymousClass9Kh r1) {
        this.A00 = r1;
    }

    public TransactionsExpandableView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public TransactionsExpandableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        this.A00 = new AnonymousClass9Kh(context);
    }

    public TransactionsExpandableView(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        this.A00 = new AnonymousClass9Kh(context);
    }
}
