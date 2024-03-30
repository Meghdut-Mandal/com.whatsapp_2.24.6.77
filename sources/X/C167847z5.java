package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.7z5  reason: invalid class name and case insensitive filesystem */
public class C167847z5 extends C166227vN {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(12);
    public Set A00;

    public C167847z5(Parcel parcel) {
        super(parcel);
        int readInt = parcel.readInt();
        this.A00 = C36441kJ.A16();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Collections.addAll(this.A00, strArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00.size());
        Set set = this.A00;
        parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
    }

    public C167847z5(Parcelable parcelable) {
        super(parcelable);
    }
}
