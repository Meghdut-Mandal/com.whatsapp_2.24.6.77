package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.67s  reason: invalid class name and case insensitive filesystem */
public class C1272967s {
    public final String A00;
    public final String A01;
    public final Integer A02;
    public final String A03;
    public final List A04;
    public final Map A05;
    public final C108485Tr A06;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1272967s)) {
            return false;
        }
        C1272967s r4 = (C1272967s) obj;
        if (this.A01.equals(r4.A01) && this.A00.equals(r4.A00) && this.A03.equals(r4.A03) && this.A06.equals(r4.A06) && this.A02.equals(r4.A02) && this.A05.equals(r4.A05)) {
            List list = this.A04;
            List list2 = r4.A04;
            if (list == null) {
                if (list2 == null) {
                    return true;
                }
            } else if (list.equals(list2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A01;
        objArr[1] = this.A00;
        objArr[2] = this.A03;
        objArr[3] = this.A06;
        objArr[4] = this.A05;
        return AnonymousClass000.A0M(this.A04, objArr, 5);
    }

    public C1272967s(Integer num, String str, String str2, String str3, List list, Map map, C108485Tr r7) {
        this.A01 = str;
        this.A00 = str2;
        this.A03 = str3;
        this.A06 = r7;
        this.A02 = num;
        this.A05 = map;
        this.A04 = list;
    }
}
