package X;

import android.view.View;
import com.google.android.material.navigationrail.NavigationRailView;

/* renamed from: X.0f3  reason: invalid class name */
public class AnonymousClass0f3 implements C018307u {
    public final /* synthetic */ NavigationRailView A00;

    public AnonymousClass0f3(NavigationRailView navigationRailView) {
        this.A00 = navigationRailView;
    }

    public AnonymousClass09H BRF(View view, AnonymousClass09H r6, AnonymousClass07w r7) {
        boolean A09;
        boolean A092;
        NavigationRailView navigationRailView = this.A00;
        Boolean bool = navigationRailView.A02;
        if (bool != null) {
            A09 = bool.booleanValue();
        } else {
            A09 = C011504z.A09(navigationRailView);
        }
        if (A09) {
            r7.A03 += r6.A00.A0C(7).A03;
        }
        Boolean bool2 = navigationRailView.A01;
        if (bool2 != null) {
            A092 = bool2.booleanValue();
        } else {
            A092 = C011504z.A09(navigationRailView);
        }
        if (A092) {
            r7.A00 += r6.A00.A0C(7).A00;
        }
        boolean A07 = AnonymousClass04F.A07(view);
        int A03 = r6.A03();
        int A04 = r6.A04();
        int i = r7.A02;
        if (A07) {
            A03 = A04;
        }
        int i2 = i + A03;
        r7.A02 = i2;
        AnonymousClass04F.A06(view, i2, r7.A03, r7.A01, r7.A00);
        return r6;
    }
}
