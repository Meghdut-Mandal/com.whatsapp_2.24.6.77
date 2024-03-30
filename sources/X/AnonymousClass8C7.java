package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8C7  reason: invalid class name */
public final class AnonymousClass8C7 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205329rT();
    public final long A00;
    public final String A01;
    public final String A02;

    public AnonymousClass8C7(long j, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0C(parcel, this.A02, 3, C10440eF.A06(parcel, this.A01));
        AnonymousClass0Z9.A09(parcel, 4, this.A00);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
