package android.support.v4.media.session;

import X.AnonymousClass000;
import X.AnonymousClass92U;
import X.C165607th;
import X.C23179B8n;
import X.C90524aI;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(8);
    public List A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final Bundle A09;
    public final CharSequence A0A;

    public final class CustomAction implements Parcelable {
        public static final Parcelable.Creator CREATOR = C23179B8n.A00(9);
        public final int A00;
        public final Bundle A01;
        public final CharSequence A02;
        public final String A03;

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A03);
            TextUtils.writeToParcel(this.A02, parcel, i);
            parcel.writeInt(this.A00);
            parcel.writeBundle(this.A01);
        }

        public CustomAction(Parcel parcel) {
            this.A03 = parcel.readString();
            this.A02 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.A00 = parcel.readInt();
            this.A01 = C165607th.A0I(parcel, AnonymousClass92U.class);
        }

        public String toString() {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Action:mName='");
            A0u.append(this.A02);
            A0u.append(", mIcon=");
            A0u.append(this.A00);
            A0u.append(", mExtras=");
            return AnonymousClass000.A0o(this.A01, A0u);
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0i = C90524aI.A0i("PlaybackState {");
        A0i.append("state=");
        A0i.append(this.A03);
        A0i.append(", position=");
        A0i.append(this.A07);
        A0i.append(", buffered position=");
        A0i.append(this.A06);
        A0i.append(", speed=");
        A0i.append(this.A01);
        A0i.append(", updated=");
        A0i.append(this.A08);
        A0i.append(", actions=");
        A0i.append(this.A04);
        A0i.append(", error code=");
        A0i.append(this.A02);
        A0i.append(", error message=");
        A0i.append(this.A0A);
        A0i.append(", custom actions=");
        A0i.append(this.A00);
        A0i.append(", active item id=");
        A0i.append(this.A05);
        return AnonymousClass000.A0q("}", A0i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeLong(this.A07);
        parcel.writeFloat(this.A01);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A06);
        parcel.writeLong(this.A04);
        TextUtils.writeToParcel(this.A0A, parcel, i);
        parcel.writeTypedList(this.A00);
        parcel.writeLong(this.A05);
        parcel.writeBundle(this.A09);
        parcel.writeInt(this.A02);
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A07 = parcel.readLong();
        this.A01 = parcel.readFloat();
        this.A08 = parcel.readLong();
        this.A06 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A0A = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A00 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.A05 = parcel.readLong();
        this.A09 = C165607th.A0I(parcel, AnonymousClass92U.class);
        this.A02 = parcel.readInt();
    }
}
