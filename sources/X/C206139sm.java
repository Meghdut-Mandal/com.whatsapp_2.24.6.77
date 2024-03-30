package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.9sm  reason: invalid class name and case insensitive filesystem */
public final class C206139sm implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0g = C36341k9.A0g(parcel);
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList A14 = C36441kJ.A14(readInt);
        int i = 0;
        while (i != readInt) {
            i = C90504aG.A0A(parcel, C206729ts.CREATOR, A14, i);
        }
        return new C206689to(A0g, readString, A14);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C206689to[i];
    }
}
