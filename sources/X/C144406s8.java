package X;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6s8  reason: invalid class name and case insensitive filesystem */
public final class C144406s8 implements C160637lL, Parcelable {
    public static final Parcelable.Creator CREATOR = new C134016aM();
    public double A00;
    public int A01;
    public int A02;
    public C144416s9 A03;
    public Double A04;
    public Double A05;
    public final double A06;
    public final double A07;
    public final double A08;
    public final AnonymousClass544 A09;
    public final String A0A;
    public final boolean A0B;

    public C144406s8(C144416s9 r2, AnonymousClass544 r3, Double d, Double d2, String str, double d3, double d4, double d5, double d6, int i, int i2, boolean z) {
        AnonymousClass00C.A0D(str, 1);
        AnonymousClass00C.A0D(r3, 6);
        this.A0A = str;
        this.A06 = d3;
        this.A07 = d4;
        this.A0B = z;
        this.A08 = d5;
        this.A09 = r3;
        this.A03 = r2;
        this.A00 = d6;
        this.A05 = d;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = d2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C144406s8) {
                C144406s8 r7 = (C144406s8) obj;
                if (!(AnonymousClass00C.A0J(this.A0A, r7.A0A) && Double.compare(this.A06, r7.A06) == 0 && Double.compare(this.A07, r7.A07) == 0 && this.A0B == r7.A0B && Double.compare(this.A08, r7.A08) == 0 && AnonymousClass00C.A0J(this.A09, r7.A09) && AnonymousClass00C.A0J(this.A03, r7.A03) && Double.compare(this.A00, r7.A00) == 0 && AnonymousClass00C.A0J(this.A05, r7.A05) && this.A01 == r7.A01 && this.A02 == r7.A02 && AnonymousClass00C.A0J(this.A04, r7.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        double d;
        double d2;
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeDouble(this.A06);
        parcel.writeDouble(this.A07);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        parcel.writeDouble(this.A08);
        parcel.writeParcelable(this.A09, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeDouble(this.A00);
        Double d3 = this.A05;
        if (d3 != null) {
            d = d3.doubleValue();
        } else {
            d = -1.0d;
        }
        parcel.writeDouble(d);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        Double d4 = this.A04;
        if (d4 != null) {
            d2 = d4.doubleValue();
        } else {
            d2 = -1.0d;
        }
        parcel.writeDouble(d2);
    }

    public void B2B(Location location) {
        double d;
        Location location2 = new Location("");
        double d2 = this.A06;
        if (!Double.isNaN(d2)) {
            double d3 = this.A07;
            if (!(Double.isNaN(d3) || d2 == 0.0d || d3 == 0.0d)) {
                location2.setLatitude(d2);
                location2.setLongitude(d3);
                d = (double) location.distanceTo(location2);
                this.A00 = d;
            }
        }
        d = 0.0d;
        this.A00 = d;
    }

    public Double BG8() {
        return Double.valueOf(this.A08);
    }

    public int hashCode() {
        int A002 = C36321k7.A00(Double.doubleToLongBits(this.A06), C36421kH.A04(this.A0A));
        int A003 = C36321k7.A00(Double.doubleToLongBits(this.A08), (C36321k7.A00(Double.doubleToLongBits(this.A07), A002) + C36341k9.A01(this.A0B ? 1 : 0)) * 31);
        return ((((((C36321k7.A00(Double.doubleToLongBits(this.A00), (C36351kA.A05(this.A09, A003) + AnonymousClass000.A0H(this.A03)) * 31) + AnonymousClass000.A0H(this.A05)) * 31) + this.A01) * 31) + this.A02) * 31) + C36411kG.A09(this.A04);
    }

    public double BBC() {
        return this.A00;
    }

    public Double BG7() {
        return this.A05;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MapBusinessProfile(id=");
        A0u.append(this.A0A);
        A0u.append(", latitude=");
        A0u.append(this.A06);
        A0u.append(", longitude=");
        A0u.append(this.A07);
        A0u.append(", isResponsive=");
        A0u.append(this.A0B);
        A0u.append(", preRankingScore=");
        A0u.append(this.A08);
        A0u.append(", categoryInfo=");
        A0u.append(this.A09);
        A0u.append(", minifiedBusinessProfile=");
        A0u.append(this.A03);
        A0u.append(", distance=");
        A0u.append(this.A00);
        A0u.append(", postRankingScore=");
        A0u.append(this.A05);
        A0u.append(", businessRankIndex=");
        A0u.append(this.A01);
        A0u.append(", businessSegmentIndex=");
        A0u.append(this.A02);
        A0u.append(", businessPostRankingScoreWithProximity=");
        return AnonymousClass000.A0m(this.A04, A0u);
    }

    public void Brg(Double d) {
        this.A05 = d;
    }
}
