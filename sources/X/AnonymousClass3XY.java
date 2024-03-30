package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.3XY  reason: invalid class name */
public final class AnonymousClass3XY implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass3X1();
    public int A00;
    public UserJid A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public BigDecimal A0A;
    public BigDecimal A0B;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3XY) {
                AnonymousClass3XY r5 = (AnonymousClass3XY) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A09, r5.A09) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A0A, r5.A0A) || !AnonymousClass00C.A0J(this.A0B, r5.A0B) || !AnonymousClass00C.A0J(this.A08, r5.A08) || !AnonymousClass00C.A0J(this.A07, r5.A07) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A09);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeSerializable(this.A0A);
        parcel.writeSerializable(this.A0B);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
    }

    public int hashCode() {
        return ((((((((((((((((C36381kD.A08(this.A09, C36381kD.A08(this.A06, AnonymousClass000.A0H(this.A01) * 31)) + C36341k9.A09(this.A04)) * 31) + C36341k9.A09(this.A03)) * 31) + AnonymousClass000.A0H(this.A0A)) * 31) + AnonymousClass000.A0H(this.A0B)) * 31) + C36341k9.A09(this.A08)) * 31) + C36341k9.A09(this.A07)) * 31) + this.A00) * 31) + C36341k9.A09(this.A02)) * 31) + C36421kH.A05(this.A05);
    }

    public AnonymousClass3XY(UserJid userJid, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i) {
        C36321k7.A0z(str, str2);
        this.A01 = userJid;
        this.A06 = str;
        this.A09 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A0A = bigDecimal;
        this.A0B = bigDecimal2;
        this.A08 = str5;
        this.A07 = str6;
        this.A00 = i;
        this.A02 = str7;
        this.A05 = str8;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SingleProductInfo(businessOwnerJid=");
        A0u.append(this.A01);
        A0u.append(", productId=");
        A0u.append(this.A06);
        A0u.append(", title=");
        A0u.append(this.A09);
        A0u.append(", description=");
        A0u.append(this.A04);
        A0u.append(", currencyCode=");
        A0u.append(this.A03);
        A0u.append(", priceAmount=");
        A0u.append(this.A0A);
        A0u.append(", salePriceAmount=");
        A0u.append(this.A0B);
        A0u.append(", retailerId=");
        A0u.append(this.A08);
        A0u.append(", productUrl=");
        A0u.append(this.A07);
        A0u.append(", productImageCount=");
        A0u.append(this.A00);
        A0u.append(", body=");
        A0u.append(this.A02);
        A0u.append(", footer=");
        return C36321k7.A0E(this.A05, A0u);
    }
}
