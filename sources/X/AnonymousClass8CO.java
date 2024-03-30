package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8CO  reason: invalid class name */
public class AnonymousClass8CO extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204979qs();
    public double A00;
    public double A01;

    public AnonymousClass8CO(double d, double d2) {
        this.A00 = d;
        this.A01 = d2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        double d = this.A00;
        parcel.writeInt(524290);
        parcel.writeDouble(d);
        double d2 = this.A01;
        parcel.writeInt(524291);
        parcel.writeDouble(d2);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public AnonymousClass8CO() {
    }
}
