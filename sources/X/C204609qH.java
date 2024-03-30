package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qH  reason: invalid class name and case insensitive filesystem */
public final class C204609qH implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
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
        return new AnonymousClass8CM(i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CM[i];
    }
}
