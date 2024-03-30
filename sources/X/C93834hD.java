package X;

import androidx.compose.runtime.PersistentCompositionLocalMap;

/* renamed from: X.4hD  reason: invalid class name and case insensitive filesystem */
public final class C93834hD extends C1513479e<AnonymousClass607<Object>, C157597dn<? extends Object>> implements PersistentCompositionLocalMap.Builder {
    public C93824hC A00;

    public C93824hC A06() {
        AnonymousClass6YE r2 = this.A01;
        C93824hC r1 = this.A00;
        if (r2 != r1.A00) {
            this.A02 = new AnonymousClass5WG();
            r1 = new C93824hC(r2, size());
        }
        this.A00 = r1;
        return r1;
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

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof AnonymousClass607)) {
            return null;
        }
        return super.remove(obj);
    }

    public C93834hD(C93824hC r1) {
        super(r1);
        this.A00 = r1;
    }
}
