package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* renamed from: X.11e  reason: invalid class name */
public class AnonymousClass11e {
    public int A00 = -1;
    public int A01 = 1;
    public C18950u5 A02;
    public C21700zf A03;
    public C130826Mo A04;
    public C195319Tu A05;
    public Integer A06;
    public Long A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public final Handler A0B = new Handler(Looper.getMainLooper());
    public final C19700wN A0C;
    public final C19630wG A0D;
    public final AnonymousClass11g A0E;
    public final C20810yC A0F;
    public final C21010yW A0G;
    public final C18720te A0H;
    public final C219211f A0I;
    public final C18950u5 A0J;
    public final C18950u5 A0K = new C18950u5(10, 1000, 25000, false);
    public final C18950u5 A0L = new C18950u5(100, SearchActionVerificationClientService.NOTIFICATION_ID, 250000, false);
    public final C18950u5 A0M = new C18950u5(100, SearchActionVerificationClientService.NOTIFICATION_ID, 250000, false);
    public final C19770wU A0N;
    public final C21100yf A0O;
    public final C19970wo A0P;
    public final C18820ts A0Q;
    public final C18950u5 A0R;
    public final C18950u5 A0S;
    public final C21640zZ A0T;
    public final C21670zc A0U;
    public final C21690ze A0V;
    public final C21430zE A0W;
    public final AnonymousClass005 A0X;

