package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.6aE  reason: invalid class name and case insensitive filesystem */
public final class C133936aE implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A14;
        ArrayList A142;
        Object createFromParcel;
        int i = 0;
        Object obj = null;
        if (C36411kG.A02(parcel) == 0) {
            A14 = null;
        } else {
            int readInt = parcel.readInt();
            A14 = C36441kJ.A14(readInt);
            for (int i2 = 0; i2 != readInt; i2++) {
                A14.add(C36411kG.A0H(parcel, C134736bW.class));
            }
        }
        if (parcel.readInt() == 0) {
            A142 = null;
        } else {
            int readInt2 = parcel.readInt();
            A142 = C36441kJ.A14(readInt2);
            while (i != readInt2) {
                i = C90504aG.A0A(parcel, C134606bJ.CREATOR, A142, i);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C134666bP.CREATOR.createFromParcel(parcel);
        }
        C134666bP r1 = (C134666bP) createFromParcel;
        if (parcel.readInt() != 0) {
            obj = C134546bD.CREATOR.createFromParcel(parcel);
        }
        return new C134736bW((C134546bD) obj, r1, A14, A142);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134736bW[i];
    }
}
