package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.9ia  reason: invalid class name and case insensitive filesystem */
public class C200989ia {
    public final AnonymousClass026 A00;
    public final C19700wN A01;
    public final C19730wQ A02;
    public final AnonymousClass1DT A03;
    public final AnonymousClass1WE A04;
    public final C19970wo A05;
    public final C19420v0 A06;
    public final C20310xM A07;
    public final C20810yC A08;
    public final C21010yW A09;
    public final AnonymousClass1CF A0A;
    public final C199709fp A0B;
    public final C29111Vj A0C;
    public final C29121Vk A0D;
    public final AnonymousClass1EU A0E;
    public final AnonymousClass1PE A0F;
    public final AnonymousClass1VY A0G;
    public final C231017e A0H;
    public final AnonymousClass1VN A0I;
    public final C24961El A0J;

    public static void A00(Jid jid, Jid jid2, C200989ia r6, String str, String str2, int i, boolean z) {
        if (i != 490) {
            i = 487;
        }
        AnonymousClass9YT r3 = new AnonymousClass9YT();
        Jid jid3 = jid;
        if (z) {
            jid3 = jid2;
        }
        r3.A02 = jid3;
        r3.A05 = "message";
        r3.A07 = str;
        r3.A08 = str2;
        if (!z) {
            jid = jid2;
        }
        r3.A01 = jid;
        r3.A08("error", String.valueOf(i));
        r3.A00 = -1;
        r6.A00.accept(r3.A01());
        C176288bs r1 = new C176288bs();
        r1.A00 = "message";
        r1.A01 = str2;
        r6.A09.Bly(r1);
    }

    public static void A01(C21337AHp aHp, C203399nx r6, C200989ia r7) {
        int i;
        AnonymousClass630 r0;
        if (!(AnonymousClass143.A00(aHp.A19) instanceof C28981Uw)) {
            String A0x = C36391kE.A0x(r6, "mediatype");
            AnonymousClass630 A002 = C111475cL.A00(r6);
            if (A002.A02 != null || "livelocation".equals(A0x) || !r7.A08.A0E(2187)) {
                if (A002.A00 == 2) {
                    aHp.A0O = A002;
                } else {
                    aHp.A0N = A002;
                }
                int A0S = r6.A0S("count", 0);
                if (aHp.A0Y == null || aHp.BGp() == A0S) {
                    aHp.A0Y = Integer.valueOf(A0S);
                    String A0x2 = C36391kE.A0x(r6, "mediareason");
                    if (A0x2 != null) {
                        if (A0x2.equals("retry")) {
                            Boolean bool = aHp.A0T;
                            if (bool == null || bool.booleanValue()) {
                                aHp.A0T = true;
                            } else {
                                throw C165617ti.A0Q("mediareason retry may not mismatch between two enc nodes in the same message");
                            }
                        } else {
                            throw C165567td.A0G("unknown mediareason ", A0x2, AnonymousClass000.A0u());
                        }
                    }
                    int A0S2 = r6.A0S("duration", -1);
                    if (A0S2 >= 0) {
                        aHp.A0U = Integer.valueOf(A0S2);
                    }
                    AnonymousClass630 r1 = aHp.A0O;
                    if (r1 != null && (r0 = aHp.A0N) != null && r1.A01 != r0.A01) {
                        throw C165617ti.A0Q("ciphertext version may not mismatch between two enc nodes in the same message");
                    } else if ("hide".equals(C36391kE.A0x(r6, "decrypt-fail")) || "peer".equals(aHp.A0i) || (i = aHp.A01) == 8 || i == 7) {
                        aHp.A00 = 1;
                    } else {
                        aHp.A00 = 0;
                    }
                } else {
                    throw C165617ti.A0Q("retry count may not mismatch between two enc nodes in the same message");
                }
            } else {
                C19700wN r3 = r7.A01;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(A002.A00);
                A0u.append(":");
                int i2 = A002.A01;
                r3.A0E("missing-ciphertext", C36381kD.A10(A0u, i2), true);
                throw C165617ti.A0Q(AnonymousClass000.A0r("missing ciphertext ", AnonymousClass000.A0u(), i2));
            }
        } else {
            throw C165617ti.A0Q("Received enc message for newsletters");
        }
    }

    public C200989ia(AnonymousClass026 r2, C19700wN r3, C19730wQ r4, AnonymousClass1DT r5, AnonymousClass1WE r6, C19970wo r7, C19420v0 r8, C20310xM r9, C20810yC r10, C21010yW r11, AnonymousClass1CF r12, AnonymousClass1VN r13, C199709fp r14, C29111Vj r15, C29121Vk r16, AnonymousClass1EU r17, AnonymousClass1PE r18, AnonymousClass1VY r19, C231017e r20, C24961El r21) {
        this.A05 = r7;
        this.A08 = r10;
        this.A01 = r3;
        this.A02 = r4;
        this.A09 = r11;
        this.A0I = r13;
        this.A03 = r5;
        this.A0E = r17;
        this.A07 = r9;
        this.A0H = r20;
        this.A0J = r21;
        this.A0A = r12;
        this.A0G = r19;
        this.A06 = r8;
        this.A0C = r15;
        this.A0D = r16;
        this.A04 = r6;
        this.A00 = r2;
        this.A0B = r14;
        this.A0F = r18;
    }
}
