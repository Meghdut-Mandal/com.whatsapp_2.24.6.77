package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.6aC  reason: invalid class name and case insensitive filesystem */
public final class C133916aC implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A14;
        if (C36411kG.A02(parcel) == 0) {
            A14 = null;
        } else {
            int readInt = parcel.readInt();
            A14 = C36441kJ.A14(readInt);
            int i = 0;
            while (i != readInt) {
                i = C90504aG.A0A(parcel, C134656bO.CREATOR, A14, i);
            }
        }
        return new C134546bD(A14);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134546bD[i];
    }
}
