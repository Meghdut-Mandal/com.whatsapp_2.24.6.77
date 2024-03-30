package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0K5  reason: invalid class name */
public final class AnonymousClass0K5 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08610b1();
    public final int A00;
    public final String A01;

    public AnonymousClass0K5(String str, int i) {
        AnonymousClass006.A01(str);
        this.A01 = str;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, 1);
        AnonymousClass0Z9.A0C(parcel, this.A01, 2, false);
        AnonymousClass0Z9.A08(parcel, 3, this.A00);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
