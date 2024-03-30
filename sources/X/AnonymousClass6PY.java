package X;

import android.animation.Animator;
import android.content.Context;
import android.util.SparseArray;
import android.view.Choreographer;
import com.facebook.rendercore.RootHostView;
import com.whatsapp.R;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6PY  reason: invalid class name */
public class AnonymousClass6PY {
    public RootHostView A00;
    public final Executor A01;
    public final C1271967i A02;
    public final Object A03;
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public final AtomicReference A05;
    public final C133146Wy A06;
    public final C118785oj A07;
    public final AnonymousClass6WZ A08;
    public final Object A09;
    public final List A0A;
    public final AtomicReference A0B;

    public static void A00(AnonymousClass6PY r6) {
        C124105xb r0;
        synchronized (r6.A09) {
            if (!r6.A04.get()) {
                AnonymousClass66A r4 = (AnonymousClass66A) r6.A05.get();
                Map map = (Map) r6.A0B.get();
                if (r4 == null || map == null) {
                    throw AnonymousClass001.A09("TreeState was null but it should have been initialised by the constructor");
                }
                C1271967i r1 = r6.A02;
                C118795ok r02 = r6.A07.A00;
                if (r02 != null) {
                    r0 = r02.A01;
                } else {
                    r0 = null;
                }
                C133146Wy.A01(r6.A06, new C115115iM(new C121075sY(r1, r4, r0, map)));
            }
        }
    }

    public void A02() {
        if (this.A04.get()) {
            AnonymousClass6RS.A01("BloksHostingComponent", "Trying to detach a view from a destroyed BloksHostingComponent");
            return;
        }
        RootHostView rootHostView = this.A00;
        if (rootHostView != null) {
            rootHostView.setTag(R.id.bk_context_debug, (Object) null);
            this.A00.setRenderState((C133146Wy) null);
            this.A00 = null;
        }
    }

    public void A03(RootHostView rootHostView) {
        if (this.A04.get()) {
            AnonymousClass6RS.A01("BloksHostingComponent", "Trying to attach a view to a destroyed BloksHostingComponent");
            return;
        }
        RootHostView rootHostView2 = this.A00;
        if (!(rootHostView2 == null || rootHostView2 == rootHostView)) {
            A02();
        }
        this.A00 = rootHostView;
        rootHostView.setRenderState(this.A06);
        this.A00.requestLayout();
        AnonymousClass6NR.A00();
    }

    public AnonymousClass6PY(Context context, SparseArray sparseArray, AnonymousClass6XK r11, AnonymousClass65A r12, Map map, Map map2) {
        AtomicReference atomicReference = new AtomicReference();
        this.A05 = atomicReference;
        this.A09 = C36441kJ.A11();
        this.A03 = C36441kJ.A11();
        C164217rS r6 = new C164217rS(this, 2);
        this.A01 = r6;
        List list = r11.A00.A02;
        this.A0A = list;
        C159147it r7 = r12.A01;
        r7.B8r();
        C114095gd.A01.incrementAndGet();
        r7.B8r();
        SparseArray clone = sparseArray.clone();
        clone.put(R.id.bk_context_key_render_callback_queue, new AnonymousClass6LF(false));
        C1271967i A002 = C133266Xn.A00(context, clone, new AnonymousClass6WZ(r11, r7.B8s(), C131196Oc.A00), r12, r11.A02);
        this.A02 = A002;
        AnonymousClass6WZ A012 = C133266Xn.A01(A002);
        this.A08 = A012;
        this.A0B = new AtomicReference(AnonymousClass6XK.A03(list, map));
        C118785oj r3 = new C118785oj(A012);
        this.A07 = r3;
        A002.A01.get(R.id.bk_context_key_rendercore_extensions_creator);
        this.A06 = new C133146Wy(context, r3, A002, r6);
        atomicReference.compareAndSet((Object) null, A012.A03(A002, new C141996oA(this), map2));
        A00(this);
    }

    public void A01() {
        A02();
        AtomicBoolean atomicBoolean = this.A04;
        if (atomicBoolean.get()) {
            AnonymousClass6RS.A01("BloksHostingComponent", "Trying to access a BloksContext form a destroyed BloksHostingComponent");
        }
        C1271967i r4 = this.A02;
        HashMap hashMap = (HashMap) r4.A01(R.id.bk_context_key_animations);
        Iterator A10 = C36391kE.A10((AbstractMap) hashMap.clone());
        while (A10.hasNext()) {
            ((Animator) A10.next()).cancel();
        }
        if (!hashMap.isEmpty()) {
            hashMap.clear();
        }
        HashMap hashMap2 = (HashMap) r4.A01(R.id.bk_context_key_timers);
        Iterator A102 = C36391kE.A10((AbstractMap) hashMap2.clone());
        while (A102.hasNext()) {
            ((AnonymousClass64X) A102.next()).A00();
        }
        if (!hashMap2.isEmpty()) {
            AnonymousClass6RS.A01("BloksTimer", "Timer map is non-empty after cleanup!");
            hashMap2.clear();
        }
        HashSet hashSet = (HashSet) r4.A01(R.id.bk_context_key_cleanup_callbacks);
        Iterator it = ((Set) hashSet.clone()).iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0A("cleanup");
        }
        hashSet.clear();
        AnonymousClass6WZ A012 = C133266Xn.A01(r4);
        A012.A08 = true;
        A012.A02.A00();
        AnonymousClass6LF r2 = (AnonymousClass6LF) r4.A01.get(R.id.bk_context_key_render_callback_queue);
        if (r2 != null) {
            r2.A00 = true;
            C90524aI.A0C(r2.A05).removeCallbacksAndMessages(r2.A03);
            Choreographer.getInstance().removeFrameCallback(r2.A02);
        }
        atomicBoolean.set(true);
        AnonymousClass6UV.A00().removeCallbacksAndMessages(this.A03);
        C114095gd.A02.incrementAndGet();
    }
}
