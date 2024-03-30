package X;

import android.app.ActivityManager;
import android.content.Context;
import java.util.Set;

/* renamed from: X.9Oi  reason: invalid class name and case insensitive filesystem */
public final class C194159Oi {
    public final C193819Mz A00;
    public final C22866AxL A01;
    public final C22781Avs A02;
    public final AnonymousClass94H A03;
    public final C22783Avu A04;
    public final C22784Avv A05;
    public final AnonymousClass9JH A06;
    public final AnonymousClass94J A07;
    public final C192249Gg A08;
    public final Context A09;
    public final C193819Mz A0A;
    public final C22866AxL A0B;
    public final C22866AxL A0C;
    public final C1904298j A0D;
    public final C1904398k A0E;
    public final AnonymousClass9CK A0F;
    public final AnonymousClass9CL A0G;
    public final C129976Jf A0H;
    public final Set A0I;
    public final Set A0J;
    public final Set A0K;

    /* JADX INFO: finally extract failed */
    public C194159Oi(AnonymousClass9LK r5) {
        C1904298j r0;
        C1904398k r02;
        C20964A0x a0x;
        C196489Zw.A00();
        this.A06 = new AnonymousClass9JH(r5.A03);
        Context context = r5.A02;
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            this.A01 = new C20963A0w((ActivityManager) systemService);
            this.A04 = new A1U();
            synchronized (C1904298j.class) {
                r0 = C1904298j.A00;
                if (r0 == null) {
                    r0 = new C1904298j();
                    C1904298j.A00 = r0;
                }
            }
            this.A0D = r0;
            this.A09 = context;
            this.A0F = new AnonymousClass9CK(new AnonymousClass94I());
            synchronized (C1904398k.class) {
                r02 = C1904398k.A00;
                if (r02 == null) {
                    r02 = new C1904398k();
                    C1904398k.A00 = r02;
                }
            }
            this.A0E = r02;
            C22866AxL axL = AnonymousClass9AH.A00;
            AnonymousClass00C.A09(axL);
            this.A0B = axL;
            C22866AxL axL2 = AnonymousClass9AH.A01;
            AnonymousClass00C.A09(axL2);
            this.A0C = axL2;
            try {
                C196489Zw.A00();
                C193819Mz r03 = new C193819Mz(new AnonymousClass9J7(context));
                C196489Zw.A00();
                this.A00 = r03;
                synchronized (C20964A0x.class) {
                    a0x = C20964A0x.A00;
                    if (a0x == null) {
                        a0x = new C20964A0x();
                        C20964A0x.A00 = a0x;
                    }
                }
                this.A02 = a0x;
                C196489Zw.A00();
                this.A0H = new C129976Jf(30000);
                new AnonymousClass94L();
                this.A08 = new C192249Gg(new C193969Np());
                this.A0G = new AnonymousClass9CL();
                C004702c r04 = C004702c.A00;
                this.A0K = r04;
                this.A0J = r04;
                this.A0I = r04;
                this.A0A = this.A00;
                this.A05 = new A1Z(this.A08.A01.A02.A00);
                this.A07 = r5.A00;
                this.A03 = new AnonymousClass94H();
                C196489Zw.A00();
            } catch (Throwable th) {
                C196489Zw.A00();
                throw th;
            }
        } else {
            throw AnonymousClass001.A09("Required value was null.");
        }
    }
}
