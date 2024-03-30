package X;

import com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.AlL  reason: case insensitive filesystem */
public final class C22358AlL extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CollectionProductListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22358AlL(CollectionProductListFragment collectionProductListFragment) {
        super(1);
        this.this$0 = collectionProductListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass9HI r8 = (AnonymousClass9HI) obj;
        CollectionProductListFragment collectionProductListFragment = this.this$0;
        AnonymousClass00C.A0B(r8);
        UserJid userJid = r8.A00;
        AnonymousClass00C.A07(userJid);
        String str = r8.A01;
        AnonymousClass00C.A07(str);
        if (userJid.equals(userJid) && str.equals(collectionProductListFragment.A1c())) {
            boolean z = false;
            if (r8 instanceof AnonymousClass8WB) {
                AnonymousClass8WB r82 = (AnonymousClass8WB) r8;
                boolean z2 = r82.A01;
                AnonymousClass1KK r5 = collectionProductListFragment.A04;
                if (r5 != null) {
                    BAG.A00(r5, collectionProductListFragment.A1a(), collectionProductListFragment, 6);
                    if (!z2 && r82.A00) {
                        z = true;
                    }
                    if (!AnonymousClass00C.A0J(collectionProductListFragment.A1c(), "catalog_products_all_items_collection_id") && collectionProductListFragment.A00 == -1 && z) {
                        AnonymousClass3L6 r0 = collectionProductListFragment.A0C;
                        if (r0 != null) {
                            r0.A05("view_collection_details_tag", true);
                        } else {
                            throw C36331k8.A0d("bizQPLManager");
                        }
                    }
                } else {
                    throw C36331k8.A0d("businessProfileManager");
                }
            } else if (r8 instanceof AnonymousClass8WA) {
                AnonymousClass8VI A1Z = collectionProductListFragment.A1Z();
                int i = ((AnonymousClass8WA) r8).A00;
                A1Z.A0Q(i);
                if (collectionProductListFragment.A0P.A02.compareTo(AnonymousClass01P.RESUMED) >= 0) {
                    C22924Aya aya = collectionProductListFragment.A0B;
                    AnonymousClass00C.A0B(aya);
                    aya.BXZ(i);
                } else {
                    collectionProductListFragment.A0D = Integer.valueOf(i);
                }
                if (!AnonymousClass00C.A0J(collectionProductListFragment.A1c(), "catalog_products_all_items_collection_id") && collectionProductListFragment.A00 == -1) {
                    AnonymousClass3L6 r02 = collectionProductListFragment.A0C;
                    if (r02 != null) {
                        r02.A05("view_collection_details_tag", false);
                    } else {
                        throw C36331k8.A0d("bizQPLManager");
                    }
                }
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
