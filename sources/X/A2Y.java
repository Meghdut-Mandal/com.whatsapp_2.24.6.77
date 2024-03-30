package X;

import com.facebook.profilo.writer.NativeTraceWriterCallbacks;

public class A2Y implements NativeTraceWriterCallbacks {
    public int A00;
    public long A01;
    public Throwable A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final NativeTraceWriterCallbacks A06;
    public final boolean A07;

    public void A00() {
        if (!this.A07) {
            return;
        }
        if (this.A05) {
            this.A06.onTraceWriteException(this.A01, this.A02);
        } else if (this.A04) {
            this.A06.onTraceWriteEnd(this.A01);
        } else if (this.A03) {
            this.A06.onTraceWriteAbort(this.A01, this.A00);
        }
    }

    public void onTraceWriteAbort(long j, int i) {
        if (this.A07) {
            this.A03 = true;
            this.A00 = i;
            this.A01 = j;
            return;
        }
        this.A06.onTraceWriteAbort(j, i);
    }

    public void onTraceWriteEnd(long j) {
        if (this.A07) {
            this.A04 = true;
            this.A01 = j;
            return;
        }
        this.A06.onTraceWriteEnd(j);
    }

    public void onTraceWriteException(long j, Throwable th) {
        if (this.A07) {
            this.A05 = true;
            this.A02 = th;
            this.A01 = j;
            return;
        }
        this.A06.onTraceWriteException(j, th);
    }

    public void onTraceWriteStart(long j, int i) {
        this.A06.onTraceWriteStart(j, i);
    }

    public A2Y(NativeTraceWriterCallbacks nativeTraceWriterCallbacks, boolean z) {
        this.A07 = z;
        this.A06 = nativeTraceWriterCallbacks;
    }
}
