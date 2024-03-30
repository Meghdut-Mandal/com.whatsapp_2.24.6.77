package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* renamed from: X.4sA  reason: invalid class name and case insensitive filesystem */
public final class C98874sA extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204719qS();
    public double A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public LatLng A05;
    public List A06;
    public boolean A07;
    public boolean A08;

    public C98874sA(LatLng latLng, List list, double d, float f, float f2, int i, int i2, boolean z, boolean z2) {
        this.A05 = latLng;
        this.A00 = d;
        this.A01 = f;
        this.A03 = i;
        this.A04 = i2;
        this.A02 = f2;
        this.A07 = z;
        this.A08 = z2;
        this.A06 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = AnonymousClass0Z9.A01(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A05, 2, i, false);
        double d = this.A00;
        parcel.writeInt(524291);
        parcel.writeDouble(d);
        AnonymousClass0Z9.A06(parcel, this.A01, 4);
        AnonymousClass0Z9.A08(parcel, 5, this.A03);
        AnonymousClass0Z9.A08(parcel, 6, this.A04);
        AnonymousClass0Z9.A06(parcel, this.A02, 7);
        AnonymousClass0Z9.A0A(parcel, 8, this.A07);
        AnonymousClass0Z9.A0A(parcel, 9, this.A08);
        AnonymousClass0Z9.A0E(parcel, this.A06, 10, false);
        AnonymousClass0Z9.A07(parcel, A012);
    }

    public C98874sA() {
        this.A05 = null;
        this.A00 = 0.0d;
        this.A01 = 10.0f;
        this.A03 = -16777216;
        this.A04 = 0;
        this.A02 = 0.0f;
        this.A07 = true;
        this.A08 = false;
        this.A06 = null;
    }
}
