package com.whatsapp.collections.observablelistview;

import X.AnonymousClass13J;
import X.AnonymousClass15S;
import X.C166297vU;
import X.C33461fN;
import X.C33471fP;
import X.C33481fQ;
import X.C36301k5;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.AbsListView;

public class ObservableListView extends C33461fN {
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public SparseIntArray A05;
    public AbsListView.OnScrollListener A06;
    public AnonymousClass15S A07;
    public C33471fP A08;
    public C33481fQ A09;
    public AnonymousClass13J A0A;
    public boolean A0B;
    public boolean A0C;
    public MotionEvent A0D;
    public ViewGroup A0E;
    public boolean A0F;
    public final AbsListView.OnScrollListener A0G = new C36301k5(this, 0);

    private void A00() {
        this.A05 = new SparseIntArray();
        this.A08 = new C33471fP();
        this.A09 = new C33481fQ();
        super.setOnScrollListener(this.A0G);
    }

    public void draw(Canvas canvas) {
        this.A09.A00();
        super.draw(canvas);
        this.A09.A01();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A07 != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.A0B = true;
                this.A0C = true;
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.A0B = false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A08.A01();
        super.onLayout(z, i, i2, i3, i4);
        this.A08.A00();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C166297vU r2 = (C166297vU) parcelable;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A03 = r2.A03;
        this.A02 = r2.A02;
        this.A04 = r2.A04;
        this.A05 = r2.A05;
        super.onRestoreInstanceState(r2.getSuperState());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r1 != 3) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            X.15S r0 = r8.A07
            if (r0 == 0) goto L_0x0012
            int r1 = r9.getActionMasked()
            r6 = 1
            r5 = 0
            if (r1 == r6) goto L_0x0085
            r0 = 2
            if (r1 == r0) goto L_0x0017
            r0 = 3
            if (r1 == r0) goto L_0x0085
        L_0x0012:
            boolean r0 = super.onTouchEvent(r9)
            return r0
        L_0x0017:
            android.view.MotionEvent r0 = r8.A0D
            if (r0 != 0) goto L_0x001d
            r8.A0D = r9
        L_0x001d:
            float r1 = r9.getY()
            android.view.MotionEvent r0 = r8.A0D
            float r0 = r0.getY()
            float r1 = r1 - r0
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r9)
            r8.A0D = r0
            int r0 = r8.A04
            float r0 = (float) r0
            float r0 = r0 - r1
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0012
            boolean r0 = r8.A0F
            if (r0 != 0) goto L_0x008a
            android.view.ViewGroup r4 = r8.A0E
            if (r4 != 0) goto L_0x0045
            android.view.ViewParent r4 = r8.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
        L_0x0045:
            r3 = 0
            r0 = r8
        L_0x0047:
            if (r0 == r4) goto L_0x0068
            int r2 = r0.getLeft()
            int r1 = r0.getScrollX()
            int r2 = r2 - r1
            float r1 = (float) r2
            float r7 = r7 + r1
            int r2 = r0.getTop()
            int r1 = r0.getScrollY()
            int r2 = r2 - r1
            float r1 = (float) r2
            float r3 = r3 + r1
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0068
            goto L_0x0047
        L_0x0068:
            android.view.MotionEvent r2 = android.view.MotionEvent.obtainNoHistory(r9)
            r2.offsetLocation(r7, r3)
            boolean r0 = r4.onInterceptTouchEvent(r2)
            if (r0 == 0) goto L_0x0012
            r8.A0F = r6
            r2.setAction(r5)
            r1 = 14
            X.1iV r0 = new X.1iV
            r0.<init>(r8, r2, r4, r1)
            r8.post(r0)
            return r5
        L_0x0085:
            r8.A0F = r5
            r8.A0B = r5
            goto L_0x0012
        L_0x008a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.collections.observablelistview.ObservableListView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public ObservableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public int getCurrentScrollY() {
        return this.A04;
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return super.onInterceptHoverEvent(motionEvent);
    }

    public Parcelable onSaveInstanceState() {
        C166297vU r1 = new C166297vU(super.onSaveInstanceState());
        r1.A01 = this.A01;
        r1.A00 = this.A00;
        r1.A03 = this.A03;
        r1.A02 = this.A02;
        r1.A04 = this.A04;
        r1.A05 = this.A05;
        return r1;
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.A06 = onScrollListener;
    }

    public void setScrollViewCallbacks(AnonymousClass15S r1) {
        this.A07 = r1;
    }

    public void setTouchInterceptionViewGroup(ViewGroup viewGroup) {
        this.A0E = viewGroup;
    }

    public ObservableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public ObservableListView(Context context) {
        super(context);
        A00();
    }
}
