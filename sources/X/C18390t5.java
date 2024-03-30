package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0t5  reason: invalid class name and case insensitive filesystem */
public class C18390t5 implements AnonymousClass0CT {
    public Object A00;
    public final int A01;

    public C18390t5(AnonymousClass0CP r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public int B9c(View view) {
        int right;
        int i;
        int i2 = this.A01;
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(view);
        if (i2 != 0) {
            right = view.getBottom() + AnonymousClass0D2.A00(view).bottom;
            i = A0a.bottomMargin;
        } else {
            right = view.getRight() + AnonymousClass0D2.A00(view).right;
            i = A0a.rightMargin;
        }
        return right + i;
    }

    public int B9d(View view) {
        int left;
        int i;
        int i2 = this.A01;
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(view);
        if (i2 != 0) {
            left = view.getTop() - AnonymousClass0D2.A00(view).top;
            i = A0a.topMargin;
        } else {
            left = view.getLeft() - AnonymousClass0D2.A00(view).left;
            i = A0a.leftMargin;
        }
        return left - i;
    }

    public int BF5() {
        int i;
        int A0P;
        int i2 = this.A01;
        AnonymousClass0CP r0 = (AnonymousClass0CP) this.A00;
        if (i2 != 0) {
            i = r0.A00;
            A0P = r0.A0N();
        } else {
            i = r0.A03;
            A0P = r0.A0P();
        }
        return i - A0P;
    }

    public int BFA() {
        if (this.A01 != 0) {
            return ((AnonymousClass0CP) this.A00).A0Q();
        }
        return ((AnonymousClass0CP) this.A00).A0O();
    }
}
