package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.7zf  reason: invalid class name and case insensitive filesystem */
public class C168077zf extends AnonymousClass0CZ {
    public final C19730wQ A00;
    public final AnonymousClass1LB A01;
    public final C196089Xp A02;
    public final C27731Pn A03;
    public final C21060yb A04;
    public final C19630wG A05;
    public final C18820ts A06;
    public final C20810yC A07;
    public final AnonymousClass1EV A08;
    public final AnonymousClass1FR A09;
    public final C32681e1 A0A;
    public final AnonymousClass1SV A0B;
    public final C19770wU A0C;
    public final List A0D = AnonymousClass001.A0I();

    public int A0J() {
        return this.A0D.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r2, int i) {
        ((AnonymousClass80E) r2).A0B((AnonymousClass9FT) this.A0D.get(i));
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass9FT) this.A0D.get(i)).A00;
    }

    public C168077zf(C19730wQ r2, AnonymousClass1LB r3, C196089Xp r4, C27731Pn r5, C21060yb r6, C19630wG r7, C18820ts r8, C20810yC r9, AnonymousClass1EV r10, AnonymousClass1FR r11, C32681e1 r12, AnonymousClass1SV r13, C19770wU r14) {
        this.A05 = r7;
        this.A07 = r9;
        this.A0A = r12;
        this.A09 = r11;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A08 = r10;
        this.A06 = r8;
        this.A0B = r13;
        this.A00 = r2;
        this.A01 = r3;
        this.A0C = r14;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new C179558kK(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), this.A03);
            case 1:
            case 12:
                return new C179598kO(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), this.A09);
            case 2:
                C196089Xp r3 = this.A02;
                C18820ts r4 = this.A06;
                AnonymousClass1SV r6 = this.A0B;
                return new C179608kP(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), r3, r4, this.A07, r6, this.A0C);
            case 3:
                C20810yC r42 = this.A07;
                C32681e1 r62 = this.A0A;
                AnonymousClass1FR r5 = this.A09;
                return new C179628kR(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), this.A04, r42, r5, r62);
            case 4:
                return new C179578kM(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), this.A05);
            case 5:
                return new C179618kQ(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), this.A06, this.A08);
            case 6:
                return new C179568kL(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), this.A01);
            case 7:
                return new C179548kJ(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
            case 8:
                return new C179488kD(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
            case 9:
                return new C179508kF(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
            case 10:
                return new C179498kE(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
            case 11:
                return new C179468kB(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
            case 14:
                return new C179528kH(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
            case 15:
                List list = AnonymousClass0D3.A0I;
                return new C179588kN(C36371kC.A0J(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved, false));
            case 16:
                List list2 = AnonymousClass0D3.A0I;
                return new C179518kG(C36371kC.A0J(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved, false));
            case 17:
                List list3 = AnonymousClass0D3.A0I;
                return new C179478kC(C36371kC.A0J(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved, false));
            case 18:
                List list4 = AnonymousClass0D3.A0I;
                return new C179538kI(C36371kC.A0J(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved, false));
            default:
                throw AnonymousClass001.A09("PaymentCheckoutOrderDetailsAdapter/onCreateViewHolder/unhandled view type");
        }
    }
}
