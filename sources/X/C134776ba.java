package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6ba  reason: invalid class name and case insensitive filesystem */
public final class C134776ba implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134126aX();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C134776ba(String str, String str2, String str3, String str4) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A01 = str4;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134776ba) {
                C134776ba r5 = (C134776ba) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return ((((C36421kH.A04(this.A00) + C36341k9.A09(this.A02)) * 31) + C36341k9.A09(this.A03)) * 31) + C36421kH.A05(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MetaAISearchSuggestion(text=");
        A0u.append(this.A00);
        A0u.append(", query=");
        A0u.append(this.A02);
        A0u.append(", sessionId=");
        A0u.append(this.A03);
        A0u.append(", context=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
