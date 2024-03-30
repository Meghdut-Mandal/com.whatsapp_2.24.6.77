package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.AbstractMap;

/* renamed from: X.6bJ  reason: invalid class name and case insensitive filesystem */
public final class C134606bJ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C133956aG();
    public final String A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134606bJ) {
                C134606bJ r5 = (C134606bJ) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return C90504aG.A0B(this.A01, C36421kH.A04(this.A00));
    }

    public C134606bJ(String str, String str2) {
        C36321k7.A0x(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public static Number A00(C134606bJ r4, AbstractMap abstractMap) {
        Number number = (Number) abstractMap.get(new AnonymousClass011(r4.A00, r4.A01));
        if (number == null) {
            return Integer.MAX_VALUE;
        }
        return number;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProductVariantProperty(name=");
        A0u.append(this.A00);
        A0u.append(", value=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
