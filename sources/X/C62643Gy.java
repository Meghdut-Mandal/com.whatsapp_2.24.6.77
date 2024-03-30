package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Gy  reason: invalid class name and case insensitive filesystem */
public final class C62643Gy {
    public final C19420v0 A00;
    public final C236419g A01;
    public final C20810yC A02;
    public final AnonymousClass1C6 A03;
    public final boolean A04;
    public final boolean A05;
    public final C33201et A06;
    public final C21010yW A07;

    public final void A00(AnonymousClass155 r11, AnonymousClass141 r12, boolean z) {
        String str;
        AnonymousClass155 r3 = r11;
        boolean A1a = C36341k9.A1a(r11, r12);
        Jid A0e = C36381kD.A0e(r12, UserJid.class);
        AnonymousClass00C.A08(A0e);
        UserJid userJid = (UserJid) A0e;
        boolean A0A = this.A03.A0A(userJid);
        if (z) {
            if (A0A) {
                str = "chat_fmx_card_safety_tools_block";
            } else {
                str = "chat_fmx_card_safety_tools_block_suspicious";
            }
        } else if (A0A) {
            str = "chat_fmx_card_block";
        } else {
            str = "chat_fmx_card_block_suspicious";
        }
        if (r12.A0C()) {
            boolean z2 = !C36421kH.A1Z(this.A02);
            r11.startActivity(AnonymousClass190.A0x(r3, userJid, str, A1a, A1a, z2, z2));
            return;
        }
        C33201et r0 = this.A06;
        C18740tg.A06(userJid);
        AnonymousClass3F5 B3t = r0.B3t(userJid, str);
        B3t.A04 = A1a;
        B3t.A05 = false;
        C20810yC r1 = B3t.A06;
        if (!C36421kH.A1Z(r1)) {
            B3t.A02 = A1a;
        }
        if (!r1.A0E(6185)) {
            B3t.A03 = A1a;
        }
        B3t.A01(A1a ? 1 : 0, A1a);
        r11.Btm(AnonymousClass3F5.A00(B3t));
    }

    public final void A01(C39601su r5, Integer num, int i, int i2) {
        boolean z;
        int i3;
        C45382Rd r3 = new C45382Rd();
        r3.A04 = Integer.valueOf(i);
        r3.A03 = Integer.valueOf(i2);
        if (r5 != null) {
            r3.A02 = C36371kC.A0m();
            C001700s r2 = r5.A01;
            List A0w = C36401kF.A0w(r2);
            if (A0w != null) {
                Iterator it = A0w.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next() instanceof AnonymousClass2TR) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            r3.A00 = Boolean.valueOf(z);
            List A0w2 = C36401kF.A0w(r2);
            if (A0w2 != null) {
                Iterator it2 = A0w2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C54332sm r1 = (C54332sm) it2.next();
                    if (r1 instanceof AnonymousClass2TQ) {
                        i3 = ((AnonymousClass2TQ) r1).A00.A00;
                        break;
                    }
                }
            }
            i3 = 0;
            r3.A06 = C36441kJ.A0y(i3);
            if (this.A05) {
                r3.A01 = Boolean.valueOf(r5.A03.A0C());
            }
        }
        if (num != null) {
            r3.A05 = num;
        }
        this.A07.Bly(r3);
    }

    public C62643Gy(C33201et r2, C19420v0 r3, C236419g r4, C20810yC r5, C21010yW r6, AnonymousClass1C6 r7) {
        C36321k7.A1B(r5, r6, r7, r3, r4);
        AnonymousClass00C.A0D(r2, 6);
        this.A02 = r5;
        this.A07 = r6;
        this.A03 = r7;
        this.A00 = r3;
        this.A01 = r4;
        this.A06 = r2;
        this.A04 = r5.A0E(3962);
        this.A05 = r5.A0E(5263);
    }
}
