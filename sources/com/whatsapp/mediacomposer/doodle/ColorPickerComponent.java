package com.whatsapp.mediacomposer.doodle;

import X.AnonymousClass000;
import X.AnonymousClass1QZ;
import X.AnonymousClass6FL;
import X.AnonymousClass6H9;
import X.C011504z;
import X.C012005e;
import X.C017907q;
import X.C146686w0;
import X.C158437gv;
import X.C159547jX;
import X.C162857pG;
import X.C18700tb;
import X.C36351kA;
import X.C36431kI;
import X.C36441kJ;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.ImageComposerFragment;

public class ColorPickerComponent extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public AnonymousClass6FL A02;
    public final ColorPickerView A03;
    public final View A04;
    public final ViewGroup A05;

    private void A01(int i) {
        int i2;
        View view = this.A04;
        int paddingLeft = view.getPaddingLeft();
        int dimension = (int) getResources().getDimension(R.dimen.f7nameremoved);
        int paddingRight = view.getPaddingRight();
        if (i == 2) {
            i2 = (int) getResources().getDimension(R.dimen.f7nameremoved);
        } else {
            i2 = 0;
        }
        view.setPadding(paddingLeft, dimension, paddingRight, i2);
    }

    private void A00(int i) {
        ColorPickerView colorPickerView = this.A03;
        colorPickerView.clearAnimation();
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), i);
        loadAnimation.setInterpolator(C017907q.A00(0.5f, 1.35f, 0.4f, 1.0f));
        colorPickerView.startAnimation(loadAnimation);
    }

    public void A02() {
        ColorPickerView colorPickerView = this.A03;
        if (colorPickerView.getVisibility() != 0) {
            colorPickerView.setVisibility(0);
            A00(R.anim.f1nameremoved);
        }
        AnonymousClass6FL r1 = this.A02;
        if (r1 != null && (r1 instanceof C162857pG)) {
            C162857pG r12 = (C162857pG) r1;
            if (r12.A01 == 0) {
                ImageComposerFragment.A0A((ImageComposerFragment) r12.A00, false, true);
            }
        }
    }

    public void A03(AnonymousClass6FL r4, C159547jX r5, C158437gv r6) {
        this.A02 = r4;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = (int) getResources().getDimension(R.dimen.f7nameremoved);
        setLayoutParams(layoutParams);
        if (r6 != null) {
            ColorPickerView colorPickerView = this.A03;
            r6.BsM(colorPickerView.A01, colorPickerView.A00);
        }
        this.A03.A05 = new C146686w0(r5, this, r6);
    }

    public void A04(boolean z) {
        ColorPickerView colorPickerView = this.A03;
        if (colorPickerView.getVisibility() == 0) {
            if (z) {
                A00(R.anim.f1nameremoved);
            }
            colorPickerView.setVisibility(4);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public int getColorPickerHeight() {
        return this.A03.getHeight();
    }

    public float getMinSize() {
        return (float) this.A03.A03;
    }

    public int getSelectedColor() {
        return this.A03.A01;
    }

    public float getSelectedStrokeSize() {
        return this.A03.A00;
    }

    public void setColorAndInvalidate(int i) {
        this.A03.setColorAndInvalidate(i);
    }

    public void setInsets(Rect rect) {
        ViewGroup viewGroup = this.A05;
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(viewGroup);
        A0a.leftMargin = rect.left;
        A0a.topMargin = rect.top;
        A0a.rightMargin = rect.right;
        A0a.bottomMargin = rect.bottom;
        viewGroup.setLayoutParams(A0a);
    }

    public void setMaxHeight(int i) {
        this.A03.A02 = i;
    }

    public void setSizeAndInvalidate(float f) {
        this.A03.setSizeAndInvalidate(f);
    }

    public ColorPickerComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        ViewGroup viewGroup = (ViewGroup) C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
        this.A05 = viewGroup;
        ColorPickerView colorPickerView = (ColorPickerView) C012005e.A02(viewGroup, R.id.color_picker);
        this.A03 = colorPickerView;
        this.A04 = C012005e.A02(viewGroup, R.id.color_picker_container);
        C011504z.A06(colorPickerView, 1);
        AnonymousClass6H9.A00(colorPickerView, colorPickerView.A01);
        A01(C36431kI.A0H(this).orientation);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A01(configuration.orientation);
    }

    public ColorPickerComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorPickerComponent(Context context) {
        this(context, (AttributeSet) null);
    }
}
