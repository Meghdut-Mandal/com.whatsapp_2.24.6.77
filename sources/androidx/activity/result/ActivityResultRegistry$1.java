package androidx.activity.result;

import X.AnonymousClass012;
import X.AnonymousClass01X;
import X.AnonymousClass01Y;
import X.AnonymousClass04Z;
import X.AnonymousClass05R;
import X.C009604b;
import X.C009704c;
import X.C009804d;
import android.os.Bundle;
import java.util.Map;

public class ActivityResultRegistry$1 implements AnonymousClass01Y {
    public final /* synthetic */ AnonymousClass01X A00;
    public final /* synthetic */ C009604b A01;
    public final /* synthetic */ AnonymousClass04Z A02;
    public final /* synthetic */ String A03;

    public ActivityResultRegistry$1(AnonymousClass01X r1, C009604b r2, AnonymousClass04Z r3, String str) {
        this.A00 = r1;
        this.A03 = str;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BhM(AnonymousClass05R r7, AnonymousClass012 r8) {
        if (AnonymousClass05R.ON_START.equals(r7)) {
            AnonymousClass01X r5 = this.A00;
            Map map = r5.A07;
            String str = this.A03;
            C009604b r3 = this.A01;
            AnonymousClass04Z r2 = this.A02;
            map.put(str, new C009704c(r3, r2));
            Map map2 = r5.A04;
            if (map2.containsKey(str)) {
                Object obj = map2.get(str);
                map2.remove(str);
                r3.BQj(obj);
            }
            Bundle bundle = r5.A02;
            C009804d r0 = (C009804d) bundle.getParcelable(str);
            if (r0 != null) {
                bundle.remove(str);
                r3.BQj(r2.A02(r0.A01, r0.A00));
            }
        } else if (AnonymousClass05R.ON_STOP.equals(r7)) {
            this.A00.A07.remove(this.A03);
        } else if (AnonymousClass05R.ON_DESTROY.equals(r7)) {
            this.A00.A05(this.A03);
        }
    }
}
