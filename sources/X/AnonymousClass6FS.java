package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.6FS  reason: invalid class name */
public class AnonymousClass6FS {
    public C133226Xi A00;
    public C1042758y A01;
    public String A02;
    public C1041458l A03;
    public final C33101ei A04;
    public final C33121ek A05;
    public final C33171eq A06;
    public final C33131el A07 = new C162707p1(this, 0);
    public final C33131el A08 = new C162707p1(this, 1);
    public final C19420v0 A09;
    public final C21380z9 A0A;
    public final Object A0B = C36441kJ.A11();
    public final C19700wN A0C;
    public final C20050ww A0D;
    public final C24461Cn A0E;
    public final C24431Ck A0F;
    public final C33161ep A0G;
    public final C131096Ns A0H;
    public final C19600wD A0I;
    public final AnonymousClass179 A0J;
    public final C19630wG A0K;
    public final C20830yE A0L;
    public final C20810yC A0M;
    public final C24051Aw A0N;
    public final C20020wt A0O;
    public final C19770wU A0P;

    public C133226Xi A00() {
        C133226Xi r0;
        synchronized (this.A0B) {
            r0 = this.A00;
        }
        return r0;
    }

    public C133226Xi A01(String str, String str2) {
        C133226Xi r2;
        synchronized (this.A0B) {
            Context context = this.A0K.A00;
            C20810yC r12 = this.A0M;
            C19700wN r4 = this.A0C;
            C20020wt r14 = this.A0O;
            C20050ww r5 = this.A0D;
            AnonymousClass179 r10 = this.A0J;
            r2 = new C133226Xi(context, r4, r5, this.A0E, this.A0F, this.A0H, this.A0I, r10, this.A0L, r12, this.A0N, r14, this.A0P, str, str2);
            this.A00 = r2;
        }
        return r2;
    }

    public C1041458l A02() {
        C1041458l r0;
        synchronized (this.A0B) {
            r0 = this.A03;
            if (r0 == null) {
                r0 = new C1041458l();
                this.A03 = r0;
            }
        }
        return r0;
    }

    public void A03() {
        synchronized (this.A0B) {
            C133226Xi r1 = this.A00;
            if (r1 != null) {
                synchronized (r1) {
                    Log.i("GoogleBackupApi/cancel");
                    r1.A00 = true;
                    r1.A0B(false);
                }
            }
        }
        this.A0A.A01("gdrive_backup", false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r5 = this;
            java.lang.String r0 = "gdrive-service/cancel-pending-backup-and-restore-if-any"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0v0 r3 = r5.A09
            java.util.concurrent.Executor r0 = X.AnonymousClass6Y6.A00
            int r0 = r3.A0F()
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.String r1 = "gdrive-service/drive-api/null"
            r2 = 0
            if (r0 != 0) goto L_0x00a4
            X.1ei r4 = r5.A04
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0Q
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x00a4
            boolean r0 = X.AnonymousClass6Y6.A05(r3)
            if (r0 == 0) goto L_0x007a
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0S
            r0.getAndSet(r2)
            android.os.ConditionVariable r0 = r4.A0G
            r0.open()
            X.6Xi r0 = r5.A00()
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = "gdrive-service/cancel-media-restore/interrupt-drive-api"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.A03()
            android.os.ConditionVariable r0 = r4.A0F
            r0.open()
            android.os.ConditionVariable r0 = r4.A0C
            r0.open()
            X.1ek r0 = r5.A05
            r0.A01()
        L_0x004d:
            r3.A1A(r2)
        L_0x0050:
            r0 = 10
            r5.A06(r0)
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r3)
            java.lang.String r1 = "gdrive_user_initiated_backup"
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L_0x0064
            X.C36331k8.A18(r3, r1, r2)
        L_0x0064:
            return
        L_0x0065:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            android.os.ConditionVariable r0 = r4.A0F
            r0.open()
            android.os.ConditionVariable r0 = r4.A0C
            r0.open()
            X.0wU r1 = r5.A0P
            r0 = 10
            X.C1497072l.A00(r1, r5, r0)
            goto L_0x0050
        L_0x007a:
            int r1 = r3.A0F()
            r0 = 3
            if (r1 != r0) goto L_0x009e
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0T
            r0.getAndSet(r2)
            android.os.ConditionVariable r0 = r4.A0G
            r0.open()
            r5.A03()
            android.os.ConditionVariable r0 = r4.A0E
            r0.open()
            android.os.ConditionVariable r0 = r4.A0B
            r0.open()
            X.1ep r0 = r5.A0G
            r0.A04()
            goto L_0x004d
        L_0x009e:
            java.lang.String r0 = "gdrive-service/cancel/nothing-to-cancel"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0050
        L_0x00a4:
            X.1ei r4 = r5.A04
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0Q
            r0.getAndSet(r2)
            X.AnonymousClass6UR.A02()
            android.os.ConditionVariable r0 = r4.A0G
            r0.open()
            X.6Xi r0 = r5.A00()
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = "gdrive-service/cancel-backup/interrupt-drive-api"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.A03()
            android.os.ConditionVariable r0 = r4.A0D
            r0.open()
            android.os.ConditionVariable r0 = r4.A0A
            r0.open()
        L_0x00cb:
            X.1ep r0 = r5.A0G
            r0.A04()
            r4.A04 = r2
            goto L_0x004d
        L_0x00d4:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            android.os.ConditionVariable r0 = r4.A0D
            r0.open()
            android.os.ConditionVariable r0 = r4.A0A
            r0.open()
            X.0wU r1 = r5.A0P
            r0 = 9
            X.C1497072l.A00(r1, r5, r0)
            goto L_0x00cb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6FS.A04():void");
    }

