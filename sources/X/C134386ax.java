package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6ax  reason: invalid class name and case insensitive filesystem */
public final class C134386ax implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0g = C36341k9.A0g(parcel);
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        String readString2 = parcel.readString();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        boolean z = false;
        boolean A1P = AnonymousClass000.A1P(parcel.readInt());
        if (parcel.readInt() != 0) {
            z = true;
        }
        return new C134836bg(A0g, readString, readString2, readString3, readString4, parcel.createStringArray(), readInt, readInt2, readInt3, A1P, z);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134836bg[i];
    }
}
