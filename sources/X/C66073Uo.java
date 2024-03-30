package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3Uo  reason: invalid class name and case insensitive filesystem */
public class C66073Uo implements LayoutTransition.TransitionListener {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ AnonymousClass15G A01;

    public void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
    }

    public C66073Uo(ViewGroup viewGroup, AnonymousClass15G r2) {
        this.A01 = r2;
        this.A00 = viewGroup;
    }

    public void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        this.A00.setLayoutTransition((LayoutTransition) null);
    }
}
