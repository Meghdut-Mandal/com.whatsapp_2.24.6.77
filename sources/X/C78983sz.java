package X;

import java.util.Iterator;

/* renamed from: X.3sz  reason: invalid class name and case insensitive filesystem */
public class C78983sz implements C88594Th {
    public final AnonymousClass10P A00;
    public final C19420v0 A01;

    public /* synthetic */ void BRI() {
    }

    public void BRJ() {
        AnonymousClass10P r2 = this.A00;
        Iterator it = r2.A01().iterator();
        while (it.hasNext()) {
            r2.A03(AnonymousClass001.A0C(it));
        }
        C36331k8.A0w(C19420v0.A00(this.A01), "report_unhealthy_module", true);
    }

    public C78983sz(AnonymousClass10P r1, C19420v0 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
