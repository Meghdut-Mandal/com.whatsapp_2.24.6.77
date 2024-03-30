package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.89D  reason: invalid class name */
public class AnonymousClass89D extends AU7 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(44);
    public static final long serialVersionUID = 7839888635267517753L;
    public final C207169uf mRequest;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass89D(Parcel parcel) {
        super(C188488zf.A09);
        this.mRequest = (C207169uf) C36411kG.A0H(parcel, C207169uf.class);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mRequest, i);
    }

    public AnonymousClass89D(C207169uf r2) {
        super(C188488zf.A09);
        this.mRequest = r2;
    }
}
