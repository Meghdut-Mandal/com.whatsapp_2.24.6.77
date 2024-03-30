package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0ci  reason: invalid class name and case insensitive filesystem */
public class C09650ci implements C02690Bm {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C02960Co A02;
    public final /* synthetic */ AnonymousClass0BV A03;
    public final /* synthetic */ AnonymousClass0Bl A04;

    public C09650ci(View view, ViewGroup viewGroup, C02960Co r3, AnonymousClass0BV r4, AnonymousClass0Bl r5) {
        this.A03 = r4;
        this.A00 = view;
        this.A01 = viewGroup;
        this.A02 = r3;
        this.A04 = r5;
    }

    public void BT0() {
        View view = this.A00;
        view.clearAnimation();
        this.A01.endViewTransition(view);
        this.A02.A01();
        if (AnonymousClass01z.A0E(2)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Animation from operation ");
            A0u.append(this.A04);
            Log.v("FragmentManager", AnonymousClass000.A0q(" has been cancelled.", A0u));
        }
    }
}
