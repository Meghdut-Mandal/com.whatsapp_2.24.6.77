package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8oN  reason: invalid class name and case insensitive filesystem */
public final class C181998oN extends C206259sy {
    public static final Parcelable.Creator CREATOR = new C206189sr();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C181998oN(String str) {
        super(str);
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C181998oN) && AnonymousClass00C.A0J(this.A00, ((C181998oN) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Thumbs(value=");
        return C36321k7.A0E(this.A00, A0u);
    }

    public C181998oN() {
        this("");
    }
}
