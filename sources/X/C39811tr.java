package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1tr  reason: invalid class name and case insensitive filesystem */
public class C39811tr extends AnonymousClass04R {
    public final C57022xX A00;
    public final C19730wQ A01;
    public final AnonymousClass16D A02;
    public final C32631dw A03;
    public final AnonymousClass1PC A04;
    public final C33751fs A05;
    public final C19970wo A06;
    public final C220412q A07;
    public final AnonymousClass1PF A08;
    public final AnonymousClass17X A09;
    public final C27291Nq A0A;
    public final C233017y A0B;
    public final C20810yC A0C;
    public final AnonymousClass147 A0D;
    public final AnonymousClass174 A0E;
    public final C39481sU A0F = new C39481sU();
    public final C39481sU A0G = new C39481sU();
    public final C39481sU A0H = new C39481sU();
    public final C39481sU A0I = new C39481sU();
    public final C32681e1 A0J;
    public final C34831hi A0K;
    public final C34831hi A0L;
    public final C19770wU A0M;
    public final C34711hW A0N;
    public final C27281Np A0O;

    public void A0R() {
        this.A0O.unregisterObserver(this.A0N);
    }

    public void A0S() {
        this.A0M.Bp1(new C80253v6(this, 1));
    }

    public void A0T(C62183Fc r3) {
        C601836u r0 = (C601836u) this.A0F.A04();
        if (r0 != null) {
            AnonymousClass141.A01(r3, r0.A01);
            C39481sU r1 = this.A0I;
            Object A042 = r1.A04();
            if (A042 != null) {
                r1.A0C(A042);
            }
            C39481sU r12 = this.A0G;
            Object A043 = r12.A04();
            if (A043 != null) {
                r12.A0C(A043);
            }
        }
    }

    public boolean A0U(UserJid userJid) {
        C601836u r0 = (C601836u) this.A0F.A04();
        if (r0 == null || !r0.A00.contains(userJid)) {
            return false;
        }
        return true;
    }

    public C39811tr(C57022xX r4, C19730wQ r5, AnonymousClass16D r6, C32631dw r7, AnonymousClass1PC r8, C33751fs r9, C19970wo r10, C220412q r11, AnonymousClass1PF r12, AnonymousClass17X r13, C27291Nq r14, C233017y r15, C20810yC r16, C27281Np r17, AnonymousClass147 r18, AnonymousClass174 r19, C32681e1 r20, C19770wU r21) {
        Integer A0m = C36381kD.A0m();
        this.A0K = C36441kJ.A0s(A0m);
        this.A0L = C36441kJ.A0s(A0m);
        AnonymousClass4WA r0 = new AnonymousClass4WA(this, 1);
        this.A0N = r0;
        this.A06 = r10;
        this.A0C = r16;
        this.A0J = r20;
        this.A01 = r5;
        this.A0M = r21;
        this.A07 = r11;
        this.A02 = r6;
        this.A0A = r14;
        C27281Np r2 = r17;
        this.A0O = r2;
        this.A05 = r9;
        this.A03 = r7;
        this.A09 = r13;
        this.A0B = r15;
        this.A04 = r8;
        this.A08 = r12;
        this.A00 = r4;
        this.A0D = r18;
        this.A0E = r19;
        r2.registerObserver(r0);
    }
}
