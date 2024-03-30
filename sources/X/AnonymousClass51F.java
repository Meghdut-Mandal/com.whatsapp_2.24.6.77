package X;

import android.location.LocationManager;
import android.os.Handler;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.util.DirectoryMapViewLocationUpdateListener;

/* renamed from: X.51F  reason: invalid class name */
public abstract class AnonymousClass51F extends C100914wF {
    public ViewGroup A00;
    public CardView A01;
    public C142646pD A02;
    public AnonymousClass5DR A03;
    public DirectoryMapViewLocationUpdateListener A04;
    public C1258661p A05;
    public C95404kp A06;
    public C20830yE A07;
    public AnonymousClass2XH A08;
    public Runnable A09;
    public boolean A0A;
    public final Handler A0B = C36341k9.A0H();
    public final C009904e A0C = BnD(new C165397tM(this, 0), new C010104g());

    public final C95404kp A3i() {
        C95404kp r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0a();
    }

    public final void A3j(boolean z) {
        LocationManager A0C2 = this.A08.A0C();
        boolean z2 = false;
        if (A0C2 != null && (A0C2.isProviderEnabled("gps") || A0C2.isProviderEnabled("network"))) {
            z2 = true;
        }
        if (z) {
            A3i().A0T(z2);
        } else if (z2) {
            C36341k9.A16(A3i().A0W, 0);
        } else {
            A07(this);
        }
    }

    public static final void A07(AnonymousClass51F r3) {
        C39001qm A002 = AnonymousClass3LW.A00(r3);
        A002.A0d(R.string.f12nameremoved);
        A002.A0c(R.string.f12nameremoved);
        A002.A0e(new C163317q0(r3, 3));
        A002.A00.A0V(new C163977r4(r3, 2));
        A002.A0r(true);
        C163297py.A01(A002, r3, 16, R.string.f12nameremoved);
        C36341k9.A11(A002);
    }

    public void onResume() {
        C142646pD r3;
        Integer num;
        super.onResume();
        if (this.A06 != null) {
            C95404kp A3i = A3i();
            r3 = A3i.A0J;
            num = C95404kp.A01(A3i);
        } else {
            r3 = this.A02;
            if (r3 != null) {
                num = null;
            } else {
                throw C36331k8.A0d("directorySearchAnalyticsManagerV2");
            }
        }
        r3.A04(num, 11, 73);
    }
}
