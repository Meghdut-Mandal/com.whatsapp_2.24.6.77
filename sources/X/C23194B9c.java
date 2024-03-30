package X;

import java.util.ArrayList;

/* renamed from: X.B9c  reason: case insensitive filesystem */
public class C23194B9c implements C22973AzP {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    public C23194B9c(Object obj, Object obj2, String str, String str2, int i) {
        this.A04 = i;
        this.A00 = obj2;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = obj;
    }

    public final void BfA(C194449Pt r15) {
        int i = this.A04;
        C200959iX r5 = (C200959iX) this.A00;
        String str = this.A02;
        String str2 = this.A03;
        if (i != 0) {
            r5.A06.A00(new AEM(r5, r15, (AnonymousClass9SY) this.A01, str2), r15, str);
            return;
        }
        AnonymousClass9SJ r2 = r5.A06;
        String[] A1S = C36441kJ.A1S();
        C90494aF.A1H(str, str2, A1S);
        AEO aeo = new AEO((C22974AzQ) this.A01, r5, r15);
        if ("token".equals(r15.A00.A03)) {
            C194919Rt r8 = new C194919Rt(aeo);
            int i2 = 0;
            do {
                ArrayList A0I = AnonymousClass001.A0I();
                C36341k9.A1H("fbpay_pin", A1S[i2], A0I);
                C19770wU r0 = r2.A05;
                C117705mh r10 = r2.A03;
                C24601Db r6 = r2.A01;
                C111495cN r11 = r2.A04;
                C36391kE.A1Q(new AnonymousClass8g1(r2.A00, r6, r2.A02, r8, (B1H) null, r10, r11, A0I, i2), r0);
                i2++;
            } while (i2 < 2);
            return;
        }
        aeo.BiL(A1S);
    }
}
