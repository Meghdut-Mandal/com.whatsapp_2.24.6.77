package X;

import com.whatsapp.status.viewmodels.StatusesViewModel;

/* renamed from: X.3bI  reason: invalid class name and case insensitive filesystem */
public final class C68073bI implements AnonymousClass04G {
    public final /* synthetic */ C32251dE A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ AnonymousClass04R B46(AnonymousClass04K r2, Class cls) {
        return AnonymousClass0QC.A00(this, cls);
    }

    public C68073bI(C32251dE r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public static StatusesViewModel A00(AnonymousClass016 r2, C32251dE r3, boolean z) {
        return (StatusesViewModel) new AnonymousClass04H(new C68073bI(r3, z), r2).A00(StatusesViewModel.class);
    }

    public AnonymousClass04R B3o(Class cls) {
        C32251dE r0 = this.A00;
        boolean z = this.A01;
        C18800tq r3 = ((C77973rM) r0).A00.A00;
        C19970wo A0V = C36351kA.A0V(r3);
        C19770wU A0Z = C36341k9.A0Z(r3);
        AnonymousClass16E A0e = C36391kE.A0e(r3);
        C19420v0 A0Y = C36351kA.A0Y(r3);
        C29731Xt A0i = C36381kD.A0i(r3);
        C18830tt r2 = r3.A00;
        C61203Ay ACe = C18830tt.ACe(r2);
        AnonymousClass335 ACf = C18830tt.ACf(r2);
        return new StatusesViewModel(A0V, A0Y, C36361kB.A0Z(r3), (AnonymousClass1HT) r3.A7x.get(), A0e, C36431kI.A0v(r3), (C24371Ce) r3.A7y.get(), A0i, (C61193Ax) r2.A3c.get(), ACe, ACf, A0Z, C25141Fd.A00(), z);
    }
}
