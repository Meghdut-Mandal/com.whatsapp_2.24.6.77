package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0tN  reason: invalid class name and case insensitive filesystem */
public class C18570tN implements Iterator, AnonymousClass00W {
    public int A00;
    public Object A01;
    public final int A02 = 1;

    public C18570tN(C12840ik r2) {
        this.A00 = r2.A00;
        this.A01 = r2.A01.iterator();
    }

    public boolean hasNext() {
        switch (this.A02) {
            case 0:
                if (this.A00 < ((ViewGroup) this.A01).getChildCount()) {
                    return true;
                }
                return false;
            case 1:
                return ((Iterator) this.A01).hasNext();
            default:
                if (this.A00 <= 0 || !((Iterator) this.A01).hasNext()) {
                    return false;
                }
                return true;
        }
    }

    public /* bridge */ /* synthetic */ Object next() {
        switch (this.A02) {
            case 0:
                int i = this.A00;
                this.A00 = i + 1;
                View childAt = ((ViewGroup) this.A01).getChildAt(i);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                int i2 = this.A00;
                this.A00 = i2 + 1;
                if (i2 >= 0) {
                    return new C06600Ug(i2, ((Iterator) this.A01).next());
                }
                AnonymousClass03T.A05();
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            default:
                int i3 = this.A00;
                if (i3 != 0) {
                    this.A00 = i3 - 1;
                    return ((Iterator) this.A01).next();
                }
                throw new NoSuchElementException();
        }
    }

    public void remove() {
        switch (this.A02) {
            case 0:
                int i = this.A00 - 1;
                this.A00 = i;
                ((ViewGroup) this.A01).removeViewAt(i);
                return;
            case 1:
                throw AnonymousClass000.A0x();
            default:
                throw AnonymousClass000.A0x();
        }
    }

    public C18570tN(C12730iZ r2) {
        this.A01 = r2.A00.iterator();
    }

    public C18570tN(ViewGroup viewGroup) {
        this.A01 = viewGroup;
    }
}
