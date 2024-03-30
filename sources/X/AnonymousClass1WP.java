package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Date;

/* renamed from: X.1WP  reason: invalid class name */
public class AnonymousClass1WP {
    public final C19460v5 A00;
    public final C19460v5 A01;
    public final AnonymousClass130 A02;
    public final C19700wN A03;
    public final AnonymousClass17Y A04;
    public final AnonymousClass09F A05;
    public final C19730wQ A06;
    public final AnonymousClass1DT A07;
    public final C20300xL A08;
    public final AnonymousClass1XT A09;
    public final AnonymousClass1XX A0A;
    public final AnonymousClass19J A0B;
    public final C24331Ca A0C;
    public final AnonymousClass1OG A0D;
    public final C25951Ih A0E;
    public final AnonymousClass185 A0F;
    public final AnonymousClass1A6 A0G;
    public final AnonymousClass1G5 A0H;
    public final C19980wp A0I;
    public final C19970wo A0J;
    public final C19630wG A0K;
    public final C19420v0 A0L;
    public final C19900wh A0M;
    public final AnonymousClass189 A0N;
    public final C20310xM A0O;
    public final AnonymousClass12P A0P;
    public final C24881Ed A0Q;
    public final AnonymousClass1FN A0R;
    public final C26171Jd A0S;
    public final C20810yC A0T;
    public final C21010yW A0U;
    public final AnonymousClass1Y4 A0V;
    public final C30051Za A0W;
    public final AnonymousClass19I A0X;
    public final AnonymousClass19A A0Y;
    public final C20720y3 A0Z;
    public final C30351a4 A0a;
    public final AnonymousClass1C4 A0b;
    public final C28361Si A0c;
    public final AnonymousClass1ML A0d;
    public final C27361Nx A0e;
    public final AnonymousClass1YW A0f;
    public final AnonymousClass1VY A0g;
    public final C20100x1 A0h;
    public final AnonymousClass1YU A0i;
    public final AnonymousClass13I A0j;
    public final C29501Ww A0k;
    public final AnonymousClass1BS A0l;
    public final AnonymousClass1MM A0m;
    public final AnonymousClass1A1 A0n;
    public final AnonymousClass1E9 A0o;
    public final AnonymousClass1QA A0p;
    public final C224214g A0q = new C224214g(true);
    public final C19770wU A0r;
    public final C220812u A0s;
    public final AnonymousClass005 A0t;
    public final AnonymousClass005 A0u;
    public final AnonymousClass1KK A0v;
    public final AnonymousClass1VW A0w;
    public final C27331Nu A0x;
    public final AnonymousClass1YV A0y;
    public final AnonymousClass1AQ A0z;

    public static void A00(AnonymousClass1WP r9) {
        C225014r r2 = r9.A04.A00;
        if (r2 == null || !AnonymousClass3SK.A03(r2, r9.A0Z, r9.A0c)) {
            StringBuilder sb = new StringBuilder();
            sb.append("message-handler-callback/handlerconnected/displaysoftwareexpired/notification ");
            sb.append(new Date());
            sb.append(" ");
            sb.append(System.currentTimeMillis());
            Log.w(sb.toString());
            Context context = r9.A0K.A00;
            r9.A0p.A01(context.getString(R.string.f12nameremoved, new Object[]{context.getString(R.string.f12nameremoved)}), context.getString(R.string.f12nameremoved, new Object[]{context.getString(R.string.f12nameremoved)}), 2, true);
            r9.A0c.A01 = true;
        }
    }

    public static void A01(AnonymousClass1WP r3, AnonymousClass1WL r4) {
        C19420v0 r32 = r3.A0L;
        C19420v0.A00(r32).putString("logout_message_header", r4.logoutMessageHeader).apply();
        C19420v0.A00(r32).putString("logout_message_subtext", r4.logoutMessageSubtext).apply();
        C19420v0.A00(r32).putString("logout_message_locale", r4.logoutMessageLocale).apply();
        C19420v0.A00(r32).putString("main_button_text", r4.logoutMainButtonText).apply();
        C19420v0.A00(r32).putString("main_button_url", r4.logoutMainButtonUrl).apply();
        C19420v0.A00(r32).putString("secondary_button_text", r4.logoutSecondaryButtonText).apply();
        C19420v0.A00(r32).putString("secondary_button_url", r4.logoutSecondaryButtonUrl).apply();
    }

