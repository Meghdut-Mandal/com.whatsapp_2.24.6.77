package X;

import java.io.File;
import java.util.Random;

/* renamed from: X.6sb  reason: invalid class name and case insensitive filesystem */
public class C144656sb implements C30631aW {
    public final C133116Wv A00;
    public final C124745yj A01;

    public /* synthetic */ void BV2() {
    }

    public void BV3() {
        C133116Wv r1 = this.A00;
        if (!r1.A07.A03() || r1.A02.A05() == null || C133116Wv.A01(r1) == 5) {
            C124745yj r2 = this.A01;
            AnonymousClass12P r0 = r2.A05;
            r0.A06();
            if (r0.A08 && r2.A06.A0E(1456)) {
                Integer[] numArr = new Integer[5];
                numArr[0] = 1;
                numArr[1] = 3;
                numArr[2] = 2;
                AnonymousClass000.A1L(numArr, 20, 3);
                AnonymousClass000.A1L(numArr, 13, 4);
                Random random = r2.A0A;
                int A06 = C90524aI.A06(numArr, random.nextInt(5));
                File A0I = r2.A01.A0I(A06, 0, C90524aI.A06(new Integer[]{2, 1, 3}, random.nextInt(3)));
                C19770wU r9 = r2.A09;
                C19700wN r3 = r2.A00;
                C21010yW r7 = r2.A07;
                AnonymousClass1Ax r8 = r2.A08;
                C36391kE.A1Q(new AnonymousClass5MY(r3, r2.A02, r2.A03, r2.A04, r7, r8, r9, A0I, A06), r9);
            }
        }
    }

    public C144656sb(C133116Wv r1, C124745yj r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
