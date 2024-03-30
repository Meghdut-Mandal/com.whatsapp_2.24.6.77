package X;

/* renamed from: X.7ZS  reason: invalid class name */
public final class AnonymousClass7ZS extends AnonymousClass00R implements C009003v {
    public static final AnonymousClass7ZS A00 = new AnonymousClass7ZS();

    public AnonymousClass7ZS() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass6WV r5 = (AnonymousClass6WV) obj2;
        C1496172a A07 = ((AnonymousClass6WV) obj).A07();
        AnonymousClass62Q r2 = C114205gq.A0Q;
        Object obj3 = A07.A02.get(r2);
        if (obj3 == null) {
            obj3 = Float.valueOf(0.0f);
        }
        float A03 = C36441kJ.A03(obj3);
        Object obj4 = r5.A07().A02.get(r2);
        if (obj4 == null) {
            obj4 = Float.valueOf(0.0f);
        }
        return Integer.valueOf(Float.compare(A03, C36441kJ.A03(obj4)));
    }
}
