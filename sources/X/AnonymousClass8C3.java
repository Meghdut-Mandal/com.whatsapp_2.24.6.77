package X;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: X.8C3  reason: invalid class name */
public final class AnonymousClass8C3 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204659qM();
    public final String A00;
    public final String A01;
    public final String A02;

    public AnonymousClass8C3(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0C(parcel, this.A00, 1, false);
        AnonymousClass0Z9.A0C(parcel, this.A01, 2, false);
        AnonymousClass0Z9.A0C(parcel, this.A02, 5, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
