package com.google.android.gms.common.api;

import X.AnonymousClass006;
import X.AnonymousClass0Z9;
import X.C08020a4;
import X.C10440eF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope extends C10440eF implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C08020a4();
    public final int A00;
    public final String A01;

    public String toString() {
        return this.A01;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.A01.equals(((Scope) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public Scope(int i, String str) {
        AnonymousClass006.A05(str, "scopeUri must not be null or empty");
        this.A00 = i;
        this.A01 = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        C10440eF.A04(parcel, this.A01, A002);
    }
}
