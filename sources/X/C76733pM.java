package X;

/* renamed from: X.3pM  reason: invalid class name and case insensitive filesystem */
public class C76733pM implements C236119d {
    public final /* synthetic */ C99424tL A00;
    public final /* synthetic */ C20510xg A01;
    public final /* synthetic */ C87944Qu A02;
    public final /* synthetic */ AnonymousClass147 A03;
    public final /* synthetic */ AnonymousClass4RS A04;

    public C76733pM(C99424tL r1, C20510xg r2, C87944Qu r3, AnonymousClass147 r4, AnonymousClass4RS r5) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
    }

    public void BVN(String str) {
        C36321k7.A0R(this.A00, "sendRevokeGroupInvites IQ was not delivered: iq=", str, AnonymousClass000.A0u());
    }

    public void BWw(C203399nx r3, String str) {
        this.A04.Bou(AnonymousClass3ME.A00(r3));
        this.A00.A04((Object) null);
    }

    public void BiM(C203399nx r5, String str) {
        C203399nx A0c = r5.A0c("membership_approval_request");
        C87944Qu r2 = this.A02;
        AnonymousClass147 r1 = this.A03;
        int i = 1;
        if (A0c == null) {
            i = 0;
        }
        r2.Bow(r1, i);
        this.A00.A04((Object) null);
    }
}
