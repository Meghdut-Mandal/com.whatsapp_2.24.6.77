package X;

import java.util.AbstractCollection;

/* renamed from: X.4Ir  reason: invalid class name and case insensitive filesystem */
public final class C85854Ir extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass3T1 $message;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85854Ir(AnonymousClass3T1 r2) {
        super(1);
        this.$message = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        AnonymousClass00C.A0D(abstractCollection, 0);
        abstractCollection.add(this.$message);
        return abstractCollection;
    }
}
