package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import androidx.core.app.NotificationCompat$BigTextStyle;
import com.whatsapp.R;
import com.whatsapp.inorganicnotifications.InorganicNotificationDismissedReceiver;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1c1  reason: invalid class name and case insensitive filesystem */
public final class C31561c1 {
    public long A00;
    public long A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass171 A03;
    public final C19970wo A04;
    public final C25271Fq A05;
    public final C19420v0 A06;
    public final C18820ts A07;
    public final C220412q A08;
    public final C20310xM A09;
    public final AnonymousClass1A1 A0A;
    public final C19770wU A0B;
    public final Map A0C = new LinkedHashMap();
    public final Context A0D;
    public final AnonymousClass1NG A0E;
    public final AnonymousClass1A6 A0F;
    public final AnonymousClass1NM A0G;
    public final C19630wG A0H;
    public final C20500xf A0I;
    public final AnonymousClass1NW A0J;
    public final C20600xp A0K;
    public final AnonymousClass1CR A0L;

    public C31561c1(Context context, AnonymousClass1NG r20, AnonymousClass16D r21, AnonymousClass171 r22, AnonymousClass1A6 r23, AnonymousClass1NM r24, C19970wo r25, C19630wG r26, C25271Fq r27, C19420v0 r28, C18820ts r29, C220412q r30, C20310xM r31, C20500xf r32, AnonymousClass1NW r33, C20600xp r34, AnonymousClass1CR r35, AnonymousClass1A1 r36, C19770wU r37) {
        C19970wo r15 = r25;
        AnonymousClass00C.A0D(r15, 1);
        C19630wG r14 = r26;
        AnonymousClass00C.A0D(r14, 3);
        C19770wU r0 = r37;
        AnonymousClass00C.A0D(r0, 4);
        C220412q r7 = r30;
        AnonymousClass00C.A0D(r7, 5);
        C20500xf r5 = r32;
        AnonymousClass00C.A0D(r5, 6);
        AnonymousClass16D r16 = r21;
        AnonymousClass00C.A0D(r16, 7);
        C18820ts r8 = r29;
        AnonymousClass00C.A0D(r8, 8);
        AnonymousClass1NG r17 = r20;
        AnonymousClass00C.A0D(r17, 9);
        C20310xM r6 = r31;
        AnonymousClass00C.A0D(r6, 10);
        AnonymousClass1A1 r2 = r36;
        AnonymousClass00C.A0D(r2, 11);
        AnonymousClass1NM r11 = r24;
        AnonymousClass00C.A0D(r11, 12);
        AnonymousClass1CR r3 = r35;
        AnonymousClass00C.A0D(r3, 13);
        C20600xp r4 = r34;
        AnonymousClass00C.A0D(r4, 14);
        AnonymousClass171 r13 = r22;
        AnonymousClass00C.A0D(r13, 15);
        AnonymousClass1A6 r12 = r23;
        AnonymousClass00C.A0D(r12, 16);
        C19420v0 r9 = r28;
        AnonymousClass00C.A0D(r9, 17);
        C25271Fq r10 = r27;
        AnonymousClass00C.A0D(r10, 18);
        this.A04 = r15;
        this.A0D = context;
        this.A0H = r14;
        this.A0B = r0;
        this.A08 = r7;
        this.A0I = r5;
        this.A02 = r16;
        this.A07 = r8;
        this.A0E = r17;
        this.A09 = r6;
        this.A0A = r2;
        this.A0G = r11;
        this.A0L = r3;
        this.A0K = r4;
        this.A03 = r13;
        this.A0F = r12;
        this.A06 = r9;
        this.A05 = r10;
        this.A0J = r33;
    }

