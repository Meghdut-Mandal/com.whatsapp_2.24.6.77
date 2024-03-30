package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Nl  reason: invalid class name and case insensitive filesystem */
public enum C05100Nl implements Parcelable {
    ;
    
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
        CREATOR = new C08240aQ();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }

    /* access modifiers changed from: public */
    C05100Nl(String str) {
        this.zzb = str;
    }

    public static C05100Nl A00(String str) {
        for (C05100Nl r1 : values()) {
            if (str.equals(r1.zzb)) {
                return r1;
            }
        }
        throw new C05190Ny(str);
    }
}
