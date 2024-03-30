package X;

import java.util.List;

/* renamed from: X.8YN  reason: invalid class name */
public final class AnonymousClass8YN extends C26661La {
    public final C123175w4 A00;
    public final C26681Lc A01 = C26681Lc.None;
    public final C26691Ld A02 = C26691Ld.UGC_BOT;

    public String A0B() {
        return "regular_high";
    }

    public AnonymousClass8LN A0K(AnonymousClass8LN r5, Object obj) {
        String str;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        AnonymousClass8NN A0p = AnonymousClass8OR.DEFAULT_INSTANCE.A0p();
        if (str != null) {
            AnonymousClass8I5 A0O = C90474aD.A0O(A0p, C36351kA.A1b(str));
            AnonymousClass8OR r1 = (AnonymousClass8OR) A0p.A00;
            r1.bitField0_ |= 1;
            r1.definition_ = A0O;
        }
        AnonymousClass8OR r2 = (AnonymousClass8OR) A0p.A0R();
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(r5);
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r2.getClass();
        A0H.ugcBot_ = r2;
        A0H.bitField1_ |= 32;
        return r5;
    }

    public /* bridge */ /* synthetic */ Object A0L(AnonymousClass8SS r5) {
        C21674AUx aUx;
        AnonymousClass8OR r0 = r5.ugcBot_;
        AnonymousClass8OR r3 = r0;
        if (r0 == null) {
            r0 = AnonymousClass8OR.DEFAULT_INSTANCE;
        }
        boolean z = true;
        if (r0 == null || (r0.bitField0_ & 1) == 0) {
            z = false;
        }
        if (!z) {
            return null;
        }
        if ((r3 == null && (r3 = AnonymousClass8OR.DEFAULT_INSTANCE) == null) || (aUx = r3.definition_) == null) {
            return null;
        }
        return C165607th.A0w(aUx.A06());
    }

    public List A0M() {
        AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
        return C023409w.A00;
    }

    public boolean A0N(C175958bL r2) {
        AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YN(C123175w4 r2, C26011In r3, AnonymousClass1AC r4) {
        super(r3, r4);
        C36321k7.A0y(r4, r2);
        this.A00 = r2;
    }

    public boolean A0H() {
        return false;
    }

    public C26681Lc A0I() {
        return this.A01;
    }

    public C26691Ld A0J() {
        return this.A02;
    }
}
