package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Date;

/* renamed from: X.6aB  reason: invalid class name and case insensitive filesystem */
public final class C133906aB implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
        String readString = parcel.readString();
        if (readString != null) {
            return new C134726bV(new C132386Tk(readString), bigDecimal, (Date) parcel.readSerializable(), (Date) parcel.readSerializable());
        }
        throw C36381kD.A0k();
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134726bV[i];
    }
}
