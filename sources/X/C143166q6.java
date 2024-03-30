package X;

import com.whatsapp.businesscollection.view.activity.CollectionProductListActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6q6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C143166q6 implements AnonymousClass4PG {
    public final /* synthetic */ CollectionProductListActivity A00;

    public /* synthetic */ C143166q6(CollectionProductListActivity collectionProductListActivity) {
        this.A00 = collectionProductListActivity;
    }

    public final void Bdb(C207269up r13, int i) {
        int i2;
        CollectionProductListActivity collectionProductListActivity = this.A00;
        if (collectionProductListActivity.A0D.A0E(1514) && (i2 = collectionProductListActivity.A00) != -1) {
            C198849eI r3 = collectionProductListActivity.A0D;
            UserJid userJid = collectionProductListActivity.A0M;
            String str = collectionProductListActivity.A0R;
            int i3 = collectionProductListActivity.A01;
            String str2 = r13.A0F;
            C36351kA.A1J(userJid, str, 1);
            AnonymousClass00C.A0D(str2, 6);
            C198849eI.A00(r3, userJid, true, Integer.valueOf(i), str, str2, i2, i3, 3);
        }
    }
}
