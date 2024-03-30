package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9s5  reason: invalid class name and case insensitive filesystem */
public final class C205709s5 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        Parcelable.Creator creator = C177558dz.CREATOR;
        return new C177558dz((UserJid) C36411kG.A0H(parcel, C177558dz.class), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C177558dz[i];
    }
}
