package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;

/* renamed from: X.9rt  reason: invalid class name and case insensitive filesystem */
public final class C205589rt implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C132386Tk r3;
        Object createFromParcel;
        String A0g = C36341k9.A0g(parcel);
        String readString = parcel.readString();
        BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
        String readString2 = parcel.readString();
        if (readString2 != null) {
            r3 = new C132386Tk(readString2);
        } else {
            r3 = null;
        }
        C134966bu r2 = (C134966bu) C36411kG.A0H(parcel, C206439tP.class);
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C134736bW.CREATOR.createFromParcel(parcel);
        }
        return new C206439tP((C134736bW) createFromParcel, r2, r3, A0g, readString, bigDecimal, readInt, readInt2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C206439tP[i];
    }
}
