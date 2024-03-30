package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0aQ  reason: invalid class name and case insensitive filesystem */
public final class C08240aQ implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C05100Nl.A00(parcel.readString());
        } catch (C05190Ny e) {
            throw AnonymousClass001.A0B(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C05100Nl[i];
    }
}
