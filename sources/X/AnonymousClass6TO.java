package X;

import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.6TO  reason: invalid class name */
public final class AnonymousClass6TO {
    public static final C18950u5 A09 = new C18950u5(20, 1000);
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A04;
    public final AnonymousClass1RU A05;
    public final C19420v0 A06;
    public final C19970wo A07;
    public final C21010yW A08;

    public final void A01(Intent intent) {
        StringBuilder A0v;
        String obj;
        AnonymousClass00C.A0D(intent, 0);
        int intExtra = intent.getIntExtra("source", 0);
        this.A01 = intExtra;
        if (intExtra == 0) {
            obj = "AccountSwitchingLogger/cacheAccountSwitchingEventData/invalid source";
        } else {
            if (intent.getBooleanExtra("is_success", false)) {
                Log.i("AccountSwitchingLogger/cacheAccountSwitchingEventData/success action");
                this.A04 = true;
                this.A02 = (long) intent.getIntExtra("inactive_account_num_pending_message_notifs", 0);
                long longExtra = intent.getLongExtra("switching_start_time_ms", 0);
                this.A03 = longExtra;
                A0v = AnonymousClass000.A0v("AccountSwitchingLogger/cacheAccountSwitchingEventData/source:");
                A0v.append(this.A01);
                A0v.append(", numPendingMessageNotifs:");
                A0v.append(this.A02);
                A0v.append(", startTimeMs:");
                A0v.append(longExtra);
            } else {
                Log.i("AccountSwitchingLogger/cacheAccountSwitchingEventData/failed action");
                this.A04 = false;
                int i = 8;
                if (intent.getIntExtra("request_type", 0) == 1) {
                    i = 5;
                }
                this.A00 = i;
                A0v = AnonymousClass000.A0v("AccountSwitchingLogger/cacheAccountSwitchingEventData/source:");
                A0v.append(this.A01);
                A0v.append(", action:");
                A0v.append(i);
            }
            obj = A0v.toString();
        }
        Log.i(obj);
    }

    public final void A02(Boolean bool, int i, int i2) {
        if (i != 0) {
            AnonymousClass584 r1 = new AnonymousClass584();
            r1.A02 = Integer.valueOf(i);
            r1.A01 = Integer.valueOf(i2);
            AnonymousClass584.A00(this, r1);
            r1.A00 = bool;
            A00(this, r1);
            return;
        }
        Log.i("AccountSwitchingLogger/populateAndLogAccountSwitchingAction/action or source is invalid");
    }

    public AnonymousClass6TO(AnonymousClass1RU r1, C19970wo r2, C19420v0 r3, C21010yW r4) {
        C36321k7.A18(r2, r4, r1, r3);
        this.A07 = r2;
        this.A08 = r4;
        this.A05 = r1;
        this.A06 = r3;
    }

    public static final void A00(AnonymousClass6TO r3, AnonymousClass584 r4) {
        Integer num;
        C36321k7.A1K(r4, "AccountSwitchingLogger/", AnonymousClass000.A0u());
        Integer num2 = r4.A02;
        if (num2 == null || num2.intValue() != 3 || (num = r4.A01) == null || num.intValue() != 15) {
            r3.A08.Bly(r4);
        } else {
            r3.A08.Bls(r4, A09, false);
        }
        r3.A03 = 0;
        r3.A04 = false;
        r3.A02 = 0;
        r3.A01 = 0;
        r3.A00 = 0;
    }
}
