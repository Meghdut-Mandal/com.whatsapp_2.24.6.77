package X;

import java.util.Set;

/* renamed from: X.65F  reason: invalid class name */
public class AnonymousClass65F {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final Set A09;
    public final Set A0A;
    public final Set A0B;
    public final boolean A0C;

    public AnonymousClass65F(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Set set, Set set2, Set set3, boolean z) {
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A00 = str5;
        this.A01 = str6;
        this.A02 = str7;
        this.A03 = str8;
        this.A0B = set;
        this.A09 = set2;
        this.A0A = set3;
        String str10 = "fallback";
        this.A08 = !str10.equals(str9) ? "primary" : str10;
        this.A0C = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RouteHost{hostname='");
        A0u.append(this.A04);
        A0u.append('\'');
        A0u.append(", upload=");
        Object obj = this.A0B;
        Object obj2 = "all";
        if (obj == null) {
            obj = obj2;
        }
        A0u.append(obj);
        A0u.append(", download=");
        Object obj3 = this.A09;
        if (obj3 != null) {
            obj2 = obj3;
        }
        A0u.append(obj2);
        A0u.append(", downloadBuckets=");
        Object obj4 = this.A0A;
        if (obj4 == null) {
            obj4 = "null";
        }
        A0u.append(obj4);
        A0u.append(", type=");
        A0u.append(this.A08);
        A0u.append(", forceIp=");
        A0u.append(this.A0C);
        A0u.append(", targetRegion=");
        A0u.append((String) null);
        A0u.append(", targetTask=");
        A0u.append((String) null);
        return AnonymousClass000.A0s(A0u);
    }
}
