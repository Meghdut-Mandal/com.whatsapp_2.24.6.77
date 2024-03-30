package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Zy  reason: invalid class name and case insensitive filesystem */
public final class C07960Zy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 2) {
                i2 = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c != 3) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                bundle = AnonymousClass0ZA.A04(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0K8(bundle, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0K8[i];
    }
}
