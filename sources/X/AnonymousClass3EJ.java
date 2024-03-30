package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;

/* renamed from: X.3EJ  reason: invalid class name */
public final class AnonymousClass3EJ {
    public final C19730wQ A00;
    public final AnonymousClass1HT A01;
    public final AnonymousClass3G9 A02;
    public final AnonymousClass16D A03;

    public final C48022gZ A01(C65663Sz r14, boolean z, boolean z2) {
        AnonymousClass141 A08;
        String str;
        AnonymousClass141 A04;
        String str2;
        C65663Sz r7 = r14;
        AnonymousClass00C.A0D(r14, 0);
        UserJid userJid = r14.A09;
        boolean z3 = userJid instanceof C177638e7;
        AnonymousClass16D r0 = this.A03;
        if (z3) {
            A08 = (AnonymousClass141) r0.A04.A00.get();
        } else {
            A08 = r0.A08(userJid);
        }
        if (A08 == null || (A04 = A08.A04()) == null) {
            str = "Could not fetch contact info based on StatusInfo.";
        } else {
            AnonymousClass1HT r3 = this.A01;
            AnonymousClass3T1 A022 = r3.A02(userJid);
            if (A022 == null) {
                str = "Could not fetch last status message based on StatusInfo.";
            } else {
                if (z3) {
                    AnonymousClass3SA A002 = r3.A0F.A00(A022);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("ts = ");
                    A0u.append(A022.A0I);
                    A0u.append(" statusinfoTs = ");
                    A0u.append(r14.A05());
                    A0u.append(" campaignId = ");
                    A0u.append(A002.A04);
                    A0u.append(" 1stseents = ");
                    A0u.append(A002.A01);
                    A0u.append("  expts = ");
                    String A11 = C36411kG.A11(A0u, A002.A00);
                    if (A022.A0I <= 10000) {
                        r3.A00.A0E("StatusPSA/TS", A11, true);
                    }
                }
                long j = A022.A0I;
                if (j > 10000) {
                    str2 = this.A02.A00(j);
                } else {
                    str2 = " ";
                }
                return new C48022gZ(r7, A04, A022, str2, z, z2);
            }
        }
        Log.e(str);
        return null;
    }

    public AnonymousClass3EJ(C19730wQ r1, AnonymousClass16D r2, AnonymousClass1HT r3, AnonymousClass3G9 r4) {
        C36321k7.A11(r1, r2, r3);
        this.A00 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public static void A00(C65663Sz r0, AnonymousClass3EJ r1, AbstractCollection abstractCollection, boolean z, boolean z2) {
        C48022gZ A012 = r1.A01(r0, z, z2);
        if (A012 != null) {
            abstractCollection.add(A012);
        }
    }
}
