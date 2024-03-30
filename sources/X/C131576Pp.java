package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Pp  reason: invalid class name and case insensitive filesystem */
public final class C131576Pp {
    public String A00;
    public final long A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C131576Pp) {
                C131576Pp r8 = (C131576Pp) obj;
                if (!AnonymousClass00C.A0J(this.A0A, r8.A0A) || !AnonymousClass00C.A0J(this.A06, r8.A06) || !AnonymousClass00C.A0J(this.A03, r8.A03) || this.A01 != r8.A01 || !AnonymousClass00C.A0J(this.A00, r8.A00) || !AnonymousClass00C.A0J(this.A08, r8.A08) || !AnonymousClass00C.A0J(this.A04, r8.A04) || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A09, r8.A09) || !AnonymousClass00C.A0J(this.A07, r8.A07) || !AnonymousClass00C.A0J(this.A05, r8.A05) || !AnonymousClass00C.A0J(this.A0B, r8.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C131576Pp A01() {
        Object obj;
        AnonymousClass6OD A002 = A00("2.24.6.77");
        List list = this.A0B;
        if (list != null) {
            Iterator it = C007103b.A0c(list, new C163897qw(new AnonymousClass7Y2(this), 9)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (A00(((C131576Pp) obj).A07).A01(A002) <= 0) {
                    break;
                }
            }
            C131576Pp r1 = (C131576Pp) obj;
            if (r1 != null) {
                return r1;
            }
        }
        return this;
    }

    public int hashCode() {
        int A082 = C36381kD.A08(this.A03, C36381kD.A08(this.A06, C36421kH.A04(this.A0A)));
        return ((((((((((C36381kD.A08(this.A08, (C36321k7.A00(this.A01, A082) + C36341k9.A09(this.A00)) * 31) + C36341k9.A09(this.A04)) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36341k9.A09(this.A09)) * 31) + C36341k9.A09(this.A07)) * 31) + C36341k9.A09(this.A05)) * 31) + C36411kG.A09(this.A0B);
    }

    public C131576Pp(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, long j) {
        C36321k7.A11(str, str2, str3);
        AnonymousClass00C.A0D(str5, 6);
        this.A0A = str;
        this.A06 = str2;
        this.A03 = str3;
        this.A01 = j;
        this.A00 = str4;
        this.A08 = str5;
        this.A04 = str6;
        this.A02 = l;
        this.A09 = str7;
        this.A07 = str8;
        this.A05 = str9;
        this.A0B = list;
    }

    public static final AnonymousClass6OD A00(String str) {
        AnonymousClass6OD A002 = AnonymousClass6OD.A00(str);
        if (A002 == null) {
            return new AnonymousClass6OD(1, 0, 0, 0, 0);
        }
        return A002;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BloksLinks(url=");
        A0u.append(this.A0A);
        A0u.append(", locale=");
        A0u.append(this.A06);
        A0u.append(", appId=");
        A0u.append(this.A03);
        A0u.append(", expiresData=");
        A0u.append(this.A01);
        A0u.append(", version=");
        A0u.append(this.A00);
        A0u.append(", platform=");
        A0u.append(this.A08);
        A0u.append(", bizJid=");
        A0u.append(this.A04);
        A0u.append(", flowVersionId=");
        A0u.append(this.A02);
        A0u.append(", signature=");
        A0u.append(this.A09);
        A0u.append(", minAppVersion=");
        A0u.append(this.A07);
        A0u.append(", bloksVersionId=");
        A0u.append(this.A05);
        A0u.append(", extraVersions=");
        return AnonymousClass000.A0m(this.A0B, A0u);
    }
}
