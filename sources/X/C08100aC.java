package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0aC  reason: invalid class name and case insensitive filesystem */
public final class C08100aC implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 2) {
                z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
            } else if (c == 3) {
                z2 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
            } else if (c == 4) {
                AnonymousClass0ZA.A0F(parcel, readInt, 4);
                i2 = parcel.readInt();
            } else if (c != 5) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                i3 = AnonymousClass0ZA.A01(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0KC(i, i2, i3, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0KC[i];
    }
}
