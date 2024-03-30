package X;

import android.content.Context;
import android.os.Handler;
import com.whatsapp.R;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2ew  reason: invalid class name and case insensitive filesystem */
public final class C47542ew extends AnonymousClass3LJ implements C88584Tg {
    public float A00;
    public C37161lu A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C46812bi A08;
    public final C38331oM A09;
    public final AnonymousClass3S6 A0A;
    public final C77963rL A0B;
    public final AnonymousClass30J A0C;
    public final AnonymousClass3QH A0D;

    public void A0G() {
        C65013Qj r0;
        File file;
        this.A06 = false;
        this.A05 = false;
        this.A00 = 0.0f;
        this.A03 = false;
        AnonymousClass3S6 r1 = this.A0A;
        List list = r1.A02;
        if (list == null) {
            list = AnonymousClass001.A0I();
            r1.A02 = list;
        }
        list.add(this);
        if (!(this.A01 != null || (r0 = this.A08.A01) == null || (file = r0.A0I) == null)) {
            C18800tq r2 = this.A0C.A00.A00;
            C19630wG A0W = C36351kA.A0W(r2);
            C20810yC A0V = C36341k9.A0V(r2);
            C19700wN A0V2 = C36391kE.A0V(r2);
            C19970wo A0V3 = C36351kA.A0V(r2);
            new C55462uf();
            C37161lu r3 = new C37161lu(A0V2, A0V3, A0W, A0V, this, C18840tu.A00(r2.A00.A1z), file);
            this.A01 = r3;
            if (r3.A02 == null) {
                r3.start();
                Handler handler = new Handler(r3.getLooper());
                C81173wa.A00(handler, r3, 34);
                C81173wa.A00(handler, r3, 29);
                r3.A02 = handler;
            }
        }
        if (!this.A02 && this.A05.A01.A06) {
            this.A02 = true;
            r1.A03(this);
        }
        AnonymousClass3QH.A00(this.A0D, R.string.f12nameremoved);
    }

    public void BRU(boolean z) {
        A00(this, false);
    }

    public void BRW(int i, int i2, int i3) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47542ew(C24791Du r12, AnonymousClass30J r13, AnonymousClass17Y r14, AnonymousClass1RY r15, C21060yb r16, C18820ts r17, AnonymousClass1SU r18, AnonymousClass3T1 r19, AnonymousClass3G7 r20, AnonymousClass3S6 r21, AnonymousClass3QH r22) {
        super(r12, r14, r16, r17, r18, r20);
        AnonymousClass3T1 r3 = r19;
        this.A0A = r21;
        this.A0C = r13;
        this.A0D = r22;
        C18740tg.A06(r3);
        C46812bi r32 = (C46812bi) r3;
        this.A08 = r32;
        Context A0B2 = A0B();
        C36321k7.A0w(A0B2, r32);
        C38331oM r2 = new C38331oM(A0B2);
        r2.setMessage(r32, r15);
        this.A09 = r2;
        this.A0B = new C77963rL(r32, r2.getWavesView());
        r2.setId(R.id.status_playback_voice);
    }

    public static final void A00(C47542ew r7, boolean z) {
        C37161lu r2;
        C37161lu r22;
        Handler handler;
        int i;
        Handler handler2;
        if (r7.A03 && (r2 = r7.A01) != null) {
            if (z) {
                AnonymousClass3QH r6 = r7.A0D;
                if (System.currentTimeMillis() - r6.A00 > 2000) {
                    r6.A00 = System.currentTimeMillis();
                    r6.A02.A06(R.string.f12nameremoved, 0);
                }
                r22 = r7.A01;
                if (!(r22 == null || (handler = r22.A02) == null)) {
                    i = 33;
                }
            } else {
                if (r7.A07 && (handler2 = r2.A02) != null) {
                    C81173wa.A00(handler2, r2, 32);
                }
                r22 = r7.A01;
                if (!(r22 == null || (handler = r22.A02) == null)) {
                    i = 36;
                }
            }
            C81173wa.A00(handler, r22, i);
        }
        r7.A07 = z;
    }

    public long A0A() {
        return TimeUnit.SECONDS.toMillis((long) this.A08.A0B);
    }

    public void A0H() {
        Handler handler;
        C37161lu r2 = this.A01;
        if (!(r2 == null || (handler = r2.A02) == null)) {
            C81173wa.A00(handler, r2, 35);
        }
        this.A01 = null;
        AnonymousClass3S6 r1 = this.A0A;
        r1.A02(this);
        this.A02 = false;
        List list = r1.A02;
        if (list != null) {
            list.remove(this);
        }
        this.A06 = true;
    }
}
