package X;

import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.6zM  reason: invalid class name and case insensitive filesystem */
public class C148746zM implements C88594Th {
    public final AnonymousClass196 A00;
    public final AnonymousClass1IZ A01;
    public final C144576sT A02;
    public final AnonymousClass1AK A03;

    public /* synthetic */ void BRJ() {
    }

    public void BRI() {
        AnonymousClass53z r1;
        Log.i("SyncdAsyncAppUpdatedObserver/onAsyncAppUpdated");
        AnonymousClass196 r3 = this.A00;
        if (r3.A0S()) {
            this.A01.A00();
            AnonymousClass1AK r6 = this.A03;
            synchronized (r6) {
                Iterator it = AnonymousClass1AC.A03(AAQ.A00, r6.A00, "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE are_dependencies_missing = 1 ORDER BY _id ASC", "SyncdMutationsTable.SELECT_ALL_MUTATIONS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES", (String[]) null).iterator();
                while (it.hasNext()) {
                    r6.A03((C201669k5) it.next());
                }
            }
            r3.A0E();
            C144576sT r12 = this.A02;
            AnonymousClass196 r2 = r12.A01;
            if (r2.A0S() && !r12.A00.A0L() && (r1 = (AnonymousClass53z) r12.A02.A00("primary_version")) != null) {
                r2.A0M(Collections.singleton(r1.A0I("current")));
            }
            r3.A0G();
        }
    }

    public C148746zM(AnonymousClass196 r1, AnonymousClass1IZ r2, C144576sT r3, AnonymousClass1AK r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }
}
