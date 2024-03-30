package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6bh  reason: invalid class name and case insensitive filesystem */
public final class C134846bh implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134396ay();
    public final C134836bg A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final String A0A;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134846bh) {
                C134846bh r5 = (C134846bh) obj;
                if (!AnonymousClass00C.A0J(this.A0A, r5.A0A) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A08, r5.A08) || !AnonymousClass00C.A0J(this.A07, r5.A07) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A09, r5.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A03);
        C134836bg r1 = this.A00;
        if (r1 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r1.writeToParcel(parcel, i);
        }
        Iterator A0o = C90474aD.A0o(parcel, this.A09);
        while (A0o.hasNext()) {
            ((C134836bg) A0o.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        int A082 = C36381kD.A08(this.A07, C36381kD.A08(this.A08, C36381kD.A08(this.A06, C36381kD.A08(this.A05, C36381kD.A08(this.A02, C36381kD.A08(this.A04, C36381kD.A08(this.A01, C36421kH.A04(this.A0A))))))));
        return C36401kF.A02(this.A09, (C36381kD.A08(this.A03, A082) + AnonymousClass000.A0H(this.A00)) * 31);
    }

    public C134846bh(C134836bg r2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list) {
        C36321k7.A1B(str, str2, str3, str4, str5);
        C36321k7.A13(str6, str7, str8);
        AnonymousClass00C.A0D(str9, 9);
        this.A0A = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A02 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A08 = str7;
        this.A07 = str8;
        this.A03 = str9;
        this.A00 = r2;
        this.A09 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AvatarGetStickersEntity(id=");
        A0u.append(this.A0A);
        A0u.append(", revisionId=");
        A0u.append(this.A01);
        A0u.append(", stickerPackId=");
        A0u.append(this.A04);
        A0u.append(", stickerPackDescription=");
        A0u.append(this.A02);
        A0u.append(", stickerPackName=");
        A0u.append(this.A05);
        A0u.append(", stickerPackPublisher=");
        A0u.append(this.A06);
        A0u.append(", stickerPackTrayIconTemplateId=");
        A0u.append(this.A08);
        A0u.append(", stickerPackRecentsEmptyIconTemplateId=");
        A0u.append(this.A07);
        A0u.append(", stickerPackFavoritesEmptyIconTemplateId=");
        A0u.append(this.A03);
        A0u.append(", avatarStickerPackDynamicIcon=");
        A0u.append(this.A00);
        A0u.append(", stickers=");
        return AnonymousClass000.A0m(this.A09, A0u);
    }
}
