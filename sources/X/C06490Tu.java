package X;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.0Tu  reason: invalid class name and case insensitive filesystem */
public abstract class C06490Tu {
    public final int A00;
    public final boolean A01;
    public final C04520Ky[] A02;

    public C06490Tu(C04520Ky[] r2, int i, boolean z) {
        this.A02 = r2;
        boolean z2 = false;
        if (r2 != null && z) {
            z2 = true;
        }
        this.A01 = z2;
        this.A00 = i;
    }

    public abstract void A00(C15900oC r1, TaskCompletionSource taskCompletionSource);
}
