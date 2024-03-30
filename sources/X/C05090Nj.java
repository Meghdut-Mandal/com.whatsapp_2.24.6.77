package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Nj  reason: invalid class name and case insensitive filesystem */
public enum C05090Nj implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);
    
    public static final Parcelable.Creator CREATOR = null;
    public final int zzb;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new C08590az();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb);
    }

    /* access modifiers changed from: public */
    C05090Nj(int i) {
        this.zzb = i;
    }
}
