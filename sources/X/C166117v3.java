package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* renamed from: X.7v3  reason: invalid class name and case insensitive filesystem */
public final class C166117v3 extends Handler implements Runnable {
    public int A00;
    public IOException A01;
    public B2D A02;
    public C191099Bo A03;
    public final int A04;
    public final long A05;
    public final B0X A06;
    public volatile Thread A07;
    public volatile boolean A08;
    public volatile boolean A09;
    public final /* synthetic */ C198829eG A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166117v3(Looper looper, B2D b2d, B0X b0x, C198829eG r4, int i, long j) {
        super(looper);
        this.A0A = r4;
        this.A06 = b0x;
        this.A02 = b2d;
        this.A04 = i;
        this.A05 = j;
    }

    public void A00(boolean z) {
        this.A09 = z;
        this.A01 = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.A08 = true;
            this.A06.B2W();
            Thread thread = this.A07;
            if (thread != null) {
                thread.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.A0A.A00 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        B2D b2d = this.A02;
        Objects.requireNonNull(b2d);
        b2d.BZp(this.A06, elapsedRealtime, elapsedRealtime - this.A05, true);
        this.A02 = null;
    }

    public void handleMessage(Message message) {
        int i;
        if (!this.A09) {
            Message message2 = message;
            int i2 = message2.what;
            if (i2 == 0) {
                this.A01 = null;
                C198829eG r0 = this.A0A;
                ExecutorService executorService = r0.A02;
                C166117v3 r02 = r0.A00;
                Objects.requireNonNull(r02);
                executorService.execute(r02);
            } else if (i2 != 4) {
                C198829eG r3 = this.A0A;
                r3.A00 = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.A05;
                B2D b2d = this.A02;
                Objects.requireNonNull(b2d);
                if (this.A08 || (i = message2.what) == 1) {
                    b2d.BZp(this.A06, elapsedRealtime, j, false);
                } else if (i == 2) {
                    try {
                        b2d.BZr(this.A06, elapsedRealtime, j);
                    } catch (RuntimeException e) {
                        Log.e("LoadTask", "Unexpected exception handling load completed", e);
                        r3.A01 = new C187188xP(e);
                    }
                } else if (i == 3) {
                    IOException iOException = (IOException) message2.obj;
                    this.A01 = iOException;
                    int i3 = this.A00 + 1;
                    this.A00 = i3;
                    C191099Bo BZw = b2d.BZw(this.A06, iOException, i3, elapsedRealtime, j);
                    this.A03 = BZw;
                    int i4 = BZw.A00;
                    if (i4 == 3) {
                        r3.A01 = this.A01;
                    } else if (i4 != 2) {
                        if (i4 == 1) {
                            this.A00 = 1;
                        }
                        long min = (long) ((int) Math.min(C36371kC.A07(this.A00 - 1) + 500, 5000));
                        C200319h9.A02(AnonymousClass000.A1W(r3.A00));
                        r3.A00 = this;
                        if (min > 0) {
                            sendEmptyMessageDelayed(0, min);
                            return;
                        }
                        this.A01 = null;
                        ExecutorService executorService2 = r3.A02;
                        Objects.requireNonNull(this);
                        executorService2.execute(this);
                    }
                }
            } else {
                throw ((Throwable) message2.obj);
            }
        }
    }

    public void run() {
        try {
            this.A07 = Thread.currentThread();
            if (!this.A08) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("load:<cls>");
                B0X b0x = this.A06;
                AnonymousClass000.A1C(b0x, A0u);
                C196289Yq.A01(AnonymousClass000.A0q("</cls>", A0u));
                b0x.BOE();
                C196289Yq.A00();
            }
            if (!this.A09) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.A09) {
                C165577te.A0w(this, e, 3);
            }
        } catch (InterruptedException unused) {
            C200319h9.A02(this.A08);
            if (!this.A09) {
                sendEmptyMessage(2);
            }
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (!this.A09) {
                C165577te.A0w(this, new C187188xP(e2), 3);
            }
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (!this.A09) {
                C165577te.A0w(this, new C187188xP(e3), 3);
            }
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.A09) {
                C165577te.A0w(this, e4, 4);
            }
            throw e4;
        } catch (Throwable th) {
            C196289Yq.A00();
            throw th;
        }
    }
}
