package com.whatsapp.quickactionbar;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass2xF;
import X.AnonymousClass5JP;
import X.AnonymousClass5JQ;
import X.AnonymousClass5JR;
import X.AnonymousClass5JS;
import X.AnonymousClass62A;
import X.C127886Aa;
import X.C36331k8;
import X.C36361kB;
import X.C36381kD;
import X.C36411kG;
import X.C90484aE;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class WaQuickActionChip extends LinearLayout {
    public WaImageView A00;
    public AnonymousClass62A A01;
    public final WaImageView A02;
    public final WaTextView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaQuickActionChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass62A r2;
        AnonymousClass00C.A0D(context, 1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        WaTextView waTextView = (WaTextView) C36361kB.A0F(inflate, R.id.label);
        this.A03 = waTextView;
        this.A02 = (WaImageView) C36361kB.A0F(inflate, R.id.icon);
        waTextView.setMaxLines(1);
        C36331k8.A0r(context, waTextView, R.color.f6nameremoved);
        if (attributeSet != null) {
            int[] iArr = AnonymousClass2xF.A0S;
            AnonymousClass00C.A09(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int i = obtainStyledAttributes.getInt(0, 0);
            if (i == 0) {
                r2 = new AnonymousClass5JQ(C127886Aa.A00(obtainStyledAttributes, 4, 5, R.color.f6nameremoved));
            } else if (i == 1) {
                r2 = new AnonymousClass5JP(C127886Aa.A00(obtainStyledAttributes, 1, 2, R.color.f6nameremoved));
            } else if (i == 2) {
                r2 = new AnonymousClass5JR(C127886Aa.A00(obtainStyledAttributes, 4, 5, R.color.f6nameremoved), C127886Aa.A00(obtainStyledAttributes, 1, 2, R.color.f6nameremoved));
            } else if (i == 3) {
                r2 = AnonymousClass5JS.A00;
            } else {
                throw AnonymousClass001.A0D();
            }
            this.A01 = r2;
            A02(r2);
            waTextView.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(obtainStyledAttributes.getInt(3, 20))});
            obtainStyledAttributes.recycle();
        }
    }

    private final Drawable A00(Integer num, int i) {
        int intValue;
        Drawable A002;
        if (num == null || (intValue = num.intValue()) == 0 || (A002 = AnonymousClass00E.A00(getContext(), intValue)) == null) {
            return null;
        }
        A002.setBounds(0, 0, 50, 50);
        A002.setTint(C36381kD.A05(this, i));
        A002.setTintMode(PorterDuff.Mode.SRC_IN);
        return A002;
    }

    public final void setChipVariant(AnonymousClass62A r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
        A02(r2);
        invalidate();
    }

    public final void setIconsForChip(C127886Aa r4, C127886Aa r5) {
        Drawable drawable;
        AnonymousClass00C.A0D(r4, 0);
        Drawable A002 = A00(r4.A01, r4.A00);
        if (r5 != null) {
            drawable = A00(r5.A01, r5.A00);
        } else {
            drawable = null;
        }
        setIconDawableForChip(A002, drawable);
    }

    public final void setLabel(String str) {
        AnonymousClass00C.A0D(str, 0);
        WaTextView waTextView = this.A03;
        waTextView.setText(str);
        waTextView.setVisibility(0);
    }

    private final void A02(AnonymousClass62A r5) {
        Drawable drawable = null;
        if (r5 instanceof AnonymousClass5JQ) {
            A01();
            C127886Aa r2 = ((AnonymousClass5JQ) r5).A00;
            if (r2 != null) {
                drawable = A00(Integer.valueOf(C90484aE.A0B(r2.A01)), r2.A00);
            }
            this.A02.setImageDrawable(drawable);
        } else if (r5 instanceof AnonymousClass5JR) {
            A01();
            AnonymousClass5JR r52 = (AnonymousClass5JR) r5;
            C127886Aa r0 = r52.A00;
            Drawable A002 = A00(r0.A01, r0.A00);
            C127886Aa r02 = r52.A01;
            setIconDawableForChip(A002, A00(r02.A01, r02.A00));
        } else if (r5 instanceof AnonymousClass5JP) {
            A01();
            C127886Aa r03 = ((AnonymousClass5JP) r5).A00;
            setIconDawableForChip((Drawable) null, A00(r03.A01, r03.A00));
        } else if (r5 instanceof AnonymousClass5JS) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
            C36411kG.A1A(this, dimensionPixelOffset);
            getLayoutParams().width = dimensionPixelOffset;
            this.A03.setVisibility(0);
            C127886Aa r04 = r5.A00;
            if (r04 != null) {
                this.A02.setImageDrawable(A00(r04.A01, r04.A00));
            }
        }
    }

    private final void setIconDawableForChip(Drawable drawable, Drawable drawable2) {
        this.A02.setImageDrawable(drawable);
        if (drawable2 != null) {
            if (this.A00 == null) {
                WaImageView waImageView = new WaImageView(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(waImageView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0, 0, 0);
                waImageView.setLayoutParams(layoutParams);
                this.A00 = waImageView;
                addView(waImageView);
            }
            WaImageView waImageView2 = this.A00;
            if (waImageView2 == null) {
                throw C36331k8.A0d("endIconView");
            }
            waImageView2.setImageDrawable(drawable2);
            WaImageView waImageView3 = this.A00;
            if (waImageView3 == null) {
                throw C36331k8.A0d("endIconView");
            }
            waImageView3.setVisibility(0);
        }
    }

    private final void A01() {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setMinimumHeight(dimensionPixelOffset);
        layoutParams.gravity = 16;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        setLayoutParams(layoutParams);
    }

    public final void setLabel(int i) {
        WaTextView waTextView = this.A03;
        waTextView.setText(i);
        waTextView.setVisibility(0);
    }
}
