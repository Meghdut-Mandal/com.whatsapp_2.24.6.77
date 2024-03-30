package X;

import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3mu  reason: invalid class name and case insensitive filesystem */
public class C75243mu implements AnonymousClass4TD {
    public final /* synthetic */ AnonymousClass147 A00;
    public final /* synthetic */ AcceptInviteLinkActivity A01;

    public C75243mu(AcceptInviteLinkActivity acceptInviteLinkActivity, AnonymousClass147 r2) {
        this.A01 = acceptInviteLinkActivity;
        this.A00 = r2;
    }

    public void Bhz(AnonymousClass147 r23, UserJid userJid, AnonymousClass3QL r25, String str, Map map, int i, int i2, int i3, long j, long j2, boolean z) {
        int i4;
        AcceptInviteLinkActivity acceptInviteLinkActivity = this.A01;
        Map map2 = map;
        ArrayList A0R = acceptInviteLinkActivity.A0D.A0R(map2);
        AnonymousClass147 r8 = r23;
        AnonymousClass6X6 r3 = new AnonymousClass6X6(r8, 0);
        Iterator A0y = AnonymousClass000.A0y(map2);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            String str2 = ((C63523Kj) A11.getValue()).A04;
            boolean equals = "admin".equals(str2);
            boolean equals2 = "superadmin".equals(str2);
            if (equals) {
                i4 = 1;
            } else if (equals2) {
                i4 = 2;
            }
            AnonymousClass6X6.A00(r3, (UserJid) A11.getKey(), acceptInviteLinkActivity.A0A.A0B((UserJid) A11.getKey()), i4, false, true);
        }
        Object obj = acceptInviteLinkActivity.A0N.get();
        if (obj != null) {
            acceptInviteLinkActivity.A09.A00.put(obj, r3);
        }
        acceptInviteLinkActivity.A05.A0H(new C1503374w(this, new AnonymousClass3B2(r8, userJid, r25, str, (String) null, A0R, i, 0, 0, j), this.A00, 29));
    }

    public void onError(int i) {
        this.A01.A05.A0H(new C81283wl((Object) this, i, 9));
    }
}
