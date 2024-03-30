package X;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.0Ji  reason: invalid class name and case insensitive filesystem */
public final class C04120Ji extends C04160Jm {
    public final C15920oE A00;
    public final C06490Tu A01;
    public final TaskCompletionSource A02;

    public final void A01(Status status) {
        this.A02.trySetException(AnonymousClass0QL.A00(status));
    }

    public final void A02(AnonymousClass0WT r4, boolean z) {
        TaskCompletionSource taskCompletionSource = this.A02;
        r4.A01.put(taskCompletionSource, Boolean.valueOf(z));
        taskCompletionSource.zza.addOnCompleteListener(new C10660eh(r4, taskCompletionSource));
    }

    public final void A03(C10350e6 r4) {
        try {
            this.A01.A00(r4.A04, this.A02);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            A01(AnonymousClass0XC.A00(e2));
        } catch (RuntimeException e3) {
            this.A02.trySetException(e3);
        }
    }

    public final void A04(Exception exc) {
        this.A02.trySetException(exc);
    }

    public final boolean A05(C10350e6 r2) {
        return this.A01.A01;
    }

    public final C04520Ky[] A06(C10350e6 r2) {
        return this.A01.A02;
    }

    public C04120Ji(C15920oE r2, C06490Tu r3, TaskCompletionSource taskCompletionSource, int i) {
        super(i);
        this.A02 = taskCompletionSource;
        this.A01 = r3;
        this.A00 = r2;
        if (i == 2 && r3.A01) {
            throw AnonymousClass001.A08("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }
}
