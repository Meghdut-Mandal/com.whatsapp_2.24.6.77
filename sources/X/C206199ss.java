package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;

/* renamed from: X.9ss  reason: invalid class name and case insensitive filesystem */
public class C206199ss implements Parcelable.Creator {
    public final Class A00;

    public static int A00(Parcel parcel, int i) {
        if ((i & -65536) != -65536) {
            return (i >> 16) & 65535;
        }
        return parcel.readInt();
    }

    public static Parcelable.Creator A01(Class cls) {
        try {
            Field declaredField = cls.getDeclaredField("CREATOR");
            declaredField.setAccessible(true);
            return (Parcelable.Creator) declaredField.get((Object) null);
        } catch (NoSuchFieldException unused) {
            throw C90464aC.A0U(" is an Parcelable without CREATOR", C36381kD.A11(cls));
        } catch (IllegalAccessException unused2) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("CREATOR in ");
            A0u.append(cls);
            throw C90464aC.A0U(" is not accessible", A0u);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0223, code lost:
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0227, code lost:
        if (r2 != 0) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0229, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x022b, code lost:
        r0 = r13.dataPosition();
        r1 = r13.readHashMap(r1);
        r13.setDataPosition(r0 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0237, code lost:
        r5.set(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x023c, code lost:
        r0 = (org.microg.safeparcel.SafeParcelable.Field) r5.getAnnotation(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0242, code lost:
        if (r0 == null) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0244, code lost:
        r1 = r0.subClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x024a, code lost:
        if (r1 == org.microg.safeparcel.SafeParcelable.class) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x024c, code lost:
        if (r1 == null) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0254, code lost:
        if (android.os.Parcelable.class.isAssignableFrom(r1) == false) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x025a, code lost:
        if (X.AnonymousClass9Zh.A01(r5) == false) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x025c, code lost:
        r1 = r5.getDeclaringClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0260, code lost:
        if (r1 == null) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0266, code lost:
        if (r1.getClassLoader() == null) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0268, code lost:
        r1 = r1.getClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x026c, code lost:
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0270, code lost:
        if (r2 != 0) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0273, code lost:
        r1 = java.lang.ClassLoader.getSystemClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0278, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x027a, code lost:
        r0 = r13.dataPosition();
        r1 = r13.readBundle(r1);
        r13.setDataPosition(r0 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0286, code lost:
        r5.set(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x028b, code lost:
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x028f, code lost:
        if (r2 != 0) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0291, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0293, code lost:
        r0 = r13.dataPosition();
        r1 = r13.createStringArray();
        r13.setDataPosition(r0 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x029f, code lost:
        r5.set(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02a4, code lost:
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02a8, code lost:
        if (r2 != 0) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02aa, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02ac, code lost:
        r0 = r13.dataPosition();
        r1 = r13.createByteArray();
        r13.setDataPosition(r0 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02b8, code lost:
        r5.set(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02bd, code lost:
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02c1, code lost:
        if (r2 != 0) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02c3, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02c5, code lost:
        r0 = r13.dataPosition();
        r1 = r13.createIntArray();
        r13.setDataPosition(r0 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02d1, code lost:
        r5.set(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02d6, code lost:
        A03(r13, r6, 4);
        r17 = r13.readInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02e0, code lost:
        if (r2 == -1) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02e7, code lost:
        if (((long) r17) <= r2) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02e9, code lost:
        r1 = new java.lang.Object[3];
        r1[0] = r5.getDeclaringClass().getName();
        X.AnonymousClass000.A1M(r1, 1, r2);
        X.AnonymousClass000.A1L(r1, r17, 2);
        X.C165587tf.A1M("Version code of %s (%d) is older than object read (%d).", "SafeParcel", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0303, code lost:
        r5.set(r11, java.lang.Integer.valueOf(r17));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x030c, code lost:
        A03(r13, r6, 8);
        r16 = r13.readLong();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0317, code lost:
        if (r2 == -1) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x031b, code lost:
        if (r16 <= r2) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x031d, code lost:
        r15 = new java.lang.Object[3];
        r15[0] = r5.getDeclaringClass().getName();
        X.AnonymousClass000.A1M(r15, 1, r2);
        X.AnonymousClass000.A1M(r15, 2, r16);
        X.C165587tf.A1M("Version code of %s (%d) is older than object read (%d).", "SafeParcel", r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0337, code lost:
        r5.set(r11, java.lang.Long.valueOf(r16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x033f, code lost:
        A03(r13, r6, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        r5.set(r11, java.lang.Boolean.valueOf(X.AnonymousClass000.A1P(r13.readInt())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0353, code lost:
        A03(r13, r6, 4);
        r5.set(r11, java.lang.Float.valueOf(r13.readFloat()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0363, code lost:
        A03(r13, r6, 8);
        r5.set(r11, java.lang.Double.valueOf(r13.readDouble()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0374, code lost:
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0378, code lost:
        if (r2 != 0) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x037a, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x037c, code lost:
        r0 = r13.dataPosition();
        r1 = r13.readString();
        r13.setDataPosition(r0 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0388, code lost:
        r5.set(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0392, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r1 = new java.lang.Object[2];
        X.AnonymousClass000.A1L(r1, r14, 0);
        r1[1] = r24.getName();
        android.util.Log.w("SafeParcel", java.lang.String.format("Error reading field: %d in %s, skipping.", r1), r2);
        r13.setDataPosition(r13.dataPosition() + A00(r13, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03b9, code lost:
        if (r13.dataPosition() > r7) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03bb, code lost:
        r23.setAccessible(r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03c2, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03c3, code lost:
        r1 = X.C165567td.A0U("Overread allowed size end=", X.AnonymousClass000.A0u(), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03ce, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("Size read is invalid start=");
        r1.append(r2);
        r1 = new X.C21823Aaz(X.AnonymousClass000.A0r(" end=", r1, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03e6, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("Expected object header. Got 0x");
        X.C90504aG.A0z(r3, r1);
        r1 = new X.C21823Aaz(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        r13 = r26;
        r3 = r13.readInt();
        r7 = A00(r13, r3);
        r2 = r13.dataPosition();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0079, code lost:
        if ((r3 & 65535) != 20293) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007b, code lost:
        r7 = r7 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        if (r7 < r2) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0082, code lost:
        if (r7 > r13.dataSize()) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r13.dataPosition() >= r7) goto L_0x03b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        r6 = r13.readInt();
        r14 = r6 & 65535;
        r5 = (java.lang.reflect.Field) r10.get(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r5 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        r1 = new java.lang.Object[2];
        X.AnonymousClass000.A1L(r1, r14, 0);
        r1[1] = r24.getName();
        X.C165587tf.A1M("Unknown field id %d in %s, skipping.", "SafeParcel", r1);
        r13.setDataPosition(r13.dataPosition() + A00(r13, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r21 = r5.isAccessible();
        r5.setAccessible(true);
        r1 = org.microg.safeparcel.SafeParcelable.Field.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c9, code lost:
        if (r5.isAnnotationPresent(r1) == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cb, code lost:
        r2 = ((org.microg.safeparcel.SafeParcelable.Field) r5.getAnnotation(r1)).versionCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e0, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e3, code lost:
        switch(X.C112055dH.A00(r5).intValue()) {
            case 0: goto L_0x0143;
            case 1: goto L_0x01d0;
            case 2: goto L_0x01e9;
            case 3: goto L_0x0162;
            case 4: goto L_0x023c;
            case 5: goto L_0x01b1;
            case 6: goto L_0x028b;
            case 7: goto L_0x02a4;
            case 8: goto L_0x00e8;
            case 9: goto L_0x02bd;
            case 10: goto L_0x02d6;
            case 11: goto L_0x030c;
            case 12: goto L_0x033f;
            case 13: goto L_0x0353;
            case 14: goto L_0x0363;
            case 15: goto L_0x0374;
            case 16: goto L_0x0202;
            default: goto L_0x00e6;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e8, code lost:
        r3 = r5.getType().getDeclaredClasses();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0143, code lost:
        r0 = A02(r5);
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014b, code lost:
        if (r2 != 0) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014d, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014f, code lost:
        r1 = r13.dataPosition();
        r0 = (android.os.Parcelable) r0.createFromParcel(r13);
        r13.setDataPosition(r1 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015d, code lost:
        r5.set(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0162, code lost:
        r1 = X.AnonymousClass9Zh.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0166, code lost:
        if (r1 == null) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016e, code lost:
        if (android.os.Parcelable.class.isAssignableFrom(r1) == false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0174, code lost:
        if (X.AnonymousClass9Zh.A01(r5) != false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0176, code lost:
        r1 = A01(r1);
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017e, code lost:
        if (r2 == 0) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0180, code lost:
        r0 = r13.dataPosition();
        r1 = r13.createTypedArrayList(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0188, code lost:
        r13.setDataPosition(r0 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018c, code lost:
        r5.set(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0195, code lost:
        if (r1.getClassLoader() == null) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0197, code lost:
        r1 = r1.getClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019c, code lost:
        r1 = java.lang.ClassLoader.getSystemClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a0, code lost:
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a4, code lost:
        if (r2 == 0) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a6, code lost:
        r0 = r13.dataPosition();
        r1 = r13.readArrayList(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01af, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b1, code lost:
        r0 = A02(r5);
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b9, code lost:
        if (r2 != 0) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01bb, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01bd, code lost:
        r1 = r13.dataPosition();
        r0 = (android.os.Parcelable[]) r13.createTypedArray(r0);
        r13.setDataPosition(r1 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01cb, code lost:
        r5.set(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d0, code lost:
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d4, code lost:
        if (r2 != 0) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d6, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d8, code lost:
        r0 = r13.dataPosition();
        r1 = r13.readStrongBinder();
        r13.setDataPosition(r0 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e4, code lost:
        r5.set(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e9, code lost:
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ed, code lost:
        if (r2 != 0) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ef, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f1, code lost:
        r0 = r13.dataPosition();
        r1 = r13.createStringArrayList();
        r13.setDataPosition(r0 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01fd, code lost:
        r5.set(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0202, code lost:
        r0 = (org.microg.safeparcel.SafeParcelable.Field) r5.getAnnotation(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0208, code lost:
        if (r0 == null) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x020a, code lost:
        r1 = r0.subClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0210, code lost:
        if (r1 == org.microg.safeparcel.SafeParcelable.class) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0212, code lost:
        if (r1 == null) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0218, code lost:
        if (r1.getClassLoader() == null) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x021a, code lost:
        r1 = r1.getClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x021f, code lost:
        r1 = java.lang.ClassLoader.getSystemClassLoader();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r26) {
        /*
            r25 = this;
            r0 = r25
            java.lang.Class r2 = r0.A00
            r1 = 0
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.reflect.Constructor r23 = r2.getDeclaredConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            boolean r22 = r23.isAccessible()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r12 = 1
            r0 = r23
            r0.setAccessible(r12)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.Object r11 = r0.newInstance(r1)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            org.microg.safeparcel.SafeParcelable r11 = (org.microg.safeparcel.SafeParcelable) r11     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.util.Objects.requireNonNull(r11)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.Class r7 = r11.getClass()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r24 = r7
            android.util.SparseArray r10 = new android.util.SparseArray     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r10.<init>()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
        L_0x002b:
            r9 = 2
            r8 = 0
            if (r7 == 0) goto L_0x0064
            java.lang.reflect.Field[] r6 = r7.getDeclaredFields()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            int r5 = r6.length     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r2 = 0
        L_0x0035:
            if (r2 >= r5) goto L_0x0059
            r4 = r6[r2]     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.Class<org.microg.safeparcel.SafeParcelable$Field> r1 = org.microg.safeparcel.SafeParcelable.Field.class
            boolean r0 = r4.isAnnotationPresent(r1)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0056
            java.lang.annotation.Annotation r0 = r4.getAnnotation(r1)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            if (r0 == 0) goto L_0x005e
            int r3 = r0.value()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.Object r0 = r10.get(r3)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            if (r0 != 0) goto L_0x03fc
            r10.put(r3, r4)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
        L_0x0056:
            int r2 = r2 + 1
            goto L_0x0035
        L_0x0059:
            java.lang.Class r7 = r7.getSuperclass()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            goto L_0x002b
        L_0x005e:
            java.lang.IllegalStateException r1 = X.C165617ti.A0V()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            goto L_0x0425
        L_0x0064:
            r13 = r26
            int r3 = r13.readInt()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            int r7 = A00(r13, r3)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            int r2 = r13.dataPosition()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r3 & r0
            r0 = 20293(0x4f45, float:2.8437E-41)
            if (r1 != r0) goto L_0x03e6
            int r7 = r7 + r2
            if (r7 < r2) goto L_0x03ce
            int r0 = r13.dataSize()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            if (r7 > r0) goto L_0x03ce
        L_0x0084:
            int r0 = r13.dataPosition()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            if (r0 >= r7) goto L_0x03b5
            int r6 = r13.readInt()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r14 = r6 & r0
            java.lang.Object r5 = r10.get(r14)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r4 = "SafeParcel"
            if (r5 != 0) goto L_0x00ba
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            X.AnonymousClass000.A1L(r1, r14, r8)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = r24.getName()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r1[r12] = r0     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = "Unknown field id %d in %s, skipping."
            X.C165587tf.A1M(r0, r4, r1)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            int r1 = A00(r13, r6)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            int r0 = r13.dataPosition()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            int r0 = r0 + r1
            r13.setDataPosition(r0)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            goto L_0x0084
        L_0x00ba:
            boolean r21 = r5.isAccessible()     // Catch:{ Exception -> 0x0392 }
            r5.setAccessible(r12)     // Catch:{ Exception -> 0x0392 }
            java.lang.Class<org.microg.safeparcel.SafeParcelable$Field> r1 = org.microg.safeparcel.SafeParcelable.Field.class
            boolean r0 = r5.isAnnotationPresent(r1)     // Catch:{ Exception -> 0x0392 }
            r19 = -1
            if (r0 == 0) goto L_0x00e0
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r1)     // Catch:{ Exception -> 0x0392 }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x0392 }
            long r2 = r0.versionCode()     // Catch:{ Exception -> 0x0392 }
        L_0x00d5:
            java.lang.Integer r0 = X.C112055dH.A00(r5)     // Catch:{ Exception -> 0x0392 }
            int r15 = r0.intValue()     // Catch:{ Exception -> 0x0392 }
            java.lang.String r18 = "Version code of %s (%d) is older than object read (%d)."
            goto L_0x00e3
        L_0x00e0:
            r2 = -1
            goto L_0x00d5
        L_0x00e3:
            switch(r15) {
                case 0: goto L_0x0143;
                case 1: goto L_0x01d0;
                case 2: goto L_0x01e9;
                case 3: goto L_0x0162;
                case 4: goto L_0x023c;
                case 5: goto L_0x01b1;
                case 6: goto L_0x028b;
                case 7: goto L_0x02a4;
                case 8: goto L_0x00e8;
                case 9: goto L_0x02bd;
                case 10: goto L_0x02d6;
                case 11: goto L_0x030c;
                case 12: goto L_0x033f;
                case 13: goto L_0x0353;
                case 14: goto L_0x0363;
                case 15: goto L_0x0374;
                case 16: goto L_0x0202;
                default: goto L_0x00e6;
            }     // Catch:{ Exception -> 0x0392 }
        L_0x00e6:
            goto L_0x038b
        L_0x00e8:
            java.lang.Class r0 = r5.getType()     // Catch:{ Exception -> 0x0392 }
            java.lang.Class[] r3 = r0.getDeclaredClasses()     // Catch:{ Exception -> 0x0392 }
            int r0 = r3.length     // Catch:{ Exception -> 0x0392 }
            r19 = r0
            r2 = 0
        L_0x00f4:
            r0 = r19
            if (r2 >= r0) goto L_0x0134
            r16 = r3[r2]     // Catch:{ Exception -> 0x0392 }
            java.lang.String r15 = "asInterface"
            java.lang.Class[] r1 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0131 }
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            r1[r8] = r0     // Catch:{ Exception -> 0x0131 }
            r0 = r16
            java.lang.reflect.Method r18 = r0.getDeclaredMethod(r15, r1)     // Catch:{ Exception -> 0x0131 }
            r17 = 0
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0131 }
            int r16 = A00(r13, r6)     // Catch:{ Exception -> 0x0131 }
            if (r16 != 0) goto L_0x0115
            r1 = r17
            goto L_0x0122
        L_0x0115:
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x0131 }
            android.os.IBinder r1 = r13.readStrongBinder()     // Catch:{ Exception -> 0x0131 }
            int r0 = r0 + r16
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x0131 }
        L_0x0122:
            r15[r8] = r1     // Catch:{ Exception -> 0x0131 }
            r1 = r18
            r0 = r17
            java.lang.Object r0 = r1.invoke(r0, r15)     // Catch:{ Exception -> 0x0131 }
            r5.set(r11, r0)     // Catch:{ Exception -> 0x0131 }
            goto L_0x038b
        L_0x0131:
            int r2 = r2 + 1
            goto L_0x00f4
        L_0x0134:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0392 }
            java.lang.String r0 = "Field has broken interface: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r5, r0, r1)     // Catch:{ Exception -> 0x0392 }
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)     // Catch:{ Exception -> 0x0392 }
            throw r0     // Catch:{ Exception -> 0x0392 }
        L_0x0143:
            android.os.Parcelable$Creator r0 = A02(r5)     // Catch:{ Exception -> 0x0392 }
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x0392 }
            if (r2 != 0) goto L_0x014f
            r0 = 0
            goto L_0x015d
        L_0x014f:
            int r1 = r13.dataPosition()     // Catch:{ Exception -> 0x0392 }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ Exception -> 0x0392 }
            android.os.Parcelable r0 = (android.os.Parcelable) r0     // Catch:{ Exception -> 0x0392 }
            int r1 = r1 + r2
            r13.setDataPosition(r1)     // Catch:{ Exception -> 0x0392 }
        L_0x015d:
            r5.set(r11, r0)     // Catch:{ Exception -> 0x0392 }
            goto L_0x038b
        L_0x0162:
            java.lang.Class r1 = X.AnonymousClass9Zh.A00(r5)     // Catch:{ Exception -> 0x0392 }
            if (r1 == 0) goto L_0x019c
            java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ Exception -> 0x0392 }
            if (r0 == 0) goto L_0x0191
            boolean r0 = X.AnonymousClass9Zh.A01(r5)     // Catch:{ Exception -> 0x0392 }
            if (r0 != 0) goto L_0x0191
            android.os.Parcelable$Creator r1 = A01(r1)     // Catch:{ Exception -> 0x0392 }
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x0392 }
            if (r2 == 0) goto L_0x01af
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x0392 }
            java.util.ArrayList r1 = r13.createTypedArrayList(r1)     // Catch:{ Exception -> 0x0392 }
        L_0x0188:
            int r0 = r0 + r2
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x0392 }
        L_0x018c:
            r5.set(r11, r1)     // Catch:{ Exception -> 0x0392 }
            goto L_0x038b
        L_0x0191:
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch:{ Exception -> 0x0392 }
            if (r0 == 0) goto L_0x019c
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ Exception -> 0x0392 }
            goto L_0x01a0
        L_0x019c:
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x0392 }
        L_0x01a0:
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x0392 }
            if (r2 == 0) goto L_0x01af
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x0392 }
            java.util.ArrayList r1 = r13.readArrayList(r1)     // Catch:{ Exception -> 0x0392 }
            goto L_0x0188
        L_0x01af:
            r1 = 0
            goto L_0x018c
        L_0x01b1:
            android.os.Parcelable$Creator r0 = A02(r5)     // Catch:{ Exception -> 0x0392 }
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x0392 }
            if (r2 != 0) goto L_0x01bd
            r0 = 0
            goto L_0x01cb
        L_0x01bd:
            int r1 = r13.dataPosition()     // Catch:{ Exception -> 0x0392 }
            java.lang.Object[] r0 = r13.createTypedArray(r0)     // Catch:{ Exception -> 0x0392 }
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0     // Catch:{ Exception -> 0x0392 }
            int r1 = r1 + r2
            r13.setDataPosition(r1)     // Catch:{ Exception -> 0x0392 }
        L_0x01cb:
            r5.set(r11, r0)     // Catch:{ Exception -> 0x0392 }
            goto L_0x038b
        L_0x01d0:
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x0392 }
            if (r2 != 0) goto L_0x01d8
            r1 = 0
            goto L_0x01e4
        L_0x01d8:
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x0392 }
            android.os.IBinder r1 = r13.readStrongBinder()     // Catch:{ Exception -> 0x0392 }
            int r0 = r0 + r2
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x0392 }
        L_0x01e4:
            r5.set(r11, r1)     // Catch:{ Exception -> 0x0392 }
            goto L_0x038b
        L_0x01e9:
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x0392 }
            if (r2 != 0) goto L_0x01f1
            r1 = 0
            goto L_0x01fd
        L_0x01f1:
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x0392 }
            java.util.ArrayList r1 = r13.createStringArrayList()     // Catch:{ Exception -> 0x0392 }
            int r0 = r0 + r2
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x0392 }
        L_0x01fd:
            r5.set(r11, r1)     // Catch:{ Exception -> 0x0392 }
            goto L_0x038b
        L_0x0202:
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r1)     // Catch:{ Exception -> 0x0392 }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x0392 }
            if (r0 == 0) goto L_0x021f
            java.lang.Class r1 = r0.subClass()     // Catch:{ Exception -> 0x0392 }
            java.lang.Class<org.microg.safeparcel.SafeParcelable> r0 = org.microg.safeparcel.SafeParcelable.class
            if (r1 == r0) goto L_0x021f
            if (r1 == 0) goto L_0x021f
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch:{ Exception -> 0x0392 }
            if (r0 == 0) goto L_0x021f
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ Exception -> 0x0392 }
            goto L_0x0223
        L_0x021f:
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x0392 }
        L_0x0223:
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x0392 }
            if (r2 != 0) goto L_0x022b
            r1 = 0
            goto L_0x0237
        L_0x022b:
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x0392 }
            java.util.HashMap r1 = r13.readHashMap(r1)     // Catch:{ Exception -> 0x0392 }
            int r0 = r0 + r2
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x0392 }
        L_0x0237:
            r5.set(r11, r1)     // Catch:{ Exception -> 0x0392 }
            goto L_0x038b
        L_0x023c:
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r1)     // Catch:{ Exception -> 0x0392 }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x0392 }
            if (r0 == 0) goto L_0x025c
            java.lang.Class r1 = r0.subClass()     // Catch:{ Exception -> 0x0392 }
            java.lang.Class<org.microg.safeparcel.SafeParcelable> r0 = org.microg.safeparcel.SafeParcelable.class
            if (r1 == r0) goto L_0x025c
            if (r1 == 0) goto L_0x025c
            java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ Exception -> 0x0392 }
            if (r0 == 0) goto L_0x025c
            boolean r0 = X.AnonymousClass9Zh.A01(r5)     // Catch:{ Exception -> 0x0392 }
            if (r0 == 0) goto L_0x0262
        L_0x025c:
            java.lang.Class r1 = r5.getDeclaringClass()     // Catch:{ Exception -> 0x0392 }
            if (r1 == 0) goto L_0x0273
        L_0x0262:
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch:{ Exception -> 0x0392 }
            if (r0 == 0) goto L_0x0273
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ Exception -> 0x0392 }
        L_0x026c:
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x0392 }
            if (r2 != 0) goto L_0x027a
            goto L_0x0278
        L_0x0273:
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x0392 }
            goto L_0x026c
        L_0x0278:
            r1 = 0
            goto L_0x0286
        L_0x027a:
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x0392 }
            android.os.Bundle r1 = r13.readBundle(r1)     // Catch:{ Exception -> 0x0392 }
            int r0 = r0 + r2
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x0392 }
        L_0x0286:
            r5.set(r11, r1)     // Catch:{ Exception -> 0x0392 }
            goto L_0x038b
        L_0x028b:
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x0392 }
            if (r2 != 0) goto L_0x0293
            r1 = 0
            goto L_0x029f
        L_0x0293:
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x0392 }
            java.lang.String[] r1 = r13.createStringArray()     // Catch:{ Exception -> 0x0392 }
            int r0 = r0 + r2
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x0392 }
        L_0x029f:
            r5.set(r11, r1)     // Catch:{ Exception -> 0x0392 }
            goto L_0x038b
        L_0x02a4:
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x0392 }
            if (r2 != 0) goto L_0x02ac
            r1 = 0
            goto L_0x02b8
        L_0x02ac:
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x0392 }
            byte[] r1 = r13.createByteArray()     // Catch:{ Exception -> 0x0392 }
            int r0 = r0 + r2
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x0392 }
        L_0x02b8:
            r5.set(r11, r1)     // Catch:{ Exception -> 0x0392 }
            goto L_0x038b
        L_0x02bd:
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x0392 }
            if (r2 != 0) goto L_0x02c5
            r1 = 0
            goto L_0x02d1
        L_0x02c5:
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x0392 }
            int[] r1 = r13.createIntArray()     // Catch:{ Exception -> 0x0392 }
            int r0 = r0 + r2
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x0392 }
        L_0x02d1:
            r5.set(r11, r1)     // Catch:{ Exception -> 0x0392 }
            goto L_0x038b
        L_0x02d6:
            r0 = 4
            A03(r13, r6, r0)     // Catch:{ Exception -> 0x0392 }
            int r17 = r13.readInt()     // Catch:{ Exception -> 0x0392 }
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0303
            r0 = r17
            long r0 = (long) r0     // Catch:{ Exception -> 0x0392 }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0303
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0392 }
            java.lang.Class r0 = r5.getDeclaringClass()     // Catch:{ Exception -> 0x0392 }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0392 }
            r1[r8] = r0     // Catch:{ Exception -> 0x0392 }
            X.AnonymousClass000.A1M(r1, r12, r2)     // Catch:{ Exception -> 0x0392 }
            r0 = r17
            X.AnonymousClass000.A1L(r1, r0, r9)     // Catch:{ Exception -> 0x0392 }
            r0 = r18
            X.C165587tf.A1M(r0, r4, r1)     // Catch:{ Exception -> 0x0392 }
        L_0x0303:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x0392 }
            r5.set(r11, r0)     // Catch:{ Exception -> 0x0392 }
            goto L_0x038b
        L_0x030c:
            r0 = 8
            A03(r13, r6, r0)     // Catch:{ Exception -> 0x0392 }
            long r16 = r13.readLong()     // Catch:{ Exception -> 0x0392 }
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0337
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0337
            r0 = 3
            java.lang.Object[] r15 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0392 }
            java.lang.Class r0 = r5.getDeclaringClass()     // Catch:{ Exception -> 0x0392 }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0392 }
            r15[r8] = r0     // Catch:{ Exception -> 0x0392 }
            X.AnonymousClass000.A1M(r15, r12, r2)     // Catch:{ Exception -> 0x0392 }
            r0 = r16
            X.AnonymousClass000.A1M(r15, r9, r0)     // Catch:{ Exception -> 0x0392 }
            r0 = r18
            X.C165587tf.A1M(r0, r4, r15)     // Catch:{ Exception -> 0x0392 }
        L_0x0337:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x0392 }
            r5.set(r11, r0)     // Catch:{ Exception -> 0x0392 }
            goto L_0x038b
        L_0x033f:
            r0 = 4
            A03(r13, r6, r0)     // Catch:{ Exception -> 0x0392 }
            int r0 = r13.readInt()     // Catch:{ Exception -> 0x0392 }
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0392 }
            r5.set(r11, r0)     // Catch:{ Exception -> 0x0392 }
            goto L_0x038b
        L_0x0353:
            r0 = 4
            A03(r13, r6, r0)     // Catch:{ Exception -> 0x0392 }
            float r0 = r13.readFloat()     // Catch:{ Exception -> 0x0392 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ Exception -> 0x0392 }
            r5.set(r11, r0)     // Catch:{ Exception -> 0x0392 }
            goto L_0x038b
        L_0x0363:
            r0 = 8
            A03(r13, r6, r0)     // Catch:{ Exception -> 0x0392 }
            double r0 = r13.readDouble()     // Catch:{ Exception -> 0x0392 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0392 }
            r5.set(r11, r0)     // Catch:{ Exception -> 0x0392 }
            goto L_0x038b
        L_0x0374:
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x0392 }
            if (r2 != 0) goto L_0x037c
            r1 = 0
            goto L_0x0388
        L_0x037c:
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x0392 }
            java.lang.String r1 = r13.readString()     // Catch:{ Exception -> 0x0392 }
            int r0 = r0 + r2
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x0392 }
        L_0x0388:
            r5.set(r11, r1)     // Catch:{ Exception -> 0x0392 }
        L_0x038b:
            r0 = r21
            r5.setAccessible(r0)     // Catch:{ Exception -> 0x0392 }
            goto L_0x0084
        L_0x0392:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            X.AnonymousClass000.A1L(r1, r14, r8)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = r24.getName()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r1[r12] = r0     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = "Error reading field: %d in %s, skipping."
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            android.util.Log.w(r4, r0, r2)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            int r1 = A00(r13, r6)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            int r0 = r13.dataPosition()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            int r0 = r0 + r1
            r13.setDataPosition(r0)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            goto L_0x0084
        L_0x03b5:
            int r0 = r13.dataPosition()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            if (r0 > r7) goto L_0x03c3
            r1 = r22
            r0 = r23
            r0.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            return r11
        L_0x03c3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = "Overread allowed size end="
            java.lang.RuntimeException r1 = X.C165567td.A0U(r0, r1, r7)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            goto L_0x0425
        L_0x03ce:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = "Size read is invalid start="
            r1.append(r0)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r1.append(r2)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = " end="
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r7)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            X.Aaz r1 = new X.Aaz     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            goto L_0x0425
        L_0x03e6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = "Expected object header. Got 0x"
            r1.append(r0)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            X.C90504aG.A0z(r3, r1)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = r1.toString()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            X.Aaz r1 = new X.Aaz     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            goto L_0x0425
        L_0x03fc:
            r0 = 4
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            X.AnonymousClass000.A1L(r2, r3, r8)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = r7.getName()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r2[r12] = r0     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = r4.getName()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r2[r9] = r0     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r1 = 3
            java.lang.Object r0 = r10.get(r3)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = r0.getName()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r2[r1] = r0     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = "Field number %d is used twice in %s for fields %s and %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.RuntimeException r1 = X.C90514aH.A0s(r0)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
        L_0x0425:
            throw r1     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
        L_0x0426:
            r1 = move-exception
            java.lang.String r0 = "Can't construct object"
            java.lang.RuntimeException r0 = X.C90524aI.A0e(r0, r1)
            throw r0
        L_0x042e:
            java.lang.String r0 = "createObject() requires a default constructor"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206199ss.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return (Object[]) Array.newInstance(this.A00, i);
    }

    public C206199ss(Class cls) {
        this.A00 = cls;
    }

    public static Parcelable.Creator A02(Field field) {
        Class<?> type = field.getType();
        if ((!type.isArray() || (type = type.getComponentType()) != null) && Parcelable.class.isAssignableFrom(type)) {
            return A01(type);
        }
        throw C90464aC.A0U(" is not an Parcelable", C36381kD.A11(type));
    }

    public static void A03(Parcel parcel, int i, int i2) {
        int A002 = A00(parcel, i);
        if (A002 != i2) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Expected size ");
            A0u.append(i2);
            A0u.append(" got ");
            A0u.append(A002);
            A0u.append(" (0x");
            C90504aG.A0z(A002, A0u);
            throw new C21823Aaz(C90474aD.A0f(A0u));
        }
    }
}
