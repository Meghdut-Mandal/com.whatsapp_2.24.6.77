package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4mj  reason: invalid class name and case insensitive filesystem */
public class C96064mj extends AnonymousClass0CZ {
    public int A00 = 0;
    public AnonymousClass11F A01;
    public C158507hc A02;
    public List A03;
    public boolean A04 = false;
    public long A05 = 0;
    public final LayoutInflater A06;
    public final AnonymousClass1HA A07;
    public final C88234Rx A08;
    public final Integer A09;
    public final HashMap A0A = AnonymousClass001.A0J();

    public long A0E(int i) {
        List list;
        Number A10;
        if (!this.A00 || (list = this.A03) == null || (A10 = C36441kJ.A10(((C135066c4) list.get(i)).A0E, this.A0A)) == null) {
            return -1;
        }
        return A10.longValue();
    }

    public int A0J() {
        return C36371kC.A06(this.A03);
    }

    public void A0L(List list) {
        this.A03 = list;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C135066c4 A0U = C90504aG.A0U(it);
                HashMap hashMap = this.A0A;
                if (hashMap.get(A0U.A0E) == null) {
                    long j = this.A05;
                    this.A05 = 1 + j;
                    hashMap.put(A0U.A0E, Long.valueOf(j));
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r18, int i) {
        View view;
        C135066c4 r0;
        C96884o3 r12 = (C96884o3) r18;
        List list = this.A03;
        if (list != null) {
            int i2 = i;
            C135066c4 r5 = (C135066c4) list.get(i2);
            boolean z = this.A04;
            if (z != r12.A03) {
                r12.A03 = z;
                if (!z) {
                    StickerView stickerView = r12.A07;
                    stickerView.A03 = false;
                    stickerView.A05();
                } else if (r12.A02) {
                    StickerView stickerView2 = r12.A07;
                    stickerView2.A03 = true;
                    stickerView2.A04();
                }
            }
            int i3 = this.A00;
            AnonymousClass11F r14 = this.A01;
            if (r5 == null || (r0 = r12.A01) == null || !r5.A0E.equals(r0.A0E)) {
                r12.A01 = r5;
                if (r5 == null) {
                    View view2 = r12.A0H;
                    view2.setOnClickListener((View.OnClickListener) null);
                    r12.A07.setImageResource(0);
                    view2.setBackgroundResource(0);
                    view2.setClickable(false);
                } else {
                    String str = r5.A0E;
                    if (str == null || !str.equals("loading-hash")) {
                        view = r12.A0H;
                        view.setOnClickListener(new C48852iA(r12, r5, r14, i2, 2));
                        view.setOnLongClickListener(r12.A04);
                    } else {
                        view = r12.A0H;
                        view.setOnClickListener((View.OnClickListener) null);
                        view.setClickable(false);
                    }
                    view.setBackgroundResource(R.drawable.selector_orange_gradient);
                    view.setContentDescription(AnonymousClass3RT.A00(view.getContext(), r5));
                    StickerView stickerView3 = r12.A07;
                    int dimensionPixelSize = C36341k9.A0F(stickerView3).getDimensionPixelSize(R.dimen.f7nameremoved);
                    r12.A05.A08(stickerView3, r5, new C164777sM(r12, 0), i3, dimensionPixelSize, dimensionPixelSize, true, true);
                }
            }
            r12.A00 = new C163557qO(this, r5, 3);
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C96884o3(this.A06, viewGroup, this.A07, this.A08, this.A09);
    }

    public C96064mj(Context context, AnonymousClass1HA r4, C88234Rx r5, Integer num, List list) {
        this.A06 = LayoutInflater.from(context);
        this.A07 = r4;
        this.A08 = r5;
        this.A09 = num;
        A0L(list);
        A0B(true);
    }
}
