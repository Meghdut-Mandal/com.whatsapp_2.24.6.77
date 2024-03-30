package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6ac  reason: invalid class name and case insensitive filesystem */
public final class C134176ac implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Long valueOf;
        String A0g = C36341k9.A0g(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        Long l = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() != 0) {
            l = Long.valueOf(parcel.readLong());
        }
        return new C134936bq(valueOf, l, A0g, readString, readString2, readString3, readString4, readString5, readString6);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134936bq[i];
    }
}
