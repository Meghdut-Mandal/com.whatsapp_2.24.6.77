package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0aM  reason: invalid class name and case insensitive filesystem */
public final class C08200aM implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        Parcel parcel2 = null;
        AnonymousClass0KG r2 = null;
        int i = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 2) {
                int A02 = AnonymousClass0ZA.A02(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (A02 == 0) {
                    parcel2 = null;
                } else {
                    parcel2 = Parcel.obtain();
                    parcel2.appendFrom(parcel, dataPosition, A02);
                    parcel.setDataPosition(dataPosition + A02);
                }
            } else if (c != 3) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                r2 = (AnonymousClass0KG) AnonymousClass0ZA.A06(parcel, AnonymousClass0KG.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0LI(parcel2, r2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0LI[i];
    }
}
