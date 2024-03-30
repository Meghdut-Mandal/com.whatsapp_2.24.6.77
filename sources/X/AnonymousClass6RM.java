package X;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6RM  reason: invalid class name */
public abstract class AnonymousClass6RM {
    public static final C132456Tu A00 = new C98164qz();

    public static final void A01(Context context, C161007lx r11, RenderTreeNode renderTreeNode, ArrayList arrayList, int i, int i2) {
        RenderTreeNode renderTreeNode2 = renderTreeNode;
        if (r11 != null) {
            Rect rect = new Rect(i, i2, r11.getWidth() + i, r11.getHeight() + i2);
            ArrayList arrayList2 = arrayList;
            arrayList.size();
            C132456Tu BGf = r11.BGf();
            if (BGf != null) {
                int B9g = r11.B9g();
                RenderTreeNode A002 = A00(rect, r11, renderTreeNode, BGf);
                arrayList.add(A002);
                List A0q = C90524aI.A0q(renderTreeNode.A08);
                if (B9g > 0) {
                    A0q.add(A002);
                    renderTreeNode2 = A002;
                } else {
                    A0q.add(A002);
                }
                i = 0;
                i2 = 0;
            }
            int B9g2 = r11.B9g();
            for (int i3 = 0; i3 < B9g2; i3++) {
                A01(context, r11.B9b(i3), renderTreeNode2, arrayList2, r11.BJL(i3) + i, r11.BJM(i3) + i2);
            }
        }
    }

    public static final RenderTreeNode A00(Rect rect, C161007lx r7, RenderTreeNode renderTreeNode, C132456Tu r9) {
        Rect rect2;
        int i;
        int BEw = r7.BEw();
        if (BEw == 0 && r7.BEz() == 0 && r7.BEx() == 0 && r7.BEu() == 0) {
            rect2 = null;
        } else {
            rect2 = new Rect(BEw, r7.BEz(), r7.BEx(), r7.BEu());
        }
        Object BDT = r7.BDT();
        RenderTreeNode renderTreeNode2 = renderTreeNode;
        if (renderTreeNode != null) {
            i = C90524aI.A0q(renderTreeNode.A08).size();
        } else {
            i = 0;
        }
        return new RenderTreeNode(rect, rect2, renderTreeNode2, r9, BDT, i);
    }
}
