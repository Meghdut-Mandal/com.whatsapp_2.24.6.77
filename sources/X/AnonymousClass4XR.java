package X;

import android.view.View;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;
import java.util.Iterator;

/* renamed from: X.4XR  reason: invalid class name */
public class AnonymousClass4XR implements View.OnSystemUiVisibilityChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4XR(MediaViewFragment mediaViewFragment, C65083Qq r2, int i) {
        this.A02 = i;
        this.A00 = mediaViewFragment;
        this.A01 = r2;
    }

    public final void onSystemUiVisibilityChange(int i) {
        AnonymousClass5NI A09;
        AnonymousClass5NI A092;
        if (this.A02 != 0) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A00;
            C65083Qq r2 = (C65083Qq) this.A01;
            if (!r2.A0c()) {
                return;
            }
            if ((i & 4) == 0) {
                mediaViewFragment.A1o(true, false);
                Iterator A0z = AnonymousClass000.A0z(mediaViewFragment.A2D);
                while (A0z.hasNext()) {
                    C65083Qq r0 = (C65083Qq) A0z.next();
                    if (!(r0 == r2 || (A092 = r0.A09()) == null)) {
                        A092.A05();
                    }
                }
                return;
            }
            mediaViewFragment.A1o(false, false);
            Iterator A0z2 = AnonymousClass000.A0z(mediaViewFragment.A2D);
            while (A0z2.hasNext()) {
                C65083Qq r02 = (C65083Qq) A0z2.next();
                if (!(r02 == r2 || (A09 = r02.A09()) == null)) {
                    A09.A04();
                }
            }
            return;
        }
        MediaViewBaseFragment mediaViewBaseFragment = (MediaViewBaseFragment) this.A00;
        if (((C65083Qq) this.A01).A0c()) {
            mediaViewBaseFragment.A1o(AnonymousClass000.A1Q(i & 4), false);
        }
    }
}
