package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1vo  reason: invalid class name and case insensitive filesystem */
public final class C40601vo extends AnonymousClass0CZ {
    public List A00 = C023409w.A00;
    public final C1272367m A01;
    public final AnonymousClass32M A02;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C42231yU(C36371kC.A0I(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved), this.A02);
    }

    public int A0J() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r8, int i) {
        C42231yU r82 = (C42231yU) r8;
        AnonymousClass00C.A0D(r82, 0);
        C66743Xd r6 = (C66743Xd) this.A00.get(i);
        C1272367m r5 = this.A01;
        AnonymousClass00C.A0D(r6, 0);
        r82.A02.setText(r6.A03);
        String str = r6.A04;
        ImageView imageView = r82.A01;
        View view = r82.A00;
        r5.A00(C013105r.A01(view.getContext(), R.drawable.wds_profile_third_party_photo), imageView, str);
        AnonymousClass3YG.A00(view, r82.A03, r6, 38);
    }

    public C40601vo(C1272367m r2, AnonymousClass32M r3) {
        this.A01 = r2;
        this.A02 = r3;
    }
}
