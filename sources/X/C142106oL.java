package X;

import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import com.facebook.rendercore.RootHostView;
import com.whatsapp.R;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6oL  reason: invalid class name and case insensitive filesystem */
public class C142106oL implements AnonymousClass7fG {
    public RootHostView A00 = null;
    public AnonymousClass6PY A01 = null;
    public final Context A02;
    public final SparseArray A03;
    public final C91604cJ A04 = new C91604cJ(Looper.getMainLooper(), new C133756Zw(this));
    public final C115145iP A05;
    public final AnonymousClass65A A06;
    public final Map A07;
    public final Map A08;
    public final Set A09 = C36441kJ.A16();
    public final AtomicBoolean A0A = new AtomicBoolean(false);
    public final AtomicReference A0B = new AtomicReference();
    public volatile boolean A0C = false;

    public static void A00(C142106oL r2, int i) {
        AnonymousClass7eF r22 = (AnonymousClass7eF) r2.A0B.get();
        if (r22 != null) {
            AnonymousClass6RN.A00(AnonymousClass000.A0r("BloksSurface_notify_on_render_surface_", AnonymousClass000.A0u(), i));
            try {
                r22.Bef(i);
            } finally {
                AnonymousClass68E.A00();
            }
        }
    }

    public static void A01(C142106oL r5, C100584vG r6) {
        List list = r6.A02;
        Map map = r6.A03;
        if (!list.isEmpty()) {
            A00(r5, 12);
            C91604cJ r2 = r5.A04;
            r2.A00(r2.obtainMessage(2, new C97554ps(list, map)));
        }
    }

    /* JADX INFO: finally extract failed */
    public static void A02(C142106oL r7, C100584vG r8, int i, int i2) {
        A00(r7, 10);
        C81283wl r6 = new C81283wl((Object) r7, i2, 1);
        AnonymousClass6RN.A00("BloksSurface_create_bloks_hosting_component");
        try {
            Map map = r7.A08;
            map.putAll(r8.A03);
            AnonymousClass64D r2 = new AnonymousClass64D(r7.A02, r8.A00, r7.A06);
            r2.A01 = map;
            r2.A02 = r7.A07;
            SparseArray clone = r7.A03.clone();
            clone.put(R.id.bloks_surface_on_data_rendered_runnable, r6);
            r2.A00 = clone;
            AnonymousClass6PY A002 = r2.A00();
            AnonymousClass68E.A00();
            C97564pt r0 = new C97564pt(A002, i);
            C91604cJ r1 = r7.A04;
            r1.A00(r1.obtainMessage(1, r0));
        } catch (Throwable th) {
            AnonymousClass68E.A00();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r4 == 2) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bex(X.C115145iP r6) {
        /*
            r5 = this;
            X.6S1 r0 = r6.A00
            int r4 = r0.A00
            r2 = 4
            if (r4 == r2) goto L_0x002d
            r3 = 1
            r1 = 3
            r0 = 0
            if (r4 != r1) goto L_0x000e
            r0 = 1
            r2 = 5
        L_0x000e:
            A00(r5, r2)
            if (r0 != 0) goto L_0x002d
            r0 = 6
            A00(r5, r0)
            if (r4 == r3) goto L_0x001d
            r0 = 2
            r2 = -1
            if (r4 != r0) goto L_0x001f
        L_0x001d:
            r2 = 9
        L_0x001f:
            boolean r0 = r6 instanceof X.C100584vG
            r1 = 7
            if (r0 == 0) goto L_0x002d
            X.4vG r6 = (X.C100584vG) r6
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x002e
            A01(r5, r6)
        L_0x002d:
            return
        L_0x002e:
            A02(r5, r6, r1, r2)
            A01(r5, r6)
            r5.A0C = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C142106oL.Bex(X.5iP):void");
    }

    public C142106oL(Context context, SparseArray sparseArray, AnonymousClass6XK r7, AnonymousClass65A r8, Map map, Map map2) {
        C100584vG r2 = null;
        this.A06 = r8;
        this.A02 = context;
        this.A03 = sparseArray;
        this.A05 = r7 != null ? new C100584vG(r7, AnonymousClass6S1.A02) : r2;
        this.A08 = map;
        this.A07 = map2;
    }
}
