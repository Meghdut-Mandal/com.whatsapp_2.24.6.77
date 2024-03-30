package X;

import android.app.Activity;
import android.os.ConditionVariable;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.54I  reason: invalid class name */
public abstract class AnonymousClass54I extends C196209Yd {
    public final C1255460h A00;

    public void A09(Activity activity, AnonymousClass3T1 r2, C206969uL r3, Class cls) {
    }

    public void A0G(Activity activity, Jid jid, C206969uL r8, String str, String str2, long j) {
        if (r8.A01 != null) {
            HashMap A0J = AnonymousClass001.A0J();
            A0J.put("commerce", A0F(activity, r8));
            C1255460h r0 = this.A00;
            r0.A00.A00(C023109s.A00, "DEFAULT_JOB_ID", "DEFAULT_NAMESPACE", A0J);
        }
    }

    public AnonymousClass54I(C1255460h r2) {
        this.A00 = r2;
        ConditionVariable conditionVariable = C18740tg.A00;
    }

    public HashMap A0F(Activity activity, C206969uL r8) {
        AnonymousClass141 contact;
        String A0J;
        HashMap A0J2 = AnonymousClass001.A0J();
        HashMap A0J3 = AnonymousClass001.A0J();
        AnonymousClass4V7 A01 = AnonymousClass3SS.A01(activity);
        if (!(A01 == null || (contact = A01.getContact()) == null)) {
            String A0K = contact.A0K();
            AnonymousClass141 contact2 = A01.getContact();
            if (A0K != null) {
                A0J = contact2.A0K();
            } else if (contact2.A0J() != null) {
                A0J = A01.getContact().A0J();
            }
            A0J3.put("business_name", A0J);
        }
        A0J2.put("business_info", A0J3);
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.add("address_message_validate");
        A0I.add("configure_top_bar");
        A0I.add("extension_message_response");
        A0I.add("fetch_catalog");
        A0I.add("show_error");
        A0I.add("data_exchange");
        A0J2.put("supported_actions", A0I);
        A0J2.put(A05(), C131866Qy.A01(r8.A01));
        return A0J2;
    }
}
