package X;

import android.os.Parcel;
import org.microg.safeparcel.SafeParcelable;

public abstract class AZS implements SafeParcelable {
    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        r8.setAccessible(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d9, code lost:
        r6.writeInt(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0200, code lost:
        if (r0 == null) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0202, code lost:
        r1 = A00(r6, r1);
        r6.writeStrongBinder(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0219, code lost:
        A01(r6, r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0220 A[Catch:{ Exception -> 0x022f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToParcel(android.os.Parcel r19, int r20) {
        /*
            r18 = this;
            r7 = r18
            java.util.Objects.requireNonNull(r7)
            java.lang.Class r17 = r7.getClass()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = -45243(0xffffffffffff4f45, float:NaN)
            r6 = r19
            r6.writeInt(r0)
            r6.writeInt(r1)
            int r16 = r6.dataPosition()
        L_0x001b:
            if (r17 == 0) goto L_0x0249
            java.lang.reflect.Field[] r5 = r17.getDeclaredFields()
            int r4 = r5.length
            r3 = 0
        L_0x0023:
            if (r3 >= r4) goto L_0x0243
            r8 = r5[r3]
            java.lang.Class<org.microg.safeparcel.SafeParcelable$Field> r2 = org.microg.safeparcel.SafeParcelable.Field.class
            boolean r0 = r8.isAnnotationPresent(r2)
            if (r0 == 0) goto L_0x023f
            java.lang.annotation.Annotation r0 = r8.getAnnotation(r2)     // Catch:{ Exception -> 0x022f }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x022f }
            if (r0 == 0) goto L_0x0225
            int r1 = r0.value()     // Catch:{ Exception -> 0x022f }
            java.lang.annotation.Annotation r0 = r8.getAnnotation(r2)     // Catch:{ Exception -> 0x022f }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x022f }
            if (r0 == 0) goto L_0x022a
            boolean r10 = r0.mayNull()     // Catch:{ Exception -> 0x022f }
            boolean r2 = r8.isAccessible()     // Catch:{ Exception -> 0x022f }
            r0 = 1
            r8.setAccessible(r0)     // Catch:{ Exception -> 0x022f }
            java.lang.Integer r0 = X.C112055dH.A00(r8)     // Catch:{ Exception -> 0x022f }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x022f }
            r11 = r20
            switch(r0) {
                case 0: goto L_0x020a;
                case 1: goto L_0x01fa;
                case 2: goto L_0x01df;
                case 3: goto L_0x0174;
                case 4: goto L_0x0152;
                case 5: goto L_0x0110;
                case 6: goto L_0x00ff;
                case 7: goto L_0x00ee;
                case 8: goto L_0x01ef;
                case 9: goto L_0x00dd;
                case 10: goto L_0x00c7;
                case 11: goto L_0x00b1;
                case 12: goto L_0x009e;
                case 13: goto L_0x0088;
                case 14: goto L_0x0072;
                case 15: goto L_0x0061;
                case 16: goto L_0x0163;
                default: goto L_0x005c;
            }     // Catch:{ Exception -> 0x022f }
        L_0x005c:
            r8.setAccessible(r2)     // Catch:{ Exception -> 0x022f }
            goto L_0x023f
        L_0x0061:
            java.lang.Object r0 = r8.get(r7)     // Catch:{ Exception -> 0x022f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x022f }
            if (r0 == 0) goto L_0x021e
            int r1 = A00(r6, r1)     // Catch:{ Exception -> 0x022f }
            r6.writeString(r0)     // Catch:{ Exception -> 0x022f }
            goto L_0x0219
        L_0x0072:
            java.lang.Object r9 = r8.get(r7)     // Catch:{ Exception -> 0x022f }
            java.lang.Double r9 = (java.lang.Double) r9     // Catch:{ Exception -> 0x022f }
            if (r9 == 0) goto L_0x005c
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r6.writeInt(r1)     // Catch:{ Exception -> 0x022f }
            double r0 = r9.doubleValue()     // Catch:{ Exception -> 0x022f }
            r6.writeDouble(r0)     // Catch:{ Exception -> 0x022f }
            goto L_0x005c
        L_0x0088:
            java.lang.Object r9 = r8.get(r7)     // Catch:{ Exception -> 0x022f }
            java.lang.Float r9 = (java.lang.Float) r9     // Catch:{ Exception -> 0x022f }
            if (r9 == 0) goto L_0x005c
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r6.writeInt(r1)     // Catch:{ Exception -> 0x022f }
            float r0 = r9.floatValue()     // Catch:{ Exception -> 0x022f }
            r6.writeFloat(r0)     // Catch:{ Exception -> 0x022f }
            goto L_0x005c
        L_0x009e:
            java.lang.Object r9 = r8.get(r7)     // Catch:{ Exception -> 0x022f }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ Exception -> 0x022f }
            if (r9 == 0) goto L_0x005c
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r6.writeInt(r1)     // Catch:{ Exception -> 0x022f }
            boolean r0 = r9.booleanValue()     // Catch:{ Exception -> 0x022f }
            goto L_0x00d9
        L_0x00b1:
            java.lang.Object r9 = r8.get(r7)     // Catch:{ Exception -> 0x022f }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ Exception -> 0x022f }
            if (r9 == 0) goto L_0x005c
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r6.writeInt(r1)     // Catch:{ Exception -> 0x022f }
            long r0 = r9.longValue()     // Catch:{ Exception -> 0x022f }
            r6.writeLong(r0)     // Catch:{ Exception -> 0x022f }
            goto L_0x005c
        L_0x00c7:
            java.lang.Object r9 = r8.get(r7)     // Catch:{ Exception -> 0x022f }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ Exception -> 0x022f }
            if (r9 == 0) goto L_0x005c
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r6.writeInt(r1)     // Catch:{ Exception -> 0x022f }
            int r0 = r9.intValue()     // Catch:{ Exception -> 0x022f }
        L_0x00d9:
            r6.writeInt(r0)     // Catch:{ Exception -> 0x022f }
            goto L_0x005c
        L_0x00dd:
            java.lang.Object r0 = r8.get(r7)     // Catch:{ Exception -> 0x022f }
            int[] r0 = (int[]) r0     // Catch:{ Exception -> 0x022f }
            if (r0 == 0) goto L_0x021e
            int r1 = A00(r6, r1)     // Catch:{ Exception -> 0x022f }
            r6.writeIntArray(r0)     // Catch:{ Exception -> 0x022f }
            goto L_0x0219
        L_0x00ee:
            java.lang.Object r0 = r8.get(r7)     // Catch:{ Exception -> 0x022f }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x022f }
            if (r0 == 0) goto L_0x021e
            int r1 = A00(r6, r1)     // Catch:{ Exception -> 0x022f }
            r6.writeByteArray(r0)     // Catch:{ Exception -> 0x022f }
            goto L_0x0219
        L_0x00ff:
            java.lang.Object r0 = r8.get(r7)     // Catch:{ Exception -> 0x022f }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ Exception -> 0x022f }
            if (r0 == 0) goto L_0x021e
            int r1 = A00(r6, r1)     // Catch:{ Exception -> 0x022f }
            r6.writeStringArray(r0)     // Catch:{ Exception -> 0x022f }
            goto L_0x0219
        L_0x0110:
            java.lang.Object r13 = r8.get(r7)     // Catch:{ Exception -> 0x022f }
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ Exception -> 0x022f }
            r12 = 0
            if (r13 == 0) goto L_0x021e
            int r14 = A00(r6, r1)     // Catch:{ Exception -> 0x022f }
            int r10 = r13.length     // Catch:{ Exception -> 0x022f }
            r6.writeInt(r10)     // Catch:{ Exception -> 0x022f }
            r9 = 0
        L_0x0122:
            if (r9 >= r10) goto L_0x014d
            r1 = r13[r9]     // Catch:{ Exception -> 0x022f }
            if (r1 != 0) goto L_0x012c
            r6.writeInt(r12)     // Catch:{ Exception -> 0x022f }
            goto L_0x014a
        L_0x012c:
            int r15 = r6.dataPosition()     // Catch:{ Exception -> 0x022f }
            r0 = 1
            r6.writeInt(r0)     // Catch:{ Exception -> 0x022f }
            int r0 = r6.dataPosition()     // Catch:{ Exception -> 0x022f }
            r1.writeToParcel(r6, r11)     // Catch:{ Exception -> 0x022f }
            int r1 = r6.dataPosition()     // Catch:{ Exception -> 0x022f }
            r6.setDataPosition(r15)     // Catch:{ Exception -> 0x022f }
            int r0 = r1 - r0
            r6.writeInt(r0)     // Catch:{ Exception -> 0x022f }
            r6.setDataPosition(r1)     // Catch:{ Exception -> 0x022f }
        L_0x014a:
            int r9 = r9 + 1
            goto L_0x0122
        L_0x014d:
            A01(r6, r14)     // Catch:{ Exception -> 0x022f }
            goto L_0x005c
        L_0x0152:
            java.lang.Object r0 = r8.get(r7)     // Catch:{ Exception -> 0x022f }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ Exception -> 0x022f }
            if (r0 == 0) goto L_0x021e
            int r1 = A00(r6, r1)     // Catch:{ Exception -> 0x022f }
            r6.writeBundle(r0)     // Catch:{ Exception -> 0x022f }
            goto L_0x0219
        L_0x0163:
            java.lang.Object r0 = r8.get(r7)     // Catch:{ Exception -> 0x022f }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x022f }
            if (r0 == 0) goto L_0x021e
            int r1 = A00(r6, r1)     // Catch:{ Exception -> 0x022f }
            r6.writeMap(r0)     // Catch:{ Exception -> 0x022f }
            goto L_0x0219
        L_0x0174:
            java.lang.Class r9 = X.AnonymousClass9Zh.A00(r8)     // Catch:{ Exception -> 0x022f }
            if (r9 == 0) goto L_0x01cf
            java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
            boolean r0 = r0.isAssignableFrom(r9)     // Catch:{ Exception -> 0x022f }
            if (r0 == 0) goto L_0x01cf
            boolean r0 = X.AnonymousClass9Zh.A01(r8)     // Catch:{ Exception -> 0x022f }
            if (r0 != 0) goto L_0x01cf
            java.lang.Object r0 = r8.get(r7)     // Catch:{ Exception -> 0x022f }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x022f }
            r12 = 0
            if (r0 == 0) goto L_0x021e
            int r10 = A00(r6, r1)     // Catch:{ Exception -> 0x022f }
            java.util.Iterator r13 = X.C90474aD.A0o(r6, r0)     // Catch:{ Exception -> 0x022f }
        L_0x0199:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x022f }
            if (r0 == 0) goto L_0x01ca
            java.lang.Object r1 = r13.next()     // Catch:{ Exception -> 0x022f }
            android.os.Parcelable r1 = (android.os.Parcelable) r1     // Catch:{ Exception -> 0x022f }
            if (r1 != 0) goto L_0x01ab
            r6.writeInt(r12)     // Catch:{ Exception -> 0x022f }
            goto L_0x0199
        L_0x01ab:
            int r9 = r6.dataPosition()     // Catch:{ Exception -> 0x022f }
            r0 = 1
            r6.writeInt(r0)     // Catch:{ Exception -> 0x022f }
            int r0 = r6.dataPosition()     // Catch:{ Exception -> 0x022f }
            r1.writeToParcel(r6, r11)     // Catch:{ Exception -> 0x022f }
            int r1 = r6.dataPosition()     // Catch:{ Exception -> 0x022f }
            r6.setDataPosition(r9)     // Catch:{ Exception -> 0x022f }
            int r0 = r1 - r0
            r6.writeInt(r0)     // Catch:{ Exception -> 0x022f }
            r6.setDataPosition(r1)     // Catch:{ Exception -> 0x022f }
            goto L_0x0199
        L_0x01ca:
            A01(r6, r10)     // Catch:{ Exception -> 0x022f }
            goto L_0x005c
        L_0x01cf:
            java.lang.Object r0 = r8.get(r7)     // Catch:{ Exception -> 0x022f }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x022f }
            if (r0 == 0) goto L_0x021e
            int r1 = A00(r6, r1)     // Catch:{ Exception -> 0x022f }
            r6.writeList(r0)     // Catch:{ Exception -> 0x022f }
            goto L_0x0219
        L_0x01df:
            java.lang.Object r0 = r8.get(r7)     // Catch:{ Exception -> 0x022f }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x022f }
            if (r0 == 0) goto L_0x021e
            int r1 = A00(r6, r1)     // Catch:{ Exception -> 0x022f }
            r6.writeStringList(r0)     // Catch:{ Exception -> 0x022f }
            goto L_0x0219
        L_0x01ef:
            java.lang.Object r0 = r8.get(r7)     // Catch:{ Exception -> 0x022f }
            android.os.IInterface r0 = (android.os.IInterface) r0     // Catch:{ Exception -> 0x022f }
            android.os.IBinder r0 = r0.asBinder()     // Catch:{ Exception -> 0x022f }
            goto L_0x0200
        L_0x01fa:
            java.lang.Object r0 = r8.get(r7)     // Catch:{ Exception -> 0x022f }
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch:{ Exception -> 0x022f }
        L_0x0200:
            if (r0 == 0) goto L_0x021e
            int r1 = A00(r6, r1)     // Catch:{ Exception -> 0x022f }
            r6.writeStrongBinder(r0)     // Catch:{ Exception -> 0x022f }
            goto L_0x0219
        L_0x020a:
            java.lang.Object r0 = r8.get(r7)     // Catch:{ Exception -> 0x022f }
            android.os.Parcelable r0 = (android.os.Parcelable) r0     // Catch:{ Exception -> 0x022f }
            if (r0 == 0) goto L_0x021e
            int r1 = A00(r6, r1)     // Catch:{ Exception -> 0x022f }
            r0.writeToParcel(r6, r11)     // Catch:{ Exception -> 0x022f }
        L_0x0219:
            A01(r6, r1)     // Catch:{ Exception -> 0x022f }
            goto L_0x005c
        L_0x021e:
            if (r10 == 0) goto L_0x005c
            r6.writeInt(r1)     // Catch:{ Exception -> 0x022f }
            goto L_0x005c
        L_0x0225:
            java.lang.IllegalStateException r0 = X.C165617ti.A0V()     // Catch:{ Exception -> 0x022f }
            goto L_0x022e
        L_0x022a:
            java.lang.IllegalStateException r0 = X.C165617ti.A0V()     // Catch:{ Exception -> 0x022f }
        L_0x022e:
            throw r0     // Catch:{ Exception -> 0x022f }
        L_0x022f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Error writing field: "
            java.lang.String r1 = X.AnonymousClass000.A0l(r2, r0, r1)
            java.lang.String r0 = "SafeParcel"
            android.util.Log.w(r0, r1)
        L_0x023f:
            int r3 = r3 + 1
            goto L_0x0023
        L_0x0243:
            java.lang.Class r17 = r17.getSuperclass()
            goto L_0x001b
        L_0x0249:
            r0 = r16
            A01(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AZS.writeToParcel(android.os.Parcel, int):void");
    }

    public static int A00(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(65535);
        return parcel.dataPosition();
    }

    public static void A01(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }
}
