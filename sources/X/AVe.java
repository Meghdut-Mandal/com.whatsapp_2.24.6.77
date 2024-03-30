package X;

import com.facebook.msys.mci.Execution;

public class AVe implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass72f A03;

    public AVe(AnonymousClass72f r1, int i, int i2, long j) {
        this.A03 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }

    public void run() {
        Execution.executeAfterWithPriorityInternal(this.A03, this.A00, this.A01, this.A02);
    }
}
