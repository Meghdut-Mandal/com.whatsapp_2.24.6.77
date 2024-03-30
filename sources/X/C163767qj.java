package X;

import androidx.work.impl.WorkDatabase;
import com.whatsapp.jid.GroupJid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* renamed from: X.7qj  reason: invalid class name and case insensitive filesystem */
public class C163767qj implements Callable {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C163767qj(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
    }

    public final Object call() {
        if (this.A03 != 0) {
            C104745Az r0 = (C104745Az) this.A00;
            String str = this.A02;
            ArrayList A15 = C36441kJ.A15((HashSet) this.A01);
            try {
                C21430zE r1 = r0.A0A;
                r1.markerPoint(494345332, "start_outgoing_call_start");
                int A002 = AnonymousClass1NE.A00(r0.A05.A00, (AnonymousClass1NE) r0.A03, (GroupJid) null, (Integer) null, str, (String) null, A15, 26, 0, false, false, false, false);
                r1.markerPoint(494345332, "start_outgoing_call_end");
                return Integer.valueOf(A002);
            } catch (Throwable th) {
                r0.A0A.markerPoint(494345332, "start_outgoing_call_end");
                throw th;
            }
        } else {
            String str2 = this.A02;
            WorkDatabase workDatabase = ((C138836im) this.A00).A02;
            ((AbstractCollection) this.A01).addAll(workDatabase.A0E().BIC(str2));
            return workDatabase.A0D().BJH(str2);
        }
    }
}
