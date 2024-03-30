package X;

/* renamed from: X.0gr  reason: invalid class name and case insensitive filesystem */
public final class C11700gr implements Runnable {
    public Runnable A00;
    public final /* synthetic */ AnonymousClass03E A01;

    public void run() {
        int i = 0;
        while (true) {
            try {
                this.A00.run();
            } catch (Throwable th) {
                C05720Qu.A00(C008903u.A00, th);
            }
            AnonymousClass03E r2 = this.A01;
            Runnable A002 = AnonymousClass03E.A00(r2);
            if (A002 != null) {
                this.A00 = A002;
                i++;
                if (i >= 16) {
                    C005502l r1 = r2.A02;
                    if (r1.A04(r2)) {
                        r1.A03(this, r2);
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public C11700gr(Runnable runnable, AnonymousClass03E r2) {
        this.A01 = r2;
        this.A00 = runnable;
    }
}
