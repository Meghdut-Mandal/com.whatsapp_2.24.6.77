package com.whatsapp.components;

import X.AnonymousClass00F;
import X.AnonymousClass2xF;
import X.AnonymousClass3UF;
import X.C36351kA;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C89214Vr;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class SelectionCheckView extends FrameLayout {
    public ShapeDrawable A00;
    public View A01;
    public AnimationSet A02;
    public AnimationSet A03;
    public ScaleAnimation A04;
    public ScaleAnimation A05;
    public ScaleAnimation A06;
    public ScaleAnimation A07;
    public ScaleAnimation A08;
    public ScaleAnimation A09;
    public FrameLayout A0A;
    public ImageView A0B;
    public boolean A0C = false;
    public boolean A0D = false;
    public int A0E;
    public boolean A0F = true;

    private ScaleAnimation A00(View view) {
        ScaleAnimation A0M = C36391kE.A0M(0.0f, 1.0f);
        C36381kD.A1D(A0M, 100);
        A0M.setRepeatCount(0);
        C89214Vr.A00(A0M, this, view, 2);
        return A0M;
    }

    public void A03(Context context, AttributeSet attributeSet) {
        String str;
        this.A0C = false;
        int i = R.drawable.ic_checkmark_selected;
        int A022 = C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        int A023 = C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2xF.A0J);
            i = obtainStyledAttributes.getResourceId(2, R.drawable.ic_checkmark_selected);
            str = obtainStyledAttributes.getString(3);
            A022 = obtainStyledAttributes.getColor(4, A022);
            A023 = obtainStyledAttributes.getColor(0, A023);
            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
            obtainStyledAttributes.recycle();
        } else {
            str = null;
        }
        this.A0E = A022;
        if (str == null) {
            str = context.getString(R.string.f12nameremoved);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ShapeDrawable A0F2 = C36411kG.A0F();
        A0F2.getPaint().setColor(C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        ShapeDrawable A0F3 = C36411kG.A0F();
        this.A00 = A0F3;
        A0F3.getPaint().setColor(A023);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.A0A = frameLayout;
        frameLayout.setLayoutParams(layoutParams);
        this.A0A.setBackground(A0F2);
        this.A0A.setForeground(this.A00);
        this.A0A.setVisibility(4);
        addView(this.A0A);
        ShapeDrawable A0F4 = C36411kG.A0F();
        A0F4.getPaint().setColor(A022);
        this.A01 = new WaImageView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1, 17);
        layoutParams2.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A01.setLayoutParams(layoutParams2);
        this.A01.setBackground(A0F4);
        this.A01.setVisibility(4);
        addView(this.A01);
        WaImageView waImageView = new WaImageView(getContext());
        this.A0B = waImageView;
        waImageView.setLayoutParams(layoutParams);
        AnonymousClass3UF.A0E(this.A0B, C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        C36391kE.A18(getContext(), this.A0B, i);
        this.A0B.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.A0B.setVisibility(4);
        this.A0B.setContentDescription(str);
        addView(this.A0B);
    }

    private ScaleAnimation A01(View view) {
        ScaleAnimation A0M = C36391kE.A0M(1.0f, 0.0f);
        A0M.setDuration(100);
        A0M.setInterpolator(new AccelerateInterpolator());
        A0M.setRepeatCount(0);
        C89214Vr.A00(A0M, this, view, 3);
        return A0M;
    }

    private void A02() {
        ScaleAnimation A002 = A00(this.A0A);
        this.A06 = A002;
        A002.setStartOffset(20);
        this.A08 = A00(this.A01);
        ScaleAnimation A003 = A00(this.A0B);
        this.A04 = A003;
        A003.setStartOffset(10);
        AnimationSet animationSet = new AnimationSet(false);
        this.A02 = animationSet;
        animationSet.addAnimation(this.A06);
        this.A02.addAnimation(this.A08);
        this.A02.addAnimation(this.A04);
        this.A07 = A01(this.A0A);
        ScaleAnimation A012 = A01(this.A01);
        this.A09 = A012;
        A012.setStartOffset(20);
        ScaleAnimation A013 = A01(this.A0B);
        this.A05 = A013;
        A013.setStartOffset(10);
        AnimationSet animationSet2 = new AnimationSet(false);
        this.A03 = animationSet2;
        animationSet2.addAnimation(this.A07);
        this.A03.addAnimation(this.A09);
        this.A03.addAnimation(this.A05);
        this.A0C = true;
    }

    public void A04(boolean z, boolean z2) {
        int i;
        FrameLayout frameLayout;
        AnimationSet animationSet;
        if (this.A0D != z) {
            if (z) {
                if (z2) {
                    if (!this.A0C) {
                        A02();
                    }
                    setVisibility(0);
                    this.A0A.clearAnimation();
                    this.A01.clearAnimation();
                    this.A0B.clearAnimation();
                    this.A0A.setAnimation(this.A06);
                    this.A01.setAnimation(this.A08);
                    this.A0B.setAnimation(this.A04);
                    this.A0A.setForeground(this.A00);
                    animationSet = this.A02;
                } else {
                    i = 0;
                    setVisibility(0);
                    frameLayout = this.A0A;
                    frameLayout.setVisibility(i);
                    this.A01.setVisibility(i);
                    this.A0B.setVisibility(i);
                    this.A0D = z;
                }
            } else if (z2) {
                if (!this.A0C) {
                    A02();
                }
                this.A0A.clearAnimation();
                this.A01.clearAnimation();
                this.A0B.clearAnimation();
                this.A0A.setAnimation(this.A07);
                this.A01.setAnimation(this.A09);
                this.A0B.setAnimation(this.A05);
                this.A0A.setForeground((Drawable) null);
                animationSet = this.A03;
            } else {
                frameLayout = this.A0A;
                i = 4;
                frameLayout.setVisibility(i);
                this.A01.setVisibility(i);
                this.A0B.setVisibility(i);
                this.A0D = z;
            }
            animationSet.start();
            this.A0D = z;
        }
    }

    public void setEnabled(boolean z) {
        int A002;
        if (this.A0F != z) {
            if (z) {
                A002 = this.A0E;
            } else {
                A002 = AnonymousClass00F.A00(getContext(), R.color.f6nameremoved);
            }
            ShapeDrawable A0F2 = C36411kG.A0F();
            A0F2.getPaint().setColor(A002);
            this.A01.setBackground(A0F2);
            this.A0F = z;
        }
    }

    public void setIcon(int i) {
        C36391kE.A18(getContext(), this.A0B, i);
    }

    public void setSelectionBackground(int i) {
        this.A01.setBackgroundResource(i);
    }

    public SelectionCheckView(Context context) {
        super(context);
        A03(context, (AttributeSet) null);
    }

    public boolean isEnabled() {
        return this.A0F;
    }

    public SelectionCheckView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03(context, attributeSet);
    }

    public void setSelectionBackground(Drawable drawable) {
        this.A01.setBackground(drawable);
    }

    public SelectionCheckView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A03(context, attributeSet);
    }

    public SelectionCheckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03(context, attributeSet);
    }
}
