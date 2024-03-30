package X;

import java.util.List;

/* renamed from: X.6DQ  reason: invalid class name */
public final class AnonymousClass6DQ {
    public int A00;
    public AnonymousClass6X2 A01;
    public Integer A02;
    public String A03;
    public List A04;
    public List A05;
    public final int A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DQ) {
                AnonymousClass6DQ r5 = (AnonymousClass6DQ) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || this.A02 != r5.A02 || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00 || this.A06 != r5.A06 || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A042 = C36421kH.A04(this.A03);
        Integer num = this.A02;
        int A0B = C90494aF.A0B(num, AnonymousClass6GL.A00(num), A042) * 31;
        return C36401kF.A02(this.A04, C36351kA.A05(this.A05, (((C36351kA.A05(this.A01, A0B) + this.A00) * 31) + this.A06) * 31));
    }

    public AnonymousClass6DQ(AnonymousClass6X2 r1, Integer num, String str, List list, List list2, int i, int i2) {
        C36321k7.A0x(str, num);
        this.A03 = str;
        this.A02 = num;
        this.A01 = r1;
        this.A00 = i;
        this.A06 = i2;
        this.A05 = list;
        this.A04 = list2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WorkInfoPojo(id=");
        A0u.append(this.A03);
        A0u.append(", state=");
        A0u.append(AnonymousClass6GL.A00(this.A02));
        A0u.append(", output=");
        A0u.append(this.A01);
        A0u.append(", runAttemptCount=");
        A0u.append(this.A00);
        A0u.append(", generation=");
        A0u.append(this.A06);
        A0u.append(", tags=");
        A0u.append(this.A05);
        A0u.append(", progress=");
        return AnonymousClass000.A0m(this.A04, A0u);
    }
}
