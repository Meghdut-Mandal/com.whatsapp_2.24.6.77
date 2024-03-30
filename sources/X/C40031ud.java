package X;

import android.os.Handler;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.Objects;

/* renamed from: X.1ud  reason: invalid class name and case insensitive filesystem */
public class C40031ud extends AnonymousClass04R {
    public final AnonymousClass08S A00;
    public final C001700s A01;
    public final AnonymousClass18U A02;
    public final C19420v0 A03;
    public final AnonymousClass2dN A04;
    public final AnonymousClass1QD A05;
    public final Handler A06 = C36341k9.A0H();
    public final C001600r A07;
    public final C001700s A08;
    public final AnonymousClass12P A09;
    public final AnonymousClass1QE A0A;
    public final C590632m A0B;
    public final AnonymousClass1QG A0C;
    public final Runnable A0D = C81143wX.A00(this, 40);

    public static void A05(C40031ud r1, int i, int i2) {
        if (i == 1) {
            r1.A0A.A00.A04 = Integer.valueOf(i2);
        } else if (i == 2) {
            r1.A0A.A00.A07 = Integer.valueOf(i2);
        } else if (i == 3) {
            r1.A0A.A00.A08 = Integer.valueOf(i2);
        }
    }

    public C40031ud(AnonymousClass18U r22, C29301Wc r23, AnonymousClass54Q r24, C19420v0 r25, AnonymousClass12P r26, C20720y3 r27, C20280xJ r28, AnonymousClass3HJ r29, C29501Ww r30, AnonymousClass1QE r31, AnonymousClass1QD r32, AnonymousClass1QG r33, C24401Ch r34, AnonymousClass1CR r35, AnonymousClass3T0 r36, AnonymousClass54W r37, C19770wU r38) {
        AnonymousClass08S A0Y = C36441kJ.A0Y();
        this.A00 = A0Y;
        C590632m r4 = new C590632m(this);
        this.A0B = r4;
        C001700s A0S = C36431kI.A0S();
        this.A08 = A0S;
        this.A02 = r22;
        this.A09 = r26;
        this.A03 = r25;
        AnonymousClass1QE r13 = r31;
        this.A0A = r13;
        this.A05 = r32;
        AnonymousClass1QG r6 = r33;
        this.A0C = r6;
        AnonymousClass54Q r9 = r24;
        AnonymousClass3T0 r17 = r36;
        C29301Wc r8 = r23;
        AnonymousClass1CR r16 = r35;
        C20720y3 r10 = r27;
        C20280xJ r11 = r28;
        AnonymousClass3HJ r12 = r29;
        AnonymousClass2dN r7 = new AnonymousClass2dN(r8, r9, r10, r11, r12, r13, this, r34, r16, r17, r37, r38, new C18910u1(r30, (AnonymousClass004) null));
        this.A04 = r7;
        C001700s r2 = r7.A00;
        this.A07 = r2;
        A0Y.A0F(r2, new C65973Ue(this, 21));
        Objects.requireNonNull(A0Y);
        A0Y.A0F(A0S, new C65973Ue(A0Y, 20));
        this.A01 = C36431kI.A0S();
        r6.registerObserver(r4);
        A01(this);
    }

    public static void A01(C40031ud r4) {
        AnonymousClass12P r0 = r4.A09;
        r0.A06();
        if (r0.A08) {
            Log.i("DirectTransferBackgroundTaskViewModel/msg-store-is-already-ready");
            A05(r4, r4.A03.A0K(), 2);
            A04(r4, 6);
            return;
        }
        C19420v0 r1 = r4.A03;
        C36341k9.A0v(C19420v0.A00(r1), "migrate_from_other_app_attempt_count", r1.A0K() + 1);
        A03(r4);
        Integer num = 1;
        if (!num.equals(r4.A08.A04())) {
            Log.i("DirectTransferBackgroundTaskViewModel/startBackgroundTaskAfterOtherAppIsLoggedOut/start-background-task");
            A04(r4, 1);
            r4.A04.A02();
        }
    }

    public static void A02(C40031ud r2) {
        Log.i("DirectTransferBackgroundTaskViewModel/removeAllListener");
        r2.A06.removeCallbacks(r2.A0D);
    }

    public static void A03(C40031ud r5) {
        int i = C36341k9.A0E(r5.A03).getInt("direct_db_migration_timeout_in_secs", VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DirectTransferBackgroundTaskViewModel/setupTimeout/timeout =");
        long A072 = C36371kC.A07(i);
        C36351kA.A1S(A0u, A072);
        if (i > 0) {
            r5.A06.postDelayed(r5.A0D, A072);
        }
    }

    public static void A04(C40031ud r2, int i) {
        switch (i) {
            case 1:
            case 2:
            case 7:
                break;
            default:
                if (r2.A03.A0K() >= 3) {
                    A04(r2, 7);
                    return;
                }
                break;
        }
        C36341k9.A17(r2.A08, i);
    }

    public void A0R() {
        A02(this);
        AnonymousClass08S r1 = this.A00;
        r1.A0E(this.A08);
        r1.A0E(this.A07);
        this.A0C.unregisterObserver(this.A0B);
    }
}
