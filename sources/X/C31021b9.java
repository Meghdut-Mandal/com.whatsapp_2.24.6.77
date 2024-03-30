package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1b9  reason: invalid class name and case insensitive filesystem */
public class C31021b9 {
    public static final List A0F = Arrays.asList(new String[]{"action_schedule_call", "action_schedule_call_advance_alert"});
    public final AnonymousClass17Y A00;
    public final C19730wQ A01;
    public final AnonymousClass1PW A02;
    public final C236519h A03;
    public final C19630wG A04;
    public final C20310xM A05;
    public final C26211Jh A06;
    public final C20810yC A07;
    public final C31031bA A08;
    public final C19930wk A09;
    public final AnonymousClass005 A0A;
    public final AnonymousClass005 A0B;
    public final C21060yb A0C;
    public final C19970wo A0D;
    public final C19770wU A0E;

    public void A00(long j) {
        ArrayList arrayList = new ArrayList();
        for (String action : A0F) {
            Intent intent = new Intent(this.A04.A00, ScheduleCallBroadcastReceiver.class);
            intent.setAction(action);
            arrayList.add(intent);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Intent intent2 = (Intent) it.next();
            PendingIntent A012 = C65743Th.A01(this.A04.A00, (int) j, intent2, 1610612736);
            if (A012 == null) {
                intent2.getAction();
                return;
            }
            AlarmManager A052 = this.A0C.A05();
            if (A052 != null) {
                A052.cancel(A012);
                A012.cancel();
            } else {
                return;
            }
        }
    }

    public void A01(long j, PendingIntent pendingIntent) {
        AlarmManager A052 = this.A0C.A05();
        if (A052 != null) {
            long j2 = j;
            PendingIntent pendingIntent2 = pendingIntent;
            if (!C19550w8.A08() || this.A03.A00.A00()) {
                A052.setAlarmClock(new AlarmManager.AlarmClockInfo(j, pendingIntent), pendingIntent);
            } else {
                A052.setWindow(0, j2, 600000, pendingIntent2);
            }
        }
    }

    public void A02(long j, boolean z, long j2) {
        ArrayList arrayList = new ArrayList();
        for (String action : A0F) {
            Intent intent = new Intent(this.A04.A00, ScheduleCallBroadcastReceiver.class);
            intent.setAction(action);
            intent.putExtra("extra_message_row_id", j);
            intent.putExtra("extra_scheduled_call_timestamp_ms", j2);
            arrayList.add(intent);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Intent intent2 = (Intent) it.next();
            PendingIntent A012 = C65743Th.A01(this.A04.A00, (int) j, intent2, 1073741824);
            if (!"action_schedule_call_advance_alert".equals(intent2.getAction())) {
                A01(j2, A012);
            } else if (z && j2 - System.currentTimeMillis() > 60000) {
                A01(j2 - 60000, A012);
            }
        }
    }

    public void A03(AnonymousClass11F r4, C88064Rg r5) {
        if (r4 != null) {
            this.A0E.Bp1(new C35661j3(r5, r4, this, 15));
        }
    }

    public C31021b9(AnonymousClass17Y r3, C19730wQ r4, AnonymousClass1PW r5, C236519h r6, C21060yb r7, C19970wo r8, C19630wG r9, C20310xM r10, C26211Jh r11, C20810yC r12, C31031bA r13, C19770wU r14, AnonymousClass005 r15, AnonymousClass005 r16) {
        this.A0D = r8;
        this.A07 = r12;
        this.A00 = r3;
        this.A04 = r9;
        this.A0E = r14;
        this.A03 = r6;
        this.A01 = r4;
        this.A0C = r7;
        this.A06 = r11;
        this.A02 = r5;
        this.A08 = r13;
        this.A05 = r10;
        this.A0A = r15;
        this.A0B = r16;
        this.A09 = new C19930wk(r14, true);
    }
}
