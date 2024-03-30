package X;

/* renamed from: X.3Ho  reason: invalid class name and case insensitive filesystem */
public final class C62793Ho {
    public final AnonymousClass141 A00;
    public final String A01;

    public C62793Ho(AnonymousClass141 r2, String str) {
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62793Ho) {
                C62793Ho r5 = (C62793Ho) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36421kH.A04(this.A01));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupChatUiState(groupName=");
        A0u.append(this.A01);
        A0u.append(", contact=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
