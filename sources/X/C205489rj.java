package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.9rj  reason: invalid class name and case insensitive filesystem */
public final class C205489rj implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C36411kG.A02(parcel);
        ArrayList A14 = C36441kJ.A14(A02);
        for (int i = 0; i != A02; i++) {
            A14.add(C36411kG.A0H(parcel, AnonymousClass8UO.class));
        }
        return new AnonymousClass8UO(C52522pZ.valueOf(parcel.readString()), A14, parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8UO[i];
    }
}
