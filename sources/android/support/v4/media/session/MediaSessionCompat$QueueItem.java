package android.support.v4.media.session;

import X.AnonymousClass000;
import X.C23179B8n;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(4);
    public final long A00;
    public final MediaDescriptionCompat A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.A01.writeToParcel(parcel, i);
        parcel.writeLong(this.A00);
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.A01 = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.A00 = parcel.readLong();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaSession.QueueItem {Description=");
        A0u.append(this.A01);
        A0u.append(", Id=");
        A0u.append(this.A00);
        return AnonymousClass000.A0q(" }", A0u);
    }
}
