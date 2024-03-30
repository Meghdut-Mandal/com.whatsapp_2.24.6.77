package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4nO  reason: invalid class name and case insensitive filesystem */
public class C96474nO extends AnonymousClass0UE {
    public static final ViewGroup.MarginLayoutParams A01;
    public AnonymousClass62S A00;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        A01 = marginLayoutParams;
    }

    public C96474nO(AnonymousClass62S r1) {
        this.A00 = r1;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        View A0k;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int height;
        int top;
        int i3;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int A1T = linearLayoutManager.A1T();
        if (A1T != -1 && (A0k = linearLayoutManager.A0k(A1T)) != null) {
            if (A0k.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = AnonymousClass000.A0a(A0k);
            } else {
                marginLayoutParams = A01;
            }
            if (linearLayoutManager.A00 == 0) {
                height = A0k.getWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                if (AnonymousClass04F.A01(linearLayoutManager.A07) == 0) {
                    top = A0k.getLeft();
                    i3 = marginLayoutParams.leftMargin;
                } else {
                    top = height - A0k.getRight();
                    i3 = marginLayoutParams.rightMargin;
                }
            } else {
                height = marginLayoutParams.bottomMargin + A0k.getHeight() + marginLayoutParams.topMargin;
                top = A0k.getTop();
                i3 = marginLayoutParams.topMargin;
            }
            int i4 = -(top - i3);
            float f = 0.0f;
            if (height != 0) {
                f = ((float) i4) / ((float) height);
            }
            AnonymousClass62S r4 = this.A00;
            C1273868b A002 = C1273868b.A00();
            C1271967i r3 = r4.A00;
            A002.A0A(r3, 0);
            A002.A0A(Integer.valueOf(A1T), 1);
            A002.A0A(C129316Gk.A00((double) f), 2);
            C131756Qk.A02(r3, r4.A01, C1273868b.A04(A002, Integer.valueOf(i4), 3), r4.A02);
        }
    }
}
