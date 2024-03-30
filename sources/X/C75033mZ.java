package X;

import com.whatsapp.jid.UserJid;
import java.io.IOException;
import java.util.Set;

/* renamed from: X.3mZ  reason: invalid class name and case insensitive filesystem */
public class C75033mZ implements C160087kR {
    public long A00;
    public AnonymousClass4TJ A01;
    public final C19600wD A02;
    public final C128636Da A03;
    public final AnonymousClass32P A04;
    public final C19770wU A05;
    public final AnonymousClass17Y A06;
    public final C19970wo A07;
    public final AnonymousClass5Lb A08;
    public final C142606p9 A09;
    public final C33191es A0A;

    private void A00() {
        C142606p9 r2 = this.A09;
        long j = this.A00;
        r2.BOv((Integer) null, Long.valueOf(j), Long.valueOf(C36441kJ.A0A(j)), (String) null, (String) null, (String) null, "xwa_linked_business_account_posts");
    }

    public static void A01(C75033mZ r3, int i) {
        r3.A06.A0H(new C81283wl((Object) r3, i, 39));
        r3.A00();
    }

    public void B2J(C123815x8 r6) {
        Object obj;
        if (r6.A00 != 0 || (obj = r6.A03.A00) == null) {
            A01(this, 2);
            return;
        }
        AnonymousClass5Lb r3 = this.A08;
        AnonymousClass3JC r4 = (AnonymousClass3JC) obj;
        UserJid userJid = this.A03.A03;
        synchronized (r3) {
            AnonymousClass3HW r1 = r4.A00;
            if (r1 != null) {
                r3.A00.put(userJid, r1);
            }
            AnonymousClass3HW r12 = r4.A01;
            if (r12 != null) {
                r3.A02.put(userJid, r12);
            }
            String str = r4.A02;
            if (str != null) {
                r3.A01.put(userJid, str);
            }
        }
        C80253v6.A00(this.A06, this, 48);
        A00();
    }

    public void BWk(Exception exc) {
        if (exc instanceof AnonymousClass5V0) {
            A01(this, 2);
            C132286Sy r2 = ((AnonymousClass5V0) exc).error;
            C33191es r1 = this.A0A;
            Integer valueOf = Integer.valueOf(r2.A01);
            Integer valueOf2 = Integer.valueOf(r2.A00);
            for (C142616pA BOy : (Set) r1.A00.get()) {
                BOy.BOy(valueOf, valueOf2, (Integer) null, "xwa_linked_business_account_posts", (String) null, (String) null, 0);
            }
        }
        A01(this, 3);
    }

    public C75033mZ(AnonymousClass17Y r3, C19600wD r4, C19970wo r5, AnonymousClass5Lb r6, AnonymousClass4TJ r7, C128636Da r8, AnonymousClass32Q r9, C142606p9 r10, C33191es r11, C19770wU r12) {
        this.A07 = r5;
        this.A03 = r8;
        this.A06 = r3;
        this.A01 = r7;
        this.A05 = r12;
        this.A08 = r6;
        this.A0A = r11;
        Object obj = r9.A00.get(C36361kB.A0i());
        C18740tg.A06(obj);
        this.A04 = (AnonymousClass32P) obj;
        this.A09 = r10;
        this.A02 = r4;
    }

    public void BVL(IOException iOException) {
        iOException.getMessage();
        A01(this, 1);
    }
}
