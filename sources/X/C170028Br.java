package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Br  reason: invalid class name and case insensitive filesystem */
public final class C170028Br extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205209rH();
    public final int A00;
    public final String A01;

    public C170028Br(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        C165597tg.A11(parcel, this.A01, 3, A002);
    }
}
