package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Nm  reason: invalid class name and case insensitive filesystem */
public enum C05110Nm implements Parcelable {
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
        CREATOR = new C08440ak();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }

    /* access modifiers changed from: public */
    C05110Nm(String str) {
        this.zzb = str;
    }

    public static C05110Nm A00(String str) {
        for (C05110Nm r1 : values()) {
            if (str.equals(r1.zzb)) {
                return r1;
            }
        }
        throw new C05200Nz(str);
    }
}
