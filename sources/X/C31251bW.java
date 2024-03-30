package X;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat$BigTextStyle;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1bW  reason: invalid class name and case insensitive filesystem */
public class C31251bW extends C29421Wo {
    public final Context A00;
    public final C19630wG A01;
    public final AnonymousClass1C7 A02;
    public final C20310xM A03;
    public final AnonymousClass1DQ A04;
    public final AnonymousClass16J A05;
    public final AnonymousClass16F A06;
    public final C20810yC A07;
    public final C20520xh A08;
    public final C31551c0 A09;
    public final C31561c1 A0A;
    public final AnonymousClass1A1 A0B;
    public final C19770wU A0C;
    public final C31261bX A0D;
    public final C31351bg A0E;
    public final C31541bz A0F;
    public final C31281bZ A0G;
    public final AnonymousClass005 A0H;
    public final C19700wN A0I;
    public final C19970wo A0J;
    public final C31531by A0K;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C31251bW(android.content.Context r9, X.C19700wN r10, X.C19970wo r11, X.C19630wG r12, X.AnonymousClass1C7 r13, X.C20310xM r14, X.AnonymousClass1DQ r15, X.AnonymousClass16J r16, X.AnonymousClass16F r17, X.C20810yC r18, X.C20520xh r19, X.AnonymousClass19A r20, X.AnonymousClass19L r21, X.C31551c0 r22, X.C31561c1 r23, X.AnonymousClass1A1 r24, X.C19770wU r25, X.C31261bX r26, X.C31351bg r27, X.C31541bz r28, X.C31531by r29, X.C31281bZ r30, X.AnonymousClass005 r31) {
        /*
            r8 = this;
            r0 = 1
            int[] r6 = new int[r0]
            r1 = 0
            r0 = 104(0x68, float:1.46E-43)
            r6[r1] = r0
            r7 = 1
            r1 = r8
            r5 = r25
            r2 = r10
            r3 = r20
            r4 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.A0J = r11
            r0 = r18
            r8.A07 = r0
            r8.A00 = r9
            r8.A01 = r12
            r8.A0C = r5
            r8.A0I = r10
            r8.A04 = r15
            r8.A03 = r14
            r0 = r24
            r8.A0B = r0
            r0 = r16
            r8.A05 = r0
            r0 = r26
            r8.A0D = r0
            r8.A02 = r13
            r0 = r30
            r8.A0G = r0
            r0 = r31
            r8.A0H = r0
            r0 = r17
            r8.A06 = r0
            r0 = r27
            r8.A0E = r0
            r0 = r19
            r8.A08 = r0
            r0 = r29
            r8.A0K = r0
            r0 = r28
            r8.A0F = r0
            r0 = r22
            r8.A09 = r0
            r0 = r23
            r8.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31251bW.<init>(android.content.Context, X.0wN, X.0wo, X.0wG, X.1C7, X.0xM, X.1DQ, X.16J, X.16F, X.0yC, X.0xh, X.19A, X.19L, X.1c0, X.1c1, X.1A1, X.0wU, X.1bX, X.1bg, X.1bz, X.1by, X.1bZ, X.005):void");
    }

    public static long A01(C203399nx r7, C31251bW r8) {
        try {
            long A0V = r7.A0V("t", 0) * 1000;
            if (A0V > 0) {
                return A0V;
            }
            long A002 = C19970wo.A00(r8.A0J);
            if (A002 <= 0) {
                return System.currentTimeMillis();
            }
            return A002;
        } catch (C235919b e) {
            StringBuilder sb = new StringBuilder();
            sb.append("PSANotificationHandler/getServerTimeInMillis: ");
            sb.append(e);
            Log.e(sb.toString());
        }
    }

    public static void A02(C31251bW r15, C79853uO r16, C87374On r17, String str) {
        C19770wU r2;
        Runnable runnable;
        String str2;
        String str3;
        int i;
        C87374On r4 = r17;
        if (r17 == null) {
            String str4 = str;
            if (str != null) {
                C31531by r22 = r15.A0K;
                C44672Ok r1 = new C44672Ok();
                r1.A00 = 2;
                r1.A01 = str4;
                r22.A00.Bly(r1);
                return;
            }
            return;
        }
        Log.i("PSANotificationHandler/chooseQuickPromotion rendering push");
        C21642ATi aTi = (C21642ATi) r4;
        C592233c r0 = aTi.A06;
        if (r0 != null) {
            Map map = r0.A00;
            Object obj = map.get("wa_push_psa_promotion_type");
            for (AnonymousClass3LB r7 : (Set) r15.A0H.get()) {
                boolean z = r7 instanceof C47032cc;
                if (z) {
                    str3 = "story_post_push_notification";
                } else {
                    str3 = "recently_joined_contact_push_notification";
                }
                if (AnonymousClass00C.A0J(str3, obj)) {
                    if (AnonymousClass00C.A0J(str3, obj) && r7.A03()) {
                        C79853uO r12 = r16;
                        AnonymousClass00C.A0D(r12, 0);
                        AnonymousClass3JN r9 = r12.A00;
                        if (r9 != null && r7.A04(r9)) {
                            String A022 = r7.A02(r9);
                            String A012 = r7.A01(r9);
                            Context context = r9.A02;
                            C07700Yy A023 = C20600xp.A02(context);
                            A023.A0M = "other_notifications@1";
                            A023.A09 = 1;
                            String string = context.getString(R.string.f12nameremoved);
                            AnonymousClass00C.A08(string);
                            A023.A0G(string);
                            C19970wo r23 = r7.A00;
                            A023.A09(System.currentTimeMillis());
                            A023.A06(2);
                            A023.A0I(true);
                            A023.A0F(A022);
                            A023.A0E(A012);
                            NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
                            notificationCompat$BigTextStyle.A0C(A012);
                            A023.A0C(notificationCompat$BigTextStyle);
                            A023.A0D = r7.A00(r9);
                            A023.A0B.icon = R.drawable.notifybar;
                            C19420v0 r02 = r7.A02;
                            C19420v0.A00(r02).putLong("inorganic_notification_last_timestamp", C19970wo.A00(r23)).apply();
                            C25271Fq r24 = r7.A01;
                            if (z) {
                                i = 81;
                            } else {
                                i = 82;
                            }
                            r24.A07(A022, i, A023.A05());
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            if ("message_reminder_push_notification".equals(obj)) {
                if (C20800yB.A01(C21000yV.A02, r15.A07, 5544)) {
                    C197849cT r03 = aTi.A08.A00;
                    Objects.requireNonNull(r03);
                    ArrayList arrayList = r03.A01;
                    if (arrayList.isEmpty()) {
                        str2 = "empty clauses in reply reminder notification";
                    } else {
                        Iterator it = arrayList.iterator();
                        long j = 0;
                        long j2 = 0;
                        long j3 = 0;
                        while (it.hasNext()) {
                            Iterator it2 = ((C197849cT) it.next()).A02.iterator();
                            while (it2.hasNext()) {
                                C193229Kn r92 = (C193229Kn) it2.next();
                                String str5 = r92.A00.A00;
                                Map map2 = r92.A01;
                                String str6 = (String) map2.get("first");
                                String str7 = (String) map2.get("second");
                                if (!(str6 == null || str7 == null)) {
                                    if (str5.equals("whatsapp_user_rendered_notification")) {
                                        j3 = Long.parseLong(str6);
                                    } else if (str5.equals("whatsapp_user_unread_message")) {
                                        j = Long.parseLong(str6);
                                        j2 = Long.parseLong(str7);
                                    }
                                }
                            }
                        }
                        Objects.requireNonNull(map);
                        boolean parseBoolean = Boolean.parseBoolean((String) map.get("wa_push_psa_remove_old_message_notifications"));
                        if (j <= 0 || j2 <= 0 || j3 <= 0) {
                            str2 = "Invalid values passed in filters";
                        } else {
                            C31561c1 r10 = r15.A0A;
                            if (C19970wo.A00(r10.A04) - ((SharedPreferences) r10.A06.A00.get()).getLong("last_notif_posted_timestamp", 0) >= TimeUnit.MINUTES.toMillis(j3)) {
                                r10.A01 = j;
                                r10.A00 = j2;
                                r2 = r10.A0B;
                                runnable = new C35231iM(12, (Object) r10, parseBoolean);
                                r2.Boy(runnable);
                            }
                            return;
                        }
                    }
                    Log.e(str2);
                    return;
                }
                return;
            }
        }
        r2 = r15.A0C;
        runnable = new C35261iP(r15, r4);
        r2.Boy(runnable);
    }
}
