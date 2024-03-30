package X;

/* renamed from: X.6vP  reason: invalid class name and case insensitive filesystem */
public final class C146316vP implements B1A {
    public final /* synthetic */ AnonymousClass0AP A00;

    public C146316vP(AnonymousClass0AP r1) {
        this.A00 = r1;
    }

    public void BiD(String str) {
        this.A00.resumeWith(str);
    }

    public void onFailure(Exception exc) {
        this.A00.resumeWith(AnonymousClass00C.A02(exc));
    }
}
