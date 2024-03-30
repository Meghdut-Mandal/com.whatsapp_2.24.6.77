package com.google.android.material.navigationrail;

import X.AnonymousClass000;
import X.AnonymousClass062;
import X.AnonymousClass07V;
import X.AnonymousClass0NJ;
import X.AnonymousClass0f3;
import X.C013205s;
import X.C016807f;
import X.C27931Qk;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;

public class NavigationRailView extends AnonymousClass07V {
    public View A00;
    public Boolean A01;
    public Boolean A02;
    public final int A03;

    public NavigationRailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A02 = null;
        this.A01 = null;
        this.A03 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        TypedArray typedArray = C013205s.A01(getContext(), attributeSet, C27931Qk.A0V, new int[0], i, i2).A02;
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            A01(LayoutInflater.from(getContext()).inflate(resourceId, this, false));
        }
        setMenuGravity(typedArray.getInt(2, 49));
        if (typedArray.hasValue(1)) {
            setItemMinimumHeight(typedArray.getDimensionPixelSize(1, -1));
        }
        if (typedArray.hasValue(4)) {
            this.A02 = Boolean.valueOf(typedArray.getBoolean(4, false));
        }
        if (typedArray.hasValue(3)) {
            this.A01 = Boolean.valueOf(typedArray.getBoolean(3, false));
        }
        typedArray.recycle();
        AnonymousClass062.A02(this, new AnonymousClass0f3(this));
    }

    public int getMaxItemCount() {
        return 7;
    }

    private AnonymousClass0NJ getNavigationRailMenuView() {
        return (AnonymousClass0NJ) this.A04;
    }

    public /* bridge */ /* synthetic */ C016807f A00(Context context) {
        return new AnonymousClass0NJ(context);
    }

    public void A01(View view) {
        View view2 = this.A00;
        if (view2 != null) {
            removeView(view2);
            this.A00 = null;
        }
        this.A00 = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.A03;
        addView(view, 0, layoutParams);
    }

    public int getItemMinimumHeight() {
        return ((AnonymousClass0NJ) this.A04).A00;
    }

    public int getMenuGravity() {
        return ((AnonymousClass0NJ) this.A04).A01.gravity;
    }

    public void setItemMinimumHeight(int i) {
        ((AnonymousClass0NJ) this.A04).setItemMinimumHeight(i);
    }

    public void setMenuGravity(int i) {
        ((AnonymousClass0NJ) this.A04).setMenuGravity(i);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        AnonymousClass0NJ r5 = (AnonymousClass0NJ) this.A04;
        View view = this.A00;
        if (view != null && view.getVisibility() != 8) {
            int bottom = this.A00.getBottom() + this.A03;
            int top = r5.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            } else {
                return;
            }
        } else if ((r5.A01.gravity & 112) == 48) {
            i5 = this.A03;
        } else {
            return;
        }
        if (i5 > 0) {
            r5.layout(r5.getLeft(), r5.getTop() + i5, r5.getRight(), r5.getBottom() + i5);
        }
    }

    public void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) != 1073741824 && suggestedMinimumWidth > 0) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumWidth + AnonymousClass000.A09(this)), 1073741824);
        }
        super.onMeasure(i, i2);
        View view = this.A00;
        if (view != null && view.getVisibility() != 8) {
            measureChild(this.A04, i, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.A00.getMeasuredHeight()) - this.A03, Integer.MIN_VALUE));
        }
    }

    public View getHeaderView() {
        return this.A00;
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.f13nameremoved);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public NavigationRailView(Context context) {
        this(context, (AttributeSet) null);
    }
}
