package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Ba  reason: invalid class name and case insensitive filesystem */
public final class C169878Ba extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204839qe();
    public final String A00;

    public C169878Ba(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C165597tg.A11(parcel, this.A00, 2, AnonymousClass0Z9.A00(parcel));
    }
}
