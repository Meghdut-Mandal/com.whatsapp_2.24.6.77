package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.9qR  reason: invalid class name and case insensitive filesystem */
public final class C204709qR implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        float f = 0.0f;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                latLng = C165607th.A0L(parcel, readInt);
            } else if (c == 3) {
                f = C165577te.A00(parcel, readInt);
            } else if (c == 4) {
                AnonymousClass0ZA.A0F(parcel, readInt, 4);
                f2 = parcel.readFloat();
            } else if (c != 5) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                f3 = C165577te.A00(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new CameraPosition(latLng, f, f2, f3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CameraPosition[i];
    }
}
