package X;

import com.whatsapp.util.Log;

/* renamed from: X.6Rw  reason: invalid class name and case insensitive filesystem */
public class C132036Rw {
    public final AnonymousClass1VC A00;
    public final C21430zE A01;

    public static String A00(float f) {
        return f > 86400.0f ? "P1D-P1Y" : f > 360.0f ? "PT6M-P1D" : f > 300.0f ? "PT5M-PT6M" : f > 1.0f ? "PT1S-PT5M" : "PT0S-PT1S";
    }

    public static void A01(C132036Rw r3, String str, String str2) {
        if (!r3.A00.A01.A0E(6076)) {
            Log.w("emitFailure suppressed");
            return;
        }
        C21430zE r32 = r3.A01;
        r32.markerStart(494345136);
        r32.markerAnnotate(494345136, "is_success", false);
        r32.markerAnnotate(494345136, "failure_type", str);
        if (str2 != null) {
            r32.markerAnnotate(494345136, "failure_payload", str2);
        }
        r32.markerEnd(494345136, 2);
    }

    public C132036Rw(AnonymousClass1VC r1, C21430zE r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
