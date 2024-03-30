package X;

/* renamed from: X.1iI  reason: invalid class name and case insensitive filesystem */
public class C35191iI implements Runnable {
    public long A00;
    public Object A01;
    public final int A02;

    public C35191iI(Object obj, long j, int i) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = j;
    }

    public final void run() {
        switch (this.A02) {
            case 0:
                ((AnonymousClass1FJ) this.A01).A00.A05(Long.valueOf(this.A00));
                return;
            case 1:
                long j = this.A00;
                C002000v r1 = ((AnonymousClass1QP) this.A01).A00;
                synchronized (r1) {
                    r1.A05(Long.valueOf(j));
                }
                return;
            case 2:
                C25781Hq r5 = (C25781Hq) this.A01;
                if (this.A00 >= r5.A0F) {
                    C19420v0 r2 = r5.A05;
                    C19420v0.A00(r2).remove("voip_call_id").remove("session_id_for_voip_call_id").apply();
                    C19420v0.A00(r2).remove("voip_call_ab_test_bucket").apply();
                    AnonymousClass1M3.A01(r5.A08, (String) null);
                    return;
                }
                return;
            default:
                ((C31021b9) this.A01).A08.A00(this.A00, 2);
                return;
        }
    }
}
