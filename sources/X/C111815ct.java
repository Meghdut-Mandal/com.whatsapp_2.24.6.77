package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.calling.callgrid.view.PipViewContainer;

/* renamed from: X.5ct  reason: invalid class name and case insensitive filesystem */
public class C111815ct implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Object A04;
    public Object A05;
    public final int A06 = 0;

    public C111815ct(ViewGroup.LayoutParams layoutParams, AnonymousClass6SU r3, int i, int i2, int i3, int i4) {
        this.A04 = r3;
        this.A05 = layoutParams;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        int i2;
        if (this.A06 != 0) {
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) this.A05;
            int i3 = this.A00;
            int i4 = this.A01;
            int i5 = this.A02;
            int i6 = this.A03;
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float f = 1.0f - animatedFraction;
            layoutParams.width = (int) ((((float) i3) * animatedFraction) + (((float) i4) * f));
            layoutParams.height = (int) ((animatedFraction * ((float) i5)) + (f * ((float) i6)));
            ((AnonymousClass6SU) this.A04).A04.setLayoutParams(layoutParams);
            return;
        }
        float animatedFraction2 = valueAnimator.getAnimatedFraction();
        PipViewContainer pipViewContainer = (PipViewContainer) this.A05;
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(pipViewContainer);
        C18820ts r6 = pipViewContainer.A07;
        C18740tg.A06(r6);
        if (animatedFraction2 == 0.0f) {
            this.A03 = A0a.topMargin;
            if (C36351kA.A1Y(r6)) {
                i2 = A0a.leftMargin;
            } else {
                i2 = A0a.rightMargin;
            }
            this.A02 = i2;
            pipViewContainer.getWidth();
            pipViewContainer.getHeight();
        }
        View view = (View) this.A04;
        int i7 = ((int) (((float) this.A01) * animatedFraction2)) + this.A02;
        int i8 = A0a.topMargin;
        if (C36351kA.A1Y(r6)) {
            i = A0a.rightMargin;
        } else {
            i = A0a.leftMargin;
        }
        AnonymousClass1JZ.A06(view, r6, i7, i8, i, A0a.bottomMargin);
        ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(pipViewContainer);
        A0a2.topMargin = this.A03 + ((int) (((float) this.A00) * animatedFraction2));
        pipViewContainer.setLayoutParams(A0a2);
    }

    public C111815ct(View view, PipViewContainer pipViewContainer, int i, int i2) {
        this.A05 = pipViewContainer;
        this.A04 = view;
        this.A01 = i;
        this.A00 = i2;
    }
}