    public void A05(View view, Runnable runnable, String str, int i) {
        C35511io r3 = new C35511io(this, runnable, str, i, 1);
        Handler handler = this.A0B;
        AnonymousClass00C.A0D(view, 0);
        AnonymousClass00C.A0D(handler, 2);
        view.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass1SJ(handler, view, r3));
    }

    private void A00(long j, String str) {
        C21700zf r4 = this.A03;
        if (r4 != null) {
            if (j > 0) {
                r4.A0D("StartupTracker", j);
            } else {
                r4.A06.markerEnd(r4.A04.A06, 4);
                r4.A0D("StartupTracker", -1);
            }
            this.A03.A0A("startup_type", str, true);
        }
    }

    public static void A01(AnonymousClass11e r10) {
        C21700zf r2 = r10.A03;
        if (r2 == null) {
            C19970wo r1 = r10.A0P;
            C19630wG r22 = r10.A0D;
            C19770wU r7 = r10.A0N;
            C21700zf r0 = new C21700zf(r1, r22, r10.A0G, r10.A0U, r10.A0V, r10.A0W, r7, "StartupTracker", 703928054);
            r10.A03 = r0;
            r0.A04.A04 = true;
            return;
        }
        r2.A0B("is_object_already_create", true, true);
    }

    public static void A02(AnonymousClass11e r7, String str, int i) {
        C18950u5 r1;
        C1693388r r12;
        String str2;
        r7.A00 = i;
        r7.A08 = str;
        C18720te r4 = r7.A0H;
        if (i != 24772609) {
            r4.A01 = SystemClock.elapsedRealtime();
            r4.A02 = SystemClock.uptimeMillis();
            r4.A03 = SystemClock.elapsedRealtimeNanos();
            if (24772610 != i) {
                str2 = "warm";
            } else {
                str2 = "lukewarm";
            }
            r7.A00(-1, str2);
        } else {
            r7.A00(r4.A03, "cold");
            r7.A03.A06.markerPoint(703928054, "attachBaseContext", r4.A00, TimeUnit.NANOSECONDS);
        }
        Integer B3I = r7.A0G.B3I(new AnonymousClass11k(), r7.A02, false);
        r7.A06 = B3I;
        if (B3I != null) {
            int A002 = C20800yB.A00(C21000yV.A02, r7.A0F, 4216);
            AnonymousClass11g r2 = r7.A0E;
            if (A002 < 0) {
                AnonymousClass11g.A00(r2, "app-startup", false);
            } else {
                AnonymousClass11g.A00(r2, "app-startup", true);
            }
        }
        switch (i) {
            case 24772609:
                r1 = r7.A0K;
                break;
            case 24772610:
                r1 = r7.A0M;
                break;
            default:
                r1 = r7.A0L;
                break;
        }
        boolean A003 = r1.A00();
        r7.A0A = A003;
        if (A003 && r7.A0O.A09(C21100yf.A0n)) {
            C200699i4.A00(r7.A0D.A00, i);
            if (C200699i4.A00 == 2 && (r12 = C200699i4.A01) != null) {
                MultiBufferLogger A012 = r12.A01();
                r7.A05 = new C195319Tu(A012);
                C18800tq r22 = ((C21680zd) r7.A0U).A00.A00;
                r7.A04 = new C130826Mo(A012, (C21060yb) r22.A8W.get(), (C19890wg) r22.A7i.get());
                r7.A07 = r7.A05.A00(i);
            }
        }
    }

    private void A03(short s) {
        C21700zf r2 = this.A03;
        if (r2 != null) {
            r2.A0A("locale", this.A0Q.A07(), true);
            if (C20800yB.A01(C21000yV.A02, this.A0F, 6084)) {
                String A0b = ((C19420v0) this.A0X.get()).A0b();
                if (!TextUtils.isEmpty(A0b)) {
                    this.A03.A0A("encrypted_rid", A0b, true);
                }
            }
            this.A03.A0C(s);
        }
    }

    public void A04() {
        Method method = C000600g.A03;
        AnonymousClass00h.A01("wa_startup_complete");
        AnonymousClass00h.A00();
        C21700zf r1 = this.A03;
        if (r1 != null) {
            r1.A06("render");
            A03(2);
        }
    }

    public void A06(View view, Runnable runnable, String str, int i) {
        if (this.A00 != -1) {
            A0B(str, "onRestart", "_start");
        } else if (!this.A09) {
            this.A09 = true;
            A01(this);
            A05(view, runnable, str, i);
            this.A01 = 2;
            this.A02 = this.A0R;
            A02(this, str, 24772611);
        }
    }

    public void A07(String str) {
        C203119nL r2;
        int i = this.A00;
        if (i != -1) {
            if (this.A0A && C200699i4.A00 == 2 && (r2 = C203119nL.A0A) != null) {
                C203119nL.A03(r2, C197679cB.A02, 0, 2, (long) i);
            }
            if (this.A03 != null) {
                if (C20800yB.A01(C21000yV.A02, this.A0F, 1807)) {
                    this.A03.A0A("abort_reason", str, true);
                }
            }
            A03(105);
            if (this.A06 != null) {
                this.A0E.A01("app-startup");
            }
            this.A00 = -1;
            this.A08 = null;
            this.A0A = false;
            this.A07 = null;
        }
    }

    public void A08(String str) {
        C21700zf r0 = this.A03;
        if (r0 != null) {
            r0.A06(str);
        }
    }

    public void A09(String str) {
        C21700zf r0 = this.A03;
        if (r0 != null) {
            r0.A07(str);
        }
    }

    public void A0A(String str) {
        if (this.A00 != -1) {
            A0B(str, "onCreate", "_start");
        } else if (!this.A09) {
            this.A09 = true;
            A01(this);
            this.A01 = 3;
            this.A02 = this.A0S;
            A02(this, str, 24772610);
        }
    }

    public void A0B(String str, String str2, String str3) {
        Long l;
        int i = this.A00;
        if (i != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(str3);
            String obj2 = sb2.toString();
            if (this.A0A && (l = this.A07) != null) {
                C195319Tu r0 = this.A05;
                long longValue = l.longValue();
                MultiBufferLogger multiBufferLogger = r0.A00;
                multiBufferLogger.writeBytesEntry(1, 83, multiBufferLogger.writeStandardEntry(7, 50, 0, 0, i, 0, longValue), obj2);
            }
        }
    }

    public AnonymousClass11e(C19700wN r7, C21100yf r8, C19970wo r9, C19630wG r10, C18820ts r11, AnonymousClass11g r12, C20810yC r13, C21010yW r14, C18720te r15, C219211f r16, C21640zZ r17, C21670zc r18, C21690ze r19, C21430zE r20, C19770wU r21, AnonymousClass005 r22) {
        this.A0P = r9;
        this.A0F = r13;
        this.A0C = r7;
        this.A0D = r10;
        this.A0N = r21;
        this.A0G = r14;
        this.A0O = r8;
        this.A0H = r15;
        this.A0Q = r11;
        this.A0I = r16;
        this.A0T = r17;
        this.A0X = r22;
        this.A0U = r18;
        this.A0E = r12;
        this.A0W = r20;
        this.A0V = r19;
        this.A0J = new C18950u5(200, 1000);
        this.A0S = new C18950u5(2000, SearchActionVerificationClientService.NOTIFICATION_ID);
        this.A0R = new C18950u5(2000, SearchActionVerificationClientService.NOTIFICATION_ID);
    }
}
