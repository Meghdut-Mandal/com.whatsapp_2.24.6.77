package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qg  reason: invalid class name and case insensitive filesystem */
public final class C204859qg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        AnonymousClass8C5[] r4 = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                j = AnonymousClass0ZA.A03(parcel, readInt);
            } else if (c == 3) {
                r4 = (AnonymousClass8C5[]) AnonymousClass0ZA.A0K(parcel, AnonymousClass8C5.CREATOR, readInt);
            } else if (c != 4) {
                z = C165607th.A1U(parcel, c, 5, readInt, z);
            } else {
                AnonymousClass0ZA.A0F(parcel, readInt, 4);
                i = parcel.readInt();
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CA(r4, i, j, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CA[i];
    }
}
