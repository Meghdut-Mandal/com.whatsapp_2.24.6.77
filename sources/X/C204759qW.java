package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.9qW  reason: invalid class name and case insensitive filesystem */
public final class C204759qW implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A00 = AnonymousClass0ZA.A00(parcel2);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        while (parcel2.dataPosition() < A00) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 2:
                    latLng = C165607th.A0L(parcel2, readInt);
                    break;
                case 3:
                    str = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 4:
                    str2 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 5:
                    iBinder = AnonymousClass0ZA.A05(parcel2, readInt);
                    break;
                case 6:
                    f = C165577te.A00(parcel2, readInt);
                    break;
                case 7:
                    f2 = C165577te.A00(parcel2, readInt);
                    break;
                case 8:
                    z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel2, readInt));
                    break;
                case 9:
                    z2 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel2, readInt));
                    break;
                case 10:
                    z3 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel2, readInt));
                    break;
                case 11:
                    f3 = C165577te.A00(parcel2, readInt);
                    break;
                case 12:
                    f4 = C165577te.A00(parcel2, readInt);
                    break;
                case 13:
                    f5 = C165577te.A00(parcel2, readInt);
                    break;
                case 14:
                    f6 = C165577te.A00(parcel2, readInt);
                    break;
                case 15:
                    f7 = C165577te.A00(parcel2, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel2, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel2, A00);
        return new C98884sB(iBinder, latLng, str, str2, f, f2, f3, f4, f5, f6, f7, z, z2, z3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C98884sB[i];
    }
}
