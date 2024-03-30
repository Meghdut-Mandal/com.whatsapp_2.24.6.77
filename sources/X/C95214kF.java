package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: X.4kF  reason: invalid class name and case insensitive filesystem */
public class C95214kF extends C08840bP {
    public static final Parcelable.Creator CREATOR = new C165107st(1);
    public CharSequence A00;
    public boolean A01;

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TextInputLayout.SavedState{");
        C90504aG.A0z(System.identityHashCode(this), A0u);
        A0u.append(" error=");
        A0u.append(this.A00);
        return AnonymousClass000.A0q("}", A0u);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.A00, parcel, i);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public C95214kF(Parcelable parcelable) {
        super(parcelable);
    }

    public C95214kF(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A01 = AnonymousClass000.A1O(parcel.readInt());
    }
}
