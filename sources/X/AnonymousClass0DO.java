package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.util.Property;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.0DO  reason: invalid class name */
public class AnonymousClass0DO extends AnimatorListenerAdapter {
    public Matrix A00 = new Matrix();
    public boolean A01;
    public final /* synthetic */ Matrix A02;
    public final /* synthetic */ C07070Wf A03;
    public final /* synthetic */ AnonymousClass0IP A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ View A06;
    public final /* synthetic */ AnonymousClass0XA A07;

    public void onAnimationCancel(Animator animator) {
        this.A01 = true;
    }

    public AnonymousClass0DO(Matrix matrix, View view, C07070Wf r4, AnonymousClass0XA r5, AnonymousClass0IP r6, boolean z) {
        this.A04 = r6;
        this.A05 = z;
        this.A02 = matrix;
        this.A06 = view;
        this.A07 = r5;
        this.A03 = r4;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.A01) {
            if (this.A05) {
                Matrix matrix = this.A02;
                Matrix matrix2 = this.A00;
                matrix2.set(matrix);
                View view = this.A06;
                view.setTag(R.id.transition_transform, matrix2);
                this.A07.A01(view);
            } else {
                View view2 = this.A06;
                view2.setTag(R.id.transition_transform, (Object) null);
                view2.setTag(R.id.parent_matrix, (Object) null);
            }
        }
        View view3 = this.A06;
        AnonymousClass0W5.A02.A01((Matrix) null, view3);
        this.A07.A01(view3);
    }

    public void onAnimationPause(Animator animator) {
        Matrix matrix = this.A03.A02;
        Matrix matrix2 = this.A00;
        matrix2.set(matrix);
        View view = this.A06;
        view.setTag(R.id.transition_transform, matrix2);
        this.A07.A01(view);
    }

    public void onAnimationResume(Animator animator) {
        View view = this.A06;
        Property property = AnonymousClass0IP.A01;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C011004s.A06(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}
