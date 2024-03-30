package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.0Jp  reason: invalid class name and case insensitive filesystem */
public final class C04190Jp extends C04270Jz {
    public final String A07() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    public final String A08() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    public final boolean A0D() {
        return true;
    }

    public final int BEG() {
        return 12451000;
    }

    public C04190Jp(Context context, Looper looper, C17080qg r10, C16810q8 r11, AnonymousClass0TT r12) {
        super(context, looper, r10, r11, r12, 126);
    }

    public final /* bridge */ /* synthetic */ IInterface A05(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (!(queryLocalInterface instanceof AnonymousClass0LW)) {
            return new AnonymousClass0LW(iBinder);
        }
        return queryLocalInterface;
    }

    public final C04520Ky[] A0F() {
        return AnonymousClass0S1.A04;
    }
}
