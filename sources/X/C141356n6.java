package X;

import android.media.MediaFormat;
import android.os.Process;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6n6  reason: invalid class name and case insensitive filesystem */
public class C141356n6 implements C160937lp {
    public AnonymousClass6OY A00;
    public C122155uO A01;
    public C122175uQ A02;
    public int A03;
    public AnonymousClass79Y A04 = new AnonymousClass79Y();
    public boolean A05;
    public boolean A06;
    public final AnonymousClass7ez A07;
    public final C131456Pc A08;
    public final C109645Yj A09;
    public final C109655Yk A0A;
    public final C118685oZ A0B;
    public final C159107ip A0C;
    public final ExecutorService A0D;
    public final int A0E = ((int) TimeUnit.MILLISECONDS.toMicros(250));
    public final C125085zI A0F;
    public volatile boolean A0G;
    public volatile AnonymousClass6VP A0H;
    public volatile C160917ln A0I;
    public volatile Future A0J;
    public volatile boolean A0K;
    public volatile boolean A0L;

    public void B3P(int i) {
        C122175uQ r0;
        C109605Yf.A00("VideoDemuxDecodeWrapperTag", "configure", new Object[0]);
        this.A03 = i;
        AnonymousClass7ez r2 = this.A07;
        C109655Yk r1 = this.A0A;
        C125085zI r11 = this.A0F;
        AnonymousClass65W r9 = r11.A07;
        this.A0H = new AnonymousClass6VP(r2, r1, r9);
        this.A0I = this.A0C.B4S();
        C129266Gc.A01(this.A0H, r11);
        AnonymousClass6VP r02 = this.A0H;
        AnonymousClass5TE r8 = AnonymousClass5TE.VIDEO;
        r02.A07(r8);
        if (!C129256Gb.A01(r11)) {
            AnonymousClass65N A052 = this.A0H.A05();
            AnonymousClass6OY r12 = r11.A04;
            r12.A06 = A052.A05;
            r12.A04 = A052.A03;
            r12.A05 = A052.A04;
        }
        C160917ln r6 = this.A0I;
        MediaFormat A042 = this.A0H.A04();
        if (r6 != null && A042 != null) {
            ArrayList A0I2 = AnonymousClass001.A0I();
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 4) {
                    break;
                }
                try {
                    r6.Bm6(A042, r9, A0I2, i);
                    break;
                } catch (Throwable th) {
                    if (!(th instanceof IllegalStateException) || i3 > 4 || th.getMessage() == null || !th.getMessage().startsWith("codec name:")) {
                        Object[] objArr = new Object[4];
                        objArr[0] = A042;
                        AnonymousClass000.A1K(objArr, i3);
                        C90514aH.A1O(Arrays.toString(A0I2.toArray()), th, objArr);
                        C109605Yf.A00("VideoDemuxDecodeWrapperTag", "prepareDecoderWithRetry: media format=%s, number of retries=%s, blacklisted decoders=%s, Exception=%s", objArr);
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("media format:");
                        A0u.append(A042);
                        A0u.append(", number of retries:");
                        A0u.append(i3);
                        A0u.append(", blacklisted decoders:");
                        throw new IllegalStateException(AnonymousClass000.A0q(Arrays.toString(A0I2.toArray()), A0u), th);
                    }
                    A0I2.add(th.getMessage().substring(11));
                    i2 = i3;
                }
            }
        }
        AnonymousClass6QD r03 = r11.A05;
        if (r03 != null) {
            AnonymousClass67B r13 = new AnonymousClass67B(r03);
            r13.A00(r8, this.A03);
            r0 = new C122175uQ(r13);
        } else {
            r0 = null;
        }
        this.A02 = r0;
        this.A01 = A01();
        this.A08.A0D = this.A0I.BAr();
        this.A05 = true;
        C109605Yf.A00("VideoDemuxDecodeWrapperTag", "configure: mIsConfigured done", new Object[0]);
    }

    private long A00(long j) {
        C122175uQ r4 = this.A02;
        if (r4 == null || j < 0) {
            return j;
        }
        if (!r4.A03) {
            C131736Qi.A02(AnonymousClass000.A1V(r4.A02.A00), "No track is selected");
            r4.A03 = true;
        }
        long j2 = (long) (((float) r4.A00) + (((float) (j - r4.A01)) / 1.0f));
        r4.A00 = j2;
        C131736Qi.A02(AnonymousClass000.A1V(r4.A02.A00), "No track is selected");
        r4.A01 = j;
        return j2;
    }

    private C122155uO A01() {
        AnonymousClass6QD r0 = this.A0F.A05;
        if (r0 == null) {
            return null;
        }
        C122155uO r3 = new C122155uO(r0);
        AnonymousClass5TE r2 = AnonymousClass5TE.VIDEO;
        int i = this.A03;
        r3.A00 = r2;
        C128956Eg A012 = r3.A03.A01(r2, i);
        r3.A01 = A012;
        if (A012 != null) {
            Iterator A0r = C90474aD.A0r(A012.A03);
            r3.A02 = A0r;
            if (A0r != null && A0r.hasNext()) {
                r3.A02.next();
            }
            return r3;
        }
        throw AnonymousClass001.A08("Requested Track is not available");
    }

    public long B57() {
        Trace.beginSection("VideoDemuxDecodeWrapper.decodeFrameAndAdvance");
        if (this.A06) {
            try {
                C160917ln r1 = this.A0I;
                long j = (long) this.A0E;
                long B59 = r1.B59(j) + 0;
                while (B59 < 0 && !this.A0I.BNU() && !this.A0K) {
                    Trace.beginSection("VideoDemuxDecodeWrapper.decodeFrameAndAdvanceLoop");
                    B59 = 0 + this.A0I.B59(j);
                    Trace.endSection();
                }
                if (this.A0J.isDone() && !this.A0G) {
                    this.A0J.get();
                    this.A0G = true;
                }
                if (this.A0I.BNU() && !this.A0G) {
                    this.A0J.get();
                }
                long A002 = A00(B59);
                Trace.endSection();
                return A002;
            } catch (IllegalStateException e) {
                throw new IllegalStateException(C36381kD.A0z("Previous Enqueue Buffer: ", AnonymousClass000.A0u(), 0), e);
            }
        } else {
            C109605Yf.A00("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not started", C90524aI.A0w());
            throw new AnonymousClass5VN("VideoDemuxDecodeWrapper not started");
        }
    }

    public void B58(long j) {
        if (!this.A06) {
            C109605Yf.A00("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not started", C90524aI.A0w());
            throw new AnonymousClass5VN("VideoDemuxDecodeWrapper not started");
        }
        while (BAp() <= j && !this.A0I.BNU() && !this.A0K) {
            B57();
        }
    }

    public long BAp() {
        C128956Eg r0;
        long BAp = this.A0I.BAp() + 0;
        C122155uO r02 = this.A01;
        if (r02 == null || (r0 = r02.A01) == null || C36441kJ.A15(r0.A03).isEmpty()) {
            return A00(BAp);
        }
        C131736Qi.A02(AnonymousClass000.A1V(this.A01.A00), "No track is selected");
        return BAp;
    }

    public AnonymousClass6D7 BDz() {
        return this.A0H.A03;
    }

    public boolean BLY() {
        return this.A0I.BNU();
    }

    public void start() {
        if (this.A05) {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            C109605Yf.A00("VideoDemuxDecodeWrapperTag", "start", new Object[0]);
            this.A0L = false;
            this.A0J = this.A0D.submit(new C163777qk(this, threadPriority, 0));
            this.A06 = true;
            return;
        }
        C109605Yf.A00("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not configured", C90524aI.A0w());
        throw new AnonymousClass5VN("VideoDemuxDecodeWrapper not configured");
    }

    public C141356n6(AnonymousClass7ez r4, C131456Pc r5, C109645Yj r6, C109655Yk r7, C118685oZ r8, C125085zI r9, C159107ip r10, ExecutorService executorService) {
        this.A0D = executorService;
        this.A0F = r9;
        this.A0B = r8;
        this.A09 = r6;
        this.A07 = r4;
        this.A0A = r7;
        this.A08 = r5;
        this.A0C = r10;
        this.A00 = r9.A04;
    }

    public void BpZ(long j) {
        C128956Eg r0;
        Object[] A0L2 = AnonymousClass001.A0L();
        C90474aD.A1S(A0L2, j);
        C109605Yf.A00("VideoDemuxDecodeWrapperTag", "seekTo: ptsUs=%s", A0L2);
        if (!this.A05) {
            C109605Yf.A00("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not configured", C90524aI.A0w());
            throw new AnonymousClass5VN("VideoDemuxDecodeWrapper not configured");
        } else if (!this.A06) {
            C122155uO r02 = this.A01;
            if (r02 == null || (r0 = r02.A01) == null || C36441kJ.A15(r0.A03).isEmpty()) {
                float f = (float) j;
                AnonymousClass6QD r03 = this.A0F.A05;
                if (r03 != null) {
                    AnonymousClass67B r2 = new AnonymousClass67B(r03);
                    r2.A00(AnonymousClass5TE.VIDEO, this.A03);
                    C131736Qi.A02(AnonymousClass000.A1V(r2.A00), "No track is selected");
                }
                j = (long) (f * 1.0f);
            } else {
                C122155uO A012 = A01();
                this.A01 = A012;
                C131736Qi.A02(AnonymousClass000.A1V(A012.A00), "No track is selected");
            }
            if (j >= 0) {
                this.A0H.A06(j);
            }
        } else {
            C109605Yf.A00("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper has already started", C90524aI.A0w());
            throw new AnonymousClass5VN("VideoDemuxDecodeWrapper has already started");
        }
    }

    public void cancel() {
        C109605Yf.A00("VideoDemuxDecodeWrapperTag", "cancel", C90524aI.A0w());
        this.A0K = true;
        C109605Yf.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture", new Object[0]);
        if (this.A0J != null && !this.A0J.isDone()) {
            AnonymousClass79Y r5 = this.A04;
            Object[] objArr = new Object[0];
            if (r5.mEnableThreadLockSync) {
                C109605Yf.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture mExtractFuturelock.isEnabled", objArr);
                this.A0L = true;
                try {
                    this.A0J.get();
                } catch (Throwable th) {
                    C109605Yf.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture Throwable=%s", th);
                }
                if (r5.mEnableThreadLockSync) {
                    r5.lock();
                }
                try {
                    C109605Yf.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture mExtractFuturelock.open", new Object[0]);
                    r5.close();
                    C109605Yf.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture mExtractFuturelock done", new Object[0]);
                    return;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            } else {
                C109605Yf.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture: mExtractFuture.cancel", objArr);
                this.A0J.cancel(true);
                try {
                    this.A0J.get();
                    return;
                } catch (Throwable th3) {
                    C109605Yf.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture Throwable=%s", th3);
                    return;
                }
            }
        } else {
            return;
        }
    }

    public void release() {
        C109605Yf.A00("VideoDemuxDecodeWrapperTag", "release", C90524aI.A0w());
        AnonymousClass6MV r2 = new AnonymousClass6MV();
        AnonymousClass60I.A00(new C162577oo(r2, this.A0H));
        AnonymousClass60I.A00(new C162577oo(r2, this.A0I));
        Throwable th = r2.A01;
        if (th != null) {
            throw th;
        }
    }
}
