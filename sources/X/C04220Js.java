package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.0Js  reason: invalid class name and case insensitive filesystem */
public final class C04220Js extends C04270Jz {
    public final String A07() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    public final String A08() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    public final boolean A0D() {
        return true;
    }

    public final C04520Ky[] A0F() {
        return new C04520Ky[]{AnonymousClass0SD.A07, AnonymousClass0SD.A06};
    }

    public final int BEG() {
        return 13000000;
    }

    public C04220Js(Context context, Looper looper, C17610rh r10, C17620ri r11, AnonymousClass0TT r12) {
        super(context, looper, r10, r11, r12, 148);
    }

    public final /* synthetic */ IInterface A05(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        if (!(queryLocalInterface instanceof AnonymousClass0MT)) {
            return new AnonymousClass0MT(iBinder);
        }
        return queryLocalInterface;
    }

    public final Bundle A03() {
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return A07;
    }
}
