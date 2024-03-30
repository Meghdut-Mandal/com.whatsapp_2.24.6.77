package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6aT  reason: invalid class name and case insensitive filesystem */
public final class C134086aT implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C144426sA((C144406s8) C144406s8.CREATOR.createFromParcel(parcel), parcel.readFloat(), parcel.readFloat(), C111805cs.A01(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C144426sA[i];
    }
}
