package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.9qZ  reason: invalid class name and case insensitive filesystem */
public final class C204789qZ implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A00 = AnonymousClass0ZA.A00(parcel2);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        byte b = -1;
        byte b2 = -1;
        int i = 0;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        while (parcel2.dataPosition() < A00) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 2:
                    b = (byte) AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 3:
                    b2 = (byte) AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 4:
                    i = AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) AnonymousClass0ZA.A06(parcel2, CameraPosition.CREATOR, readInt);
                    break;
                case 6:
                    b3 = (byte) AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 7:
                    b4 = (byte) AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 8:
                    b5 = (byte) AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 9:
                    b6 = (byte) AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 10:
                    b7 = (byte) AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 11:
                    b8 = (byte) AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 12:
                    b9 = (byte) AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 14:
                    b10 = (byte) AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 15:
                    b11 = (byte) AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 16:
                    f = AnonymousClass0ZA.A07(parcel2, readInt);
                    break;
                case 17:
                    f2 = AnonymousClass0ZA.A07(parcel2, readInt);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) AnonymousClass0ZA.A06(parcel2, LatLngBounds.CREATOR, readInt);
                    break;
                case 19:
                    b12 = (byte) AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel2, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel2, A00);
        return new GoogleMapOptions(cameraPosition, latLngBounds, f, f2, b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
