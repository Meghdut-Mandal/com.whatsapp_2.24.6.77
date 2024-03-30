package X;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: X.0Y2  reason: invalid class name */
public class AnonymousClass0Y2 {
    public static final ArrayList A03 = AnonymousClass001.A0I();
    public SparseArray A00 = null;
    public WeakReference A01 = null;
    public WeakHashMap A02 = null;

    public static View A00(KeyEvent keyEvent, View view, AnonymousClass0Y2 r6) {
        int size;
        View A002;
        WeakHashMap weakHashMap = r6.A02;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        A002 = A00(keyEvent, viewGroup.getChildAt(childCount), r6);
                    }
                } while (A002 == null);
                return A002;
            }
            AbstractList abstractList = (AbstractList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (abstractList != null && (size = abstractList.size() - 1) >= 0) {
                abstractList.get(size);
                throw AnonymousClass001.A0A("onUnhandledKeyEvent");
            }
        }
        return null;
    }
}
