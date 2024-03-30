package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.conversation.conversationrow.nativeflow.reminder.RescheduleReminderAlarmsWorker;
import com.whatsapp.conversation.conversationrow.nativeflow.reminder.ScheduledReminderCleanupWorker;
import com.whatsapp.conversation.conversationrow.nativeflow.reminder.ScheduledReminderMessageAlarmBroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Qi  reason: invalid class name and case insensitive filesystem */
public final class C65003Qi {
    public static final long A05 = TimeUnit.DAYS.toMillis(2);
    public final C21570zS A00;
    public final C236519h A01;
    public final C21060yb A02;
    public final C19970wo A03;
    public final C19630wG A04;

    public final void A02(AnonymousClass3T1 r9) {
        AnonymousClass3T1 r3 = r9;
        if (r9 != null) {
            long j = r9.A1N;
            AlarmManager A052 = this.A02.A05();
            if (A052 != null) {
                PendingIntent A002 = A00(r3, j, 0);
                A052.cancel(A002);
                A002.cancel();
            }
        }
    }

    public final void A03(AnonymousClass3T1 r15, long j) {
        AnonymousClass3T1 r9 = r15;
        if (r15 != null) {
            C97394pF r3 = new C97394pF(ScheduledReminderCleanupWorker.class, TimeUnit.HOURS, 24);
            r3.A02(5, TimeUnit.MINUTES);
            ((AnonymousClass6VR) this.A00.get()).A02((C97414pH) r3.A00(), C023109s.A01, "schedule_reminder_cleanup_worker");
            A04(false);
            long j2 = r15.A1N;
            AlarmManager A052 = this.A02.A05();
            if (A052 != null) {
                long j3 = j;
                if (j >= 0 && j <= System.currentTimeMillis() + A05) {
                    PendingIntent A002 = A00(r9, j2, j3);
                    if (!C19550w8.A08() || this.A01.A00.A00()) {
                        A052.setAlarmClock(new AlarmManager.AlarmClockInfo(j3, A002), A002);
                    } else {
                        A052.setWindow(0, j3, 600000, A002);
                    }
                }
            }
        }
    }

    public final PendingIntent A00(AnonymousClass3T1 r5, long j, long j2) {
        Context context = this.A04.A00;
        Intent A0H = C36441kJ.A0H(context, ScheduledReminderMessageAlarmBroadcastReceiver.class);
        A0H.putExtra("reminder_message_id", j);
        A0H.putExtra("scheduled_time_in_ms", j2);
        A0H.setAction("scheduled_reminder_message_broadcast_action");
        AnonymousClass3UJ.A00(A0H, r5.A1J);
        PendingIntent A012 = C65743Th.A01(context, (int) j, A0H, 134217728);
        AnonymousClass00C.A08(A012);
        return A012;
    }

    public final void A01() {
        C21570zS r2 = this.A00;
        ((AnonymousClass6VR) r2.get()).A0B("schedule_reminder_cleanup_worker");
        ((AnonymousClass6VR) r2.get()).A0B("reschedule_reminder_worker");
    }

    public final void A04(boolean z) {
        Integer num;
        C97414pH r3 = (C97414pH) new C97394pF(RescheduleReminderAlarmsWorker.class, TimeUnit.HOURS, 12).A00();
        if (z) {
            num = C023109s.A0G;
        } else {
            num = C023109s.A01;
        }
        ((AnonymousClass6VR) this.A00.get()).A02(r3, num, "reschedule_reminder_worker");
    }

    public C65003Qi(C236519h r1, C21060yb r2, C19970wo r3, C19630wG r4, C21570zS r5) {
        C36321k7.A1B(r1, r4, r2, r5, r3);
        this.A01 = r1;
        this.A04 = r4;
        this.A02 = r2;
        this.A00 = r5;
        this.A03 = r3;
    }
}
