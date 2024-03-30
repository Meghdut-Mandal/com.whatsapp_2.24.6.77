package X;

import android.os.Handler;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

/* renamed from: X.3Gk  reason: invalid class name and case insensitive filesystem */
public class C62503Gk {
    public ListAdapter A00;
    public ListView A01;
    public AnonymousClass4UM A02;
    public boolean A03 = false;
    public final Handler A04 = C36341k9.A0H();
    public final Runnable A05 = new C1496972k(this, 9);

    public synchronized void A01(ListAdapter listAdapter) {
        if (this.A01 == null) {
            this.A02.setContentView(17367060);
        }
        this.A00 = listAdapter;
        ListView listView = this.A01;
        C18740tg.A04(listView);
        listView.setAdapter(listAdapter);
    }

    public void A00() {
        this.A02.Big();
        View findViewById = this.A02.findViewById(16908292);
        AnonymousClass4UM r1 = this.A02;
        C18740tg.A06(r1);
        ListView listView = (ListView) r1.findViewById(16908298);
        this.A01 = listView;
        if (listView != null) {
            if (findViewById != null) {
                listView.setEmptyView(findViewById);
            }
            if (this.A03) {
                A01(this.A00);
            }
            this.A04.post(this.A05);
            this.A03 = true;
            return;
        }
        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
    }
}
