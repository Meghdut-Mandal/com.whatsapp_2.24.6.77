package X;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.6oF  reason: invalid class name and case insensitive filesystem */
public class C142046oF implements AnonymousClass7fE {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public View A0B;
    public ViewTreeObserver.OnPreDrawListener A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;

    public boolean BqD(C1271967i r6, Object obj, int i) {
        float f;
        float f2;
        if (i == 35) {
            float A032 = C36441kJ.A03(obj);
            this.A07 = A032;
            View view = this.A0B;
            if (view != null) {
                view.setScaleX(A032);
                return true;
            }
        } else if (i == 36) {
            float A033 = C36441kJ.A03(obj);
            this.A08 = A033;
            View view2 = this.A0B;
            if (view2 != null) {
                view2.setScaleY(A033);
                return true;
            }
        } else if (i == 38) {
            try {
                String str = (String) obj;
                if (str == null) {
                    f = 0.0f;
                } else {
                    f = AnonymousClass6Y7.A01(str);
                }
                this.A09 = f;
                this.A0H = C90514aH.A1Z(str);
            } catch (AnonymousClass5R5 e) {
                AnonymousClass6RS.A00(r6, "ViewTransformsExtensionBinderUtils", "Could not parse translation_x value. ", e);
            }
            View view3 = this.A0B;
            if (view3 != null) {
                view3.setTranslationX(C90514aH.A02(this.A09, C36441kJ.A01(view3), this.A0H ? 1 : 0));
                return true;
            }
        } else if (i == 138) {
            float A034 = C36441kJ.A03(obj);
            this.A04 = A034;
            View view4 = this.A0B;
            if (view4 != null) {
                view4.setRotation(A034);
                return true;
            }
        } else if (i != 141) {
            switch (i) {
                case 40:
                    try {
                        String str2 = (String) obj;
                        if (str2 == null) {
                            f2 = 0.0f;
                        } else {
                            f2 = AnonymousClass6Y7.A01(str2);
                        }
                        this.A0A = f2;
                        this.A0I = C90514aH.A1Z(str2);
                    } catch (AnonymousClass5R5 e2) {
                        AnonymousClass6RS.A00(r6, "ViewTransformsExtensionBinderUtils", "Could not parse translation_y value. ", e2);
                    }
                    View view5 = this.A0B;
                    if (view5 != null) {
                        view5.setTranslationY(C90514aH.A02(this.A0A, C36441kJ.A02(view5), this.A0I ? 1 : 0));
                        break;
                    }
                    break;
                case 41:
                    try {
                        String str3 = (String) obj;
                        this.A02 = AnonymousClass6Y7.A01(str3);
                        this.A0F = C90514aH.A1Z(str3);
                        this.A0E = true;
                    } catch (AnonymousClass5R5 e3) {
                        AnonymousClass6RS.A00(r6, "ViewTransformsExtensionBinderUtils", "Could not parse pivot_x value. ", e3);
                    }
                    View view6 = this.A0B;
                    if (view6 != null) {
                        view6.setPivotX(C90514aH.A02(this.A02, C36441kJ.A01(view6), this.A0F ? 1 : 0));
                        return true;
                    }
                    break;
                case 42:
                    try {
                        String str4 = (String) obj;
                        this.A03 = AnonymousClass6Y7.A01(str4);
                        this.A0G = C90514aH.A1Z(str4);
                        this.A0E = true;
                    } catch (AnonymousClass5R5 e4) {
                        AnonymousClass6RS.A00(r6, "ViewTransformsExtensionBinderUtils", "Could not parse pivot_y value. ", e4);
                    }
                    View view7 = this.A0B;
                    if (view7 != null) {
                        view7.setPivotY(C90514aH.A02(this.A03, C36441kJ.A02(view7), this.A0G ? 1 : 0));
                        return true;
                    }
                    break;
                case 43:
                    this.A01 = C36441kJ.A03(obj);
                    View view8 = this.A0B;
                    if (view8 != null) {
                        Context context = view8.getContext();
                        float f3 = this.A01;
                        if (f3 == 0.0f) {
                            f3 = 2.14748365E9f;
                        }
                        float A002 = C36341k9.A00(context);
                        view8.setCameraDistance(A002 * A002 * (-f3) * AnonymousClass6RT.A00);
                        return true;
                    }
                    break;
                case 44:
                    float A035 = C36441kJ.A03(obj);
                    this.A05 = A035;
                    View view9 = this.A0B;
                    if (view9 != null) {
                        view9.setRotationX(A035);
                        return true;
                    }
                    break;
                case 45:
                    float A036 = C36441kJ.A03(obj);
                    this.A06 = A036;
                    View view10 = this.A0B;
                    if (view10 != null) {
                        view10.setRotationY(A036);
                        return true;
                    }
                    break;
                default:
                    return false;
            }
        } else {
            float A037 = C36441kJ.A03(obj);
            this.A00 = A037;
            View view11 = this.A0B;
            if (view11 != null) {
                view11.setAlpha(A037);
                return true;
            }
        }
        return true;
    }
}
