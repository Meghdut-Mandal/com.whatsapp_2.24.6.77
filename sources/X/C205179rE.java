package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9rE  reason: invalid class name and case insensitive filesystem */
public final class C205179rE implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                z = C165607th.A1U(parcel, c, 3, readInt, z);
            } else {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C170008Bp(i, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C170008Bp[i];
    }
}
