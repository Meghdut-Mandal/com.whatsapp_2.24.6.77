package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.89F  reason: invalid class name */
public class AnonymousClass89F extends AU7 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(45);
    public static final long serialVersionUID = -6467276914238960823L;
    public final C207169uf mRequest;
    public final int mTaskQueueSize;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass89F(C207169uf r2, int i) {
        super(C188488zf.A0A);
        this.mRequest = r2;
        this.mTaskQueueSize = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mRequest, i);
        parcel.writeInt(this.mTaskQueueSize);
    }

    public AnonymousClass89F(Parcel parcel) {
        super(C188488zf.A0A);
        this.mRequest = (C207169uf) C36411kG.A0H(parcel, C207169uf.class);
        this.mTaskQueueSize = parcel.readInt();
    }
}
