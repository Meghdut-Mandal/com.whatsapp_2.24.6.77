package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XU  reason: invalid class name */
public final class AnonymousClass3XU implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C66563Wl();
    public final int A00;
    public final AnonymousClass3XN A01;
    public final AnonymousClass3XN A02;
    public final AnonymousClass3XN A03;
    public final String A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3XU) {
                AnonymousClass3XU r5 = (AnonymousClass3XU) obj;
                if (!AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A04);
        this.A02.writeToParcel(parcel, i);
        this.A03.writeToParcel(parcel, i);
        this.A01.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        return C36351kA.A05(this.A01, C36351kA.A05(this.A03, C36351kA.A05(this.A02, C36421kH.A04(this.A04)))) + this.A00;
    }

    public AnonymousClass3XU(AnonymousClass3XN r1, AnonymousClass3XN r2, AnonymousClass3XN r3, String str, int i) {
        C36321k7.A18(str, r1, r2, r3);
        this.A04 = str;
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(AnonymousClass000.A0k(this));
        A0u.append("{id='");
        A0u.append(this.A04);
        A0u.append("', preview='");
        A0u.append(this.A02);
        A0u.append("', staticPreview='");
        A0u.append(this.A03);
        A0u.append("', content='");
        A0u.append(this.A01);
        A0u.append("', providerType='");
        A0u.append(this.A00);
        return AnonymousClass000.A0q("'}", A0u);
    }
}
