package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.0DG  reason: invalid class name */
public class AnonymousClass0DG extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass0IO A01;

    public AnonymousClass0DG(View view, AnonymousClass0IO r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass0VN.A01(this.A00, (Rect) null);
    }
}
