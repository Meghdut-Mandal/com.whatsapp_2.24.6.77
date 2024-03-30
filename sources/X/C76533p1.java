package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3p1  reason: invalid class name and case insensitive filesystem */
public final class C76533p1 implements C236119d {
    public final /* synthetic */ C27551Oq A00;
    public final /* synthetic */ AnonymousClass147 A01;

    public void BiM(C203399nx r13, String str) {
        AnonymousClass00C.A0D(r13, 1);
        List A0j = r13.A0d("membership_approval_requests").A0j("membership_approval_request");
        AnonymousClass00C.A08(A0j);
        AnonymousClass147 r7 = this.A01;
        ArrayList A0J = C36321k7.A0J(A0j);
        Iterator it = A0j.iterator();
        while (it.hasNext()) {
            C203399nx A0s = C36431kI.A0s(it);
            Class<UserJid> cls = UserJid.class;
            A0J.add(new AnonymousClass3JV(r7, (UserJid) A0s.A0Y(cls, "requestor"), (UserJid) A0s.A0Y(cls, "jid"), A0s.A0V("request_time", 0)));
        }
        C27551Oq r2 = this.A00;
        C80403vL.A01(r2.A01, r2, r7, A0J, 30);
    }

    public C76533p1(C27551Oq r1, AnonymousClass147 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BVN(String str) {
        Log.e("Delivery failure on fetching non admin GJRs");
    }

    public void BWw(C203399nx r2, String str) {
        Log.e("Error fetching non admin GJRs");
    }
}
