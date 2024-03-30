package X;

import android.content.Context;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.3lT  reason: invalid class name and case insensitive filesystem */
public final class C74353lT implements C21010yW, C159457jO {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C19420v0 A03;
    public final C20810yC A04;
    public final C20960yR A05;
    public final C20880yJ A06;
    public final AnonymousClass005 A07;
    public final C20970yS A08;
    public final AnonymousClass005 A09;

    public C74353lT(C19420v0 r5, C20810yC r6, C20970yS r7, C20960yR r8, C20880yJ r9, AnonymousClass005 r10, AnonymousClass005 r11, int i) {
        AnonymousClass00C.A0D(r10, 1);
        C36321k7.A1A(r9, r8, r7, r11, 3);
        AnonymousClass00C.A0D(r5, 7);
        this.A07 = r10;
        this.A04 = r6;
        this.A06 = r9;
        this.A05 = r8;
        this.A08 = r7;
        this.A09 = r11;
        this.A03 = r5;
        boolean z = true;
        this.A01 = C36381kD.A1U(i, 3);
        this.A02 = i == 2 ? false : z;
    }

    private final Integer A00(C18950u5 r9, int i, boolean z) {
        C18950u5 r2 = r9;
        int A002 = this.A08.A00(i);
        if (A002 != 0) {
            int abs = Math.abs(A002);
            r2 = new C18950u5(abs, abs, abs, abs, false);
        } else {
            A002 = r9.A00;
            if (z) {
                A002 = -A002;
            }
        }
        if (r2.A00()) {
            return Integer.valueOf(A002);
        }
        return null;
    }

    public Integer B3I(C20890yK r3, C18950u5 r4, boolean z) {
        AnonymousClass00C.A0D(r3, 0);
        int i = r3.code;
        if (r4 == null) {
            r4 = r3.samplingRate;
        }
        return A00(r4, i, false);
    }

    public void BP7() {
        Bph(true);
    }

    public void BYo() {
        Bph(false);
    }

    public void Blu(C18950u5 r2, byte[] bArr, int i, int i2, boolean z) {
    }

    public void Blv(C20890yK r3) {
        Bls(r3, (C18950u5) null, true);
    }

    public void Blw(C20890yK r5) {
        AnonymousClass00C.A0D(r5, 0);
        A01(r5, 1);
        if (r5 instanceof WamCall) {
            C36321k7.A1K(r5, ": ", C36331k8.A0k("wamruntime/printevent", ""));
        }
    }

    public void Bly(C20890yK r3) {
        AnonymousClass00C.A0D(r3, 0);
        Bls(r3, (C18950u5) null, false);
    }

    public void Bro(int i) {
    }

    public void Buf() {
    }

    private final void A01(C20890yK r4, int i) {
        int i2 = r4.bufferChannel;
        if (i2 == 2 || i2 == 3) {
            if (!this.A02) {
                return;
            }
        } else if (i2 == 0 || i2 == 1) {
            if (!this.A01) {
                return;
            }
            this.A06.A01.execute(new C81333wq(this, i, 26, r4));
        }
        if (i2 == 3) {
            int[] iArr = C56372wB.A00;
            if (iArr[0] != r4.code) {
                return;
            }
        }
        this.A06.A01.execute(new C81333wq(this, i, 26, r4));
    }

    public void BKR(Context context, AnonymousClass14Z r6, C223714a r7, AnonymousClass005 r8, AnonymousClass005 r9, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C20810yC r1 = this.A04;
        synchronized (r1) {
            r1.A02 = this;
        }
        this.A06.A00.execute(new C80403vL(this, r7, context, 38));
        C20960yR r3 = this.A05;
        r3.A00.A00.execute(new C35721j9(r3, r6, 1));
    }

    public void Bd0() {
        ((C20270xI) this.A09.get()).A00(this);
    }

    public void Bko(int i) {
        JniBridge.jvidispatchIIO(6, (long) i, ((JniBridge) ((C219110w) this.A07.get())).wajContext.get());
    }

    public void Bls(C20890yK r5, C18950u5 r6, boolean z) {
        String str;
        int i = r5.code;
        if (r6 == null) {
            r6 = r5.samplingRate;
        }
        Integer A002 = A00(r6, i, z);
        if (A002 != null) {
            A01(r5, A002.intValue());
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("(sampled with weight ");
            str = AnonymousClass000.A0m(A002, A0u);
        } else {
            str = "(dropped)";
        }
        if (r5 instanceof WamCall) {
            C36321k7.A1K(r5, ": ", C36331k8.A0k("wamruntime/printevent", str));
        }
    }

    public void Bph(boolean z) {
        JniBridge.jvidispatchIO(6, ((JniBridge) ((C219110w) this.A07.get())).wajContext.get());
    }

    public void Blx(C20890yK r2, C18950u5 r3) {
        Bls(r2, r3, C36371kC.A1V(r3));
    }

    public void Blz(C20890yK r5, int i) {
        A01(r5, i);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("(with weight=");
        String A0G = C36321k7.A0G(A0u, i);
        if (r5 instanceof WamCall) {
            C36321k7.A1K(r5, ": ", C36331k8.A0k("wamruntime/printevent", A0G));
        }
    }
}
