package X;

/* renamed from: X.6xT  reason: invalid class name and case insensitive filesystem */
public final class C147596xT implements AnonymousClass4TU {
    public final /* synthetic */ C142736pN A00;
    public final /* synthetic */ C24251Bs A01;
    public final /* synthetic */ AnonymousClass1XW A02;

    public C147596xT(C142736pN r1, C24251Bs r2, AnonymousClass1XW r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void onSuccess() {
        this.A00.A00.A0H(new C1496972k(this.A01, 39));
        this.A02.A01();
    }

    public void onFailure(Exception exc) {
        StringBuilder A0i = C36341k9.A0i(exc);
        A0i.append("AvatarAsyncInit");
        C36351kA.A1Q("/deleteAvatarUser Failed to delete avatar via Smax: ", A0i, exc);
    }
}
