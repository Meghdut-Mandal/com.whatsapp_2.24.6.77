package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;

/* renamed from: X.6ln  reason: invalid class name and case insensitive filesystem */
public class C140566ln implements C160347kr {
    public /* bridge */ /* synthetic */ Object B1l(Context context, Object obj, Object obj2, Object obj3) {
        LinearLayoutManager linearLayoutManager;
        AnonymousClass0CP r2;
        RecyclerView recyclerView = (RecyclerView) obj;
        C1267765m r3 = ((C98204r3) obj2).A0D;
        if (r3 instanceof C98284rB) {
            C98284rB r32 = (C98284rB) r3;
            r2 = new StaggeredGridLayoutManager(r32.A00, r32.A00);
        } else if (r3 instanceof C98304rD) {
            C98304rD r33 = (C98304rD) r3;
            AnonymousClass00C.A0D(context, 0);
            boolean z = r33.A00;
            int i = r33.A00;
            if (z) {
                linearLayoutManager = new StickyHeadersLinearLayoutManager(i);
            } else {
                linearLayoutManager = new LinearLayoutManager(i);
            }
            linearLayoutManager.A1m(r33.A01);
            r2 = linearLayoutManager;
        } else {
            C98294rC r34 = (C98294rC) r3;
            AnonymousClass00C.A0D(context, 0);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(r34.A00, r34.A00);
            gridLayoutManager.A02 = r34.A01;
            r2 = gridLayoutManager;
        }
        recyclerView.setLayoutManager(r2);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r2 != r1) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ boolean BtZ(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = this;
            X.4r3 r5 = (X.C98204r3) r5
            X.4r3 r6 = (X.C98204r3) r6
            X.65m r2 = r5.A0D
            X.65m r3 = r6.A0D
            boolean r0 = r2 instanceof X.C98284rB
            if (r0 == 0) goto L_0x0025
            X.4rB r2 = (X.C98284rB) r2
            boolean r0 = r3 instanceof X.C98284rB
            if (r0 == 0) goto L_0x0021
            int r1 = r2.A00
            X.4rB r3 = (X.C98284rB) r3
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0021
            int r2 = r2.A00
            int r1 = r3.A00
        L_0x001e:
            r0 = 1
            if (r2 == r1) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            r0 = r0 ^ 1
            return r0
        L_0x0025:
            boolean r0 = r2 instanceof X.C98304rD
            if (r0 == 0) goto L_0x0042
            X.4rD r2 = (X.C98304rD) r2
            boolean r0 = r3 instanceof X.C98304rD
            if (r0 == 0) goto L_0x0021
            int r1 = r2.A00
            X.4rD r3 = (X.C98304rD) r3
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0021
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L_0x0021
            boolean r2 = r2.A00
            boolean r1 = r3.A00
            goto L_0x001e
        L_0x0042:
            X.4rC r2 = (X.C98294rC) r2
            boolean r0 = r3 instanceof X.C98294rC
            if (r0 == 0) goto L_0x0021
            int r1 = r2.A00
            X.4rC r3 = (X.C98294rC) r3
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0021
            int r2 = r2.A00
            int r1 = r3.A00
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140566ln.BtZ(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }

    public /* bridge */ /* synthetic */ void BwG(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((RecyclerView) obj).setLayoutManager((AnonymousClass0CP) null);
    }

    public /* synthetic */ String BB1() {
        return AnonymousClass5YX.A01(this);
    }
}
