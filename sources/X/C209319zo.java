package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.9zo  reason: invalid class name and case insensitive filesystem */
public final class C209319zo implements B5K {
    public static final C207099uY A06 = C207099uY.A00("application/id3");
    public static final C207099uY A07 = C207099uY.A00("application/x-scte35");
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(23);
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final byte[] A05;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C209319zo r7 = (C209319zo) obj;
            if (this.A01 != r7.A01 || this.A02 != r7.A02 || !Util.A0E(this.A03, r7.A03) || !Util.A0E(this.A04, r7.A04) || !Arrays.equals(this.A05, r7.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        int A062 = (527 + C165577te.A06(this.A03)) * 31;
        String str = this.A04;
        if (str != null) {
            i2 = str.hashCode();
        }
        int A042 = C165577te.A04(this.A02, C165577te.A04(this.A01, (A062 + i2) * 31)) + Arrays.hashCode(this.A05);
        this.A00 = A042;
        return A042;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeByteArray(this.A05);
    }

    public C209319zo(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A05 = parcel.createByteArray();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EMSG: scheme=");
        A0u.append(this.A03);
        A0u.append(", id=");
        A0u.append(this.A02);
        A0u.append(", durationMs=");
        A0u.append(this.A01);
        A0u.append(", value=");
        return AnonymousClass000.A0q(this.A04, A0u);
    }

    public C209319zo(String str, String str2, byte[] bArr, long j, long j2) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = j;
        this.A02 = j2;
        this.A05 = bArr;
    }
}
