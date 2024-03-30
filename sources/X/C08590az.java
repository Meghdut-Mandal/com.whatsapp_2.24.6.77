package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0az  reason: invalid class name and case insensitive filesystem */
public final class C08590az implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        try {
            for (C05090Nj r1 : C05090Nj.values()) {
                if (readInt == r1.zzb) {
                    return r1;
                }
            }
            throw new AnonymousClass0O1(readInt);
        } catch (AnonymousClass0O1 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C05090Nj[i];
    }
}
