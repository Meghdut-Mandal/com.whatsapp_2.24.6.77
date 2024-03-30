package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0bj  reason: invalid class name and case insensitive filesystem */
public class C09040bj implements View.OnClickListener {
    public Context A00;
    public Method A01;
    public final View A02;
    public final String A03;

    public void onClick(View view) {
        String A0q;
        Method method = this.A01;
        if (method == null) {
            View view2 = this.A02;
            for (Context context = view2.getContext(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
                try {
                    if (!context.isRestricted() && (method = AnonymousClass001.A0G(context.getClass(), View.class, this.A03, new Class[1], 0)) != null) {
                        this.A01 = method;
                        this.A00 = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
            }
            int id = view2.getId();
            if (id == -1) {
                A0q = "";
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(" with id '");
                A0u.append(view2.getContext().getResources().getResourceEntryName(id));
                A0q = AnonymousClass000.A0q("'", A0u);
            }
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("Could not find method ");
            A0u2.append(this.A03);
            A0u2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            A0u2.append(view2.getClass());
            throw AnonymousClass000.A0g(A0q, A0u2);
        }
        try {
            method.invoke(this.A00, AnonymousClass000.A1b(view));
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }

    public C09040bj(View view, String str) {
        this.A02 = view;
        this.A03 = str;
    }
}
