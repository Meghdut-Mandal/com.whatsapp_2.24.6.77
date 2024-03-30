package X;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ViewOutlineProvider;
import java.io.IOException;
import java.util.Objects;

/* renamed from: X.6mA  reason: invalid class name and case insensitive filesystem */
public class C140786mA implements C160347kr {
    public static final void A00(C1271967i r10, C140456lc r11, C98114qt r12, C98194r2 r13) {
        float A01;
        float A012;
        int i;
        float A013;
        C36321k7.A16(r12, r11, r10, 1);
        if (Build.VERSION.SDK_INT >= 28) {
            C118885ot r0 = r13.A06;
            AnonymousClass00C.A07(r0);
            C131786Qp.A01(r12, r0);
        }
        String str = (String) C140456lc.A0I(r11, 48);
        if (str != null) {
            float A014 = AnonymousClass6Y7.A01(str);
            if (A014 != 0.0f) {
                r12.setElevation(A014);
                r12.setOutlineProvider(new C162417oY(r11, 0));
                if (Build.VERSION.SDK_INT >= 28) {
                    C118885ot r02 = r13.A06;
                    AnonymousClass00C.A07(r02);
                    C131786Qp.A00(r10, r11, r12, r02);
                }
            }
        }
        String str2 = (String) C140456lc.A0I(r11, 46);
        if (str2 == null) {
            A01 = 0.0f;
        } else {
            A01 = AnonymousClass6Y7.A01(str2);
        }
        int i2 = (A01 > 0.0f ? 1 : (A01 == 0.0f ? 0 : -1));
        if (r11.A0f(43, false)) {
            if (i2 != 0) {
                r12.setOutlineProvider(new C92454e0(r11, A01));
                String A0M = C140456lc.A0M(r11);
                if (A0M == null) {
                    A012 = 0.0f;
                } else {
                    A012 = AnonymousClass6Y7.A01(A0M);
                }
                int A00 = C131796Qq.A00(r11.A0d(56), 0);
                if (A012 != 0.0f || !C131796Qq.A02(A00)) {
                    C124855yu r5 = r12.A00;
                    r5.A04 = true;
                    r5.A0B.setLayerType(2, (Paint) null);
                    C140456lc A0W = r11.A0W(45);
                    String str3 = (String) C140456lc.A0I(r11, 44);
                    if (str3 != null) {
                        i = AnonymousClass6Y7.A04(str3);
                    } else {
                        i = 0;
                    }
                    if (A0W != null) {
                        try {
                            String str4 = (String) C140456lc.A0I(A0W, 35);
                            if (str4 == null || AnonymousClass6Y7.A04(str4) == 0) {
                                String A0K = C140456lc.A0K(A0W);
                                if (A0K != null) {
                                    if (AnonymousClass6Y7.A04(A0K) == 0) {
                                    }
                                }
                            }
                        } catch (AnonymousClass5R5 unused) {
                            AnonymousClass6RS.A01("ThemedColorUtils", "Error parsing themed color");
                        }
                        i = AnonymousClass5Z8.A00(r10, A0W);
                    }
                    int A002 = C131776Qo.A00(r10, r11);
                    float[] A02 = C131776Qo.A02(r11.A0d(62));
                    String str5 = (String) C140456lc.A0I(r11, 63);
                    if (str5 == null) {
                        A013 = 0.0f;
                    } else {
                        A013 = AnonymousClass6Y7.A01(str5);
                    }
                    r5.A03 = A00;
                    r5.A02 = A01;
                    Paint paint = r5.A06;
                    paint.setColor(i);
                    if (i == 0) {
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    }
                    int i3 = (A012 > 0.0f ? 1 : (A012 == 0.0f ? 0 : -1));
                    Paint paint2 = r5.A05;
                    if (i3 != 0) {
                        paint2.setColor(A002);
                    } else {
                        paint2.setColor(0);
                    }
                    C36421kH.A0q(paint2);
                    paint2.setStrokeWidth(A012);
                    if (i3 > 0 && A02 != null) {
                        paint2.setPathEffect(new DashPathEffect(A02, A013));
                    }
                    Path path = r5.A08;
                    path.setFillType(Path.FillType.EVEN_ODD);
                    float f = A012 / 2.0f;
                    r5.A00 = f;
                    r5.A01 = r5.A02 - f;
                    path.reset();
                    return;
                }
                r12.setClipToOutline(true);
            }
        } else if (i2 != 0) {
            r12.setOutlineProvider(new C162417oY(r11, 1));
        }
    }

    public static final void A01(C98114qt r2, C98194r2 r3) {
        r2.setElevation(0.0f);
        r2.setClipToOutline(false);
        r2.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        if (Build.VERSION.SDK_INT >= 28) {
            C118885ot r0 = r3.A06;
            AnonymousClass00C.A07(r0);
            C131786Qp.A02(r2, r0);
        }
    }

    public /* bridge */ /* synthetic */ Object B1l(Context context, Object obj, Object obj2, Object obj3) {
        C98134qw r6 = (C98134qw) obj;
        C98194r2 r7 = (C98194r2) obj2;
        if (r7.A05 != null) {
            try {
                C1271967i r1 = r7.A09;
                Objects.requireNonNull(r1);
                A00(r1, r7.A05, (C98114qt) r6, r7);
                Drawable drawable = r7.A03;
                Drawable drawable2 = r7.A02;
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
                if (drawable2 instanceof Animatable) {
                    ((Animatable) drawable2).start();
                    return null;
                }
            } catch (IOException e) {
                AnonymousClass6RS.A00((C1271967i) null, "HostWithDecoratorRenderUnit", "Parse exception while binding Box Decoration", e);
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void BwG(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C98134qw r5 = (C98134qw) obj;
        C98194r2 r6 = (C98194r2) obj2;
        if (r6.A05 != null) {
            C98114qt r52 = (C98114qt) r5;
            C124855yu r0 = r52.A00;
            r0.A04 = false;
            r0.A0B.setLayerType(0, (Paint) null);
            A01(r52, r6);
            Drawable drawable = r6.A03;
            Drawable drawable2 = r6.A02;
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            if (drawable2 instanceof Animatable) {
                ((Animatable) drawable2).stop();
            }
        }
    }

    public /* synthetic */ String BB1() {
        return AnonymousClass5YX.A01(this);
    }

    public /* bridge */ /* synthetic */ boolean BtZ(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
