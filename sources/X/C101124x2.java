package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import com.whatsapp.workers.ntp.NtpSyncWorker;

/* renamed from: X.4x2  reason: invalid class name and case insensitive filesystem */
public class C101124x2 extends C129096Ez {
    public final C21060yb A00;
    public final C20810yC A01;
    public final AnonymousClass636 A02;
    public final C19970wo A03;
    public final C19630wG A04;
    public final C221112x A05;

    public C101124x2(Context context, C21060yb r2, C19970wo r3, C19630wG r4, C221112x r5, C20810yC r6, AnonymousClass636 r7) {
        super(context);
        this.A03 = r3;
        this.A01 = r6;
        this.A05 = r5;
        this.A04 = r4;
        this.A00 = r2;
        this.A02 = r7;
    }

    public static void A00(Intent intent, C101124x2 r6) {
        PowerManager.WakeLock wakeLock;
        C36321k7.A1K(intent, "NtpAction#updateNtp; intent=", AnonymousClass000.A0u());
        PowerManager A0G = r6.A00.A0G();
        if (A0G == null) {
            Log.w("NtpAction/updateNtp pm=null");
            wakeLock = null;
        } else {
            wakeLock = C111765co.A00(A0G, "NtpAction#updateNtp", 1);
            wakeLock.setReferenceCounted(false);
            wakeLock.acquire(300000);
        }
        try {
            NtpSyncWorker.A00(r6.A04.A00, r6.A03, r6.A05, r6.A01, r6.A02);
        } finally {
            if (wakeLock != null) {
                wakeLock.release();
            }
        }
    }
}
