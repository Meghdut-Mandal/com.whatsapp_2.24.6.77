package X;

/* renamed from: X.0mG  reason: invalid class name and case insensitive filesystem */
public final class C14830mG extends AnonymousClass00R implements C009003v {
    public static final C14830mG A00 = new C14830mG();

    public C14830mG() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass00C.A0D(obj2, 1);
        if (str.length() == 0) {
            return obj2.toString();
        }
        return AnonymousClass000.A0l(obj2, ", ", AnonymousClass000.A0v(str));
    }
}
