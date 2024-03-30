package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.3q4  reason: invalid class name and case insensitive filesystem */
public class C77173q4 implements C161247mR {
    public final AnonymousClass3KW A00;

    public void BJc(String str, Map map) {
        String A0p;
        AnonymousClass3KW r6 = this.A00;
        if (!r6.A01()) {
            A0p = "banmanager/checkIfNeedToPostBanAppealDecisionNotification not showing ban appeals notification as we cannot fetch or submit an appeal just yet";
        } else {
            String A002 = C55682v1.A00(C36371kC.A0t(C36341k9.A0E(r6.A09.A06), "support_ban_appeal_state"));
            if (!"IN_REVIEW".equals(A002)) {
                A0p = AnonymousClass000.A0p("banmanager/checkIfNeedToPostBanAppealDecisionNotification not showing ban appeals notification since ban appeal state=", A002, AnonymousClass000.A0u());
            } else {
                Log.i("banmanager/checkIfNeedToPostBanAppealDecisionNotification showing ban appeals notification");
                Context context = r6.A03.A00;
                String string = context.getString(R.string.f12nameremoved);
                String string2 = context.getString(R.string.f12nameremoved);
                String A0A = C36321k7.A0A(context, string, R.string.f12nameremoved);
                Intent A0D = C36431kI.A0D();
                A0D.setClassName(context.getPackageName(), "com.whatsapp.userban.ui.BanAppealActivity");
                A0D.putExtra("launch_source", 4);
                C07700Yy A02 = C20600xp.A02(context);
                A02.A0M = "critical_app_alerts@1";
                A02.A09 = 1;
                A02.A0G(A0A);
                A02.A06(3);
                C36361kB.A1B(A02, string, string2, true);
                C36341k9.A14(A02, string2);
                A02.A0D = C65743Th.A03(context, A0D, 0);
                C36361kB.A1A(A02);
                r6.A04.A02(42, A02.A05());
                return;
            }
        }
        Log.w(A0p);
    }

    public boolean BtD(C1267065d r2, Long l, String str) {
        return "ban_appeals".equals(str);
    }

    public C77173q4(AnonymousClass3KW r1) {
        this.A00 = r1;
    }
}
