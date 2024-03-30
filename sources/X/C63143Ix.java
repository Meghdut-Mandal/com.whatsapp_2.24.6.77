package X;

import java.util.Map;

/* renamed from: X.3Ix  reason: invalid class name and case insensitive filesystem */
public final class C63143Ix {
    public final int A00;
    public final C20760y7 A01;
    public final Map A02;

    public C63143Ix(C20760y7 r2, Map map, int i) {
        AnonymousClass00C.A0D(map, 2);
        this.A00 = i;
        this.A02 = map;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63143Ix) {
                C63143Ix r5 = (C63143Ix) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A02, this.A00 * 31));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessContactSyncUpdateResult(usersModified=");
        A0u.append(this.A00);
        A0u.append(", sideListOldVnameMap=");
        A0u.append(this.A02);
        A0u.append(", userMightNeedPrivacySystemMessageUpdate=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
