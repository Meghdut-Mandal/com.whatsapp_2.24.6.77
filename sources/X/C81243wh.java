package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;

/* renamed from: X.3wh  reason: invalid class name and case insensitive filesystem */
public class C81243wh implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    public C81243wh(Object obj, Object obj2, int i, long j, boolean z) {
        this.A04 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = z;
        this.A00 = j;
    }

    public void run() {
        switch (this.A04) {
            case 0:
                if (!this.A03) {
                    long j = this.A00;
                    if (j == 0) {
                        j = System.currentTimeMillis();
                        this.A00 = j;
                    }
                    if (((float) C36441kJ.A0A(j)) / ((float) 0) >= 1.0f) {
                        this.A03 = true;
                    }
                    View view = (View) this.A01;
                    view.invalidate();
                    if (!this.A03) {
                        view.post(this);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AnonymousClass6Q9 r2 = (AnonymousClass6Q9) this.A02;
                boolean z = this.A03;
                long j2 = this.A00;
                try {
                    if (AnonymousClass6Q9.A01(r2)) {
                        FileOutputStream fileOutputStream = r2.A0G;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                            return;
                        }
                        throw C36381kD.A0l();
                    }
                    return;
                } catch (Exception e) {
                    if (!z || j2 < 1000) {
                        C36321k7.A1a(AnonymousClass000.A0v("pttutils/closevisualization/closevisualization "), e.toString());
                        return;
                    } else {
                        Log.e("pttutils/closevisualization/closevisualization ", e);
                        return;
                    }
                }
            case 2:
                ScheduleCallBroadcastReceiver scheduleCallBroadcastReceiver = (ScheduleCallBroadcastReceiver) this.A01;
                AnonymousClass3KV r6 = (AnonymousClass3KV) this.A02;
                boolean z2 = this.A03;
                long j3 = this.A00;
                AnonymousClass1HR r5 = scheduleCallBroadcastReceiver.A02;
                AnonymousClass2cN r52 = new AnonymousClass2cN(C36411kG.A0o(r6.A04, r5.A03), C19970wo.A00(r5.A01));
                r52.A01 = r6.A02;
                long j4 = r6.A03;
                r52.A00 = j4;
                r52.A02 = r6.A06;
                r52.A0q(r6.A05);
                scheduleCallBroadcastReceiver.A06.A0h(r52);
                if (!z2) {
                    C31021b9 r9 = scheduleCallBroadcastReceiver.A08;
                    C19630wG r10 = r9.A04;
                    Intent A0H = C36441kJ.A0H(r10.A00, ScheduleCallBroadcastReceiver.class);
                    A0H.setAction("action_schedule_call_timeout");
                    A0H.putExtra("extra_message_row_id", j3);
                    r9.A03.A00(C65743Th.A01(r10.A00, (int) j3, A0H, 134217728), 1, j4 + 900000);
                    C31031bA r1 = scheduleCallBroadcastReceiver.A09;
                    if (r6.A09) {
                        Iterator A0s = C36361kB.A0s(r1);
                        while (A0s.hasNext()) {
                            ((C34661hR) A0s.next()).Bfl(r6);
                        }
                    }
                    scheduleCallBroadcastReceiver.A03.A00(r6, false);
                    return;
                }
                return;
            default:
                AnonymousClass6YP r22 = (AnonymousClass6YP) this.A01;
                AnonymousClass6Q9 r12 = (AnonymousClass6Q9) this.A02;
                long j5 = this.A00;
                boolean z3 = this.A03;
                AnonymousClass6YP.A0B(r22, r12, j5, false);
                File A032 = r12.A03();
                long length = A032.length();
                r22.A0h.A0H(new C80773vw(r22, A032, (File) r12.A0A.getValue(), r12.A01, length, j5, z3));
                return;
        }
    }

    public C81243wh(View view, C135346cY r3) {
        this.A04 = 0;
        this.A01 = view;
        this.A02 = r3;
    }
}
