package X;

/* renamed from: X.6BR  reason: invalid class name */
public final class AnonymousClass6BR {
    public final double A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BR) {
                AnonymousClass6BR r7 = (AnonymousClass6BR) obj;
                if (!AnonymousClass00C.A0J(this.A01, r7.A01) || !AnonymousClass00C.A0J(this.A02, r7.A02) || Double.compare(this.A00, r7.A00) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(Double.doubleToLongBits(this.A00), C36381kD.A08(this.A02, C36421kH.A04(this.A01)));
    }

    public AnonymousClass6BR(String str, double d, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = d;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaUploadProgressParams(collectionId=");
        A0u.append(this.A01);
        A0u.append(", mediaJobId=");
        A0u.append(this.A02);
        A0u.append(", progress=");
        A0u.append(this.A00);
        return AnonymousClass000.A0t(A0u, ')');
    }
}
