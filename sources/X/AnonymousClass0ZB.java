package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.0ZB  reason: invalid class name */
public class AnonymousClass0ZB implements Animator.AnimatorListener {
    public float A00;
    public float A01;
    public float A02;
    public boolean A03;
    public boolean A04 = false;
    public boolean A05 = false;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final int A0A;
    public final ValueAnimator A0B;
    public final AnonymousClass0D3 A0C;
    public final /* synthetic */ int A0D;
    public final /* synthetic */ AnonymousClass0I4 A0E;
    public final /* synthetic */ AnonymousClass0D3 A0F;

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public AnonymousClass0ZB(AnonymousClass0I4 r4, AnonymousClass0D3 r5, AnonymousClass0D3 r6, float f, float f2, float f3, float f4, int i, int i2) {
        this.A0E = r4;
        this.A0D = i2;
        this.A0F = r6;
        this.A0A = i;
        this.A0C = r5;
        this.A06 = f;
        this.A07 = f2;
        this.A08 = f3;
        this.A09 = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A0B = ofFloat;
        ofFloat.addUpdateListener(new AnonymousClass0QY(this, 0));
        ofFloat.setTarget(r5.A0H);
        ofFloat.addListener(this);
        this.A00 = 0.0f;
    }

    public void onAnimationCancel(Animator animator) {
        this.A00 = 1.0f;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass0D3 r2;
        if (!this.A05) {
            this.A0C.A08(true);
        }
        this.A05 = true;
        if (!this.A04) {
            int i = this.A0D;
            AnonymousClass0I4 r3 = this.A0E;
            if (i <= 0) {
                AnonymousClass0XI r1 = r3.A0F;
                RecyclerView recyclerView = r3.A0I;
                r2 = this.A0F;
                r1.A04(r2, recyclerView);
            } else {
                List list = r3.A0P;
                r2 = this.A0F;
                list.add(r2.A0H);
                this.A03 = true;
                r3.A0I.post(new C11520gS(this, r3));
            }
            View view = r3.A0D;
            View view2 = r2.A0H;
            if (view == view2 && view2 == view) {
                r3.A0D = null;
            }
        }
    }
}
