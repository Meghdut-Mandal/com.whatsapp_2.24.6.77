package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.3Wi  reason: invalid class name and case insensitive filesystem */
public final class C66533Wi implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C36411kG.A02(parcel);
        int readInt = parcel.readInt();
        ArrayList A14 = C36441kJ.A14(readInt);
        for (int i = 0; i != readInt; i++) {
            A14.add(C36411kG.A0H(parcel, AnonymousClass3XT.class));
        }
        int readInt2 = parcel.readInt();
        ArrayList A142 = C36441kJ.A14(readInt2);
        for (int i2 = 0; i2 != readInt2; i2++) {
            A142.add(C36411kG.A0H(parcel, AnonymousClass3XT.class));
        }
        return new AnonymousClass3XT(A14, A142, A02, AnonymousClass000.A1P(parcel.readInt()), AnonymousClass000.A1P(parcel.readInt()));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass3XT[i];
    }
}
