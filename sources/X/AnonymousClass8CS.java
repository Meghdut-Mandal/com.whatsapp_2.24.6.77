package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8CS  reason: invalid class name */
public class AnonymousClass8CS extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205009qv();
    public int A00;
    public String A01;
    public String A02;

    public AnonymousClass8CS(String str, String str2, int i) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0C(parcel, this.A01, 3, C10440eF.A06(parcel, this.A02));
        AnonymousClass0Z9.A08(parcel, 4, this.A00);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public AnonymousClass8CS() {
    }
}
