package X;

/* renamed from: X.6DO  reason: invalid class name */
public final class AnonymousClass6DO {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public final int A04;
    public final int A05;
    public final C160567lD A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DO) {
                AnonymousClass6DO r5 = (AnonymousClass6DO) obj;
                if (!(AnonymousClass00C.A0J(this.A06, r5.A06) && this.A05 == r5.A05 && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A02 == r5.A02 && Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90514aH.A0C(C90474aD.A02((((((((C36391kE.A0A(this.A06) + this.A05) * 31) + this.A04) * 31) + this.A03) * 31) + this.A02) * 31, this.A01), this.A00);
    }

    public AnonymousClass6DO(C160567lD r1, float f, float f2, int i, int i2, int i3, int i4) {
        this.A06 = r1;
        this.A05 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A01 = f;
        this.A00 = f2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ParagraphInfo(paragraph=");
        A0u.append(this.A06);
        A0u.append(", startIndex=");
        A0u.append(this.A05);
        A0u.append(", endIndex=");
        A0u.append(this.A04);
        A0u.append(", startLineIndex=");
        A0u.append(this.A03);
        A0u.append(", endLineIndex=");
        A0u.append(this.A02);
        A0u.append(", top=");
        A0u.append(this.A01);
        A0u.append(", bottom=");
        return C90464aC.A0g(A0u, this.A00);
    }
}
