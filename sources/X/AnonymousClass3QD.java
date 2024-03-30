package X;

/* renamed from: X.3QD  reason: invalid class name */
public final class AnonymousClass3QD {
    public final C199999gO A00;
    public final AnonymousClass147 A01;
    public final Integer A02;
    public final boolean A03 = true;

    public AnonymousClass3QD(C199999gO r2, AnonymousClass147 r3, Integer num) {
        this.A01 = r3;
        this.A02 = num;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3QD) {
                AnonymousClass3QD r5 = (AnonymousClass3QD) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A03 != r5.A03 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C53202qw.A00(C36391kE.A0A(this.A01), this.A03) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupInfoDataEnvelope {\n      |  isTruncated=");
        A0u.append(this.A03);
        A0u.append(",\n      |  size=");
        A0u.append(this.A02);
        A0u.append("\n      |  groupInfo=");
        A0u.append(this.A00);
        return AnonymousClass091.A02(AnonymousClass000.A0q("\n      |}", A0u));
    }

    public AnonymousClass3QD(AnonymousClass147 r3, Integer num) {
        this.A01 = r3;
        this.A02 = num;
        this.A00 = null;
    }
}
