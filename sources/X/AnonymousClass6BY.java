package X;

/* renamed from: X.6BY  reason: invalid class name */
public final class AnonymousClass6BY {
    public final int A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BY) {
                AnonymousClass6BY r5 = (AnonymousClass6BY) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static AnonymousClass6BY A00(String str, String str2, int i) {
        return new AnonymousClass6BY(str, i, str2);
    }

    public int hashCode() {
        return C90504aG.A0B(this.A02, (C36421kH.A04(this.A01) + this.A00) * 31);
    }

    public AnonymousClass6BY(String str, int i, String str2) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MLModelHash(name=");
        A0u.append(this.A01);
        A0u.append(", version=");
        A0u.append(this.A00);
        A0u.append(", sha256Hash=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
