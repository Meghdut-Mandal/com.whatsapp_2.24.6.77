package X;

/* renamed from: X.6P5  reason: invalid class name */
public final class AnonymousClass6P5 {
    public static final AnonymousClass6P5 A02 = new AnonymousClass6P5(AnonymousClass6U3.A02(0), AnonymousClass6U3.A02(0));
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6P5) {
                long j = this.A00;
                AnonymousClass6P5 r8 = (AnonymousClass6P5) obj;
                long j2 = r8.A00;
                AnonymousClass68V[] r0 = AnonymousClass6WI.A02;
                if (!(j == j2 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        AnonymousClass68V[] r0 = AnonymousClass6WI.A02;
        return C36341k9.A02(this.A01, C90464aC.A08(j));
    }

    public AnonymousClass6P5(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TextIndent(firstLine=");
        A0u.append(AnonymousClass6WI.A02(this.A00));
        A0u.append(", restLine=");
        return AnonymousClass000.A0m(AnonymousClass6WI.A02(this.A01), A0u);
    }
}
