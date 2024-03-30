package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9tN  reason: invalid class name and case insensitive filesystem */
public final class C206419tN implements Parcelable {
    public static final C206419tN A03 = new C206419tN(new C206389tK[0]);
    public static final AnonymousClass7c0 CREATOR = AnonymousClass9z4.A00;
    public int A00;
    public final int A01;
    public final C23931Ak A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C206419tN r5 = (C206419tN) obj;
            if (this.A01 != r5.A01 || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = this.A02.hashCode();
        this.A00 = hashCode;
        return hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A01;
        parcel.writeInt(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            parcel.writeParcelable((Parcelable) this.A02.get(i3), 0);
        }
    }

    public C206419tN(C206389tK... r2) {
        this.A02 = C23931Ak.copyOf((Object[]) r2);
        this.A01 = r2.length;
    }
}
