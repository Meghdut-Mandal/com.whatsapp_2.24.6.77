package X;

import com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7sp  reason: invalid class name and case insensitive filesystem */
public class C165067sp implements C31751cK, B65 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C165067sp(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public void BYZ() {
        AnonymousClass6OE r2;
        AnonymousClass6E7 r0;
        String str;
        UserJid userJid;
        String str2;
        String str3;
        AnonymousClass185 r3;
        AnonymousClass6NP r4;
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = (PhoenixFlowsManagerWithCoroutines) obj;
            r2 = phoenixFlowsManagerWithCoroutines.A07;
            r0 = (AnonymousClass6E7) this.A00;
            str = r0.A05;
            userJid = r0.A02;
            str2 = r0.A08;
            str3 = r0.A09;
            r3 = phoenixFlowsManagerWithCoroutines.A05;
            r4 = phoenixFlowsManagerWithCoroutines.A0C;
        } else {
            C133316Xv r1 = (C133316Xv) obj;
            r2 = r1.A08;
            r0 = (AnonymousClass6E7) this.A00;
            str = r0.A05;
            userJid = r0.A02;
            str2 = r0.A08;
            str3 = r0.A09;
            r3 = r1.A06;
            r4 = r1.A0E;
        }
        r2.A02(r3, r4, userJid, Boolean.valueOf(r0.A0C), "galaxy_message", str, str2, str3, "extensions-invalid-business-profile", "Invalid Business Profile");
    }

    public void BYb(C207109uZ r14) {
        AnonymousClass6OE r2;
        AnonymousClass6E7 r1;
        String str;
        UserJid userJid;
        String str2;
        String str3;
        AnonymousClass185 r3;
        AnonymousClass6NP r4;
        if (this.A02 != 0) {
            if (r14 == null || !r14.A0Z) {
                PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = (PhoenixFlowsManagerWithCoroutines) this.A01;
                r2 = phoenixFlowsManagerWithCoroutines.A07;
                r1 = (AnonymousClass6E7) this.A00;
                str = r1.A05;
                userJid = r1.A02;
                str2 = r1.A08;
                str3 = r1.A09;
                r3 = phoenixFlowsManagerWithCoroutines.A05;
                r4 = phoenixFlowsManagerWithCoroutines.A0C;
            } else {
                return;
            }
        } else if (r14 == null || !r14.A0Z) {
            C133316Xv r0 = (C133316Xv) this.A01;
            r2 = r0.A08;
            r1 = (AnonymousClass6E7) this.A00;
            str = r1.A05;
            userJid = r1.A02;
            str2 = r1.A08;
            str3 = r1.A09;
            r3 = r0.A06;
            r4 = r0.A0E;
        } else {
            return;
        }
        r2.A02(r3, r4, userJid, Boolean.valueOf(r1.A0C), "galaxy_message", str, str2, str3, "extensions-invalid-business-profile", "Invalid Business Profile");
    }

    public void BYa() {
    }
}
