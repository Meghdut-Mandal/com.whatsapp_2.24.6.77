package X;

/* renamed from: X.6Cv  reason: invalid class name and case insensitive filesystem */
public final class C128586Cv {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128586Cv) {
                C128586Cv r5 = (C128586Cv) obj;
                if (!AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36381kD.A08(this.A03, C36381kD.A08(this.A01, C36421kH.A04(this.A04))) + C36341k9.A09(this.A02)) * 31) + C36411kG.A09(this.A00);
    }

    public C128586Cv(Long l, String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A02 = str4;
        this.A00 = l;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AddMediaUploadParams(previewImage=");
        A0u.append(this.A04);
        A0u.append(", collectionId=");
        A0u.append(this.A01);
        A0u.append(", mediaJobId=");
        A0u.append(this.A03);
        A0u.append(", fileName=");
        A0u.append(this.A02);
        A0u.append(", fileSize=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
