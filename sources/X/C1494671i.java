package X;

/* renamed from: X.71i  reason: invalid class name and case insensitive filesystem */
public final class C1494671i implements C160237kg {
    public final /* synthetic */ AnonymousClass6EF A00;
    public final /* synthetic */ AnonymousClass6V7 A01;
    public final /* synthetic */ String A02;

    public C1494671i(AnonymousClass6EF r1, AnonymousClass6V7 r2, String str) {
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BVK() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XFamilyCrosspostRequestSessionManager/eligibility retry delivery failure for session: ");
        String str = this.A02;
        C90464aC.A1R(A0u, str);
        this.A00.A01((Integer) null, (Integer) null, str, true);
    }

    public void BWZ(int i, Integer num) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XFamilyCrosspostRequestSessionManager/eligibility retry error for session: ");
        String str = this.A02;
        A0u.append(str);
        A0u.append(" with errorCode: ");
        A0u.append(i);
        AnonymousClass00C.A0D(AnonymousClass000.A0l(num, " and errorSubCode: ", A0u), 0);
        this.A00.A02(num, str, i, true);
    }

    public void BiB(C128256Bn r3, C128746Dl r4) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XFamilyCrosspostRequestSessionManager/eligibility retry success for session: ");
        C90464aC.A1R(A0u, this.A02);
        AnonymousClass6V7.A01(this.A00, this.A01, r3, r4);
    }
}
