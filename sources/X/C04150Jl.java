package X;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.0Jl  reason: invalid class name and case insensitive filesystem */
public abstract class C04150Jl extends C04160Jm {
    public final TaskCompletionSource A00;

    public abstract void A07(C10350e6 r1);

    public final void A01(Status status) {
        this.A00.trySetException(new ApiException(status));
    }

    public final void A04(Exception exc) {
        this.A00.trySetException(exc);
    }

    public C04150Jl(TaskCompletionSource taskCompletionSource, int i) {
        super(i);
        this.A00 = taskCompletionSource;
    }

    public final void A03(C10350e6 r3) {
        try {
            A07(r3);
        } catch (DeadObjectException e) {
            A01(AnonymousClass0XC.A00(e));
            throw e;
        } catch (RemoteException e2) {
            A01(AnonymousClass0XC.A00(e2));
        } catch (RuntimeException e3) {
            this.A00.trySetException(e3);
        }
    }
}
