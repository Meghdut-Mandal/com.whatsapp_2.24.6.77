package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.1lu  reason: invalid class name and case insensitive filesystem */
public final class C37161lu extends HandlerThread {
    public int A00;
    public long A01 = -1;
    public Handler A02;
    public C132476Tw A03;
    public boolean A04;
    public boolean A05;
    public final Handler A06;
    public final C19700wN A07;
    public final C19630wG A08;
    public final C20810yC A09;
    public final AnonymousClass005 A0A;
    public final File A0B;
    public final WeakReference A0C;
    public final int A0D;
    public final C19970wo A0E;

    public static final int A00(C37161lu r6) {
        C132476Tw r0 = r6.A03;
        if (r0 != null) {
            r6.A00 = Math.max(r6.A00, r0.A02());
        }
        int i = r6.A00;
        long j = r6.A01;
        if (j != -1) {
            return i + ((int) (SystemClock.elapsedRealtime() - j));
        }
        return i;
    }

    public static final void A01(C37161lu r5) {
        C132476Tw r0 = r5.A03;
        if (r0 != null) {
            int A032 = r0.A03();
            int A002 = A00(r5);
            if (A032 > 0) {
                r5.A06.post(new C80353vG(r5, A032, A002, 4));
            }
            Handler handler = r5.A02;
            if (handler != null) {
                handler.postDelayed(new C81173wa((Object) r5, 37), (long) r5.A0D);
            }
        }
    }

    public static final void A02(C37161lu r8) {
        long j = r8.A01;
        if (j != -1) {
            r8.A00 += (int) (SystemClock.elapsedRealtime() - j);
            r8.A01 = -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r2.A05 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C37161lu r2) {
        /*
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x0009
            boolean r0 = r2.A05
            r1 = 1
            if (r0 == 0) goto L_0x000a
        L_0x0009:
            r1 = 0
        L_0x000a:
            X.6Tw r0 = r2.A03
            if (r0 == 0) goto L_0x0032
            if (r1 == 0) goto L_0x002f
            int r1 = A00(r2)     // Catch:{ IOException -> 0x0023 }
            X.6Tw r0 = r2.A03     // Catch:{ IOException -> 0x0023 }
            if (r0 == 0) goto L_0x001b
            r0.A0A(r1)     // Catch:{ IOException -> 0x0023 }
        L_0x001b:
            X.6Tw r0 = r2.A03     // Catch:{ IOException -> 0x0023 }
            if (r0 == 0) goto L_0x0032
            r0.A07()     // Catch:{ IOException -> 0x0023 }
            return
        L_0x0023:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            android.os.Handler r1 = r2.A06
            r0 = 30
            X.C81173wa.A00(r1, r2, r0)
            return
        L_0x002f:
            r0.A04()
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37161lu.A03(X.1lu):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37161lu(C19700wN r3, C19970wo r4, C19630wG r5, C20810yC r6, C47542ew r7, AnonymousClass005 r8, File file) {
        super("VoiceStatusPlayerThread");
        C36321k7.A18(r5, r6, r3, r4);
        AnonymousClass00C.A0D(r8, 6);
        this.A08 = r5;
        this.A09 = r6;
        this.A07 = r3;
        this.A0E = r4;
        this.A0A = r8;
        this.A0B = file;
        this.A0C = AnonymousClass001.A0F(r7);
        this.A06 = C36341k9.A0H();
        this.A0D = 16;
    }
}
