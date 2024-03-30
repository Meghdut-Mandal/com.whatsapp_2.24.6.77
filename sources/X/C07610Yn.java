package X;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;

@Deprecated
/* renamed from: X.0Yn  reason: invalid class name and case insensitive filesystem */
public class C07610Yn {
    public final Context A00;

    public static C03250Du A02(C06640Ul r1) {
        return new C03250Du(r1);
    }

    public void A04(C06640Ul r5, AnonymousClass0Y0 r6, C02680Bk r7) {
        FingerprintManager A01;
        CancellationSignal cancellationSignal;
        if (Build.VERSION.SDK_INT >= 23 && (A01 = A01(this.A00)) != null) {
            if (r7 != null) {
                cancellationSignal = (CancellationSignal) r7.A02();
            } else {
                cancellationSignal = null;
            }
            C07660Yt.A04(cancellationSignal, A01, A00(r6), A02(r5));
        }
    }

    public boolean A05() {
        FingerprintManager A01;
        if (Build.VERSION.SDK_INT < 23 || (A01 = A01(this.A00)) == null || !C07660Yt.A05(A01)) {
            return false;
        }
        return true;
    }

    public boolean A06() {
        FingerprintManager A01;
        if (Build.VERSION.SDK_INT < 23 || (A01 = A01(this.A00)) == null || !C07660Yt.A06(A01)) {
            return false;
        }
        return true;
    }

    public C07610Yn(Context context) {
        this.A00 = context;
    }

    public static FingerprintManager.CryptoObject A00(AnonymousClass0Y0 r0) {
        return C07660Yt.A00(r0);
    }

    public static FingerprintManager A01(Context context) {
        return C07660Yt.A02(context);
    }

    public static AnonymousClass0Y0 A03(FingerprintManager.CryptoObject cryptoObject) {
        return C07660Yt.A03(cryptoObject);
    }
}