    public void A05() {
        synchronized (this.A0B) {
            this.A01 = null;
        }
    }

    public AnonymousClass6FS(C19700wN r3, C20050ww r4, C24461Cn r5, C24431Ck r6, C33101ei r7, C33121ek r8, C33171eq r9, C33161ep r10, C131096Ns r11, C19600wD r12, AnonymousClass179 r13, C19630wG r14, C20830yE r15, C19420v0 r16, C20810yC r17, C24051Aw r18, C20020wt r19, C19770wU r20, C21380z9 r21) {
        this.A0K = r14;
        this.A0M = r17;
        this.A0C = r3;
        this.A0O = r19;
        this.A0P = r20;
        this.A0D = r4;
        this.A0J = r13;
        this.A0F = r6;
        this.A0H = r11;
        this.A0L = r15;
        this.A09 = r16;
        this.A0N = r18;
        this.A0A = r21;
        this.A0E = r5;
        this.A0I = r12;
        this.A04 = r7;
        this.A05 = r8;
        this.A0G = r10;
        this.A06 = r9;
    }

    public void A06(int i) {
        String str;
        C1042758y r1;
        String A022 = C34191gb.A02(i);
        if (i != 10) {
            TextUtils.join("\n", Thread.currentThread().getStackTrace());
            C36321k7.A1P("gdrive-service/set-error/", A022, AnonymousClass000.A0u());
        }
        C19420v0 r7 = this.A09;
        r7.A18(i);
        Object obj = this.A0B;
        synchronized (obj) {
            str = this.A02;
        }
        if (AnonymousClass6Y6.A05(r7) || "action_restore_media".equals(str)) {
            this.A05.A03(i, this.A06.A00());
            A02().A0A = Integer.valueOf(C34191gb.A00(i));
        } else if (r7.A0F() == 3 || "action_restore".equals(str)) {
            C33121ek r12 = this.A05;
            Bundle A002 = this.A06.A00();
            Iterator A0s = C36361kB.A0s(r12);
            while (A0s.hasNext()) {
                ((C33151eo) A0s.next()).BX2(i, A002);
            }
        } else {
            if (r7.A0F() == 1 || "action_backup".equals(str)) {
                synchronized (obj) {
                    r1 = this.A01;
                }
                if (r1 != null && r1.A0V == null) {
                    C1042758y.A00(r1, C34191gb.A00(i));
                }
            } else if (str != null) {
                if (i != 10) {
                    C36321k7.A1P("gdrive-service/set-error/unexpected-service-start-action/", str, AnonymousClass000.A0u());
                    return;
                }
                return;
            } else if (i != 10) {
                Log.e("gdrive-service/set-error/unexpected-service-start-action/null", new Throwable());
                return;
            } else {
                Log.i("gdrive-service/set-error/action-is-null and nothing is pending (probably backup attempt failed)");
            }
            this.A05.A02(i, this.A06.A00());
        }
    }
}
