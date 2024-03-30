package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.6az  reason: invalid class name and case insensitive filesystem */
public final class C134406az implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AnonymousClass1AL((Jid) C36411kG.A0H(parcel, AnonymousClass1AL.class), C36341k9.A0g(parcel), parcel.readString(), parcel.readByte());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass1AL[i];
    }
}
