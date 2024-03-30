package com.google.android.material.bottomnavigation;

import X.AnonymousClass062;
import X.AnonymousClass07V;
import X.C013205s;
import X.C016807f;
import X.C016907g;
import X.C018407v;
import X.C17670ro;
import X.C17680rp;
import X.C27931Qk;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class BottomNavigationView extends AnonymousClass07V {
    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArray = C013205s.A01(getContext(), attributeSet, C27931Qk.A03, new int[0], i, i2).A02;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        typedArray.getBoolean(1, true);
        typedArray.recycle();
        AnonymousClass062.A02(this, new C018407v(this));
    }

    public int getMaxItemCount() {
        return 5;
    }

    public C016807f A00(Context context) {
        return new C016907g(context);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        C016907g r1 = (C016907g) this.A04;
        if (r1.A00 != z) {
            r1.A00 = z;
            this.A05.Bwl(false);
        }
    }

    public void onMeasure(int i, int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(C17670ro r1) {
        this.A00 = r1;
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(C17680rp r1) {
        this.A01 = r1;
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.f13nameremoved);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public BottomNavigationView(Context context) {
        this(context, (AttributeSet) null);
    }
}
