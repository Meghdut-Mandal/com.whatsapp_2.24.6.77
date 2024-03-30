package com.google.android.material.chip;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0EN;
import X.AnonymousClass0EP;
import X.AnonymousClass0SK;
import X.AnonymousClass0YY;
import X.AnonymousClass0f1;
import X.C011504z;
import X.C013205s;
import X.C07650Ys;
import X.C09170bw;
import X.C10710ez;
import X.C16070oV;
import X.C16080oW;
import X.C17470rT;
import X.C27891Qg;
import X.C27931Qk;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ChipGroup extends AnonymousClass0EP {
    public int A00;
    public C16080oW A01;
    public int A02;
    public final AnonymousClass0YY A03;
    public final int A04;
    public final C09170bw A05;

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && AnonymousClass001.A05(this, i2) == 0) {
                i++;
            }
        }
        return i;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass0EN();
    }

    public int getCheckedChipId() {
        AnonymousClass0YY r1 = this.A03;
        if (!r1.A02) {
            return -1;
        }
        Set set = r1.A04;
        if (!set.isEmpty()) {
            return AnonymousClass000.A0I(set.iterator().next());
        }
        return -1;
    }

    public List getCheckedChipIds() {
        return this.A03.A03(this);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            this.A00 = i;
            requestLayout();
        }
    }

    public void setChipSpacingVertical(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            this.A01 = i;
            requestLayout();
        }
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw AnonymousClass001.A0E("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw AnonymousClass001.A0E("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw AnonymousClass001.A0E("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(C16070oV r2) {
        C10710ez r0;
        if (r2 == null) {
            r0 = null;
        } else {
            r0 = new C10710ez(r2, this);
        }
        this.A01 = r0;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A05.A00 = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.A03.A01 = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw AnonymousClass001.A0E("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw AnonymousClass001.A0E("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleSelection(boolean z) {
        AnonymousClass0YY r4 = this.A03;
        if (r4.A02 != z) {
            r4.A02 = z;
            boolean z2 = !r4.A04.isEmpty();
            Iterator A0z = AnonymousClass000.A0z(r4.A03);
            while (A0z.hasNext()) {
                AnonymousClass0YY.A02(r4, (C17470rT) A0z.next(), false);
            }
            if (z2) {
                AnonymousClass0YY.A00(r4);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof AnonymousClass0EN)) {
            return false;
        }
        return true;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass0EN(getContext(), attributeSet);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.A04;
        if (i != -1) {
            AnonymousClass0YY r2 = this.A03;
            C17470rT r0 = (C17470rT) r2.A03.get(Integer.valueOf(i));
            if (r0 != null && AnonymousClass0YY.A01(r2, r0)) {
                AnonymousClass0YY.A00(r2);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C07650Ys r4 = new C07650Ys(accessibilityNodeInfo);
        if (this.A03) {
            i = getVisibleChipCount();
        } else {
            i = -1;
        }
        int i2 = this.A02;
        int i3 = 2;
        if (this.A03.A02) {
            i3 = 1;
        }
        r4.A0J(new AnonymousClass0SK(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i, false, i3)));
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    public void setSingleLine(int i) {
        this.A03 = getResources().getBoolean(i);
    }

    public void setOnCheckedStateChangeListener(C16080oW r1) {
        this.A01 = r1;
    }

    public int getChipSpacingHorizontal() {
        return this.A00;
    }

    public int getChipSpacingVertical() {
        return this.A02;
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(C27891Qg.A00(context, attributeSet, i, R.style.f13nameremoved), attributeSet, i);
        AnonymousClass0YY r2 = new AnonymousClass0YY();
        this.A03 = r2;
        C09170bw r1 = new C09170bw(this);
        this.A05 = r1;
        TypedArray A002 = C013205s.A00(getContext(), attributeSet, C27931Qk.A06, new int[0], i, R.style.f13nameremoved);
        int dimensionPixelOffset = A002.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(A002.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(A002.getDimensionPixelOffset(3, dimensionPixelOffset));
        this.A03 = A002.getBoolean(5, false);
        setSingleSelection(A002.getBoolean(6, false));
        setSelectionRequired(A002.getBoolean(4, false));
        this.A04 = A002.getResourceId(0, -1);
        A002.recycle();
        r2.A00 = new AnonymousClass0f1(this);
        super.setOnHierarchyChangeListener(r1);
        C011504z.A06(this, 1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new AnonymousClass0EN(layoutParams);
    }

    public void setSingleLine(boolean z) {
        this.A03 = z;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public ChipGroup(Context context) {
        this(context, (AttributeSet) null);
    }
}
