package X;

/* renamed from: X.3Om  reason: invalid class name and case insensitive filesystem */
public class C64563Om {
    public final String A00;
    public final C52502pX A01;
    public final String A02;

    public String A00() {
        String str = this.A01.value;
        String str2 = this.A02;
        if (AnonymousClass14B.A0F(str2)) {
            return str;
        }
        StringBuilder A0v = AnonymousClass000.A0v(str);
        C36421kH.A1N(A0v);
        return AnonymousClass000.A0q(str2.trim(), A0v);
    }

    public C64563Om(C63573Ko r3) {
        String str = r3.A02;
        C18740tg.A06(str);
        this.A00 = str;
        C52502pX r0 = r3.A00;
        C18740tg.A06(r0);
        this.A01 = r0;
        String str2 = "";
        str2 = r3.A05 ? AnonymousClass000.A0q(" PRIMARY KEY", AnonymousClass000.A0v(str2)) : str2;
        str2 = r3.A03 ? AnonymousClass000.A0q(" AUTOINCREMENT", AnonymousClass000.A0v(str2)) : str2;
        str2 = r3.A04 ? AnonymousClass000.A0q(" NOT NULL", AnonymousClass000.A0v(str2)) : str2;
        str2 = r3.A06 ? AnonymousClass000.A0q(" UNIQUE", AnonymousClass000.A0v(str2)) : str2;
        if (!AnonymousClass14B.A0F(r3.A01)) {
            StringBuilder A0v = AnonymousClass000.A0v(str2);
            A0v.append(" DEFAULT ");
            str2 = AnonymousClass000.A0q(r3.A01, A0v);
        }
        this.A02 = str2;
    }

    @Deprecated
    public C64563Om(C52502pX r1, String str, String str2) {
        this.A00 = str;
        this.A01 = r1;
        this.A02 = str2;
    }
}
