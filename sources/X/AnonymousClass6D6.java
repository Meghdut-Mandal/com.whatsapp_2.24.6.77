package X;

/* renamed from: X.6D6  reason: invalid class name */
public final class AnonymousClass6D6 {
    public final C134876bk A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6D6) {
                AnonymousClass6D6 r5 = (AnonymousClass6D6) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A02, C36381kD.A08(this.A03, (((C36391kE.A0A(this.A00) + C36341k9.A09(this.A04)) * 31) + C36421kH.A05(this.A01)) * 31));
    }

    public AnonymousClass6D6(C134876bk r1, String str, String str2, String str3, String str4) {
        this.A00 = r1;
        this.A04 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A02 = str4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XFamilyCrosspostRequestPayload(enforcedEncryptedUniqueId=");
        A0u.append(this.A00);
        A0u.append(", message=");
        A0u.append(this.A04);
        A0u.append(", linkUrl=");
        A0u.append(this.A01);
        A0u.append(", mediaType=");
        A0u.append(this.A03);
        A0u.append(", mediaEverstoreDirectPath=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
