package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.13y  reason: invalid class name and case insensitive filesystem */
public final class C223513y implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        Parcelable.Creator creator = C223413x.CREATOR;
        return new C223413x((UserJid) parcel.readParcelable(C223413x.class.getClassLoader()), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C223413x[i];
    }
}
