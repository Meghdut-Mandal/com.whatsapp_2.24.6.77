package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.4s7  reason: invalid class name and case insensitive filesystem */
public final class C98844s7 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204779qY();
    public final LatLng A00;
    public final LatLng A01;
    public final LatLng A02;
    public final LatLng A03;
    public final LatLngBounds A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C98844s7) {
                C98844s7 r5 = (C98844s7) obj;
                if (!this.A02.equals(r5.A02) || !this.A03.equals(r5.A03) || !this.A00.equals(r5.A00) || !this.A01.equals(r5.A01) || !this.A04.equals(r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A02;
        objArr[1] = this.A03;
        objArr[2] = this.A00;
        objArr[3] = this.A01;
        return AnonymousClass000.A0M(this.A04, objArr, 4);
    }

    public String toString() {
        AnonymousClass0UM r2 = new AnonymousClass0UM(this);
        r2.A00(this.A02, "nearLeft");
        r2.A00(this.A03, "nearRight");
        r2.A00(this.A00, "farLeft");
        r2.A00(this.A01, "farRight");
        r2.A00(this.A04, "latLngBounds");
        return r2.toString();
    }

    public C98844s7(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.A02 = latLng;
        this.A03 = latLng2;
        this.A00 = latLng3;
        this.A01 = latLng4;
        this.A04 = latLngBounds;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A012 = AnonymousClass0Z9.A01(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A02, 2, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A03, 3, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A00, 4, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A01, 5, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A04, 6, i, false);
        AnonymousClass0Z9.A07(parcel, A012);
    }
}
