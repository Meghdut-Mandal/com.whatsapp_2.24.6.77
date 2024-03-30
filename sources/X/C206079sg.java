package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.9sg  reason: invalid class name and case insensitive filesystem */
public final class C206079sg implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A14;
        int A02 = C36411kG.A02(parcel);
        int readInt = parcel.readInt();
        ArrayList A142 = C36441kJ.A14(readInt);
        int i = 0;
        while (i != readInt) {
            i = C90504aG.A0A(parcel, C206569tc.CREATOR, A142, i);
        }
        String readString = parcel.readString();
        Object obj = null;
        if (parcel.readInt() == 0) {
            A14 = null;
        } else {
            int readInt2 = parcel.readInt();
            A14 = C36441kJ.A14(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                A14.add(C36411kG.A0H(parcel, C207089uX.class));
            }
        }
        if (parcel.readInt() != 0) {
            obj = C206499tV.CREATOR.createFromParcel(parcel);
        }
        return new C207089uX((C206499tV) obj, readString, A142, A14, A02);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C207089uX[i];
    }
}
