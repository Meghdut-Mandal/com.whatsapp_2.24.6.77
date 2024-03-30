package X;

import android.content.Context;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.9Sg  reason: invalid class name and case insensitive filesystem */
public class C195049Sg {
    public static C183688rC A09;
    public static C183668rA A0A;
    public final C19700wN A00;
    public final AnonymousClass8gH A01;
    public final B2W A02;
    public final C24651Dg A03;
    public final C24601Db A04;
    public final C24641Df A05;
    public final AFC A06;
    public final C29131Vl A07;
    public final C19770wU A08;

    public synchronized void A00() {
        C29131Vl r9 = this.A07;
        AFC afc = this.A06;
        C19700wN r3 = this.A00;
        boolean A1Q = AnonymousClass000.A1Q(this.A04.A03().getBoolean("payments_sandbox", false) ? 1 : 0);
        B2W b2w = this.A02;
        C183688rC r2 = new C183688rC(r3, this.A01, b2w, this.A03, this.A05, afc, r9, A1Q);
        A09 = r2;
        C36391kE.A1Q(r2, this.A08);
    }

    public C195049Sg(C19700wN r15, AnonymousClass17Y r16, C19730wQ r17, C19630wG r18, AnonymousClass19A r19, AE0 ae0, B2W b2w, C29221Vu r22, AnonymousClass9YX r23, C24651Dg r24, C24601Db r25, C29121Vk r26, C24641Df r27, AF7 af7, AFC afc, C29131Vl r30, C19770wU r31) {
        String str;
        this.A00 = r15;
        C19770wU r12 = r31;
        this.A08 = r12;
        AFC afc2 = afc;
        this.A06 = afc2;
        C29131Vl r11 = r30;
        this.A07 = r11;
        this.A04 = r25;
        this.A05 = r27;
        this.A03 = r24;
        B2W b2w2 = b2w;
        this.A02 = b2w2;
        Context context = r18.A00;
        PhoneUserJid A0n = C36441kJ.A0n(r17);
        if (A0n == null) {
            str = null;
        } else {
            str = A0n.user;
        }
        C18740tg.A06(str);
        this.A01 = new AnonymousClass8gH(context, r16, r19, ae0, b2w2, r22, r23, r26, af7, afc2, r11, r12, str);
    }
}
