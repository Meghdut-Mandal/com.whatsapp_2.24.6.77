package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0sk  reason: invalid class name and case insensitive filesystem */
public class C18180sk extends AnonymousClass0CY {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18180sk(AnonymousClass0CP r1, int i) {
        super(r1);
        this.A00 = i;
    }

    public int A01() {
        if (this.A00 != 0) {
            return this.A02.A00;
        }
        return this.A02.A03;
    }

    public int A02() {
        int i;
        int A0P;
        int i2 = this.A00;
        AnonymousClass0CP r0 = this.A02;
        if (i2 != 0) {
            i = r0.A00;
            A0P = r0.A0N();
        } else {
            i = r0.A03;
            A0P = r0.A0P();
        }
        return i - A0P;
    }

    public int A03() {
        if (this.A00 != 0) {
            return this.A02.A01;
        }
        return this.A02.A04;
    }

    public int A04() {
        if (this.A00 != 0) {
            return this.A02.A0Q();
        }
        return this.A02.A0O();
    }

    public int A05() {
        int A0O;
        int A0P;
        int i = this.A00;
        AnonymousClass0CP r2 = this.A02;
        if (i != 0) {
            A0O = r2.A00 - r2.A0Q();
            A0P = r2.A0N();
        } else {
            A0O = r2.A03 - r2.A0O();
            A0P = r2.A0P();
        }
        return A0O - A0P;
    }

    public int A06(View view) {
        int right;
        int i;
        int i2 = this.A00;
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

    public int A07(View view) {
        int measuredWidth;
        int i;
        int i2 = this.A00;
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(view);
        Rect A002 = AnonymousClass0D2.A00(view);
        if (i2 != 0) {
            measuredWidth = view.getMeasuredHeight() + A002.top + A002.bottom + A0a.topMargin;
            i = A0a.bottomMargin;
        } else {
            measuredWidth = view.getMeasuredWidth() + A002.left + A002.right + A0a.leftMargin;
            i = A0a.rightMargin;
        }
        return measuredWidth + i;
    }

    public int A08(View view) {
        int measuredHeight;
        int i;
        int i2 = this.A00;
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(view);
        Rect A002 = AnonymousClass0D2.A00(view);
        if (i2 != 0) {
            measuredHeight = view.getMeasuredWidth() + A002.left + A002.right + A0a.leftMargin;
            i = A0a.rightMargin;
        } else {
            measuredHeight = view.getMeasuredHeight() + A002.top + A002.bottom + A0a.topMargin;
            i = A0a.bottomMargin;
        }
        return measuredHeight + i;
    }

    public int A09(View view) {
        int left;
        int i;
        int i2 = this.A00;
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

    public int A0A(View view) {
        int i = this.A00;
        AnonymousClass0CP r1 = this.A02;
        Rect rect = this.A01;
        if (i != 0) {
            r1.A0V(rect, view);
            return rect.bottom;
        }
        r1.A0V(rect, view);
        return rect.right;
    }

    public int A0B(View view) {
        int i = this.A00;
        AnonymousClass0CP r1 = this.A02;
        Rect rect = this.A01;
        if (i != 0) {
            r1.A0V(rect, view);
            return rect.top;
        }
        r1.A0V(rect, view);
        return rect.left;
    }

    public void A0C(int i) {
        if (this.A00 != 0) {
            this.A02.A15(i);
        } else {
            this.A02.A14(i);
        }
    }
}
