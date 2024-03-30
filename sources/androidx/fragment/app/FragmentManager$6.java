package androidx.fragment.app;

import X.AnonymousClass012;
import X.AnonymousClass01M;
import X.AnonymousClass01Y;
import X.AnonymousClass01z;
import X.AnonymousClass05R;
import X.AnonymousClass05T;
import android.os.Bundle;
import android.util.Log;
import java.util.Map;

public class FragmentManager$6 implements AnonymousClass01Y {
    public final /* synthetic */ AnonymousClass01z A00;
    public final /* synthetic */ AnonymousClass05T A01;
    public final /* synthetic */ AnonymousClass01M A02;
    public final /* synthetic */ String A03;

    public FragmentManager$6(AnonymousClass01z r1, AnonymousClass05T r2, AnonymousClass01M r3, String str) {
        this.A00 = r1;
        this.A03 = str;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BhM(AnonymousClass05R r5, AnonymousClass012 r6) {
        if (r5 == AnonymousClass05R.ON_START) {
            Map map = this.A00.A0X;
            String str = this.A03;
            Bundle bundle = (Bundle) map.get(str);
            if (bundle != null) {
                this.A01.BYP(str, bundle);
                map.remove(str);
                if (AnonymousClass01z.A0E(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Clearing fragment result with key ");
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        if (r5 == AnonymousClass05R.ON_DESTROY) {
            this.A02.A05(this);
            this.A00.A0W.remove(this.A03);
        }
    }
}
