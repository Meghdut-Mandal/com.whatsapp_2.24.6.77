package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bw  reason: invalid class name and case insensitive filesystem */
public class C134986bw implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C163937r0(19);
    public final String A00;
    public final String A01;

    public C134986bw(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 1);
        String readString = parcel.readString();
        C18740tg.A05(readString);
        AnonymousClass00C.A08(readString);
        this.A00 = readString;
        String readString2 = parcel.readString();
        C18740tg.A05(readString2);
        AnonymousClass00C.A08(readString2);
        this.A01 = readString2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C134986bw)) {
            return false;
        }
        C134986bw r4 = (C134986bw) obj;
        if (!AnonymousClass00C.A0J(this.A00, r4.A00) || !AnonymousClass00C.A0J(this.A01, r4.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A01, C36421kH.A04(this.A00));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BizCategory:{'id'='");
        A0u.append(this.A00);
        A0u.append("', 'name'='");
        A0u.append(this.A01);
        return AnonymousClass000.A0q("'}", A0u);
    }

    public C134986bw(String str, String str2) {
        C36321k7.A0x(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
