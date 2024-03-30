package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

public final class AXf implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(6);
    public int A00;
    public final String A01;
    public final C206429tO[] A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AXf aXf = (AXf) obj;
            if (!C197059b4.A00(this.A01, aXf.A01) || !Arrays.equals(this.A02, aXf.A02)) {
                return false;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        UUID uuid = AnonymousClass9B8.A03;
        UUID uuid2 = ((C206429tO) obj).A03;
        boolean equals = uuid.equals(uuid2);
        UUID uuid3 = ((C206429tO) obj2).A03;
        if (equals) {
            return C36431kI.A1Q(uuid.equals(uuid3) ? 1 : 0) ? 1 : 0;
        }
        return uuid2.compareTo(uuid3);
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A09 = (C36341k9.A09(this.A01) * 31) + Arrays.hashCode(this.A02);
        this.A00 = A09;
        return A09;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeTypedArray(this.A02, 0);
    }

    public AXf(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = (C206429tO[]) parcel.createTypedArray(C206429tO.CREATOR);
    }
}
