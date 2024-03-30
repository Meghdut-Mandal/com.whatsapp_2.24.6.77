package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.gallery.LinksGalleryFragment;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.2TW  reason: invalid class name */
public class AnonymousClass2TW extends C40981wQ implements C160717lT {
    public final /* synthetic */ LinksGalleryFragment A00;

    public AnonymousClass2TW(LinksGalleryFragment linksGalleryFragment) {
        this.A00 = linksGalleryFragment;
    }

    public int BAF(int i) {
        return ((C1512778x) this.A00.A0L.get(i)).bucketCount;
    }

    public int BCL() {
        return this.A00.A0L.size();
    }

    public long BCM(int i) {
        return -((Calendar) this.A00.A0L.get(i)).getTimeInMillis();
    }

    public /* bridge */ /* synthetic */ void BSC(AnonymousClass0D3 r3, int i) {
        List list = AnonymousClass0D3.A0I;
        ((C41831xq) r3).A00.setText(this.A00.A0L.get(i).toString());
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUs(ViewGroup viewGroup) {
        LinksGalleryFragment linksGalleryFragment = this.A00;
        View inflate = linksGalleryFragment.A0h().getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup, false);
        inflate.setClickable(false);
        C36341k9.A0q(linksGalleryFragment.A1D(), inflate, C224514j.A00(linksGalleryFragment.A1D(), R.attr.f4nameremoved, R.color.f6nameremoved));
        return new C41831xq(inflate);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        LinksGalleryFragment linksGalleryFragment = this.A00;
        View A0E = C36361kB.A0E(linksGalleryFragment.A0h().getLayoutInflater(), viewGroup, R.layout.f9nameremoved);
        ((FrameLayout) A0E.findViewById(R.id.link_preview_frame)).setForeground(AnonymousClass00E.A00(linksGalleryFragment.A1D(), R.drawable.selector_orange_gradient));
        C36321k7.A0L(linksGalleryFragment.A1D(), C36391kE.A0N(A0E, R.id.chevron), linksGalleryFragment.A05, R.drawable.chevron);
        return new C42601z5(A0E, linksGalleryFragment);
    }

    public /* bridge */ /* synthetic */ boolean Bhn(MotionEvent motionEvent, AnonymousClass0D3 r3, int i) {
        return false;
    }
}
