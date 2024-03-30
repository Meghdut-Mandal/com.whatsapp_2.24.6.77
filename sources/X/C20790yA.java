package X;

/* renamed from: X.0yA  reason: invalid class name and case insensitive filesystem */
public class C20790yA extends C19580wB {
    public final AnonymousClass005 A00;

    public C20790yA(AnonymousClass005 r1, AnonymousClass005 r2) {
        super(r1);
        this.A00 = r2;
    }

    public static void A00(AnonymousClass1DJ r3, C20790yA r4, Exception exc) {
        String name = r3.getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append("Observer crashed: ");
        sb.append(name);
        ((C19700wN) r4.A00.get()).A0D("abprops-observer-crashed", name, new RuntimeException(sb.toString(), exc));
    }
}
