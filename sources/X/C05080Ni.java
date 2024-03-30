package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Ni  reason: invalid class name and case insensitive filesystem */
public enum C05080Ni implements Parcelable {
    ;
    
    public static final Parcelable.Creator CREATOR = null;
    public final String zze;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.zze;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new C08420ai();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zze);
    }

    /* access modifiers changed from: public */
    C05080Ni(String str) {
        this.zze = str;
    }
}
