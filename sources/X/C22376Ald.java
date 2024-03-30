package X;

import java.util.HashSet;

/* renamed from: X.Ald  reason: case insensitive filesystem */
public final class C22376Ald extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ HashSet $storedLids;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22376Ald(HashSet hashSet) {
        super(1);
        this.$storedLids = hashSet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        return Boolean.valueOf(this.$storedLids.contains(obj));
    }
}
