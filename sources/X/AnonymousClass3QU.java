package X;

/* renamed from: X.3QU  reason: invalid class name */
public final class AnonymousClass3QU {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    public AnonymousClass3QU(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A0A = false;
        this.A08 = false;
        this.A09 = false;
        this.A04 = false;
        this.A07 = false;
        this.A0C = false;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A03 = null;
        this.A05 = false;
        this.A0B = false;
        this.A06 = false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3QU) {
                AnonymousClass3QU r5 = (AnonymousClass3QU) obj;
                if (!(this.A0A == r5.A0A && this.A08 == r5.A08 && this.A09 == r5.A09 && this.A04 == r5.A04 && this.A07 == r5.A07 && this.A0C == r5.A0C && AnonymousClass00C.A0J(this.A01, r5.A01) && AnonymousClass00C.A0J(this.A02, r5.A02) && AnonymousClass00C.A0J(this.A00, r5.A00) && AnonymousClass00C.A0J(this.A03, r5.A03) && this.A05 == r5.A05 && this.A0B == r5.A0B && this.A06 == r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((((((C36341k9.A01(this.A0A ? 1 : 0) * 31) + C36341k9.A01(this.A08 ? 1 : 0)) * 31) + C36341k9.A01(this.A09 ? 1 : 0)) * 31) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + C36341k9.A01(this.A07 ? 1 : 0)) * 31) + C36341k9.A01(this.A0C ? 1 : 0)) * 31) + C36341k9.A09(this.A01)) * 31) + C36341k9.A09(this.A02)) * 31) + C36341k9.A09(this.A00)) * 31) + C36421kH.A05(this.A03)) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36341k9.A01(this.A0B ? 1 : 0)) * 31) + C36341k9.A01(this.A06 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StickerInfo(isInstalled=");
        A0u.append(this.A0A);
        A0u.append(", isFavorited=");
        A0u.append(this.A08);
        A0u.append(", isFromStickerMaker=");
        A0u.append(this.A09);
        A0u.append(", hasPackInStore=");
        A0u.append(this.A04);
        A0u.append(", isAvatarSticker=");
        A0u.append(this.A07);
        A0u.append(", userHasAvatar=");
        A0u.append(this.A0C);
        A0u.append(", packName=");
        A0u.append(this.A01);
        A0u.append(", packPublisher=");
        A0u.append(this.A02);
        A0u.append(", packId=");
        A0u.append(this.A00);
        A0u.append(", playStoreLink=");
        A0u.append(this.A03);
        A0u.append(", isAiSticker=");
        A0u.append(this.A05);
        A0u.append(", isRecent=");
        A0u.append(this.A0B);
        A0u.append(", isAvatarSocialSticker=");
        return C36321k7.A0H(A0u, this.A06);
    }

    public AnonymousClass3QU() {
        this((String) null, (String) null, (String) null, (String) null, false, false, false, false, false, false, false, false, false);
    }
}
