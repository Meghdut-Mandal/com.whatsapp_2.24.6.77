package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3wo  reason: invalid class name and case insensitive filesystem */
public final class C81313wo implements Runnable {
    public static final long A0B = TimeUnit.MINUTES.toMillis(11);
    public final C29581Xe A00;
    public final Context A01;
    public final AnonymousClass16D A02;
    public final C19970wo A03;
    public final C25271Fq A04;
    public final C220412q A05;
    public final AnonymousClass190 A06;
    public final C20600xp A07;
    public final C64933Qa A08;
    public final AnonymousClass1CR A09;
    public final AnonymousClass1A1 A0A;

    public void run() {
        String str;
        C65073Qp A0W;
        String str2;
        AnonymousClass3T1 A032 = this.A0A.A03(this.A08);
        if (A032 == null || !(A032 instanceof AnonymousClass2bT)) {
            str = "EventStartNotificationRunnable skip notification/ event message not found";
        } else {
            AnonymousClass2bT r7 = (AnonymousClass2bT) A032;
            C64933Qa r5 = r7.A1J;
            AnonymousClass11F r9 = r5.A00;
            if (r9 != null && (A0W = C36371kC.A0W(this.A05, r9)) != null) {
                if (r7.A06) {
                    str = "EventStartNotificationRunnable skip notification / event cancelled";
                } else if (Math.abs(r7.A00 - C19970wo.A00(this.A03)) > A0B) {
                    str = "EventStartNotificationRunnable skip notification / trigger time beyond tolerance limit";
                } else {
                    AnonymousClass3LI A0d = C36361kB.A0d(r9, this.A09);
                    if (!A0d.A0B()) {
                        str = "EventStartNotificationRunnable skip notification / muted notifications";
                    } else if (A0W.A0i) {
                        str = "EventStartNotificationRunnable skip notification / chat archived";
                    } else {
                        if (Build.VERSION.SDK_INT >= 26) {
                            str2 = ((C47192dt) A0d).A0E();
                            if (str2 == null) {
                                str2 = "other_notifications@1";
                            }
                        } else {
                            str2 = "";
                        }
                        boolean z = r5.A02;
                        Context context = this.A01;
                        if (z) {
                            A00(context, r7, this, r9, str2);
                            return;
                        }
                        C29581Xe r2 = this.A00;
                        r2.A00(r7, "EventStartNotificationRunnable", new AnonymousClass4M7(r2, new C86864Mo(context, r7, this, r9, str2)));
                        return;
                    }
                }
            } else {
                return;
            }
        }
        Log.i(str);
    }

    public static final void A00(Context context, AnonymousClass2bT r9, C81313wo r10, AnonymousClass11F r11, String str) {
        String A0J;
        String str2;
        AnonymousClass141 A082 = r10.A02.A08(r11);
        if (A082 != null && (A0J = A082.A0J()) != null) {
            AnonymousClass190 r0 = r10.A06;
            C64933Qa r2 = r9.A1J;
            Intent A1Z = r0.A1Z(context, r11, 0);
            Bundle A072 = AnonymousClass001.A07();
            AnonymousClass3UJ.A08(A072, r2);
            A1Z.putExtra("show_event_message_on_create_bundle", A072);
            PendingIntent A002 = C65743Th.A00(context, 0, A1Z, 67108864);
            C07700Yy A022 = C20600xp.A02(context);
            A022.A0F(A0J);
            A022.A0L = "event";
            A022.A0I(true);
            A022.A0M = str;
            A022.A0D = A002;
            A022.A0E(C36391kE.A0v(context, r9.A05, new Object[1], 0, R.string.f12nameremoved));
            C36361kB.A1A(A022);
            A022.A0A(r10.A07.A0C(A082));
            Notification A052 = A022.A05();
            AnonymousClass00C.A08(A052);
            Log.i("EventStartNotificationRunnable showing event start notification");
            C25271Fq r4 = r10.A04;
            String str3 = r2.A01;
            AnonymousClass00C.A07(str3);
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                AnonymousClass00C.A0B(instance);
                str2 = Base64.encodeToString(instance.digest(C36351kA.A1b(str3)), 0);
                AnonymousClass00C.A08(str2);
            } catch (NoSuchAlgorithmException unused) {
                Log.e("EventNotificationHelper SHA-256 not supported");
                str2 = "";
            }
            r4.A07(str2, 84, A052);
        }
    }

    public C81313wo(Context context, AnonymousClass16D r3, C19970wo r4, C25271Fq r5, C220412q r6, C29581Xe r7, AnonymousClass190 r8, C20600xp r9, C64933Qa r10, AnonymousClass1CR r11, AnonymousClass1A1 r12) {
        C36321k7.A1B(r4, r6, r8, r7, r3);
        C36321k7.A13(r12, r11, r9);
        AnonymousClass00C.A0D(r5, 9);
        this.A03 = r4;
        this.A05 = r6;
        this.A06 = r8;
        this.A00 = r7;
        this.A02 = r3;
        this.A0A = r12;
        this.A09 = r11;
        this.A07 = r9;
        this.A04 = r5;
        this.A01 = context;
        this.A08 = r10;
    }
}
