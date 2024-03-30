package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;

/* renamed from: X.6aF  reason: invalid class name and case insensitive filesystem */
public final class C133946aF implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C134666bP(C36341k9.A0g(parcel), (BigDecimal) parcel.readSerializable(), C111805cs.A00(parcel).booleanValue());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134666bP[i];
    }
}
