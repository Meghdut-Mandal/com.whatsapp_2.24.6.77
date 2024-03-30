package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0K3  reason: invalid class name */
public final class AnonymousClass0K3 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08620b2();
    public final String A00;

    public AnonymousClass0K3(String str) {
        AnonymousClass006.A01(str);
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, 1);
        C10440eF.A04(parcel, this.A00, A002);
    }
}
