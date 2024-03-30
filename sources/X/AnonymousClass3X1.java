package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.3X1  reason: invalid class name */
public final class AnonymousClass3X1 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        return new AnonymousClass3XY((UserJid) C36411kG.A0H(parcel, AnonymousClass3XY.class), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), readString, readString2, parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), readInt);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass3XY[i];
    }
}
