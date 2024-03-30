package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendPaymentInviteSetupJob;
import java.util.HashMap;

/* renamed from: X.1Yx  reason: invalid class name and case insensitive filesystem */
public class C30021Yx {
    public final C19970wo A00;
    public final C20310xM A01;
    public final C24601Db A02;
    public final C29121Vk A03;
    public final C30031Yy A04;
    public final AnonymousClass164 A05;
    public final AnonymousClass1EV A06;
    public final AnonymousClass1EU A07;

    public synchronized void A01(UserJid userJid, int i, long j) {
        C193609Md BFa = this.A07.A05().BFa();
        AnonymousClass1EV r2 = this.A06;
        if (!r2.A03() || BFa == null || !BFa.A02.A0D()) {
            C24601Db r5 = this.A02;
            HashMap A022 = C24601Db.A02(r5, r5.A03().getString("payments_inviter_jids_with_expiry", ""));
            Long l = (Long) A022.get(userJid);
            if (l == null || l.longValue() < j) {
                A022.put(userJid, Long.valueOf(j));
                r5.A03().edit().putString("payments_inviter_jids_with_expiry", C24601Db.A01(A022)).apply();
            }
            if (!r2.A03()) {
                long A002 = C19970wo.A00(this.A00);
                if (j < A002) {
                    j = A002 + 7776000000L;
                }
                r5.A0E(0, j);
            }
        } else {
            A00(userJid, this, i, false);
        }
        C29171Vp r7 = this.A03.A0E.A01;
        String rawString = userJid.getRawString();
        synchronized (r7) {
            C29161Vo r52 = r7.A01;
            C202009kr A003 = r52.A00();
            A003.A00++;
            A003.A0E.add(rawString);
            r52.A01(A003);
        }
    }

    public static void A00(UserJid userJid, C30021Yx r6, int i, boolean z) {
        r6.A05.A01(new SendPaymentInviteSetupJob(userJid, i, z));
        C24601Db r4 = r6.A02;
        HashMap A022 = C24601Db.A02(r4, r4.A03().getString("payments_inviter_jids_with_expiry", ""));
        A022.remove(userJid);
        r4.A03().edit().putString("payments_inviter_jids_with_expiry", C24601Db.A01(A022)).apply();
    }

    public C30021Yx(AnonymousClass164 r1, C19970wo r2, C20310xM r3, C24601Db r4, C29121Vk r5, AnonymousClass1EV r6, AnonymousClass1EU r7, C30031Yy r8) {
        this.A00 = r2;
        this.A05 = r1;
        this.A07 = r7;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A06 = r6;
        this.A04 = r8;
    }
}
