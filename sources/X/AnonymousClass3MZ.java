package X;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;

/* renamed from: X.3MZ  reason: invalid class name */
public abstract class AnonymousClass3MZ {
    public static void A00(Toolbar toolbar) {
        String str;
        if (toolbar == null) {
            Log.e("ToolbarUtils/toolbar is null");
            return;
        }
        try {
            Field declaredField = Toolbar.class.getDeclaredField("mTitleTextView");
            declaredField.setAccessible(true);
            C012005e.A0a((View) declaredField.get(toolbar), true);
        } catch (NoSuchFieldException e) {
            e = e;
            str = "ToolbarUtils/NoSuchFieldException";
            Log.e(str, e);
        } catch (IllegalAccessException e2) {
            e = e2;
            str = "ToolbarUtils/IllegalAccessException";
            Log.e(str, e);
        } catch (NullPointerException e3) {
            e = e3;
            str = "ToolbarUtils/NullPointerException";
            Log.e(str, e);
        }
    }

    public static void A01(Toolbar toolbar, C18820ts r3, String str) {
        C36331k8.A0s(toolbar.getContext(), toolbar, r3, R.drawable.ic_back);
        Context context = toolbar.getContext();
        AnonymousClass00C.A0D(context, 0);
        toolbar.setBackgroundResource(C224314h.A00(context));
        toolbar.A0J(toolbar.getContext(), R.style.f13nameremoved);
        A00(toolbar);
        toolbar.setTitle((CharSequence) str);
    }
}
