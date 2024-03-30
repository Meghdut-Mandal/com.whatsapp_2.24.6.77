package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6ao  reason: invalid class name and case insensitive filesystem */
public final class C134296ao implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        String A0g = C36341k9.A0g(parcel);
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C134816be.CREATOR.createFromParcel(parcel);
        }
        return new C134706bT((C134816be) createFromParcel, A0g, readString);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134706bT[i];
    }
}
