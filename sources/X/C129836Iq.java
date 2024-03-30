package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Iq  reason: invalid class name and case insensitive filesystem */
public abstract class C129836Iq {
    public static final Map A00;
    public static final Map A01;

    public static void A00(View view, C1271967i r17, C140456lc r18, C140456lc r19) {
        C1271967i r3 = r17;
        C140456lc r4 = r18;
        C124705yf r11 = (C124705yf) C133266Xn.A05(r3, r4);
        if (r11 != null) {
            View view2 = view;
            r11.A03 = (String) view2.getContentDescription();
            r11.A00 = Integer.valueOf(view2.getImportantForAccessibility());
            r11.A01 = Integer.valueOf(C011304x.A00(view2));
            r11.A05 = view2.isFocusable();
            r11.A08 = view2.isSelected();
            r11.A04 = view2.isEnabled();
            r11.A06 = C012005e.A0c(view2);
            r11.A07 = C012005e.A0d(view2);
            C012005e.A0V(view2, new C95184kB(r3, r4, r19));
            String A0a = r4.A0a(35, r11.A03);
            Number A0b = C90524aI.A0b(C140456lc.A0O(r4), A00);
            Number A0b2 = C90524aI.A0b((String) C140456lc.A0I(r4, 44), A01);
            boolean A0f = r4.A0f(40, r11.A05);
            boolean A0f2 = r4.A0f(49, r11.A08);
            boolean A0f3 = r4.A0f(38, r11.A04);
            boolean A0f4 = r4.A0f(41, r11.A06);
            boolean A0f5 = r4.A0f(48, r11.A07);
            Object A0I = C140456lc.A0I(r4, 43);
            List A0d = r4.A0d(55);
            if (A0d != null && !A0d.isEmpty()) {
                Iterator it = A0d.iterator();
                while (it.hasNext()) {
                    C140456lc A0Y = C90514aH.A0Y(it);
                    String str = (String) C140456lc.A0I(A0Y, 35);
                    C160377ku A0X = A0Y.A0X(38);
                    if (str != null) {
                        Map map = C95184kB.A05;
                        if (map.containsKey(str)) {
                            int A06 = C90474aD.A06(str, map);
                            Object obj = map.get("click");
                            if (obj != null) {
                                int A0I2 = AnonymousClass000.A0I(obj);
                                Object obj2 = map.get("long_click");
                                if (obj2 != null) {
                                    int A0I3 = AnonymousClass000.A0I(obj2);
                                    if (A06 == A0I2) {
                                        if (A0X != null && Build.VERSION.SDK_INT <= 25) {
                                            r11.A09 = true;
                                            view2.setOnClickListener(new C135406ce(A0I2));
                                        }
                                    } else if (A06 == A0I3 && A0X != null) {
                                        r11.A0A = true;
                                        view2.setOnLongClickListener(new C135676d5(A0I3));
                                    }
                                } else {
                                    throw new AssertionError();
                                }
                            } else {
                                throw new AssertionError();
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            String str2 = r11.A02;
            view2.setContentDescription(A0a);
            r11.A02 = A0a;
            if ((A0b2 == null || A0b2.intValue() == 0) && !TextUtils.isEmpty(A0a) && !TextUtils.isEmpty(str2) && !A0a.equals(str2) && view2.isAccessibilityFocused()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                obtain.setContentChangeTypes(4);
                obtain.setContentDescription(A0a);
                view2.sendAccessibilityEventUnchecked(obtain);
            }
            if (A0b == null) {
                A0b = r11.A00;
            }
            view2.setImportantForAccessibility(A0b.intValue());
            if (A0b2 == null) {
                A0b2 = r11.A01;
            }
            C011304x.A01(view2, A0b2.intValue());
            view2.setFocusable(A0f);
            if (A0I != null) {
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    new Handler(myLooper).post(new C1503374w(A0I, r3, view2, 7));
                } else {
                    throw C36381kD.A0l();
                }
            }
            view2.setSelected(A0f2);
            view2.setEnabled(A0f3);
            C012005e.A0a(view2, A0f4);
            new C18130sf(0).A02(view2, Boolean.valueOf(A0f5));
            AnonymousClass6GQ.A01(r3, r19, r4.A0d(56));
        }
    }

    static {
        HashMap A0J = AnonymousClass001.A0J();
        Integer A0m = C36381kD.A0m();
        Integer A0J2 = C36331k8.A0J("auto", A0m, A0J);
        Integer A0K = C36331k8.A0K("yes", A0J2, A0J);
        A0J.put("no_hide_descendants", C36331k8.A0M("no", A0K, A0J));
        A00 = Collections.unmodifiableMap(A0J);
        HashMap A0J3 = AnonymousClass001.A0J();
        A0J3.put("none", A0m);
        A0J3.put("polite", A0J2);
        A0J3.put("assertive", A0K);
        A01 = Collections.unmodifiableMap(A0J3);
    }
}
