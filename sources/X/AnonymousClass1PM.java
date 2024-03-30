package X;

import android.graphics.Bitmap;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1PM  reason: invalid class name */
public class AnonymousClass1PM extends AnonymousClass12N {
    public AtomicLong A00 = new AtomicLong(-1);
    public AtomicInteger A01 = new AtomicInteger(SearchActionVerificationClientService.NOTIFICATION_ID);
    public final AnonymousClass1PN A02;
    public final C19760wT A03;
    public final String A04;

    public Object A09(Object obj) {
        C594533z r3 = (C594533z) this.A02.A04(obj);
        if (r3 == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.A00.set(currentTimeMillis);
        r3.A00 = currentTimeMillis;
        if (this instanceof AnonymousClass1SZ) {
            AnonymousClass1SZ.A00((AnonymousClass1SZ) this);
        }
        return r3.A01;
    }

    public void A0B(C28281Sa r4) {
        C36281k3 r1;
        AnonymousClass1PN r2 = this.A02;
        if (r4 == null) {
            r1 = null;
        } else {
            r1 = new C36281k3(r4, 0);
        }
        synchronized (r2) {
            r2.A00 = r1;
        }
    }

    public void A0C(Object obj) {
        this.A02.A05(obj);
    }

    public String BHv() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A04);
        sb.append(":");
        AnonymousClass1PN r1 = this.A02;
        sb.append(r1.A02());
        sb.append("/");
        sb.append(r1.A01());
        return sb.toString();
    }

    public void Bjh(AnonymousClass5SK r2, boolean z) {
        int i;
        if (z) {
            i = this.A01.get();
        } else {
            i = 0;
        }
        A0A(i);
    }

    public AnonymousClass1PM(C19760wT r4, C220112n r5, String str, int i) {
        super(r5);
        this.A03 = r4;
        this.A04 = str;
        this.A02 = new AnonymousClass1PN(this, i);
    }

    public void A0A(int i) {
        long currentTimeMillis = System.currentTimeMillis() - ((long) i);
        for (Map.Entry entry : this.A02.A06().entrySet()) {
            if (((C594533z) entry.getValue()).A00 < currentTimeMillis) {
                A0C(entry.getKey());
                entry.getKey();
                Object obj = ((C594533z) entry.getValue()).A01;
                if (this instanceof AnonymousClass1SZ) {
                    ((Bitmap) obj).getByteCount();
                }
            } else {
                return;
            }
        }
    }

    public void A0D(Object obj, Object obj2) {
        long currentTimeMillis = System.currentTimeMillis();
        this.A00.set(currentTimeMillis);
        this.A02.A08(obj, new C594533z(obj2, currentTimeMillis));
        if (this instanceof AnonymousClass1SZ) {
            AnonymousClass1SZ.A00((AnonymousClass1SZ) this);
        }
    }
}
