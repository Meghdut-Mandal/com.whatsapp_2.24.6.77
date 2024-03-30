package X;

import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.3Me  reason: invalid class name and case insensitive filesystem */
public abstract class C63983Me {
    public static HashMap A00 = AnonymousClass001.A0J();

    public static void A00(AnonymousClass17Y r9, C145166tS r10, C18820ts r11, C20810yC r12, C21010yW r13, C87924Qs r14, C19770wU r15, String str, boolean z) {
        C145166tS r0;
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            r0 = C64033Mj.A00(str2);
            boolean z2 = z;
            if (r0 != null) {
                r0.A0M = z2;
                if (r14 == null) {
                    return;
                }
            } else {
                HashMap hashMap = A00;
                AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str2);
                if (abstractCollection != null) {
                    abstractCollection.add(r14);
                    return;
                }
                ArrayList A14 = C36441kJ.A14(1);
                A14.add(r14);
                hashMap.put(str2, A14);
                r10.A0M = z2;
                r15.Boy(new AVr(r10, r11, r12, r9, r13, str2, 0));
                return;
            }
        } else if (r14 != null) {
            r0 = null;
        } else {
            return;
        }
        r14.Bc9(r0, true);
    }
}
