package X;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.1Q0  reason: invalid class name */
public class AnonymousClass1Q0 {
    public static final Uri A0D = Uri.parse("");
    public Handler A00;
    public C132476Tw A01;
    public AnonymousClass005 A02;
    public Boolean A03 = null;
    public ExecutorService A04;
    public final C20810yC A05;
    public final AnonymousClass005 A06;
    public final C19630wG A07;
    public final C19770wU A08;
    public final AnonymousClass005 A09;
    public final AnonymousClass005 A0A;
    public final AnonymousClass005 A0B;
    public final AnonymousClass005 A0C;

    public static synchronized ExecutorService A00(AnonymousClass1Q0 r8) {
        ExecutorService executorService;
        synchronized (r8) {
            executorService = r8.A04;
            if (executorService == null) {
                executorService = r8.A08.B4z("AsyncAudioPlayer", new LinkedBlockingQueue(), 0, 1, 0, 60);
                r8.A04 = executorService;
            }
        }
        return executorService;
    }

    public void A01() {
        if (this.A01 != null) {
            A00(this).submit(new C35751jC(this, 9));
        }
    }

    public void A02(Uri uri) {
        Handler handler;
        Uri uri2 = uri;
        if (uri.compareTo(A0D) != 0) {
            synchronized (this) {
                handler = this.A00;
                if (handler == null) {
                    handler = new C37091ln(Looper.getMainLooper(), this);
                    this.A00 = handler;
                }
            }
            handler.removeMessages(99);
            handler.sendEmptyMessageDelayed(99, 10000);
            A01();
            if (!((C34071gP) this.A0C.get()).A00) {
                Context context = this.A07.A00;
                if (((AnonymousClass1V4) this.A0A.get()).A00) {
                    AudioManager A0D2 = ((C21060yb) this.A0B.get()).A0D();
                    if (A0D2 == null || A0D2.getStreamVolume(5) > 0) {
                        A00(this).submit(new C35341iX(this, context, uri2, 3, 15));
                        return;
                    }
                    return;
                }
                ((AnonymousClass17Y) this.A09.get()).A0H(new C35661j3(uri, context, this, 19));
            }
        }
    }

    public AnonymousClass1Q0(C19630wG r2, C20810yC r3, C19770wU r4, AnonymousClass005 r5, AnonymousClass005 r6, AnonymousClass005 r7, AnonymousClass005 r8, AnonymousClass005 r9, AnonymousClass005 r10) {
        this.A07 = r2;
        this.A08 = r4;
        this.A05 = r3;
        this.A09 = r5;
        this.A0B = r6;
        this.A0C = r7;
        this.A06 = r8;
        this.A0A = r9;
        this.A02 = r10;
    }
}
