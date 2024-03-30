package X;

/* renamed from: X.5BJ  reason: invalid class name */
public final class AnonymousClass5BJ extends C111005ba {
    public final int A00;
    public final int A01;
    public final String A02;

    public AnonymousClass5BJ(String str, int i, int i2) {
        AnonymousClass00C.A0D(str, 1);
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5BJ) {
                AnonymousClass5BJ r5 = (AnonymousClass5BJ) obj;
                if (!(AnonymousClass00C.A0J(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36421kH.A04(this.A02) + this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("InlineVideoInfo(videoUrl=");
        A0u.append(this.A02);
        A0u.append(", videoWidth=");
        A0u.append(this.A01);
        A0u.append(", videoHeight=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
