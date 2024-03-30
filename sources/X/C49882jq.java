package X;

import android.os.SystemClock;
import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.2jq  reason: invalid class name and case insensitive filesystem */
public class C49882jq extends C132446Tt {
    public final long A00 = SystemClock.elapsedRealtime();
    public final AnonymousClass1X4 A01;
    public final AnonymousClass11F A02;
    public final WeakReference A03;
    public final boolean A04;

    public C49882jq(C225314u r3, AnonymousClass1X4 r4, AnonymousClass11F r5, boolean z) {
        super(r3, true);
        this.A03 = AnonymousClass001.A0F(r3);
        this.A02 = r5;
        this.A01 = r4;
        this.A04 = z;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        this.A01.A0P(this.A02, this.A04);
        C225314u.A0S(this.A00, 300);
        return null;
    }

    public void A0A() {
        WeakReference weakReference = this.A03;
        if (weakReference.get() != null) {
            C36411kG.A0W(weakReference).Bu1(R.string.f12nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C225314u A0W = C36411kG.A0W(this.A03);
        if (A0W != null) {
            A0W.Bnv();
            A0W.A33(C36371kC.A0C(A0W.getApplicationContext()), false);
        }
    }
}
