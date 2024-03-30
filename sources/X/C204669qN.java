package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* renamed from: X.9qN  reason: invalid class name and case insensitive filesystem */
public final class C204669qN implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        AnonymousClass8C3 r1 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = AnonymousClass0ZA.A0B(parcel, LocationRequest.CREATOR, readInt);
            } else if (c == 2) {
                z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
            } else if (c == 3) {
                z2 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
            } else if (c != 5) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                r1 = (AnonymousClass8C3) AnonymousClass0ZA.A06(parcel, AnonymousClass8C3.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C98784s1(r1, arrayList, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C98784s1[i];
    }
}
