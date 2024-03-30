package X;

/* renamed from: X.5EK  reason: invalid class name */
public final class AnonymousClass5EK extends AnonymousClass5EQ {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final C006302t A03;
    public final C009003v A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5EK(Integer num, String str, String str2, C006302t r5, C009003v r6) {
        super(60);
        AnonymousClass00C.A0D(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
        this.A03 = r5;
        this.A04 = r6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5EK) {
                AnonymousClass5EK r5 = (AnonymousClass5EK) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A042 = C36421kH.A04(this.A01);
        return C36401kF.A02(this.A04, C36351kA.A05(this.A03, (C36381kD.A08(this.A02, A042) + AnonymousClass000.A0H(this.A00)) * 31));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessApiCategoryListItemData(displayName=");
        A0u.append(this.A01);
        A0u.append(", imageUrl=");
        A0u.append(this.A02);
        A0u.append(", bizNumber=");
        A0u.append(this.A00);
        A0u.append(", onClick=");
        A0u.append(this.A03);
        A0u.append(", loadImage=");
        return AnonymousClass000.A0m(this.A04, A0u);
    }
}
