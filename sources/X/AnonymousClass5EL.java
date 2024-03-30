package X;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.5EL  reason: invalid class name */
public class AnonymousClass5EL extends AnonymousClass5EQ {
    public Object A00;
    public String A01;
    public String A02;
    public boolean A03 = true;
    public boolean A04 = true;
    public boolean A05 = true;
    public final int A06;
    public final LatLng A07;
    public final C159367jF A08;
    public final AnonymousClass7gC A09;
    public final C160947lq A0A;
    public final C144416s9 A0B;
    public final boolean A0C;
    public final boolean A0D;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A0B.equals(((AnonymousClass5EL) obj).A0B);
    }

    public int hashCode() {
        return this.A0B.hashCode();
    }

    public String toString() {
        return this.A0B.toString();
    }

    public AnonymousClass5EL(LatLng latLng, C159367jF r5, AnonymousClass7gC r6, C160947lq r7, C144416s9 r8, int i, int i2, boolean z, boolean z2) {
        super(i);
        this.A06 = i2;
        this.A0C = z;
        this.A0B = r8;
        this.A07 = latLng;
        this.A08 = r5;
        this.A0D = z2;
        this.A09 = r6;
        this.A0A = r7;
        String str = r8.A04;
        if (str != null) {
            this.A01 = str.replaceAll("(\\n){2,}", "\n");
        }
    }
}
