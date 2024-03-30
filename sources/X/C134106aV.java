package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6aV  reason: invalid class name and case insensitive filesystem */
public final class C134106aV implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        AnonymousClass00C.A0D(parcel, 0);
        String A0u = C90514aH.A0u(parcel);
        AnonymousClass00C.A08(A0u);
        String A0u2 = C90514aH.A0u(parcel);
        AnonymousClass00C.A08(A0u2);
        String A0u3 = C90514aH.A0u(parcel);
        AnonymousClass00C.A08(A0u3);
        byte readByte = parcel.readByte();
        Byte valueOf = Byte.valueOf(readByte);
        C18740tg.A06(valueOf);
        if (valueOf != null && readByte == 0) {
            z = true;
        }
        String A0u4 = C90514aH.A0u(parcel);
        AnonymousClass00C.A08(A0u4);
        return new C134806bd(A0u, A0u2, A0u3, A0u4, !z);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134806bd[i];
    }
}
