package X;

/* renamed from: X.7ZJ  reason: invalid class name */
public final class AnonymousClass7ZJ extends AnonymousClass00R implements C009003v {
    public static final AnonymousClass7ZJ A00 = new AnonymousClass7ZJ();

    public AnonymousClass7ZJ() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        if (str.length() == 0) {
            return obj2.toString();
        }
        return AnonymousClass000.A0l(obj2, ", ", AnonymousClass000.A0v(str));
    }
}
