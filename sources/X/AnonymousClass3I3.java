package X;

/* renamed from: X.3I3  reason: invalid class name */
public final class AnonymousClass3I3 {
    public String A00;
    public String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3I3 r5 = (AnonymousClass3I3) obj;
            if (!this.A01.equals(r5.A01) || !this.A00.equals(r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass3I3(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A01;
        return AnonymousClass000.A0L(this.A00, A0M);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BootstrapId{sessionId=");
        A0u.append(this.A01);
        A0u.append(", mdRegAttemptId=");
        A0u.append(this.A00);
        return AnonymousClass000.A0s(A0u);
    }
}
