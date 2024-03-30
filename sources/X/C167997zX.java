package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: X.7zX  reason: invalid class name and case insensitive filesystem */
public final class C167997zX extends AnonymousClass0CZ {
    public int A00;
    public final C19630wG A01;
    public final C18820ts A02;
    public final List A03 = AnonymousClass001.A0I();

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        return new AnonymousClass802(C36371kC.A0J(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved, false), this.A01, this.A02);
    }

    public int A0J() {
        return this.A03.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r9, int i) {
        AnonymousClass16X r0;
        BigDecimal bigDecimal;
        AnonymousClass802 r92 = (AnonymousClass802) r9;
        AnonymousClass00C.A0D(r92, 0);
        C193189Ke r5 = (C193189Ke) this.A03.get(i);
        AnonymousClass00C.A0D(r5, 0);
        C206629ti r7 = r5.A01;
        C207119ua r02 = r7.A01;
        String str = null;
        if (!(r02 == null || (r0 = r02.A02) == null || (bigDecimal = r0.A00) == null)) {
            AnonymousClass16U r1 = AnonymousClass16W.A04;
            C18740tg.A06(r1);
            str = r1.B7e(r92.A03, bigDecimal);
        }
        TextEmojiLabel textEmojiLabel = r92.A01;
        C19630wG r3 = r92.A02;
        Object[] A0M = AnonymousClass001.A0M();
        C90494aF.A1H(Integer.valueOf(r7.A00), str, A0M);
        textEmojiLabel.setText(r3.A02(R.string.f12nameremoved, A0M));
        r92.A00.setChecked(r5.A02);
        C36371kC.A1F(r92.A0H, r5, r92, 46);
    }

    public C167997zX(C19630wG r2, C18820ts r3) {
        this.A02 = r3;
        this.A01 = r2;
    }
}
