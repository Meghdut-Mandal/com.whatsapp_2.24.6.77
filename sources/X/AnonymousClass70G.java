package X;

/* renamed from: X.70G  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70G implements C25711Hj {
    public final /* synthetic */ C133316Xv A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass70G(C133316Xv r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void accept(Object obj) {
        C133316Xv r4 = this.A00;
        String str = this.A01;
        AnonymousClass011 r6 = (AnonymousClass011) obj;
        AnonymousClass00C.A0D(r6, 2);
        short s = 3;
        if (AnonymousClass000.A1X(r6.first)) {
            s = 2;
        }
        r4.A0K.A05(str.hashCode(), s);
        if (AnonymousClass000.A1X(r6.first)) {
            C203639oR r1 = r4.A01;
            if (r1 == null) {
                throw C36331k8.A0d("fdsManager");
            }
            Object obj2 = r6.second;
            if (obj2 != null) {
                r1.A0E(str, (String) obj2);
                return;
            }
            throw C36381kD.A0k();
        }
    }
}
