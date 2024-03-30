package X;

/* renamed from: X.62K  reason: invalid class name */
public final class AnonymousClass62K {
    public final /* synthetic */ AnonymousClass6EF A00;
    public final /* synthetic */ String A01;

    public AnonymousClass62K(AnonymousClass6EF r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public void A00(int i, Integer num) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XFamilyCrosspostRequestSessionManager/Crosspost failed for session: ");
        String str = this.A01;
        A0u.append(str);
        A0u.append(" with error: ");
        A0u.append(i);
        AnonymousClass00C.A0D(AnonymousClass000.A0l(num, " and errorSubCode: ", A0u), 0);
        this.A00.A02(num, str, i, false);
    }
}
