package X;

/* renamed from: X.3IK  reason: invalid class name */
public final class AnonymousClass3IK {
    public final long A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IK) {
                AnonymousClass3IK r8 = (AnonymousClass3IK) obj;
                if (this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A08(this.A00) * 31) + C36341k9.A09(this.A01);
    }

    public AnonymousClass3IK(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ReferencedFileData(rowId=");
        A0u.append(this.A00);
        A0u.append(", filePath=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
