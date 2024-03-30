package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;

/* renamed from: X.9qJ  reason: invalid class name and case insensitive filesystem */
public final class C204629qJ implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        AnonymousClass8CK[] r5 = null;
        long j = 0;
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i2 = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 2) {
                i3 = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 3) {
                j = AnonymousClass0ZA.A03(parcel, readInt);
            } else if (c == 4) {
                AnonymousClass0ZA.A0F(parcel, readInt, 4);
                i = parcel.readInt();
            } else if (c != 5) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                r5 = (AnonymousClass8CK[]) AnonymousClass0ZA.A0K(parcel, AnonymousClass8CK.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new LocationAvailability(r5, i, i2, i3, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
