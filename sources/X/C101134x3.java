package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.4x3  reason: invalid class name and case insensitive filesystem */
public class C101134x3 extends C129096Ez {
    public final Context A00;
    public final C21390zA A01;
    public final C20690y0 A02;
    public final C19730wQ A03;
    public final C227815t A04;
    public final C24341Cb A05;
    public final C21060yb A06;
    public final C19420v0 A07;
    public final C20060wx A08;
    public final C144596sV A09;
    public final AnonymousClass12P A0A;
    public final AnonymousClass13S A0B;
    public final C20810yC A0C;
    public final C21010yW A0D;
    public final C19770wU A0E;
    public final AnonymousClass005 A0F;
    public final C19700wN A0G;
    public final AnonymousClass6KC A0H;
    public final C236519h A0I;
    public final C19970wo A0J;
    public final AnonymousClass189 A0K;
    public final AnonymousClass187 A0L;

    public static void A00(C101134x3 r6) {
        if (r6.A03.A0L()) {
            Log.i("BackupMessagesAction/setupBackupMessagesAlarmIfNeeded skipping due to companion mode");
            return;
        }
        Calendar instance = Calendar.getInstance();
        if (instance.get(11) >= 2) {
            instance.add(5, 1);
        }
        C90474aD.A1Q(instance, 0);
        instance.set(11, 2);
        long timeInMillis = instance.getTimeInMillis() + AnonymousClass6KC.A00(r6.A0H, 6225, 6226);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BackupMessagesAction/setupBackupMessagesAlarmIfNeeded; alarmTimeMillis=");
        C36321k7.A1N(new Date(timeInMillis), A0u);
        if (!r6.A0I.A00(super.A03("com.whatsapp.action.BACKUP_MESSAGES", 134217728), 0, timeInMillis)) {
            Log.w("BackupMessagesAction/setupBackupMessagesAlarmIfNeeded AlarmManager is null");
        }
    }

    public C101134x3(Context context, C21390zA r3, C19700wN r4, C20690y0 r5, C19730wQ r6, AnonymousClass6KC r7, C227815t r8, C236519h r9, C24341Cb r10, C21060yb r11, C19970wo r12, C19420v0 r13, C20060wx r14, AnonymousClass189 r15, AnonymousClass187 r16, C144596sV r17, AnonymousClass12P r18, AnonymousClass13S r19, C20810yC r20, C21010yW r21, C19770wU r22, AnonymousClass005 r23) {
        super(context);
        this.A00 = context;
        this.A0J = r12;
        this.A0C = r20;
        this.A0I = r9;
        this.A0G = r4;
        this.A03 = r6;
        this.A0E = r22;
        this.A02 = r5;
        this.A0D = r21;
        this.A08 = r14;
        this.A0L = r16;
        this.A06 = r11;
        this.A0H = r7;
        this.A0K = r15;
        this.A05 = r10;
        this.A09 = r17;
        this.A0A = r18;
        this.A07 = r13;
        this.A04 = r8;
        this.A0B = r19;
        this.A01 = r3;
        this.A0F = r23;
    }
}
