package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.3vi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80633vi implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C64703Pc A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C80633vi(Context context, C64703Pc r2, String str, String str2, int i) {
        this.A02 = r2;
        this.A01 = context;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = i;
    }

    public final void run() {
        C64703Pc r1 = this.A02;
        Context context = this.A01;
        String str = this.A03;
        String str2 = this.A04;
        int i = this.A00;
        if (r1.A00.A00 == null) {
            AnonymousClass3TI.A01("WfacManager/startWfacFlow/showLoginFailureNotificationIfNeeded");
            r1.A04.A0A();
            return;
        }
        AnonymousClass3TI.A01("WfacManager/startWfacFlow/launching-wfac-ban");
        Intent A002 = C64703Pc.A00(context, str, str2, (String) null, 14, i, 3);
        A002.setFlags(268468224);
        context.startActivity(A002);
    }
}
