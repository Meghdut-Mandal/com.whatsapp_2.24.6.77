package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.82q  reason: invalid class name and case insensitive filesystem */
public final class C1689482q extends C209289zl {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(24);
    public final int A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public C1689482q(String str, byte[] bArr) {
        super("APIC");
        this.A02 = str;
        this.A01 = null;
        this.A00 = 3;
        this.A03 = bArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1689482q r5 = (C1689482q) obj;
            if (this.A00 != r5.A00 || !Util.A0E(this.A02, r5.A02) || !Util.A0E(this.A01, r5.A01) || !Arrays.equals(this.A03, r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A012 = (C165617ti.A01(this.A00) + C165577te.A06(this.A02)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return ((A012 + i) * 31) + Arrays.hashCode(this.A03);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A03);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A00);
        A0u.append(": mimeType=");
        A0u.append(this.A02);
        A0u.append(", description=");
        return AnonymousClass000.A0q(this.A01, A0u);
    }

    public C1689482q(Parcel parcel) {
        super("APIC");
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.createByteArray();
    }
}
