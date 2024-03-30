package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9zm  reason: invalid class name and case insensitive filesystem */
public final class C209299zm implements B5K {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(28);
    public final float A00;
    public final int A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C209299zm r5 = (C209299zm) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C165617ti.A01(Float.valueOf(this.A00).hashCode()) + this.A01;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
    }

    public C209299zm(int i, float f) {
        this.A00 = f;
        this.A01 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("smta: captureFrameRate=");
        A0u.append(this.A00);
        A0u.append(", svcTemporalLayerCount=");
        return C36381kD.A10(A0u, this.A01);
    }

    public C209299zm(Parcel parcel) {
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readInt();
    }
}
