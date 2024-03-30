package X;

/* renamed from: X.75K  reason: invalid class name */
public class AnonymousClass75K implements Runnable, Comparable, AnonymousClass4PA {
    public final Runnable A00;
    public final Object A01;
    public final Object A02;
    public volatile boolean A03 = false;
    public final /* synthetic */ AnonymousClass1GM A04;

    public void run() {
        try {
            this.A03 = true;
            this.A00.run();
        } finally {
            AnonymousClass1GM.A00(this, this.A04, this.A02);
            this.A03 = false;
        }
    }

    public AnonymousClass75K(AnonymousClass1GM r2, Object obj, Object obj2, Runnable runnable) {
        this.A04 = r2;
        this.A02 = obj;
        this.A00 = runnable;
        this.A01 = obj2;
    }

    public void cancel() {
        Runnable runnable = this.A00;
        if (runnable instanceof AnonymousClass4PA) {
            ((AnonymousClass4PA) runnable).cancel();
        }
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass75K r3 = (AnonymousClass75K) obj;
        Runnable runnable = this.A00;
        if (runnable instanceof Comparable) {
            return ((Comparable) runnable).compareTo(r3.A00);
        }
        return 0;
    }
}
