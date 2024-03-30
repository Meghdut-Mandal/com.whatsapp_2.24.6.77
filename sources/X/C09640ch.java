package X;

import android.animation.Animator;
import android.util.Log;

/* renamed from: X.0ch  reason: invalid class name and case insensitive filesystem */
public class C09640ch implements C02690Bm {
    public final /* synthetic */ Animator A00;
    public final /* synthetic */ AnonymousClass0BV A01;
    public final /* synthetic */ AnonymousClass0Bl A02;

    public C09640ch(Animator animator, AnonymousClass0BV r2, AnonymousClass0Bl r3) {
        this.A01 = r2;
        this.A00 = animator;
        this.A02 = r3;
    }

    public void BT0() {
        this.A00.end();
        if (AnonymousClass01z.A0E(2)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Animator from operation ");
            A0u.append(this.A02);
            Log.v("FragmentManager", AnonymousClass000.A0q(" has been canceled.", A0u));
        }
    }
}
