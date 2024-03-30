package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.2jL  reason: invalid class name and case insensitive filesystem */
public final class C49572jL extends C132446Tt {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass1RU A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C49572jL(Context context, AnonymousClass1RU r2, String str, String str2, int i, boolean z) {
        this.A02 = r2;
        this.A03 = str;
        this.A01 = context;
        this.A05 = z;
        this.A00 = i;
        this.A04 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r1 == -1) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r5) {
        /*
            r4 = this;
            X.1RU r0 = r4.A02
            X.005 r0 = r0.A0D
            java.lang.Object r0 = r0.get()
            X.1Z0 r0 = (X.AnonymousClass1Z0) r0
            java.lang.String r3 = r4.A03
            X.6C2 r0 = X.AnonymousClass1Z0.A00(r0)
            java.util.List r0 = r0.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x0016:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3KU r0 = (X.AnonymousClass3KU) r0
            java.lang.String r0 = r0.A08
            boolean r0 = X.AnonymousClass00C.A0J(r0, r3)
            if (r0 == 0) goto L_0x0016
        L_0x002b:
            X.3KU r1 = (X.AnonymousClass3KU) r1
            r0 = -1
            if (r1 == 0) goto L_0x003e
            int r1 = r1.A01
            if (r1 != r0) goto L_0x0039
        L_0x0034:
            java.lang.String r0 = "AccountSwitchingDataRepo/getInactivePushMessageCount/Account doesn't exists"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0039:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x003e:
            r1 = -1
            goto L_0x0034
        L_0x0040:
            r1 = 0
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49572jL.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        int A0I = AnonymousClass000.A0I(obj);
        AnonymousClass1RU r5 = this.A02;
        Log.i("AccountSwitcher/clearExistingNotifications");
        r5.A08.A03(57, "clearNotificationsBeforeAccountSwitching");
        Context context = this.A01;
        String str = this.A03;
        boolean z = this.A05;
        int i = this.A00;
        String str2 = this.A04;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String A012 = r5.A0A.A01();
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(context.getPackageName(), "com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity");
        A0D.putExtra("request_type", 2);
        A0D.putExtra("switch_to_account_lid", str);
        A0D.putExtra("is_missed_call_notification", z);
        A0D.putExtra("source", i);
        A0D.putExtra("inactive_account_num_pending_message_notifs", A0I);
        A0D.putExtra("switching_start_time_ms", elapsedRealtime);
        if (!TextUtils.isEmpty(str2)) {
            A0D.putExtra("account_switching_sender_jid", str2);
        }
        if (!TextUtils.isEmpty(A012)) {
            A0D.putExtra("account_language", A012);
        }
        A0D.addFlags(268468224);
        AnonymousClass1RU.A02(context, A0D, r5);
    }
}
