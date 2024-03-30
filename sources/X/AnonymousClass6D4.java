package X;

import java.util.Map;

/* renamed from: X.6D4  reason: invalid class name */
public final class AnonymousClass6D4 {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Map A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6D4) {
                AnonymousClass6D4 r8 = (AnonymousClass6D4) obj;
                if (this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A01, r8.A01) || !AnonymousClass00C.A0J(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A04, (((((C90464aC.A08(this.A00) + C36341k9.A09(this.A03)) * 31) + C36341k9.A09(this.A02)) * 31) + C36421kH.A05(this.A01)) * 31);
    }

    public AnonymousClass6D4(String str, String str2, String str3, Map map, long j) {
        this.A00 = j;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A04 = map;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MultiDestinationCrosspostingInfo(messageRowId=");
        A0u.append(this.A00);
        A0u.append(", uniqueId=");
        A0u.append(this.A03);
        A0u.append(", mediaFilePath=");
        A0u.append(this.A02);
        A0u.append(", directUrlPath=");
        A0u.append(this.A01);
        A0u.append(", destinationStateMap=");
        return AnonymousClass000.A0m(this.A04, A0u);
    }
}
