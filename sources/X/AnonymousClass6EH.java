package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6EH  reason: invalid class name */
public final class AnonymousClass6EH {
    public Map A00 = AnonymousClass001.A0J();

    public AnonymousClass6X2 A00() {
        AnonymousClass6X2 r0 = new AnonymousClass6X2(this.A00);
        AnonymousClass6X2.A01(r0);
        return r0;
    }

    public void A01(String str, int i) {
        C36421kH.A1M(str, this.A00, i);
    }

    public void A02(String str, int[] iArr) {
        Map map = this.A00;
        AnonymousClass6X2 r0 = AnonymousClass6X2.A01;
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i = 0; i < length; i++) {
            AnonymousClass000.A1L(numArr, iArr[i], i);
        }
        map.put(str, numArr);
    }

    public void A03(Map map) {
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            String A0f = C90494aF.A0f(A11);
            Object value = A11.getValue();
            if (value == null) {
                this.A00.put(A0f, (Object) null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.A00.put(A0f, value);
                } else if (cls == boolean[].class) {
                    Map map2 = this.A00;
                    boolean[] zArr = (boolean[]) value;
                    AnonymousClass6X2 r0 = AnonymousClass6X2.A01;
                    int length = zArr.length;
                    Boolean[] boolArr = new Boolean[length];
                    for (int i = 0; i < length; i++) {
                        AnonymousClass000.A1N(boolArr, i, zArr[i]);
                    }
                    map2.put(A0f, boolArr);
                } else if (cls == byte[].class) {
                    Map map3 = this.A00;
                    byte[] bArr = (byte[]) value;
                    AnonymousClass6X2 r02 = AnonymousClass6X2.A01;
                    int length2 = bArr.length;
                    Byte[] bArr2 = new Byte[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        bArr2[i2] = Byte.valueOf(bArr[i2]);
                    }
                    map3.put(A0f, bArr2);
                } else if (cls == int[].class) {
                    Map map4 = this.A00;
                    int[] iArr = (int[]) value;
                    AnonymousClass6X2 r03 = AnonymousClass6X2.A01;
                    int length3 = iArr.length;
                    Integer[] numArr = new Integer[length3];
                    for (int i3 = 0; i3 < length3; i3++) {
                        AnonymousClass000.A1L(numArr, iArr[i3], i3);
                    }
                    map4.put(A0f, numArr);
                } else if (cls == long[].class) {
                    Map map5 = this.A00;
                    long[] jArr = (long[]) value;
                    AnonymousClass6X2 r04 = AnonymousClass6X2.A01;
                    int length4 = jArr.length;
                    Long[] lArr = new Long[length4];
                    for (int i4 = 0; i4 < length4; i4++) {
                        AnonymousClass000.A1M(lArr, i4, jArr[i4]);
                    }
                    map5.put(A0f, lArr);
                } else if (cls == float[].class) {
                    Map map6 = this.A00;
                    float[] fArr = (float[]) value;
                    AnonymousClass6X2 r05 = AnonymousClass6X2.A01;
                    int length5 = fArr.length;
                    Float[] fArr2 = new Float[length5];
                    for (int i5 = 0; i5 < length5; i5++) {
                        AnonymousClass000.A1I(fArr2, fArr[i5], i5);
                    }
                    map6.put(A0f, fArr2);
                } else if (cls == double[].class) {
                    Map map7 = this.A00;
                    double[] dArr = (double[]) value;
                    AnonymousClass6X2 r06 = AnonymousClass6X2.A01;
                    int length6 = dArr.length;
                    Double[] dArr2 = new Double[length6];
                    for (int i6 = 0; i6 < length6; i6++) {
                        dArr2[i6] = Double.valueOf(dArr[i6]);
                    }
                    map7.put(A0f, dArr2);
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Key ");
                    A0u.append(A0f);
                    throw C90464aC.A0P(cls, "has invalid type ", A0u);
                }
            }
        }
    }
}
