package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.0aL  reason: invalid class name and case insensitive filesystem */
public final class C08190aL implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 2) {
                str = AnonymousClass0ZA.A08(parcel, readInt);
            } else if (c != 3) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                arrayList = AnonymousClass0ZA.A0B(parcel, C04500Kw.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04490Kv(arrayList, i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04490Kv[i];
    }
}
