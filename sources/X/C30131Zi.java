package X;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.whatsapp.util.Log;

/* renamed from: X.1Zi  reason: invalid class name and case insensitive filesystem */
public final class C30131Zi {
    public C30151Zk A00;
    public C30161Zl A01;
    public C30171Zm A02;
    public C30181Zn A03;
    public C30191Zo A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C30091Ze A08;
    public final C30101Zf A09;
    public final AnonymousClass17Y A0A;
    public final AnonymousClass164 A0B;
    public final C220412q A0C;
    public final C26141Ja A0D;
    public final C20810yC A0E;
    public final AnonymousClass19A A0F;
    public final AnonymousClass1GQ A0G;
    public final AnonymousClass1ZK A0H;
    public final AnonymousClass1ZN A0I;
    public final AnonymousClass1ZO A0J;
    public final AnonymousClass1SL A0K;
    public final AnonymousClass1ZL A0L;
    public final AnonymousClass1OA A0M;
    public final C30071Zc A0N;
    public final C30111Zg A0O;
    public final C24771Ds A0P;
    public final C24751Dq A0Q;
    public final C24681Dj A0R;
    public final C19770wU A0S;
    public final C19460v5 A0T;
    public final C19970wo A0U;
    public final C19420v0 A0V;
    public final C20310xM A0W;
    public final AnonymousClass00T A0X = new AnonymousClass00U(C30141Zj.A00);

