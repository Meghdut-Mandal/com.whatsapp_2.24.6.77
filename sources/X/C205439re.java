package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.9re  reason: invalid class name and case insensitive filesystem */
public final class C205439re implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0g = C36341k9.A0g(parcel);
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList A14 = C36441kJ.A14(readInt);
        boolean z = false;
        int i = 0;
        while (i != readInt) {
            i = C90504aG.A0A(parcel, C206539tZ.CREATOR, A14, i);
        }
        if (parcel.readInt() != 0) {
            z = true;
        }
        return new C206699tp(A0g, readString, z, A14);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C206699tp[i];
    }
}
