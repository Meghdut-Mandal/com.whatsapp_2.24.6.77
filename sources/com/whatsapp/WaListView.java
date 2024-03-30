package com.whatsapp;

import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.AbsListView;
import android.widget.ListView;

public class WaListView extends ListView implements AbsListView.OnScrollListener, C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public int A02;
    public AbsListView.OnScrollListener A03;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AbsListView.OnScrollListener onScrollListener = this.A03;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i, i2, i3);
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        this.A02 = i;
        AbsListView.OnScrollListener onScrollListener = this.A03;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i);
        }
    }

    public WaListView(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A02 = 0;
        super.setOnScrollListener(this);
    }

    public int getScrollState() {
        return this.A02;
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.A03 = onScrollListener;
    }

    public WaListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A02 = 0;
        super.setOnScrollListener(this);
    }

    public WaListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public WaListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A02 = 0;
        super.setOnScrollListener(this);
    }
}
