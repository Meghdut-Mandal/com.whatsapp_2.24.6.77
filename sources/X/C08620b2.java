package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0b2  reason: invalid class name and case insensitive filesystem */
public final class C08620b2 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                str = AnonymousClass0ZA.A09(parcel, str, c, 2, readInt);
            } else {
                AnonymousClass0ZA.A0F(parcel, readInt, 4);
                parcel.readInt();
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0K3(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0K3[i];
    }
}
