package X;

/* renamed from: X.6DM  reason: invalid class name */
public final class AnonymousClass6DM {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public AnonymousClass6DM(Long l, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass00C.A0D(str3, 3);
        this.A05 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A01 = str5;
        this.A00 = l;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DM) {
                AnonymousClass6DM r5 = (AnonymousClass6DM) obj;
                if (!AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36381kD.A08(this.A03, C36381kD.A08(this.A02, C36421kH.A04(this.A05))) + C36341k9.A09(this.A04)) * 31) + C36341k9.A09(this.A01)) * 31) + C36411kG.A09(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CrosspostRequestPayload(uniqueId=");
        A0u.append(this.A05);
        A0u.append(", mediaEverstoreDirectPath=");
        A0u.append(this.A02);
        A0u.append(", mediaType=");
        A0u.append(this.A03);
        A0u.append(", message=");
        A0u.append(this.A04);
        A0u.append(", linkUrl=");
        A0u.append(this.A01);
        A0u.append(", dispatchTimestamp=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
