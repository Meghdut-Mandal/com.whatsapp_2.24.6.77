package X;

/* renamed from: X.3su  reason: invalid class name and case insensitive filesystem */
public class C78933su implements AnonymousClass4UH {
    public final C19420v0 A00;

    public /* synthetic */ void BOc(String str) {
    }

    public /* synthetic */ void BOg(AnonymousClass37W r1) {
    }

    public C78933su(C19420v0 r1) {
        this.A00 = r1;
    }

    public void BOw(String str) {
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append("/priv/last=");
        C19420v0 r3 = this.A00;
        AnonymousClass005 r5 = r3.A00;
        C36321k7.A1a(A0v, AnonymousClass3TL.A02("last", C36391kE.A0H(r5).getInt("privacy_last_seen", 0)));
        StringBuilder A0v2 = AnonymousClass000.A0v(str);
        A0v2.append("/priv/pic=");
        C36321k7.A1a(A0v2, AnonymousClass3TL.A02("profile", C36391kE.A0H(r5).getInt("privacy_profile_photo", 0)));
        StringBuilder A0v3 = AnonymousClass000.A0v(str);
        A0v3.append("/priv/status=");
        C36321k7.A1a(A0v3, AnonymousClass3TL.A02("status", C36391kE.A0H(r5).getInt("privacy_status", 0)));
        StringBuilder A0v4 = AnonymousClass000.A0v(str);
        A0v4.append("/priv/readreceipts=");
        C36331k8.A1S(A0v4, r3.A2L());
    }
}
