package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9tz  reason: invalid class name and case insensitive filesystem */
public final class C206799tz implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205919sQ();
    public String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C206799tz) {
                C206799tz r5 = (C206799tz) obj;
                if (!AnonymousClass00C.A0J(this.A07, r5.A07) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A0B, r5.A0B) || !AnonymousClass00C.A0J(this.A08, r5.A08) || !AnonymousClass00C.A0J(this.A0A, r5.A0A) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A09, r5.A09) || this.A0C != r5.A0C || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A02);
        parcel.writeString(this.A09);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        int A082 = C36381kD.A08(this.A04, (C36421kH.A04(this.A07) + C36341k9.A09(this.A06)) * 31);
        int A083 = C36381kD.A08(this.A02, (((C36381kD.A08(this.A0B, A082) + C36341k9.A09(this.A08)) * 31) + C36421kH.A05(this.A0A)) * 31);
        return C90504aG.A0B(this.A00, C36381kD.A08(this.A05, C36381kD.A08(this.A03, C36381kD.A08(this.A01, (C36381kD.A08(this.A09, A083) + C36341k9.A01(this.A0C ? 1 : 0)) * 31))));
    }

    public C206799tz(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z) {
        C36321k7.A0y(str, str3);
        C36381kD.A1K(str4, 4, str7);
        AnonymousClass00C.A0D(str8, 8);
        AnonymousClass00C.A0D(str9, 10);
        C36321k7.A15(str10, str11, str12);
        this.A07 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A0B = str4;
        this.A08 = str5;
        this.A0A = str6;
        this.A02 = str7;
        this.A09 = str8;
        this.A0C = z;
        this.A01 = str9;
        this.A03 = str10;
        this.A05 = str11;
        this.A00 = str12;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IndiaUpiInternationalQrCodeMetadata(payeeName=");
        A0u.append(this.A07);
        A0u.append(", merchantCode=");
        A0u.append(this.A06);
        A0u.append(", initiationMode=");
        A0u.append(this.A04);
        A0u.append(", purposeCode=");
        A0u.append(this.A0B);
        A0u.append(", presetAmount=");
        A0u.append(this.A08);
        A0u.append(", presetMinAmount=");
        A0u.append(this.A0A);
        A0u.append(", externalPaymentSource=");
        A0u.append(this.A02);
        A0u.append(", vpa=");
        A0u.append(this.A09);
        A0u.append(", isVpaVerifiedMerchant=");
        A0u.append(this.A0C);
        A0u.append(", baseCurrency=");
        A0u.append(this.A01);
        A0u.append(", fxConversionFactor=");
        A0u.append(this.A03);
        A0u.append(", markUpFee=");
        A0u.append(this.A05);
        A0u.append(", internationalPayDetails=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
