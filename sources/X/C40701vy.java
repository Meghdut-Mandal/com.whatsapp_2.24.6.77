package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.1vy  reason: invalid class name and case insensitive filesystem */
public class C40701vy extends AnonymousClass0CZ {
    public int A00;
    public AnonymousClass1LI A01;
    public List A02;
    public boolean A03 = false;
    public final Context A04;
    public final LayoutInflater A05;
    public final AnonymousClass3CG A06;
    public final AnonymousClass171 A07;
    public final AnonymousClass1RY A08;
    public final C18820ts A09;

    public int A0J() {
        List list = this.A02;
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int i = this.A00;
        if (size <= i || this.A03) {
            return size;
        }
        return i + 1;
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r10, int i) {
        int i2;
        C42361yh r102 = (C42361yh) r10;
        if (this.A03 || i != (i2 = this.A00)) {
            List list = this.A02;
            if (list != null) {
                C596534t r5 = (C596534t) list.get(i);
                AnonymousClass141 r4 = r5.A00;
                AnonymousClass3SF r3 = r102.A05;
                r3.A05(r4);
                r3.A01.setTextColor(C36351kA.A01(this.A04, R.attr.f4nameremoved, R.color.f6nameremoved));
                ImageView imageView = r102.A02;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(C36401kF.A0o(this.A06.A00, R.string.f12nameremoved));
                C011004s.A08(imageView, AnonymousClass000.A0q(AnonymousClass143.A03(r4.A0H), A0u));
                AnonymousClass1RY r2 = this.A08;
                r2.A08(imageView, r4);
                AnonymousClass171 r8 = this.A07;
                if (r8.A0g(r4, -1) && r4.A0a != null) {
                    TextEmojiLabel textEmojiLabel = r102.A03;
                    textEmojiLabel.setVisibility(0);
                    textEmojiLabel.A0I(AnonymousClass171.A03(r8, r4, R.string.f12nameremoved));
                }
                if (r4.A0X != null) {
                    TextEmojiLabel textEmojiLabel2 = r102.A04;
                    textEmojiLabel2.setVisibility(0);
                    textEmojiLabel2.A0I(r4.A0X);
                } else {
                    r102.A04.setVisibility(8);
                }
                C67113Yo.A00(r102.A0H, this, r4, r5, 48);
                r2.A08(imageView, r4);
                return;
            }
            return;
        }
        int A062 = C36371kC.A06(this.A02) - i2;
        AnonymousClass3SF r52 = r102.A05;
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1L(A0L, A062, 0);
        String A0L2 = this.A09.A0L(A0L, R.plurals.f10nameremoved, (long) A062);
        TextEmojiLabel textEmojiLabel3 = r52.A01;
        textEmojiLabel3.setText(A0L2);
        C36331k8.A0r(this.A04, textEmojiLabel3, R.color.f6nameremoved);
        r102.A04.setVisibility(8);
        r102.A02.setImageResource(R.drawable.ic_more_participants);
        AnonymousClass3Y3.A00(r102.A0H, this, 39);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        List list = AnonymousClass0D3.A0I;
        return new C42361yh(C36361kB.A0E(this.A05, viewGroup, R.layout.f9nameremoved), this.A01);
    }

    public C40701vy(Context context, AnonymousClass1LI r3, AnonymousClass3CG r4, AnonymousClass171 r5, AnonymousClass1RY r6, C18820ts r7, int i) {
        this.A04 = context;
        this.A05 = LayoutInflater.from(context);
        this.A07 = r5;
        this.A09 = r7;
        this.A06 = r4;
        this.A08 = r6;
        this.A01 = r3;
        this.A00 = i;
    }
}
