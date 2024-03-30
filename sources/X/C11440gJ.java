package X;

import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.0gJ  reason: invalid class name and case insensitive filesystem */
public class C11440gJ implements Runnable {
    public final /* synthetic */ Object A00;
    public final /* synthetic */ Object A01;

    public C11440gJ(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void run() {
        Object obj;
        Object[] objArr;
        try {
            Method method = AnonymousClass0W9.A04;
            if (method != null) {
                obj = this.A00;
                objArr = new Object[3];
                objArr[0] = this.A01;
                AnonymousClass000.A1N(objArr, 1, false);
                objArr[2] = "AppCompat recreation";
            } else {
                method = AnonymousClass0W9.A03;
                obj = this.A00;
                objArr = new Object[2];
                objArr[0] = this.A01;
                AnonymousClass000.A1N(objArr, 1, false);
            }
            method.invoke(obj, objArr);
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
