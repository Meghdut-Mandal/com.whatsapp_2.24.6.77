package com.whatsapp.components;

import X.AnonymousClass00C;
import X.AnonymousClass2xF;
import X.C05250Oz;
import X.C133416Yk;
import X.C135766dE;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C66943Xx;
import X.C90574aN;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public final class AutoScrollView extends FrameLayout {
    public HorizontalScrollView A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final WaTextView A09;
    public final WaTextView A0A;
    public final long A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        this.A06 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A03 = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2xF.A01);
        AnonymousClass00C.A08(obtainStyledAttributes);
        this.A0B = (long) obtainStyledAttributes.getInt(2, 3500);
        this.A08 = (long) obtainStyledAttributes.getInt(0, 5000);
        this.A07 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.A04 = obtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        this.A05 = obtainStyledAttributes.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        obtainStyledAttributes.recycle();
        Object systemService = context.getSystemService("layout_inflater");
        AnonymousClass00C.A0E(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.f9nameremoved, this, true);
        this.A09 = C36341k9.A0Q(inflate, R.id.main_text_view);
        WaTextView A0Q = C36341k9.A0Q(inflate, R.id.placeholder_text_view);
        this.A0A = A0Q;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) C36361kB.A0G(inflate, R.id.horizontal_scroll_view);
        this.A00 = horizontalScrollView;
        horizontalScrollView.setOnTouchListener(C135766dE.A00);
        this.A00.getChildAt(0).setOnClickListener(new C66943Xx(inflate, 22));
        A0Q.setVisibility(8);
    }

    public static final void A00(AutoScrollView autoScrollView, float f, int i, int i2, int i3, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(j);
        long j2 = autoScrollView.A0B;
        if (j2 <= 0) {
            ofFloat.setRepeatCount(-1);
        }
        ofFloat.addUpdateListener(new C133416Yk(autoScrollView, f, i, i2, i3));
        AnimatorSet A0C = C36441kJ.A0C();
        if (j2 > 0) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat2.setDuration(j2);
            A0C.addListener(new C90574aN());
            Animator[] animatorArr = new Animator[2];
            C36331k8.A1N(ofFloat2, ofFloat, animatorArr);
            A0C.playSequentially(animatorArr);
        } else {
            A0C.play(ofFloat);
        }
        A0C.start();
    }

    public final void setText(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A09.setText(str);
        this.A0A.setText(str);
    }

    public final CharSequence getText() {
        CharSequence text = this.A09.getText();
        AnonymousClass00C.A08(text);
        return text;
    }

    public final HorizontalScrollView getHorizontalScrollView() {
        return this.A00;
    }

    public final int getScrollWidth() {
        return this.A05;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutoScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public final void setText(int i) {
        this.A09.setText(i);
        this.A0A.setText(i);
    }

    public /* synthetic */ AutoScrollView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutoScrollView(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
