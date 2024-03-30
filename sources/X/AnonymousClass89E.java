package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.89E  reason: invalid class name */
public class AnonymousClass89E extends AU7 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(42);
    public static final long serialVersionUID = 7839888635267517754L;
    public final String mPrefetchDataSource;
    public final C207169uf mRequest;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass89E(C207169uf r2, String str) {
        super(C188488zf.A07);
        this.mRequest = r2;
        this.mPrefetchDataSource = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mRequest, i);
        parcel.writeString(this.mPrefetchDataSource);
    }

    public AnonymousClass89E(Parcel parcel) {
        super(C188488zf.A07);
        this.mRequest = (C207169uf) C36411kG.A0H(parcel, C207169uf.class);
        this.mPrefetchDataSource = parcel.readString();
    }
}
