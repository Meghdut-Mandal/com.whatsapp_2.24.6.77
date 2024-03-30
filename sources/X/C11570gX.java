package X;

import android.util.Log;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* renamed from: X.0gX  reason: invalid class name and case insensitive filesystem */
public final class C11570gX implements Runnable {
    public final /* synthetic */ AnonymousClass0N2 A00;
    public final /* synthetic */ AnonymousClass0K9 A01;

    public C11570gX(AnonymousClass0N2 r1, AnonymousClass0K9 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass0N2 r3 = this.A00;
        AnonymousClass0K9 r1 = this.A01;
        AnonymousClass0L0 r4 = r1.A01;
        if (r4.A01 == 0) {
            C04370Kj r12 = r1.A02;
            AnonymousClass006.A01(r12);
            r4 = r12.A02;
            if (r4.A01 == 0) {
                C16830qA r42 = r3.A00;
                IAccountAccessor A002 = r12.A00();
                Set set = r3.A06;
                C10400eB r43 = (C10400eB) r42;
                if (A002 == null || set == null) {
                    Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                    r43.Bxw(new AnonymousClass0L0(4));
                    r3.A01.B5X();
                }
                r43.A00 = A002;
                r43.A01 = set;
                if (r43.A02) {
                    r43.A03.BGd(A002, set);
                }
                r3.A01.B5X();
            }
            String valueOf = String.valueOf(r4);
            Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(valueOf)), new Exception());
        }
        r3.A00.Bxw(r4);
        r3.A01.B5X();
    }
}
