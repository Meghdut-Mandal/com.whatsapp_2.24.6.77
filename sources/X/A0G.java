package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class A0G implements C22861AxD {
    public B5W A00;
    public final long A01;
    public final AnonymousClass904 A02;
    public final C195979Xa A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;
    public final /* synthetic */ AnonymousClass9NV A06;

    public B39 B4R() {
        B39 r3;
        B39 a0n;
        C195979Xa r1 = this.A03;
        if (1 == r1.A01) {
            a0n = new AnonymousClass83D();
        } else {
            AnonymousClass904 r15 = this.A02;
            AnonymousClass904 r10 = AnonymousClass904.PROGRESSIVE;
            if (r15 == r10 && AnonymousClass94D.A00(r1.A0F.A05)) {
                AnonymousClass9NV r0 = this.A06;
                a0n = new A0N(r0.A00, this.A00, r0.A04.userAgent);
            } else if (r15 == AnonymousClass904.DASH_TEXT) {
                boolean A002 = AnonymousClass94D.A00(r1.A0F.A04);
                AnonymousClass9NV r02 = this.A06;
                if (A002) {
                    r3 = new A0N(r02.A00, this.A00, r02.A04.userAgent);
                } else {
                    r3 = new AnonymousClass83J((AnonymousClass9GM) null, (B2E) null, r02.A04.userAgent, 8000, 8000);
                }
                return new A0J(r3);
            } else {
                AnonymousClass9NV r4 = this.A06;
                C201619jy r12 = r4.A01;
                C207239um r11 = r1.A0F;
                String str = r11.A0H;
                String str2 = r11.A0B;
                String str3 = r11.A0C;
                AtomicBoolean atomicBoolean = this.A05;
                boolean z = false;
                C201379jQ r16 = new C201379jQ(r1.A05, r11.A06, str, str2, str3, atomicBoolean, r11.A0M);
                if (r15 == r10) {
                    z = true;
                }
                Map map = r11.A0I;
                B5W b5w = this.A00;
                return new A0J(r12.A02(r4.A03, b5w, r15, r16, r4.A05, map, atomicBoolean, 0, 8000, C202509m3.A00(r4.A02, 0), false, z, false));
            }
        }
        return new A0J(a0n);
    }

    public A0G(AnonymousClass904 r2, C195979Xa r3, AnonymousClass9NV r4, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, long j) {
        this.A06 = r4;
        this.A01 = j;
        this.A03 = r3;
        this.A02 = r2;
        this.A05 = atomicBoolean;
        this.A04 = atomicBoolean2;
        this.A00 = r3.A04;
    }
}
