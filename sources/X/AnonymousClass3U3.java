package X;

import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3U3  reason: invalid class name */
public class AnonymousClass3U3 implements AnonymousClass16A {
    public Object A00;
    public final int A01;

    public AnonymousClass3U3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BSP(UserJid userJid) {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) obj;
                if (userJid.equals(C36431kI.A0l(C36341k9.A0d(contactInfoActivity))) && contactInfoActivity.A0f.A0C != null) {
                    ContactInfoActivity.A16(contactInfoActivity, false, false);
                    return;
                }
                return;
            case 1:
                AnonymousClass28d r1 = (AnonymousClass28d) obj;
                if (userJid != null && userJid.equals(r1.A0e)) {
                    r1.A0H();
                    return;
                }
                return;
            default:
                C70803fk r12 = (C70803fk) obj;
                if (userJid != null && userJid.equals(r12.A45)) {
                    r12.A2t.A0T();
                    r12.A2l.invalidateOptionsMenu();
                    C167497y9 r0 = r12.A1r;
                    if (r0 != null) {
                        r0.A0T();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ void BSM(UserJid userJid) {
    }
}
