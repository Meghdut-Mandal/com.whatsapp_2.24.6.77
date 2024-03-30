package X;

import java.util.List;

/* renamed from: X.6B0  reason: invalid class name */
public final class AnonymousClass6B0 {
    public final int A00;
    public final String A01;
    public final List A02;

    public AnonymousClass6B0(List list, int i, String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A01 = str;
        this.A00 = i;
        this.A02 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6B0) {
                AnonymousClass6B0 r5 = (AnonymousClass6B0) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, (C36421kH.A04(this.A01) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AsyncComponentContainerTargetInfo(serverId=");
        A0u.append(this.A01);
        A0u.append(", clientId=");
        A0u.append(this.A00);
        A0u.append(", keyPath=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
