package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: X.3SO  reason: invalid class name */
public class AnonymousClass3SO implements C160087kR {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass3SO(C88624Tk r1, C65563So r2, int i) {
        this.A02 = i;
        this.A00 = r2;
        this.A01 = r1;
    }

    public void B2J(C123815x8 r6) {
        if (2 - this.A02 != 0) {
            C65563So r4 = (C65563So) this.A00;
            C88624Tk r3 = (C88624Tk) this.A01;
            C45982Ug r1 = (C45982Ug) r6.A03;
            if (r6.A00 == 0) {
                try {
                    AnonymousClass37Y A04 = r1.A04((JSONObject) r1.A00);
                    C65563So.A01(r4, A04);
                    Log.i("BanAppealRepository/clearFormReviewDraft");
                    C36341k9.A0u(C19420v0.A00(r4.A06), "support_ban_appeal_form_review_draft");
                    r3.BiA(A04);
                } catch (Exception unused) {
                    C65563So.A00(r6, r3);
                }
            } else {
                C65563So.A00(r6, r3);
            }
        } else {
            C65563So r32 = (C65563So) this.A00;
            C88624Tk r2 = (C88624Tk) this.A01;
            C45982Ug r12 = (C45982Ug) r6.A03;
            if (r6.A00 == 0) {
                try {
                    AnonymousClass37Y A042 = r12.A04((JSONObject) r12.A00);
                    C65563So.A01(r32, A042);
                    r2.BiA(A042);
                } catch (Exception unused2) {
                    C65563So.A00(r6, r2);
                }
            } else {
                C65563So.A00(r6, r2);
            }
        }
    }

    public void BVL(IOException iOException) {
        ((C88624Tk) this.A01).BXN(C36361kB.A0j());
    }

    public void BWk(Exception exc) {
        ((C88624Tk) this.A01).BXN(C36361kB.A0j());
    }
}
