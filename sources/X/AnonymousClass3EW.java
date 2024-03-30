package X;

/* renamed from: X.3EW  reason: invalid class name */
public final class AnonymousClass3EW {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass3EW(String str, String str2, String str3, String str4) {
        C18740tg.A06(str);
        this.A01 = str;
        this.A04 = str2;
        C18740tg.A06(str3);
        this.A00 = str3;
        C18740tg.A06(str4);
        this.A03 = str4;
        StringBuilder A0u = AnonymousClass000.A0u();
        for (int i = 0; i < str4.length(); i++) {
            A0u.appendCodePoint((str4.charAt(i) + 61926) - 65);
        }
        this.A02 = A0u.toString();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A01);
        A0u.append(" ");
        A0u.append(this.A00);
        A0u.append(" ");
        A0u.append(this.A04);
        A0u.append(" ");
        return AnonymousClass000.A0q(this.A02, A0u);
    }
}
