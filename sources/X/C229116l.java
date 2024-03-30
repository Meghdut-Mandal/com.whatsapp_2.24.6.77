package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.16l  reason: invalid class name and case insensitive filesystem */
public class C229116l extends LayoutInflater {
    public static final String[] A01 = {"android.widget.", "android.webkit."};
    public final C18820ts A00;

    public LayoutInflater cloneInContext(Context context) {
        return new C229116l(context, this, this.A00);
    }

    public View onCreateView(String str, AttributeSet attributeSet) {
        String[] strArr = A01;
        int i = 0;
        while (i < 2) {
            try {
                View createView = createView(str, strArr[i], attributeSet);
                if (createView != null) {
                    return createView;
                }
                i++;
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.onCreateView(str, attributeSet);
    }

    public C229116l(Context context, LayoutInflater layoutInflater, C18820ts r3) {
        super(layoutInflater, context);
        this.A00 = r3;
    }

    public View inflate(int i, ViewGroup viewGroup, boolean z) {
        View inflate = super.inflate(i, viewGroup, z);
        C18820ts r4 = this.A00;
        if (!(inflate instanceof AnonymousClass043)) {
            if (!z || inflate.getTag(R.id.bidilayout_ignore) == null) {
                AnonymousClass1JZ.A04(inflate, r4);
            } else if (inflate instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) inflate;
                int childCount = viewGroup2.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    AnonymousClass1JZ.A04(viewGroup2.getChildAt(i2), r4);
                }
            }
            inflate.setTag(R.id.bidilayout_ignore, AnonymousClass1JZ.A00);
        }
        return inflate;
    }
}
