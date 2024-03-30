package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Nk  reason: invalid class name */
public enum AnonymousClass0Nk implements Parcelable {
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");
    
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
        CREATOR = new C08390af();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }

    /* access modifiers changed from: public */
    AnonymousClass0Nk(String str) {
        this.zzb = str;
    }
}
