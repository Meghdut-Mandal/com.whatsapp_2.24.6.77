package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat$BigTextStyle;
import com.whatsapp.Me;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.1Ww  reason: invalid class name and case insensitive filesystem */
public class C29501Ww {
    public WeakReference A00 = null;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C21390zA A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass17Y A04;
    public final C19730wQ A05;
    public final C20300xL A06;
    public final C28961Uu A07;
    public final AnonymousClass1RU A08;
    public final C29301Wc A09;
    public final AnonymousClass1NG A0A;
    public final AnonymousClass196 A0B;
    public final C19970wo A0C;
    public final C19630wG A0D;
    public final C25271Fq A0E;
    public final C19420v0 A0F;
    public final C19900wh A0G;
    public final C18820ts A0H;
    public final C236419g A0I;
    public final C20810yC A0J;
    public final AnonymousClass1C4 A0K;
    public final C28361Si A0L;
    public final AnonymousClass12U A0M;
    public final C19770wU A0N;
    public final AnonymousClass005 A0O;
    public final C19460v5 A0P;
    public final C19460v5 A0Q;
    public final C19460v5 A0R;
    public final C19460v5 A0S;
    public final C19460v5 A0T;
    public final C19460v5 A0U;
    public final C19460v5 A0V;
    public final C19460v5 A0W;
    public final C19460v5 A0X;
    public final C19460v5 A0Y;
    public final C19460v5 A0Z;
    public final C19460v5 A0a;
    public final C19460v5 A0b;
    public final C19460v5 A0c;
    public final AnonymousClass1WR A0d;
    public final C21100yf A0e;
    public final AnonymousClass164 A0f;
    public final C29411Wn A0g;
    public final AnonymousClass185 A0h;
    public final AnonymousClass1O7 A0i;
    public final C20430xY A0j;
    public final AnonymousClass1G5 A0k;
    public final C236519h A0l;
    public final C21060yb A0m;
    public final C220712t A0n;
    public final C220612s A0o;
    public final AnonymousClass12P A0p;
    public final AnonymousClass1QN A0q;
    public final AnonymousClass1UU A0r;
    public final C21520zN A0s;
    public final C21510zM A0t;
    public final C20350xQ A0u;
    public final AnonymousClass19A A0v;
    public final AnonymousClass1XA A0w;
    public final C19890wg A0x;
    public final C29341Wg A0y;
    public final AnonymousClass13I A0z;
    public final AnonymousClass1X8 A10;
    public final AnonymousClass1XF A11;
    public final AnonymousClass005 A12;
    public final AnonymousClass005 A13;

    public void A0B(int i) {
        A02(this, i, true);
    }

    public static C07700Yy A00(C29501Ww r5, String str, String str2, String str3) {
        Context context = r5.A0D.A00;
        C07700Yy A022 = C20600xp.A02(context);
        A022.A0M = "critical_app_alerts@1";
        A022.A09 = 1;
        A022.A0G(str3);
        A022.A09(C19970wo.A00(r5.A0C));
        A022.A06(3);
        A022.A0I(true);
        A022.A0F(str);
        A022.A0E(str2);
        NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
        notificationCompat$BigTextStyle.A0C(str2);
        A022.A0C(notificationCompat$BigTextStyle);
        A022.A0D = C65743Th.A00(context, 1, AnonymousClass190.A09(context), 0);
        A022.A0B.icon = R.drawable.notifybar;
        return A022;
    }

    public static void A02(C29501Ww r4, int i, boolean z) {
        if (r4.A0G.A01.getInt("registration_state", -1) != i) {
            AnonymousClass1X8 r1 = r4.A10;
            r1.A00 = null;
            AnonymousClass1X8.A00(r1);
            r1.A01 = false;
            r1.A02 = false;
            r1.A03 = false;
            r1.A06 = false;
            r1.A07 = false;
            r1.A04 = false;
            r1.A05 = true;
            r4.A0F.A0v();
        }
        AnonymousClass12U r2 = r4.A0M;
        if (z) {
            r2.A01(i);
        } else {
            r2.A00.A01.edit().putInt("registration_state", i).commit();
        }
        C19460v5 r12 = r4.A0a;
        if (r12.A05() && r2.A03()) {
            r12.A02();
            throw new NullPointerException("postValidVNameEvent");
        }
    }

    public void A04() {
        PendingIntent A012 = C65743Th.A01(this.A0D.A00, 0, new Intent("com.whatsapp.alarm.REGISTRATION_RETRY").setPackage("com.whatsapp"), 536870912);
        if (A012 != null) {
            AlarmManager A052 = this.A0m.A05();
            if (A052 != null) {
                A052.cancel(A012);
            } else {
                Log.w("RegistrationManager/cancelRegistrationRetryAlarm AlarmManager is null");
            }
            A012.cancel();
        }
    }

