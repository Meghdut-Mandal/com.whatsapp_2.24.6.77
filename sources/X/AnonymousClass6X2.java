package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6X2  reason: invalid class name */
public final class AnonymousClass6X2 {
    public static final AnonymousClass6X2 A01 = new AnonymousClass6EH().A00();
    public static final String A02 = AnonymousClass6VD.A01("Data");
    public Map A00;

    public boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                Map map = this.A00;
                Set keySet = map.keySet();
                Map map2 = ((AnonymousClass6X2) obj).A00;
                if (keySet.equals(map2.keySet())) {
                    for (Object next : keySet) {
                        Object obj2 = map.get(next);
                        Object obj3 = map2.get(next);
                        if (obj2 != null) {
                            if (obj3 != null) {
                                if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                                    equals = obj2.equals(obj3);
                                } else {
                                    equals = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                                }
                                if (!equals) {
                                }
                            }
                        } else if (obj2 == obj3) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041 A[SYNTHETIC, Splitter:B:20:0x0041] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass6X2 A00(byte[] r6) {
        /*
            java.lang.String r3 = "Error in Data#fromByteArray: "
            int r1 = r6.length
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r0) goto L_0x0071
            java.util.HashMap r5 = X.AnonymousClass001.A0J()
            java.io.ByteArrayInputStream r6 = X.C90524aI.A0P(r6)
            r1 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x0038, all -> 0x0036 }
            r4.<init>(r6)     // Catch:{ IOException | ClassNotFoundException -> 0x0038, all -> 0x0036 }
            int r2 = r4.readInt()     // Catch:{ IOException | ClassNotFoundException -> 0x0034 }
        L_0x0019:
            if (r2 <= 0) goto L_0x0029
            java.lang.String r1 = r4.readUTF()     // Catch:{ IOException | ClassNotFoundException -> 0x0034 }
            java.lang.Object r0 = r4.readObject()     // Catch:{ IOException | ClassNotFoundException -> 0x0034 }
            r5.put(r1, r0)     // Catch:{ IOException | ClassNotFoundException -> 0x0034 }
            int r2 = r2 + -1
            goto L_0x0019
        L_0x0029:
            r4.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x0049
        L_0x002d:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
            goto L_0x0049
        L_0x0034:
            r0 = move-exception
            goto L_0x003a
        L_0x0036:
            r2 = move-exception
            goto L_0x0066
        L_0x0038:
            r0 = move-exception
            r4 = r1
        L_0x003a:
            java.lang.String r1 = A02     // Catch:{ all -> 0x0059 }
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0049
            r4.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x0049
        L_0x0045:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
        L_0x0049:
            r6.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x0053
        L_0x004d:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x0053:
            X.6X2 r0 = new X.6X2
            r0.<init>((java.util.Map) r5)
            return r0
        L_0x0059:
            r2 = move-exception
            if (r4 == 0) goto L_0x0066
            r4.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0066
        L_0x0060:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x0066:
            r6.close()     // Catch:{ IOException -> 0x006a }
            throw r2
        L_0x006a:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
            throw r2
        L_0x0071:
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A09(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6X2.A00(byte[]):X.6X2");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069 A[SYNTHETIC, Splitter:B:28:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0081 A[SYNTHETIC, Splitter:B:42:0x0081] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01(X.AnonymousClass6X2 r7) {
        /*
            java.lang.String r3 = "Error in Data#toByteArray: "
            java.io.ByteArrayOutputStream r4 = X.C90524aI.A0Q()
            r6 = 0
            java.io.ObjectOutputStream r5 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x005d }
            r5.<init>(r4)     // Catch:{ IOException -> 0x005d }
            java.util.Map r1 = r7.A00     // Catch:{ IOException -> 0x005a, all -> 0x007d }
            int r0 = r1.size()     // Catch:{ IOException -> 0x005a, all -> 0x007d }
            r5.writeInt(r0)     // Catch:{ IOException -> 0x005a, all -> 0x007d }
            java.util.Iterator r2 = X.AnonymousClass000.A0y(r1)     // Catch:{ IOException -> 0x005a, all -> 0x007d }
        L_0x0019:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x005a, all -> 0x007d }
            if (r0 == 0) goto L_0x0032
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r2)     // Catch:{ IOException -> 0x005a, all -> 0x007d }
            java.lang.String r0 = X.C90494aF.A0f(r1)     // Catch:{ IOException -> 0x005a, all -> 0x007d }
            r5.writeUTF(r0)     // Catch:{ IOException -> 0x005a, all -> 0x007d }
            java.lang.Object r0 = r1.getValue()     // Catch:{ IOException -> 0x005a, all -> 0x007d }
            r5.writeObject(r0)     // Catch:{ IOException -> 0x005a, all -> 0x007d }
            goto L_0x0019
        L_0x0032:
            r5.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x003c
        L_0x0036:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x003c:
            r4.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0046
        L_0x0040:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x0046:
            int r1 = r4.size()
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r0) goto L_0x0053
            byte[] r2 = r4.toByteArray()
            return r2
        L_0x0053:
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A09(r0)
            throw r2
        L_0x005a:
            r0 = move-exception
            r6 = r5
            goto L_0x005e
        L_0x005d:
            r0 = move-exception
        L_0x005e:
            java.lang.String r1 = A02     // Catch:{ all -> 0x007b }
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x007b }
            byte[] r2 = r4.toByteArray()     // Catch:{ all -> 0x007b }
            if (r6 == 0) goto L_0x0071
            r6.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x0071
        L_0x006d:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
        L_0x0071:
            r4.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x007a
        L_0x0075:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
            return r2
        L_0x007a:
            return r2
        L_0x007b:
            r2 = move-exception
            goto L_0x007f
        L_0x007d:
            r2 = move-exception
            r6 = r5
        L_0x007f:
            if (r6 == 0) goto L_0x008b
            r6.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x008b
        L_0x0085:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x008b:
            r4.close()     // Catch:{ IOException -> 0x008f }
            throw r2
        L_0x008f:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6X2.A01(X.6X2):byte[]");
    }

    public int A02(String str, int i) {
        Object obj = this.A00.get(str);
        if (obj instanceof Integer) {
            return AnonymousClass000.A0I(obj);
        }
        return i;
    }

    public String A03() {
        return C90474aD.A0c("delete_action", this.A00);
    }

    public int[] A04(String str) {
        Object obj = this.A00.get(str);
        if (!(obj instanceof Integer[])) {
            return null;
        }
        Integer[] numArr = (Integer[]) obj;
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = C90524aI.A06(numArr, i);
        }
        return iArr;
    }

    public int hashCode() {
        return this.A00.hashCode() * 31;
    }

    public String toString() {
        StringBuilder A0i = C90524aI.A0i("Data {");
        Map map = this.A00;
        if (!map.isEmpty()) {
            Iterator A10 = AnonymousClass000.A10(map);
            while (A10.hasNext()) {
                String A0C = AnonymousClass001.A0C(A10);
                A0i.append(A0C);
                A0i.append(" : ");
                Object obj = map.get(A0C);
                if (obj instanceof Object[]) {
                    C90514aH.A1T(A0i, (Object[]) obj);
                } else {
                    A0i.append(obj);
                }
                C90504aG.A1M(A0i);
            }
        }
        return AnonymousClass000.A0q("}", A0i);
    }

    public AnonymousClass6X2(AnonymousClass6X2 r3) {
        this.A00 = new HashMap(r3.A00);
    }

    public AnonymousClass6X2() {
    }

    public AnonymousClass6X2(Map map) {
        this.A00 = new HashMap(map);
    }
}
