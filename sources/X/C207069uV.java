package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* renamed from: X.9uV  reason: invalid class name and case insensitive filesystem */
public final class C207069uV implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(20);
    public int A00;
    public final String A01;
    public final String A02;
    public final UUID A03;
    public final byte[] A04;

    public int describeContents() {
        return 0;
    }

    public C207069uV(String str, UUID uuid, byte[] bArr) {
        Objects.requireNonNull(uuid);
        this.A03 = uuid;
        this.A01 = str;
        Objects.requireNonNull("video/mp4");
        this.A02 = "video/mp4";
        this.A04 = bArr;
    }

    public boolean A00(UUID uuid) {
        UUID uuid2 = AnonymousClass9B7.A03;
        UUID uuid3 = this.A03;
        if (uuid2.equals(uuid3) || uuid.equals(uuid3)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C207069uV)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C207069uV r4 = (C207069uV) obj;
        if (!Util.A0E(this.A01, r4.A01) || !Util.A0E(this.A02, r4.A02) || !Util.A0E(this.A03, r4.A03) || !Arrays.equals(this.A04, r4.A04)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A08 = C36381kD.A08(this.A02, (C36391kE.A0A(this.A03) + C36341k9.A09(this.A01)) * 31) + Arrays.hashCode(this.A04);
        this.A00 = A08;
        return A08;
    }

    public void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.A03;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeByteArray(this.A04);
    }

    public C207069uV(Parcel parcel) {
        this.A03 = new UUID(parcel.readLong(), parcel.readLong());
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.createByteArray();
    }
}
