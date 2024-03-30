package X;

/* renamed from: X.3JP  reason: invalid class name */
public final class AnonymousClass3JP {
    public final int A00;
    public final int A01;
    public final Integer A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JP) {
                AnonymousClass3JP r5 = (AnonymousClass3JP) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && AnonymousClass00C.A0J(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + AnonymousClass000.A0H(this.A02);
    }

    public AnonymousClass3JP(Integer num, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaQualityData(customTitleId=");
        A0u.append(this.A01);
        A0u.append(", customSubTitleId=");
        A0u.append(this.A00);
        A0u.append(", positiveButtonId=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
