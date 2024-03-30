package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;

/* renamed from: X.0Pr  reason: invalid class name and case insensitive filesystem */
public abstract class C05430Pr {
    public static final Bundle A00(AnonymousClass011... r9) {
        Bundle bundle = new Bundle(r7);
        for (AnonymousClass011 r0 : r9) {
            String str = (String) r0.first;
            Object obj = r0.second;
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, AnonymousClass000.A1X(obj));
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, AnonymousClass000.A0I(obj));
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else {
                if (obj instanceof Object[]) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    AnonymousClass00C.A0B(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        bundle.putParcelableArray(str, (Parcelable[]) obj);
                    } else if (String.class.isAssignableFrom(componentType)) {
                        bundle.putStringArray(str, (String[]) obj);
                    } else if (CharSequence.class.isAssignableFrom(componentType)) {
                        bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                    } else if (!Serializable.class.isAssignableFrom(componentType)) {
                        String canonicalName = componentType.getCanonicalName();
                        StringBuilder A0u = AnonymousClass000.A0u();
                        AnonymousClass000.A1D("Illegal value array type ", canonicalName, " for key \"", A0u);
                        A0u.append(str);
                        A0u.append('\"');
                        throw AnonymousClass000.A0b(A0u);
                    }
                } else if (!(obj instanceof Serializable)) {
                    if (obj instanceof IBinder) {
                        C05400Po.A00(bundle, (IBinder) obj, str);
                    } else if (obj instanceof Size) {
                        AnonymousClass0VK.A00(bundle, (Size) obj, str);
                    } else if (obj instanceof SizeF) {
                        AnonymousClass0VK.A01(bundle, (SizeF) obj, str);
                    } else {
                        String canonicalName2 = obj.getClass().getCanonicalName();
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        AnonymousClass000.A1D("Illegal value type ", canonicalName2, " for key \"", A0u2);
                        A0u2.append(str);
                        A0u2.append('\"');
                        throw AnonymousClass000.A0b(A0u2);
                    }
                }
                bundle.putSerializable(str, (Serializable) obj);
            }
        }
        return bundle;
    }
}
