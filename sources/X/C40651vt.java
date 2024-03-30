package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.1vt  reason: invalid class name and case insensitive filesystem */
public final class C40651vt extends AnonymousClass0CZ {
    public List A00 = AnonymousClass001.A0I();
    public final C57772yn A01;
    public final AnonymousClass1RY A02;
    public final AnonymousClass4OR A03;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        C57772yn r4 = this.A01;
        View A0J = C36371kC.A0J(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved, false);
        AnonymousClass1RY r2 = this.A02;
        List list = AnonymousClass0D3.A0I;
        return new C42281yZ(A0J, r2, (C64633Ov) r4.A00.A01.A00.A2u.get(), this);
    }

    public int A0J() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r9, int i) {
        C42281yZ r92 = (C42281yZ) r9;
        AnonymousClass00C.A0D(r92, 0);
        C46542Yg r7 = (C46542Yg) this.A00.get(i);
        AnonymousClass00C.A0D(r7, 0);
        WaTextView waTextView = r92.A01;
        C44072La r1 = r7.A02;
        waTextView.setText(r1.A0K);
        long j = r1.A07;
        C64633Ov r12 = r92.A04;
        int A002 = C64633Ov.A00(r12, (int) j);
        String A012 = r12.A01(A002);
        AnonymousClass00C.A0D(A012, 1);
        WaTextView waTextView2 = r92.A00;
        C36351kA.A16(C36341k9.A0F(waTextView2), waTextView2, new Object[]{A012}, R.plurals.f10nameremoved, A002);
        r92.A03.A08(r92.A02, r7.A00);
    }

    public C40651vt(C57772yn r3, C27731Pn r4, C19630wG r5, AnonymousClass4OR r6) {
        C36321k7.A11(r4, r5, r3);
        this.A01 = r3;
        this.A03 = r6;
        this.A02 = r4.A05(r5.A00, "channel-upgrade-adapter");
    }
}
