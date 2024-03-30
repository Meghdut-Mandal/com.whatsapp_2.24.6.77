package X;

/* renamed from: X.0mt  reason: invalid class name and case insensitive filesystem */
public final class C15220mt extends AnonymousClass0AR {
    public final C007503f A00;

    public C15220mt(C023509x r2, C007503f r3) {
        super(1, r2);
        this.A00 = r3;
    }

    public String A0H() {
        return "AwaitContinuation";
    }

    public Throwable A0I(C007403e r3) {
        Throwable A03;
        Object A0X = this.A00.A0X();
        if ((A0X instanceof C12920is) && (A03 = ((C12920is) A0X).A03()) != null) {
            return A03;
        }
        if (A0X instanceof AnonymousClass0AT) {
            return ((AnonymousClass0AT) A0X).A00;
        }
        return r3.B9P();
    }
}
