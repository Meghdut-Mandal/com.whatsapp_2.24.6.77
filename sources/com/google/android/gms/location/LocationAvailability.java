package com.google.android.gms.location;

import X.AnonymousClass000;
import X.AnonymousClass0Z9;
import X.AnonymousClass8CK;
import X.C10440eF;
import X.C165587tf;
import X.C204629qJ;
import X.C36331k8;
import X.C90474aD;
import X.C90524aI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class LocationAvailability extends C10440eF implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C204629qJ();
    @Deprecated
    public int A00;
    @Deprecated
    public int A01;
    public long A02;
    public AnonymousClass8CK[] A03;
    public int A04;

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1J(objArr, this.A04);
        AnonymousClass000.A1K(objArr, this.A00);
        C36331k8.A1V(objArr, this.A01);
        C165587tf.A1W(objArr, this.A02);
        return AnonymousClass000.A0M(this.A03, objArr, 4);
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.A00 == locationAvailability.A00 && this.A01 == locationAvailability.A01 && this.A02 == locationAvailability.A02 && this.A04 == locationAvailability.A04 && Arrays.equals(this.A03, locationAvailability.A03)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        boolean A1T = AnonymousClass000.A1T(this.A04, 1000);
        StringBuilder A0h = C90524aI.A0h(48);
        A0h.append("LocationAvailability[isLocationAvailable: ");
        A0h.append(A1T);
        return C90474aD.A0g(A0h);
    }

    public LocationAvailability(AnonymousClass8CK[] r1, int i, int i2, int i3, long j) {
        this.A04 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = j;
        this.A03 = r1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        AnonymousClass0Z9.A08(parcel, 2, this.A01);
        AnonymousClass0Z9.A09(parcel, 3, this.A02);
        AnonymousClass0Z9.A08(parcel, 4, this.A04);
        AnonymousClass0Z9.A0G(parcel, this.A03, 5, i);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
