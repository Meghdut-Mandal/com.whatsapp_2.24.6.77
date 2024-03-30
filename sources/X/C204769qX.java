package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qX  reason: invalid class name and case insensitive filesystem */
public final class C204769qX implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        Float f = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c != 3) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                f = AnonymousClass0ZA.A07(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CH(f, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CH[i];
    }
}
