package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.6aH  reason: invalid class name and case insensitive filesystem */
public final class C133966aH implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0g = C36341k9.A0g(parcel);
        int readInt = parcel.readInt();
        ArrayList A14 = C36441kJ.A14(readInt);
        int i = 0;
        while (i != readInt) {
            i = C90504aG.A0A(parcel, C102234zX.CREATOR, A14, i);
        }
        return new C102214zV(A0g, A14);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C102214zV[i];
    }
}
