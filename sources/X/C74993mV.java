package X;

import android.util.Base64;
import com.whatsapp.report.activity.banreport.BanReportViewModel;
import java.io.IOException;

/* renamed from: X.3mV  reason: invalid class name and case insensitive filesystem */
public class C74993mV implements C160087kR {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BanReportViewModel A01;

    public C74993mV(BanReportViewModel banReportViewModel, int i) {
        this.A01 = banReportViewModel;
        this.A00 = i;
    }

    public void B2J(C123815x8 r23) {
        Object obj;
        C123815x8 r0 = r23;
        C1257160z r1 = r0.A03;
        int i = r0.A00;
        Integer A0i = C36361kB.A0i();
        if (i == 0 && (obj = r1.A00) != null) {
            AnonymousClass35T r3 = (AnonymousClass35T) obj;
            String str = r3.A01;
            if ("AVAILABLE".equals(str)) {
                AnonymousClass3AL r32 = r3.A00;
                if (r32 != null) {
                    BanReportViewModel banReportViewModel = this.A01;
                    banReportViewModel.A06.A0A(new C75573nS(banReportViewModel), C25471Gl.A0A, (C25711Hj) null, (C25711Hj) null, r32.A03, r32.A04, r32.A02, r32.A06, r32.A01, (String) null, Base64.decode(r32.A05, 2), 2, 1, 10, 2, (long) r32.A00);
                    return;
                }
            } else {
                boolean equals = "PENDING".equals(str);
                BanReportViewModel banReportViewModel2 = this.A01;
                if (equals) {
                    int i2 = this.A00 + 1;
                    C36341k9.A0H().postDelayed(new C81293wm((Object) banReportViewModel2, i2, 13), ((long) i2) * 5000);
                    return;
                }
                AnonymousClass30Q r02 = banReportViewModel2.A05;
                String str2 = banReportViewModel2.A00;
                AnonymousClass1U2 r33 = r02.A00;
                C18800tq r12 = r33.A00;
                C20050ww A0U = C36381kD.A0U(r12);
                C19420v0 A0Y = C36351kA.A0Y(r12);
                AnonymousClass005 A002 = C18840tu.A00(r12.A96);
                C20810yC A0V = C36341k9.A0V(r12);
                AnonymousClass1U1 r03 = r33.A01;
                new AnonymousClass2dG(A0U, A0Y, A0V, (C20020wt) r12.A8i.get(), A002, str2, r03.A17, r03.A0D).Blp(new AnonymousClass3SQ(this, 1));
                return;
            }
        }
        this.A01.A02.A0C(A0i);
    }

    public void BVL(IOException iOException) {
        C36341k9.A17(this.A01.A02, 1);
    }

    public void BWk(Exception exc) {
        C36341k9.A17(this.A01.A02, 1);
    }
}
