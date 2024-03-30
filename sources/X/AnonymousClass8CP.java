package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8CP  reason: invalid class name */
public class AnonymousClass8CP extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204999qu();
    public int A00;
    public String A01;

    public AnonymousClass8CP(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        C165597tg.A11(parcel, this.A01, 3, A002);
    }

    public AnonymousClass8CP() {
    }
}
