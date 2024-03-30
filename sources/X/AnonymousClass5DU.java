package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5DU  reason: invalid class name */
public class AnonymousClass5DU extends C95884mR {
    public final C19460v5 A00;
    public final C115775jQ A01;
    public final C115785jR A02;
    public final C115795jS A03;
    public final C115805jT A04;
    public final C115815jU A05;
    public final C115825jV A06;

    public C46482Xv A0N(ViewGroup viewGroup, int i) {
        if (i == 57) {
            View A0E = C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved);
            ImageView A0G = C36401kF.A0G(A0E, R.id.education_icon);
            Drawable A012 = AnonymousClass08I.A01(A0G.getBackground());
            AnonymousClass076.A06(A012, AnonymousClass00F.A00(A0E.getContext(), R.color.f6nameremoved));
            A0G.setBackground(A012);
            C90504aG.A11(A0E.getContext(), A0G, R.color.f6nameremoved);
            return new AnonymousClass5ET(A0E);
        } else if (i == 71) {
            List list = AnonymousClass0D3.A0I;
            return new C46452Xm(C36371kC.A0J(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved, false));
        } else if (i != 79) {
            switch (i) {
                case 59:
                    break;
                case AnonymousClass8SX.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER /*60*/:
                    C115805jT r3 = this.A04;
                    List list2 = AnonymousClass0D3.A0I;
                    return new AnonymousClass5F8(C36341k9.A0J(viewGroup, 0).inflate(R.layout.f9nameremoved, viewGroup, false), C36341k9.A0T(r3.A00.A02));
                case 61:
                    List list3 = AnonymousClass0D3.A0I;
                    return new AnonymousClass5ER(C36371kC.A0J(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved, false));
                case 62:
                    C115795jS r32 = this.A03;
                    View A0E2 = C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved);
                    C18800tq r0 = r32.A00.A02;
                    return new AnonymousClass5FD(A0E2, C36341k9.A0V(r0), (C117555mS) r0.A00.A26.get());
                case 63:
                    C115785jR r33 = this.A02;
                    List list4 = AnonymousClass0D3.A0I;
                    View A0J = C36371kC.A0J(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved, false);
                    C18800tq r02 = r33.A00.A02;
                    C20810yC A0V = C36341k9.A0V(r02);
                    return new AnonymousClass2Xt(A0J, C36351kA.A0J(r02), C36351kA.A0M(r02), C36351kA.A0U(r02), A0V);
                case 64:
                    List list5 = AnonymousClass0D3.A0I;
                    return new AnonymousClass5ES(C36371kC.A0J(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved, false));
                default:
                    switch (i) {
                        case 66:
                            return new C46482Xv(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
                        case AnonymousClass8SX.BOT_INVOKE_MESSAGE_FIELD_NUMBER /*67*/:
                            break;
                        case 68:
                            return new C46462Xn(C95884mR.A00(viewGroup));
                        case AnonymousClass8SX.CALL_LOG_MESSSAGE_FIELD_NUMBER /*69*/:
                            C115775jQ r1 = this.A01;
                            List list6 = AnonymousClass0D3.A0I;
                            return new AnonymousClass5FL(viewGroup, C27111My.A2f(r1.A00.A00));
                        default:
                            return super.BUw(viewGroup, i);
                    }
            }
            return new C105435Eq(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
        } else {
            C115825jV r12 = this.A06;
            List list7 = AnonymousClass0D3.A0I;
            return new AnonymousClass5FK(viewGroup, C27111My.A2f(r12.A00.A00));
        }
    }

    public AnonymousClass5DU(C19460v5 r1, C115715jK r2, C115725jL r3, C115775jQ r4, C115785jR r5, C115795jS r6, C115805jT r7, C115815jU r8, C115825jV r9) {
        super(r1, r2, r3);
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A05 = r8;
        this.A04 = r7;
        this.A06 = r9;
        this.A00 = r1;
    }
}
