package com.whatsapp;

import X.AnonymousClass22w;
import android.content.Context;
import android.util.AttributeSet;

public class ListItemWithRightIcon extends AnonymousClass22w {
    public void setDescriptionVisibility(int i) {
        if (this.A00.getVisibility() != i) {
            this.A00.setVisibility(i);
        }
    }

    public int getRootLayoutID() {
        return R.layout.f9nameremoved;
    }

    public ListItemWithRightIcon(Context context) {
        super(context);
    }

    public ListItemWithRightIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ListItemWithRightIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
