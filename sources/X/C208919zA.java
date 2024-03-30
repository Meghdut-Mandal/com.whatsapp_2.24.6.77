package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.9zA  reason: invalid class name and case insensitive filesystem */
public class C208919zA implements B3Y {
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final C195899Ws A08;

    public C208919zA(C195899Ws r6, int i, int i2, int i3, int i4, int i5) {
        A00(i3, 0, "bufferForPlaybackMs", "0");
        A00(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        A00(i, i3, "minBufferMs", "bufferForPlaybackMs");
        A00(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        A00(i2, i, "maxBufferMs", "minBufferMs");
        A00(0, 0, "backBufferDurationMs", "0");
        this.A08 = r6;
        this.A07 = Util.A04((long) i);
        this.A06 = Util.A04((long) i2);
        this.A05 = Util.A04((long) i3);
        this.A04 = Util.A04((long) i4);
        this.A02 = i5;
        this.A00 = i5 == -1 ? 13107200 : i5;
        this.A03 = Util.A04((long) 0);
    }

    public void BdN() {
        A01(false);
    }

    public void BeW() {
        A01(true);
    }

    public void Bhv() {
        A01(true);
    }

    public void BrV(long j, long j2) {
    }

    private void A01(boolean z) {
        int i = this.A02;
        if (i == -1) {
            i = 13107200;
        }
        this.A00 = i;
        this.A01 = false;
        if (z) {
            C195899Ws r1 = this.A08;
            synchronized (r1) {
                r1.A02(0);
            }
        }
    }

    public void BjQ(C206419tN r6, B5Q[] b5qArr, B5T[] b5tArr) {
        int i = this.A02;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < b5qArr.length; i3++) {
                if (b5tArr[i3] != null) {
                    int i4 = b5qArr[i3].A0B;
                    int i5 = 13107200;
                    if (i4 != 1) {
                        i5 = 131072000;
                        if (i4 != 2) {
                            i5 = C132986Wc.A0F;
                        }
                    }
                    i2 += i5;
                }
            }
            i = Math.max(13107200, i2);
        }
        this.A00 = i;
        this.A08.A02(i);
    }

    public boolean Bt2(float f, long j, long j2, boolean z) {
        boolean z2 = true;
        boolean A1T = C36371kC.A1T(this.A08.A00(), this.A00);
        long j3 = this.A07;
        if (f > 1.0f) {
            if (f != 1.0f) {
                j3 = Math.round(((double) j3) * ((double) f));
            }
            j3 = Math.min(j3, this.A06);
        }
        if (j < Math.max(j3, 500000)) {
            if (A1T) {
                z2 = false;
            }
            this.A01 = z2;
            if (!z2 && j < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= this.A06 || A1T) {
            this.A01 = false;
        }
        return this.A01;
    }

    public boolean BtX(float f, long j, boolean z, boolean z2) {
        long j2;
        if (f != 1.0f) {
            j = Math.round(((double) j) / ((double) f));
        }
        if (z) {
            j2 = this.A04;
        } else {
            j2 = this.A05;
        }
        if (j2 <= 0 || j >= j2 || this.A08.A00() >= this.A00) {
            return true;
        }
        return false;
    }

    public static void A00(int i, int i2, String str, String str2) {
        boolean A1T = C36371kC.A1T(i, i2);
        String A0p = AnonymousClass000.A0p(" cannot be less than ", str2, AnonymousClass000.A0v(str));
        if (!A1T) {
            throw AnonymousClass001.A08(String.valueOf(A0p));
        }
    }

    public C195899Ws B8a() {
        return this.A08;
    }

    public long B8i() {
        return this.A03;
    }

    public boolean Bon() {
        return false;
    }

    public C208919zA() {
        this(new C195899Ws(65536), 50000, 50000, 2500, 5000, -1);
    }
}
