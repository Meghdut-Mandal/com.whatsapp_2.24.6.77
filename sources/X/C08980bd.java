package X;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: X.0bd  reason: invalid class name and case insensitive filesystem */
public class C08980bd implements MenuItem.OnMenuItemClickListener {
    public static final Class[] A02 = {MenuItem.class};
    public Object A00;
    public Method A01;

    public boolean onMenuItemClick(MenuItem menuItem) {
        try {
            Method method = this.A01;
            if (method.getReturnType() == Boolean.TYPE) {
                return AnonymousClass000.A1Y(this.A00, method, new Object[]{menuItem});
            }
            method.invoke(this.A00, new Object[]{menuItem});
            return true;
        } catch (Exception e) {
            throw AnonymousClass001.A0B(e);
        }
    }

    public C08980bd(Object obj, String str) {
        this.A00 = obj;
        Class<?> cls = obj.getClass();
        try {
            this.A01 = cls.getMethod(str, A02);
        } catch (Exception e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Couldn't resolve menu item onClick handler ");
            A0u.append(str);
            A0u.append(" in class ");
            InflateException inflateException = new InflateException(AnonymousClass000.A0q(cls.getName(), A0u));
            inflateException.initCause(e);
            throw inflateException;
        }
    }
}
