package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.3vE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80333vE implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C30471aG A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C80333vE(C30471aG r1, String str, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = str;
    }

    public final void run() {
        C30471aG r1 = this.A01;
        int i = this.A00;
        String str = this.A02;
        C599235u r6 = (C599235u) r1.A07.get();
        Context context = r1.A00.A00;
        AnonymousClass00C.A08(context);
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(context.getPackageName(), "com.whatsapp.settings.Settings");
        A0D.putExtra("target_settings_wfal", true);
        Context context2 = r6.A00.A00;
        C07700Yy r2 = new C07700Yy(context2, "critical_app_alerts@1");
        r2.A06(3);
        C36361kB.A1B(r2, (CharSequence) null, str, true);
        C36361kB.A1A(r2);
        C36341k9.A14(r2, str);
        r2.A0D = C65743Th.A00(context2, 0, A0D, 0);
        r2.A09 = 0;
        r6.A01.A02(i, r2.A05());
    }
}
