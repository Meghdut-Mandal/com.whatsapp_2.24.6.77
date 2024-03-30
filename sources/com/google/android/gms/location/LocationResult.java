package com.google.android.gms.location;

import X.AnonymousClass0Z9;
import X.C10440eF;
import X.C204649qL;
import X.C36341k9;
import X.C90474aD;
import X.C90524aI;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult extends C10440eF implements ReflectedParcelable {
    public static final List A01 = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = new C204649qL();
    public final List A00;

    public boolean equals(Object obj) {
        if (obj instanceof LocationResult) {
            List<Location> list = ((LocationResult) obj).A00;
            int size = list.size();
            List list2 = this.A00;
            if (size == list2.size()) {
                Iterator it = list2.iterator();
                for (Location time : list) {
                    if (((Location) it.next()).getTime() != time.getTime()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 17;
        for (Location time : this.A00) {
            i = C36341k9.A02(time.getTime(), i * 31);
        }
        return i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.A00);
        StringBuilder A0h = C90524aI.A0h(C90474aD.A05(valueOf) + 27);
        A0h.append("LocationResult[locations: ");
        A0h.append(valueOf);
        return C90474aD.A0g(A0h);
    }

    public LocationResult(List list) {
        this.A00 = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A012 = AnonymousClass0Z9.A01(parcel);
        AnonymousClass0Z9.A0E(parcel, this.A00, 1, false);
        AnonymousClass0Z9.A07(parcel, A012);
    }
}
