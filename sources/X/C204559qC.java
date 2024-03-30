package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* renamed from: X.9qC  reason: invalid class name and case insensitive filesystem */
public final class C204559qC implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A00 = AnonymousClass0ZA.A00(parcel2);
        List list = AnonymousClass8CL.A0B;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = Long.MAX_VALUE;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel2.dataPosition() < A00) {
            int readInt = parcel2.readInt();
            char c = (char) readInt;
            if (c != 1) {
                switch (c) {
                    case 5:
                        list = AnonymousClass0ZA.A0B(parcel2, C04430Kp.CREATOR, readInt);
                        break;
                    case 6:
                        str = AnonymousClass0ZA.A08(parcel2, readInt);
                        break;
                    case 7:
                        z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel2, readInt));
                        break;
                    case 8:
                        z2 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel2, readInt));
                        break;
                    case 9:
                        z3 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel2, readInt));
                        break;
                    case 10:
                        str2 = AnonymousClass0ZA.A08(parcel2, readInt);
                        break;
                    case 11:
                        z4 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel2, readInt));
                        break;
                    case 12:
                        z5 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel2, readInt));
                        break;
                    case 13:
                        str3 = AnonymousClass0ZA.A08(parcel2, readInt);
                        break;
                    case 14:
                        j = AnonymousClass0ZA.A03(parcel2, readInt);
                        break;
                    default:
                        AnonymousClass0ZA.A0D(parcel2, readInt);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) AnonymousClass0ZA.A06(parcel2, LocationRequest.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel2, A00);
        return new AnonymousClass8CL(locationRequest, str, str2, str3, list, j, z, z2, z3, z4, z5);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CL[i];
    }
}
