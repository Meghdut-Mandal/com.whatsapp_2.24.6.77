package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.9g4  reason: invalid class name and case insensitive filesystem */
public final class C199819g4 {
    public final String A00;
    public final String A01;
    public final List A02;
    public final Map A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C199819g4) {
                C199819g4 r5 = (C199819g4) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C199819g4(String str, String str2) {
        C023409w r1 = C023409w.A00;
        C000500f A0D = C000400e.A0D();
        this.A02 = r1;
        this.A03 = A0D;
        this.A00 = str;
        this.A01 = str2;
    }

    public int hashCode() {
        return ((C36351kA.A05(this.A03, C36391kE.A0A(this.A02)) + C36341k9.A09(this.A00)) * 31) + C36421kH.A05(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BatchGetGroupInfoResponse(groupInfoList=");
        A0u.append(this.A02);
        A0u.append(", failTable=");
        A0u.append(this.A03);
        A0u.append(", errorCode=");
        A0u.append(this.A00);
        A0u.append(", errorText=");
        return C36321k7.A0E(this.A01, A0u);
    }

    public C199819g4(List list, Map map) {
        this.A02 = list;
        this.A03 = map;
        this.A00 = null;
        this.A01 = null;
    }
}
