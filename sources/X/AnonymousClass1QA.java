package X;

import android.app.PendingIntent;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.1QA  reason: invalid class name */
public class AnonymousClass1QA {
    public String A00 = "";
    public final C19630wG A01;
    public final C25271Fq A02;

    public void A00(String str) {
        A01(this.A01.A01(R.string.f12nameremoved), str, 2, false);
    }

    public void A01(String str, String str2, int i, boolean z) {
        boolean equals;
        Log.i("errorreporter/reporterror");
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(i);
            String A04 = C18750th.A04(sb.toString());
            if (A04 == null) {
                A04 = "invalid";
            }
            equals = this.A00.equals(A04);
            if (!equals) {
                this.A00 = A04;
            }
        }
        if (equals) {
            Log.e("Same as the last shown notification; skipping");
            return;
        }
        Context context = this.A01.A00;
        PendingIntent A002 = C65743Th.A00(context, 1, AnonymousClass190.A09(context), 0);
        C07700Yy A022 = C20600xp.A02(context);
        A022.A0M = "critical_app_alerts@1";
        A022.A0L = "err";
        A022.A09 = 1;
        A022.A0G(str);
        A022.A0F(str);
        A022.A0E(str2);
        A022.A0X = z;
        A022.A0D = A002;
        A022.A0B.icon = R.drawable.notifybar_error;
        A022.A0A = 1;
        this.A02.A02(i, A022.A05());
    }

    public AnonymousClass1QA(C19630wG r2, C25271Fq r3) {
        this.A01 = r2;
        this.A02 = r3;
    }
}
