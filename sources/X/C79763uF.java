package X;

import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.3uF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79763uF implements C158627ho {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ C65083Qq A01;

    public /* synthetic */ C79763uF(MediaViewFragment mediaViewFragment, C65083Qq r2) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
    }

    public final void BkV(int i) {
        MediaViewFragment mediaViewFragment = this.A00;
        if (this.A01.A0c() && mediaViewFragment.A0h() != null) {
            boolean A1Q = AnonymousClass000.A1Q(C36361kB.A0C(mediaViewFragment.A0i()).getSystemUiVisibility() & 4);
            if (i == 0) {
                if (!A1Q) {
                    mediaViewFragment.A1o(true, true);
                }
            } else if (i == 4 && A1Q) {
                mediaViewFragment.A1o(false, true);
            }
        }
    }
}
