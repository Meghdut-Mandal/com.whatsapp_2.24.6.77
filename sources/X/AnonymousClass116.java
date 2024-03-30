package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallParticipant;

/* renamed from: X.116  reason: invalid class name */
public final class AnonymousClass116 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        return new CallParticipant((UserJid) parcel.readParcelable(CallParticipant.class.getClassLoader()), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CallParticipant[i];
    }
}
