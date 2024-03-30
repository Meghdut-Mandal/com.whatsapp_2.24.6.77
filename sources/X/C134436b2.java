package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6b2  reason: invalid class name and case insensitive filesystem */
public final class C134436b2 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer valueOf;
        String A0g = C36341k9.A0g(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        boolean A1P = AnonymousClass000.A1P(parcel.readInt());
        boolean A1P2 = AnonymousClass000.A1P(parcel.readInt());
        boolean A1P3 = AnonymousClass000.A1P(parcel.readInt());
        boolean A1P4 = AnonymousClass000.A1P(parcel.readInt());
        String[] createStringArray = parcel.createStringArray();
        boolean A1P5 = AnonymousClass000.A1P(parcel.readInt());
        boolean A1P6 = AnonymousClass000.A1P(parcel.readInt());
        String readString7 = parcel.readString();
        int readInt3 = parcel.readInt();
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        String readString10 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new C135066c4(valueOf, A0g, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, createStringArray, readInt, readInt2, readInt3, A1P, A1P2, A1P3, A1P4, A1P5, A1P6);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C135066c4[i];
    }
}
