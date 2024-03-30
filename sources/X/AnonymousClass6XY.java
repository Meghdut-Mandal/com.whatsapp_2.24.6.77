package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.ArrayMap;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6XY  reason: invalid class name */
public final class AnonymousClass6XY {
    public static final Map A00;
    public static final Map A01;

    public static Bundle A01(AnonymousClass72K r7, Collection collection) {
        Bundle bundle = new Bundle(2);
        ArrayList A0I = AnonymousClass001.A0I();
        int i = 0;
        for (Object next : collection) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("<item ");
            A0u.append(i);
            A0I.add(A00(r7, next, AnonymousClass000.A0q(">", A0u)));
            i++;
        }
        bundle.putParcelableArrayList("tag_value", A0I);
        return bundle;
    }

    static {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Boolean.class, "bool");
        arrayMap.put(Byte.class, "byte");
        arrayMap.put(Short.class, "short");
        arrayMap.put(Integer.class, "int");
        arrayMap.put(Long.class, "long");
        arrayMap.put(Double.class, "double");
        arrayMap.put(Float.class, "float");
        arrayMap.put(String.class, "string");
        arrayMap.put(Parcelable.class, "parcelable");
        arrayMap.put(Map.class, "map");
        arrayMap.put(List.class, "list");
        arrayMap.put(IconCompat.class, "image");
        A01 = arrayMap;
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put(C36381kD.A0m(), "primitive");
        arrayMap2.put(C36361kB.A0i(), "iInterface");
        arrayMap2.put(C36401kF.A0i(), "iBinder");
        arrayMap2.put(C36361kB.A0j(), "map");
        arrayMap2.put(C36371kC.A0n(), "set");
        arrayMap2.put(C36371kC.A0o(), "list");
        arrayMap2.put(C36371kC.A0p(), "object");
        arrayMap2.put(C36381kD.A0n(), "image");
        A00 = arrayMap2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007c, code lost:
        if ((r10 instanceof java.lang.String) != false) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle A00(X.AnonymousClass72K r9, java.lang.Object r10, java.lang.String r11) {
        /*
            if (r10 == 0) goto L_0x0033
            java.util.ArrayDeque r0 = r9.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0008:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r1.next()
            X.665 r0 = (X.AnonymousClass665) r0
            java.lang.Object r0 = r0.A00
            if (r0 != r10) goto L_0x0008
            r0 = 1
        L_0x0019:
            if (r0 == 0) goto L_0x0033
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Found cycle while bundling type "
            r1.append(r0)
            X.AnonymousClass000.A1C(r10, r1)
            java.lang.String r1 = r1.toString()
            X.4gG r0 = new X.4gG
            r0.<init>(r9, r1)
            throw r0
        L_0x0031:
            r0 = 0
            goto L_0x0019
        L_0x0033:
            java.util.ArrayDeque r0 = r9.A01
            X.72K r3 = new X.72K
            r3.<init>(r10, r11, r0)
            if (r10 == 0) goto L_0x02d6
            boolean r0 = r10 instanceof androidx.core.graphics.drawable.IconCompat     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x0059
            androidx.core.graphics.drawable.IconCompat r10 = (androidx.core.graphics.drawable.IconCompat) r10     // Catch:{ all -> 0x02ef }
            r0 = 2
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02ef }
            r6.<init>(r0)     // Catch:{ all -> 0x02ef }
            java.lang.String r1 = "tag_class_type"
            r0 = 6
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02ef }
            android.os.Bundle r1 = r10.A0B()     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = "tag_value"
            r6.putBundle(r0, r1)     // Catch:{ all -> 0x02ef }
            goto L_0x02bb
        L_0x0059:
            boolean r4 = r10 instanceof java.lang.Boolean     // Catch:{ all -> 0x02ef }
            if (r4 != 0) goto L_0x007e
            boolean r0 = r10 instanceof java.lang.Byte     // Catch:{ all -> 0x02ef }
            if (r0 != 0) goto L_0x007e
            boolean r0 = r10 instanceof java.lang.Character     // Catch:{ all -> 0x02ef }
            if (r0 != 0) goto L_0x007e
            boolean r0 = r10 instanceof java.lang.Short     // Catch:{ all -> 0x02ef }
            if (r0 != 0) goto L_0x007e
            boolean r0 = r10 instanceof java.lang.Integer     // Catch:{ all -> 0x02ef }
            if (r0 != 0) goto L_0x007e
            boolean r0 = r10 instanceof java.lang.Long     // Catch:{ all -> 0x02ef }
            if (r0 != 0) goto L_0x007e
            boolean r0 = r10 instanceof java.lang.Double     // Catch:{ all -> 0x02ef }
            if (r0 != 0) goto L_0x007e
            boolean r0 = r10 instanceof java.lang.Float     // Catch:{ all -> 0x02ef }
            if (r0 != 0) goto L_0x007e
            boolean r1 = r10 instanceof java.lang.String     // Catch:{ all -> 0x02ef }
            r0 = 0
            if (r1 == 0) goto L_0x007f
        L_0x007e:
            r0 = 1
        L_0x007f:
            if (r0 != 0) goto L_0x0232
            boolean r0 = r10 instanceof android.os.Parcelable     // Catch:{ all -> 0x02ef }
            if (r0 != 0) goto L_0x0232
            boolean r0 = r10 instanceof android.os.IInterface     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x00ab
            android.os.IInterface r10 = (android.os.IInterface) r10     // Catch:{ all -> 0x02ef }
            r0 = 3
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02ef }
            r6.<init>(r0)     // Catch:{ all -> 0x02ef }
            java.lang.String r2 = X.AnonymousClass000.A0k(r10)     // Catch:{ all -> 0x02ef }
            java.lang.String r1 = "tag_class_type"
            r0 = 1
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02ef }
            android.os.IBinder r1 = r10.asBinder()     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = "tag_value"
            r6.putBinder(r0, r1)     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = "tag_class_name"
            r6.putString(r0, r2)     // Catch:{ all -> 0x02ef }
            goto L_0x02bb
        L_0x00ab:
            boolean r0 = r10 instanceof android.os.IBinder     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x00c5
            android.os.IBinder r10 = (android.os.IBinder) r10     // Catch:{ all -> 0x02ef }
            r0 = 2
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02ef }
            r6.<init>(r0)     // Catch:{ all -> 0x02ef }
            java.lang.String r1 = "tag_class_type"
            r0 = 9
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = "tag_value"
            r6.putBinder(r0, r10)     // Catch:{ all -> 0x02ef }
            goto L_0x02bb
        L_0x00c5:
            boolean r0 = r10 instanceof java.util.Map     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x013a
            java.util.Map r10 = (java.util.Map) r10     // Catch:{ all -> 0x02ef }
            r5 = 2
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02ef }
            r6.<init>(r5)     // Catch:{ all -> 0x02ef }
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x02ef }
            java.util.Iterator r11 = X.AnonymousClass000.A0y(r10)     // Catch:{ all -> 0x02ef }
            r8 = 0
        L_0x00da:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x012e
            java.util.Map$Entry r10 = X.AnonymousClass000.A11(r11)     // Catch:{ all -> 0x02ef }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x02ef }
            r7.<init>(r5)     // Catch:{ all -> 0x02ef }
            java.lang.Object r2 = r10.getKey()     // Catch:{ all -> 0x02ef }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = "<key "
            r1.append(r0)     // Catch:{ all -> 0x02ef }
            r1.append(r8)     // Catch:{ all -> 0x02ef }
            java.lang.String r9 = ">"
            java.lang.String r0 = X.AnonymousClass000.A0q(r9, r1)     // Catch:{ all -> 0x02ef }
            android.os.Bundle r1 = A00(r3, r2, r0)     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = "tag_1"
            r7.putBundle(r0, r1)     // Catch:{ all -> 0x02ef }
            java.lang.Object r0 = r10.getValue()     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x0128
            java.lang.Object r2 = r10.getValue()     // Catch:{ all -> 0x02ef }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = "<value "
            X.C36351kA.A1M(r0, r9, r1, r8)     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02ef }
            android.os.Bundle r1 = A00(r3, r2, r0)     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = "tag_2"
            r7.putBundle(r0, r1)     // Catch:{ all -> 0x02ef }
        L_0x0128:
            int r8 = r8 + 1
            r4.add(r7)     // Catch:{ all -> 0x02ef }
            goto L_0x00da
        L_0x012e:
            java.lang.String r0 = "tag_class_type"
            r6.putInt(r0, r5)     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = "tag_value"
            r6.putParcelableArrayList(r0, r4)     // Catch:{ all -> 0x02ef }
            goto L_0x02bb
        L_0x013a:
            boolean r0 = r10 instanceof java.util.List     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x014c
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x02ef }
            android.os.Bundle r6 = A01(r3, r10)     // Catch:{ all -> 0x02ef }
            java.lang.String r1 = "tag_class_type"
            r0 = 4
        L_0x0147:
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02ef }
            goto L_0x02bb
        L_0x014c:
            boolean r0 = r10 instanceof java.util.Set     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x015a
            java.util.Set r10 = (java.util.Set) r10     // Catch:{ all -> 0x02ef }
            android.os.Bundle r6 = A01(r3, r10)     // Catch:{ all -> 0x02ef }
            java.lang.String r1 = "tag_class_type"
            r0 = 3
            goto L_0x0147
        L_0x015a:
            java.lang.Class r2 = r10.getClass()     // Catch:{ all -> 0x02ef }
            boolean r0 = r2.isEnum()     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x0199
            r0 = 3
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02ef }
            r6.<init>(r0)     // Catch:{ all -> 0x02ef }
            java.lang.String r1 = "tag_class_type"
            r0 = 7
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = "name"
            java.lang.reflect.Method r1 = A04(r3, r2, r0)     // Catch:{ all -> 0x02ef }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ ReflectiveOperationException -> 0x018f }
            java.lang.Object r1 = r1.invoke(r10, r0)     // Catch:{ ReflectiveOperationException -> 0x018f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ReflectiveOperationException -> 0x018f }
            java.lang.String r0 = "tag_value"
            r6.putString(r0, r1)     // Catch:{ all -> 0x02ef }
            java.lang.String r1 = r2.getName()     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = "tag_class_name"
            r6.putString(r0, r1)     // Catch:{ all -> 0x02ef }
            goto L_0x02bb
        L_0x018f:
            r2 = move-exception
            java.lang.String r0 = "Enum missing name method"
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x02ef }
            r1.<init>(r3, r0, r2)     // Catch:{ all -> 0x02ef }
            goto L_0x02ee
        L_0x0199:
            boolean r0 = r10 instanceof java.lang.Class     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x01b7
            java.lang.Class r10 = (java.lang.Class) r10     // Catch:{ all -> 0x02ef }
            r0 = 2
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02ef }
            r6.<init>(r0)     // Catch:{ all -> 0x02ef }
            java.lang.String r1 = "tag_class_type"
            r0 = 8
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02ef }
            java.lang.String r1 = r10.getName()     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = "tag_value"
            r6.putString(r0, r1)     // Catch:{ all -> 0x02ef }
            goto L_0x02bb
        L_0x01b7:
            boolean r0 = r2.isArray()     // Catch:{ all -> 0x02ef }
            if (r0 != 0) goto L_0x0229
            java.lang.String r4 = r2.getName()     // Catch:{ all -> 0x02ef }
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x0217 }
            r2.getDeclaredConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x0217 }
            java.util.ArrayList r2 = A05(r2)     // Catch:{ all -> 0x02ef }
            int r0 = r2.size()     // Catch:{ all -> 0x02ef }
            int r0 = r0 + 2
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02ef }
            r6.<init>(r0)     // Catch:{ all -> 0x02ef }
            r1 = 5
            java.lang.String r0 = "tag_class_type"
            r6.putInt(r0, r1)     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = "tag_class_name"
            r6.putString(r0, r4)     // Catch:{ all -> 0x02ef }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ all -> 0x02ef }
        L_0x01e5:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x02bb
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x02ef }
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch:{ all -> 0x02ef }
            r0 = 1
            r2.setAccessible(r0)     // Catch:{ all -> 0x02ef }
            java.lang.Class r0 = r2.getDeclaringClass()     // Catch:{ all -> 0x02ef }
            java.lang.String r1 = r0.getName()     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x02ef }
            java.lang.String r4 = X.C36321k7.A0D(r1, r0)     // Catch:{ all -> 0x02ef }
            java.lang.Object r1 = r2.get(r10)     // Catch:{ IllegalAccessException -> 0x02de }
            if (r1 == 0) goto L_0x01e5
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x02ef }
            android.os.Bundle r0 = A00(r3, r1, r0)     // Catch:{ all -> 0x02ef }
            r6.putParcelable(r4, r0)     // Catch:{ all -> 0x02ef }
            goto L_0x01e5
        L_0x0217:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = "Class to deserialize is missing a no args constructor: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r1)     // Catch:{ all -> 0x02ef }
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x02ef }
            r1.<init>(r3, r0, r2)     // Catch:{ all -> 0x02ef }
            goto L_0x02ee
        L_0x0229:
            java.lang.String r0 = "Object serializing contains an array, use a list or a set instead"
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x02ef }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x02ef }
            goto L_0x02ee
        L_0x0232:
            r0 = 2
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02ef }
            r6.<init>(r0)     // Catch:{ all -> 0x02ef }
            java.lang.String r1 = "tag_class_type"
            r0 = 0
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02ef }
            java.lang.String r2 = "tag_value"
            if (r4 == 0) goto L_0x024a
            boolean r0 = X.AnonymousClass000.A1X(r10)     // Catch:{ all -> 0x02ef }
            r6.putBoolean(r2, r0)     // Catch:{ all -> 0x02ef }
            goto L_0x02bb
        L_0x024a:
            boolean r0 = r10 instanceof java.lang.Byte     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x0258
            java.lang.Byte r10 = (java.lang.Byte) r10     // Catch:{ all -> 0x02ef }
            byte r0 = r10.byteValue()     // Catch:{ all -> 0x02ef }
            r6.putByte(r2, r0)     // Catch:{ all -> 0x02ef }
            goto L_0x02bb
        L_0x0258:
            boolean r0 = r10 instanceof java.lang.Character     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x0266
            java.lang.Character r10 = (java.lang.Character) r10     // Catch:{ all -> 0x02ef }
            char r0 = r10.charValue()     // Catch:{ all -> 0x02ef }
            r6.putChar(r2, r0)     // Catch:{ all -> 0x02ef }
            goto L_0x02bb
        L_0x0266:
            boolean r0 = r10 instanceof java.lang.Short     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x0274
            java.lang.Short r10 = (java.lang.Short) r10     // Catch:{ all -> 0x02ef }
            short r0 = r10.shortValue()     // Catch:{ all -> 0x02ef }
            r6.putShort(r2, r0)     // Catch:{ all -> 0x02ef }
            goto L_0x02bb
        L_0x0274:
            boolean r0 = r10 instanceof java.lang.Integer     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x0280
            int r0 = X.C90514aH.A0H(r10)     // Catch:{ all -> 0x02ef }
            r6.putInt(r2, r0)     // Catch:{ all -> 0x02ef }
            goto L_0x02bb
        L_0x0280:
            boolean r0 = r10 instanceof java.lang.Long     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x028c
            long r0 = X.C90524aI.A07(r10)     // Catch:{ all -> 0x02ef }
            r6.putLong(r2, r0)     // Catch:{ all -> 0x02ef }
            goto L_0x02bb
        L_0x028c:
            boolean r0 = r10 instanceof java.lang.Double     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x029a
            java.lang.Double r10 = (java.lang.Double) r10     // Catch:{ all -> 0x02ef }
            double r0 = r10.doubleValue()     // Catch:{ all -> 0x02ef }
            r6.putDouble(r2, r0)     // Catch:{ all -> 0x02ef }
            goto L_0x02bb
        L_0x029a:
            boolean r0 = r10 instanceof java.lang.Float     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x02a8
            java.lang.Float r10 = (java.lang.Float) r10     // Catch:{ all -> 0x02ef }
            float r0 = r10.floatValue()     // Catch:{ all -> 0x02ef }
            r6.putFloat(r2, r0)     // Catch:{ all -> 0x02ef }
            goto L_0x02bb
        L_0x02a8:
            boolean r0 = r10 instanceof java.lang.String     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x02b2
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x02ef }
            r6.putString(r2, r10)     // Catch:{ all -> 0x02ef }
            goto L_0x02bb
        L_0x02b2:
            boolean r0 = r10 instanceof android.os.Parcelable     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x02bf
            android.os.Parcelable r10 = (android.os.Parcelable) r10     // Catch:{ all -> 0x02ef }
            r6.putParcelable(r2, r10)     // Catch:{ all -> 0x02ef }
        L_0x02bb:
            r3.close()
            return r6
        L_0x02bf:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = "Unsupported primitive type: "
            r1.append(r0)     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = X.AnonymousClass000.A0k(r10)     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x02ef }
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x02ef }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x02ef }
            goto L_0x02ee
        L_0x02d6:
            java.lang.String r0 = "Bundling of null object is not supported"
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x02ef }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x02ef }
            goto L_0x02ee
        L_0x02de:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02ef }
            java.lang.String r0 = "Field is not accessible: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r1)     // Catch:{ all -> 0x02ef }
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x02ef }
            r1.<init>(r3, r0, r2)     // Catch:{ all -> 0x02ef }
        L_0x02ee:
            throw r1     // Catch:{ all -> 0x02ef }
        L_0x02ef:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x02f4 }
            throw r1
        L_0x02f4:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XY.A00(X.72K, java.lang.Object, java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x035e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0362, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0363, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0364, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0367, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1 = new X.C93264gH(r2, X.AnonymousClass000.A0p("Method to create IInterface from a Binder is not accessible for interface: ", r4, X.AnonymousClass000.A0u()), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        r1 = new X.C93264gH(r2, X.AnonymousClass000.A0p("Binder for unknown IInterface: ", r4, X.AnonymousClass000.A0u()), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0235, code lost:
        r3.A06 = r0;
        r3 = r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0030, B:14:0x004f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A02(android.os.Bundle r10, X.AnonymousClass72K r11) {
        /*
            java.lang.Class<X.6XY> r0 = X.AnonymousClass6XY.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.Objects.requireNonNull(r0)
            r10.setClassLoader(r0)
            java.lang.String r0 = "tag_class_type"
            int r3 = r10.getInt(r0)
            int r1 = r10.getInt(r0)
            java.util.Map r0 = A00
            java.lang.Object r1 = X.C36371kC.A0r(r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = "unknown"
        L_0x0022:
            java.util.ArrayDeque r0 = r11.A01
            X.72K r2 = new X.72K
            r2.<init>(r10, r1, r0)
            switch(r3) {
                case 0: goto L_0x002e;
                case 1: goto L_0x003f;
                case 2: goto L_0x00a2;
                case 3: goto L_0x0317;
                case 4: goto L_0x031c;
                case 5: goto L_0x00f0;
                case 6: goto L_0x01bd;
                case 7: goto L_0x0242;
                case 8: goto L_0x02e1;
                case 9: goto L_0x0307;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x034e
        L_0x002e:
            java.lang.String r0 = "tag_value"
            java.lang.Object r3 = r10.get(r0)     // Catch:{ all -> 0x035e }
            if (r3 != 0) goto L_0x0342
            java.lang.String r0 = "Bundle is missing the primitive value"
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x003f:
            java.lang.String r0 = "tag_value"
            android.os.IBinder r5 = r10.getBinder(r0)     // Catch:{ all -> 0x035e }
            if (r5 == 0) goto L_0x0099
            java.lang.String r0 = "tag_class_name"
            java.lang.String r4 = r10.getString(r0)     // Catch:{ all -> 0x035e }
            if (r4 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x007e, ReflectiveOperationException -> 0x006c }
            java.lang.String r0 = "asInterface"
            java.lang.reflect.Method r3 = A04(r2, r1, r0)     // Catch:{ ClassNotFoundException -> 0x007e, ReflectiveOperationException -> 0x006c }
            r1 = 0
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r5)     // Catch:{ ClassNotFoundException -> 0x007e, ReflectiveOperationException -> 0x006c }
            java.lang.Object r3 = r3.invoke(r1, r0)     // Catch:{ ClassNotFoundException -> 0x007e, ReflectiveOperationException -> 0x006c }
            if (r3 != 0) goto L_0x0342
            java.lang.String r1 = "Failed to get interface from binder"
            X.4gH r0 = new X.4gH     // Catch:{ ClassNotFoundException -> 0x007e, ReflectiveOperationException -> 0x006c }
            r0.<init>(r2, r1)     // Catch:{ ClassNotFoundException -> 0x007e, ReflectiveOperationException -> 0x006c }
            throw r0     // Catch:{ ClassNotFoundException -> 0x007e, ReflectiveOperationException -> 0x006c }
        L_0x006c:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "Method to create IInterface from a Binder is not accessible for interface: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r1)     // Catch:{ all -> 0x035e }
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x007e:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "Binder for unknown IInterface: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r1)     // Catch:{ all -> 0x035e }
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x0090:
            java.lang.String r0 = "Bundle is missing IInterface class name"
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x0099:
            java.lang.String r0 = "Bundle is missing the binder"
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x00a2:
            java.lang.String r0 = "tag_value"
            java.util.ArrayList r0 = r10.getParcelableArrayList(r0)     // Catch:{ all -> 0x035e }
            if (r0 == 0) goto L_0x00e7
            java.util.HashMap r3 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x035e }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x035e }
        L_0x00b2:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x035e }
            if (r0 == 0) goto L_0x0342
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x035e }
            android.os.Parcelable r4 = (android.os.Parcelable) r4     // Catch:{ all -> 0x035e }
            android.os.Bundle r4 = (android.os.Bundle) r4     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "tag_1"
            android.os.Bundle r1 = r4.getBundle(r0)     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "tag_2"
            android.os.Bundle r0 = r4.getBundle(r0)     // Catch:{ all -> 0x035e }
            if (r1 == 0) goto L_0x00de
            java.lang.Object r1 = A02(r1, r2)     // Catch:{ all -> 0x035e }
            if (r0 != 0) goto L_0x00d6
            r0 = 0
            goto L_0x00da
        L_0x00d6:
            java.lang.Object r0 = A02(r0, r2)     // Catch:{ all -> 0x035e }
        L_0x00da:
            r3.put(r1, r0)     // Catch:{ all -> 0x035e }
            goto L_0x00b2
        L_0x00de:
            java.lang.String r0 = "Bundle is missing key"
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x00e7:
            java.lang.String r0 = "Bundle is missing the map"
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x00f0:
            java.lang.String r6 = "CarApp.Bun"
            java.lang.String r0 = "tag_class_name"
            java.lang.String r4 = r10.getString(r0)     // Catch:{ all -> 0x035e }
            if (r4 == 0) goto L_0x01b4
            java.lang.Class r7 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            r3 = 0
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            java.lang.reflect.Constructor r1 = r7.getDeclaredConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            r5 = 1
            r1.setAccessible(r5)     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            java.lang.Object r3 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            java.util.ArrayList r0 = A05(r7)     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
        L_0x0117:
            boolean r0 = r9.hasNext()     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            if (r0 == 0) goto L_0x0342
            java.lang.Object r7 = r9.next()     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            r7.setAccessible(r5)     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            java.lang.Class r0 = r7.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            java.lang.String r1 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            java.lang.String r0 = r7.getName()     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            java.lang.String r8 = X.C36321k7.A0D(r1, r0)     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            java.lang.Object r1 = r10.get(r8)     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            if (r1 != 0) goto L_0x0148
            java.lang.String r1 = "androidx.core.graphics.drawable.IconCompat"
            java.lang.String r0 = "android.support.v4.graphics.drawable.IconCompat"
            java.lang.String r0 = r8.replaceAll(r1, r0)     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            java.lang.Object r1 = r10.get(r0)     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
        L_0x0148:
            boolean r0 = r1 instanceof android.os.Bundle     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            if (r0 == 0) goto L_0x0156
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            java.lang.Object r0 = A02(r1, r2)     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            r7.set(r3, r0)     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            goto L_0x0117
        L_0x0156:
            if (r1 != 0) goto L_0x0117
            boolean r0 = X.C90494aF.A1a(r6)     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            if (r0 == 0) goto L_0x0117
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            java.lang.String r0 = "Value is null for field: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r7, r0, r1)     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            android.util.Log.d(r6, r0)     // Catch:{ ClassNotFoundException -> 0x01a2, NoSuchMethodException -> 0x0190, ReflectiveOperationException -> 0x017e, IllegalArgumentException -> 0x016c }
            goto L_0x0117
        L_0x016c:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "Failed to deserialize class: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r1)     // Catch:{ all -> 0x035e }
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x017e:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "Constructor or field is not accessible: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r1)     // Catch:{ all -> 0x035e }
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x0190:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "Object missing no args constructor: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r1)     // Catch:{ all -> 0x035e }
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x01a2:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "Object for unknown class: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r1)     // Catch:{ all -> 0x035e }
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x01b4:
            java.lang.String r0 = "Bundle is missing the class name"
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x01bd:
            java.lang.String r0 = "tag_value"
            android.os.Bundle r5 = r10.getBundle(r0)     // Catch:{ all -> 0x035e }
            if (r5 == 0) goto L_0x0239
            java.lang.String r0 = "type"
            int r4 = r5.getInt(r0)     // Catch:{ all -> 0x035e }
            androidx.core.graphics.drawable.IconCompat r3 = new androidx.core.graphics.drawable.IconCompat     // Catch:{ all -> 0x035e }
            r3.<init>(r4)     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "int1"
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x035e }
            r3.A00 = r0     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "int2"
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x035e }
            r3.A01 = r0     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "string1"
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x035e }
            r3.A07 = r0     // Catch:{ all -> 0x035e }
            java.lang.String r1 = "tint_list"
            boolean r0 = r5.containsKey(r1)     // Catch:{ all -> 0x035e }
            if (r0 == 0) goto L_0x01f8
            android.os.Parcelable r0 = r5.getParcelable(r1)     // Catch:{ all -> 0x035e }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x035e }
            r3.A03 = r0     // Catch:{ all -> 0x035e }
        L_0x01f8:
            java.lang.String r1 = "tint_mode"
            boolean r0 = r5.containsKey(r1)     // Catch:{ all -> 0x035e }
            if (r0 == 0) goto L_0x020a
            java.lang.String r0 = r5.getString(r1)     // Catch:{ all -> 0x035e }
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.valueOf(r0)     // Catch:{ all -> 0x035e }
            r3.A04 = r0     // Catch:{ all -> 0x035e }
        L_0x020a:
            java.lang.String r0 = "obj"
            switch(r4) {
                case -1: goto L_0x0227;
                case 0: goto L_0x020f;
                case 1: goto L_0x0227;
                case 2: goto L_0x022c;
                case 3: goto L_0x0231;
                case 4: goto L_0x022c;
                case 5: goto L_0x0227;
                case 6: goto L_0x022c;
                default: goto L_0x020f;
            }     // Catch:{ all -> 0x035e }
        L_0x020f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "Unknown type "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r4)     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "IconCompat"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "Failed to create IconCompat from bundle"
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x0227:
            android.os.Parcelable r0 = r5.getParcelable(r0)     // Catch:{ all -> 0x035e }
            goto L_0x0235
        L_0x022c:
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x035e }
            goto L_0x0235
        L_0x0231:
            byte[] r0 = r5.getByteArray(r0)     // Catch:{ all -> 0x035e }
        L_0x0235:
            r3.A06 = r0     // Catch:{ all -> 0x035e }
            goto L_0x0342
        L_0x0239:
            java.lang.String r0 = "IconCompat bundle is null"
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x0242:
            java.lang.String r0 = "tag_value"
            java.lang.String r6 = r10.getString(r0)     // Catch:{ all -> 0x035e }
            java.lang.String r5 = "]"
            if (r6 == 0) goto L_0x02ce
            java.lang.String r0 = "tag_class_name"
            java.lang.String r4 = r10.getString(r0)     // Catch:{ all -> 0x035e }
            if (r4 == 0) goto L_0x02ba
            java.lang.Class r1 = java.lang.Class.forName(r4)     // Catch:{ IllegalArgumentException -> 0x029d, ClassNotFoundException -> 0x0283, ReflectiveOperationException -> 0x0269 }
            java.lang.String r0 = "valueOf"
            java.lang.reflect.Method r3 = A04(r2, r1, r0)     // Catch:{ IllegalArgumentException -> 0x029d, ClassNotFoundException -> 0x0283, ReflectiveOperationException -> 0x0269 }
            r1 = 0
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r6)     // Catch:{ IllegalArgumentException -> 0x029d, ClassNotFoundException -> 0x0283, ReflectiveOperationException -> 0x0269 }
            java.lang.Object r3 = r3.invoke(r1, r0)     // Catch:{ IllegalArgumentException -> 0x029d, ClassNotFoundException -> 0x0283, ReflectiveOperationException -> 0x0269 }
            goto L_0x0342
        L_0x0269:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "Enum of class ["
            r1.append(r0)     // Catch:{ all -> 0x035e }
            r1.append(r4)     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "] missing valueOf method"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x035e }
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x0283:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "Enum class ["
            r1.append(r0)     // Catch:{ all -> 0x035e }
            r1.append(r4)     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "] not found"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x035e }
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x029d:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "Enum value ["
            r1.append(r0)     // Catch:{ all -> 0x035e }
            r1.append(r6)     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "] does not exist in enum class ["
            X.AnonymousClass000.A1D(r0, r4, r5, r1)     // Catch:{ all -> 0x035e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x035e }
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x02ba:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "Missing enum className ["
            X.AnonymousClass000.A1D(r0, r4, r5, r1)     // Catch:{ all -> 0x035e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x035e }
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x02ce:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "Missing enum name ["
            X.AnonymousClass000.A1D(r0, r6, r5, r1)     // Catch:{ all -> 0x035e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x035e }
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x02e1:
            java.lang.String r0 = "tag_value"
            java.lang.String r4 = r10.getString(r0)     // Catch:{ all -> 0x035e }
            if (r4 == 0) goto L_0x02ff
            java.lang.Class r3 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x02ee }
            goto L_0x0342
        L_0x02ee:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "Class name is unknown: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r1)     // Catch:{ all -> 0x035e }
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x02ff:
            java.lang.String r0 = "Class is missing the class name"
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x0307:
            java.lang.String r0 = "tag_value"
            android.os.IBinder r3 = r10.getBinder(r0)     // Catch:{ all -> 0x035e }
            if (r3 != 0) goto L_0x0342
            java.lang.String r0 = "Bundle is missing the binder"
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x0317:
            java.util.HashSet r3 = X.C36441kJ.A16()     // Catch:{ all -> 0x035e }
            goto L_0x0320
        L_0x031c:
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x035e }
        L_0x0320:
            java.lang.String r0 = "tag_value"
            java.util.ArrayList r0 = r10.getParcelableArrayList(r0)     // Catch:{ all -> 0x035e }
            if (r0 == 0) goto L_0x0346
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x035e }
        L_0x032c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x035e }
            if (r0 == 0) goto L_0x0342
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x035e }
            android.os.Parcelable r0 = (android.os.Parcelable) r0     // Catch:{ all -> 0x035e }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ all -> 0x035e }
            java.lang.Object r0 = A02(r0, r2)     // Catch:{ all -> 0x035e }
            r3.add(r0)     // Catch:{ all -> 0x035e }
            goto L_0x032c
        L_0x0342:
            r2.close()
            return r3
        L_0x0346:
            java.lang.String r0 = "Bundle is missing the collection"
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x035e }
            goto L_0x035d
        L_0x034e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035e }
            java.lang.String r0 = "Unsupported class type in bundle: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r3)     // Catch:{ all -> 0x035e }
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x035e }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x035e }
        L_0x035d:
            throw r1     // Catch:{ all -> 0x035e }
        L_0x035e:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0363 }
            throw r1
        L_0x0363:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XY.A02(android.os.Bundle, X.72K):java.lang.Object");
    }

    public static String A03(Class cls) {
        String A1A = C36431kI.A1A(cls, A01);
        if (A1A != null) {
            return A1A;
        }
        if (List.class.isAssignableFrom(cls)) {
            return "<List>";
        }
        if (Map.class.isAssignableFrom(cls)) {
            return "<Map>";
        }
        if (Set.class.isAssignableFrom(cls)) {
            return "<Set>";
        }
        return cls.getSimpleName();
    }

    public static Method A04(AnonymousClass72K r5, Class cls, String str) {
        if (cls == null || cls == Object.class) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("No method ");
            A0u.append(str);
            throw new C93264gH(r5, AnonymousClass000.A0l(cls, " in class ", A0u));
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return A04(r5, cls.getSuperclass(), str);
    }

    public static ArrayList A05(Class cls) {
        ArrayList A0I = AnonymousClass001.A0I();
        if (!(cls == null || cls == Object.class)) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    A0I.add(field);
                }
            }
            A0I.addAll(A05(cls.getSuperclass()));
        }
        return A0I;
    }
}
