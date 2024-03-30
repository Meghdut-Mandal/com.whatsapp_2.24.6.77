package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.8I1  reason: invalid class name */
public class AnonymousClass8I1 extends C21886AcE<String> implements B6Z, RandomAccess {
    public static final B6Z A01;
    public static final AnonymousClass8I1 A02;
    public final List A00;

    static {
        AnonymousClass8I1 r1 = new AnonymousClass8I1();
        A02 = r1;
        r1.A00 = false;
        A01 = r1;
    }

    public Object BGR(int i) {
        return this.A00.get(i);
    }

    public List BIg() {
        return Collections.unmodifiableList(this.A00);
    }

    public B6Z BIh() {
        if (this.A00) {
            return new C21887AcF(this);
        }
        return this;
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        String str;
        int A022;
        List list = this.A00;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof C21674AUx) {
            C21674AUx aUx = (C21674AUx) obj;
            str = aUx.A04();
            AnonymousClass8I5 r5 = (AnonymousClass8I5) aUx;
            int A07 = r5.A07();
            A022 = C196659aK.A00.A02(r5.bytes, A07, r5.A02() + A07);
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, AnonymousClass9BD.A04);
            A022 = C196659aK.A00.A02(bArr, 0, bArr.length);
        }
        if (A022 == 0) {
            list.set(i, str);
        }
        return str;
    }

    public int size() {
        return this.A00.size();
    }

    public AnonymousClass8I1(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public void B0D(C21674AUx aUx) {
        A01();
        this.A00.add(aUx);
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ C23122B6c BQ1(int i) {
        if (i >= size()) {
            ArrayList A14 = C36441kJ.A14(i);
            A14.addAll(this.A00);
            return new AnonymousClass8I1(A14);
        }
        throw C165617ti.A0U();
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        this.modCount++;
    }

    public boolean addAll(int i, Collection collection) {
        A01();
        if (collection instanceof B6Z) {
            collection = ((B6Z) collection).BIg();
        }
        boolean addAll = this.A00.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public void clear() {
        A01();
        this.A00.clear();
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        A01();
        Object remove = this.A00.remove(i);
        this.modCount++;
        if (remove instanceof String) {
            return remove;
        }
        if (remove instanceof C21674AUx) {
            return ((C21674AUx) remove).A04();
        }
        return new String((byte[]) remove, AnonymousClass9BD.A04);
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        A01();
        Object obj2 = this.A00.set(i, obj);
        if (obj2 instanceof String) {
            return obj2;
        }
        if (obj2 instanceof C21674AUx) {
            return ((C21674AUx) obj2).A04();
        }
        return new String((byte[]) obj2, AnonymousClass9BD.A04);
    }

    public AnonymousClass8I1() {
        this(C36441kJ.A14(10));
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
