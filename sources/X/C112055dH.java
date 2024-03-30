package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5dH  reason: invalid class name and case insensitive filesystem */
public abstract class C112055dH {
    public static Integer A00(Field field) {
        Class<?> type = field.getType();
        Class<?> componentType = type.getComponentType();
        if (type.isArray() && componentType != null && Parcelable.class.isAssignableFrom(componentType)) {
            return C023109s.A0S;
        }
        if (type.isArray() && componentType != null && String.class.isAssignableFrom(componentType)) {
            return C023109s.A0V;
        }
        if (type.isArray() && componentType != null && Byte.TYPE.isAssignableFrom(componentType)) {
            return C023109s.A0W;
        }
        if (type.isArray() && componentType != null && Integer.TYPE.isAssignableFrom(componentType)) {
            return C023109s.A0Y;
        }
        if (Bundle.class.isAssignableFrom(type)) {
            return C023109s.A0R;
        }
        if (Parcelable.class.isAssignableFrom(type)) {
            return C023109s.A00;
        }
        if (IBinder.class.isAssignableFrom(type)) {
            return C023109s.A01;
        }
        if (IInterface.class.isAssignableFrom(type)) {
            return C023109s.A0X;
        }
        if (type == List.class || type == ArrayList.class) {
            if (AnonymousClass9Zh.A00(field) != String.class || AnonymousClass9Zh.A01(field)) {
                return C023109s.A0G;
            }
            return C023109s.A0C;
        } else if (type == Map.class || type == HashMap.class) {
            return C023109s.A08;
        } else {
            if (type == Integer.TYPE || type == Integer.class) {
                return C023109s.A02;
            }
            if (type == Boolean.TYPE || type == Boolean.class) {
                return C023109s.A04;
            }
            if (type == Long.TYPE || type == Long.class) {
                return C023109s.A03;
            }
            if (type == Float.TYPE || type == Float.class) {
                return C023109s.A05;
            }
            if (type == Double.TYPE || type == Double.class) {
                return C023109s.A06;
            }
            if (type == Byte.TYPE || type == Byte.class) {
                return C023109s.A09;
            }
            if (type == String.class) {
                return C023109s.A07;
            }
            throw C90514aH.A0s(AnonymousClass000.A0l(type, "Type is not yet usable with SafeParcelUtil: ", AnonymousClass000.A0u()));
        }
    }
}
