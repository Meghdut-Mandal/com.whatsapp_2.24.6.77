package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.9gD  reason: invalid class name and case insensitive filesystem */
public final class C199909gD {
    public final AnonymousClass147 A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final Map A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C199909gD) {
                C199909gD r5 = (C199909gD) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C199909gD(String str, String str2) {
        C023409w r2 = C023409w.A00;
        C000500f A0D = C000400e.A0D();
        this.A00 = null;
        this.A03 = r2;
        this.A04 = A0D;
        this.A01 = str;
        this.A02 = str2;
    }

    public int hashCode() {
        return ((C36351kA.A05(this.A04, C36351kA.A05(this.A03, AnonymousClass000.A0H(this.A00) * 31)) + C36341k9.A09(this.A01)) * 31) + C36421kH.A05(this.A02);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RemoveCommunityParticipantsResponse(from=");
        A0u.append(this.A00);
        A0u.append(", successList=");
        A0u.append(this.A03);
        A0u.append(", failTable=");
        A0u.append(this.A04);
        A0u.append(", errorCode=");
        A0u.append(this.A01);
        A0u.append(", errorText=");
        return C36321k7.A0E(this.A02, A0u);
    }

    public C199909gD(AnonymousClass147 r2, List list, Map map) {
        this.A00 = r2;
        this.A03 = list;
        this.A04 = map;
        this.A01 = null;
        this.A02 = null;
    }
}
