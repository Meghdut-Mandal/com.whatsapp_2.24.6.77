package X;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.8Da  reason: invalid class name and case insensitive filesystem */
public final class C170338Da extends C170358Dc {
    public final TaskCompletionSource A00;
    public final C22811AwM A01;

    public final void ByV(C170208Cj r4) {
        AnonymousClass0QK.A00(r4.A00, this.A00, (Object) null);
    }

    public final void zzc() {
        A47 a47 = (A47) this.A01;
        C98744rx r3 = a47.A00;
        A3M a3m = a47.A01;
        AnonymousClass6JN r1 = a47.A02;
        a3m.A00 = false;
        r3.A04(r1);
    }

    public C170338Da(C22811AwM awM, TaskCompletionSource taskCompletionSource) {
        this.A00 = taskCompletionSource;
        this.A01 = awM;
    }
}
