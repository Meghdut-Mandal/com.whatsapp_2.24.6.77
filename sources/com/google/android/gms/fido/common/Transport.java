package com.google.android.gms.fido.common;

import X.AnonymousClass001;
import X.C05180Nx;
import X.C08230aP;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public enum Transport implements ReflectedParcelable {
    HYBRID("cable");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String zzb;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.zzb;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new C08230aP();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }

    /* access modifiers changed from: public */
    Transport(String str) {
        this.zzb = str;
    }

    public static Transport A00(String str) {
        for (Transport transport : values()) {
            if (str.equals(transport.zzb)) {
                return transport;
            }
        }
        if (str.equals("hybrid")) {
            return HYBRID;
        }
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = str;
        throw new C05180Nx(String.format("Transport %s not supported", A0L));
    }
}
