package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6aM  reason: invalid class name and case insensitive filesystem */
public final class C134016aM implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        String A0g = C36341k9.A0g(parcel2);
        double readDouble = parcel2.readDouble();
        double readDouble2 = parcel2.readDouble();
        boolean booleanValue = C111805cs.A00(parcel2).booleanValue();
        double readDouble3 = parcel2.readDouble();
        Class<C144406s8> cls = C144406s8.class;
        C144416s9 r3 = (C144416s9) C36411kG.A0H(parcel2, cls);
        double readDouble4 = parcel2.readDouble();
        return new C144406s8(r3, (AnonymousClass544) C36411kG.A0H(parcel2, cls), Double.valueOf(parcel2.readDouble()), Double.valueOf(parcel2.readDouble()), A0g, readDouble, readDouble2, readDouble3, readDouble4, parcel2.readInt(), parcel2.readInt(), booleanValue);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C144406s8[i];
    }
}
