package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.13t  reason: invalid class name and case insensitive filesystem */
public final class C223013t implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        Parcelable.Creator creator = PhoneUserJid.CREATOR;
        return new PhoneUserJid(parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PhoneUserJid[i];
    }
}
