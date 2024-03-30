package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9uM  reason: invalid class name and case insensitive filesystem */
public class C206979uM implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23181B8p(11);
    public final int A00;
    public final long A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C206979uM r7 = (C206979uM) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00 && C1901797e.A00(this.A02, r7.A02))) {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
    }

    public C206979uM(long j, int i, String str) {
        this.A01 = j;
        this.A00 = i;
        this.A02 = str;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        C90474aD.A1S(A1Q, this.A01);
        AnonymousClass000.A1K(A1Q, this.A00);
        return C90484aE.A0D(this.A02, A1Q);
    }

    public C206979uM(Parcel parcel) {
        long readLong = parcel.readLong();
        C18740tg.A06(Long.valueOf(readLong));
        this.A01 = readLong;
        int readInt = parcel.readInt();
        C18740tg.A06(Integer.valueOf(readInt));
        this.A00 = readInt;
        this.A02 = parcel.readString();
    }
}
