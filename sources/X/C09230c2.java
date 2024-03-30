package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: X.0c2  reason: invalid class name and case insensitive filesystem */
public class C09230c2 implements Animation.AnimationListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C02960Co A02;
    public final /* synthetic */ AnonymousClass0BV A03;
    public final /* synthetic */ AnonymousClass0Bl A04;

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        if (AnonymousClass01z.A0E(2)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Animation from operation ");
            A0u.append(this.A04);
            Log.v("FragmentManager", AnonymousClass000.A0q(" has reached onAnimationStart.", A0u));
        }
    }

    public C09230c2(View view, ViewGroup viewGroup, C02960Co r3, AnonymousClass0BV r4, AnonymousClass0Bl r5) {
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = viewGroup;
        this.A00 = view;
        this.A02 = r3;
    }

    public void onAnimationEnd(Animation animation) {
        this.A01.post(new C11210fu(this));
        if (AnonymousClass01z.A0E(2)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Animation from operation ");
            A0u.append(this.A04);
            Log.v("FragmentManager", AnonymousClass000.A0q(" has ended.", A0u));
        }
    }
}
