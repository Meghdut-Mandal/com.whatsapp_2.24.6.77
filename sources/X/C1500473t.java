package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Collections;

/* renamed from: X.73t  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1500473t implements Runnable {
    public final /* synthetic */ AnonymousClass11F A00;
    public final /* synthetic */ Jid A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ AnonymousClass1Y4 A03;
    public final /* synthetic */ AnonymousClass2bU A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ C1500473t(AnonymousClass11F r1, Jid jid, UserJid userJid, AnonymousClass1Y4 r4, AnonymousClass2bU r5, boolean z, boolean z2) {
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = jid;
        this.A00 = r1;
        this.A05 = z;
        this.A02 = userJid;
        this.A06 = z2;
    }

    public final void run() {
        AnonymousClass1Y4 r5 = this.A03;
        AnonymousClass2bU r8 = this.A04;
        Jid jid = this.A01;
        AnonymousClass11F r6 = this.A00;
        boolean z = this.A05;
        UserJid userJid = this.A02;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("app/mediajobmanager/enqueuemediaresendupload enqueuing message: ");
        C36321k7.A1N(r8.A1J, A0u);
        AnonymousClass3SC r4 = new AnonymousClass3SC(Collections.singletonList(r8));
        AnonymousClass3Ot r15 = new AnonymousClass3Ot(false, r4.A05(), r4.A04());
        C65233Rg A012 = C65233Rg.A01(r5.A02, r5.A08, r5.A0I, r5.A0J, r15, r4, false);
        AnonymousClass1D0 r9 = r5.A0C;
        C146506vi A08 = r9.A08(A012, false);
        A08.A01 = AnonymousClass1D9.A00(r4);
        A08.A0N.A08(3);
        C124935z2 r13 = A08.A0M;
        C20810yC r11 = r5.A0A;
        if (r11.A0E(475)) {
            AnonymousClass1Y5 r12 = r5.A0F;
            if (C36441kJ.A0A(r13.A05) < 1800000 || !r12.A00(r13)) {
                return;
            }
        }
        if (r8.A00 <= C36441kJ.A0B(r11, 1098) * 1048576) {
            r4.A02();
            AnonymousClass1Y4.A01(r5, A08, r4);
            A08.A0X = "mms";
            A08.A06(new AnonymousClass70R(r5, A08, r4, false, false), r5.A0S);
            AnonymousClass11F r122 = r6;
            r9.A0D(A08, new AnonymousClass5BR(r122, jid, userJid, A08, A08.A02(), z));
        }
    }
}
