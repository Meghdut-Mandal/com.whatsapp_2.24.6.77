package X;

/* renamed from: X.4hC  reason: invalid class name and case insensitive filesystem */
public final class C93824hC extends C1513279c<AnonymousClass607<Object>, C157597dn<? extends Object>> implements C161557n6 {
    public static final C93824hC A00;

    static {
        AnonymousClass6YE r2 = AnonymousClass6YE.A04;
        AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>");
        A00 = new C93824hC(r2, 0);
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof AnonymousClass607)) {
            return false;
        }
        return super.containsKey(obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C157597dn)) {
            return false;
        }
        return super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof AnonymousClass607)) {
            return null;
        }
        return super.get(obj);
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof AnonymousClass607)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }

    public C93824hC(AnonymousClass6YE r1, int i) {
        super(r1, i);
    }
}
