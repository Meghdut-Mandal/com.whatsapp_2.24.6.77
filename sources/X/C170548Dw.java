package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.8Dw  reason: invalid class name and case insensitive filesystem */
public final class C170548Dw extends C21884AcA<String> implements B6X, RandomAccess {
    public static final C170548Dw A01;
    public static final B6X A02;
    public final List A00;

    static {
        C170548Dw r1 = new C170548Dw();
        A01 = r1;
        r1.A00 = false;
        A02 = r1;
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C21673AUw)) {
            return new String((byte[]) obj, C197089b7.A00);
        }
        C21673AUw aUw = (C21673AUw) obj;
        Charset charset = C197089b7.A00;
        if (aUw.A01() == 0) {
            return "";
        }
        AnonymousClass8E0 r4 = (AnonymousClass8E0) aUw;
        return new String(r4.zzb, r4.A03(), r4.A01(), charset);
    }

    public final Object ByU(int i) {
        return this.A00.get(i);
    }

    public final List Byi() {
        return Collections.unmodifiableList(this.A00);
    }

    public final B6X Bym() {
        if (this.A00) {
            return new C21885AcB(this);
        }
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        String str;
        int A012;
        List list = this.A00;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof C21673AUw) {
            C21673AUw aUw = (C21673AUw) obj;
            Charset charset = C197089b7.A00;
            if (aUw.A01() == 0) {
                str = "";
            } else {
                AnonymousClass8E0 r0 = (AnonymousClass8E0) aUw;
                str = new String(r0.zzb, r0.A03(), r0.A01(), charset);
            }
            AnonymousClass8E0 r6 = (AnonymousClass8E0) aUw;
            int A03 = r6.A03();
            A012 = C196639aB.A00.A01(r6.zzb, A03, r6.A01() + A03);
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C197089b7.A00);
            A012 = C196639aB.A00.A01(bArr, 0, bArr.length);
        }
        if (A012 == 0) {
            list.set(i, str);
        }
        return str;
    }

    public final int size() {
        return this.A00.size();
    }

    public C170548Dw(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public final /* synthetic */ C23121B6b ByB(int i) {
        if (i >= size()) {
            ArrayList A14 = C36441kJ.A14(i);
            A14.addAll(this.A00);
            return new C170548Dw(A14);
        }
        throw C165617ti.A0U();
    }

    public final void ByG(C21673AUw aUw) {
        A01();
        this.A00.add(aUw);
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        A01();
        if (collection instanceof B6X) {
            collection = ((B6X) collection).Byi();
        }
        boolean addAll = this.A00.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        A01();
        this.A00.clear();
        this.modCount++;
    }

    public final /* synthetic */ Object remove(int i) {
        A01();
        Object remove = this.A00.remove(i);
        this.modCount++;
        return A00(remove);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        A01();
        return A00(this.A00.set(i, obj));
    }

    public C170548Dw() {
        this(C36441kJ.A14(10));
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