    public void A05() {
        C19730wQ r0 = this.A05;
        Me A052 = r0.A05();
        if (A052 != null) {
            r0.A0F();
            this.A03.A00();
            C19460v5 r1 = this.A0S;
            if (r1.A05()) {
                AnonymousClass1ZY r2 = (AnonymousClass1ZY) ((AnonymousClass005) r1.A02()).get();
                if (r2.A01.A00.A09(C21100yf.A0P)) {
                    AnonymousClass1VD r22 = r2.A02;
                    AnonymousClass1VD.A00(new C164607s5(r22, 0), r22);
                }
            }
            ((C74173lB) this.A13.get()).A09();
            AnonymousClass1NG r12 = this.A0A;
            r12.A0C();
            r12.A0K((AnonymousClass3EB) null);
            this.A0u.A0U(3, false);
            this.A01.post(new C35761jD(this, A052, 39));
            return;
        }
        Log.w("RegistrationManager/notifyChangeNumberSuccess/response/ok already changed?");
    }

    public void A06() {
        this.A0g.A02();
        if (!this.A0M.A03()) {
            Log.i("RegistrationManager/notifyOrShowLoginFailureOverlayAlert/ignore as registration not verified");
        } else {
            this.A04.Bp3(new C35731jA((Object) this, 29));
        }
    }

    public void A07() {
        C19730wQ r1 = this.A05;
        r1.A0G();
        if (r1.A00 != null) {
            Log.i("RegistrationManager/xmpp/service/reset-registered/updateparams");
            r1.A0G();
            PhoneUserJid phoneUserJid = r1.A03;
            C20720y3 r12 = (C20720y3) this.A0O.get();
            if (r12.A10) {
                r12.A04 = phoneUserJid;
            }
        }
    }

    public void A08() {
        C19890wg r2 = this.A0x;
        Context context = this.A0D.A00;
        r2.A00(A01(context, "com.whatsapp.registration.phonenumberentry.RegisterPhone")).edit().clear().apply();
        r2.A00(A01(context, "com.whatsapp.registration.verifyphone.VerifyPhoneNumber")).edit().clear().apply();
    }

    public void A09() {
        this.A05.A0D();
        this.A0F.A0y();
        C220412q r1 = this.A0n.A00;
        synchronized (r1) {
            C220412q.A00(r1).clear();
            r1.A00 = false;
        }
        A02(this, 1, true);
    }

    public void A0A() {
        this.A0N.Boy(new C35761jD(this, this.A0D.A00, 38));
    }

    public void A0D(String str, String str2, String str3) {
        C19420v0 r0 = this.A0F;
        r0.A1V(str3);
        r0.A1l(str, str2);
    }

    public boolean A0E() {
        AnonymousClass1C4 r5 = this.A0K;
        r5.A00();
        AnonymousClass005 r4 = this.A0O;
        ((C20720y3) r4.get()).A0G(false, 16);
        this.A0t.A02();
        C19420v0 r3 = this.A0F;
        r3.A0u();
        C19420v0.A00(r3).putLong("registration_success_time_ms", C19970wo.A00(this.A0C)).apply();
        Log.i("RegistrationManager/completeChangeNumber");
        Me me = new Me(r3.A0f(), r3.A0h(), r3.A0g());
        boolean z = false;
        if (me.jabber_id != null) {
            z = true;
        }
        Log.a(z);
        C19730wQ r1 = this.A05;
        r1.A0G();
        if (C19730wQ.A03(me, r1, "me")) {
            r1.A0G();
            C19730wQ.A01(me, r1);
            AnonymousClass12P r0 = this.A0p;
            r0.A06();
            boolean z2 = r0.A08;
            if (!z2) {
                C220612s r2 = this.A0o;
                if (r2.A00.A0A((AnonymousClass13P) null, false)) {
                    Log.i("RegistrationManager/completeChangeNumber/msgstoredb/healthy");
                    C220712t.A02(this.A0n, false);
                    r2.A01();
                }
            }
            A07();
            ((C20720y3) r4.get()).A07();
            if (!z2) {
                this.A0j.A05();
            }
            A02(this, 3, true);
            r3.A29(new byte[0]);
            C29301Wc.A00(this.A09).A08.A00 = true;
            AnonymousClass6YO.A09(this.A0D.A00);
            Log.i("RegistrationManager/completeChangeNumber/changenumber/setregverified");
            this.A0j.A06();
            this.A0w.A01(true, false);
            Log.i("RegistrationManager/completeChangeNumber/reinitalized-payments");
            C21100yf r02 = this.A0e;
            synchronized (C21100yf.class) {
                r02.A00.edit().putLong("groups_server_props_last_refresh_time", 0).apply();
            }
            this.A0N.Boy(new C35731jA((Object) this, 28));
            AnonymousClass1XF r12 = this.A11;
            r12.A01(1);
            r12.A01(2);
            r5.A00();
            this.A0A.A0C();
            r3.A19(3);
            ((C20720y3) r4.get()).A0C(0, true, false, false, false);
            return true;
        }
        Log.i("RegistrationManager/completeChangeNumber/error-saving");
        return false;
    }

