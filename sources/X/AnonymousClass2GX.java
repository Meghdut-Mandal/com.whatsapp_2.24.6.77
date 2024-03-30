package X;

import android.animation.TimeInterpolator;
import android.view.View;

/* renamed from: X.2GX  reason: invalid class name */
public class AnonymousClass2GX extends C67713aM {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass0V7 A01;
    public final /* synthetic */ C62003Ei A02;
    public final /* synthetic */ C42741zP A03;

    public AnonymousClass2GX(View view, AnonymousClass0V7 r2, C62003Ei r3, C42741zP r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = view;
    }

    public void BR7(View view) {
        this.A01.A09((C17190qs) null);
        View view2 = this.A00;
        view2.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        C42741zP r3 = this.A03;
        C62003Ei r2 = this.A02;
        r3.A06(r2.A04);
        TimeInterpolator timeInterpolator = C42741zP.A0B;
        C36391kE.A1M(r3, r2.A04, r3.A02);
    }

    public void BR9(View view) {
    }
}
