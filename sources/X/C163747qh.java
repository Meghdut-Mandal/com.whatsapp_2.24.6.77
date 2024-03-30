package X;

import androidx.work.impl.WorkDatabase;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.concurrent.Callable;

/* renamed from: X.7qh  reason: invalid class name and case insensitive filesystem */
public class C163747qh implements Callable {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    public C163747qh(Object obj, int i, int i2, int i3) {
        this.A03 = i3;
        this.A02 = obj;
        this.A00 = i;
        this.A01 = i2;
    }

    public final Object call() {
        int i;
        int i2 = this.A03;
        Object obj = this.A02;
        if (i2 != 0) {
            C1493370u r1 = (C1493370u) obj;
            int i3 = this.A00;
            int i4 = this.A01;
            if (!C1493370u.A09(r1)) {
                i = -6;
            } else {
                C1493370u.A03(r1, C1493370u.A0O);
                GlVideoRenderer glVideoRenderer = r1.A0E;
                i = 0;
                glVideoRenderer.setWindow(0, 0, i3, i4);
            }
            return Integer.valueOf(i);
        }
        C114475hJ r12 = (C114475hJ) obj;
        int i5 = this.A00;
        int i6 = this.A01;
        AnonymousClass00C.A0D(r12, 0);
        WorkDatabase workDatabase = r12.A00;
        int A002 = C109475Xs.A00(workDatabase, "next_job_scheduler_id");
        if (i5 > A002 || A002 > i6) {
            workDatabase.A09().BKj(new AnonymousClass69K("next_job_scheduler_id", C36441kJ.A0y(i5 + 1)));
        } else {
            i5 = A002;
        }
        return Integer.valueOf(i5);
    }
}
