package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.5YW  reason: invalid class name */
public abstract class AnonymousClass5YW {
    public static void A00(Context context, View view, C07650Ys r5, String str) {
        if (str != null) {
            short s = -1;
            switch (str.hashCode()) {
                case -2137403731:
                    s = C90504aG.A0y("Header", str);
                    break;
                case -565577257:
                    s = C90514aH.A1B("Image Button", str);
                    break;
                case 2368538:
                    s = C90514aH.A1C("Link", str);
                    break;
                case 70760763:
                    if (str.equals("Image")) {
                        s = 3;
                        break;
                    }
                    break;
                case 109450440:
                    if (str.equals("Tab Bar")) {
                        s = 4;
                        break;
                    }
                    break;
                case 1404906583:
                    if (str.equals("Selected Button")) {
                        s = 5;
                        break;
                    }
                    break;
                case 2001146706:
                    if (str.equals("Button")) {
                        s = 6;
                        break;
                    }
                    break;
            }
            String str2 = "android.widget.Button";
            switch (s) {
                case 0:
                    r5.A0M(true);
                    if (view != null) {
                        C012005e.A0a(view, true);
                        return;
                    }
                    return;
                case 1:
                case 6:
                    break;
                case 2:
                    r5.A0C(str2);
                    r5.A0G(context.getString(C108815Va.accessibility_link_role));
                    return;
                case 3:
                    r5.A0C("android.widget.ImageView");
                    r5.A0B(AnonymousClass0Yd.A0f);
                    return;
                case 4:
                    str2 = "android.widget.TabWidget";
                    break;
                case 5:
                    r5.A0C(str2);
                    r5.A02.setSelected(true);
                    return;
                default:
                    return;
            }
            r5.A0C(str2);
        }
    }
}
