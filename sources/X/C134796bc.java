package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.6bc  reason: invalid class name and case insensitive filesystem */
public final class C134796bc implements Parcelable {
    public static final C134046aP CREATOR = new C134046aP();
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final ArrayList A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134796bc) {
                C134796bc r5 = (C134796bc) obj;
                if (!(Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A00, r5.A00) == 0 && this.A02 == r5.A02 && AnonymousClass00C.A0J(this.A04, r5.A04) && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeList(this.A04);
        parcel.writeInt(this.A03);
    }

    public int hashCode() {
        return C36351kA.A05(this.A04, (C90474aD.A02(C90514aH.A05(this.A01), this.A00) + this.A02) * 31) + this.A03;
    }

    public C134796bc(ArrayList arrayList, float f, float f2, int i, int i2) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = i;
        this.A04 = arrayList;
        this.A03 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MapViewSegment(startDistanceInMeter=");
        A0u.append(this.A01);
        A0u.append(", endDistanceInMeter=");
        A0u.append(this.A00);
        A0u.append(", compactPinLayerCount=");
        A0u.append(this.A02);
        A0u.append(", mapViewLayers=");
        A0u.append(this.A04);
        A0u.append(", gridSize=");
        return C36321k7.A0G(A0u, this.A03);
    }
}
