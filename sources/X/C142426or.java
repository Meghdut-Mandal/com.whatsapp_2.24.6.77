package X;

import com.whatsapp.calling.callrating.CallRatingFragment;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;

/* renamed from: X.6or  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C142426or implements AnonymousClass4P6 {
    public final /* synthetic */ CallRatingFragment A00;

    public /* synthetic */ C142426or(CallRatingFragment callRatingFragment) {
        this.A00 = callRatingFragment;
    }

    public final void Be7(int i, boolean z) {
        Integer A0U;
        CallRatingFragment callRatingFragment = this.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CallRatingFragment/setOnRatingBarChangeListener rating: ");
        A0u.append(i);
        C36321k7.A1X(", fromUser: ", A0u, z);
        if (z) {
            CallRatingViewModel A0L = C90524aI.A0L(callRatingFragment.A01);
            if (A0L.A04 != null) {
                C34831hi r3 = A0L.A0C;
                if (i > 0) {
                    int[] iArr = C113145f4.A00;
                    if (i <= 5) {
                        C36341k9.A18(A0L.A0A, true);
                        A0U = Integer.valueOf(iArr[i - 1]);
                        r3.A0D(A0U);
                    }
                }
                A0U = C90494aF.A0U();
                r3.A0D(A0U);
            }
        }
    }
}
