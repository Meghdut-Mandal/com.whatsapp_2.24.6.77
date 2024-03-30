package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.4Lu  reason: invalid class name and case insensitive filesystem */
public final class C86664Lu extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Collection $messages;
    public final /* synthetic */ C65513Sj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86664Lu(C65513Sj r2, Collection collection) {
        super(1);
        this.this$0 = r2;
        this.$messages = collection;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        AnonymousClass00C.A0D(abstractCollection, 0);
        C65513Sj r4 = this.this$0;
        List A0V = C007103b.A0V(this.$messages);
        ArrayList A0I = AnonymousClass001.A0I();
        for (Object next : A0V) {
            if (C65513Sj.A00(r4, (AnonymousClass3T1) next)) {
                A0I.add(next);
            }
        }
        abstractCollection.removeAll(C007103b.A0f(A0I));
        return abstractCollection;
    }
}
