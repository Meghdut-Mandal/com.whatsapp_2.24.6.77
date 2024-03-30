package X;

import java.util.List;

/* renamed from: X.3ui  reason: invalid class name and case insensitive filesystem */
public final class C80053ui implements C87384Oo {
    public final AnonymousClass147 A00;
    public final String A01;
    public final List A02;
    public final AnonymousClass00T A03 = C36431kI.A1I(new C833749d(this));

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C80053ui) {
                C80053ui r5 = (C80053ui) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36351kA.A05(this.A00, C36421kH.A04(this.A01)));
    }

    public C80053ui(AnonymousClass147 r2, String str, List list) {
        this.A01 = str;
        this.A00 = r2;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RemoveCommunityParticipantsRequest(iqId=");
        A0u.append(this.A01);
        A0u.append(", parentGroupJid=");
        A0u.append(this.A00);
        A0u.append(", listOfUsers=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
