package X;

import android.app.ProgressDialog;
import android.util.SparseArray;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.65A  reason: invalid class name */
public class AnonymousClass65A {
    public final SparseArray A00;
    public final C159147it A01;
    public final C64603Oq A02 = new C64603Oq(new C80203v1());
    public final C120335rL A03;
    public final WeakReference A04;
    public final WeakReference A05;
    public final WeakReference A06;
    public final AtomicBoolean A07;
    public final AnonymousClass6K2 A08;
    public final C122845vW A09;
    public final String A0A;
    public final Map A0B;

    public SparseArray A00() {
        C142166oR r1;
        SparseArray sparseArray = new SparseArray();
        HashMap A0J = AnonymousClass001.A0J();
        String str = this.A0A;
        if (str != null) {
            AnonymousClass6K2 r4 = this.A08;
            synchronized (r4) {
                String str2 = r4.A01;
                boolean z = false;
                if (str2 != null && !str2.equals(str)) {
                    z = true;
                }
                r1 = r4.A00;
                if (r1 == null || z) {
                    r4.A01 = str;
                    r1 = new C142166oR(new AnonymousClass6MX());
                    r4.A00 = r1;
                }
            }
            A0J.put("gs", r1);
        }
        A0J.put("ls", new C142156oQ());
        Map map = this.A0B;
        if (map != null && !map.isEmpty()) {
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                A0J.put(A11.getKey(), ((C158037fh) A11.getValue()).B7x());
            }
        }
        sparseArray.put(R.id.bk_context_key_data_modules, A0J);
        sparseArray.put(R.id.bloks_host_activity, this.A04.get());
        sparseArray.put(R.id.bloks_host_progress_dialog, this.A06.get());
        sparseArray.put(R.id.bloks_host_fragment_manager, this.A05.get());
        sparseArray.put(R.id.bloks_host_viewpoint_manager, this.A02);
        sparseArray.put(R.id.bloks_host_viewpoint_impressions_map, AnonymousClass001.A0J());
        sparseArray.put(R.id.bloks_data_module_namespace_manager, this.A03);
        C122845vW r5 = this.A09;
        C130466Le r12 = r5.A00;
        if (r12 == null) {
            C117975n8 r42 = r5.A01;
            C141946o5 r3 = new C141946o5();
            C142006oB r2 = r5.A02;
            r12 = new C130466Le(r3, r2, new C115135iO(new C1259662a(r2, r5.A03)), r42);
            r5.A00 = r12;
        }
        sparseArray.put(R.id.bk_context_key_async_component_store, r12);
        return sparseArray;
    }

    public AnonymousClass65A(AnonymousClass01L r3, AnonymousClass01z r4, C109955Zt r5, AnonymousClass6K2 r6, C122845vW r7, C118015nC r8, C120335rL r9, String str, Map map, boolean z) {
        this.A0A = str;
        this.A04 = AnonymousClass001.A0F(r3);
        this.A05 = AnonymousClass001.A0F(r4);
        this.A06 = AnonymousClass001.A0F(new ProgressDialog(r3));
        this.A0B = map;
        this.A03 = r9;
        this.A09 = r7;
        this.A07 = new AtomicBoolean(true);
        this.A01 = new C141956o6(this, r5, r8, z);
        this.A08 = r6;
        this.A00 = new SparseArray();
    }
}
