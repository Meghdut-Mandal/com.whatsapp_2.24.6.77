package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.whatsapp.R;
import com.whatsapp.registration.PreRegNotificationLearnMoreReceiver;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.3q2  reason: invalid class name and case insensitive filesystem */
public final class C77153q2 implements C161247mR {
    public final C29501Ww A00;

    public C77153q2(C29501Ww r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BJc(String str, Map map) {
        String str2;
        C29501Ww r5 = this.A00;
        if (!r5.A0M.A03()) {
            str2 = "RegistrationManager/checkIfNeedToPostPreRegistrationNotification/not-verified";
        } else {
            C19420v0 r3 = r5.A0F;
            if (C36371kC.A1U(C36341k9.A0E(r3), "chat_transfer_in_progress")) {
                str2 = "RegistrationManager/checkIfNeedToPostPreRegistrationNotification/skipped-chat-transfer-in-progress";
            } else {
                Log.i("RegistrationManager/checkIfNeedToPostPreRegistrationNotification");
                Context context = r5.A0D.A00;
                String string = context.getString(R.string.f12nameremoved);
                SharedPreferences.Editor A002 = C19420v0.A00(r3);
                A002.putBoolean("show_pre_reg_do_not_share_code_warning", true);
                A002.apply();
                C07700Yy A003 = C29501Ww.A00(r5, string, context.getString(R.string.f12nameremoved), C36391kE.A0v(context, string, new Object[1], 0, R.string.f12nameremoved));
                A003.A0Q.add(new C07250Wx(R.drawable.ic_link, context.getString(R.string.f12nameremoved), C65743Th.A01(context, 0, C36441kJ.A0H(context, PreRegNotificationLearnMoreReceiver.class), 268435456)));
                r5.A0E.A02(20, A003.A05());
                return;
            }
        }
        Log.i(str2);
    }

    public boolean BtD(C1267065d r2, Long l, String str) {
        return "PreRegistration".equalsIgnoreCase(str);
    }
}
