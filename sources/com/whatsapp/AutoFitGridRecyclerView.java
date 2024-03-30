package com.whatsapp;

import X.AnonymousClass0CP;
import X.AnonymousClass2xF;
import X.C18820ts;
import X.C20810yC;
import X.C41211wq;
import X.C97084oN;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;

public class AutoFitGridRecyclerView extends C97084oN {
    public C18820ts A00;
    public C20810yC A01;
    public int A02;
    public int A03;

    private void A06(Context context, AttributeSet attributeSet) {
        int i = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2xF.A00);
            this.A02 = obtainStyledAttributes.getDimensionPixelSize(0, this.A02);
            i = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
        }
        A0t(new C41211wq(this.A00, i));
        setLayoutManager(new GridLayoutManager(1));
        this.A0U = true;
    }

    private void setColumnCount(int i) {
        int i2 = this.A02;
        if (i2 > 0) {
            AnonymousClass0CP layoutManager = getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                ((GridLayoutManager) layoutManager).A1o(Math.max(1, i / i2));
            }
        }
    }

    public AutoFitGridRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A06(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (this.A01.A0E(6380)) {
            if (this.A03 != measuredWidth) {
                this.A03 = measuredWidth;
            } else {
                return;
            }
        }
        setColumnCount(measuredWidth);
    }

    public AutoFitGridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A06(context, attributeSet);
    }

    public AutoFitGridRecyclerView(Context context) {
        super(context);
        A06(context, (AttributeSet) null);
    }
}
