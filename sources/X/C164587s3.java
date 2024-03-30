package X;

/* renamed from: X.7s3  reason: invalid class name and case insensitive filesystem */
public class C164587s3 implements AnonymousClass7i7 {
    public Object A00;
    public final int A01;

    public C164587s3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onError(int i) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass638) this.A00).A00(i, (Integer) null);
                return;
            case 1:
                ((C009003v) this.A00).invoke(Integer.valueOf(i), (Object) null);
                return;
            case 2:
                ((AnonymousClass639) this.A00).A00(i, (Integer) null);
                return;
            default:
                ((AnonymousClass63j) this.A00).A00(i, (Integer) null);
                return;
        }
    }
}
