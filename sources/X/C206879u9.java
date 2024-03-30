package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9u9  reason: invalid class name and case insensitive filesystem */
public final class C206879u9 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205669s1();
    public String A00;
    public boolean A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
    }

    public C206879u9(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public C206879u9() {
        this("", true);
    }
}
