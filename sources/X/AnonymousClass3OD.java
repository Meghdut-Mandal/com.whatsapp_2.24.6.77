package X;

import com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager;
import java.util.Map;

/* renamed from: X.3OD  reason: invalid class name */
public final class AnonymousClass3OD {
    public final AnonymousClass17Y A00;
    public final AnonymousClass1RU A01;
    public final C1260362h A02;
    public final AnonymousClass66E A03;
    public final WfsNativeAuthManager A04;
    public final C19970wo A05;
    public final C19420v0 A06;
    public final AnonymousClass189 A07;
    public final C21510zM A08;
    public final AnonymousClass3UV A09;
    public final AnonymousClass3TX A0A;
    public final C19770wU A0B;
    public final Map A0C;
    public final C005502l A0D;
    public final AnonymousClass040 A0E;
    public final C130936Na A0F;

    public AnonymousClass3OD(AnonymousClass17Y r12, AnonymousClass1RU r13, C1260362h r14, AnonymousClass66E r15, WfsNativeAuthManager wfsNativeAuthManager, C19970wo r17, C19420v0 r18, AnonymousClass189 r19, C130936Na r20, C21510zM r21, AnonymousClass3UV r22, AnonymousClass3TX r23, C19770wU r24, Map map, C005502l r26, AnonymousClass040 r27) {
        C19770wU r3 = r24;
        C36321k7.A0x(r3, r12);
        AnonymousClass3UV r5 = r22;
        C130936Na r7 = r20;
        C36331k8.A1H(r5, r7);
        C21510zM r6 = r21;
        AnonymousClass189 r8 = r19;
        C19420v0 r9 = r18;
        C19970wo r10 = r17;
        C36321k7.A1C(r8, r10, r6, r9, r13);
        AnonymousClass040 r0 = r27;
        Map map2 = map;
        AnonymousClass3TX r4 = r23;
        C36321k7.A15(map2, r4, r0);
        C005502l r1 = r26;
        C36361kB.A1L(r1, r15);
        this.A0B = r3;
        this.A00 = r12;
        this.A04 = wfsNativeAuthManager;
        this.A09 = r5;
        this.A0F = r7;
        this.A07 = r8;
        this.A05 = r10;
        this.A08 = r6;
        this.A06 = r9;
        this.A01 = r13;
        this.A0C = map2;
        this.A0A = r4;
        this.A0E = r0;
        this.A0D = r1;
        this.A03 = r15;
        this.A02 = r14;
    }

    public static final void A00(C88424Sq r3, AnonymousClass3OD r4, Exception exc) {
        AnonymousClass3TI.A02("WfsManager launchWfsFlow error", exc);
        r4.A00.Bp3(new C1497172m(r3, 4));
    }
}
