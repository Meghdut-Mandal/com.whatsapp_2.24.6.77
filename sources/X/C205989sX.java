package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.9sX  reason: invalid class name and case insensitive filesystem */
public final class C205989sX implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A14;
        boolean A01 = C111805cs.A01(parcel);
        int readInt = parcel.readInt();
        if (parcel.readInt() == 0) {
            A14 = null;
        } else {
            int readInt2 = parcel.readInt();
            A14 = C36441kJ.A14(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = C90504aG.A0A(parcel, C206639tj.CREATOR, A14, i);
            }
        }
        return new C206349tD(readInt, A14, A01);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C206349tD[i];
    }
}
