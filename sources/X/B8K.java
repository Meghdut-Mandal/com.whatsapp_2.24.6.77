package X;

public class B8K implements B19 {
    public Object A00;
    public final int A01;

    public B8K(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onFailure(Exception exc) {
        ((C023509x) this.A00).resumeWith(C90524aI.A0t(exc));
    }

    public void onSuccess() {
        ((C023509x) this.A00).resumeWith(AnonymousClass0AJ.A00);
    }
}
