package X;

/* renamed from: X.7rP  reason: invalid class name and case insensitive filesystem */
public class C164187rP implements C157577dl {
    public Object A00;
    public final int A01;

    public C164187rP(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void dispose() {
        switch (this.A01) {
            case 0:
                ((C122965vi) this.A00).A01 = null;
                return;
            case 1:
                C137776gi r2 = (C137776gi) this.A00;
                int BCn = r2.A01.BCn();
                for (int i = 0; i < BCn; i++) {
                    r2.release();
                }
                return;
            default:
                ((C137176fi) this.A00).A00.invoke();
                return;
        }
    }
}
