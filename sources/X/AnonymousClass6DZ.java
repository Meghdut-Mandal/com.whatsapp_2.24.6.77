package X;

/* renamed from: X.6DZ  reason: invalid class name */
public final class AnonymousClass6DZ {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DZ) {
                AnonymousClass6DZ r5 = (AnonymousClass6DZ) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((C36381kD.A08(this.A05, C36421kH.A04(this.A01)) + C36341k9.A09(this.A00)) * 31) + C36341k9.A09(this.A02)) * 31) + C36341k9.A09(this.A04)) * 31) + C36341k9.A09(this.A03)) * 31) + C36421kH.A05(this.A06);
    }

    public AnonymousClass6DZ(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A01 = str;
        this.A05 = str2;
        this.A00 = str3;
        this.A02 = str4;
        this.A04 = str5;
        this.A03 = str6;
        this.A06 = str7;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaUploadSuccessParams(collectionId=");
        A0u.append(this.A01);
        A0u.append(", mediaJobId=");
        A0u.append(this.A05);
        A0u.append(", cdnUrl=");
        A0u.append(this.A00);
        A0u.append(", encKey=");
        A0u.append(this.A02);
        A0u.append(", iv=");
        A0u.append(this.A04);
        A0u.append(", hmac=");
        A0u.append(this.A03);
        A0u.append(", plaintextHash=");
        return C36321k7.A0E(this.A06, A0u);
    }
}
