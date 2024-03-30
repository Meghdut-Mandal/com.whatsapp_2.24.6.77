package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0KK  reason: invalid class name */
public class AnonymousClass0KK extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08600b0();
    public final String A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0KK)) {
            return false;
        }
        return this.A00.equals(((AnonymousClass0KK) obj).A00);
    }

    public AnonymousClass0KK(String str) {
        AnonymousClass006.A01(str);
        this.A00 = str;
    }

    public int hashCode() {
        return AnonymousClass000.A0K(this.A00, AnonymousClass001.A0L());
    }

    public void writeToParcel(Parcel parcel, int i) {
        C10440eF.A04(parcel, this.A00, AnonymousClass0Z9.A00(parcel));
    }
}
