package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3vy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80793vy implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C29731Xt A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ C80793vy(UserJid userJid, C29731Xt r2, Long l, String str, String str2, String str3, int i, boolean z) {
        this.A00 = i;
        this.A02 = r2;
        this.A04 = str;
        this.A01 = userJid;
        this.A05 = str2;
        this.A03 = l;
        this.A06 = str3;
        this.A07 = z;
    }

    public final void run() {
        long j;
        int intValue;
        int i = this.A00;
        C29731Xt r7 = this.A02;
        String str = this.A04;
        UserJid userJid = this.A01;
        String str2 = this.A05;
        Long l = this.A03;
        String str3 = this.A06;
        boolean z = this.A07;
        AnonymousClass2SN r2 = new AnonymousClass2SN();
        r2.A02 = Integer.valueOf(i);
        C65303Rn r11 = r7.A01;
        if (r11 != null) {
            r2.A03 = C36361kB.A0j();
            r2.A06 = Long.valueOf(r11.A02);
            r2.A07 = Long.valueOf(r11.A03);
            r2.A08 = str2;
            r2.A09 = r11.A06;
            if (str2 != null) {
                r2.A05 = l;
                r2.A04 = C36441kJ.A0y(C36381kD.A07(r7.A0D.get(str3)));
            }
        } else {
            r2.A03 = 1;
            C61103Ao r0 = r7.A00;
            if (r0 != null) {
                j = r0.A05;
            } else {
                j = 0;
            }
            r2.A06 = Long.valueOf(j);
            r2.A09 = str;
        }
        AnonymousClass141 A08 = r7.A02.A08(userJid);
        if (A08 != null) {
            r2.A00 = Boolean.valueOf(A08.A0C());
            r2.A01 = Boolean.valueOf(A08.A0B());
        }
        String str4 = r2.A09;
        if (str4 == null || str4.length() == 0) {
            r7.A07.Blw(r2);
        } else {
            r7.A07.Bls(r2, AnonymousClass3TM.A00, true);
        }
        C65303Rn r02 = r7.A01;
        if (r02 != null) {
            ArrayList A0I = AnonymousClass001.A0I();
            Collection<C61093An> values = r02.A0B.values();
            if (values != null) {
                for (C61093An r03 : values) {
                    A0I.addAll(r03.A08.values());
                }
            }
            ArrayList<AnonymousClass3OI> A0I2 = AnonymousClass001.A0I();
            Iterator it = A0I.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (AnonymousClass00C.A0J(((AnonymousClass3OI) next).A0N, str3)) {
                    A0I2.add(next);
                }
            }
            for (AnonymousClass3OI r8 : A0I2) {
                C29751Xv r14 = r7.A0B;
                Long valueOf = Long.valueOf(r8.A09);
                Boolean valueOf2 = Boolean.valueOf(r8.A0L);
                String str5 = r8.A0N;
                UserJid userJid2 = r8.A0M;
                Integer num = r8.A0E;
                boolean z2 = true;
                if (num != null && (((intValue = num.intValue()) == 4 || intValue == 3) && r8.A08 < r8.A06)) {
                    z2 = false;
                }
                Boolean valueOf3 = Boolean.valueOf(z2);
                Integer valueOf4 = Integer.valueOf(AnonymousClass3OI.A00(r8.A02));
                if (z) {
                    AnonymousClass2SE A002 = C29751Xv.A00(userJid2, r14, valueOf3, valueOf2, valueOf4, valueOf, str5);
                    A002.A05 = C36371kC.A0o();
                    r14.A01.Bls(A002, new C18950u5(1, 1), true);
                }
            }
        }
    }
}
