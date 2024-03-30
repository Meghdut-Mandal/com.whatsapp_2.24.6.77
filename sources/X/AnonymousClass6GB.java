package X;

/* renamed from: X.6GB  reason: invalid class name */
public class AnonymousClass6GB implements C158287gg {
    public Object A00;
    public final int A01;

    public AnonymousClass6GB(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final C159497jS B3w(String str) {
        int i = this.A01;
        Object obj = this.A00;
        String str2 = str;
        if (i != 0) {
            AnonymousClass00C.A0D(str, 1);
            AnonymousClass1UE r1 = ((AnonymousClass1UD) obj).A00;
            if (r1 != null) {
                C20810yC A0V = C36341k9.A0V(r1.A00.A00);
                C18800tq r0 = r1.A00.A00;
                C20020wt A0X = C90504aG.A0X(r0);
                return new AnonymousClass5P6(C36381kD.A0U(r0), C36351kA.A0Y(r0), A0V, C90484aE.A0Y(r0), A0X, C90514aH.A0i(r0), str2, r0.A9N, r0.A9P);
            }
            throw C36331k8.A0d("graphqlRequestFactory");
        }
        AnonymousClass00C.A0D(str, 1);
        return ((C146026uu) obj).A00.B3w(str);
    }
}
