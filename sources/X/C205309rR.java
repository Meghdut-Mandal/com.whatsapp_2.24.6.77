package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9rR  reason: invalid class name and case insensitive filesystem */
public final class C205309rR implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        C170198Ci r1 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c != 3) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                r1 = (C170198Ci) AnonymousClass0ZA.A06(parcel, C170198Ci.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C170108Bz(r1, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C170108Bz[i];
    }
}