    public final void A02(AnonymousClass11F r33, AnonymousClass11F r34, AnonymousClass11F r35, String str) {
        Intent intent;
        String str2;
        String str3;
        AnonymousClass11F r31 = r34;
        AnonymousClass00C.A0D(r31, 1);
        AnonymousClass190 r3 = new AnonymousClass190();
        Context context = this.A0D;
        String string = context.getString(R.string.f12nameremoved);
        AnonymousClass00C.A08(string);
        String obj = UUID.randomUUID().toString();
        AnonymousClass00C.A08(obj);
        String str4 = null;
        AnonymousClass11F r2 = r33;
        AnonymousClass11F r15 = r35;
        if (r33 == null || (intent = r3.A1Z(context, r2, 2).putExtra("inorganic_notification_id", obj).putExtra("fromMessageReminderNotification", true)) == null) {
            Intent putExtra = AnonymousClass190.A03(context).putExtra("fromMessageReminderNotificationChatJid", r31.getRawString()).putExtra("inorganic_notification_id", obj);
            if (r35 != null) {
                str3 = r15.getRawString();
            } else {
                str3 = null;
            }
            intent = putExtra.putExtra("inorganic_notification_chat_jid", str3);
        }
        AnonymousClass00C.A0B(intent);
        String str5 = str;
        if (r33 == null || (str != null && str5.length() > 0)) {
            str2 = string;
        } else {
            AnonymousClass141 A0A2 = this.A02.A0A(r2);
            if (A0A2 != null) {
                str2 = this.A03.A0H(A0A2);
            } else {
                str2 = null;
            }
        }
        PendingIntent A002 = C65743Th.A00(context, 0, intent, 134217728);
        C19630wG r32 = this.A0H;
        if (r35 != null) {
            str4 = r15.getRawString();
        }
        Context context2 = r32.A00;
        Intent intent2 = new Intent(context2, InorganicNotificationDismissedReceiver.class);
        intent2.putExtra("inorganic_notification_id", obj);
        intent2.putExtra("inorganic_notification_type", 1);
        intent2.putExtra("inorganic_notification_chat_jid", str4);
        PendingIntent A012 = C65743Th.A01(context2, 1, intent2, 134217728);
        AnonymousClass00C.A08(A012);
        if (r33 == null || (str != null && str5.length() > 0)) {
            AnonymousClass00C.A0B(A002);
            A01(A002, A012, (AnonymousClass141) null, string, str2, str5);
        } else {
            ArrayList arrayList = new ArrayList();
            long A072 = this.A08.A07(r2);
            C20310xM r36 = this.A09;
            C19970wo r21 = this.A04;
            C600336f A0S = r36.A0S(r2, 1, A072, C19970wo.A00(r21));
            try {
                Cursor cursor = A0S.A00;
                if (cursor != null) {
                    if (cursor.moveToFirst()) {
                        while (true) {
                            AnonymousClass3T1 A013 = this.A0A.A01(cursor, r2);
                            if (!(A013 == null || A013.A1N == A072 || A013.A1J.A02)) {
                                long j = A013.A0G;
                                long A003 = C19970wo.A00(r21);
                                TimeUnit timeUnit = TimeUnit.MINUTES;
                                if (j >= A003 - timeUnit.toMillis(this.A00) && A013.A0G <= C19970wo.A00(r21) - timeUnit.toMillis(this.A01)) {
                                    arrayList.add(A013);
                                    break;
                                }
                            }
                            if (!cursor.moveToNext()) {
                                break;
                            }
                        }
                    }
                    cursor.close();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass3T1 r7 = (AnonymousClass3T1) it.next();
                    String string2 = context2.getResources().getString(R.string.f12nameremoved, new Object[]{str2, Integer.valueOf(AnonymousClass6XI.A00(System.currentTimeMillis(), r7.A0I))});
                    AnonymousClass00C.A08(string2);
                    AnonymousClass141 A0A3 = this.A02.A0A(r2);
                    if (A0A3 != null) {
                        String obj2 = this.A0K.A0E(A0A3, r7).A00.toString();
                        AnonymousClass00C.A0B(A002);
                        A01(A002, A012, A0A3, string, string2, obj2);
                    }
                }
            } catch (Throwable th) {
                Cursor cursor2 = A0S.A00;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        }
        this.A0G.A0B(r31, 9);
        this.A0J.A00(r15, obj, 1, 1);
    }

    public static final ArrayList A00(C31561c1 r11, boolean z) {
        AnonymousClass3LI A0R;
        C80103un A0B2;
        long j;
        ArrayList arrayList = new ArrayList();
        Iterator it = r11.A0F.A04().iterator();
        while (it.hasNext()) {
            AnonymousClass11F r3 = (AnonymousClass11F) it.next();
            AnonymousClass141 A0D2 = r11.A02.A0D(r3);
            boolean z2 = true;
            boolean A0G2 = A0D2.A0G();
            if (z) {
                if (!A0G2) {
                }
            } else if (A0D2.A0F != null) {
                if (!(A0D2.A0H instanceof C177618e5)) {
                    if (r3 instanceof UserJid) {
                        if (r11.A0E.A0O((UserJid) r3)) {
                        }
                    }
                }
            }
            boolean A0G3 = A0D2.A0G();
            AnonymousClass1CR r5 = r11.A0L;
            if (A0G3) {
                A0R = r5.A0Q();
            } else {
                A0R = r5.A0R();
            }
            boolean A0B3 = A0R.A0B();
            if (!A0D2.A0G() ? !(r3 instanceof UserJid) || ((A0B2 = r11.A08.A0B((UserJid) r3)) != null && A0B2.expiration == 0) : A0D2.A02 == 0) {
                z2 = false;
            }
            if (A0B3 && !z2 && AnonymousClass1CR.A02(r5, r3.getRawString()).A0B() && !r11.A0K.A0K(r3)) {
                C220412q r52 = r11.A08;
                if (!r52.A0N(r3) && !AnonymousClass3M3.A01(r11.A0I, r3) && !r52.A0Q(r3) && r52.A02(r3) != 0) {
                    C65073Qp r0 = (C65073Qp) C220412q.A00(r52).get(r3);
                    if (r0 == null) {
                        j = 0;
                    } else {
                        j = r0.A0Y;
                    }
                    if (Long.valueOf(j) != null) {
                        long A002 = C19970wo.A00(r11.A04) - j;
                        TimeUnit timeUnit = TimeUnit.MINUTES;
                        long millis = timeUnit.toMillis(r11.A01) + 1;
                        if (A002 < timeUnit.toMillis(r11.A00) && millis <= A002) {
                            AnonymousClass00C.A0B(r3);
                            arrayList.add(r3);
                            r11.A0C.put(r3, Integer.valueOf(r52.A02(r3)));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final void A01(PendingIntent pendingIntent, PendingIntent pendingIntent2, AnonymousClass141 r14, String str, String str2, String str3) {
        C19970wo r1 = this.A04;
        long A002 = C19970wo.A00(r1);
        C07700Yy A022 = C20600xp.A02(this.A0D);
        A022.A0M = "other_notifications@1";
        A022.A09 = 1;
        A022.A0G(str);
        A022.A09(A002);
        A022.A06(2);
        A022.A0I(true);
        String str4 = str2;
        A022.A0F(str4);
        String str5 = str3;
        A022.A0E(str5);
        A022.A0D = pendingIntent;
        Notification notification = A022.A0B;
        notification.deleteIntent = pendingIntent2;
        notification.icon = R.drawable.notifybar;
        AnonymousClass141 r5 = r14;
        if (!C19550w8.A02() || r14 == null) {
            NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
            notificationCompat$BigTextStyle.A0C(str5);
            A022.A0C(notificationCompat$BigTextStyle);
            if (r14 != null) {
                A022.A0A(this.A0K.A0C(r14));
            }
        } else {
            C55282uN.A00(A022, r5, this.A0K, str5, str4, A002);
        }
        C19420v0 r0 = this.A06;
        C19420v0.A00(r0).putLong("inorganic_notification_last_timestamp", C19970wo.A00(r1)).apply();
        this.A05.A07(str4, 74, A022.A05());
    }
}
