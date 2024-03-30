package android.support.v4.media;

import X.C23179B8n;
import X.C90464aC;
import X.C90524aI;
import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(0);
    public final int A00;
    public final MediaDescriptionCompat A01;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0i = C90524aI.A0i("MediaItem{");
        A0i.append("mFlags=");
        A0i.append(this.A00);
        A0i.append(", mDescription=");
        return C90464aC.A0X(this.A01, A0i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        this.A01.writeToParcel(parcel, i);
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}
