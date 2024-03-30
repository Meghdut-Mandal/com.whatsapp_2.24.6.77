package android.support.v4.media;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass92U;
import X.C193949Nn;
import X.C23179B8n;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(1);
    public MediaDescription A00;
    public final Bitmap A01;
    public final Uri A02;
    public final Uri A03;
    public final Bundle A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final CharSequence A07;
    public final String A08;

    public int describeContents() {
        return 0;
    }

    public static MediaDescriptionCompat A00(Object obj) {
        Uri uri;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        C193949Nn r3 = new C193949Nn();
        MediaDescription mediaDescription = (MediaDescription) obj2;
        r3.A07 = mediaDescription.getMediaId();
        r3.A06 = mediaDescription.getTitle();
        r3.A05 = mediaDescription.getSubtitle();
        r3.A04 = mediaDescription.getDescription();
        r3.A00 = mediaDescription.getIconBitmap();
        r3.A01 = mediaDescription.getIconUri();
        Bundle extras = mediaDescription.getExtras();
        if (extras != null) {
            extras.setClassLoader(AnonymousClass92U.class.getClassLoader());
            try {
                extras.isEmpty();
            } catch (BadParcelableException unused) {
                Log.e("MediaSessionCompat", "Could not unparcel the data.");
                extras = null;
            }
        }
        if (extras != null) {
            uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
            if (uri != null) {
                if (!extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || extras.size() != 2) {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
            }
            bundle = extras;
        } else {
            uri = null;
            bundle = extras;
        }
        r3.A03 = bundle;
        if (uri != null) {
            r3.A02 = uri;
        } else if (Build.VERSION.SDK_INT >= 23) {
            r3.A02 = mediaDescription.getMediaUri();
        }
        String str = r3.A07;
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(r3.A00, r3.A01, r3.A02, r3.A03, r3.A06, r3.A05, r3.A04, str);
        mediaDescriptionCompat.A00 = mediaDescription;
        return mediaDescriptionCompat;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Uri uri;
        MediaDescription mediaDescription = this.A00;
        if (mediaDescription == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.A08);
            builder.setTitle(this.A07);
            builder.setSubtitle(this.A06);
            builder.setDescription(this.A05);
            builder.setIconBitmap(this.A01);
            builder.setIconUri(this.A02);
            Bundle bundle = this.A04;
            if (Build.VERSION.SDK_INT < 23 && (uri = this.A03) != null) {
                if (bundle == null) {
                    bundle = AnonymousClass001.A07();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
            }
            builder.setExtras(bundle);
            if (Build.VERSION.SDK_INT >= 23) {
                builder.setMediaUri(this.A03);
            }
            mediaDescription = builder.build();
            this.A00 = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i);
    }

    public MediaDescriptionCompat(Bitmap bitmap, Uri uri, Uri uri2, Bundle bundle, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str) {
        this.A08 = str;
        this.A07 = charSequence;
        this.A06 = charSequence2;
        this.A05 = charSequence3;
        this.A01 = bitmap;
        this.A02 = uri;
        this.A04 = bundle;
        this.A03 = uri2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A07);
        A0u.append(", ");
        A0u.append(this.A06);
        A0u.append(", ");
        return AnonymousClass000.A0o(this.A05, A0u);
    }
}
