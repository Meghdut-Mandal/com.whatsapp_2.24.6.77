package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.8e0  reason: invalid class name and case insensitive filesystem */
public final class C177568e0 extends Jid implements Parcelable {
    public static final C177568e0 A00 = new C177568e0();
    public static final Parcelable.Creator CREATOR = new C205769sB();

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "call";
    }

    public int getType() {
        return 20;
    }

    public C177568e0() {
        super("");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C165567td.A0m(parcel);
    }
}
