package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0aD  reason: invalid class name and case insensitive filesystem */
public final class C08110aD implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        Bundle bundle = null;
        C04520Ky[] r1 = null;
        AnonymousClass0KD r2 = null;
        int i = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bundle = AnonymousClass0ZA.A04(parcel, readInt);
            } else if (c == 2) {
                r1 = (C04520Ky[]) AnonymousClass0ZA.A0K(parcel, C04520Ky.CREATOR, readInt);
            } else if (c == 3) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c != 4) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                r2 = (AnonymousClass0KD) AnonymousClass0ZA.A06(parcel, AnonymousClass0KD.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04510Kx(bundle, r2, r1, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04510Kx[i];
    }
}
