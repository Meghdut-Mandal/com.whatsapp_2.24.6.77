package X;

import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import java.util.Comparator;

/* renamed from: X.0t6  reason: invalid class name and case insensitive filesystem */
public class C18400t6 implements Comparator {
    public Object A00;
    public final int A01;

    public C18400t6(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.A01) {
            case 0:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 1:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                ViewGroup viewGroup = (ViewGroup) this.A00;
                return Integer.valueOf(viewGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(viewGroup.indexOfChild(materialButton2)));
            default:
                C006302t[] r4 = (C006302t[]) this.A00;
                AnonymousClass00C.A0D(r4, 0);
                int i = 0;
                do {
                    C006302t r0 = r4[i];
                    int A002 = C05590Qh.A00((Comparable) r0.invoke(obj), (Comparable) r0.invoke(obj2));
                    if (A002 != 0) {
                        return A002;
                    }
                    i++;
                } while (i < 3);
                return 0;
        }
    }
}
