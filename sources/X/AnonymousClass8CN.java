package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8CN  reason: invalid class name */
public class AnonymousClass8CN extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204899qk();
    public int A00;
    public String[] A01;

    public AnonymousClass8CN(String[] strArr, int i) {
        this.A00 = i;
        this.A01 = strArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        AnonymousClass0Z9.A0H(parcel, this.A01, 3);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public AnonymousClass8CN() {
    }
}
