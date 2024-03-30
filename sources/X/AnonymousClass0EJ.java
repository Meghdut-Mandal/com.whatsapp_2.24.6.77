package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.0EJ  reason: invalid class name */
public class AnonymousClass0EJ extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C18440tA(4);
    public int A00;

    public AnonymousClass0EJ(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("HorizontalScrollView.SavedState{");
        AnonymousClass000.A1B(this, A0u);
        A0u.append(" scrollPosition=");
        A0u.append(this.A00);
        return AnonymousClass000.A0q("}", A0u);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }

    public AnonymousClass0EJ(Parcelable parcelable) {
        super(parcelable);
    }
}
