package X;

import android.os.Build;
import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.100  reason: invalid class name */
public class AnonymousClass100 implements C21890zz {
    public static volatile AnonymousClass100 A02;
    public String A00 = null;
    public Method A01 = null;

    public synchronized void A01(boolean z, String str) {
        Method method = null;
        if (Build.VERSION.SDK_INT < 23 && z) {
            try {
                Class<String> cls = String.class;
                Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", new Class[]{cls, ClassLoader.class, cls});
                declaredMethod.setAccessible(true);
                method = declaredMethod;
            } catch (NoSuchMethodException | SecurityException e) {
                Log.w("robustsofileloader/get-native-load-runtime-method: Could not get nativeLoad method", e);
            }
        }
        this.A01 = method;
        this.A00 = str;
    }

    public synchronized void BOF(String str, int i) {
        Method method = this.A01;
        if (method == null) {
            System.load(str);
        } else {
            try {
                boolean z = false;
                if (this.A00 != null) {
                    z = true;
                }
                C18740tg.A0C(z);
                String str2 = (String) method.invoke(Runtime.getRuntime(), new Object[]{str, AnonymousClass100.class.getClassLoader(), this.A00});
                if (str2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("robustsofileloader/load: nativeLoad returned error ");
                    sb.append(str2);
                    throw new UnsatisfiedLinkError(sb.toString());
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("robustsofileloader/load: Cannot load ");
                sb2.append(str);
                String obj = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("robustsofileloader/load: Error when loading lib: ");
                sb3.append(obj);
                Log.e(sb3.toString(), e);
                throw new UnsatisfiedLinkError(obj);
            }
        }
    }

    public void BOJ(AnonymousClass10T r1, String str, int i) {
    }

    public static AnonymousClass100 A00() {
        if (A02 == null) {
            synchronized (C21890zz.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass100();
                }
            }
        }
        return A02;
    }
}
