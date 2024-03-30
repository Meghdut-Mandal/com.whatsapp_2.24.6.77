package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* renamed from: X.9u4  reason: invalid class name and case insensitive filesystem */
public class C206829u4 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(28);
    public HashMap A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A00);
    }

    public C206829u4(Parcel parcel) {
        HashMap hashMap = (HashMap) parcel.readSerializable();
        this.A00 = hashMap == null ? AnonymousClass001.A0J() : hashMap;
    }

    public C206829u4() {
        this.A00 = AnonymousClass001.A0J();
    }
}
