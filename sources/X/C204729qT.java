package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.9qT  reason: invalid class name and case insensitive filesystem */
public final class C204729qT implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                latLng = C165607th.A0L(parcel, readInt);
            } else if (c != 3) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                latLng2 = C165607th.A0L(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new LatLngBounds(latLng, latLng2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
