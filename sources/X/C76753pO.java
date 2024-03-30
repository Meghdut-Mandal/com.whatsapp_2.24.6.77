package X;

import com.whatsapp.jid.Jid;
import java.util.HashMap;

/* renamed from: X.3pO  reason: invalid class name and case insensitive filesystem */
public class C76753pO implements C236119d {
    public final /* synthetic */ AnonymousClass23D A00;
    public final /* synthetic */ C20510xg A01;
    public final /* synthetic */ AnonymousClass4RS A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ boolean A04;

    public C76753pO(AnonymousClass23D r1, C20510xg r2, AnonymousClass4RS r3, Runnable runnable, boolean z) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = z;
        this.A03 = runnable;
        this.A00 = r1;
    }

    public void BWw(C203399nx r3, String str) {
        this.A02.Bou(AnonymousClass3ME.A00(r3));
    }

    public void BiM(C203399nx r7, String str) {
        String str2;
        Jid A0X = r7.A0X(AnonymousClass147.class, "from");
        if (A0X == null) {
            this.A02.Bou(800);
            return;
        }
        HashMap A0J = AnonymousClass001.A0J();
        HashMap A0J2 = AnonymousClass001.A0J();
        if (this.A04) {
            str2 = "admin";
        } else {
            str2 = "demote";
        }
        C20510xg r0 = this.A01;
        AnonymousClass3R9.A02(r7, str2, A0J, A0J2);
        C20350xQ A0d = C36431kI.A0d(r0);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("groupmgr/onDemoteGroupParticipants/");
        A0u.append(A0X);
        C36321k7.A1a(A0u, C36341k9.A0h(A0u, A0J, A0J2));
        if (A0J2.size() > 0) {
            A0d.A0T(3004, A0J2);
        }
        this.A03.run();
    }

    public void BVN(String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupIqResponseUtil/remove-admin/delivery fail; groupId=");
        C36321k7.A1N(this.A00.A03, A0u);
    }
}
