package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Nn  reason: invalid class name and case insensitive filesystem */
public enum C05120Nn implements Parcelable {
    ;
    
    public static final Parcelable.Creator CREATOR = null;
    public final String zzb;

    /* access modifiers changed from: public */
    static {
        CREATOR = new C08360ac();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.zzb;
    }

    /* access modifiers changed from: public */
    C05120Nn() {
        this.zzb = "public-key";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }

    public static C05120Nn A00(String str) {
        for (C05120Nn r1 : values()) {
            if (str.equals(r1.zzb)) {
                return r1;
            }
        }
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = str;
        throw new AnonymousClass0O2(String.format("PublicKeyCredentialType %s not supported", A0L));
    }
}
