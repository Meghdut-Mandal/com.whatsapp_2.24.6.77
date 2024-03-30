package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.fieldstats.extension.WamCallExtendedField;

/* renamed from: X.6ab  reason: invalid class name and case insensitive filesystem */
public final class C134166ab implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new WamCallExtendedField(C36411kG.A02(parcel), parcel.readString(), parcel.readValue(WamCallExtendedField.class.getClassLoader()));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WamCallExtendedField[i];
    }
}
