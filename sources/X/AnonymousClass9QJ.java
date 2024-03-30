package X;

/* renamed from: X.9QJ  reason: invalid class name */
public final class AnonymousClass9QJ {
    public C195999Xe A00;
    public final C195539Ur A01;

    public C195999Xe A02(AnonymousClass81Q r4, C17960sM r5) {
        AnonymousClass00C.A0D(r5, 1);
        C195999Xe r2 = this.A00;
        if (r2 != null) {
            return r2;
        }
        AnonymousClass81P r22 = new AnonymousClass81P(r4, this.A01, ((C03000Ct) r5).name);
        this.A00 = r22;
        return r22;
    }

    public static C195999Xe A00(AnonymousClass9QJ r1, AnonymousClass81Q r2, C17960sM[] r3, int i) {
        return r1.A02(r2, r3[i]);
    }

    public static boolean A01(AnonymousClass9QJ r1, AnonymousClass81Q r2, Object obj, C17960sM[] r4, int i) {
        return AnonymousClass00C.A0J(obj, r1.A02(r2, r4[i]));
    }

    public AnonymousClass9QJ(C195539Ur r1) {
        this.A01 = r1;
    }
}
