package android.support.v4.media;

import X.AnonymousClass008;
import X.AnonymousClass92U;
import X.C165607th;
import X.C23179B8n;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaMetadataCompat implements Parcelable {
    public static final AnonymousClass008 A01;
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(2);
    public final Bundle A00;

    public int describeContents() {
        return 0;
    }

    static {
        AnonymousClass008 r3 = new AnonymousClass008();
        A01 = r3;
        Integer A0i = C36361kB.A0i();
        r3.put("android.media.metadata.TITLE", A0i);
        r3.put("android.media.metadata.ARTIST", A0i);
        Integer A0m = C36381kD.A0m();
        r3.put("android.media.metadata.DURATION", A0m);
        r3.put("android.media.metadata.ALBUM", A0i);
        r3.put("android.media.metadata.AUTHOR", A0i);
        r3.put("android.media.metadata.WRITER", A0i);
        r3.put("android.media.metadata.COMPOSER", A0i);
        r3.put("android.media.metadata.COMPILATION", A0i);
        r3.put("android.media.metadata.DATE", A0i);
        r3.put("android.media.metadata.YEAR", A0m);
        r3.put("android.media.metadata.GENRE", A0i);
        r3.put("android.media.metadata.TRACK_NUMBER", A0m);
        r3.put("android.media.metadata.NUM_TRACKS", A0m);
        r3.put("android.media.metadata.DISC_NUMBER", A0m);
        r3.put("android.media.metadata.ALBUM_ARTIST", A0i);
        Integer A0j = C36361kB.A0j();
        r3.put("android.media.metadata.ART", A0j);
        r3.put("android.media.metadata.ART_URI", A0i);
        r3.put("android.media.metadata.ALBUM_ART", A0j);
        r3.put("android.media.metadata.ALBUM_ART_URI", A0i);
        Integer A0n = C36371kC.A0n();
        r3.put("android.media.metadata.USER_RATING", A0n);
        r3.put("android.media.metadata.RATING", A0n);
        r3.put("android.media.metadata.DISPLAY_TITLE", A0i);
        r3.put("android.media.metadata.DISPLAY_SUBTITLE", A0i);
        r3.put("android.media.metadata.DISPLAY_DESCRIPTION", A0i);
        r3.put("android.media.metadata.DISPLAY_ICON", A0j);
        r3.put("android.media.metadata.DISPLAY_ICON_URI", A0i);
        r3.put("android.media.metadata.MEDIA_ID", A0i);
        r3.put("android.media.metadata.BT_FOLDER_TYPE", A0m);
        r3.put("android.media.metadata.MEDIA_URI", A0i);
        r3.put("android.media.metadata.ADVERTISEMENT", A0m);
        r3.put("android.media.metadata.DOWNLOAD_STATUS", A0m);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.A00 = C165607th.A0I(parcel, AnonymousClass92U.class);
    }
}
