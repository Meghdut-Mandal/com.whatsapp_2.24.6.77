package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.02R  reason: invalid class name */
public abstract class AnonymousClass02R extends AnonymousClass02Q {
    public static final int A07(Object obj, Object[] objArr) {
        int i = 0;
        int length = objArr.length;
        if (obj == null) {
            while (i < length) {
                if (objArr[i] != null) {
                    i++;
                }
            }
            return -1;
        }
        while (i < length) {
            if (!obj.equals(objArr[i])) {
                i++;
            }
        }
        return -1;
        return i;
    }

    public static final Object A08(Object[] objArr, int i) {
        AnonymousClass00C.A0D(objArr, 0);
        if (i < 0 || i > objArr.length - 1) {
            return null;
        }
        return objArr[i];
    }

    public static final String A09(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Object[] objArr) {
        AnonymousClass00C.A0D(objArr, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AnonymousClass090.A00(sb, obj, (C006302t) null);
        }
        sb.append(charSequence3);
        String obj2 = sb.toString();
        AnonymousClass00C.A08(obj2);
        return obj2;
    }

    public static final List A0B(long[] jArr) {
        AnonymousClass00C.A0D(jArr, 0);
        int length = jArr.length;
        if (length == 0) {
            return C023409w.A00;
        }
        if (length != 1) {
            ArrayList arrayList = new ArrayList(length);
            int i = 0;
            do {
                arrayList.add(Long.valueOf(jArr[i]));
                i++;
            } while (i < length);
            return arrayList;
        }
        List singletonList = Collections.singletonList(Long.valueOf(jArr[0]));
        AnonymousClass00C.A08(singletonList);
        return singletonList;
    }

    public static final List A0D(Object[] objArr) {
        AnonymousClass00C.A0D(objArr, 0);
        int length = objArr.length;
        if (length == 0) {
            return C023409w.A00;
        }
        if (length != 1) {
            return new ArrayList(new AnonymousClass0CN(objArr, false));
        }
        List singletonList = Collections.singletonList(objArr[0]);
        AnonymousClass00C.A08(singletonList);
        return singletonList;
    }

    public static final Set A0E(Object[] objArr) {
        int i = 0;
        AnonymousClass00C.A0D(objArr, 0);
        int length = objArr.length;
        if (length == 0) {
            return C004702c.A00;
        }
        if (length != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(C000300d.A02(length));
            do {
                linkedHashSet.add(objArr[i]);
                i++;
            } while (i < length);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(objArr[0]);
        AnonymousClass00C.A08(singleton);
        return singleton;
    }

    public static final String A0A(C006302t r7, byte[] bArr) {
        AnonymousClass00C.A0D(bArr, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append("");
            }
            sb.append((CharSequence) r7.invoke(Byte.valueOf(b)));
        }
        sb.append("");
        String obj = sb.toString();
        AnonymousClass00C.A08(obj);
        return obj;
    }

    public static final List A0C(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean A0F(Object obj, Object[] objArr) {
        if (A07(obj, objArr) >= 0) {
            return true;
        }
        return false;
    }
}
