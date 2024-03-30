package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.6bz  reason: invalid class name and case insensitive filesystem */
public final class C135016bz implements Parcelable {
    public static final C134026aN CREATOR = new C134026aN();
    public final double A00;
    public final float A01;
    public final int A02;
    public final ArrayList A03;
    public final ArrayList A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135016bz) {
                C135016bz r7 = (C135016bz) obj;
                if (!(Double.compare(this.A00, r7.A00) == 0 && this.A02 == r7.A02 && Float.compare(this.A01, r7.A01) == 0 && AnonymousClass00C.A0J(this.A03, r7.A03) && AnonymousClass00C.A0J(this.A04, r7.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeDouble(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeList(this.A03);
        parcel.writeList(this.A04);
    }

    public int hashCode() {
        return C36401kF.A02(this.A04, C36351kA.A05(this.A03, C90474aD.A02((C90464aC.A08(Double.doubleToLongBits(this.A00)) + this.A02) * 31, this.A01)));
    }

    public C135016bz(ArrayList arrayList, ArrayList arrayList2, double d, float f, int i) {
        this.A00 = d;
        this.A02 = i;
        this.A01 = f;
        this.A03 = arrayList;
        this.A04 = arrayList2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MapViewConfig(maxBusinessDistanceInMeter=");
        A0u.append(this.A00);
        A0u.append(", maxNoOfBusinesses=");
        A0u.append(this.A02);
        A0u.append(", defaultZoomLevel=");
        A0u.append(this.A01);
        A0u.append(", layeredZoomLevels=");
        A0u.append(this.A03);
        A0u.append(", mapViewSegments=");
        return AnonymousClass000.A0m(this.A04, A0u);
    }

    public C135016bz() {
        this(AnonymousClass001.A0I(), AnonymousClass001.A0I(), 0.0d, 0.0f, 0);
    }
}
