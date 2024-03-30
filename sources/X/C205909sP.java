package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9sP  reason: invalid class name and case insensitive filesystem */
public final class C205909sP implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean A01 = C111805cs.A01(parcel);
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        return new C207049uT(readString, readString2, A01);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C207049uT[i];
    }
}
