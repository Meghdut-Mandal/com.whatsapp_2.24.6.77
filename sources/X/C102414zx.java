package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.Jid;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.4zx  reason: invalid class name and case insensitive filesystem */
public class C102414zx extends C142266ob {
    public final C124305xw A00;

    public C102414zx(C124305xw r3) {
        super("wa.action.commerce.SendNFMReplyMessage", "wa.action.commerce.ActionWithCallback");
        this.A00 = r3;
    }

    public /* bridge */ /* synthetic */ Object B6u(AnonymousClass6MO r21, C115215iW r22, C124125xd r23) {
        Intent intent;
        Bundle extras;
        C100674vP r6 = (C100674vP) r23;
        String str = r22.A00;
        AnonymousClass6MO r3 = r21;
        if (str.equals("wa.action.commerce.SendNFMReplyMessage")) {
            List list = r3.A00;
            String A0s = C36401kF.A0s(list, 0);
            String A0i = C90474aD.A0i(list);
            Map A0k = C90494aF.A0k(list, 2);
            C124305xw r32 = this.A00;
            Activity A01 = C142326oh.A01(r6);
            if (!(A01 == null || (intent = A01.getIntent()) == null || (extras = intent.getExtras()) == null)) {
                String string = extras.getString("chat_id");
                AnonymousClass11F r9 = (AnonymousClass11F) Jid.Companion.A02(string);
                String string2 = extras.getString("message_id");
                long j = extras.getLong("message_row_id", 0);
                String string3 = extras.getString("action_name");
                String string4 = extras.getString("flow_message_version");
                if (!(r9 == null || A0i == null || A0k == null || string2 == null || string3 == null)) {
                    JSONObject jSONObject = new JSONObject(A0k);
                    AnonymousClass1X4 r8 = r32.A00;
                    if (A0s == null) {
                        A0s = "";
                    }
                    r8.A0O(r9, A0s, A0i, jSONObject.toString(), string4, j);
                    r32.A05.Boy(new AnonymousClass73K(r32, string2, string, string3, 3));
                    return null;
                }
            }
        } else if (str.equals("wa.action.commerce.ActionWithCallback")) {
            List list2 = r3.A00;
            String A0s2 = C36401kF.A0s(list2, 0);
            Map A0k2 = C90494aF.A0k(list2, 1);
            C594233w A02 = AnonymousClass6JJ.A02(r6, list2, 2);
            C124305xw r2 = this.A00;
            Activity A012 = C142326oh.A01(r6);
            C158717hx r0 = (C158717hx) r2.A06.get(A0s2);
            if (r0 != null) {
                r0.BlS(A012, A02, A0k2);
            } else {
                r2.A01.A00(A02, A0s2).A00("unsupported_action");
                return null;
            }
        }
        return null;
    }
}
