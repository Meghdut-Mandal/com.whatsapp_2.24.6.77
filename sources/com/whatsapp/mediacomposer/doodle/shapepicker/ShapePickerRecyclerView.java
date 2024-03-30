package com.whatsapp.mediacomposer.doodle.shapepicker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0CZ;
import X.AnonymousClass0V2;
import X.C02800By;
import X.C162497og;
import X.C36341k9;
import X.C95684m1;
import X.C96184mv;
import X.C97074oM;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.R;
import com.whatsapp.media.GridLayoutManagerNonPredictiveAnimations;

public class ShapePickerRecyclerView extends C97074oM {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass0V2 A03;
    public GridLayoutManagerNonPredictiveAnimations A04;
    public int A05;

    private void A07(GridLayoutManager gridLayoutManager, AnonymousClass0CZ r4) {
        if (r4 instanceof C96184mv) {
            C96184mv r42 = (C96184mv) r4;
            gridLayoutManager.A02 = new C95684m1(gridLayoutManager, r42, this);
            int i = this.A01;
            if (r42.A00 != i) {
                r42.A00 = i;
                if (r42.A01 == null) {
                    r42.A0L();
                }
            }
        }
    }

    public static void A08(ShapePickerRecyclerView shapePickerRecyclerView) {
        if (shapePickerRecyclerView.A01 == -1) {
            int measuredWidth = shapePickerRecyclerView.getMeasuredWidth();
            int i = shapePickerRecyclerView.A05;
            int i2 = i + shapePickerRecyclerView.A02;
            int i3 = measuredWidth / i2;
            if ((i2 * i3) + i <= shapePickerRecyclerView.getMeasuredWidth()) {
                i3++;
            }
            shapePickerRecyclerView.A01 = Math.max(1, i3);
        }
    }

    public int getActualShapeSpacing() {
        int i = this.A00;
        if (i == -1) {
            A08(this);
            if (this.A01 > 1) {
                int measuredWidth = getMeasuredWidth();
                int i2 = this.A01;
                i = (measuredWidth - (this.A05 * i2)) / (i2 - 1);
            } else {
                i = 0;
            }
            this.A00 = i;
        }
        return i;
    }

    public int getAdapterItemCount() {
        AnonymousClass0CZ r0 = this.A0G;
        if (r0 != null) {
            return r0.A0J();
        }
        throw AnonymousClass001.A09("Must set adapter first");
    }

    public ShapePickerRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A06(context);
    }

    private void A06(Context context) {
        this.A05 = context.getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
        boolean A1S = AnonymousClass000.A1S(C36341k9.A04(getContext()), 1);
        Resources A0F = C36341k9.A0F(this);
        int i = R.dimen.f7nameremoved;
        if (A1S) {
            i = R.dimen.f7nameremoved;
        }
        this.A02 = A0F.getDimensionPixelSize(i);
        this.A00 = -1;
        this.A01 = -1;
        this.A0U = true;
        this.A03 = new C162497og(context, this, 1);
    }

    public void A16(boolean z, boolean z2) {
        int i;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        Resources resources = getResources();
        int i2 = R.dimen.f7nameremoved;
        if (z) {
            i2 = R.dimen.f7nameremoved;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
        if (z2) {
            Resources resources2 = getResources();
            int i3 = R.dimen.f7nameremoved;
            if (z) {
                i3 = R.dimen.f7nameremoved;
            }
            i = resources2.getDimensionPixelSize(i3);
        } else {
            i = 0;
        }
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, i);
    }

    public int getColumnCount() {
        A08(this);
        return this.A01;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean A1O = AnonymousClass000.A1O(configuration.orientation);
        Resources A0F = C36341k9.A0F(this);
        int i = R.dimen.f7nameremoved;
        if (A1O) {
            i = R.dimen.f7nameremoved;
        }
        this.A02 = A0F.getDimensionPixelSize(i);
        this.A00 = -1;
        this.A01 = -1;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A00 = -1;
        this.A01 = -1;
        A08(this);
        GridLayoutManager gridLayoutManager = (GridLayoutManager) getLayoutManager();
        int i3 = this.A01;
        gridLayoutManager.A1o(i3 * i3);
        A07(gridLayoutManager, this.A0G);
        A0b();
    }

    public void setAdapter(AnonymousClass0CZ r4) {
        super.setAdapter(r4);
        this.A00 = -1;
        this.A01 = -1;
        A08(this);
        Context context = getContext();
        int i = this.A01;
        this.A04 = new GridLayoutManagerNonPredictiveAnimations(context, i * i);
        setItemAnimator((C02800By) null);
        A07(this.A04, r4);
        setLayoutManager(this.A04);
    }

    public ShapePickerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A06(context);
    }

    public ShapePickerRecyclerView(Context context) {
        super(context);
        A06(context);
    }
}
