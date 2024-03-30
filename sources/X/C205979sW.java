package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.9sW  reason: invalid class name and case insensitive filesystem */
public final class C205979sW implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A14;
        C188008yt valueOf = C188008yt.valueOf(C36341k9.A0g(parcel));
        Object obj = null;
        if (parcel.readInt() == 0) {
            A14 = null;
        } else {
            int readInt = parcel.readInt();
            A14 = C36441kJ.A14(readInt);
            int i = 0;
            while (i != readInt) {
                i = C90504aG.A0A(parcel, C206639tj.CREATOR, A14, i);
            }
        }
        if (parcel.readInt() != 0) {
            obj = C206479tT.CREATOR.createFromParcel(parcel);
        }
        return new C206649tk((C206479tT) obj, valueOf, A14);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C206649tk[i];
    }
}
