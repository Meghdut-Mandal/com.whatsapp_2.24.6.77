package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.1PG  reason: invalid class name */
public final class AnonymousClass1PG implements C19710wO {
    public final AnonymousClass16D A00;
    public final C19420v0 A01;
    public final C20810yC A02;
    public final AnonymousClass164 A03;
    public final AnonymousClass17X A04;

    public AnonymousClass1PG(AnonymousClass164 r2, AnonymousClass16D r3, C19420v0 r4, AnonymousClass17X r5, C20810yC r6) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r3, 4);
        AnonymousClass00C.A0D(r5, 5);
        this.A02 = r6;
        this.A03 = r2;
        this.A01 = r4;
        this.A00 = r3;
        this.A04 = r5;
    }

    public final void A00(AnonymousClass147 r3) {
        AnonymousClass00C.A0D(r3, 0);
        this.A03.A01(new C156777ag(r3.getRawString()));
    }

    public final void A01(Set set) {
        AnonymousClass00C.A0D(set, 0);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass147 r1 = (AnonymousClass147) it.next();
            AnonymousClass141 A0A = this.A00.A0A(r1);
            if (A0A != null && A0A.A12 && this.A04.A0D(r1)) {
                A00(r1);
            }
        }
    }

    public /* synthetic */ void BRL() {
    }

    public void BRM() {
        C19420v0 r5 = this.A01;
        int A0O = r5.A0O("group_join_request_startup_sync_count", 0);
        int A002 = C20800yB.A00(C21000yV.A02, this.A02, 2868);
        if (A0O < A002) {
            Log.i("GroupMembershipApprovalRequestsManager/ starting jobs to reSync pending membership approval requests for all eligible groups.");
            r5.A1c("group_join_request_startup_sync_count", A002);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (AnonymousClass141 A06 : C007103b.A0V(this.A00.A05.A0P())) {
                Jid A062 = A06.A06(AnonymousClass147.class);
                if (A062 != null) {
                    linkedHashSet.add(A062);
                }
            }
            A01(linkedHashSet);
        }
    }

    public String BIB() {
        return new C019308f(getClass()).toString();
    }
}