    public boolean A0F() {
        Log.i("RegistrationManager/revertToOldNumber");
        C19730wQ r2 = this.A05;
        Me A052 = r2.A05();
        r2.A0G();
        if (!C19730wQ.A03(A052, r2, "me")) {
            return false;
        }
        r2.A0G();
        C19730wQ.A01(A052, r2);
        C19420v0 r0 = this.A0F;
        r0.A1w(false);
        r0.A1v(false);
        r2.A0F();
        this.A03.A00();
        C220612s r22 = this.A0o;
        if (r22.A00.A0A((AnonymousClass13P) null, false)) {
            Log.i("RegistrationManager/revertToOldNumber/msgstoredb/healthy");
            C220712t.A02(this.A0n, false);
            r22.A01();
            ((C20720y3) this.A0O.get()).A07();
            this.A0j.A05();
            return true;
        }
        ((C20720y3) this.A0O.get()).A08();
        return true;
    }

    public boolean A0G() {
        C19420v0 r0 = this.A0F;
        Me me = new Me(r0.A0f(), r0.A0h(), r0.A0g());
        if (me.jabber_id == null) {
            return false;
        }
        C19730wQ r02 = this.A05;
        r02.A0G();
        C19730wQ.A01(me, r02);
        AnonymousClass005 r2 = this.A0O;
        ((C20720y3) r2.get()).A0z = true;
        Log.i("RegistrationManager/startPassiveConnectionBeforeRestore/finishRegistration/set-connection/passive");
        A07();
        ((C20720y3) r2.get()).A07();
        return true;
    }

    public static String A01(Context context, String str) {
        String packageName = context.getPackageName();
        int length = packageName.length();
        if (!str.startsWith(packageName) || str.length() <= length || str.charAt(length) != '.') {
            return str;
        }
        return str.substring(length + 1);
    }

    public Intent A03() {
        A08();
        AnonymousClass1WR r2 = this.A0d;
        r2.A01 = false;
        r2.A00 = null;
        r2.A04.A1j((String) null, (String) null);
        AnonymousClass1NG r8 = this.A0A;
        r8.A0B();
        ((C20720y3) this.A0O.get()).A0G(false, 16);
        C19730wQ r3 = this.A05;
        r3.A0G();
        AnonymousClass142 r22 = r3.A0E;
        if (r22 != null) {
            AnonymousClass1O7 r1 = this.A0i;
            r1.A03.A03(r22);
            r1.A00(r22, 0, 0);
        }
        Context context = this.A0D.A00;
        File file = new File(context.getFilesDir(), "me");
        if (file.exists()) {
            file.delete();
        }
        r3.A0D();
        A0D((String) null, (String) null, (String) null);
        this.A0q.A00();
        Intent A0C2 = AnonymousClass190.A0C(context);
        A0C2.addFlags(32768);
        C19460v5 r12 = this.A0T;
        if (r12.A05()) {
            ((AnonymousClass005) r12.A02()).get();
            throw new NullPointerException("clearAllStoredData");
        }
        C19460v5 r13 = this.A0P;
        if (r13.A05()) {
            ((AnonymousClass005) r13.A02()).get();
            throw new NullPointerException("clearAllStoredData");
        }
        C19460v5 r14 = this.A0R;
        if (r14.A05()) {
            ((AnonymousClass005) r14.A02()).get();
            throw new NullPointerException("clearAllStoredData");
        }
        A02(this, 1, true);
        ((C74173lB) this.A13.get()).A09();
        C29341Wg r0 = this.A0y;
        r0.A09();
        C29341Wg.A03(r0);
        this.A0p.A07 = false;
        C29301Wc.A00(this.A09).A08.A00 = true;
        AnonymousClass6YO.A09(context);
        C19420v0 r4 = this.A0F;
        C19420v0.A00(r4).putInt("gdrive_successive_backup_failed_count", 0).apply();
        if (r4.A2I() && !r4.A2J()) {
            C19420v0.A00(r4).putBoolean("encrypted_backup_show_forced_reg_after_logout", true).apply();
        }
        this.A0N.Boy(new C35731jA((Object) this, 30));
        r8.A0C();
        r4.A24(true);
        this.A0z.A00(false);
        SharedPreferences.Editor A002 = C19420v0.A00(r4);
        A002.remove("show_pre_reg_do_not_share_code_warning");
        A002.apply();
        r4.A25(false);
        C19420v0.A00(r4).putString("contact_qr_code", (String) null).apply();
        C19420v0.A00(r4).putBoolean("support_ban_appeal_screen_before_verification", false).apply();
        C19420v0.A00(r4).putString("logout_message_header", (String) null).apply();
        C19420v0.A00(r4).putString("logout_message_subtext", (String) null).apply();
        C19420v0.A00(r4).putString("logout_message_locale", (String) null).apply();
        C19420v0.A00(r4).putString("main_button_text", (String) null).apply();
        C19420v0.A00(r4).putString("main_button_url", (String) null).apply();
        C19420v0.A00(r4).putString("secondary_button_text", (String) null).apply();
        C19420v0.A00(r4).putString("secondary_button_url", (String) null).apply();
        AnonymousClass3SS.A03(this.A0k, (AnonymousClass11F) null);
        return A0C2;
    }

