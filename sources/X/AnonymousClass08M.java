package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.08M  reason: invalid class name */
public final class AnonymousClass08M {
    public static final Class[] A05 = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final C003801r A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;

    public final void A02(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A03.remove(str);
        AnonymousClass08T r1 = (AnonymousClass08T) this.A02.remove(str);
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A01.remove(str);
    }

    public final void A03(String str, Object obj) {
        C001600r r1;
        AnonymousClass00C.A0D(str, 0);
        if (obj != null) {
            Class[] clsArr = A05;
            int i = 0;
            do {
                Class cls = clsArr[i];
                AnonymousClass00C.A0B(cls);
                if (!cls.isInstance(obj)) {
                    i++;
                }
            } while (i < 29);
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.A02.get(str);
        if (!(obj2 instanceof C001700s) || (r1 = (C001600r) obj2) == null) {
            this.A03.put(str, obj);
        } else {
            r1.A0D(obj);
        }
        AnonymousClass05L r0 = (AnonymousClass05L) this.A01.get(str);
        if (r0 != null) {
            r0.setValue(obj);
        }
    }

    public final C001700s A00(Object obj, String str) {
        C001700s r1;
        Map map = this.A02;
        Object obj2 = map.get(str);
        if ((obj2 instanceof C001700s) && (r1 = (C001700s) obj2) != null) {
            return r1;
        }
        Map map2 = this.A03;
        if (map2.containsKey(str)) {
            obj = map2.get(str);
        } else {
            map2.put(str, obj);
        }
        AnonymousClass08T r12 = new AnonymousClass08T(this, obj, str);
        map.put(str, r12);
        return r12;
    }

    public final C001700s A01(String str) {
        AnonymousClass08T r1;
        C001700s r12;
        Map map = this.A02;
        Object obj = map.get(str);
        if ((obj instanceof C001700s) && (r12 = (C001700s) obj) != null) {
            return r12;
        }
        Map map2 = this.A03;
        if (map2.containsKey(str)) {
            r1 = new AnonymousClass08T(this, map2.get(str), str);
        } else {
            r1 = new AnonymousClass08T(this, str);
        }
        map.put(str, r1);
        return r1;
    }

    public AnonymousClass08M(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A03 = linkedHashMap;
        this.A04 = new LinkedHashMap();
        this.A02 = new LinkedHashMap();
        this.A01 = new LinkedHashMap();
        this.A00 = new C18640tU(this, 4);
        linkedHashMap.putAll(map);
    }

    public AnonymousClass08M() {
        this.A03 = new LinkedHashMap();
        this.A04 = new LinkedHashMap();
        this.A02 = new LinkedHashMap();
        this.A01 = new LinkedHashMap();
        this.A00 = new C18640tU(this, 4);
    }
}
