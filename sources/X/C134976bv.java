package X;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.6bv  reason: invalid class name and case insensitive filesystem */
public final class C134976bv implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C163937r0(5);
    public final double A00;
    public final double A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134976bv)) {
            return false;
        }
        C134976bv r7 = (C134976bv) obj;
        return C90504aG.A00(this.A00, r7.A00) < 0.002d && C90504aG.A00(this.A01, r7.A01) < 2.0E-4d;
    }

    public static C134976bv A00(double d, double d2) {
        return new C134976bv(d, d2);
    }

    public static C134976bv A02(LatLng latLng) {
        return new C134976bv(latLng.A00, latLng.A01);
    }

    public static LatLng A03(C134976bv r5) {
        return new LatLng(r5.A00, r5.A01);
    }

    public int hashCode() {
        return (int) (((527.0d + this.A00) * 31.0d) + this.A01);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
    }

    public C134976bv(Parcel parcel) {
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
    }

    public static C134976bv A01(Location location) {
        return new C134976bv(location.getLatitude(), location.getLongitude());
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1C(this, A0u);
        A0u.append("{latitude=");
        A0u.append(this.A00);
        A0u.append(", longitude=");
        A0u.append(this.A01);
        return AnonymousClass000.A0q("}", A0u);
    }

    public C134976bv(double d, double d2) {
        this.A00 = d;
        this.A01 = d2;
    }
}
