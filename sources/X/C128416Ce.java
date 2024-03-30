package X;

/* renamed from: X.6Ce  reason: invalid class name and case insensitive filesystem */
public final class C128416Ce {
    public final int A00;
    public final int A01;
    public final C129796Im A02;
    public final AnonymousClass72W A03;
    public final Object A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128416Ce) {
                C128416Ce r5 = (C128416Ce) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || this.A00 != r5.A00 || this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36351kA.A05(this.A03, AnonymousClass000.A0H(this.A02) * 31) + this.A00) * 31) + this.A01) * 31) + C36411kG.A09(this.A04);
    }

    public C128416Ce(C129796Im r1, AnonymousClass72W r2, Object obj, int i, int i2) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = obj;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TypefaceRequest(fontFamily=");
        A0u.append(this.A02);
        A0u.append(", fontWeight=");
        A0u.append(this.A03);
        A0u.append(", fontStyle=");
        int i = this.A00;
        if (i == 0) {
            str = "Normal";
        } else if (i == 1) {
            str = "Italic";
        } else {
            str = "Invalid";
        }
        A0u.append(str);
        A0u.append(", fontSynthesis=");
        int i2 = this.A01;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "All";
        } else if (i2 == 2) {
            str2 = "Weight";
        } else if (i2 == 3) {
            str2 = "Style";
        } else {
            str2 = "Invalid";
        }
        A0u.append(str2);
        A0u.append(", resourceLoaderCacheKey=");
        return AnonymousClass000.A0m(this.A04, A0u);
    }
}
