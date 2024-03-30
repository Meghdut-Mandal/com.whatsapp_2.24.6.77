package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0am  reason: invalid class name and case insensitive filesystem */
public final class C08460am implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        AnonymousClass0KN r1 = null;
        AnonymousClass0KY r2 = null;
        AnonymousClass0KJ r3 = null;
        AnonymousClass0KZ r4 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                r1 = (AnonymousClass0KN) AnonymousClass0ZA.A06(parcel, AnonymousClass0KN.CREATOR, readInt);
            } else if (c == 2) {
                r2 = (AnonymousClass0KY) AnonymousClass0ZA.A06(parcel, AnonymousClass0KY.CREATOR, readInt);
            } else if (c == 3) {
                r3 = (AnonymousClass0KJ) AnonymousClass0ZA.A06(parcel, AnonymousClass0KJ.CREATOR, readInt);
            } else if (c != 4) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                r4 = (AnonymousClass0KZ) AnonymousClass0ZA.A06(parcel, AnonymousClass0KZ.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04340Kg(r3, r1, r2, r4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04340Kg[i];
    }
}
