package X;

import android.content.Context;

/* renamed from: X.5Fe  reason: invalid class name and case insensitive filesystem */
public class C105565Fe extends AIB {
    public final /* synthetic */ C1262363c A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105565Fe(Context context, C29221Vu r2, C1262363c r3, C19640wH r4) {
        super(context, r2, r4);
        this.A00 = r3;
    }

    public void A07(C203399nx r8) {
        C203399nx A0c = r8.A0c("account");
        if (A0c != null) {
            boolean equals = "1".equals(A0c.A0i("is-recoverable", (String) null));
            C1262363c r5 = this.A00;
            C36331k8.A0w(C90494aF.A0E(r5.A02), "payment_account_recoverable", equals);
            if (equals) {
                long A01 = AnonymousClass6R8.A01(A0c.A0i("suspended-ts", (String) null), 0);
                if (A01 > 0) {
                    r5.A02.A0H(A01 * 1000);
                } else {
                    r5.A02.A0B();
                }
            } else {
                r5.A02.A0H(0);
            }
        }
    }

    public void A05(C202059ky r1) {
    }

    public void A06(C202059ky r1) {
    }
}
