package X;

public class A86 implements C22904AyG {
    public boolean B6t(C200269h0 r5, C200269h0 r6, AnonymousClass9LX r7) {
        boolean z;
        if (r6 instanceof AnonymousClass8TB) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            r6 = AnonymousClass8TB.A00(r6);
            if (r6 instanceof AnonymousClass8T4) {
                return false;
            }
        }
        AnonymousClass8TD A06 = r6.A06();
        if (r5 instanceof AnonymousClass8TB) {
            r5 = AnonymousClass8TB.A00(r5);
            if (r5 instanceof AnonymousClass8T4) {
                return false;
            }
        }
        for (Object contains : r5.A06().A00) {
            if (!A06.A00.contains(contains)) {
                return false;
            }
        }
        return true;
    }
}
