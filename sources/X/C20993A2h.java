package X;

import android.os.Handler;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.A2h  reason: case insensitive filesystem */
public class C20993A2h implements C23081B3o {
    public final WeakReference A00;

    public void BT6(C207179ug r14, String str, String str2, String str3, String str4, long j, boolean z) {
        C207179ug r5 = r14;
        Bcu(r14);
        C204359ps A002 = A00(this);
        if (A002 != null) {
            C204359ps.A06(A002, "onCancelled", C90524aI.A0w());
            A002.A0E.BkE(C165607th.A0K(A002), r5, str, str2, str3, str4, j, z);
            A002.A02.A00("onCancelled");
        }
    }

    public void BhK(C207179ug r16, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            A002.A0A = false;
            C207179ug r5 = r16;
            C204359ps.A04(A002, r5, false);
            C204359ps.A06(A002, "onStartedPlaying", new Object[0]);
            A002.A0E.BkN(C165607th.A0K(A002), r5, str, (String) null, str3, str4, str5, j, false, false);
            A002.A02.A00("onStartedPlaying");
        }
    }

    public static C204359ps A00(C20993A2h a2h) {
        return (C204359ps) a2h.A00.get();
    }

    public static Integer A01(String str) {
        if (str.equals("UNKNOWN")) {
            return C023109s.A00;
        }
        if (str.equals("DASH")) {
            return C023109s.A01;
        }
        if (str.equals("DASH_LIVE")) {
            return C023109s.A0C;
        }
        if (str.equals("PROGRESSIVE_DOWNLOAD")) {
            return C023109s.A0G;
        }
        if (str.equals("RTC_LIVE")) {
            return C023109s.A0R;
        }
        if (str.equals("HLS")) {
            return C023109s.A0S;
        }
        throw AnonymousClass001.A08(str);
    }

    public C20993A2h(C204359ps r2) {
        this.A00 = AnonymousClass001.A0F(r2);
    }

    public void BSK(C207179ug r13, C207019uQ r14, boolean z) {
        long j;
        C204359ps A002 = A00(this);
        if (A002 != null) {
            C207179ug r6 = r13;
            C204359ps.A04(A002, r13, false);
            C204359ps.A06(A002, "onBufferingStarted", new Object[0]);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean A1P = C36431kI.A1P(((elapsedRealtime - A002.A0Q) > ((long) A002.A05.stallFromSeekThresholdMs) ? 1 : ((elapsedRealtime - A002.A0Q) == ((long) A002.A05.stallFromSeekThresholdMs) ? 0 : -1)));
            long j2 = A002.A01;
            if (j2 != -1) {
                j = elapsedRealtime - j2;
            } else {
                j = -1;
            }
            A002.A0E.BhD(r14, r6, A002.A06, j, z, A1P);
        }
    }

    public void BSL(C207179ug r2, boolean z) {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            C204359ps.A04(A002, r2, z);
        }
    }

    public void BU8(C207179ug r12, String str, boolean z) {
        Integer num;
        C204359ps A002 = A00(this);
        if (A002 != null) {
            C207179ug r6 = r12;
            C204359ps.A04(A002, r12, false);
            C204359ps.A06(A002, "onCompletion", new Object[0]);
            C118655oW A0A = A002.A0A();
            String str2 = r12.A0N;
            if (str2 != null) {
                num = A01(str2);
            } else {
                num = C023109s.A00;
            }
            C204359ps.A03(A002, r12);
            A002.A0E.BkG(A0A, C165607th.A0K(A002), r6, num, str, z, A002.A0R);
        }
    }

    public void BV0(List list) {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            C204359ps.A06(A002, "onCues", C90524aI.A0w());
            A002.A0E.BV0(list);
        }
    }

    public void BVF(long j, String str, boolean z) {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            AtomicInteger atomicInteger = C204359ps.A0T;
            Object[] A1Z = C36431kI.A1Z(str, 3);
            C36421kH.A1R(A1Z, z);
            C36361kB.A1W(A1Z, j);
            C204359ps.A06(A002, "onDecoderInitialized name: %s, isVideo %s, duration: %d", A1Z);
            A002.A0E.BVF(j, str, z);
        }
    }

    public void BWF() {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            C204359ps.A06(A002, "onDrawnToSurface", C90524aI.A0w());
            A002.A0E.BWF();
        }
    }

    public void BWR(String str, String str2) {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            AtomicInteger atomicInteger = C204359ps.A0T;
            A002.A0E.BkH(str, str2);
        }
    }

    public void BWs(String str, String str2, String str3, String str4, String str5, String str6) {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            AnonymousClass902 A003 = AnonymousClass902.A00(str);
            AnonymousClass906 A004 = AnonymousClass906.A00(str2);
            C204359ps.A06(A002, "onError", new Object[0]);
            String str7 = str3;
            String str8 = str4;
            String str9 = str5;
            if (A004 == AnonymousClass906.A0G) {
                Handler handler = A002.A0C;
                String[] strArr = new String[5];
                strArr[0] = A003.name();
                C90464aC.A1D("RESPONSE_CODE_410", str7, str8, strArr);
                strArr[4] = str5;
                AnonymousClass000.A14(handler, strArr, 17);
                return;
            }
            C118655oW r8 = null;
            if (A002.A05.logStallOnPauseOnError) {
                r8 = A002.A0A();
            }
            C20990A2e a2e = A002.A0E;
            C207179ug A0I = C165597tg.A0I(A002);
            a2e.Bcn(r8, new C200889iQ(A004, A003, str7, str8), C165607th.A0K(A002), A0I, str9, str6);
            A002.A02.A00("onError");
        }
    }

    public void BX3(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            AnonymousClass902 A003 = AnonymousClass902.A00(str);
            AnonymousClass906 A004 = AnonymousClass906.A00(str2);
            AtomicInteger atomicInteger = C204359ps.A0T;
            long A08 = A002.A08();
            String str8 = str6;
            C204359ps.A06(A002, "onErrorRecoveryAttempt reason: %s", AnonymousClass000.A1b(str8));
            A002.A0E.BX4(new C200889iQ(A004, A003, str3, str4), str5, str8, str7, A08);
        }
    }

    public void BZm(boolean z) {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            C204359ps.A06(A002, "onLiveBroadcastInterruptStatusChanged", C90524aI.A0w());
            A002.A0E.BZm(z);
        }
    }

    public void BZn(C207019uQ r10) {
        int i;
        C20990A2e a2e;
        boolean z;
        C204359ps A002 = A00(this);
        if (A002 != null) {
            AtomicInteger atomicInteger = C204359ps.A0T;
            C204359ps r7 = A002.A0D.A0B;
            AtomicReference atomicReference = r7.A0J;
            synchronized (atomicReference) {
                C207019uQ r8 = (C207019uQ) atomicReference.get();
                TreeMap treeMap = r7.A0I;
                if (treeMap.isEmpty() || (i = r10.A00) != r8.A00) {
                    Long valueOf = Long.valueOf(r10.A09);
                    i = r10.A00;
                    C36341k9.A1K(valueOf, treeMap, i);
                }
                if (r8.A09 <= r10.A09) {
                    atomicReference.set(r10);
                }
                int i2 = r7.A05.staleManifestThreshold;
                int i3 = r8.A00;
                if (i3 < i2 && i >= i2) {
                    a2e = r7.A0E;
                    z = true;
                } else if (i3 >= i2 && i < i2) {
                    a2e = r7.A0E;
                    z = false;
                }
                a2e.Bhx(z);
            }
        }
    }

    public void BbV(byte[] bArr) {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            C204359ps.A06(A002, "onNewPCMBuffer", C90524aI.A0w());
            A002.A0E.BbV(bArr);
        }
    }

    public void BcK(C207179ug r17, String str, String str2, String str3, long j, boolean z) {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            long j2 = 0;
            AtomicInteger atomicInteger = C204359ps.A0T;
            AUR aur = A002.A05;
            C207179ug r6 = r17;
            if (aur.logPausedSeekPositionBeforeSettingState) {
                j2 = r6.A00();
            }
            C204359ps.A04(A002, r6, false);
            if (!aur.logPausedSeekPositionBeforeSettingState) {
                j2 = r6.A00();
            }
            C204359ps.A06(A002, "onPaused", C90524aI.A0w());
            A002.A0E.BkI(A002.A0A(), C165607th.A0K(A002), r6, A01(r6.A0N), str, str2, str3, j2, j, z);
            A002.A02.A00("onPaused");
            A002.A0A = false;
        }
    }

    public void Bcl() {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            C204359ps.A06(A002, "onPlaybackAboutToFinish", C90524aI.A0w());
            A002.A0E.Bcl();
        }
    }

    public void Bco(float f) {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            C204359ps.A06(A002, "onPlaybackSpeedChanged", C90524aI.A0w());
            A002.A0E.Bcp(C165597tg.A0I(A002), f, A002.A08());
        }
    }

    public void Bcu(C207179ug r3) {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            C204359ps.A04(A002, r3, false);
        }
    }

    public void BdP(C207179ug r4, String str) {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            C204359ps.A04(A002, r4, false);
            C204359ps.A06(A002, "onPrepared", new Object[0]);
            A002.A0E.BdP(r4, str);
            A002.A02.A00("onPrepared");
        }
    }

    public void BeV(boolean z) {
        String str;
        C204359ps A002 = A00(this);
        if (A002 != null && AnonymousClass000.A1P((A002.A0N > 0 ? 1 : (A002.A0N == 0 ? 0 : -1)))) {
            Object[] A0L = AnonymousClass001.A0L();
            if (z) {
                str = "evicted";
            } else {
                str = "released";
            }
            A0L[0] = str;
            C204359ps.A06(A002, "Service player was %s", A0L);
            AnonymousClass000.A14(A002.A0C, Boolean.valueOf(z), 12);
        }
    }

    public void Bg5(C207179ug r4, long j) {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            C204359ps.A04(A002, r4, false);
            C204359ps.A06(A002, "onSeeking", new Object[0]);
            A002.A0E.Bg4(j);
        }
    }

    public void BgN(long j) {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            boolean z = A002.A05.enableBackgroundServicePlayerReuse;
            Object[] A0w = C90524aI.A0w();
            if (z) {
                C204359ps.A06(A002, "setRebindServicePlayerListener", A0w);
                Handler handler = A002.A0C;
                handler.sendMessage(handler.obtainMessage(32));
                return;
            }
            C204359ps.A06(A002, "setRebindServicePlayerListener: message not sent to internal player", A0w);
        }
    }

    public void Bhv() {
        C118655oW r1;
        C204359ps A002 = A00(this);
        if (A002 != null) {
            C204359ps.A06(A002, "onStopped", C90524aI.A0w());
            C195979Xa r0 = A002.A0D.A05;
            if (r0 == null || !"WA_BOT".equals(r0.A07)) {
                r1 = null;
            } else {
                r1 = A002.A0A();
            }
            A002.A0E.Bhw(r1);
        }
    }

    public void BjB(List list) {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            C204359ps.A06(A002, "onWarn", C90524aI.A0w());
            A002.A0E.BjB(list);
        }
    }

    public void BkL(float f, int i, int i2, int i3) {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            AtomicInteger atomicInteger = C204359ps.A0T;
            Object[] A0M = AnonymousClass001.A0M();
            AnonymousClass000.A1J(A0M, i);
            AnonymousClass000.A1K(A0M, i2);
            C204359ps.A06(A002, "onVideoSizeChanged: w=%d, h=%d", A0M);
            A002.A0E.BkL(f, i, i2, i3);
        }
    }

    public void Bkb(String str, String str2, String str3) {
        C204359ps A002 = A00(this);
        if (A002 != null) {
            AnonymousClass902 A003 = AnonymousClass902.A00(str);
            AnonymousClass906 A004 = AnonymousClass906.A00(str2);
            C204359ps.A06(A002, "onWarn", C90524aI.A0w());
            A002.A0E.Bka(new C200889iQ(A004, A003, str3));
        }
    }
}
