package X;

/* renamed from: X.6wV  reason: invalid class name and case insensitive filesystem */
public class C146996wV implements C159587jb {
    public final /* synthetic */ AnonymousClass6NX A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ boolean A03;

    public C146996wV(AnonymousClass6NX r1, Runnable runnable, Runnable runnable2, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A02 = runnable;
        this.A01 = runnable2;
    }

    public void BWY() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("fpm/ExportHelper/setIntentToMigrateFlag()/failure, value: ");
        C36331k8.A1S(A0u, this.A03);
        Runnable runnable = this.A01;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void onSuccess() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("fpm/ExportHelper/setIntentToMigrateFlag()/success, value: ");
        C36331k8.A1S(A0u, this.A03);
        this.A02.run();
    }
}