    public final AnonymousClass8fX A01(C28981Uw r16, AnonymousClass4TM r17, String str, boolean z, boolean z2) {
        AnonymousClass4TM r6 = r17;
        AnonymousClass00C.A0D(r6, 4);
        if (!AnonymousClass1GQ.A01(this.A0G, 3877)) {
            return null;
        }
        C30171Zm r1 = this.A02;
        if (r1 != null) {
            C18800tq r12 = r1.A00.A00;
            C27591Ow r4 = (C27591Ow) r12.A5M.get();
            C30131Zi r9 = (C30131Zi) r12.A5h.get();
            AnonymousClass1ZL Azc = r12.Azc();
            AnonymousClass4OL r7 = (AnonymousClass4OL) r12.A5l.get();
            AnonymousClass1ZK r8 = (AnonymousClass1ZK) r12.A5o.get();
            AnonymousClass8fX r13 = new AnonymousClass8fX((C220412q) r12.A1l.get(), (C26141Ja) r12.A5m.get(), r4, r16, r6, r7, r8, r9, Azc, (C19770wU) r1.A00.A00.A9Y.get(), str, z, z2);
            r13.A01();
            return r13;
        }
        AnonymousClass00C.A0G("getNewsletterPreviewGraphqlHandler");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final synchronized void A02() {
        AnonymousClass1GQ r4 = this.A0G;
        if (AnonymousClass1GQ.A01(r4, 3877)) {
            AnonymousClass005 r3 = this.A0V.A00;
            if (!((SharedPreferences) r3.get()).getBoolean("newsletter_subscriptions_fetched", false) && !this.A07) {
                A0D(false);
            }
            if (!((SharedPreferences) r3.get()).getBoolean("newsletter_my_reactions_fetched", false) && !this.A05 && AnonymousClass1GQ.A01(r4, 3877)) {
                this.A05 = true;
                this.A0K.A02((C28981Uw) null);
            }
        }
    }

    public final void A05(C28981Uw r4) {
        AnonymousClass1GQ r1 = this.A0G;
        if (AnonymousClass1GQ.A01(r1, 3877) && C65903Tx.A06(this.A0C, r4, r1)) {
            this.A0B.A01(C1900796u.A00(r4, (AnonymousClass4TM) null));
        }
    }

    public final void A06(C28981Uw r18) {
        C28981Uw r2 = r18;
        AnonymousClass00C.A0D(r2, 0);
        AnonymousClass1GQ r1 = this.A0G;
        if (AnonymousClass1GQ.A01(r1, 3877) && C65903Tx.A06(this.A0C, r2, r1)) {
            this.A0B.A01(new AnonymousClass8fM(r2, (AnonymousClass4TM) null, new C198239d8(false, false, false, true, false, false, false, false, false, true, true, true)));
        }
    }

    public final void A07(C28981Uw r12) {
        C28981Uw r6 = r12;
        AnonymousClass00C.A0D(r12, 0);
        if (AnonymousClass1GQ.A01(this.A0G, 3877)) {
            C44072La r0 = (C44072La) this.A0C.A09(r12, false);
            if (r0 != null && r0.A0L()) {
                this.A0W.A0d(r12, (Long) null, false, true);
            }
            C26141Ja r4 = this.A0D;
            C44072La r3 = (C44072La) r4.A02.A09(r12, false);
            if (r3 != null) {
                if (r3.A0L()) {
                    r3.A09 = C52382pL.GUEST;
                }
                r3.A0N = true;
                ContentValues contentValues = new ContentValues();
                C54272sg.A00(contentValues, "deleted", true);
                contentValues.put("membership", Integer.valueOf(r3.A09.value));
                C26141Ja.A01(contentValues, r3, r4);
            }
            AnonymousClass1ZK r5 = this.A0H;
            AnonymousClass1A1 r32 = r5.A02;
            AnonymousClass3T1 A012 = r32.A01.A01(r5.A00.A03(r12));
            if (A012 == null || !(A012 instanceof AnonymousClass2bI) || ((AnonymousClass2bI) A012).A00 != 133) {
                r5.A01(r6, (Long) null, 133, 1 + r5.A01.A06(r12));
            }
            this.A0L.A0F(r12);
        }
    }

    public final void A08(C28981Uw r4) {
        AnonymousClass00C.A0D(r4, 0);
        AnonymousClass1GQ r1 = this.A0G;
        if (AnonymousClass1GQ.A01(r1, 3877) && C65903Tx.A06(this.A0C, r4, r1)) {
            this.A0S.Boy(new C35741jB(this, r4, 28));
        }
    }

    public final void A09(C28981Uw r4) {
        AnonymousClass00C.A0D(r4, 0);
        AnonymousClass1GQ r1 = this.A0G;
        if (AnonymousClass1GQ.A01(r1, 3877) && C65903Tx.A06(this.A0C, r4, r1)) {
            this.A0S.Boy(new C35741jB(this, r4, 25));
        }
    }

    public final void A0A(C28981Uw r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (AnonymousClass1GQ.A01(this.A0G, 3877)) {
            this.A0S.Boy(new C35741jB(this, r4, 27));
        }
    }

    public final void A0B(C28981Uw r3, AnonymousClass4TM r4) {
        AnonymousClass00C.A0D(r3, 0);
        if (AnonymousClass1GQ.A01(this.A0G, 3877)) {
            this.A0B.A01(new C178198fJ(r3, r4));
        }
    }

    public final void A0C(C28981Uw r13, AnonymousClass4TM r14, String str, String str2, byte[] bArr, boolean z, boolean z2) {
        C28981Uw r3 = r13;
        AnonymousClass00C.A0D(r13, 0);
        if (AnonymousClass1GQ.A01(this.A0G, 3877)) {
            this.A0B.A01(new AnonymousClass8fL((C52392pM) null, r3, r14, str, str2, bArr, true, z, z2, false));
        }
    }

    public final AnonymousClass2YD A00(AnonymousClass4UA r4, String str, String str2) {
        AnonymousClass2YD r1;
        if (!AnonymousClass1GQ.A01(this.A0G, 3877)) {
            r1 = new AnonymousClass2YB(r4);
        } else {
            r1 = new AnonymousClass2YA(r4, str, str2, C20800yB.A00(C21000yV.A02, this.A0E, 5853));
        }
        this.A0B.A01(r1);
        return r1;
    }

    public final void A03(C44072La r4, AnonymousClass00S r5) {
        if (AnonymousClass1GQ.A01(this.A0G, 3877)) {
            this.A0S.Boy(new C35631j0(this, r4, r5, 40));
        }
    }

    public final void A04(C52282pB r6, C28981Uw r7) {
        C26141Ja r4 = this.A0D;
        C44072La r3 = (C44072La) r4.A02.A09(r7, false);
        if (r3 != null) {
            r3.A0E = r6;
            ContentValues contentValues = new ContentValues();
            contentValues.put("suspended", Integer.valueOf(r3.A0E.value));
            C26141Ja.A01(contentValues, r3, r4);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("NewsletterStore/failed to find newsletter in chatsCache for ");
            sb.append(r7);
            Log.e(sb.toString());
        }
        this.A0L.A0F(r7);
    }

    public final void A0D(boolean z) {
        if (AnonymousClass1GQ.A01(this.A0G, 3877)) {
            A0E(true);
            this.A07 = true;
            C30181Zn r1 = this.A03;
            if (r1 != null) {
                C18800tq r12 = r1.A00.A00;
                C27591Ow r4 = (C27591Ow) r12.A5M.get();
                AnonymousClass4OL r6 = (AnonymousClass4OL) r12.A5l.get();
                C26141Ja r3 = (C26141Ja) r12.A5m.get();
                AnonymousClass1C4 r5 = (AnonymousClass1C4) r12.A7e.get();
                new AnonymousClass2YF((C19420v0) r12.A9G.get(), r3, r4, r5, r6, r12.Azc(), (C19770wU) r1.A00.A00.A9Y.get(), z).A01();
                return;
            }
            AnonymousClass00C.A0G("getAllSubscribedNewslettersGraphqlHandler");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public final void A0E(boolean z) {
        if (!this.A06) {
            this.A06 = true;
            this.A0S.Boy(new C35231iM(4, (Object) this, z));
        }
    }

    public C30131Zi(C19460v5 r26, C30091Ze r27, C30101Zf r28, AnonymousClass17Y r29, AnonymousClass164 r30, C19970wo r31, C19420v0 r32, C220412q r33, C20310xM r34, C26141Ja r35, C20810yC r36, AnonymousClass19A r37, AnonymousClass1GQ r38, AnonymousClass1ZK r39, AnonymousClass1ZN r40, AnonymousClass1ZO r41, AnonymousClass1SL r42, AnonymousClass1ZL r43, AnonymousClass1OA r44, C30071Zc r45, C30111Zg r46, C24771Ds r47, C24751Dq r48, C24681Dj r49, C19770wU r50) {
        C19970wo r19 = r31;
        AnonymousClass00C.A0D(r19, 1);
        C20810yC r15 = r36;
        AnonymousClass00C.A0D(r15, 2);
        AnonymousClass17Y r21 = r29;
        AnonymousClass00C.A0D(r21, 3);
        C19770wU r2 = r50;
        AnonymousClass00C.A0D(r2, 4);
        C220412q r17 = r33;
        AnonymousClass00C.A0D(r17, 5);
        AnonymousClass164 r20 = r30;
        AnonymousClass00C.A0D(r20, 6);
        AnonymousClass19A r13 = r37;
        AnonymousClass00C.A0D(r13, 7);
        C19460v5 r24 = r26;
        AnonymousClass00C.A0D(r24, 8);
        C19420v0 r18 = r32;
        AnonymousClass00C.A0D(r18, 9);
        C26141Ja r14 = r35;
        AnonymousClass00C.A0D(r14, 10);
        AnonymousClass1GQ r12 = r38;
        AnonymousClass00C.A0D(r12, 11);
        C20310xM r16 = r34;
        AnonymousClass00C.A0D(r16, 14);
        C24771Ds r5 = r47;
        AnonymousClass00C.A0D(r5, 15);
        AnonymousClass1ZN r10 = r40;
        AnonymousClass00C.A0D(r10, 16);
        AnonymousClass1ZO r9 = r41;
        AnonymousClass00C.A0D(r9, 17);
        C30071Zc r7 = r45;
        AnonymousClass00C.A0D(r7, 18);
        C24681Dj r3 = r49;
        AnonymousClass00C.A0D(r3, 19);
        C30091Ze r23 = r27;
        AnonymousClass00C.A0D(r23, 20);
        C24751Dq r4 = r48;
        AnonymousClass00C.A0D(r4, 21);
        C30101Zf r22 = r28;
        AnonymousClass00C.A0D(r22, 22);
        AnonymousClass1ZK r11 = r39;
        AnonymousClass00C.A0D(r11, 23);
        AnonymousClass1SL r8 = r42;
        AnonymousClass00C.A0D(r8, 24);
        C30111Zg r6 = r46;
        AnonymousClass00C.A0D(r6, 25);
        this.A0U = r19;
        this.A0E = r15;
        this.A0A = r21;
        this.A0S = r2;
        this.A0C = r17;
        this.A0B = r20;
        this.A0F = r13;
        this.A0T = r24;
        this.A0V = r18;
        this.A0D = r14;
        this.A0G = r12;
        this.A0M = r44;
        this.A0L = r43;
        this.A0W = r16;
        this.A0P = r5;
        this.A0I = r10;
        this.A0J = r9;
        this.A0N = r7;
        this.A0R = r3;
        this.A08 = r23;
        this.A0Q = r4;
        this.A09 = r22;
        this.A0H = r11;
        this.A0K = r8;
        this.A0O = r6;
        ConditionVariable conditionVariable = C18740tg.A00;
    }
}
