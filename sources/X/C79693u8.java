package X;

import com.whatsapp.R;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.3u8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79693u8 implements AnonymousClass4SM {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ C46932bu A01;
    public final /* synthetic */ C65083Qq A02;

    public /* synthetic */ C79693u8(MediaViewFragment mediaViewFragment, C46932bu r2, C65083Qq r3) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void BWy(String str, String str2, boolean z) {
        MediaViewFragment mediaViewFragment = this.A00;
        C46932bu r1 = this.A01;
        C65083Qq r2 = this.A02;
        if (str == null) {
            str = mediaViewFragment.A0n(R.string.f12nameremoved);
        }
        if (!z) {
            AnonymousClass2bU.A00(r1).A0e = false;
            r2.A0D();
            AnonymousClass01I A0h = mediaViewFragment.A0h();
            if (A0h != null && !A0h.isFinishing()) {
                C39001qm A04 = AnonymousClass3LW.A04(mediaViewFragment);
                A04.A0Z(str);
                A04.A0L(R.string.f12nameremoved);
                A04.setPositiveButton(R.string.f12nameremoved, new AnonymousClass4XN(mediaViewFragment, 35));
                C36341k9.A11(A04);
            }
        }
    }
}
