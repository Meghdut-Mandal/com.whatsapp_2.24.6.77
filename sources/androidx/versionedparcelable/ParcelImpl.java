package androidx.versionedparcelable;

import X.C03880Ig;
import X.C15820o2;
import X.C18440tA;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C18440tA(13);
    public final C15820o2 A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C03880Ig(parcel).A08(this.A00);
    }

    public ParcelImpl(Parcel parcel) {
        this.A00 = new C03880Ig(parcel).A04();
    }
}
