package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.0M2  reason: invalid class name */
public final class AnonymousClass0M2 extends C13330jh implements C17840s9, RandomAccess {
    public static final C17840s9 A01;
    public static final AnonymousClass0M2 A02;
    public final List A00;

    static {
        AnonymousClass0M2 r1 = new AnonymousClass0M2(10);
        A02 = r1;
        r1.A00 = false;
        A01 = r1;
    }

    public AnonymousClass0M2(int i) {
        this.A00 = new ArrayList(i);
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C10960fV)) {
            return new String((byte[]) obj, AnonymousClass0WB.A04);
        }
        C10960fV r4 = (C10960fV) obj;
        Charset charset = AnonymousClass0WB.A04;
        if (r4.A02() == 0) {
            return "";
        }
        AnonymousClass0M5 r42 = (AnonymousClass0M5) r4;
        return new String(r42.zza, 0, r42.A02(), charset);
    }

    /* renamed from: A02 */
    public final String get(int i) {
        String str;
        boolean A002;
        List list = this.A00;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C10960fV) {
            C10960fV r6 = (C10960fV) obj;
            Charset charset = AnonymousClass0WB.A04;
            if (r6.A02() == 0) {
                str = "";
            } else {
                AnonymousClass0M5 r0 = (AnonymousClass0M5) r6;
                str = new String(r0.zza, 0, r0.A02(), charset);
            }
            AnonymousClass0M5 r62 = (AnonymousClass0M5) r6;
            A002 = AnonymousClass0RO.A00.A00(r62.zza, 0, r62.A02());
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, AnonymousClass0WB.A04);
            A002 = AnonymousClass0RO.A00.A00(bArr, 0, bArr.length);
        }
        if (A002) {
            list.set(i, str);
        }
        return str;
    }

    public final C17840s9 Byl() {
        if (this.A00) {
            return new C13340ji(this);
        }
        return this;
    }

    public final List Byq() {
        return Collections.unmodifiableList(this.A00);
    }

    public final int size() {
        return this.A00.size();
    }

    public final /* bridge */ /* synthetic */ C17850sA Byg(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.A00);
            return new AnonymousClass0M2(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        A01();
        if (collection instanceof C17840s9) {
            collection = ((C17840s9) collection).Byq();
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

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        A01();
        Object remove = this.A00.remove(i);
        this.modCount++;
        return A00(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        A01();
        return A00(this.A00.set(i, obj));
    }

    public AnonymousClass0M2(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public AnonymousClass0M2() {
        this(10);
    }
}
