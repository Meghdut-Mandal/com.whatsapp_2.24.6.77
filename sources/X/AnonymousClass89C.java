package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.89C  reason: invalid class name */
public class AnonymousClass89C extends AU7 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(43);
    public static final long serialVersionUID = -1995751016961335956L;
    public final C207169uf mRequest;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass89C(Parcel parcel) {
        super(C188488zf.A08);
        this.mRequest = (C207169uf) C36411kG.A0H(parcel, C207169uf.class);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mRequest, i);
    }

    public AnonymousClass89C(C207169uf r2) {
        super(C188488zf.A08);
        this.mRequest = r2;
    }
}
