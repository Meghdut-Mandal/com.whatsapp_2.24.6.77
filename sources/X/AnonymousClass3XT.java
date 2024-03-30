package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.3XT  reason: invalid class name */
public final class AnonymousClass3XT implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C66533Wi();
    public final int A00;
    public final List A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;

    public AnonymousClass3XT(List list, List list2, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = list;
        this.A02 = list2;
        this.A03 = z;
        this.A04 = z2;
        C18740tg.A0D(C36381kD.A1U(i, 3), "Only set a valid status distribution mode");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C36381kD.A1Y(this, obj)) {
                return false;
            }
            AnonymousClass3XT r4 = (AnonymousClass3XT) obj;
            if (!(this.A00 == r4.A00 && this.A03 == r4.A03 && this.A04 == r4.A04 && AnonymousClass00C.A0J(this.A01, r4.A01) && AnonymousClass00C.A0J(this.A02, r4.A02))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1J(objArr, this.A00);
        objArr[1] = this.A01;
        objArr[2] = this.A02;
        objArr[3] = Boolean.valueOf(this.A03);
        return AnonymousClass000.A0M(Boolean.valueOf(this.A04), objArr, 4);
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A00);
        List<Parcelable> list = this.A01;
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        List<Parcelable> list2 = this.A02;
        parcel.writeInt(list2.size());
        for (Parcelable writeParcelable2 : list2) {
            parcel.writeParcelable(writeParcelable2, i);
        }
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StatusDistributionInfo(statusDistributionMode=");
        A0u.append(this.A00);
        A0u.append(", allowList=");
        A0u.append(this.A01);
        A0u.append(", denyList=");
        A0u.append(this.A02);
        A0u.append(", isCrosspostingToFbEnabled=");
        A0u.append(this.A03);
        A0u.append(", isCrosspostingToIgEnabled=");
        return C36321k7.A0H(A0u, this.A04);
    }
}
