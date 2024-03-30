package X;

import com.whatsapp.R;
import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2iW  reason: invalid class name and case insensitive filesystem */
public class C49072iW extends C132446Tt {
    public final /* synthetic */ MyStatusesActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C49072iW(MyStatusesActivity myStatusesActivity) {
        super(myStatusesActivity, true);
        this.A00 = myStatusesActivity;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        MyStatusesActivity myStatusesActivity = this.A00;
        ArrayList A03 = myStatusesActivity.A0I.A03(C223613z.A00);
        if (myStatusesActivity.A0j.A00()) {
            C35071i6.A00((C35071i6) myStatusesActivity.A0k.get());
        }
        Collections.reverse(A03);
        Iterator it = A03.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            if (A0l instanceof C46812bi) {
                myStatusesActivity.A0L.A01((C46812bi) A0l);
            }
        }
        return A03;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        List list = (List) obj;
        StringBuilder A0u = AnonymousClass000.A0u();
        C36371kC.A1R("mystatuses/loaded ", A0u, list);
        C36321k7.A1a(A0u, " messages");
        if (list.isEmpty()) {
            this.A00.finish();
            return;
        }
        MyStatusesActivity myStatusesActivity = this.A00;
        C37901nO r0 = myStatusesActivity.A0X;
        r0.A00 = list;
        r0.notifyDataSetChanged();
        MyStatusesActivity.A0x(myStatusesActivity);
        myStatusesActivity.A0R.A00();
        C36331k8.A11(myStatusesActivity, R.id.progress);
    }
}
