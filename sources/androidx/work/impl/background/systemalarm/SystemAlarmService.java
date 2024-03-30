package androidx.work.impl.background.systemalarm;

import X.AnonymousClass6VD;
import X.C138816ik;
import X.C157117br;
import X.C90744ah;
import android.content.Intent;
import android.util.Log;

public class SystemAlarmService extends C90744ah implements C157117br {
    public static final String A02 = AnonymousClass6VD.A01("SystemAlarmService");
    public C138816ik A00;
    public boolean A01;

    public void onCreate() {
        super.onCreate();
        C138816ik r1 = new C138816ik(this);
        this.A00 = r1;
        if (r1.A02 != null) {
            AnonymousClass6VD.A00();
            Log.e(C138816ik.A0A, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            r1.A02 = this;
        }
        this.A01 = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A01 = true;
        C138816ik r3 = this.A00;
        AnonymousClass6VD.A00().A04(C138816ik.A0A, "Destroying SystemAlarmDispatcher");
        r3.A04.A03(r3);
        r3.A02 = null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.A01) {
            AnonymousClass6VD.A00();
            Log.i(A02, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            C138816ik r3 = this.A00;
            AnonymousClass6VD A002 = AnonymousClass6VD.A00();
            String str = C138816ik.A0A;
            A002.A04(str, "Destroying SystemAlarmDispatcher");
            r3.A04.A03(r3);
            r3.A02 = null;
            C138816ik r1 = new C138816ik(this);
            this.A00 = r1;
            if (r1.A02 != null) {
                AnonymousClass6VD.A00();
                Log.e(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                r1.A02 = this;
            }
            this.A01 = false;
        }
        if (intent == null) {
            return 3;
        }
        this.A00.A02(intent, i2);
        return 3;
    }
}
