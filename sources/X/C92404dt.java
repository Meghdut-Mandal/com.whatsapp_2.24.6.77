package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.4dt  reason: invalid class name and case insensitive filesystem */
public final class C92404dt extends ViewGroup {
    public final HashMap A00 = AnonymousClass001.A0J();
    public final HashMap A01 = AnonymousClass001.A0J();

    public void dispatchDraw(Canvas canvas) {
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void onDescendantInvalidated(View view, View view2) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Iterator A0s = C90484aE.A0s(this.A01);
        if (A0s.hasNext()) {
            A0s.next();
            throw AnonymousClass001.A0A("getLeft");
        }
    }

    public C92404dt(Context context) {
        super(context);
        setClipChildren(false);
    }

    public final HashMap getHolderToLayoutNode() {
        return this.A01;
    }

    public final HashMap getLayoutNodeToHolder() {
        return this.A00;
    }

    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw AnonymousClass001.A08("widthMeasureSpec should be EXACTLY");
        } else if (View.MeasureSpec.getMode(i2) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            Iterator A0s = C90484aE.A0s(this.A01);
            if (A0s.hasNext()) {
                A0s.next();
                throw AnonymousClass001.A0A("remeasure");
            }
        } else {
            throw AnonymousClass001.A08("heightMeasureSpec should be EXACTLY");
        }
    }

    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C137846gp r1 = (C137846gp) this.A01.get(childAt);
            if (childAt.isLayoutRequested() && r1 != null) {
                C137846gp.A03(r1);
            }
        }
    }

    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }
}
