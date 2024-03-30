package X;

/* renamed from: X.7sf  reason: invalid class name and case insensitive filesystem */
public class C164967sf implements C25711Hj {
    public Object A00;
    public final int A01;

    public C164967sf(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void accept(Object obj) {
        switch (this.A01) {
            case 0:
                C30621aV r2 = ((C30591aS) this.A00).A03;
                synchronized (r2) {
                    r2.A00 = null;
                }
                return;
            case 1:
                C146506vi r1 = (C146506vi) this.A00;
                C123865xD r4 = (C123865xD) obj;
                C146496vh r0 = r1.A02;
                if (r0 != null) {
                    C132976Wa r22 = r0.A01;
                    synchronized (r22) {
                        r22.A0H = true;
                    }
                }
                int i = r4.A00;
                if (i == 0) {
                    i = 0;
                }
                r1.A0C.A04(Integer.valueOf(i));
                return;
            case 2:
                AnonymousClass00C.A0D(obj, 0);
                ((C146506vi) this.A00).A0D.A04(obj);
                return;
            case 3:
                ((C101334xN) this.A00).B2X(true);
                return;
            default:
                ((C101334xN) this.A00).A0I(C36431kI.A09(obj));
                return;
        }
    }
}
