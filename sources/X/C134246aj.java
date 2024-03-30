package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.location.PlaceInfo;
import java.util.ArrayList;

/* renamed from: X.6aj  reason: invalid class name and case insensitive filesystem */
public final class C134246aj implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer valueOf;
        Parcel parcel2 = parcel;
        int A02 = C36411kG.A02(parcel2);
        double readDouble = parcel2.readDouble();
        double readDouble2 = parcel2.readDouble();
        int readInt = parcel2.readInt();
        String readString = parcel2.readString();
        int readInt2 = parcel2.readInt();
        ArrayList A14 = C36441kJ.A14(readInt2);
        for (int i = 0; i != readInt2; i = C90504aG.A0A(parcel2, PlaceInfo.CREATOR, A14, i)) {
        }
        String readString2 = parcel2.readString();
        String readString3 = parcel2.readString();
        String readString4 = parcel2.readString();
        int readInt3 = parcel2.readInt();
        if (parcel2.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel2.readInt());
        }
        String readString5 = parcel2.readString();
        boolean A1P = AnonymousClass000.A1P(parcel2.readInt());
        return new C135096c8(valueOf, readString, readString2, readString3, readString4, readString5, parcel2.readString(), A14, readDouble, readDouble2, A02, readInt, readInt3, parcel2.readLong(), A1P, AnonymousClass000.A1P(parcel2.readInt()));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C135096c8[i];
    }
}
