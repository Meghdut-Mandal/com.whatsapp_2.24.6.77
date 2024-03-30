package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8CX  reason: invalid class name */
public class AnonymousClass8CX extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204929qn();
    public AnonymousClass8CY A00;
    public String A01;
    public String A02;
    public AnonymousClass8CN[] A03;
    public AnonymousClass8CT[] A04;
    public AnonymousClass8CP[] A05;
    public String[] A06;

    public AnonymousClass8CX(AnonymousClass8CY r1, String str, String str2, AnonymousClass8CN[] r4, AnonymousClass8CT[] r5, AnonymousClass8CP[] r6, String[] strArr) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
        this.A05 = r6;
        this.A04 = r5;
        this.A06 = strArr;
        this.A03 = r4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A00, 2, i, false);
        AnonymousClass0Z9.A0C(parcel, this.A01, 3, false);
        AnonymousClass0Z9.A0C(parcel, this.A02, 4, false);
        AnonymousClass0Z9.A0G(parcel, this.A05, 5, i);
        AnonymousClass0Z9.A0G(parcel, this.A04, 6, i);
        AnonymousClass0Z9.A0H(parcel, this.A06, 7);
        AnonymousClass0Z9.A0G(parcel, this.A03, 8, i);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public AnonymousClass8CX() {
    }
}
