package X;

import com.facebook.msys.mci.Execution;

public class AV7 implements Runnable {
    public final /* synthetic */ int A00;

    public AV7(int i) {
        this.A00 = i;
    }

    public void run() {
        Execution.nativeStartExecutor(this.A00);
    }
}
