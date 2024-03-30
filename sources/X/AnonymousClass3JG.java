package X;

/* renamed from: X.3JG  reason: invalid class name */
public final class AnonymousClass3JG {
    public final long A00;
    public final long A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JG) {
                AnonymousClass3JG r8 = (AnonymousClass3JG) obj;
                if (!(this.A01 == r8.A01 && AnonymousClass00C.A0J(this.A02, r8.A02) && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, ((AnonymousClass000.A08(this.A01) * 31) + C36341k9.A09(this.A02)) * 31);
    }

    public AnonymousClass3JG(long j, String str, long j2) {
        this.A01 = j;
        this.A02 = str;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PictureProcessingHelper(pictureId=");
        A0u.append(this.A01);
        A0u.append(", pictureDirectPath=");
        A0u.append(this.A02);
        A0u.append(", photoIdForWaContact=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
