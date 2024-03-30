package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.0aK  reason: invalid class name and case insensitive filesystem */
public final class C08180aK implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        ArrayList arrayList = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c != 2) {
                str = AnonymousClass0ZA.A09(parcel, str, c, 3, readInt);
            } else {
                arrayList = AnonymousClass0ZA.A0B(parcel, C04490Kv.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0KG(arrayList, i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0KG[i];
    }
}
