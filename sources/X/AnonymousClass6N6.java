package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.util.Log;
import java.security.SecureRandom;
import java.util.List;

/* renamed from: X.6N6  reason: invalid class name */
public final class AnonymousClass6N6 {
    public final C19420v0 A00;
    public final SecureRandom A01;
    public final C21060yb A02;
    public final C20810yC A03;
    public final C21010yW A04;

    private final Integer A00() {
        ActivityManager A042 = this.A02.A04();
        if (A042 == null) {
            Log.e("UnfinishedCallEventUploader/getProcessExitReason: could not get activity manager");
            return null;
        }
        List historicalProcessExitReasons = A042.getHistoricalProcessExitReasons((String) null, 0, 1);
        AnonymousClass00C.A08(historicalProcessExitReasons);
        if (historicalProcessExitReasons.isEmpty()) {
            return null;
        }
        return Integer.valueOf(((ApplicationExitInfo) C007103b.A0L(historicalProcessExitReasons)).getReason());
    }

    public final void A01(boolean z, boolean z2, boolean z3, boolean z4) {
        Integer num;
        int i;
        if (this.A03.A07(6454) > 0 && !z) {
            AnonymousClass005 r4 = this.A00.A00;
            SharedPreferences A0H = C36391kE.A0H(r4);
            AnonymousClass00I A0W = C36441kJ.A0W(A0H.getString("voip_call_id", (String) null), A0H.getString("session_id_for_voip_call_id", (String) null));
            if (A0W.A00 != null && !TextUtils.equals(C21870zw.A00, (CharSequence) A0W.A01)) {
                WamCall wamCall = new WamCall();
                wamCall.callTestBucket = C36391kE.A0H(r4).getString("voip_call_ab_test_bucket", (String) null);
                byte[] bArr = new byte[16];
                this.A01.nextBytes(bArr);
                wamCall.callRandomId = AnonymousClass02R.A0A(C155767Xi.A00, bArr);
                if (Build.VERSION.SDK_INT < 30 || (num = A00()) == null) {
                    if (z2) {
                        i = 4;
                    } else if (z3) {
                        i = 5;
                    } else {
                        i = 0;
                        if (z4) {
                            i = 6;
                        }
                    }
                    num = Integer.valueOf(i);
                }
                wamCall.appExitReason = num;
                this.A04.Blz(wamCall, 1);
            }
        }
    }

    public AnonymousClass6N6(C21060yb r1, C19420v0 r2, C20810yC r3, C21010yW r4, SecureRandom secureRandom) {
        C36321k7.A1B(r3, r4, secureRandom, r1, r2);
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = secureRandom;
        this.A02 = r1;
        this.A00 = r2;
    }
}
