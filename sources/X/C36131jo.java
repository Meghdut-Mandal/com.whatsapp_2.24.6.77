package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.1jo  reason: invalid class name and case insensitive filesystem */
public class C36131jo implements Executor {
    public Object A00;
    public final int A01;

    public C36131jo(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void execute(Runnable runnable) {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                ((AnonymousClass17Y) obj).A0H(runnable);
                return;
            case 1:
                ((AnonymousClass17Y) obj).Bp3(runnable);
                return;
            case 2:
                ((C19770wU) obj).Boy(runnable);
                return;
            default:
                ((Handler) obj).post(runnable);
                return;
        }
    }
}
