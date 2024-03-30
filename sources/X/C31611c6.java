package X;

import android.content.SharedPreferences;
import com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1c6  reason: invalid class name and case insensitive filesystem */
public class C31611c6 extends C19580wB {
    public Map A00 = new HashMap();
    public final C31631c8 A01;
    public final C31641c9 A02;
    public final C31621c7 A03;
    public final C19970wo A04;
    public final C19420v0 A05;
    public final AnonymousClass189 A06;
    public final AnonymousClass19A A07;

    public C31611c6(C31631c8 r2, C31641c9 r3, C31621c7 r4, C19970wo r5, C19420v0 r6, AnonymousClass189 r7, AnonymousClass19A r8) {
        this.A04 = r5;
        this.A07 = r8;
        this.A06 = r7;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static void A00(C31611c6 r4) {
        for (AnonymousClass3N1 r3 : r4.getObservers()) {
            r3.A00.runOnUiThread(new C81093wS((Object) r3, 42));
        }
    }

    public static void A01(C31611c6 r4, String str, String str2) {
        for (AnonymousClass3N1 r3 : r4.getObservers()) {
            LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity = r3.A00;
            linkedDevicesEnterCodeActivity.A04.A01(9, str, str2);
            linkedDevicesEnterCodeActivity.runOnUiThread(new C81093wS((Object) r3, 43));
        }
    }

    public static void A02(C31611c6 r13, String str, String str2) {
        long j;
        long j2;
        int i;
        for (AnonymousClass3N1 r6 : r13.getObservers()) {
            LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity = r6.A00;
            C19420v0 r3 = linkedDevicesEnterCodeActivity.A09;
            int i2 = ((SharedPreferences) r3.A00.get()).getInt("companion_reg_with_link_code_retry_count", 0) + 1;
            C19420v0.A00(r3).putInt("companion_reg_with_link_code_retry_count", i2).apply();
            if (i2 >= 3) {
                Log.w("LinkedDevicesEnterCodeActivity/companionRegWithLinkCodeObserver/onLinkCodeIsWrong retry limit is exceeded");
                C19420v0.A00(linkedDevicesEnterCodeActivity.A09).remove("companion_reg_with_link_code_retry_count").apply();
                linkedDevicesEnterCodeActivity.A04.Boy(new AnonymousClass751(36, str, r6));
                new C76843pX(linkedDevicesEnterCodeActivity.A0E).A00(str, (String) null);
            }
            C31641c9 r9 = linkedDevicesEnterCodeActivity.A04;
            long A002 = C19970wo.A00(r9.A03);
            C31621c7 r10 = r9.A02;
            synchronized (r10) {
                j = r10.A00;
                r10.A00 = 0;
            }
            if (j + 180000 > A002) {
                i = 15;
            } else {
                synchronized (r10) {
                    j2 = r10.A01;
                    r10.A01 = 0;
                }
                int i3 = ((j2 + 180000) > A002 ? 1 : ((j2 + 180000) == A002 ? 0 : -1));
                i = 8;
                if (i3 > 0) {
                    i = 16;
                }
            }
            r9.A01(i, str, str2);
            linkedDevicesEnterCodeActivity.runOnUiThread(new C81093wS((Object) r6, 44));
        }
    }
}
