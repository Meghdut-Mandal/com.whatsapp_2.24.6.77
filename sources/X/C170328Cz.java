package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.8Cz  reason: invalid class name and case insensitive filesystem */
public final class C170328Cz extends C21882Ac8<String> implements B6W, RandomAccess {
    public static final C170328Cz A01;
    public static final B6W A02;
    public final List A00;

    public C170328Cz(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public final Object BGR(int i) {
        return this.A00.get(i);
    }

    public final List Byb() {
        return Collections.unmodifiableList(this.A00);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        A01();
        if (collection instanceof B6W) {
            collection = ((B6W) collection).Byb();
        }
        boolean addAll = this.A00.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
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

    public final int size() {
        return this.A00.size();
    }

    static {
        C170328Cz r1 = new C170328Cz();
        A01 = r1;
        r1.A00 = false;
        A02 = r1;
    }

    public C170328Cz() {
        this(C36441kJ.A14(10));
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof AUv)) {
            return new String((byte[]) obj, C197079b6.A00);
        }
        AUv aUv = (AUv) obj;
        Charset charset = C197079b6.A00;
        if (aUv.A02() == 0) {
            return "";
        }
        AnonymousClass8D2 r4 = (AnonymousClass8D2) aUv;
        return new String(r4.zzfp, r4.A04(), r4.A02(), charset);
    }

    public final B6W Byc() {
        if (this.A00) {
            return new C21883Ac9(this);
        }
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        String str;
        int A022;
        List list = this.A00;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof AUv) {
            AUv aUv = (AUv) obj;
            Charset charset = C197079b6.A00;
            if (aUv.A02() == 0) {
                str = "";
            } else {
                AnonymousClass8D2 r0 = (AnonymousClass8D2) aUv;
                str = new String(r0.zzfp, r0.A04(), r0.A02(), charset);
            }
            AnonymousClass8D2 r6 = (AnonymousClass8D2) aUv;
            int A04 = r6.A04();
            A022 = C201819kT.A00.A02(r6.zzfp, A04, r6.A02() + A04);
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C197079b6.A00);
            A022 = C201819kT.A00.A02(bArr, 0, bArr.length);
        }
        if (A022 == 0) {
            list.set(i, str);
        }
        return str;
    }

    public final /* synthetic */ C23120B6a Byu(int i) {
        if (i >= size()) {
            ArrayList A14 = C36441kJ.A14(i);
            A14.addAll(this.A00);
            return new C170328Cz(A14);
        }
        throw C165617ti.A0U();
    }
}
