package X;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import net.minidev.json.annotate.JsonIgnore;

/* renamed from: X.9cu  reason: invalid class name and case insensitive filesystem */
public class C198099cu {
    public Class A00;
    public String A01;
    public Field A02;
    public Method A03;
    public Method A04;
    public Type A05;

    public C198099cu(Class cls, Field field) {
        String str;
        JsonIgnore jsonIgnore;
        JsonIgnore jsonIgnore2;
        this.A01 = field.getName();
        int modifiers = field.getModifiers();
        if ((modifiers & 136) <= 0) {
            if ((modifiers & 1) > 0) {
                this.A02 = field;
            }
            String name = field.getName();
            int length = name.length();
            char[] cArr = new char[(length + 3)];
            cArr[0] = 's';
            cArr[1] = 'e';
            cArr[2] = 't';
            char charAt = name.charAt(0);
            if (charAt >= 'a' && charAt <= 'z') {
                charAt = (char) (charAt - ' ');
            }
            cArr[3] = charAt;
            for (int i = 1; i < length; i++) {
                cArr[i + 3] = name.charAt(i);
            }
            String str2 = new String(cArr);
            try {
                this.A04 = cls.getDeclaredMethod(str2, new Class[]{field.getType()});
            } catch (Exception unused) {
            }
            boolean equals = field.getType().equals(Boolean.TYPE);
            String name2 = field.getName();
            if (equals) {
                int length2 = name2.length();
                char[] cArr2 = new char[(length2 + 2)];
                cArr2[0] = 'i';
                cArr2[1] = 's';
                char charAt2 = name2.charAt(0);
                if (charAt2 >= 'a' && charAt2 <= 'z') {
                    charAt2 = (char) (charAt2 - ' ');
                }
                cArr2[2] = charAt2;
                for (int i2 = 1; i2 < length2; i2++) {
                    cArr2[i2 + 2] = name2.charAt(i2);
                }
                str = new String(cArr2);
            } else {
                str = A00(name2);
            }
            try {
                this.A03 = cls.getDeclaredMethod(str, new Class[0]);
            } catch (Exception unused2) {
            }
            if (this.A03 == null && equals) {
                try {
                    this.A03 = cls.getDeclaredMethod(A00(field.getName()), new Class[0]);
                } catch (Exception unused3) {
                }
            }
            if (this.A02 != null || this.A03 != null || this.A04 != null) {
                Method method = this.A03;
                if (!(method == null || (jsonIgnore2 = (JsonIgnore) method.getAnnotation(JsonIgnore.class)) == null || !jsonIgnore2.value())) {
                    this.A03 = null;
                }
                Method method2 = this.A04;
                if (!(method2 == null || (jsonIgnore = (JsonIgnore) method2.getAnnotation(JsonIgnore.class)) == null || !jsonIgnore.value())) {
                    this.A04 = null;
                }
                if (this.A03 != null || this.A04 != null || this.A02 != null) {
                    this.A00 = field.getType();
                    this.A05 = field.getGenericType();
                }
            }
        }
    }

    public static String A00(String str) {
        int length = str.length();
        char[] cArr = new char[(length + 3)];
        cArr[0] = 'g';
        cArr[1] = 'e';
        cArr[2] = 't';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[3] = charAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 3] = str.charAt(i);
        }
        return new String(cArr);
    }
}
