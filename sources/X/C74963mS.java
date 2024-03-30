package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.3mS  reason: invalid class name and case insensitive filesystem */
public class C74963mS implements C160647lM {
    public final float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ MediaViewBaseFragment A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r4.A1p() == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C74963mS(android.view.View r3, com.whatsapp.mediaview.MediaViewBaseFragment r4) {
        /*
            r2 = this;
            r2.A02 = r4
            r2.A01 = r3
            r2.<init>()
            X.3U9 r0 = r4.A0A
            boolean r0 = r0 instanceof X.AnonymousClass2XU
            if (r0 != 0) goto L_0x0016
            boolean r1 = r4.A1p()
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            if (r1 != 0) goto L_0x0018
        L_0x0016:
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x0018:
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74963mS.<init>(android.view.View, com.whatsapp.mediaview.MediaViewBaseFragment):void");
    }

    public boolean BLc(View view) {
        return C36361kB.A1a(view, this.A02.A04);
    }

    public void BVs(View view) {
        MediaViewBaseFragment mediaViewBaseFragment = this.A02;
        AnonymousClass3U9 r1 = mediaViewBaseFragment.A0A;
        if (((r1 instanceof AnonymousClass2XU) || !mediaViewBaseFragment.A1p()) && (r1 instanceof AnonymousClass2XV)) {
            mediaViewBaseFragment.A08.setAlpha(0.0f);
        }
        mediaViewBaseFragment.A1i();
    }

    public void BWD(int i) {
        MediaViewBaseFragment mediaViewBaseFragment = this.A02;
        if (mediaViewBaseFragment instanceof MediaViewFragment) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) mediaViewBaseFragment;
            C65083Qq r1 = mediaViewFragment.A1o;
            if (i == 1) {
                if (r1 != null) {
                    r1.A0A();
                    AnonymousClass5NI A09 = mediaViewFragment.A1o.A09();
                    if (A09 != null && !A09.A0A()) {
                        A09.A03();
                        A09.A09(3000);
                    }
                }
                MediaViewFragment.A0E(mediaViewFragment);
            } else if (r1 != null && r1.A09() == null) {
                r1.A0J();
            }
        }
    }

    public void BgQ(View view) {
        AnonymousClass15L r0 = (AnonymousClass15L) this.A02.A0h();
        if (r0 != null) {
            r0.Bim();
        }
    }

    public void Bgp(View view, float f) {
        float f2;
        MediaViewBaseFragment mediaViewBaseFragment = this.A02;
        AnonymousClass15L r1 = (AnonymousClass15L) mediaViewBaseFragment.A0h();
        if (r1 != null && !r1.isFinishing()) {
            r1.BVx();
            float f3 = 1.0f - f;
            float f4 = this.A00;
            if (f3 < f4) {
                f2 = 0.0f;
            } else {
                f2 = (f3 - f4) / (1.0f - f4);
            }
            this.A01.setAlpha(f2);
            mediaViewBaseFragment.A03.setAlpha(f2);
            mediaViewBaseFragment.A07.setAlpha(f2);
            if ((mediaViewBaseFragment.A0A instanceof AnonymousClass2XU) || !mediaViewBaseFragment.A1p()) {
                mediaViewBaseFragment.A08.setAlpha(f2);
            }
            int childCount = mediaViewBaseFragment.A08.getChildCount();
            for (int i = 0; i < childCount; i++) {
                mediaViewBaseFragment.A08.getChildAt(i).findViewById(R.id.footer).setAlpha(f2 * f2);
            }
            mediaViewBaseFragment.A1o(true, true);
        }
    }
}
