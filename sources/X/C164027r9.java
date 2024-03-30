package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.whatsapp.location.WaMapView;

/* renamed from: X.7r9  reason: invalid class name and case insensitive filesystem */
public class C164027r9 implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C164027r9(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public boolean onPreDraw() {
        View view;
        switch (this.A02) {
            case 0:
                EditText editText = (EditText) this.A01;
                C36351kA.A1D(editText, this);
                editText.setSelection(editText.length());
                return true;
            case 1:
                C142046oF r4 = (C142046oF) this.A00;
                if (r4.A0D && r4.A0B == (view = (View) this.A01)) {
                    view.setTranslationX(C90514aH.A02(r4.A09, C36441kJ.A01(view), r4.A0H ? 1 : 0));
                    view.setTranslationY(C90514aH.A02(r4.A0A, C36441kJ.A02(view), r4.A0I ? 1 : 0));
                    if (r4.A0E) {
                        view.setPivotX(C90514aH.A02(r4.A02, C36441kJ.A01(view), r4.A0F ? 1 : 0));
                        view.setPivotY(C90514aH.A02(r4.A03, C36441kJ.A02(view), r4.A0G ? 1 : 0));
                    }
                }
                C36351kA.A1D((View) this.A01, this);
                return true;
            default:
                WaMapView waMapView = (WaMapView) this.A00;
                C92744eX r0 = waMapView.A01;
                C18740tg.A04(r0);
                C36351kA.A1D(r0, this);
                waMapView.A01.post(new C1503074t((Object) this, 14));
                return true;
        }
    }
}
