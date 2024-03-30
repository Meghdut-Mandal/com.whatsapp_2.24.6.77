package com.google.android.gms.location;

import X.AnonymousClass000;
import X.AnonymousClass0Z9;
import X.C10440eF;
import X.C204639qK;
import X.C36421kH;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class LocationRequest extends C10440eF implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C204639qK();
    public int A00;
    public long A01;
    public float A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public boolean A07;
    public boolean A08;

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1J(objArr, this.A03);
        C36421kH.A1P(objArr, this.A04);
        objArr[2] = Float.valueOf(this.A02);
        return AnonymousClass000.A0M(Long.valueOf(this.A06), objArr, 3);
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.A03 == locationRequest.A03) {
                long j = this.A04;
                long j2 = locationRequest.A04;
                if (j == j2 && this.A05 == locationRequest.A05 && this.A07 == locationRequest.A07 && this.A01 == locationRequest.A01 && this.A00 == locationRequest.A00 && this.A02 == locationRequest.A02) {
                    long j3 = this.A06;
                    if (j3 >= j) {
                        j = j3;
                    }
                    long j4 = locationRequest.A06;
                    if (j4 >= j2) {
                        j2 = j4;
                    }
                    if (j == j2 && this.A08 == locationRequest.A08) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public LocationRequest(float f, int i, int i2, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.A03 = i;
        this.A04 = j;
        this.A05 = j2;
        this.A07 = z;
        this.A01 = j3;
        this.A00 = i2;
        this.A02 = f;
        this.A06 = j4;
        this.A08 = z2;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Request[");
        int i = this.A03;
        if (i == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i == 104) {
            str = "PRIORITY_LOW_POWER";
        } else if (i != 105) {
            str = "???";
        } else {
            str = "PRIORITY_NO_POWER";
        }
        A0u.append(str);
        if (i != 105) {
            A0u.append(" requested=");
            A0u.append(this.A04);
            A0u.append("ms");
        }
        A0u.append(" fastest=");
        A0u.append(this.A05);
        A0u.append("ms");
        long j = this.A06;
        if (j > this.A04) {
            A0u.append(" maxWait=");
            A0u.append(j);
            A0u.append("ms");
        }
        float f = this.A02;
        if (f > 0.0f) {
            A0u.append(" smallestDisplacement=");
            A0u.append(f);
            A0u.append("m");
        }
        long j2 = this.A01;
        if (j2 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            A0u.append(" expireIn=");
            A0u.append(j2 - elapsedRealtime);
            A0u.append("ms");
        }
        int i2 = this.A00;
        if (i2 != Integer.MAX_VALUE) {
            A0u.append(" num=");
            A0u.append(i2);
        }
        return AnonymousClass000.A0t(A0u, ']');
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A012 = AnonymousClass0Z9.A01(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A03);
        AnonymousClass0Z9.A09(parcel, 2, this.A04);
        AnonymousClass0Z9.A09(parcel, 3, this.A05);
        AnonymousClass0Z9.A0A(parcel, 4, this.A07);
        AnonymousClass0Z9.A09(parcel, 5, this.A01);
        AnonymousClass0Z9.A08(parcel, 6, this.A00);
        AnonymousClass0Z9.A06(parcel, this.A02, 7);
        AnonymousClass0Z9.A09(parcel, 8, this.A06);
        AnonymousClass0Z9.A0A(parcel, 9, this.A08);
        AnonymousClass0Z9.A07(parcel, A012);
    }

    @Deprecated
    public LocationRequest() {
        this.A03 = 102;
        this.A04 = 3600000;
        this.A05 = 600000;
        this.A07 = false;
        this.A01 = Long.MAX_VALUE;
        this.A00 = Integer.MAX_VALUE;
        this.A02 = 0.0f;
        this.A06 = 0;
        this.A08 = false;
    }
}
