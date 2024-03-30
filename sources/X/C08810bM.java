package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.0bM  reason: invalid class name and case insensitive filesystem */
public class C08810bM implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C18440tA(11);
    public int A00;
    public int A01;
    public boolean A02;
    public int[] A03;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int length;
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        int[] iArr = this.A03;
        if (iArr == null || (length = iArr.length) <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(length);
        parcel.writeIntArray(this.A03);
    }

    public C08810bM(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = AnonymousClass000.A1O(parcel.readInt());
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.A03 = iArr;
            parcel.readIntArray(iArr);
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FullSpanItem{mPosition=");
        A0u.append(this.A01);
        A0u.append(", mGapDir=");
        A0u.append(this.A00);
        A0u.append(", mHasUnwantedGapAfter=");
        A0u.append(this.A02);
        A0u.append(", mGapPerSpan=");
        A0u.append(Arrays.toString(this.A03));
        return AnonymousClass000.A0s(A0u);
    }

    public C08810bM() {
    }
}
