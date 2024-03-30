package X;

import java.util.Map;

/* renamed from: X.6C0  reason: invalid class name */
public final class AnonymousClass6C0 {
    public final long A00;
    public final Integer A01;
    public final String A02;
    public final Map A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6C0) {
                AnonymousClass6C0 r8 = (AnonymousClass6C0) obj;
                if (!AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A03, r8.A03) || this.A00 != r8.A00 || this.A01 != r8.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A002 = C36321k7.A00(this.A00, C36351kA.A05(this.A03, C36421kH.A04(this.A02)));
        Integer num = this.A01;
        return C90494aF.A0B(num, AnonymousClass5ZA.A00(num), A002);
    }

    public AnonymousClass6C0(Integer num, String str, Map map, long j) {
        this.A02 = str;
        this.A03 = map;
        this.A00 = j;
        this.A01 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ComponentQueryStoreRequest(appId=");
        A0u.append(this.A02);
        A0u.append(", params=");
        A0u.append(this.A03);
        A0u.append(", cacheTtlSeconds=");
        A0u.append(this.A00);
        A0u.append(", queryPurpose=");
        return C36321k7.A0E(AnonymousClass5ZA.A00(this.A01), A0u);
    }
}
