package X;

public class AC9 implements C22940Ayq {
    public final C19700wN A00;

    public void BxG(AnonymousClass9YL r5, AnonymousClass3T1 r6) {
        int i = r5.A01;
        if (i != 0 && i != 1 && i != 3 && !(r6 instanceof AnonymousClass2bO) && !(r6 instanceof C180868mY) && !(r6 instanceof C46752bc) && !(r6 instanceof AnonymousClass5J2) && !(r6 instanceof AnonymousClass5JA) && !(r6 instanceof C46742bb)) {
            this.A00.A0E("MessageUtils/buildFMessage unexpected editedVersion", AnonymousClass000.A0r("edit=", AnonymousClass000.A0u(), i), false);
            throw C165617ti.A0S(76, "invalid_edit_version");
        }
    }

    public AC9(C19700wN r1) {
        this.A00 = r1;
    }
}
