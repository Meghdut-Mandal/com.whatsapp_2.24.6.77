package X;

import android.content.Context;
import android.os.ConditionVariable;

/* renamed from: X.6sV  reason: invalid class name and case insensitive filesystem */
public class C144596sV implements AnonymousClass1FP {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass17Y A02;
    public final C19730wQ A03;
    public final C24461Cn A04;
    public final C24431Ck A05;
    public final C65653Sy A06;
    public final C236519h A07;
    public final C19970wo A08;
    public final C19630wG A09;
    public final C19420v0 A0A;
    public final C18820ts A0B;
    public final AnonymousClass5FU A0C = new AnonymousClass5FU();
    public final AnonymousClass1Q9 A0D;
    public final C20810yC A0E;
    public final C21010yW A0F;
    public final AnonymousClass1G4 A0G;
    public final C19770wU A0H;
    public final C21570zS A0I;
    public final C24331Ca A0J;
    public final C227815t A0K;
    public final AnonymousClass1G5 A0L;
    public final C24341Cb A0M;
    public final C21060yb A0N;
    public final AnonymousClass190 A0O;
    public final C24391Cg A0P;
    public final C21380z9 A0Q;
    public final AnonymousClass005 A0R;
    public volatile int A0S;

    public static boolean A00(C144596sV r2, boolean z) {
        C19730wQ r1 = r2.A03;
        r1.A0G();
        if (r1.A00 == null || r1.A0L() || !r2.A00 || !z || r2.A0M.A02() || !r2.A0K.A00.A01()) {
            return false;
        }
        return true;
    }

    public void A01() {
        if (A00(this, this.A0G.A01())) {
            AnonymousClass2RM r3 = new AnonymousClass2RM();
            r3.A05 = C90484aE.A0g();
            r3.A04 = C36361kB.A0j();
            A02(new C144986tA((ConditionVariable) null, this, r3), 1);
        }
    }

    public void A02(C160417ky r19, int i) {
        long j;
        AnonymousClass5FU r10 = this.A0C;
        r10.registerObserver(r19);
        int i2 = i;
        if (i == 0) {
            j = 3000;
        } else {
            j = -1;
        }
        Context context = this.A09.A00;
        C19970wo r8 = this.A08;
        AnonymousClass005 r14 = this.A0R;
        C21060yb r7 = this.A0N;
        C24331Ca r5 = this.A0J;
        AnonymousClass1Q9 r11 = this.A0D;
        C21380z9 r13 = this.A0Q;
        this.A02.Bp3(new C81193wc(this, new C107125Mq(context, r5, this.A0L, r7, r8, this, r10, r11, this.A0P, r13, r14, i2, j), 18));
    }

    public void BYy() {
        A01();
    }

    public C144596sV(AnonymousClass17Y r3, C19730wQ r4, C24331Ca r5, C24461Cn r6, C24431Ck r7, C65653Sy r8, C227815t r9, AnonymousClass1G5 r10, C236519h r11, C24341Cb r12, C21060yb r13, C19970wo r14, C19630wG r15, C19420v0 r16, C18820ts r17, AnonymousClass1Q9 r18, C20810yC r19, C21010yW r20, AnonymousClass190 r21, AnonymousClass1G4 r22, C24391Cg r23, C19770wU r24, C21380z9 r25, C21570zS r26, AnonymousClass005 r27) {
        this.A09 = r15;
        this.A08 = r14;
        this.A0E = r19;
        this.A02 = r3;
        this.A07 = r11;
        this.A03 = r4;
        this.A0O = r21;
        this.A0H = r24;
        this.A0F = r20;
        this.A0R = r27;
        this.A0N = r13;
        this.A0B = r17;
        this.A0I = r26;
        this.A05 = r7;
        this.A0J = r5;
        this.A0M = r12;
        this.A06 = r8;
        this.A0D = r18;
        this.A0A = r16;
        this.A0K = r9;
        this.A0Q = r25;
        this.A04 = r6;
        AnonymousClass1G4 r1 = r22;
        this.A0G = r1;
        this.A0P = r23;
        this.A0L = r10;
        r1.registerObserver(new C148416yp(r14, this));
    }
}
