package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.nativeflow.reminder.ScheduledReminderMessageAlarmBroadcastReceiver;

/* renamed from: X.3vm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80673vm implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ ScheduledReminderMessageAlarmBroadcastReceiver A03;
    public final /* synthetic */ AnonymousClass11F A04;
    public final /* synthetic */ C64933Qa A05;

    public /* synthetic */ C80673vm(Context context, ScheduledReminderMessageAlarmBroadcastReceiver scheduledReminderMessageAlarmBroadcastReceiver, AnonymousClass11F r3, C64933Qa r4, long j, long j2) {
        this.A03 = scheduledReminderMessageAlarmBroadcastReceiver;
        this.A05 = r4;
        this.A02 = context;
        this.A04 = r3;
        this.A00 = j;
        this.A01 = j2;
    }

    public final void run() {
        String str;
        PendingIntent A002;
        String str2;
        ScheduledReminderMessageAlarmBroadcastReceiver scheduledReminderMessageAlarmBroadcastReceiver = this.A03;
        C64933Qa r8 = this.A05;
        Context context = this.A02;
        AnonymousClass11F r11 = this.A04;
        long j = this.A00;
        long j2 = this.A01;
        AnonymousClass1A1 r7 = scheduledReminderMessageAlarmBroadcastReceiver.A0C;
        if (r7 != null) {
            AnonymousClass3T1 A032 = r7.A03(r8);
            if (A032 != null) {
                AnonymousClass3CS r10 = scheduledReminderMessageAlarmBroadcastReceiver.A02;
                if (r10 != null) {
                    r10.A00(A032, "cta_cancel_reminder", "cta_reminder");
                    AnonymousClass1AW r82 = scheduledReminderMessageAlarmBroadcastReceiver.A0B;
                    if (r82 != null) {
                        C200259gz A012 = r82.A01((C23043B1o) A032);
                        if (A012 != null) {
                            str = A012.A0C(context);
                        } else {
                            str = null;
                        }
                        C19770wU r83 = scheduledReminderMessageAlarmBroadcastReceiver.A0D;
                        if (r83 != null) {
                            r83.Boy(new C1503574y(r11, scheduledReminderMessageAlarmBroadcastReceiver, A032, str, 12));
                            C62173Fb r102 = scheduledReminderMessageAlarmBroadcastReceiver.A08;
                            if (r102 != null) {
                                r102.A01(A032.A1N);
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("ScheduledReminderMessageAlarmBroadcastReceiver/onReceive current time is ");
                                C18820ts r72 = scheduledReminderMessageAlarmBroadcastReceiver.A05;
                                if (r72 != null) {
                                    A0u.append(AnonymousClass3UM.A00(r72, j));
                                    A0u.append(", scheduled time is ");
                                    C18820ts r73 = scheduledReminderMessageAlarmBroadcastReceiver.A05;
                                    if (r73 != null) {
                                        A0u.append(AnonymousClass3UM.A00(r73, j2));
                                        A0u.append(" time diff ms is ");
                                        C36351kA.A1S(A0u, j - j2);
                                        AnonymousClass16D r2 = scheduledReminderMessageAlarmBroadcastReceiver.A00;
                                        if (r2 != null) {
                                            C25271Fq r13 = scheduledReminderMessageAlarmBroadcastReceiver.A04;
                                            if (r13 != null) {
                                                C19970wo r14 = scheduledReminderMessageAlarmBroadcastReceiver.A03;
                                                if (r14 != null) {
                                                    C18820ts r12 = scheduledReminderMessageAlarmBroadcastReceiver.A05;
                                                    if (r12 != null) {
                                                        AnonymousClass185 r3 = scheduledReminderMessageAlarmBroadcastReceiver.A01;
                                                        if (r3 != null) {
                                                            if (r11 == null) {
                                                                A002 = C65743Th.A00(context, 1, AnonymousClass190.A03(context), 0);
                                                            } else {
                                                                Uri A003 = AnonymousClass1U4.A00(r2.A0D(r11));
                                                                String str3 = C56682wi.A00;
                                                                Intent A0F = AnonymousClass190.A0F(context, 0);
                                                                A0F.setData(A003);
                                                                A0F.setAction(str3);
                                                                A0F.addFlags(335544320);
                                                                A002 = C65743Th.A00(context, 2, A0F.putExtra("fromNotification", true), 0);
                                                            }
                                                            AnonymousClass00C.A08(A002);
                                                            new C07700Yy(context, "critical_app_alerts@1");
                                                            C07700Yy r74 = new C07700Yy(context, "critical_app_alerts@1");
                                                            r74.A0F(context.getString(R.string.f12nameremoved));
                                                            AnonymousClass3L0 A013 = r3.A01(A032.A0L());
                                                            if ((A013 == null || (str2 = A013.A08) == null) && (r11 == null || (str2 = r2.A0D(r11).A0J()) == null)) {
                                                                str2 = "";
                                                            }
                                                            Object[] objArr = new Object[3];
                                                            objArr[0] = str2;
                                                            objArr[1] = AnonymousClass3UY.A02(r14, r12, A032.A0I);
                                                            String A0x = C36351kA.A0x(context, AnonymousClass3UM.A00(r12, A032.A0I), objArr, 2, R.string.f12nameremoved);
                                                            SpannableString A0O = C36441kJ.A0O(A0x);
                                                            A0O.setSpan(new StyleSpan(1), AnonymousClass099.A0C(A0x, str2, 0, false), AnonymousClass099.A0C(A0x, str2, 0, false) + str2.length(), 33);
                                                            r74.A0E(A0O);
                                                            r74.A09 = 1;
                                                            C36361kB.A1A(r74);
                                                            r74.A0D = A002;
                                                            Notification A052 = r74.A05();
                                                            AnonymousClass00C.A08(A052);
                                                            r13.A02(77, A052);
                                                            return;
                                                        }
                                                        throw C36331k8.A0d("verifiedNameManager");
                                                    }
                                                    throw C36321k7.A09();
                                                }
                                                throw C36331k8.A0d("time");
                                            }
                                            throw C36331k8.A0d("waNotificationManager");
                                        }
                                        throw C36331k8.A0Z();
                                    }
                                    throw C36321k7.A09();
                                }
                                throw C36321k7.A09();
                            }
                            throw C36331k8.A0d("scheduledReminderMessageStore");
                        }
                        throw C36321k7.A08();
                    }
                    throw C36331k8.A0d("interactiveMessageCustomizerFactory");
                }
                throw C36331k8.A0d("reminderUtils");
            }
            return;
        }
        throw C36331k8.A0d("fMessageDatabase");
    }
}
