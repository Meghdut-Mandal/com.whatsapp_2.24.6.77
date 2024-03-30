package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0DH  reason: invalid class name */
public class AnonymousClass0DH extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C02960Co A02;
    public final /* synthetic */ AnonymousClass0BV A03;
    public final /* synthetic */ AnonymousClass0Bl A04;
    public final /* synthetic */ boolean A05;

    public AnonymousClass0DH(View view, ViewGroup viewGroup, C02960Co r3, AnonymousClass0BV r4, AnonymousClass0Bl r5, boolean z) {
        this.A03 = r4;
        this.A01 = viewGroup;
        this.A00 = view;
        this.A05 = z;
        this.A04 = r5;
        this.A02 = r3;
    }

    public void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.A01;
        View view = this.A00;
        viewGroup.endViewTransition(view);
        if (this.A05) {
            C02670Bj.A02(view, this.A04.A00);
        }
        this.A02.A01();
        if (AnonymousClass01z.A0E(2)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Animator from operation ");
            A0u.append(this.A04);
            Log.v("FragmentManager", AnonymousClass000.A0q(" has ended.", A0u));
        }
    }
}
