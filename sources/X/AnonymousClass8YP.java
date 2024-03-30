package X;

import java.util.List;

/* renamed from: X.8YP  reason: invalid class name */
public final class AnonymousClass8YP extends C26661La {
    public final C26681Lc A00 = C26681Lc.None;
    public final C19420v0 A01;
    public final C26691Ld A02 = C26691Ld.EXTERNAL_WEB_BETA;
    public final C20810yC A03;

    public String A0B() {
        return "regular";
    }

    public boolean A0N(C175958bL r4) {
        Object obj = r4.A01;
        if (!(obj instanceof Boolean)) {
            return false;
        }
        C19420v0 r0 = this.A01;
        C36331k8.A0w(C19420v0.A00(r0), "external_web_beta_is_opt_in", AnonymousClass000.A1X(obj));
        return true;
    }

    public boolean A0H() {
        return this.A03.A0E(3530);
    }

    public AnonymousClass8LN A0K(AnonymousClass8LN r5, Object obj) {
        Boolean bool;
        if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
            return null;
        }
        boolean booleanValue = bool.booleanValue();
        AnonymousClass8NN A012 = C170918Hz.A01(AnonymousClass8OB.DEFAULT_INSTANCE);
        AnonymousClass8OB r1 = (AnonymousClass8OB) A012.A00;
        r1.bitField0_ |= 1;
        r1.isOptIn_ = booleanValue;
        AnonymousClass8OB r2 = (AnonymousClass8OB) A012.A0R();
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(r5);
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r2.getClass();
        A0H.externalWebBetaAction_ = r2;
        A0H.bitField1_ |= 4;
        return r5;
    }

    public /* bridge */ /* synthetic */ Object A0L(AnonymousClass8SS r2) {
        AnonymousClass8OB r0 = r2.externalWebBetaAction_;
        if (r0 == null && (r0 = AnonymousClass8OB.DEFAULT_INSTANCE) == null) {
            return null;
        }
        return Boolean.valueOf(r0.isOptIn_);
    }

    public List A0M() {
        boolean A1U = C36371kC.A1U(C36341k9.A0E(this.A01), "external_web_beta_is_opt_in");
        if (A1U) {
            return C36371kC.A11(new AnonymousClass3I4(Boolean.valueOf(A1U), (String) null));
        }
        return C023409w.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YP(C26011In r2, C19420v0 r3, AnonymousClass1AC r4, C20810yC r5) {
        super(r2, r4);
        C36321k7.A0y(r4, r5);
        AnonymousClass00C.A0D(r3, 4);
        this.A03 = r5;
        this.A01 = r3;
    }

    public C26681Lc A0I() {
        return this.A00;
    }

    public C26691Ld A0J() {
        return this.A02;
    }
}
