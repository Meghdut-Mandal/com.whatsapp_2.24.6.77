package X;

import java.util.Collection;
import java.util.Set;

/* renamed from: X.79c  reason: invalid class name and case insensitive filesystem */
public class C1513279c<K, V> extends AnonymousClass0i6<K, V> implements C162237oG<K, V> {
    public static final C1513279c A02 = new C1513279c(AnonymousClass6YE.A04, 0);
    public final AnonymousClass6YE A00;
    public final int A01;

    public final C17860sB A01() {
        return new C1513779h(this);
    }

    public /* bridge */ /* synthetic */ Collection A02() {
        return new C1513179b(this);
    }

    public /* bridge */ /* synthetic */ Set A03() {
        return new C1513879i(this);
    }

    public C1513279c A04(Object obj, Object obj2) {
        C118295ne A0F = this.A00.A0F(obj, obj2, AnonymousClass000.A0J(obj), 0);
        if (A0F == null) {
            return this;
        }
        return new C1513279c(A0F.A00, size() + A0F.A01);
    }

    public /* bridge */ /* synthetic */ C162247oH B26() {
        if (this instanceof C93824hC) {
            return new C93834hD((C93824hC) this);
        }
        return new C1513479e(this);
    }

    public boolean containsKey(Object obj) {
        return this.A00.A0N(obj, AnonymousClass000.A0J(obj), 0);
    }

    public Object get(Object obj) {
        return this.A00.A0M(obj, AnonymousClass000.A0J(obj), 0);
    }

    public C1513279c(AnonymousClass6YE r1, int i) {
        this.A00 = r1;
        this.A01 = i;
    }

    public int A00() {
        return this.A01;
    }
}
