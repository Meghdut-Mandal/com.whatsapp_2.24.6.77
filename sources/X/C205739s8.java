package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9s8  reason: invalid class name and case insensitive filesystem */
public final class C205739s8 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        Parcelable.Creator creator = C177508du.CREATOR;
        return new C177508du((UserJid) C36411kG.A0H(parcel, C177508du.class), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C177508du[i];
    }
}
