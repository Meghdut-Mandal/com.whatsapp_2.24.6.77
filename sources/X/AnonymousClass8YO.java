package X;

import java.util.List;

/* renamed from: X.8YO  reason: invalid class name */
public final class AnonymousClass8YO extends C26661La {
    public final C27631Pa A00;
    public final C26681Lc A01 = C26681Lc.None;
    public final C26691Ld A02 = C26691Ld.PRIVACY_SETTING_RELAY_ALL_CALLS;

    public String A0B() {
        return "regular";
    }

    public boolean A0H() {
        return true;
    }

    public boolean A0N(C175958bL r4) {
        Object obj = r4.A01;
        if (!(obj instanceof Boolean)) {
            return false;
        }
        C27631Pa r0 = this.A00;
        C36331k8.A0w(C27631Pa.A00(r0).edit(), "privacy_always_relay", AnonymousClass000.A1X(obj));
        return true;
    }

    public AnonymousClass8LN A0K(AnonymousClass8LN r5, Object obj) {
        Boolean bool;
        if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
            return null;
        }
        boolean booleanValue = bool.booleanValue();
        AnonymousClass8NN A012 = C170918Hz.A01(AnonymousClass8OL.DEFAULT_INSTANCE);
        AnonymousClass8OL r1 = (AnonymousClass8OL) A012.A00;
        r1.bitField0_ |= 1;
        r1.isEnabled_ = booleanValue;
        AnonymousClass8OL r2 = (AnonymousClass8OL) A012.A0R();
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(r5);
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r2.getClass();
        A0H.privacySettingRelayAllCalls_ = r2;
        A0H.bitField1_ |= 8;
        return r5;
    }

    public /* bridge */ /* synthetic */ Object A0L(AnonymousClass8SS r2) {
        AnonymousClass8OL r0 = r2.privacySettingRelayAllCalls_;
        if (r0 == null && (r0 = AnonymousClass8OL.DEFAULT_INSTANCE) == null) {
            return null;
        }
        return Boolean.valueOf(r0.isEnabled_);
    }

    public List A0M() {
        boolean A1U = C36371kC.A1U(C27631Pa.A00(this.A00), "privacy_always_relay");
        if (A1U) {
            return C36371kC.A11(new AnonymousClass3I4(Boolean.valueOf(A1U), (String) null));
        }
        return C023409w.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YO(C27631Pa r2, C26011In r3, AnonymousClass1AC r4) {
        super(r3, r4);
        C36321k7.A0y(r4, r2);
        this.A00 = r2;
    }

    public C26681Lc A0I() {
        return this.A01;
    }

    public C26691Ld A0J() {
        return this.A02;
    }
}
