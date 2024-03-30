package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6bg  reason: invalid class name and case insensitive filesystem */
public final class C134836bg implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134386ax();
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final String[] A0A;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.productinfra.avatar.data.graphql.stickers.AvatarSticker");
                C134836bg r5 = (C134836bg) obj;
                if (AnonymousClass00C.A0J(this.A07, r5.A07) && AnonymousClass00C.A0J(this.A03, r5.A03) && this.A00 == r5.A00 && AnonymousClass00C.A0J(this.A05, r5.A05) && this.A01 == r5.A01 && this.A02 == r5.A02 && AnonymousClass00C.A0J(this.A04, r5.A04) && AnonymousClass00C.A0J(this.A06, r5.A06) && this.A08 == r5.A08 && this.A09 == r5.A09) {
                    String[] strArr = this.A0A;
                    String[] strArr2 = r5.A0A;
                    if (strArr != null) {
                        if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                            return false;
                        }
                    } else if (strArr2 != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeStringArray(this.A0A);
    }

    public int hashCode() {
        int i;
        int A042 = C36421kH.A04(this.A07);
        String str = this.A05;
        int A002 = C53202qw.A00(C53202qw.A00(C36381kD.A08(this.A06, C36381kD.A08(this.A04, (((C36381kD.A08(str, (C36381kD.A08(this.A03, A042) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31)), this.A08), this.A09);
        String[] strArr = this.A0A;
        if (strArr != null) {
            i = Arrays.hashCode(strArr);
        } else {
            i = 0;
        }
        return A002 + i;
    }

    public C134836bg(String str, String str2, String str3, String str4, String str5, String[] strArr, int i, int i2, int i3, boolean z, boolean z2) {
        C36321k7.A0x(str, str2);
        AnonymousClass00C.A0D(str3, 4);
        C36361kB.A1J(str4, 7, str5);
        this.A07 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A05 = str3;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = str4;
        this.A06 = str5;
        this.A08 = z;
        this.A09 = z2;
        this.A0A = strArr;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AvatarSticker(url=");
        A0u.append(this.A07);
        A0u.append(", emojis=");
        A0u.append(this.A03);
        A0u.append(", fileSize=");
        A0u.append(this.A00);
        A0u.append(", mimeType=");
        A0u.append(this.A05);
        A0u.append(", height=");
        A0u.append(this.A01);
        A0u.append(", width=");
        A0u.append(this.A02);
        A0u.append(", fileHash=");
        A0u.append(this.A04);
        A0u.append(", stableId=");
        A0u.append(this.A06);
        A0u.append(", isCountrySticker=");
        A0u.append(this.A08);
        A0u.append(", isSocial=");
        A0u.append(this.A09);
        A0u.append(", socialStickerFbIds=");
        return C36321k7.A0E(Arrays.toString(this.A0A), A0u);
    }
}