    public void A0C(long j) {
        if (j >= 60000) {
            if (!this.A0l.A00(C65743Th.A01(this.A0D.A00, 0, new Intent("com.whatsapp.alarm.REGISTRATION_RETRY").setPackage("com.whatsapp"), 134217728), 2, SystemClock.elapsedRealtime() + j)) {
                Log.w("RegistrationManager/startRegistrationRetryAlarm AlarmManager is null");
            }
        }
    }

    public C29501Ww(C19460v5 r3, C19460v5 r4, C19460v5 r5, C19460v5 r6, C19460v5 r7, C19460v5 r8, C19460v5 r9, C19460v5 r10, C19460v5 r11, C19460v5 r12, C19460v5 r13, C19460v5 r14, C19460v5 r15, C19460v5 r16, AnonymousClass1WR r17, C21390zA r18, AnonymousClass1VX r19, AnonymousClass17Y r20, C19730wQ r21, C20300xL r22, C21100yf r23, AnonymousClass164 r24, C29411Wn r25, C28961Uu r26, AnonymousClass1RU r27, C29301Wc r28, AnonymousClass1NG r29, AnonymousClass196 r30, AnonymousClass185 r31, AnonymousClass1O7 r32, C20430xY r33, AnonymousClass1G5 r34, C236519h r35, C21060yb r36, C19970wo r37, C19630wG r38, C25271Fq r39, C19420v0 r40, C19900wh r41, C18820ts r42, C220712t r43, C220612s r44, AnonymousClass12P r45, AnonymousClass1QN r46, C236419g r47, AnonymousClass1UU r48, C21520zN r49, C20810yC r50, C21510zM r51, C20350xQ r52, AnonymousClass19A r53, AnonymousClass1C4 r54, C28361Si r55, AnonymousClass1XA r56, C19890wg r57, C29341Wg r58, AnonymousClass13I r59, AnonymousClass12U r60, AnonymousClass1X8 r61, AnonymousClass1XF r62, C19770wU r63, AnonymousClass005 r64, AnonymousClass005 r65, AnonymousClass005 r66) {
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A0D = r38;
        this.A0C = r37;
        this.A0J = r50;
        this.A0Y = r3;
        this.A04 = r20;
        this.A0d = r17;
        this.A0l = r35;
        this.A05 = r21;
        this.A0N = r63;
        this.A13 = r64;
        this.A0Z = r4;
        this.A0n = r43;
        this.A0K = r54;
        this.A0e = r23;
        this.A0B = r30;
        this.A0z = r59;
        this.A0f = r24;
        this.A09 = r28;
        this.A0v = r53;
        this.A0O = r65;
        this.A0X = r5;
        this.A0t = r51;
        this.A0m = r36;
        this.A0H = r42;
        this.A0s = r49;
        this.A08 = r27;
        this.A0A = r29;
        this.A0u = r52;
        this.A06 = r22;
        this.A0y = r58;
        this.A0g = r25;
        this.A0j = r33;
        this.A0r = r48;
        this.A03 = r19;
        this.A0i = r32;
        this.A0p = r45;
        this.A0V = r8;
        this.A0c = r9;
        this.A0h = r31;
        this.A0F = r40;
        this.A0L = r55;
        this.A0P = r11;
        this.A10 = r61;
        this.A0E = r39;
        this.A0I = r47;
        this.A0a = r6;
        this.A0b = r7;
        this.A0S = r10;
        this.A0T = r12;
        this.A0w = r56;
        this.A0M = r60;
        this.A0x = r57;
        this.A02 = r18;
        this.A11 = r62;
        this.A0R = r14;
        this.A0q = r46;
        this.A0G = r41;
        this.A0U = r13;
        this.A0o = r44;
        this.A07 = r26;
        this.A0k = r34;
        this.A0Q = r15;
        this.A12 = r66;
        this.A0W = r16;
    }
}
