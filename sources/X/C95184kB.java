package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4kB  reason: invalid class name and case insensitive filesystem */
public class C95184kB extends C011705b {
    public static final Map A05;
    public static final Map A06;
    public static final Map A07;
    public static final Map A08;
    public int A00 = 1056964608;
    public final C140456lc A01;
    public final C1271967i A02;
    public final C140456lc A03;
    public final Map A04;

    public static Integer A02(AnonymousClass0Yd r0) {
        return Integer.valueOf(((AccessibilityNodeInfo.AccessibilityAction) r0.A03).getId());
    }

    public boolean A0j(View view, int i, Bundle bundle) {
        C160377ku r5;
        String str;
        C120805s6 r0 = (C120805s6) C36371kC.A0r(this.A04, i);
        if (r0 == null || (r5 = r0.A01) == null) {
            return super.A0j(view, i, bundle);
        }
        C140456lc r3 = this.A03;
        Object A002 = AnonymousClass6JI.A00(C100674vP.A00(this.A02, r5, r3.A08), C1273868b.A04(C1273868b.A00(), r3, 0), r5);
        if ((A002 instanceof Number) || (A002 instanceof Boolean)) {
            return C129316Gk.A01(A002);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        if (A002 != null) {
            str = "Got a non-boolean result while evaluating action ";
        } else {
            str = "Got a null result while evaluating action ";
        }
        AnonymousClass6RS.A01("bk.components.AndroidNativeAccessibilityExtension", AnonymousClass000.A0r(str, A0u, i));
        return false;
    }

    public void A0k(View view, C07650Ys r25) {
        Number A0b;
        Number A0b2;
        C07650Ys r9 = r25;
        super.A0k(view, r9);
        C140456lc r2 = this.A01;
        boolean A0f = r2.A0f(41, false);
        boolean A0f2 = r2.A0f(49, false);
        boolean A0f3 = r2.A0f(51, false);
        boolean A0f4 = r2.A0f(36, false);
        String str = (String) C140456lc.A0I(r2, 50);
        String str2 = (String) C140456lc.A0I(r2, 45);
        String str3 = (String) C140456lc.A0I(r2, 46);
        String str4 = (String) C140456lc.A0I(r2, 58);
        String str5 = (String) C140456lc.A0I(r2, 57);
        C140456lc A0W = r2.A0W(52);
        C140456lc A0W2 = r2.A0W(53);
        C140456lc A0W3 = r2.A0W(54);
        if (A0W != null) {
            String str6 = (String) C140456lc.A0I(A0W, 40);
            float A0S = A0W.A0S(38, -1.0f);
            float A0S2 = A0W.A0S(36, -1.0f);
            float A0S3 = A0W.A0S(35, -1.0f);
            if (A0S >= 0.0f && A0S3 >= 0.0f && A0S2 >= 0.0f && (A0b2 = C90524aI.A0b(str6, A07)) != null) {
                r9.A02.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(A0b2.intValue(), A0S, A0S2, A0S3));
            }
        }
        if (A0W2 != null) {
            int A0T = A0W2.A0T(35, -1);
            int A0T2 = A0W2.A0T(38, -1);
            boolean A0f5 = A0W2.A0f(36, false);
            String A0a = A0W2.A0a(40, "none");
            if (A0T >= -1 && A0T2 >= -1 && (A0b = C90524aI.A0b(A0a, A06)) != null) {
                r9.A0J(new AnonymousClass0SK(AccessibilityNodeInfo.CollectionInfo.obtain(A0T2, A0T, A0f5, A0b.intValue())));
            }
        }
        if (A0W3 != null) {
            int A0T3 = A0W3.A0T(35, -1);
            int A0T4 = A0W3.A0T(38, -1);
            int A0T5 = A0W3.A0T(36, -1);
            int A0T6 = A0W3.A0T(40, -1);
            if (A0T3 >= 0 && A0T4 >= 0 && A0T5 >= 0 && A0T6 >= 0) {
                r9.A0K(new AnonymousClass0SL(AccessibilityNodeInfo.CollectionItemInfo.obtain(A0T4, A0T6, A0T3, A0T5, A0f, A0f2)));
            }
        }
        Iterator A0z = AnonymousClass000.A0z(this.A04);
        while (A0z.hasNext()) {
            C120805s6 r11 = (C120805s6) A0z.next();
            int i = r11.A00;
            Map map = A05;
            if (map.containsKey("click") && i == C90474aD.A06("click", map)) {
                r9.A0L(true);
            } else if (map.containsKey("long_click") && i == C90474aD.A06("long_click", map)) {
                r9.A02.setLongClickable(true);
            }
            String str7 = r11.A02;
            if (str7 != null) {
                r9.A0A(new AnonymousClass0Yd(i, (CharSequence) str7));
            } else {
                r9.A02.addAction(i);
            }
        }
        if (A0f3) {
            AccessibilityNodeInfo accessibilityNodeInfo = r9.A02;
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(A0f4);
        }
        if (str != null) {
            r9.A0I(str);
        }
        if (str2 != null && !str2.equals("none")) {
            Map map2 = A08;
            if (map2.containsKey(str2)) {
                r9.A0C((CharSequence) map2.get(str2));
            }
        }
        if (str3 != null) {
            r9.A0G(str3);
        }
        if (str4 != null) {
            r9.A0H(str4);
        }
        if (str5 != null && !str5.isEmpty()) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = r9.A02;
            accessibilityNodeInfo2.setContentInvalid(true);
            accessibilityNodeInfo2.setError(str5);
        }
    }

    static {
        HashMap A0J = AnonymousClass001.A0J();
        A0J.put("button", "android.widget.Button");
        A0J.put("checkbox", "android.widget.CompoundButton");
        A0J.put("checked_text_view", "android.widget.CheckedTextView");
        A0J.put("drop_down_list", "android.widget.Spinner");
        A0J.put("edit_text", "android.widget.EditText");
        A0J.put("grid", "android.widget.GridView");
        A0J.put("image", "android.widget.ImageView");
        A0J.put("list", "android.widget.AbsListView");
        A0J.put("pager", "androidx.viewpager.widget.ViewPager");
        A0J.put("radio_button", "android.widget.RadioButton");
        A0J.put("seek_control", "android.widget.SeekBar");
        A0J.put("switch", "android.widget.Switch");
        A0J.put("tab_bar", "android.widget.TabWidget");
        A0J.put("toggle_button", "android.widget.ToggleButton");
        A0J.put("view_group", "android.view.ViewGroup");
        A0J.put("web_view", "android.webkit.WebView");
        A0J.put("progress_bar", "android.widget.ProgressBar");
        A0J.put("action_bar_tab", "android.app.ActionBar$Tab");
        A0J.put("drawer_layout", "androidx.drawerlayout.widget.DrawerLayout");
        A0J.put("sliding_drawer", "android.widget.SlidingDrawer");
        A0J.put("icon_menu", "com.android.internal.view.menu.IconMenuView");
        A0J.put("toast", "android.widget.Toast$TN");
        A0J.put("alert_dialog", "android.app.AlertDialog");
        A0J.put("date_picker_dialog", "android.app.DatePickerDialog");
        A0J.put("time_picker_dialog", "android.app.TimePickerDialog");
        A0J.put("date_picker", "android.widget.DatePicker");
        A0J.put("time_picker", "android.widget.TimePicker");
        A0J.put("number_picker", "android.widget.NumberPicker");
        A0J.put("scroll_view", "android.widget.ScrollView");
        A0J.put("horizontal_scroll_view", "android.widget.HorizontalScrollView");
        A0J.put("keyboard_key", "android.inputmethodservice.Keyboard$Key");
        A0J.put("none", "");
        A08 = Collections.unmodifiableMap(A0J);
        HashMap A0J2 = AnonymousClass001.A0J();
        A0J2.put("click", A02(AnonymousClass0Yd.A08));
        A0J2.put("long_click", A02(AnonymousClass0Yd.A0L));
        A0J2.put("scroll_forward", A02(AnonymousClass0Yd.A0Z));
        A0J2.put("scroll_backward", A02(AnonymousClass0Yd.A0X));
        A0J2.put("expand", A02(AnonymousClass0Yd.A0H));
        A0J2.put("collapse", A02(AnonymousClass0Yd.A09));
        A0J2.put("dismiss", A02(AnonymousClass0Yd.A0D));
        A0J2.put("scroll_up", A02(AnonymousClass0Yd.A0e));
        A0J2.put("scroll_left", A02(AnonymousClass0Yd.A0b));
        A0J2.put("scroll_down", A02(AnonymousClass0Yd.A0Y));
        A0J2.put("scroll_right", A02(AnonymousClass0Yd.A0c));
        A0J2.put("custom", C90494aF.A0U());
        A05 = Collections.unmodifiableMap(A0J2);
        HashMap A0J3 = AnonymousClass001.A0J();
        Integer A0j = C36361kB.A0j();
        Integer A0J4 = C36331k8.A0J("percent", A0j, A0J3);
        A0J3.put("float", A0J4);
        Integer A0m = C36381kD.A0m();
        A0J3.put("int", A0m);
        A07 = Collections.unmodifiableMap(A0J3);
        HashMap A0J5 = AnonymousClass001.A0J();
        A0J5.put("none", A0m);
        A0J5.put("single", A0J4);
        A0J5.put("multiple", A0j);
        A06 = Collections.unmodifiableMap(A0J5);
    }

    public C95184kB(C1271967i r9, C140456lc r10, C140456lc r11) {
        this.A01 = r10;
        this.A03 = r11;
        this.A02 = r9;
        HashMap A0J = AnonymousClass001.A0J();
        List A0c = r10.A0c(55);
        if (A0c != null && !A0c.isEmpty()) {
            Iterator it = A0c.iterator();
            while (it.hasNext()) {
                C140456lc A0Y = C90514aH.A0Y(it);
                String A0J2 = C140456lc.A0J(A0Y);
                String A0K = C140456lc.A0K(A0Y);
                C160377ku A0X = A0Y.A0X(38);
                if (A0J2 != null) {
                    Map map = A05;
                    if (map.containsKey(A0J2)) {
                        int A062 = C90474aD.A06(A0J2, map);
                        if (map.containsKey("custom") && A062 == C90474aD.A06("custom", map)) {
                            A062 = this.A00;
                            this.A00 = A062 + 1;
                        }
                        A0J.put(Integer.valueOf(A062), new C120805s6(A0X, A0K, A062));
                    }
                }
            }
        }
        this.A04 = A0J;
    }
}
