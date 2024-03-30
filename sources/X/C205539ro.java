package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9ro  reason: invalid class name and case insensitive filesystem */
public final class C205539ro implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C36411kG.A02(parcel);
        boolean booleanValue = C111805cs.A00(parcel).booleanValue();
        return new C206769tw(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), A02, booleanValue);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C206769tw[i];
    }
}
