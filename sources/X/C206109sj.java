package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.9sj  reason: invalid class name and case insensitive filesystem */
public final class C206109sj implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C36411kG.A02(parcel);
        ArrayList A14 = C36441kJ.A14(A02);
        int i = 0;
        while (i != A02) {
            i = C90504aG.A0A(parcel, C206579td.CREATOR, A14, i);
        }
        return new C206819u1((UserJid) C36411kG.A0H(parcel, C206819u1.class), (C206669tm) C206669tm.CREATOR.createFromParcel(parcel), A14);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C206819u1[i];
    }
}
