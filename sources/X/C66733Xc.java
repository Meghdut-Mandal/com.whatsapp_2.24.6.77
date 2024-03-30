package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.3Xc  reason: invalid class name and case insensitive filesystem */
public class C66733Xc implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C89864Ye(6);
    public final C206889uA A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final ArrayList A05;
    public final boolean A06;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A02;
        objArr[1] = this.A03;
        objArr[2] = Boolean.valueOf(this.A06);
        return AnonymousClass000.A0M(this.A05, objArr, 3);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C66733Xc) {
            C66733Xc r8 = (C66733Xc) obj;
            if (r8.A02.equals(this.A02) && r8.A03.equals(this.A03) && r8.A06 == this.A06) {
                ArrayList arrayList = this.A05;
                ArrayList arrayList2 = r8.A05;
                if (arrayList == null) {
                    if (arrayList2 == null) {
                        return true;
                    }
                } else if (arrayList2 != null && arrayList.size() == arrayList2.size()) {
                    int i = 0;
                    while (i < arrayList.size()) {
                        if (arrayList.get(i).equals(arrayList2.get(i))) {
                            i++;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeTypedList(this.A05);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
    }

    public C66733Xc(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A05 = parcel.createTypedArrayList(CREATOR);
        this.A06 = AnonymousClass000.A1P(parcel.readByte());
        this.A01 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = (C206889uA) C36411kG.A0H(parcel, C206889uA.class);
    }

    public C66733Xc(C206889uA r1, String str, String str2, String str3, String str4, ArrayList arrayList, boolean z) {
        this.A02 = str;
        this.A03 = str2;
        this.A05 = arrayList;
        this.A06 = z;
        this.A01 = str3;
        this.A04 = str4;
        this.A00 = r1;
    }
}