    public void A02() {
        AnonymousClass19J r3 = this.A0B;
        boolean z = false;
        if (r3.A04 == 2) {
            z = true;
        }
        r3.A04 = 3;
        r3.A05 = false;
        r3.A02.close();
        C18740tg.A01();
        for (C20420xX BYn : r3.getObservers()) {
            BYn.BYn();
        }
        AnonymousClass1YW r7 = this.A0f;
        r7.A00 = false;
        AnonymousClass1YU r0 = this.A0i;
        r0.A01 = false;
        r0.A00 = 0;
        Log.i("server disconnected");
        C19420v0 r5 = this.A0L;
        if (((SharedPreferences) r5.A00.get()).getBoolean("spam_banned", false)) {
            Context context = this.A0K.A00;
            long A0V2 = r5.A0V("spam_banned_expiry_timestamp");
            long j = -1;
            if (A0V2 != -1) {
                A0V2 = (A0V2 - System.currentTimeMillis()) / 1000;
            }
            if (A0V2 > 0) {
                j = A0V2;
            }
            Intent intent = new Intent();
            intent.setClassName(context.getPackageName(), "com.whatsapp.spamwarning.SpamWarningActivity");
            intent.putExtra("expiry_in_seconds", (int) j);
            if (!TextUtils.isEmpty((CharSequence) null)) {
                intent.putExtra("spam_warning_message_key", (String) null);
            }
            if (!TextUtils.isEmpty((CharSequence) null)) {
                intent.putExtra("faq_url_key", (String) null);
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
        AnonymousClass1BS r4 = this.A0l;
        r4.A01 = false;
        Log.i("routeselector/cancelrouterequesttimer");
        r4.A04.removeMessages(0);
        this.A0e.A05();
        if (z) {
            AnonymousClass1AQ r32 = this.A0z;
            r32.A00.A00();
            r32.A01.A00();
            r32.A02.A00();
        }
        int i = this.A0d.A00;
        if (i == 2) {
            this.A0y.A03();
        } else if (i == 1 && z) {
            long j2 = this.A0Z.A02;
            if (j2 <= 0 || SystemClock.elapsedRealtime() >= j2) {
                r7.A00();
            }
        }
    }

    public void A03() {
        Log.i("message-handler-callback/ready");
        if (((SharedPreferences) this.A0L.A00.get()).getBoolean("refresh_broadcast_lists", false)) {
            this.A0x.A00();
        }
    }

    public void A04() {
        AnonymousClass19J r1 = this.A0B;
        r1.A04 = 4;
        C18740tg.A01();
        for (C20420xX BYp : r1.getObservers()) {
            BYp.BYp();
        }
    }

    public AnonymousClass1WP(C19460v5 r21, C19460v5 r22, AnonymousClass130 r23, C19700wN r24, AnonymousClass17Y r25, AnonymousClass1XR r26, AnonymousClass09F r27, C19730wQ r28, AnonymousClass1DT r29, C20300xL r30, AnonymousClass1XT r31, AnonymousClass1XX r32, AnonymousClass19J r33, AnonymousClass1WQ r34, C24331Ca r35, AnonymousClass1KK r36, C24361Cd r37, AnonymousClass1OG r38, C25951Ih r39, AnonymousClass185 r40, C20430xY r41, AnonymousClass1A6 r42, AnonymousClass1G5 r43, C19980wp r44, C19970wo r45, C19630wG r46, C19420v0 r47, C19900wh r48, AnonymousClass189 r49, AnonymousClass1A5 r50, C20310xM r51, AnonymousClass12P r52, C24881Ed r53, AnonymousClass1FN r54, AnonymousClass12O r55, C26171Jd r56, C20810yC r57, C21010yW r58, AnonymousClass1VW r59, AnonymousClass1Y4 r60, C30051Za r61, AnonymousClass19I r62, AnonymousClass19A r63, C20720y3 r64, AnonymousClass1C4 r65, C27331Nu r66, AnonymousClass19L r67, C28361Si r68, AnonymousClass1YV r69, AnonymousClass1ML r70, C27361Nx r71, AnonymousClass1YW r72, AnonymousClass1VY r73, C20100x1 r74, AnonymousClass1YU r75, AnonymousClass13I r76, C29501Ww r77, AnonymousClass1BS r78, AnonymousClass1MM r79, AnonymousClass1A1 r80, AnonymousClass1E9 r81, C231017e r82, AnonymousClass1QA r83, AnonymousClass1AQ r84, C19770wU r85, C220812u r86, AnonymousClass005 r87, AnonymousClass005 r88) {
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A0K = r46;
        this.A0J = r45;
        this.A0T = r57;
        AnonymousClass17Y r6 = r25;
        this.A04 = r6;
        C19700wN r5 = r24;
        this.A03 = r5;
        this.A06 = r28;
        C19770wU r1 = r85;
        this.A0r = r1;
        this.A0t = r87;
        this.A0U = r58;
        AnonymousClass1C4 r15 = r65;
        this.A0b = r15;
        this.A0s = r86;
        this.A02 = r23;
        this.A0j = r76;
        this.A0p = r83;
        this.A0Y = r63;
        this.A0l = r78;
        this.A07 = r29;
        this.A0A = r32;
        this.A0i = r75;
        this.A0d = r70;
        C27361Nx r3 = r71;
        this.A0e = r3;
        this.A0u = r88;
        this.A0O = r51;
        this.A0n = r80;
        this.A0z = r84;
        this.A0m = r79;
        this.A0X = r62;
        this.A08 = r30;
        this.A0B = r33;
        this.A0C = r35;
        this.A0y = r69;
        this.A0N = r49;
        this.A0h = r74;
        this.A0w = r59;
        this.A05 = r27;
        this.A0S = r56;
        this.A0c = r68;
        AnonymousClass12P r12 = r52;
        this.A0P = r12;
        this.A0g = r73;
        this.A0f = r72;
        this.A0k = r77;
        this.A01 = r21;
        this.A0o = r81;
        this.A0F = r40;
        this.A0L = r47;
        this.A0x = r66;
        this.A0G = r42;
        C20720y3 r14 = r64;
        this.A0Z = r14;
        this.A0R = r54;
        this.A09 = r31;
        this.A0v = r36;
        this.A00 = r22;
        this.A0Q = r53;
        this.A0V = r60;
        this.A0W = r61;
        this.A0M = r48;
        this.A0E = r39;
        this.A0I = r44;
        this.A0D = r38;
        this.A0H = r43;
        this.A0a = new C30351a4(r5, r6, r26, r34, r37, r41, r50, r12, r55, r14, r15, r67, r3, r82, r1);
    }
}
