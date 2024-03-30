package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.0DQ  reason: invalid class name */
public class AnonymousClass0DQ extends AnimatorListenerAdapter implements C17290r2 {
    public float A00;
    public float A01;
    public int[] A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final View A07;
    public final View A08;

    public void Bjc(AnonymousClass054 r1) {
    }

    public void Bje(AnonymousClass054 r1) {
    }

    public void Bjf(AnonymousClass054 r1) {
    }

    public void Bjg(AnonymousClass054 r1) {
    }

    public void Bjd(AnonymousClass054 r3) {
        View view = this.A07;
        view.setTranslationX(this.A03);
        view.setTranslationY(this.A04);
        r3.A0B(this);
    }

    public void onAnimationCancel(Animator animator) {
        int[] iArr = this.A02;
        if (iArr == null) {
            iArr = new int[2];
            this.A02 = iArr;
        }
        View view = this.A07;
        iArr[0] = Math.round(((float) this.A05) + view.getTranslationX());
        this.A02[1] = Math.round(((float) this.A06) + view.getTranslationY());
        this.A08.setTag(R.id.transition_position, this.A02);
    }

    public void onAnimationPause(Animator animator) {
        View view = this.A07;
        this.A00 = view.getTranslationX();
        this.A01 = view.getTranslationY();
        view.setTranslationX(this.A03);
        view.setTranslationY(this.A04);
    }

    public void onAnimationResume(Animator animator) {
        View view = this.A07;
        view.setTranslationX(this.A00);
        view.setTranslationY(this.A01);
    }

    public AnonymousClass0DQ(View view, View view2, float f, float f2, int i, int i2) {
        this.A07 = view;
        this.A08 = view2;
        this.A05 = i - Math.round(view.getTranslationX());
        this.A06 = i2 - Math.round(view.getTranslationY());
        this.A03 = f;
        this.A04 = f2;
        int[] iArr = (int[]) view2.getTag(R.id.transition_position);
        this.A02 = iArr;
        if (iArr != null) {
            view2.setTag(R.id.transition_position, (Object) null);
        }
    }
}
