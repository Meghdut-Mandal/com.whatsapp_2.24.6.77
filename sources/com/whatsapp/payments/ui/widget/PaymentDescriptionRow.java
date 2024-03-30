package com.whatsapp.payments.ui.widget;

import X.C012005e;
import X.C36351kA;
import X.C36391kE;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public class PaymentDescriptionRow extends LinearLayout {
    public TextView A00;
    public View A01;
    public TextView A02;

    public PaymentDescriptionRow(Context context) {
        super(context);
        A00();
    }

    public void A00() {
        C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
        setOrientation(1);
        this.A01 = C012005e.A02(this, R.id.payment_description_row_container);
        this.A00 = C36391kE.A0O(this, R.id.payment_description_hint);
        this.A02 = C36391kE.A0O(this, R.id.payment_description_text);
    }

    public void A01(String str) {
        Context context;
        int i;
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView = this.A02;
        if (isEmpty) {
            textView.setVisibility(8);
            this.A02.setText(str);
            context = getContext();
            i = R.string.f12nameremoved;
        } else {
            textView.setVisibility(0);
            this.A02.setText(str);
            context = getContext();
            i = R.string.f12nameremoved;
        }
        this.A00.setText(context.getString(i));
    }

    public int getLayoutRes() {
        return R.layout.f9nameremoved;
    }

    public PaymentDescriptionRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public PaymentDescriptionRow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
    }

    public PaymentDescriptionRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
