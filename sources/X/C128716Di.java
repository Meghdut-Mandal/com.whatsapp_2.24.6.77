package X;

import java.util.Arrays;

/* renamed from: X.6Di  reason: invalid class name and case insensitive filesystem */
public final class C128716Di {
    public String A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String[] A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128716Di) {
                C128716Di r5 = (C128716Di) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A07, r5.A07) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A042 = (((((((((C36421kH.A04(this.A03) + C36341k9.A09(this.A02)) * 31) + C36341k9.A09(this.A00)) * 31) + C36341k9.A09(this.A04)) * 31) + C36341k9.A09(this.A05)) * 31) + C36341k9.A09(this.A06)) * 31;
        String[] strArr = this.A07;
        if (strArr != null) {
            i = Arrays.hashCode(strArr);
        }
        return ((A042 + i) * 31) + this.A01;
    }

    public C128716Di(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, int i) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = strArr;
        this.A01 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowIdLinks(flowId=");
        A0u.append(this.A03);
        A0u.append(", dataApiVersion=");
        A0u.append(this.A02);
        A0u.append(", state=");
        A0u.append(this.A00);
        A0u.append(", flowVersionIds=");
        A0u.append(this.A04);
        A0u.append(", pslCdnUrl=");
        A0u.append(this.A05);
        A0u.append(", pslSignature=");
        A0u.append(this.A06);
        A0u.append(", categories=");
        C90514aH.A1T(A0u, this.A07);
        A0u.append(", flowJsonVersion=");
        return C36321k7.A0G(A0u, this.A01);
    }
}
