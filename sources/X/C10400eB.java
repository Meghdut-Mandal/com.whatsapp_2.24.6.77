package X;

import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* renamed from: X.0eB  reason: invalid class name and case insensitive filesystem */
public final class C10400eB implements C16840qB, C16830qA {
    public IAccountAccessor A00 = null;
    public Set A01 = null;
    public boolean A02 = false;
    public final C17590rf A03;
    public final AnonymousClass0US A04;
    public final /* synthetic */ C07720Za A05;

    public C10400eB(C17590rf r2, AnonymousClass0US r3, C07720Za r4) {
        this.A05 = r4;
        this.A03 = r2;
        this.A04 = r3;
    }

    public final void Bep(AnonymousClass0L0 r3) {
        this.A05.A06.post(new C11550gV(r3, this));
    }

    public final void Bxw(AnonymousClass0L0 r7) {
        C10350e6 r5 = (C10350e6) this.A05.A09.get(this.A04);
        if (r5 != null) {
            AnonymousClass006.A00(r5.A0C.A06);
            C17590rf r4 = r5.A04;
            String A0k = AnonymousClass000.A0k(r4);
            String valueOf = String.valueOf(r7);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("onSignInFailed for ");
            A0u.append(A0k);
            r4.B5Y(AnonymousClass000.A0p(" with ", valueOf, A0u));
            r5.A0B(r7, (Exception) null);
        }
    }
}
