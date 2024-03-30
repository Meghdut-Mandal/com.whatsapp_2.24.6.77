package X;

import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.9Td  reason: invalid class name */
public abstract class AnonymousClass9Td {
    public final C21700zf A00;

    public void A00(Intent intent) {
        if (intent != null) {
            long longExtra = intent.getLongExtra("perf_start_time_ns", -1);
            String stringExtra = intent.getStringExtra("perf_origin");
            if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                this.A00.A0D(stringExtra, longExtra);
                return;
            }
        }
        Log.e("Expect to have origin for perf tracking.");
        this.A00.A0D("unknown", -1);
    }

    public AnonymousClass9Td(C19970wo r11, C19630wG r12, C21010yW r13, C21670zc r14, C21690ze r15, C21430zE r16, C19770wU r17, String str, int i) {
        C21700zf r0 = new C21700zf(r11, r12, r13, r14, r15, r16, r17, str, i);
        this.A00 = r0;
        r0.A04.A04 = true;
    }
}
