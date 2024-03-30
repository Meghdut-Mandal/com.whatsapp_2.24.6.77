package X;

/* renamed from: X.4N6  reason: invalid class name */
public final class AnonymousClass4N6 extends AnonymousClass00R implements C006302t {
    public static final AnonymousClass4N6 A00 = new AnonymousClass4N6();

    public AnonymousClass4N6() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        AnonymousClass00C.A0D(str, 0);
        String replaceAll = str.replaceAll("\\D", "");
        AnonymousClass00C.A08(replaceAll);
        return replaceAll;
    }
}
