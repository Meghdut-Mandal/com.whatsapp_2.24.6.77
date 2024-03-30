package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.6ay  reason: invalid class name and case insensitive filesystem */
public final class C134396ay implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        String A0g = C36341k9.A0g(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C134836bg.CREATOR.createFromParcel(parcel);
        }
        C134836bg r3 = (C134836bg) createFromParcel;
        int readInt = parcel.readInt();
        ArrayList A14 = C36441kJ.A14(readInt);
        int i = 0;
        while (i != readInt) {
            i = C90504aG.A0A(parcel, C134836bg.CREATOR, A14, i);
        }
        return new C134846bh(r3, A0g, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, A14);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134846bh[i];
    }
}
