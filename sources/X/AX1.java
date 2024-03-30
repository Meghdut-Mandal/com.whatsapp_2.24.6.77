package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class AX1 implements Runnable {
    public final TaskCompletionSource a;

    public AX1() {
        this.a = null;
    }

    public AX1(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.a;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public static Parcel A00(C204459q2 r2) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r2.A00);
        obtain.writeInt(1);
        return obtain;
    }

    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }
}
