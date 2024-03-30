package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.3q5  reason: invalid class name and case insensitive filesystem */
public final class C77183q5 implements C161247mR {
    public final C64703Pc A00;

    public C77183q5(C64703Pc r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BJc(String str, Map map) {
        Map map2 = map;
        AnonymousClass00C.A0D(map2, 1);
        AnonymousClass3TI.A01("WfacBanIncomingPushObserver/handleIncomingPushMessage");
        Object obj = map2.get("push_payload");
        if (obj != null && (obj instanceof AnonymousClass5JL)) {
            AnonymousClass5JL r2 = (AnonymousClass5JL) obj;
            if (AnonymousClass00C.A0J(r2.A00, "wfac_ban")) {
                C64703Pc r6 = this.A00;
                String str2 = r2.A02;
                C62273Fm r5 = r6.A07;
                r5.A01("ban_decision_received", -1, 4);
                String str3 = "banned";
                if (!AnonymousClass00C.A0J(str2, str3)) {
                    if (AnonymousClass00C.A0J(str2, "unbanned")) {
                        str3 = "unbanned";
                    } else {
                        str3 = "other";
                    }
                }
                r5.A00(str3, -1, 4);
                String A002 = r6.A06.A00();
                boolean equals = "CHECKPOINTED".equals(A002);
                StringBuilder A0u = AnonymousClass000.A0u();
                if (!equals) {
                    AnonymousClass3TI.A01(AnonymousClass000.A0p("WfacManager/maybePostBanDecisionNotification not showing ban decision notification since ban state = ", A002, A0u));
                    return;
                }
                A0u.append("WfacManager/maybePostBanDecisionNotification showing underage ban notification for decision [");
                A0u.append(str2);
                AnonymousClass3TI.A01(AnonymousClass000.A0t(A0u, ']'));
                Context context = r6.A02.A00;
                AnonymousClass00C.A08(context);
                String A0m = C36361kB.A0m(context, R.string.f12nameremoved);
                String A0m2 = C36361kB.A0m(context, R.string.f12nameremoved);
                String A0x = C36351kA.A0x(context, A0m, AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
                Intent A003 = C64703Pc.A00(context, (String) null, (String) null, str2, 14, -1, 4);
                C07700Yy A02 = C20600xp.A02(context);
                A02.A0M = "critical_app_alerts@1";
                A02.A09 = 1;
                A02.A0G(A0x);
                A02.A06(3);
                C36361kB.A1B(A02, A0m, A0m2, true);
                C36341k9.A14(A02, A0m2);
                A02.A0D = C65743Th.A03(context, A003, 0);
                C36361kB.A1A(A02);
                r6.A03.A02(76, A02.A05());
                r5.A01("notification_shown", -1, 4);
            }
        }
    }

    public boolean BtD(C1267065d r3, Long l, String str) {
        AnonymousClass3TI.A01("WfacBanIncomingPushObserver/shouldHandlePush");
        if (r3 == null || !AnonymousClass00C.A0J(r3.A00(), "wfac_ban")) {
            return false;
        }
        return true;
    }
}
