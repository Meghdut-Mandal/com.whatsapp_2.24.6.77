package X;

import android.os.ConditionVariable;
import com.whatsapp.jid.UserJid;
import java.util.Collection;

@Deprecated
/* renamed from: X.1JC  reason: invalid class name */
public class AnonymousClass1JC implements AnonymousClass1JB {
    public AnonymousClass1JN A00;
    public AnonymousClass005 A01;
    public final AnonymousClass17Y A02;
    public final C25791Hr A03;
    public final AnonymousClass1A6 A04;
    public final C24381Cf A05;
    public final AnonymousClass12O A06;
    public final AnonymousClass1FV A07;
    public final AnonymousClass005 A08;
    public final AnonymousClass004 A09;
    public final C26021Io A0A;
    public final C24361Cd A0B;
    public final AnonymousClass16D A0C;
    public final AnonymousClass1J9 A0D;
    public final C220412q A0E;
    public final AnonymousClass1C5 A0F;
    public final AnonymousClass1DL A0G;
    public final AnonymousClass1J1 A0H;
    public final C19770wU A0I;

    public void BQK(AnonymousClass11F r9, Collection collection, int i) {
        this.A0A.A01();
        AnonymousClass11F r4 = r9;
        this.A05.A02(r9);
        for (C32001cn A012 : this.A0B.getObservers()) {
            A012.A01(r9);
        }
        this.A0I.Boy(new C35341iX(this, r4, collection, i, 1));
        if (collection != null) {
            AnonymousClass1J1 r2 = this.A0H;
            r2.A05.Boy(new C35761jD(collection, r2, 1));
            if (this.A0F.A03(r9)) {
                this.A0G.A0F(collection);
            }
            ((AnonymousClass1NM) this.A01.get()).A0A(r9, collection.size());
        }
    }

    public void BQM(AnonymousClass11F r3) {
        BQJ(r3, false);
        for (C32001cn A012 : this.A0B.getObservers()) {
            A012.A01(r3);
        }
    }

    public void BQH(AnonymousClass11F r5) {
        C220412q r1 = this.A0E;
        if (r1.A0M(r5)) {
            this.A04.A0F(r5, r1.A08(r5));
            this.A05.A00();
            C222813r r0 = UserJid.Companion;
            UserJid A002 = C222813r.A00(r5);
            if (A002 != null) {
                AnonymousClass1J9 r12 = this.A0D;
                AnonymousClass141 A0D2 = this.A0C.A0D(A002);
                for (C20430xY A092 : r12.getObservers()) {
                    A092.A09(A0D2);
                }
                if (A002 instanceof C223313w) {
                    this.A0I.Boy(new C35681j5(this, A002, 9));
                }
            }
        }
    }

    public void BQI() {
        this.A05.A00();
        this.A0A.A01();
    }

    public void BQJ(AnonymousClass11F r4, boolean z) {
        C24381Cf r0;
        C220412q r1 = this.A0E;
        boolean A0M = r1.A0M(r4);
        AnonymousClass1A6 r2 = this.A04;
        if (A0M) {
            if (!r2.A0F(r4, r1.A08(r4))) {
                r0 = this.A05;
                r0.A02(r4);
            }
            r0 = this.A05;
            r0.A00();
        } else {
            r2.A0D(r4);
            this.A0A.A01();
            r0 = this.A05;
            r0.A00();
        }
        if (z) {
            r0.A03(r4);
        }
    }

    public void BQL(AnonymousClass11F r2) {
        this.A04.A0D(r2);
        C24381Cf r0 = this.A05;
        r0.A00();
        r0.A03(r2);
    }

    public AnonymousClass1JC(AnonymousClass17Y r2, C26021Io r3, C25791Hr r4, C24361Cd r5, AnonymousClass16D r6, AnonymousClass1J9 r7, AnonymousClass1A6 r8, C220412q r9, C24381Cf r10, AnonymousClass12O r11, AnonymousClass1FV r12, AnonymousClass1C5 r13, AnonymousClass1DL r14, AnonymousClass1J1 r15, C19770wU r16, AnonymousClass005 r17, AnonymousClass005 r18, AnonymousClass004 r19) {
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A02 = r2;
        this.A0I = r16;
        this.A0E = r9;
        this.A0G = r14;
        this.A0A = r3;
        this.A0C = r6;
        this.A0H = r15;
        this.A06 = r11;
        this.A0F = r13;
        this.A01 = r17;
        this.A0B = r5;
        this.A0D = r7;
        this.A09 = r19;
        this.A04 = r8;
        this.A05 = r10;
        this.A07 = r12;
        this.A03 = r4;
        this.A08 = r18;
    }
}
