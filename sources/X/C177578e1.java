package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.8e1  reason: invalid class name and case insensitive filesystem */
public final class C177578e1 extends Jid implements Parcelable {
    public static final C177578e1 A00 = new C177578e1();
    public static final Parcelable.Creator CREATOR = new C205779sC();

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "g.us";
    }

    public int getType() {
        return 16;
    }

    public C177578e1() {
        super("");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C165567td.A0m(parcel);
    }
}
