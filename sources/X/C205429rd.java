package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9rd  reason: invalid class name and case insensitive filesystem */
public final class C205429rd implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                bundle = AnonymousClass0ZA.A04(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C98774s0(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C98774s0[i];
    }
}
