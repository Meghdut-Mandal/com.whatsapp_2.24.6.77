package X;

import java.util.List;

/* renamed from: X.8YQ  reason: invalid class name */
public final class AnonymousClass8YQ extends C26661La {
    public final C26681Lc A00 = C26681Lc.None;
    public final C19420v0 A01;
    public final C26691Ld A02 = C26691Ld.PRIVACY_SETTING_DISABLE_LINK_PREVIEWS;
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
        C36331k8.A0w(C19420v0.A00(r0), "privacy_linkpreview", AnonymousClass000.A1X(obj));
        return true;
    }

    public boolean A0H() {
        return this.A03.A0E(7955);
    }

    public AnonymousClass8LN A0K(AnonymousClass8LN r5, Object obj) {
        Boolean bool;
        if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
            return null;
        }
        boolean booleanValue = bool.booleanValue();
        AnonymousClass8NN A012 = C170918Hz.A01(AnonymousClass8OK.DEFAULT_INSTANCE);
        AnonymousClass8OK r1 = (AnonymousClass8OK) A012.A00;
        r1.bitField0_ |= 1;
        r1.isPreviewsDisabled_ = booleanValue;
        AnonymousClass8OK r12 = (AnonymousClass8OK) A012.A0R();
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(r5);
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0H.privacySettingDisableLinkPreviewsAction_ = r12;
        A0H.bitField1_ |= 32768;
        return r5;
    }

    public /* bridge */ /* synthetic */ Object A0L(AnonymousClass8SS r2) {
        AnonymousClass8OK r0 = r2.privacySettingDisableLinkPreviewsAction_;
        if (r0 == null && (r0 = AnonymousClass8OK.DEFAULT_INSTANCE) == null) {
            return null;
        }
        return Boolean.valueOf(r0.isPreviewsDisabled_);
    }

    public List A0M() {
        if (C36371kC.A1U(C36341k9.A0E(this.A01), "privacy_linkpreview")) {
            return C36371kC.A11(new AnonymousClass3I4(C36371kC.A0m(), (String) null));
        }
        return C023409w.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YQ(C26011In r2, C19420v0 r3, AnonymousClass1AC r4, C20810yC r5) {
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
