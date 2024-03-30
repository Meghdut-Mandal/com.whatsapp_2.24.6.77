package com.google.android.gms.common.api;

import X.AnonymousClass000;
import X.AnonymousClass0L0;
import X.AnonymousClass0QJ;
import X.AnonymousClass0QM;
import X.AnonymousClass0UM;
import X.AnonymousClass0Z9;
import X.C08030a5;
import X.C10440eF;
import X.C16780q5;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Status extends C10440eF implements C16780q5, ReflectedParcelable {
    public static final Status A05 = new Status(16, (String) null);
    public static final Status A06 = new Status(18, (String) null);
    public static final Status A07 = new Status(8, (String) null);
    public static final Status A08 = new Status(14, (String) null);
    public static final Status A09 = new Status(0, (String) null);
    public static final Status A0A = new Status(-1, (String) null);
    public static final Status A0B = new Status(15, (String) null);
    public static final Status A0C = new Status(17, (String) null);
    public static final Parcelable.Creator CREATOR = new C08030a5();
    public final int A00;
    public final int A01;
    public final PendingIntent A02;
    public final AnonymousClass0L0 A03;
    public final String A04;

    public Status(int i, String str) {
        this((PendingIntent) null, (AnonymousClass0L0) null, str, 1, i);
    }

    public Status(PendingIntent pendingIntent, AnonymousClass0L0 r2, String str, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A04 = str;
        this.A02 = pendingIntent;
        this.A03 = r2;
    }

    public Status BHx() {
        return this;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1J(objArr, this.A00);
        AnonymousClass000.A1K(objArr, this.A01);
        objArr[2] = this.A04;
        objArr[3] = this.A02;
        return AnonymousClass000.A0M(this.A03, objArr, 4);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            if (this.A00 != status.A00 || this.A01 != status.A01 || !AnonymousClass0QM.A00(this.A04, status.A04) || !AnonymousClass0QM.A00(this.A02, status.A02) || !AnonymousClass0QM.A00(this.A03, status.A03)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        AnonymousClass0UM r2 = new AnonymousClass0UM(this);
        String str = this.A04;
        if (str == null) {
            str = AnonymousClass0QJ.A00(this.A01);
        }
        r2.A00(str, "statusCode");
        r2.A00(this.A02, "resolution");
        return r2.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A01);
        boolean A062 = C10440eF.A06(parcel, this.A04);
        AnonymousClass0Z9.A0B(parcel, this.A02, 3, i, A062);
        AnonymousClass0Z9.A0B(parcel, this.A03, 4, i, A062);
        AnonymousClass0Z9.A08(parcel, 1000, this.A00);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
