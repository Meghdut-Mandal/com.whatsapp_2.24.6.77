package X;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1ww  reason: invalid class name and case insensitive filesystem */
public class C41271ww extends AnonymousClass0UE {
    public int A00 = 0;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ AnonymousClass1JI A03;

    public C41271ww(Activity activity, AnonymousClass1JI r3, int i) {
        this.A03 = r3;
        this.A01 = i;
        this.A02 = activity;
    }

    public void A03(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.A03.A02(this.A02.getWindow());
        } else if (i == 1 && this.A00 == 0) {
            this.A03.A03(this.A02.getWindow(), this.A01);
        }
        this.A00 = i;
    }
}
