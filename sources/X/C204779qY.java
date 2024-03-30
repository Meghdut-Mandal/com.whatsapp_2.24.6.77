package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.9qY  reason: invalid class name and case insensitive filesystem */
public final class C204779qY implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        LatLngBounds latLngBounds = null;
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                latLng = C165607th.A0L(parcel, readInt);
            } else if (c == 3) {
                latLng2 = C165607th.A0L(parcel, readInt);
            } else if (c == 4) {
                latLng3 = C165607th.A0L(parcel, readInt);
            } else if (c == 5) {
                latLng4 = C165607th.A0L(parcel, readInt);
            } else if (c != 6) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                latLngBounds = (LatLngBounds) AnonymousClass0ZA.A06(parcel, LatLngBounds.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C98844s7(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C98844s7[i];
    }
}
