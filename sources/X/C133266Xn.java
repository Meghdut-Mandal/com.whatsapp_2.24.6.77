package X;

import android.animation.Animator;
import android.content.Context;
import android.util.SparseArray;
import com.whatsapp.R;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.6Xn  reason: invalid class name and case insensitive filesystem */
public abstract class C133266Xn {
    public static final AnonymousClass7fC A00 = new C141976o8();

    public static C1271967i A00(Context context, SparseArray sparseArray, AnonymousClass6WZ r7, AnonymousClass65A r8, String str) {
        SparseArray clone = r8.A00().clone();
        for (int i = 0; i < sparseArray.size(); i++) {
            clone.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
        clone.put(R.id.bk_context_key_states, AnonymousClass001.A0J());
        if (r7 == null) {
            r7 = new AnonymousClass6WZ(AnonymousClass6XK.A01(new C140456lc(-1)), AnonymousClass6IK.A00, C131196Oc.A00);
        }
        clone.put(R.id.bk_context_key_tree, r7);
        clone.put(R.id.bk_context_key_scoped_client_id_mapper, new C1257561d());
        clone.put(R.id.bk_context_key_animations, AnonymousClass001.A0J());
        clone.put(R.id.bk_context_key_timers, AnonymousClass001.A0J());
        clone.put(R.id.bk_context_key_cleanup_callbacks, C36441kJ.A16());
        clone.put(R.id.bk_context_key_logging_id, str);
        if (clone.get(R.id.bk_context_key_performance_logger) == null) {
            clone.put(R.id.bk_context_key_performance_logger, C142016oC.A00);
        }
        clone.put(R.id.bk_context_key_controller_by_server_id, Collections.synchronizedMap(AnonymousClass001.A0J()));
        return new C1271967i(context, clone, r8);
    }

    public static AnonymousClass6WZ A01(C1271967i r1) {
        return (AnonymousClass6WZ) r1.A01(R.id.bk_context_key_tree);
    }

    public static AnonymousClass7fH A02(C1271967i r1, String str) {
        Map map = (Map) r1.A01(R.id.bk_context_key_data_modules);
        if (map == null) {
            return null;
        }
        return (AnonymousClass7fH) map.get(str);
    }

    public static AnonymousClass7fJ A03(C1271967i r2) {
        AnonymousClass7fJ r0 = (AnonymousClass7fJ) r2.A01.get(R.id.bk_context_key_interpreter_extensions);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass7fJ r02 = AnonymousClass6NR.A00().A08;
        Objects.requireNonNull(r02);
        return r02;
    }

    public static Object A04(C1271967i r0, C140456lc r1) {
        Object A05 = A05(r0, r1);
        Objects.requireNonNull(A05);
        return A05;
    }

    public static Object A05(C1271967i r3, C140456lc r4) {
        Object A02 = r3.A02(A00, r4, R.id.bk_context_key_controller_associated_object);
        String A0Y = r4.A0Y();
        if (A0Y != null) {
            ((Map) r3.A01(R.id.bk_context_key_controller_by_server_id)).put(A0Y, A02);
        }
        return A02;
    }

    public static void A06(Animator animator, C1271967i r2) {
        ((AbstractMap) r2.A01(R.id.bk_context_key_animations)).values().remove(animator);
    }

    public static void A07(C1271967i r1) {
        AnonymousClass6WZ A01 = A01(r1);
        if (A01 != null && C132926Vv.A03()) {
            int i = A01.A00;
            if (i > 0) {
                int i2 = i - 1;
                A01.A00 = i2;
                if (i2 == 0 && A01.A0H.size() > 0) {
                    A01.A05();
                    return;
                }
                return;
            }
            throw AnonymousClass001.A09("Negative recursion level.");
        }
    }

    public static boolean A08(C1271967i r2) {
        Boolean bool = (Boolean) r2.A01.get(R.id.bk_context_key_clip_children_bool);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }
}
