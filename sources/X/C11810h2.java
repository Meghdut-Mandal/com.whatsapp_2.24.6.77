package X;

import android.util.Log;

/* renamed from: X.0h2  reason: invalid class name and case insensitive filesystem */
public class C11810h2 implements Runnable {
    public final /* synthetic */ C02970Cp A00;
    public final /* synthetic */ AnonymousClass0BV A01;
    public final /* synthetic */ AnonymousClass0Bl A02;

    public C11810h2(C02970Cp r1, AnonymousClass0BV r2, AnonymousClass0Bl r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void run() {
        this.A00.A01();
        if (AnonymousClass01z.A0E(2)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Transition for operation ");
            A0u.append(this.A02);
            Log.v("FragmentManager", AnonymousClass000.A0q("has completed", A0u));
        }
    }
}
