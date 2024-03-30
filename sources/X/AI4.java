package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class AI4 implements C236119d {
    public final /* synthetic */ AnonymousClass026 A00;
    public final /* synthetic */ AnonymousClass026 A01;
    public final /* synthetic */ AnonymousClass026 A02;
    public final /* synthetic */ C186018vH A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ C603937r A05;

    public void BWw(C203399nx r5, String str) {
        AnonymousClass00C.A0D(r5, 1);
        try {
            C203539oF.A0B(r5, C23213B9v.A00(C90514aH.A0e(r5, this.A03), 0));
            C22993Azj[] azjArr = new C22993Azj[7];
            azjArr[0] = C21478ANa.A00;
            azjArr[1] = C21479ANb.A00;
            azjArr[2] = C21480ANc.A00;
            azjArr[3] = C21481ANd.A00;
            azjArr[4] = C21482ANe.A00;
            azjArr[5] = C21483ANf.A00;
            ((B02) C203379ns.A06(r5, "IQErrorRateOverlimit|IQErrorBadRequest|IQErrorItemNotFound|IQErrorNotAuthorized|IQErrorForbidden|IQErrorLocked|IQErrorFallbackClient", C165567td.A0d(C21484ANg.A00, azjArr, 6), C165607th.A1a())).B05(new C197199bI(this.A01));
        } catch (C235919b e) {
            Log.w((Throwable) e);
            this.A01.accept(1);
        }
    }

    public void BiM(C203399nx r13, String str) {
        int i;
        C203399nx r5 = r13;
        AnonymousClass00C.A0D(r13, 1);
        try {
            C203539oF.A0B(r13, C23213B9v.A00(C90514aH.A0e(r13, this.A03), 1));
            C203539oF.A09(r5, C21485ANh.A00, new String[]{"leave", "group"}, 0, 1024);
            ArrayList A09 = C203539oF.A09(r5, C21486ANi.A00, new String[]{"leave", "linked_groups"}, 0, 1024);
            C203539oF.A09(r5, C21487ANj.A00, new String[]{"leave"}, 1, 1).get(0);
            ArrayList A0I = AnonymousClass001.A0I();
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator it = A09.iterator();
            while (it.hasNext()) {
                C184818t3 r1 = (C184818t3) it.next();
                AnonymousClass147 r2 = (AnonymousClass147) ((C184118rv) r1.A01).A00;
                AnonymousClass00C.A08(r2);
                C184008rk r0 = (C184008rk) r1.A00;
                if (r0 == null) {
                    A0I2.add(r2);
                } else {
                    C197569bv r12 = new C197569bv(r2, A0I);
                    int i2 = r0.A00;
                    List list = r12.A01;
                    AnonymousClass147 r22 = r12.A00;
                    if (2 - i2 != 0) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    list.add(new AnonymousClass344(r22, i));
                }
            }
            AnonymousClass345 r52 = new AnonymousClass345(A0I2, A0I);
            List list2 = r52.A01;
            if (C36401kF.A1a(list2)) {
                C603937r r3 = this.A05;
                r3.A00.A01(new C80263v7(list2, r3, 24));
            }
            if (r52.A00.isEmpty()) {
                this.A04.run();
            } else {
                this.A02.accept(r52);
            }
        } catch (Exception e) {
            this.A01.accept(1);
            throw e;
        }
    }

    public AI4(AnonymousClass026 r1, AnonymousClass026 r2, AnonymousClass026 r3, C603937r r4, C186018vH r5, Runnable runnable) {
        this.A03 = r5;
        this.A01 = r1;
        this.A04 = runnable;
        this.A02 = r2;
        this.A00 = r3;
        this.A05 = r4;
    }

    public void BVN(String str) {
        this.A00.accept(C36381kD.A0m());
    }
}
