package com.whatsapp.collections;

import X.AnonymousClass00C;
import X.C05250Oz;
import X.C33471fP;
import X.C33481fQ;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

public final class ObservableRecyclerView extends RecyclerView {
    public final C33471fP A00;
    public final C33481fQ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ObservableRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        this.A00 = new C33471fP();
        this.A01 = new C33481fQ();
    }

    public void draw(Canvas canvas) {
        AnonymousClass00C.A0D(canvas, 0);
        C33481fQ r0 = this.A01;
        r0.A00();
        super.draw(canvas);
        r0.A01();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C33471fP r0 = this.A00;
        r0.A01();
        super.onLayout(z, i, i2, i3, i4);
        r0.A00();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ObservableRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ObservableRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ObservableRecyclerView(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
