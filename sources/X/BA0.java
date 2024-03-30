package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.R;

public class BA0 implements C22933Ayj {
    public Object A00;
    public final int A01;

    public BA0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BgZ(boolean z) {
        Activity A002;
        int i = this.A01;
        View view = (View) this.A00;
        switch (i) {
            case 0:
                View findViewById = C36361kB.A06(view).findViewById(R.id.proximity_overlay);
                if (findViewById != null) {
                    int i2 = 4;
                    if (z) {
                        i2 = 0;
                    }
                    findViewById.setVisibility(i2);
                    return;
                }
                return;
            case 1:
                A002 = C18860tw.A00(view.getContext());
                if (A002 == null) {
                    return;
                }
                break;
            default:
                A002 = C36361kB.A06(view);
                break;
        }
        AnonymousClass6XC.A01(A002, z);
    }
}
