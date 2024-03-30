package X;

import java.util.List;

/* renamed from: X.7Uz  reason: invalid class name and case insensitive filesystem */
public final class C155157Uz extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C136766ex $headerItem = null;
    public final /* synthetic */ boolean $isLookingAhead;
    public final /* synthetic */ C161547n5 $placementScopeInvalidator;
    public final /* synthetic */ List $positionedItems;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155157Uz(C161547n5 r2, List list, boolean z) {
        super(1);
        this.$positionedItems = list;
        this.$isLookingAhead = z;
        this.$placementScopeInvalidator = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6WO r6 = (AnonymousClass6WO) obj;
        List list = this.$positionedItems;
        C136766ex r3 = this.$headerItem;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C136766ex r0 = (C136766ex) list.get(i);
            if (r0 != r3) {
                r0.A01(r6);
            }
        }
        C136766ex r02 = this.$headerItem;
        if (r02 != null) {
            r02.A01(r6);
        }
        this.$placementScopeInvalidator.getValue();
        return AnonymousClass0AJ.A00;
    }
}
