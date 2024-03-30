package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.Aug  reason: case insensitive filesystem */
public final class C22727Aug extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient C19700wN A00;
    public transient C20350xQ A01;
    public transient C201159iy A02;
    public transient C194579Qh A03;
    public final List groupsToFetch;

    public void A09() {
    }

    public boolean A0D(Exception exc) {
        AnonymousClass00C.A0D(exc, 0);
        if ((exc instanceof C1890791z) || (exc.getCause() instanceof C1890791z)) {
            return true;
        }
        return false;
    }

    public void Bqf(Context context) {
        AnonymousClass00C.A0D(context, 0);
        Context applicationContext = context.getApplicationContext();
        AnonymousClass00C.A08(applicationContext);
        C18800tq A0P = C36371kC.A0P(applicationContext);
        C19700wN B3m = A0P.B3m();
        AnonymousClass00C.A0D(B3m, 0);
        this.A00 = B3m;
        C20350xQ r0 = (C20350xQ) A0P.A6s.get();
        AnonymousClass00C.A0D(r0, 0);
        this.A01 = r0;
        C201159iy r02 = (C201159iy) A0P.A3o.get();
        AnonymousClass00C.A0D(r02, 0);
        this.A02 = r02;
        C194579Qh r03 = (C194579Qh) A0P.AfI.A00.A0K.get();
        AnonymousClass00C.A0D(r03, 0);
        this.A03 = r03;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22727Aug(java.util.List r3) {
        /*
            r2 = this;
            X.673 r1 = new X.673
            r1.<init>()
            java.lang.String r0 = "fetch_groups_for_dirty_bit"
            r1.A00 = r0
            X.AnonymousClass673.A00(r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r2.<init>(r0)
            r2.groupsToFetch = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22727Aug.<init>(java.util.List):void");
    }

    public void A0A() {
        Log.w("FetchGroupsForDirtyBitJob canceled");
    }

    public void A0B() {
        AnonymousClass777 r5 = new AnonymousClass777();
        C194579Qh r4 = this.A03;
        if (r4 != null) {
            List list = this.groupsToFetch;
            ArrayList A0J = C36321k7.A0J(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0C = AnonymousClass001.A0C(it);
                C65533Sl r0 = AnonymousClass147.A01;
                A0J.add(C65533Sl.A04(A0C));
            }
            r4.A00("per_group_dirty_recovery", A0J, new C22472AnB(this, r5));
            r5.get();
            return;
        }
        throw C36331k8.A0d("batchGetGroupInfoProtocolHelper");
    }
}
