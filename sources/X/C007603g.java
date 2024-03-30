package X;

/* renamed from: X.03g  reason: invalid class name and case insensitive filesystem */
public class C007603g extends C007503f implements C007403e {
    public final boolean A00 = A00();

    public C007603g(C007403e r2) {
        super(true);
        A0n(r2);
    }

    public boolean A0r() {
        return true;
    }

    public void A0x(Throwable th) {
        A0u(new AnonymousClass0AT(th));
    }

    private final boolean A00() {
        C008503q r3;
        C008103m A0f = A0f();
        if (A0f instanceof C008703s) {
            r3 = (C008503q) A0f;
        } else {
            r3 = null;
        }
        while (r3 != null) {
            C007503f A06 = r3.A06();
            if (!A06.A0q()) {
                C008103m A0f2 = A06.A0f();
                if (!(A0f2 instanceof C008703s)) {
                    break;
                }
                r3 = (C008503q) A0f2;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean A0q() {
        return this.A00;
    }
}
