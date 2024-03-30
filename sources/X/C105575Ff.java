package X;

import android.content.Context;

/* renamed from: X.5Ff  reason: invalid class name and case insensitive filesystem */
public class C105575Ff extends AIB {
    public final /* synthetic */ C23075B3f A00;
    public final /* synthetic */ C130096Jr A01;
    public final /* synthetic */ C105595Fh A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105575Ff(Context context, C29221Vu r2, C105595Fh r3, C23075B3f b3f, C130096Jr r5, C19640wH r6) {
        super(context, r2, r6);
        this.A02 = r3;
        this.A00 = b3f;
        this.A01 = r5;
    }

    public static void A00(C202059ky r2, C105575Ff r3) {
        C23075B3f b3f = r3.A00;
        if (b3f != null) {
            b3f.BOb(r2, 18);
        }
        C130096Jr.A00(r2, r3.A01);
    }

    public void A07(C203399nx r5) {
        C203399nx A0c = r5.A0c("account");
        if (A0c == null) {
            A00(new C202059ky(), this);
        }
        C203399nx A0c2 = A0c.A0c("transaction");
        if (A0c2 == null) {
            A00(new C202059ky(), this);
        }
        AnonymousClass736.A00(this.A02.A06, this, A0c2, this.A01, 24);
    }

    public void A05(C202059ky r1) {
        A00(r1, this);
    }

    public void A06(C202059ky r1) {
        A00(r1, this);
    }
}
