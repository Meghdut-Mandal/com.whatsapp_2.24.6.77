package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.List;

/* renamed from: X.1vs  reason: invalid class name and case insensitive filesystem */
public final class C40641vs extends AnonymousClass0CZ {
    public final AnonymousClass1LI A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass1RY A02;
    public final List A03;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C41961y3(C36371kC.A0J(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved, false), this.A00);
    }

    public int A0J() {
        return this.A03.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r9, int i) {
        C41961y3 r92 = (C41961y3) r9;
        AnonymousClass00C.A0D(r92, 0);
        AnonymousClass11F r7 = (AnonymousClass11F) this.A03.get(i);
        AnonymousClass141 A0D = this.A01.A0D(r7);
        AnonymousClass3SF r5 = r92.A00;
        r5.A05(A0D);
        WDSProfilePhoto wDSProfilePhoto = r92.A01;
        r5.A01.setTextColor(C36351kA.A02(wDSProfilePhoto.getContext(), wDSProfilePhoto.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        this.A02.A08(wDSProfilePhoto, A0D);
        C66963Xz.A00(r92.A0H, r7, 13);
    }

    public C40641vs(AnonymousClass1LI r1, AnonymousClass16D r2, AnonymousClass1RY r3, List list) {
        C36321k7.A0x(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = list;
    }
}
