package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wabloks.commerce.interpreter.actions.FetchCatalogAction$perform$1$2;
import java.util.List;
import java.util.Map;

/* renamed from: X.71G  reason: invalid class name */
public final class AnonymousClass71G implements C158717hx {
    public final AnonymousClass60W A00;
    public final C1258061i A01;
    public final C19770wU A02;
    public final C005502l A03;
    public final AnonymousClass17Y A04;
    public final C20050ww A05;
    public final C19600wD A06;
    public final C19420v0 A07;
    public final C20310xM A08;
    public final C20810yC A09;
    public final AnonymousClass19A A0A;
    public final AnonymousClass040 A0B;

    private final void A02(Activity activity, C594233w r11, String str, Map map, boolean z) {
        C13620kA.A0F(map);
        Activity activity2 = activity;
        this.A04.A0H(new C1499673l(activity2, this, r11, map, str, 1, z));
    }

    public static final void A00(Activity activity, C594233w r3, C123815x8 r4, AnonymousClass71G r5, boolean z) {
        AnonymousClass71G r1 = r5;
        if (r4.A00 == 0) {
            r1.A02(activity, r3, "success", C131866Qy.A01((String) r4.A03.A00), z);
        } else {
            A01(activity, r3, r5, z);
        }
    }

    public void BlS(Activity activity, C594233w r24, Map map) {
        Intent intent;
        Bundle extras;
        Object obj;
        boolean z;
        Activity activity2 = activity;
        if (activity != null && (intent = activity2.getIntent()) != null && (extras = intent.getExtras()) != null) {
            UserJid A0l = C36431kI.A0l(extras.getString("chat_id"));
            C594233w r9 = r24;
            if (A0l != null) {
                Map map2 = map;
                if (map != null && map2.containsKey("catalog_id") && map2.containsKey("retailer_ids")) {
                    Object obj2 = map2.get("retailer_ids");
                    AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
                    List A012 = C07710Yz.A01(obj2);
                    String A0a = C90464aC.A0a("catalog_id", map2);
                    Object obj3 = "360";
                    if (map2.containsKey("height")) {
                        obj = map2.get("height");
                    } else {
                        obj = obj3;
                    }
                    if (map2.containsKey("width")) {
                        obj3 = map2.get("width");
                    }
                    if (map2.containsKey("show_full_screen_error")) {
                        z = C90464aC.A1a(map2, "show_full_screen_error");
                    } else {
                        z = false;
                    }
                    AnonymousClass00C.A0B(A0l);
                    C199899gC r8 = new C199899gC(A0l, String.valueOf(obj3), String.valueOf(obj), A012);
                    if (this.A09.A0E(5764)) {
                        C36331k8.A1T(new FetchCatalogAction$perform$1$2(activity2, r8, r9, this, A0a, (C023509x) null, z), this.A0B);
                        return;
                    }
                    this.A02.Boy(new C1499673l(this, r8, activity2, r9, A0a, 0, z));
                    return;
                }
            }
            A02(activity2, r9, "error", C000400e.A0D(), true);
        }
    }

    public AnonymousClass71G(AnonymousClass60W r1, AnonymousClass17Y r2, C20050ww r3, C1258061i r4, C19600wD r5, C19420v0 r6, C20310xM r7, C20810yC r8, AnonymousClass19A r9, C19770wU r10, C005502l r11, AnonymousClass040 r12) {
        C36321k7.A1B(r4, r10, r7, r2, r9);
        C36321k7.A1C(r5, r8, r3, r1, r6);
        C36341k9.A1G(r11, r12);
        this.A01 = r4;
        this.A02 = r10;
        this.A08 = r7;
        this.A04 = r2;
        this.A0A = r9;
        this.A06 = r5;
        this.A09 = r8;
        this.A05 = r3;
        this.A00 = r1;
        this.A07 = r6;
        this.A03 = r11;
        this.A0B = r12;
    }

    public static final void A01(Activity activity, C594233w r6, AnonymousClass71G r7, boolean z) {
        AnonymousClass71G r0 = r7;
        r0.A02(activity, r6, "error", C000400e.A0D(), z);
    }
}
