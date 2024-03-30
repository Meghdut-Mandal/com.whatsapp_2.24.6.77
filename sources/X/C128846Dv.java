package X;

import java.util.Locale;

/* renamed from: X.6Dv  reason: invalid class name and case insensitive filesystem */
public final class C128846Dv {
    public final String A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128846Dv) {
                C128846Dv r5 = (C128846Dv) obj;
                if (!AnonymousClass00C.A0J(this.A08, r5.A08) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A09, r5.A09) || !AnonymousClass00C.A0J(this.A07, r5.A07) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((C36341k9.A09(this.A08) * 31) + C36341k9.A09(this.A06)) * 31) + C36341k9.A09(this.A03)) * 31) + C36341k9.A09(this.A09)) * 31) + C36341k9.A09(this.A07)) * 31) + C36341k9.A09(this.A02)) * 31) + C36341k9.A09(this.A05)) * 31) + C36341k9.A09(this.A00)) * 31) + this.A01) * 31) + C36421kH.A05(this.A04);
    }

    public C128846Dv(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i) {
        this.A08 = str;
        this.A06 = str2;
        this.A03 = str3;
        this.A09 = str4;
        this.A07 = str5;
        this.A02 = str6;
        this.A05 = str7;
        this.A00 = str8;
        this.A01 = i;
        this.A04 = str9;
    }

    public String toString() {
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[10];
        objArr[0] = this.A08;
        objArr[1] = this.A06;
        objArr[2] = this.A03;
        objArr[3] = this.A09;
        objArr[4] = this.A07;
        objArr[5] = this.A02;
        objArr[6] = this.A05;
        objArr[7] = this.A00;
        objArr[8] = Integer.valueOf(this.A01);
        return C90494aF.A0e(locale, "ModelAsset: name=%s id=%s cacheKey=%s sourceContentHash=%s md5Hash=%s assetHandle=%s creationTime=%s url=%s fileSizeBytes=%s compressionType=%s", C90524aI.A0x(this.A04, objArr, 9, 10));
    }
}
