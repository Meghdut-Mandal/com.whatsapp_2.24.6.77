package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6sA  reason: invalid class name and case insensitive filesystem */
public final class C144426sA implements C160637lL, Parcelable, AnonymousClass7eK {
    public static final Parcelable.Creator CREATOR = new C134086aT();
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = -1.0f;
    public float A03 = -1.0f;
    public float A04 = -1.0f;
    public float A05;
    public float A06;
    public float A07 = -1.0f;
    public int A08 = -1;
    public boolean A09;
    public boolean A0A;
    public final C144406s8 A0B;

    public C144426sA(C144406s8 r3, float f, float f2, boolean z) {
        AnonymousClass00C.A0D(r3, 2);
        this.A09 = z;
        this.A0B = r3;
        this.A06 = f;
        this.A05 = f2;
    }

    public final float A00(Context context) {
        C144416s9 r1;
        AnonymousClass00C.A0D(context, 0);
        if (this.A04 == -1.0f) {
            C144406s8 r12 = this.A0B;
            if (r12.A03 != null) {
                Rect A062 = AnonymousClass001.A06();
                int A012 = C65103Qt.A01(context, 120.0f);
                Paint A013 = AnonymousClass6J8.A01(context);
                String str = r12.A09.A01;
                A013.getTextBounds(str, 0, str.length(), A062);
                float min = (float) Math.min(A062.width(), A012);
                float f = this.A04;
                if (f < min) {
                    f = min;
                }
                this.A04 = f;
                float f2 = this.A03;
                float height = (float) A062.height();
                if (f2 < height) {
                    f2 = height;
                }
                this.A03 = f2;
            }
        }
        if (this.A01 == -1.0f && (r1 = this.A0B.A03) != null) {
            Rect A063 = AnonymousClass001.A06();
            int A014 = C65103Qt.A01(context, 120.0f);
            Paint A002 = AnonymousClass6J8.A00(context);
            String str2 = r1.A0I;
            A002.getTextBounds(str2, 0, str2.length(), A063);
            float min2 = (float) Math.min(A063.width(), A014);
            float f3 = this.A01;
            if (f3 < min2) {
                f3 = min2;
            }
            this.A01 = f3;
            float f4 = this.A00;
            float height2 = (float) A063.height();
            if (f4 < height2) {
                f4 = height2;
            }
            this.A00 = f4;
        }
        float f5 = this.A04;
        float f6 = this.A01;
        if (f5 < f6) {
            return f6;
        }
        return f5;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.businessdirectory.view.marker.BusinessMarkerData");
                if (!AnonymousClass00C.A0J(this.A0B.A0A, ((C144426sA) obj).A0B.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        this.A0B.writeToParcel(parcel, i);
        parcel.writeFloat(this.A06);
        parcel.writeFloat(this.A05);
    }

    public void B2B(Location location) {
        this.A0B.B2B(location);
    }

    public double BBC() {
        return this.A0B.A00;
    }

    public C134976bv BG3() {
        C144406s8 r0 = this.A0B;
        return C134976bv.A00(r0.A06, r0.A07);
    }

    public Double BG7() {
        return this.A0B.A05;
    }

    public Double BG8() {
        return Double.valueOf(this.A0B.A08);
    }

    public void Brg(Double d) {
        this.A0B.A05 = d;
    }

    public int hashCode() {
        return this.A0B.A0A.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessMarkerData(isSelected=");
        A0u.append(this.A09);
        A0u.append(", mapBusinessProfile=");
        A0u.append(this.A0B);
        A0u.append(", showRegularMarkerFromZoom=");
        A0u.append(this.A06);
        A0u.append(", showCompactMarkerFromZoom=");
        return C90464aC.A0g(A0u, this.A05);
    }
}
