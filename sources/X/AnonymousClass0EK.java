package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.0EK  reason: invalid class name */
public class AnonymousClass0EK extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C18440tA(15);
    public int A00;

    public AnonymousClass0EK(Parcel parcel) {
        super(parcel);
        this.A00 = AnonymousClass000.A0I(parcel.readValue(getClass().getClassLoader()));
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MaterialCheckBox.SavedState{");
        AnonymousClass000.A1B(this, A0u);
        A0u.append(" CheckedState=");
        int i = this.A00;
        if (i == 1) {
            str = "checked";
        } else if (i != 2) {
            str = "unchecked";
        } else {
            str = "indeterminate";
        }
        A0u.append(str);
        return AnonymousClass000.A0q("}", A0u);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.A00));
    }

    public AnonymousClass0EK(Parcelable parcelable) {
        super(parcelable);
    }
}
