package com.google.android.gms.maps.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.AnonymousClass0UM;
import X.AnonymousClass0Z9;
import X.C10440eF;
import X.C204729qT;
import X.C36401kF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class LatLngBounds extends C10440eF implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C204729qT();
    public final LatLng A00;
    public final LatLng A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LatLngBounds) {
                LatLngBounds latLngBounds = (LatLngBounds) obj;
                if (!this.A01.equals(latLngBounds.A01) || !this.A00.equals(latLngBounds.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public boolean A00(LatLng latLng) {
        AnonymousClass006.A02(latLng, "point must not be null.");
        double d = latLng.A00;
        LatLng latLng2 = this.A01;
        if (latLng2.A00 > d) {
            return false;
        }
        LatLng latLng3 = this.A00;
        if (d > latLng3.A00) {
            return false;
        }
        double d2 = latLng.A01;
        double d3 = latLng2.A01;
        double d4 = latLng3.A01;
        int i = (d3 > d2 ? 1 : (d3 == d2 ? 0 : -1));
        if (d3 <= d4) {
            if (i > 0) {
                return false;
            }
        } else if (i <= 0) {
            return true;
        }
        if (d2 <= d4) {
            return true;
        }
        return false;
    }

    public String toString() {
        AnonymousClass0UM r2 = new AnonymousClass0UM(this);
        r2.A00(this.A01, "southwest");
        r2.A00(this.A00, "northeast");
        return r2.toString();
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        AnonymousClass006.A02(latLng, "southwest must not be null.");
        AnonymousClass006.A02(latLng2, "northeast must not be null.");
        double d = latLng2.A00;
        double d2 = latLng.A00;
        boolean A1U = C36401kF.A1U((d > d2 ? 1 : (d == d2 ? 0 : -1)));
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = Double.valueOf(d2);
        A0M[1] = Double.valueOf(d);
        if (A1U) {
            this.A01 = latLng;
            this.A00 = latLng2;
            return;
        }
        throw AnonymousClass001.A08(String.format("southern latitude exceeds northern latitude (%s > %s)", A0M));
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A01;
        return AnonymousClass000.A0L(this.A00, A0M);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A012 = AnonymousClass0Z9.A01(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A01, 2, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A00, 3, i, false);
        AnonymousClass0Z9.A07(parcel, A012);
    }
}
