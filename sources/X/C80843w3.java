package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.3w3  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80843w3 implements Runnable {
    public final /* synthetic */ AnonymousClass1X4 A00;
    public final /* synthetic */ AnonymousClass4R0 A01;
    public final /* synthetic */ AnonymousClass2bU A02;
    public final /* synthetic */ AnonymousClass33E A03;
    public final /* synthetic */ AnonymousClass3SC A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ byte[] A09;

    public /* synthetic */ C80843w3(AnonymousClass1X4 r1, AnonymousClass4R0 r2, AnonymousClass2bU r3, AnonymousClass33E r4, AnonymousClass3SC r5, Integer num, byte[] bArr, boolean z, boolean z2, boolean z3) {
        this.A00 = r1;
        this.A09 = bArr;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A05 = num;
        this.A03 = r4;
    }

    public final void run() {
        AnonymousClass1X4 r14 = this.A00;
        byte[] bArr = this.A09;
        AnonymousClass3SC r10 = this.A04;
        AnonymousClass4R0 r9 = this.A01;
        AnonymousClass2bU r8 = this.A02;
        boolean z = this.A06;
        boolean z2 = this.A07;
        boolean z3 = this.A08;
        Integer num = this.A05;
        AnonymousClass33E r4 = this.A03;
        AnonymousClass2bU A012 = r10.A01();
        C63683Kz A0V = A012.A0V();
        if (bArr == null && A0V != null && A012.A1Q()) {
            bArr = A0V.A02();
        }
        List A0Y = C007103b.A0Y(r10.A02);
        Iterator it = A0Y.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            if (C64933Qa.A04(A0l)) {
                C29861Yg r15 = (C29861Yg) r14.A1P.get();
                r15.A07.Boy(new C35741jB(r15, A0l, 30));
            } else {
                r14.A0X.A0m(A0l, 1);
            }
        }
        AnonymousClass3Ot r16 = new AnonymousClass3Ot(num, true, r10.A05(), r10.A04());
        AnonymousClass2bU r17 = r8;
        AnonymousClass4R0 r152 = r9;
        r14.A0q.A07(r152, r16, r17, r10, bArr, true, z, z2, z3);
        C79593ty r1 = new AnonymousClass33E().A00;
        r1.A0C(A0Y);
        AnonymousClass00C.A0D(r4, 0);
        C79593ty.A00(r1, r4, 21);
    }
}
