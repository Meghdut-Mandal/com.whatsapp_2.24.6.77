package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9rQ  reason: invalid class name and case insensitive filesystem */
public final class C205299rQ implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        boolean z = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = AnonymousClass0ZA.A08(parcel, readInt);
            } else if (c == 3) {
                str2 = AnonymousClass0ZA.A08(parcel, readInt);
            } else if (c != 4) {
                z = C165607th.A1U(parcel, c, 5, readInt, z);
            } else {
                AnonymousClass0ZA.A0F(parcel, readInt, 4);
                i = parcel.readInt();
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C98834s6(str, str2, i, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C98834s6[i];
    }
}
