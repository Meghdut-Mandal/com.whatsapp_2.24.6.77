package X;

/* renamed from: X.9NH  reason: invalid class name */
public class AnonymousClass9NH {
    public final C202059ky A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public AnonymousClass9NH(C203399nx r5) {
        String A0i = r5.A0i("owner-name", (String) null);
        C18740tg.A06(A0i);
        this.A04 = A0i;
        String A0i2 = r5.A0i("business-name", (String) null);
        C18740tg.A06(A0i2);
        this.A02 = A0i2;
        String A0i3 = r5.A0i("verify-type", (String) null);
        C18740tg.A06(A0i3);
        this.A05 = A0i3;
        this.A01 = r5.A0i("bank-name", (String) null);
        C203399nx A0c = r5.A0c("merchant");
        C18740tg.A06(A0c);
        String A0i4 = A0c.A0i("credential-id", (String) null);
        C18740tg.A06(A0i4);
        this.A03 = A0i4;
        if (r5.A0i("error-code", (String) null) != null) {
            C202059ky A002 = C202059ky.A00();
            this.A00 = A002;
            int A003 = AnonymousClass6R8.A00(r5.A0i("error-code", (String) null), 0);
            String A0i5 = r5.A0i("error-text", (String) null);
            A002.A00 = A003;
            A002.A07 = A0i5;
        }
    }
}
