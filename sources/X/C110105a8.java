package X;

import android.app.Activity;
import com.whatsapp.RequestPermissionActivity;
import java.util.HashMap;
import java.util.Stack;

/* renamed from: X.5a8  reason: invalid class name and case insensitive filesystem */
public abstract class C110105a8 {
    public static void A00(Activity activity, AnonymousClass6Q3 r8, C594233w r9, HashMap hashMap) {
        C158017ff r6 = (C158017ff) activity;
        Object remove = hashMap.remove("clear_backstack");
        Object remove2 = hashMap.remove("get_params_from_stack");
        Object remove3 = hashMap.remove("camera_permission");
        Stack stack = r8.A02;
        HashMap hashMap2 = new HashMap((HashMap) stack.peek());
        if (remove2 != null) {
            hashMap2.putAll(hashMap);
            hashMap = hashMap2;
        }
        if (remove != null) {
            AnonymousClass01z supportFragmentManager = ((AnonymousClass01I) r6).getSupportFragmentManager();
            for (int i = 0; i < supportFragmentManager.A0I(); i++) {
                supportFragmentManager.A0V();
                AnonymousClass6Q3.A00(r8.A01);
                stack.pop();
            }
        }
        AnonymousClass6Q3.A00(r8.A01);
        stack.add(AnonymousClass001.A0J());
        r8.A03(hashMap);
        C160377ku r2 = r9.A01;
        if (r2 != null) {
            r8.A01(r9.A00, r2, "backpress");
        }
        if (remove3 != null) {
            C179158jJ r7 = (C179158jJ) ((C159987kH) activity);
            RequestPermissionActivity.A0I(r7, r7.A03, 30);
        }
    }
}
