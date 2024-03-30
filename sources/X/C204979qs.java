package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qs  reason: invalid class name and case insensitive filesystem */
public final class C204979qs implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                AnonymousClass0ZA.A0F(parcel, readInt, 8);
                d = parcel.readDouble();
            } else if (c != 3) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                AnonymousClass0ZA.A0F(parcel, readInt, 8);
                d2 = parcel.readDouble();
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CO(d, d2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CO[i];
    }
}
