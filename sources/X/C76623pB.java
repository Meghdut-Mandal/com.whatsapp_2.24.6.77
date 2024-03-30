package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.3pB  reason: invalid class name and case insensitive filesystem */
public class C76623pB implements C236119d {
    public final C602036w A00;
    public final AnonymousClass19A A01;
    public final AnonymousClass17Y A02;

    public void BVN(String str) {
        Log.e("ChatSupportTicketProtocolHelper/onDeliveryFailure");
        AnonymousClass17Y r3 = this.A02;
        C602036w r2 = this.A00;
        Objects.requireNonNull(r2);
        r3.Bp3(new C80253v6(r2, 27));
    }

    public void BiM(C203399nx r6, String str) {
        AnonymousClass17Y r2;
        Runnable runnable;
        String str2;
        C203399nx A0c = r6.A0c(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        AnonymousClass11F r4 = null;
        if (A0c != null) {
            C203399nx A0c2 = A0c.A0c("ticket_id");
            if (A0c2 != null) {
                str2 = A0c2.A0e();
            } else {
                str2 = null;
            }
            C203399nx A0c3 = A0c.A0c("group_jid");
            if (A0c3 != null) {
                try {
                    GroupJid A022 = GroupJid.Companion.A02(A0c3.A0e());
                    r4 = A022 == null ? C222713q.A01(A0c3.A0e()) : A022;
                } catch (C19740wR unused) {
                    Log.e("ChatSupportTicketProtocolHelper/onSuccess called with invalid jid");
                }
            }
            if (str2 != null) {
                C36321k7.A1Q("ChatSupportTicketProtocolHelper/onSuccess called, ticketId=", str2, AnonymousClass000.A0u());
                r2 = this.A02;
                runnable = new C1502274l(this, r4, str2, 49);
                r2.Bp3(runnable);
            }
        }
        Log.e("ChatSupportTicketProtocolHelper/onSuccess called but ticketId is null, posting an error");
        r2 = this.A02;
        runnable = new C80253v6(this, 28);
        r2.Bp3(runnable);
    }

    public C76623pB(AnonymousClass17Y r1, C602036w r2, AnonymousClass19A r3) {
        this.A02 = r1;
        this.A01 = r3;
        this.A00 = r2;
    }

    public void BWw(C203399nx r5, String str) {
        C36321k7.A1J(r5, "ChatSupportTicketProtocolHelper/onError: error response:", AnonymousClass000.A0u());
        C203399nx A0c = r5.A0c("error");
        if (A0c != null) {
            this.A02.Bp3(new C81283wl((Object) this, A0c.A0S("code", 0), 38));
        }
    }
}
