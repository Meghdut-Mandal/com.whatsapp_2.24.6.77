package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: X.9ub  reason: invalid class name and case insensitive filesystem */
public final class C207129ub implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(40);
    public CharSequence A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.A00, parcel, 0);
    }

    public C207129ub(Parcel parcel) {
        this.A00 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    public C207129ub(CharSequence charSequence) {
        this.A00 = charSequence;
    }

    public C207129ub() {
    }
}
