package com.google.android.material.appbar;

import X.AnonymousClass06R;
import X.AnonymousClass076;
import X.AnonymousClass08I;
import X.C011004s;
import X.C011504z;
import X.C012505l;
import X.C013205s;
import X.C27891Qg;
import X.C27931Qk;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] A05 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public ImageView.ScaleType A00;
    public Boolean A01;
    public Integer A02;
    public boolean A03;
    public boolean A04;

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.A01;
        if (bool == null || bool.booleanValue() != z) {
            this.A01 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.A00 != scaleType) {
            this.A00 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.A02 == null)) {
            drawable = AnonymousClass08I.A01(drawable.mutate());
            AnonymousClass076.A06(drawable, this.A02.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setSubtitleCentered(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.A04 != z) {
            this.A04 = z;
            requestLayout();
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    private void A00(Pair pair, View view) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Number) pair.first).intValue() - i, 0), Math.max(i2 - ((Number) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass06R.A01(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r2 = (android.widget.ImageView) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            super.onLayout(r10, r11, r12, r13, r14)
            boolean r0 = r9.A04
            if (r0 != 0) goto L_0x0052
            boolean r0 = r9.A03
            if (r0 != 0) goto L_0x0052
        L_0x000b:
            android.graphics.drawable.Drawable r4 = r9.getLogo()
            if (r4 == 0) goto L_0x004e
            r3 = 0
        L_0x0012:
            int r0 = r9.getChildCount()
            if (r3 >= r0) goto L_0x004e
            android.view.View r2 = r9.getChildAt(r3)
            boolean r0 = r2 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x004f
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.graphics.drawable.Drawable r1 = r2.getDrawable()
            if (r1 == 0) goto L_0x004f
            android.graphics.drawable.Drawable$ConstantState r0 = r1.getConstantState()
            if (r0 == 0) goto L_0x004f
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            android.graphics.drawable.Drawable$ConstantState r0 = r4.getConstantState()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Boolean r0 = r9.A01
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.booleanValue()
            r2.setAdjustViewBounds(r0)
        L_0x0047:
            android.widget.ImageView$ScaleType r0 = r9.A00
            if (r0 == 0) goto L_0x004e
            r2.setScaleType(r0)
        L_0x004e:
            return
        L_0x004f:
            int r3 = r3 + 1
            goto L_0x0012
        L_0x0052:
            java.lang.CharSequence r0 = r9.A0E
            java.util.ArrayList r1 = X.C06960Vu.A00(r9, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x007a
            r5 = 0
        L_0x005f:
            java.lang.CharSequence r0 = r9.A0D
            java.util.ArrayList r1 = X.C06960Vu.A00(r9, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0071
            r4 = 0
        L_0x006c:
            if (r5 != 0) goto L_0x0083
            if (r4 != 0) goto L_0x0083
            goto L_0x000b
        L_0x0071:
            java.util.Comparator r0 = X.C06960Vu.A00
            java.lang.Object r4 = java.util.Collections.max(r1, r0)
            android.view.View r4 = (android.view.View) r4
            goto L_0x006c
        L_0x007a:
            java.util.Comparator r0 = X.C06960Vu.A00
            java.lang.Object r5 = java.util.Collections.min(r1, r0)
            android.view.View r5 = (android.view.View) r5
            goto L_0x005f
        L_0x0083:
            int r7 = r9.getMeasuredWidth()
            int r8 = r7 / 2
            int r6 = r9.getPaddingLeft()
            int r0 = r9.getPaddingRight()
            int r7 = r7 - r0
            r3 = 0
        L_0x0093:
            int r0 = r9.getChildCount()
            if (r3 >= r0) goto L_0x00cc
            android.view.View r2 = r9.getChildAt(r3)
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x00c9
            if (r2 == r5) goto L_0x00c9
            if (r2 == r4) goto L_0x00c9
            int r0 = r2.getRight()
            if (r0 >= r8) goto L_0x00b9
            int r0 = r2.getRight()
            if (r0 <= r6) goto L_0x00b9
            int r6 = r2.getRight()
        L_0x00b9:
            int r0 = r2.getLeft()
            if (r0 <= r8) goto L_0x00c9
            int r0 = r2.getLeft()
            if (r0 >= r7) goto L_0x00c9
            int r7 = r2.getLeft()
        L_0x00c9:
            int r3 = r3 + 1
            goto L_0x0093
        L_0x00cc:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r2, r0)
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x00e2
            if (r5 == 0) goto L_0x00e2
            r9.A00(r1, r5)
        L_0x00e2:
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x000b
            if (r4 == 0) goto L_0x000b
            r9.A00(r1, r4)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void setElevation(float f) {
        super.setElevation(f);
        AnonymousClass06R.A02(this, f);
    }

    public void setNavigationIconTint(int i) {
        this.A02 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.A00;
    }

    public Integer getNavigationIconTint() {
        return this.A02;
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(C27891Qg.A00(context, attributeSet, i, R.style.f13nameremoved), attributeSet, i);
        int i2;
        Context context2 = getContext();
        TypedArray A002 = C013205s.A00(context2, attributeSet, C27931Qk.A0S, new int[0], i, R.style.f13nameremoved);
        if (A002.hasValue(2)) {
            setNavigationIconTint(A002.getColor(2, -1));
        }
        this.A04 = A002.getBoolean(4, false);
        this.A03 = A002.getBoolean(3, false);
        int i3 = A002.getInt(1, -1);
        if (i3 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = A05;
            if (i3 < 8) {
                this.A00 = scaleTypeArr[i3];
            }
        }
        if (A002.hasValue(0)) {
            this.A01 = Boolean.valueOf(A002.getBoolean(0, false));
        }
        A002.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C012505l r1 = new C012505l();
            if (background != null) {
                i2 = ((ColorDrawable) background).getColor();
            } else {
                i2 = 0;
            }
            r1.A0C(ColorStateList.valueOf(i2));
            r1.A0B(context2);
            r1.A09(C011004s.A00(this));
            C011504z.A04(r1, this);
        }
    }

    public MaterialToolbar(Context context) {
        this(context, (AttributeSet) null);
    }
}
