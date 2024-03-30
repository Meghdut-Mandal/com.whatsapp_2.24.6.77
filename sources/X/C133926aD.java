package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.6aD  reason: invalid class name and case insensitive filesystem */
public final class C133926aD implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A14;
        boolean A01 = C111805cs.A01(parcel);
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            A14 = null;
        } else {
            int readInt = parcel.readInt();
            A14 = C36441kJ.A14(readInt);
            int i = 0;
            while (i != readInt) {
                i = C90504aG.A0A(parcel, C134606bJ.CREATOR, A14, i);
            }
        }
        return new C134656bO(readString, A14, A01);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134656bO[i];
    }
}
