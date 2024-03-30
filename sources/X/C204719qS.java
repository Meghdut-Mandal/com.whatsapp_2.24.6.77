package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* renamed from: X.9qS  reason: invalid class name and case insensitive filesystem */
public final class C204719qS implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        LatLng latLng = null;
        ArrayList arrayList = null;
        double d = 0.0d;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    latLng = C165607th.A0L(parcel, readInt);
                    break;
                case 3:
                    AnonymousClass0ZA.A0F(parcel, readInt, 8);
                    d = parcel.readDouble();
                    break;
                case 4:
                    f = C165577te.A00(parcel, readInt);
                    break;
                case 5:
                    i = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 6:
                    i2 = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 7:
                    f2 = C165577te.A00(parcel, readInt);
                    break;
                case 8:
                    z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 9:
                    z2 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 10:
                    arrayList = AnonymousClass0ZA.A0B(parcel, AnonymousClass8CH.CREATOR, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C98874sA(latLng, arrayList, d, f, f2, i, i2, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C98874sA[i];
    }
}
