package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0HS  reason: invalid class name */
public class AnonymousClass0HS extends C08840bP {
    public static final Parcelable.Creator CREATOR = new C18580tO(0);
    public boolean A00;

    public AnonymousClass0HS(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = AnonymousClass000.A1X(parcel.readValue((ClassLoader) null));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SearchView.SavedState{");
        AnonymousClass000.A1B(this, A0u);
        A0u.append(" isIconified=");
        A0u.append(this.A00);
        return AnonymousClass000.A0q("}", A0u);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.A00));
    }

    public AnonymousClass0HS(Parcelable parcelable) {
        super(parcelable);
    }
}
