package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0No  reason: invalid class name and case insensitive filesystem */
public enum C05130No implements Parcelable {
    RESIDENT_KEY_REQUIRED("required");
    
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
        CREATOR = new C08380ae();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }

    /* access modifiers changed from: public */
    C05130No(String str) {
        this.zzb = str;
    }

    public static C05130No A00(String str) {
        for (C05130No r1 : values()) {
            if (str.equals(r1.zzb)) {
                return r1;
            }
        }
        throw new AnonymousClass0O3(str);
    }
}
