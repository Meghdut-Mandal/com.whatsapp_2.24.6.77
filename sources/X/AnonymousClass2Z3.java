package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Z3  reason: invalid class name */
public final class AnonymousClass2Z3 extends AnonymousClass3X8 {
    public static final Parcelable.Creator CREATOR = new C66703Wz();
    public final C28981Uw A00;

    public AnonymousClass2Z3(C28981Uw r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2Z3) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2Z3) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Suspension(newsletterJid=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
