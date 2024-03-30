package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bx  reason: invalid class name and case insensitive filesystem */
public final class C134996bx implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C163937r0(4);
    public final float A00;
    public final float A01;
    public final float A02;
    public final C134976bv A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134996bx)) {
            return false;
        }
        C134996bx r4 = (C134996bx) obj;
        if (this.A00 == r4.A00) {
            C134976bv r1 = this.A03;
            C134976bv r0 = r4.A03;
            if (r1 != null) {
                return r1.equals(r0) && this.A01 == r4.A01 && this.A02 == r4.A02;
            }
            if (r0 == null) {
                return true;
            }
        }
    }

    public int hashCode() {
        C134976bv r0 = this.A03;
        float f = 17.0f;
        if (r0 != null) {
            f = 527.0f + ((float) r0.hashCode());
        }
        return (int) ((((((f * 31.0f) + this.A02) * 31.0f) + this.A01) * 31.0f) + this.A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }

    public C134996bx(Parcel parcel) {
        this.A03 = (C134976bv) C36411kG.A0H(parcel, C134976bv.class);
        this.A02 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A00 = parcel.readFloat();
    }

    public static float A00(C139266jV r0) {
        return r0.A02().A02;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1C(this, A0u);
        A0u.append("{target=");
        A0u.append(this.A03);
        A0u.append(", zoom=");
        A0u.append(this.A02);
        A0u.append(", tilt=");
        A0u.append(this.A01);
        A0u.append(", bearing=");
        A0u.append(this.A00);
        return AnonymousClass000.A0q("}", A0u);
    }

    public C134996bx(C134976bv r1, float f, float f2, float f3) {
        this.A03 = r1;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
    }
}
