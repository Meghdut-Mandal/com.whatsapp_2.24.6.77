package X;

import android.widget.ImageView;
import com.whatsapp.R;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5y9  reason: invalid class name and case insensitive filesystem */
public class C124415y9 {
    public int A00;
    public int A01;
    public AnonymousClass6Fk A02;
    public final String A03;
    public final String A04;
    public final ConcurrentMap A05;
    public final boolean A06;
    public volatile AtomicBoolean A07 = new AtomicBoolean();

    public C124415y9(C160797lb r5) {
        ConcurrentHashMap A0s = C90524aI.A0s();
        this.A05 = A0s;
        A0s.put(r5, r5);
        this.A03 = r5.getId();
        this.A04 = r5.BIk();
        this.A00 = r5.BDs();
        this.A01 = r5.BDv();
        ImageView BCZ = r5.BCZ();
        boolean z = false;
        if (!(BCZ == null || BCZ.getTag(R.id.optin_for_bitmapool_caching) == null || !AnonymousClass000.A1X(BCZ.getTag(R.id.optin_for_bitmapool_caching)))) {
            z = true;
        }
        this.A06 = z;
    }
}
