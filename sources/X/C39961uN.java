package X;

import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesViewModel$refreshDb$1;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;

/* renamed from: X.1uN  reason: invalid class name and case insensitive filesystem */
public final class C39961uN extends AnonymousClass04R {
    public AnonymousClass39U A00;
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02 = C36431kI.A0S();
    public final C57252xw A03;
    public final C25271Fq A04;
    public final AnonymousClass191 A05 = C90394a5.A00(this, 14);
    public final AnonymousClass147 A06;
    public final RtaXmppClient A07;

    public C39961uN(C57252xw r2, C25271Fq r3, AnonymousClass147 r4, RtaXmppClient rtaXmppClient) {
        C36321k7.A12(r3, r2, r4);
        this.A07 = rtaXmppClient;
        this.A04 = r3;
        this.A03 = r2;
        this.A06 = r4;
    }

    public static final void A01(C39961uN r3) {
        C36331k8.A1T(new ReportToAdminMessagesViewModel$refreshDb$1(r3, (C023509x) null), C109325Xd.A00(r3));
    }

    public static final boolean A02(C39961uN r2, AnonymousClass3T1 r3) {
        String str;
        C64933Qa r0;
        AnonymousClass37F A0X = r3.A0X();
        if (A0X == null || (r0 = A0X.A02) == null || (str = r0.A01) == null) {
            str = r3.A1J.A01;
        }
        AnonymousClass00C.A0B(str);
        AnonymousClass39U r02 = r2.A00;
        if (r02 != null) {
            return r02.A04.contains(str);
        }
        return false;
    }
}
