package X;

import android.content.SharedPreferences;
import java.util.UUID;

/* renamed from: X.1Vf  reason: invalid class name and case insensitive filesystem */
public class C29071Vf implements C29061Ve {
    public final C19970wo A00;
    public final C19420v0 A01;

    public synchronized AnonymousClass61Z BFs() {
        AnonymousClass61Z r3;
        C19420v0 r32 = this.A01;
        String string = ((SharedPreferences) r32.A00.get()).getString("phoneid_id", (String) null);
        long A0V = r32.A0V("phoneid_timestamp");
        if (string == null || A0V == -1) {
            r3 = new AnonymousClass61Z(UUID.randomUUID().toString(), C19970wo.A00(this.A00));
            BrX(r3);
        } else {
            r3 = new AnonymousClass61Z(string, A0V);
        }
        return r3;
    }

    public synchronized void BrX(AnonymousClass61Z r7) {
        C19420v0 r5 = this.A01;
        String str = r7.A01;
        long j = r7.A00;
        C19420v0.A00(r5).putString("phoneid_id", str).apply();
        r5.A1h("phoneid_timestamp", j);
    }

    public C29071Vf(C19970wo r1, C19420v0 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
