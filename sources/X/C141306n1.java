package X;

/* renamed from: X.6n1  reason: invalid class name and case insensitive filesystem */
public class C141306n1 implements C159107ip {
    public C114985i9 A00 = new C114985i9();
    public final AnonymousClass6QD A01;
    public final AnonymousClass6Xb A02;
    public final C109665Yl A03;

    public C160917ln B4S() {
        return new C141286my(this);
    }

    public C161017ly B4U() {
        return new AnonymousClass6n0(this);
    }

    public C141306n1(AnonymousClass6QD r4, AnonymousClass6Xb r5, C109665Yl r6) {
        this.A02 = r5;
        this.A03 = r6;
        this.A01 = r4;
        AnonymousClass5TE r1 = AnonymousClass5TE.VIDEO;
        if (r4 != null && r4.A03(r1) != null && r4.A03(r1).size() > 1) {
            throw new IllegalArgumentException("FrameRender should have media graph support for MediaComposition", new Throwable());
        }
    }
}
