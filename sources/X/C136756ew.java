package X;

/* renamed from: X.6ew  reason: invalid class name and case insensitive filesystem */
public final class C136756ew implements C156907b9 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public boolean equals(Object obj) {
        if (!(obj instanceof C136756ew)) {
            return false;
        }
        C136756ew r4 = (C136756ew) obj;
        if (!AnonymousClass000.A1Q(Float.compare(this.A02, r4.A02)) || !AnonymousClass000.A1Q(Float.compare(this.A03, r4.A03)) || !AnonymousClass000.A1Q(Float.compare(this.A01, r4.A01)) || !AnonymousClass000.A1Q(Float.compare(this.A00, r4.A00))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90514aH.A0C(C90474aD.A02(C90474aD.A02(C90514aH.A05(this.A02), this.A03), this.A01), this.A00);
    }

    public C136756ew(float f, float f2, float f3, float f4) {
        this.A02 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A00 = f4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PaddingValues(start=");
        A0u.append(AnonymousClass72X.A00(this.A02));
        A0u.append(", top=");
        A0u.append(AnonymousClass72X.A00(this.A03));
        A0u.append(", end=");
        A0u.append(AnonymousClass72X.A00(this.A01));
        A0u.append(", bottom=");
        return AnonymousClass000.A0m(AnonymousClass72X.A00(this.A00), A0u);
    }
}
