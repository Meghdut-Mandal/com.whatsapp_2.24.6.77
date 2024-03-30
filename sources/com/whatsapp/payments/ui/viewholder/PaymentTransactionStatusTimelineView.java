package com.whatsapp.payments.ui.viewholder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

public class PaymentTransactionStatusTimelineView extends ListView {
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public PaymentTransactionStatusTimelineView(Context context) {
        super(context);
    }

    public PaymentTransactionStatusTimelineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PaymentTransactionStatusTimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
