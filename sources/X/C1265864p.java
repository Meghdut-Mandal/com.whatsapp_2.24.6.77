package X;

/* renamed from: X.64p  reason: invalid class name and case insensitive filesystem */
public class C1265864p {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public C1265864p(String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z) {
        this.A06 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A04 = str4;
        this.A03 = str5;
        this.A00 = i;
        this.A07 = z;
        this.A05 = str6;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SelectedRoute{authority='");
        A0u.append(this.A02);
        A0u.append("' authorityType='");
        A0u.append(this.A00);
        A0u.append("'");
        return AnonymousClass000.A0s(A0u);
    }
}
