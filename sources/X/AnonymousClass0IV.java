package X;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0IV  reason: invalid class name */
public class AnonymousClass0IV extends C09980dT {
    public View A00;
    public C17070qf A01;

    public void Bje(AnonymousClass054 r3) {
        this.A01.setVisibility(4);
    }

    public void Bjf(AnonymousClass054 r3) {
        this.A01.setVisibility(0);
    }

    public AnonymousClass0IV(View view, C17070qf r2) {
        this.A00 = view;
        this.A01 = r2;
    }

    public void Bjd(AnonymousClass054 r8) {
        r8.A0B(this);
        View view = this.A00;
        if (Build.VERSION.SDK_INT == 28) {
            if (!C09970dS.A05) {
                try {
                    C09970dS.A00();
                    Method A0H = AnonymousClass001.A0H(C09970dS.A01, View.class, "removeGhost", new Class[1], 0);
                    C09970dS.A03 = A0H;
                    A0H.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e);
                }
                C09970dS.A05 = true;
            }
            Method method = C09970dS.A03;
            if (method != null) {
                try {
                    method.invoke((Object) null, new Object[]{view});
                } catch (IllegalAccessException unused) {
                } catch (InvocationTargetException e2) {
                    throw AnonymousClass001.A0B(e2.getCause());
                }
            }
        } else {
            AnonymousClass0ET r1 = (AnonymousClass0ET) view.getTag(R.id.ghost_view);
            if (r1 != null) {
                int i = r1.A02 - 1;
                r1.A02 = i;
                if (i <= 0) {
                    ((ViewGroup) r1.getParent()).removeView(r1);
                }
            }
        }
        view.setTag(R.id.transition_transform, (Object) null);
        view.setTag(R.id.parent_matrix, (Object) null);
    }
}
