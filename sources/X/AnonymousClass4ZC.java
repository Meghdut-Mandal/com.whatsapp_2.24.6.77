package X;

import com.whatsapp.newsletter.NewsletterInfoMembersListViewModel;

/* renamed from: X.4ZC  reason: invalid class name */
public class AnonymousClass4ZC implements AnonymousClass04G {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public AnonymousClass4ZC(Object obj, Object obj2, Object obj3, int i, long j) {
        this.A04 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = j;
        this.A03 = obj3;
    }

    public /* synthetic */ AnonymousClass04R B3o(Class cls) {
        if (this.A04 != 0) {
            long j = this.A00;
            C18800tq r1 = ((C57672yd) this.A01).A00.A01;
            C20810yC A0V = C36341k9.A0V(r1);
            AnonymousClass171 A0S = C36341k9.A0S(r1);
            C19730wQ A0N = C36351kA.A0N(r1);
            C19770wU A0Z = C36341k9.A0Z(r1);
            return new NewsletterInfoMembersListViewModel(A0N, C36341k9.A0R(r1), A0S, C36411kG.A0d(r1), A0V, (C28981Uw) this.A02, (AnonymousClass1ZZ) r1.A5Y.get(), (AnonymousClass2EJ) this.A03, (AnonymousClass1ZV) r1.A5n.get(), A0Z, j);
        }
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public AnonymousClass04R B46(AnonymousClass04K r17, Class cls) {
        if (this.A04 != 0) {
            return AnonymousClass0QC.A00(this, cls);
        }
        long j = this.A00;
        C32591ds r0 = ((C58222zW) this.A01).A00;
        C18800tq r1 = r0.A02;
        C19970wo A0V = C36351kA.A0V(r1);
        AnonymousClass1X4 A0T = C36361kB.A0T(r1);
        AnonymousClass1DW A0b = C36431kI.A0b(r1);
        AnonymousClass1A1 A0n = C36351kA.A0n(r1);
        AnonymousClass16J A0Z = C36361kB.A0Z(r1);
        C29541Xa A0M = C36421kH.A0M(r1);
        return new C40071us(A0T, C32581dr.A0J(r0.A01), C36391kE.A0c(r1), A0V, A0Z, A0b, A0M, (AnonymousClass11F) this.A02, (C64933Qa) this.A03, A0n, C24291Bw.A00(), C25141Fd.A00(), j);
    }
}
