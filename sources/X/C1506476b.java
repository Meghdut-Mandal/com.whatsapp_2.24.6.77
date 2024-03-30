package X;

import java.util.ListIterator;

/* renamed from: X.76b  reason: invalid class name and case insensitive filesystem */
public final class C1506476b implements ListIterator, AnonymousClass00W {
    public int A00;
    public final int A01;
    public final int A02;
    public final /* synthetic */ AnonymousClass76X A03;

    public C1506476b(AnonymousClass76X r1, int i, int i2, int i3) {
        this.A03 = r1;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }

    public boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A01);
    }

    public boolean hasPrevious() {
        return C90474aD.A1T(this.A00, this.A02);
    }

    public /* bridge */ /* synthetic */ Object next() {
        Object[] objArr = this.A03.A03;
        int i = this.A00;
        this.A00 = i + 1;
        Object obj = objArr[i];
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return obj;
    }

    public int nextIndex() {
        return this.A00 - this.A02;
    }

    public /* bridge */ /* synthetic */ Object previous() {
        Object[] objArr = this.A03.A03;
        int i = this.A00 - 1;
        this.A00 = i;
        Object obj = objArr[i];
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return obj;
    }

    public int previousIndex() {
        return (this.A00 - this.A02) - 1;
    }

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw AnonymousClass000.A0x();
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw AnonymousClass000.A0x();
    }
}
