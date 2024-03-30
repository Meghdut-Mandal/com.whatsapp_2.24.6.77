package X;

import com.whatsapp.R;
import com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager;
import com.whatsapp.businessdirectory.util.LocationUpdateListener;
import com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment;

/* renamed from: X.6qm  reason: invalid class name and case insensitive filesystem */
public class C143576qm implements C159337jC {
    public final C009904e A00;
    public final AnonymousClass02E A01;
    public final C142616pA A02;
    public final AnonymousClass5DR A03;
    public final DirectoryGPSLocationManager A04;
    public final LocationUpdateListener A05;
    public final C1258661p A06;
    public final C160617lI A07;
    public final C20830yE A08;
    public final AnonymousClass1QW A09;

    public void A00() {
        LocationOptionPickerFragment locationOptionPickerFragment = (LocationOptionPickerFragment) this.A01.A0k().A0N("location-options-bottom-sheet");
        if (locationOptionPickerFragment != null) {
            locationOptionPickerFragment.A02 = this;
        }
    }

    public void BaF() {
        if (this.A08.A05()) {
            this.A07.BaD();
        } else {
            AnonymousClass02E r2 = this.A01;
            AnonymousClass3FM A0T = C90474aD.A0T(r2.A0i());
            A0T.A02 = R.string.f12nameremoved;
            r2.startActivityForResult(A0T.A02(), 34);
        }
        this.A02.A02(3, 0);
    }

    public void BaG() {
        this.A02.A02(4, 0);
    }

    public C143576qm(AnonymousClass02E r4, C142616pA r5, AnonymousClass5DR r6, DirectoryGPSLocationManager directoryGPSLocationManager, LocationUpdateListener locationUpdateListener, C1258661p r9, C160617lI r10, C20830yE r11, AnonymousClass1QW r12) {
        this.A01 = r4;
        this.A08 = r11;
        this.A05 = locationUpdateListener;
        this.A04 = directoryGPSLocationManager;
        this.A09 = r12;
        this.A06 = r9;
        this.A03 = r6;
        this.A07 = r10;
        this.A02 = r5;
        this.A00 = r4.BnD(new C165357tI(this, r12, 1), new C009504a());
    }
}
