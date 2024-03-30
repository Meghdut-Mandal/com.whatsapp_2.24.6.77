package X;

/* renamed from: X.5HN  reason: invalid class name */
public class AnonymousClass5HN extends AnonymousClass647 {
    public final C131506Pi A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass5HN r5 = (AnonymousClass5HN) obj;
            if (!this.A04.equals(r5.A04) || !this.A03.equals(r5.A03) || !this.A02.equals(r5.A02) || !this.A01.equals(r5.A01) || !this.A00.equals(r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A04;
        objArr[1] = this.A03;
        objArr[2] = this.A02;
        objArr[3] = this.A01;
        return AnonymousClass000.A0M(this.A00, objArr, 4);
    }

    public AnonymousClass5HN(C131506Pi r1, AnonymousClass5TI r2, AnonymousClass5TJ r3, String str, String str2, String str3, String str4, String str5) {
        super(r2, r3, str4);
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = str5;
        this.A00 = r1;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UserNoticeBanner{text='");
        char A002 = C90484aE.A00(this.A04, A0u);
        A0u.append(", lightUrl='");
        A0u.append(this.A03);
        A0u.append(A002);
        A0u.append(", lightIconFile='");
        A0u.append(this.A01);
        A0u.append(A002);
        A0u.append(", darkUrl='");
        A0u.append(this.A02);
        A0u.append(A002);
        A0u.append(", darkIconFile='");
        A0u.append(this.A00);
        A0u.append(A002);
        A0u.append("iconRole='");
        AnonymousClass5TI r0 = this.A02;
        String str2 = "null";
        if (r0 != null) {
            str = r0.name();
        } else {
            str = str2;
        }
        A0u.append(str);
        A0u.append(A002);
        A0u.append(", iconStyle='");
        AnonymousClass5TJ r02 = this.A03;
        if (r02 != null) {
            str2 = r02.name();
        }
        A0u.append(str2);
        A0u.append(A002);
        A0u.append(", iconDescription='");
        A0u.append(this.A04);
        A0u.append(A002);
        A0u.append(", action='");
        A0u.append(this.A01);
        A0u.append(A002);
        A0u.append(", timing=");
        return C90464aC.A0X(this.A00, A0u);
    }
}
