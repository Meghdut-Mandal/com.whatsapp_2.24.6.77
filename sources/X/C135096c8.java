package X;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.location.PlaceInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6c8  reason: invalid class name and case insensitive filesystem */
public final class C135096c8 implements Parcelable {
    public static final C17940sK A0H = new C12700iW(-90.0d, 90.0d);
    public static final C17940sK A0I = new C12700iW(-180.0d, 180.0d);
    public static final Parcelable.Creator CREATOR = new C134246aj();
    public int A00;
    public long A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public String A07;
    public String A08;
    public boolean A09;
    public final int A0A;
    public final int A0B;
    public final String A0C;
    public final List A0D;
    public final double A0E;
    public final double A0F;
    public transient Location A0G;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C135096c8(android.location.Location r21, java.lang.String r22, int r23) {
        /*
            r20 = this;
            r0 = 2
            r1 = r21
            X.AnonymousClass00C.A0D(r1, r0)
            double r9 = r1.getLatitude()
            double r11 = r1.getLongitude()
            r1 = 0
            r13 = 3
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            r15 = 0
            r16 = 0
            r0 = r20
            r2 = r22
            r14 = r23
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r18 = r15
            r19 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135096c8.<init>(android.location.Location, java.lang.String, int):void");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135096c8) {
                C135096c8 r8 = (C135096c8) obj;
                if (this.A0B != r8.A0B || Double.compare(this.A0E, r8.A0E) != 0 || Double.compare(this.A0F, r8.A0F) != 0 || this.A0A != r8.A0A || !AnonymousClass00C.A0J(this.A0C, r8.A0C) || !AnonymousClass00C.A0J(this.A0D, r8.A0D) || !AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A05, r8.A05) || !AnonymousClass00C.A0J(this.A08, r8.A08) || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A04, r8.A04) || this.A06 != r8.A06 || this.A01 != r8.A01 || this.A09 != r8.A09 || !AnonymousClass00C.A0J(this.A07, r8.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A0B);
        parcel.writeDouble(this.A0E);
        parcel.writeDouble(this.A0F);
        parcel.writeInt(this.A0A);
        parcel.writeString(this.A0C);
        Iterator A0o = C90474aD.A0o(parcel, this.A0D);
        while (A0o.hasNext()) {
            ((PlaceInfo) A0o.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A00);
        Integer num = this.A02;
        int i2 = 0;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A07);
    }

    public final Location A00() {
        double d = this.A0E;
        if (d == Double.MAX_VALUE) {
            return null;
        }
        double d2 = this.A0F;
        if (d2 == Double.MAX_VALUE) {
            return null;
        }
        Location location = this.A0G;
        if (location == null) {
            location = new Location("");
            C12700iW r8 = (C12700iW) A0H;
            if (d >= r8.A01 && d <= r8.A00) {
                location.setLatitude(d);
            }
            C12700iW r5 = (C12700iW) A0I;
            if (d2 >= r5.A01 && d2 <= r5.A00) {
                location.setLongitude(d2);
            }
            this.A0G = location;
        }
        return location;
    }

    public int hashCode() {
        int A002 = C36321k7.A00(Double.doubleToLongBits(this.A0E), this.A0B * 31);
        int A082 = C36381kD.A08(this.A0C, (C36321k7.A00(Double.doubleToLongBits(this.A0F), A002) + this.A0A) * 31);
        return ((C36321k7.A00(this.A01, (((((((((((((C36351kA.A05(this.A0D, A082) + C36341k9.A09(this.A03)) * 31) + C36341k9.A09(this.A05)) * 31) + C36341k9.A09(this.A08)) * 31) + this.A00) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36341k9.A09(this.A04)) * 31) + C36341k9.A01(this.A06 ? 1 : 0)) * 31) + C36341k9.A01(this.A09 ? 1 : 0)) * 31) + C36421kH.A05(this.A07);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PlaceList(source=");
        A0u.append(this.A0B);
        A0u.append(", lat=");
        A0u.append(this.A0E);
        A0u.append(", lon=");
        A0u.append(this.A0F);
        A0u.append(", radius=");
        A0u.append(this.A0A);
        A0u.append(", query=");
        A0u.append(this.A0C);
        A0u.append(", places=");
        A0u.append(this.A0D);
        A0u.append(", htmlAttributions=");
        A0u.append(this.A03);
        A0u.append(", sessionId=");
        A0u.append(this.A05);
        A0u.append(", requestId=");
        A0u.append(this.A08);
        A0u.append(", requestIndex=");
        A0u.append(this.A00);
        A0u.append(", responseCode=");
        A0u.append(this.A02);
        A0u.append(", responseCodeDescr=");
        A0u.append(this.A04);
        A0u.append(", isCached=");
        A0u.append(this.A06);
        A0u.append(", responseTime=");
        A0u.append(this.A01);
        A0u.append(", hasMoreResults=");
        A0u.append(this.A09);
        A0u.append(", locationNextPageToken=");
        return C36321k7.A0E(this.A07, A0u);
    }

    public C135096c8(Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, double d, double d2, int i, int i2, int i3, long j, boolean z, boolean z2) {
        AnonymousClass00C.A0D(str, 5);
        this.A0B = i;
        this.A0E = d;
        this.A0F = d2;
        this.A0A = i2;
        this.A0C = str;
        this.A0D = list;
        this.A03 = str2;
        this.A05 = str3;
        this.A08 = str4;
        this.A00 = i3;
        this.A02 = num;
        this.A04 = str5;
        this.A06 = z;
        this.A01 = j;
        this.A09 = z2;
        this.A07 = str6;
    }

    public C135096c8() {
        this((Integer) null, "", (String) null, (String) null, (String) null, (String) null, (String) null, AnonymousClass001.A0I(), Double.MAX_VALUE, Double.MAX_VALUE, 0, 0, 0, 0, false, false);
    }
}
