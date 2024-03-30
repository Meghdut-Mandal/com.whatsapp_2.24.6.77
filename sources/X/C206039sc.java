package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.9sc  reason: invalid class name and case insensitive filesystem */
public final class C206039sc implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C36411kG.A02(parcel);
        ArrayList A14 = C36441kJ.A14(A02);
        int i = 0;
        while (i != A02) {
            i = C90504aG.A0A(parcel, C207219uk.CREATOR, A14, i);
        }
        return new C206489tU(A14);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C206489tU[i];
    }
}
