package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* renamed from: X.9tH  reason: invalid class name and case insensitive filesystem */
public final class C206369tH implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205929sR();
    public final int A00;
    public final C195699Vp A01;
    public final C195709Vq A02;
    public final C195719Vr A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeStringList(this.A0B);
        C195719Vr r1 = this.A03;
        parcel.writeByte(r1.A01 ? (byte) 1 : 0);
        TextUtils.writeToParcel(r1.A00, parcel, i);
        parcel.writeInt(this.A00);
        C195699Vp r12 = this.A01;
        parcel.writeByte(r12.A01 ? (byte) 1 : 0);
        TextUtils.writeToParcel(r12.A00, parcel, i);
        C195709Vq r13 = this.A02;
        parcel.writeByte(r13.A01 ? (byte) 1 : 0);
        TextUtils.writeToParcel(r13.A00, parcel, i);
        parcel.writeInt(this.A0C ? 1 : 0);
    }

    public C206369tH(C195699Vp r1, C195709Vq r2, C195719Vr r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, boolean z) {
        C36321k7.A1B(str, str2, str3, str4, str5);
        C36321k7.A10(str6, str7);
        this.A0A = str;
        this.A09 = str2;
        this.A08 = str3;
        this.A07 = str4;
        this.A06 = str5;
        this.A05 = str6;
        this.A04 = str7;
        this.A0B = list;
        this.A03 = r3;
        this.A00 = i;
        this.A01 = r1;
        this.A02 = r2;
        this.A0C = z;
    }
}
