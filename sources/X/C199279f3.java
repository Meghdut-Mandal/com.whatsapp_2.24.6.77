package X;

import java.lang.reflect.Field;

/* renamed from: X.9f3  reason: invalid class name and case insensitive filesystem */
public final class C199279f3 {
    public final Field field;

    public void set(Object obj, int i) {
        try {
            this.field.set(obj, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public C199279f3(Field field2) {
        this.field = field2;
        field2.setAccessible(true);
    }

    public void set(Object obj, Object obj2) {
        try {
            this.field.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw C90524aI.A0Y(e);
        }
    }
}
