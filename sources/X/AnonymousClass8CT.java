package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8CT  reason: invalid class name */
public class AnonymousClass8CT extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204949qp();
    public int A00;
    public String A01;
    public String A02;
    public String A03;

    public AnonymousClass8CT(int i, String str, String str2, String str3) {
        this.A00 = i;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        AnonymousClass0Z9.A0C(parcel, this.A01, 3, false);
        AnonymousClass0Z9.A0C(parcel, this.A03, 4, false);
        AnonymousClass0Z9.A0C(parcel, this.A02, 5, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public AnonymousClass8CT() {
    }
}
