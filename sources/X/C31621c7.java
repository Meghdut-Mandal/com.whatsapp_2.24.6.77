package X;

import android.content.SharedPreferences;

/* renamed from: X.1c7  reason: invalid class name and case insensitive filesystem */
public class C31621c7 {
    public long A00 = 0;
    public long A01 = 0;
    public final C19970wo A02;
    public final C19420v0 A03;
    public final C20810yC A04;

    public synchronized void A01(long j) {
        this.A00 = j;
        this.A01 = 0;
    }

    public synchronized void A02(String str) {
        C19420v0 r3 = this.A03;
        AnonymousClass3PV A002 = AnonymousClass3PV.A00(((SharedPreferences) r3.A00.get()).getString("companion_reg_with_link_code_companion_hello_info_json", (String) null));
        if (A002 != null && A002.A02.equals(str)) {
            C19420v0.A00(r3).remove("companion_reg_with_link_code_companion_hello_info_json").apply();
        }
    }

    public AnonymousClass3PV A00() {
        AnonymousClass3PV A002 = AnonymousClass3PV.A00(((SharedPreferences) this.A03.A00.get()).getString("companion_reg_with_link_code_companion_hello_info_json", (String) null));
        if (A002 != null) {
            long j = A002.A00;
            if (j >= C19970wo.A00(this.A02)) {
                return A002;
            }
            A01(j);
        }
        return null;
    }

    public C31621c7(C19970wo r3, C19420v0 r4, C20810yC r5) {
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }
}
