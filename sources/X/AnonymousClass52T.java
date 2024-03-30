package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.52T  reason: invalid class name */
public class AnonymousClass52T extends C96104mn {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r5 == 9) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C97034oI A0M(android.view.View r4, int r5) {
        /*
            r3 = this;
            r2 = 1
            if (r5 == 0) goto L_0x000b
            r0 = 3
            if (r5 == r0) goto L_0x000b
            r0 = 9
            r1 = 0
            if (r5 != r0) goto L_0x000c
        L_0x000b:
            r1 = 1
        L_0x000c:
            java.lang.String r0 = "Unknown view holder type in HScroll"
            X.C18740tg.A0D(r1, r0)
            X.4oI r0 = super.A0N(r4, r5, r2)
            r0.A07 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass52T.A0M(android.view.View, int):X.4oI");
    }

    public static void A00(View view, AnonymousClass52T r7) {
        int i;
        if (r7.A02 == 0 && r7.A01 != null) {
            int size = r7.A08.size();
            int i2 = r7.A01;
            int i3 = r7.A00;
            if (size == 3) {
                i = (i2 + i3) / 3;
            } else {
                i = (int) (((double) i2) / (((double) 3) + 0.25d));
            }
            r7.A02 = i;
        }
        if (r7.A01 != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i4 = r7.A02;
            if (i4 != layoutParams.height) {
                layoutParams.height = i4;
                layoutParams.width = i4 - r7.A00;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        if (r3 == 9) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0L(int r3, android.view.ViewGroup r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x000a
            r0 = 3
            if (r3 == r0) goto L_0x000a
            r0 = 9
            r1 = 0
            if (r3 != r0) goto L_0x000b
        L_0x000a:
            r1 = 1
        L_0x000b:
            java.lang.String r0 = "Unknown view holder type in HScroll"
            X.C18740tg.A0D(r1, r0)
            android.view.View r0 = super.A0L(r3, r4)
            A00(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass52T.A0L(int, android.view.ViewGroup):android.view.View");
    }

    public AnonymousClass52T(C115395io r2, C115405ip r3, C115415iq r4, C115425ir r5, C115435is r6, C115445it r7, C115455iu r8, C145156tR r9, C20810yC r10, AnonymousClass13J r11) {
        super(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        this.A00 = R.style.f13nameremoved;
    }

    public void A0O(C97034oI r2, int i) {
        super.BSE(r2, i);
        A00(r2.A0H, this);
        r2.A0D(3);
    }

    public void A0P(C97034oI r2, List list, int i) {
        super.A0D(r2, list, i);
        A00(r2.A0H, this);
        r2.A0D(3);
    }

    public void A0R(List list) {
        RecyclerView recyclerView;
        int i;
        if (!list.isEmpty() && (recyclerView = this.A01) != null) {
            int i2 = this.A02;
            int width = recyclerView.getWidth();
            if (width != 0) {
                this.A01 = width;
            }
            int size = list.size();
            int i3 = this.A01;
            int i4 = this.A00;
            if (size == 3) {
                i = (i3 + i4) / 3;
            } else {
                i = (int) (((double) i3) / (((double) 3) + 0.25d));
            }
            this.A02 = i;
            if (!(i2 == 0 || i == 0 || i2 == i)) {
                A06();
            }
        }
        super.A0R(list);
    }
}
