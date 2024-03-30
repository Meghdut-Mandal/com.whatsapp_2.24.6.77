package X;

import com.facebook.profilo.writer.NativeTraceWriterCallbacks;

public class A2X implements NativeTraceWriterCallbacks {
    public final /* synthetic */ C166087v0 A00;
    public final /* synthetic */ C207229ul A01;

    public A2X(C166087v0 r1, C207229ul r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onTraceWriteAbort(long j, int i) {
        this.A00.A02.BjL(this.A01, i);
    }

    public void onTraceWriteEnd(long j) {
        this.A00.A02.BjM(this.A01);
    }

    public void onTraceWriteException(long j, Throwable th) {
        this.A00.A02.BjN(this.A01, th);
    }

    public void onTraceWriteStart(long j, int i) {
        this.A00.A02.BjO(this.A01);
    }
}
