package X;

/* renamed from: X.6EB  reason: invalid class name */
public final class AnonymousClass6EB {
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;

    public AnonymousClass6EB(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass00C.A0D(str, 1);
        this.A0B = str;
        this.A01 = str2;
        this.A07 = j;
        this.A0E = str3;
        this.A0A = str4;
        this.A08 = str5;
        this.A0D = str6;
        this.A0C = str7;
        this.A04 = i;
        this.A06 = i2;
        this.A05 = i3;
        this.A09 = str8;
        this.A0G = z;
        this.A02 = z2;
        this.A00 = str9;
        this.A0F = z3;
        this.A03 = z4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6EB) {
                AnonymousClass6EB r8 = (AnonymousClass6EB) obj;
                if (!AnonymousClass00C.A0J(this.A0B, r8.A0B) || !AnonymousClass00C.A0J(this.A01, r8.A01) || this.A07 != r8.A07 || !AnonymousClass00C.A0J(this.A0E, r8.A0E) || !AnonymousClass00C.A0J(this.A0A, r8.A0A) || !AnonymousClass00C.A0J(this.A08, r8.A08) || !AnonymousClass00C.A0J(this.A0D, r8.A0D) || !AnonymousClass00C.A0J(this.A0C, r8.A0C) || this.A04 != r8.A04 || this.A06 != r8.A06 || this.A05 != r8.A05 || !AnonymousClass00C.A0J(this.A09, r8.A09) || this.A0G != r8.A0G || this.A02 != r8.A02 || !AnonymousClass00C.A0J(this.A00, r8.A00) || this.A0F != r8.A0F || this.A03 != r8.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C53202qw.A00((C53202qw.A00(C53202qw.A00((((((((((((((((((C36321k7.A00(this.A07, (C36421kH.A04(this.A0B) + C36341k9.A09(this.A01)) * 31) + C36341k9.A09(this.A0E)) * 31) + C36341k9.A09(this.A0A)) * 31) + C36341k9.A09(this.A08)) * 31) + C36341k9.A09(this.A0D)) * 31) + C36341k9.A09(this.A0C)) * 31) + this.A04) * 31) + this.A06) * 31) + this.A05) * 31) + C36341k9.A09(this.A09)) * 31, this.A0G), this.A02) + C36421kH.A05(this.A00)) * 31, this.A0F) + C36341k9.A01(this.A03 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StarredStickerData(fileHash=");
        A0u.append(this.A0B);
        A0u.append(", imageHash=");
        A0u.append(this.A01);
        A0u.append(", timestamp=");
        A0u.append(this.A07);
        A0u.append(", url=");
        A0u.append(this.A0E);
        A0u.append(", encHash=");
        A0u.append(this.A0A);
        A0u.append(", directPath=");
        A0u.append(this.A08);
        A0u.append(", mimeType=");
        A0u.append(this.A0D);
        A0u.append(", mediaKey=");
        A0u.append(this.A0C);
        A0u.append(", fileSize=");
        A0u.append(this.A04);
        A0u.append(", width=");
        A0u.append(this.A06);
        A0u.append(", height=");
        A0u.append(this.A05);
        A0u.append(", emojis=");
        A0u.append(this.A09);
        A0u.append(", isFirstParty=");
        A0u.append(this.A0G);
        A0u.append(", isAvatarSticker=");
        A0u.append(this.A02);
        A0u.append(", avatarStableId=");
        A0u.append(this.A00);
        A0u.append(", isAISticker=");
        A0u.append(this.A0F);
        A0u.append(", isLottie=");
        return C36321k7.A0H(A0u, this.A03);
    }
}
