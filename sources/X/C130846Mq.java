package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6Mq  reason: invalid class name and case insensitive filesystem */
public class C130846Mq {
    public static final Double A03 = C90494aF.A0S();
    public final C19700wN A00;
    public final AnonymousClass17Y A01;
    public final C19770wU A02;

    public void A00(AnonymousClass6DV r4) {
        String str = r4.A03;
        if (TextUtils.isEmpty(str)) {
            for (List sort : r4.A04) {
                Log.e("DirectoryBusinessRankerValueModel/fallbackToSortByDistance Falling back to ranking by distance.");
                Collections.sort(sort, C1505075n.A00);
            }
            if (!r4.A00) {
                r4.A02.Be6();
                return;
            }
            return;
        }
        C1502274l.A00(this.A02, this, r4, str, 28);
    }

    public C130846Mq(C19700wN r1, AnonymousClass17Y r2, C19770wU r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
