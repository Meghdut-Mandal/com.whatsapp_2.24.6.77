package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.9tI  reason: invalid class name and case insensitive filesystem */
public class C206379tI implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(18);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C206379tI r5 = (C206379tI) obj;
            if (!(Util.A0E(this.A05, r5.A05) && this.A0F == r5.A0F && this.A0G == r5.A0G && this.A0C == r5.A0C && this.A0B == r5.A0B && this.A0A == r5.A0A && this.A09 == r5.A09 && this.A08 == r5.A08 && this.A07 == r5.A07 && this.A0H == r5.A0H && Util.A0E(this.A03, r5.A03) && Util.A0E(this.A04, r5.A04) && Util.A0E(this.A02, r5.A02) && Util.A0E(this.A06, r5.A06) && Util.A0E(this.A01, r5.A01) && this.A0E == r5.A0E && this.A00 == r5.A00 && this.A0D == r5.A0D && this.A0I == r5.A0I)) {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
    }

    public C206379tI(C194119Oe r2) {
        this.A05 = r2.A05;
        this.A0F = r2.A0F;
        this.A0G = r2.A0G;
        this.A0C = r2.A0C;
        this.A0B = r2.A0B;
        this.A0A = r2.A0A;
        this.A09 = r2.A09;
        this.A08 = r2.A08;
        this.A07 = r2.A07;
        this.A0H = r2.A0H;
        this.A03 = r2.A03;
        this.A04 = r2.A04;
        this.A02 = r2.A02;
        this.A06 = r2.A06;
        this.A01 = r2.A01;
        this.A0E = r2.A0E;
        this.A00 = r2.A00;
        this.A0D = r2.A0D;
        this.A0I = r2.A0I;
    }
}
