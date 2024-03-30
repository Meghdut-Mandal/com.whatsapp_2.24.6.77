package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.8e2  reason: invalid class name and case insensitive filesystem */
public final class C177588e2 extends Jid implements Parcelable {
    public static final C177588e2 A00 = new C177588e2();
    public static final Parcelable.Creator CREATOR = new C205789sD();

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "s.whatsapp.net";
    }

    public int getType() {
        return 13;
    }

    public C177588e2() {
        super("");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C165567td.A0m(parcel);
    }
}
