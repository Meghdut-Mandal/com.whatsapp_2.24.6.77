package X;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;

/* renamed from: X.6T6  reason: invalid class name */
public final class AnonymousClass6T6 {
    public static final C130326Kq A00(C123035vp r13, C161007lx r14, C157827ek r15, Object obj, long j) {
        AnonymousClass00C.A0D(r14, 2);
        Context context = r13.A02;
        C132456Tu r0 = AnonymousClass6RM.A00;
        AnonymousClass6RN.A00("Reducer.reduceTree");
        ArrayList A0I = AnonymousClass001.A0I();
        C161007lx r9 = null;
        RenderTreeNode A00 = AnonymousClass6RM.A00(new Rect(0, 0, r14.getWidth(), r14.getHeight()), r14, (RenderTreeNode) null, AnonymousClass6RM.A00);
        A0I.add(A00);
        AnonymousClass6RM.A01(context, r14, A00, A0I, 0, 0);
        RenderTreeNode[] renderTreeNodeArr = (RenderTreeNode[]) A0I.toArray(new RenderTreeNode[0]);
        AnonymousClass68E.A00();
        if (C112825eW.A00) {
            r9 = r14;
        }
        return new C130326Kq(((C129986Jg) r13.A04.getValue()).A01, r15, new C123055vr(A00, r9, renderTreeNodeArr, j), obj);
    }

    public static final boolean A01(C157827ek r9, C130326Kq r10, long j) {
        AnonymousClass00C.A0D(r9, 0);
        C123055vr r1 = r10.A02;
        if (r9 != r10.A01) {
            return false;
        }
        long j2 = r1.A00;
        Rect rect = r1.A02.A03;
        if (C131696Qd.A02(j, j2, C90474aD.A0C((long) rect.width(), (long) rect.height()))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r1 != null) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C130326Kq A02(android.content.Context r9, X.C130326Kq r10, X.C128096Aw r11, java.lang.Object r12, int r13, long r14) {
        /*
            r8 = this;
            r0 = 1
            X.AnonymousClass00C.A0D(r11, r0)
            java.lang.String r0 = "RC Create Tree"
            X.AnonymousClass6RN.A00(r0)
            r6 = r14
            if (r10 == 0) goto L_0x0028
            X.7ek r4 = r11.A00
            boolean r0 = A01(r4, r10, r14)
            if (r0 == 0) goto L_0x0023
            X.5vr r3 = r10.A02
            X.5oS r2 = r10.A00
            java.lang.Object r0 = r11.A01
            X.6Kq r1 = new X.6Kq
            r1.<init>(r2, r4, r3, r0)
        L_0x001f:
            X.AnonymousClass68E.A00()
            return r1
        L_0x0023:
            X.5oS r1 = r10.A00
            if (r1 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            X.6Jg r0 = new X.6Jg
            r0.<init>(r1)
            X.5vp r2 = new X.5vp
            r2.<init>(r9, r0, r12, r13)
            X.7ek r4 = r11.A00
            java.lang.Object r5 = r11.A01
            r0 = 1
            X.AnonymousClass00C.A0D(r4, r0)
            java.lang.String r0 = "RC Layout"
            X.AnonymousClass6RN.A00(r0)
            int r1 = X.C131696Qd.A01(r14)
            int r0 = X.C131696Qd.A00(r14)
            X.7lx r3 = r4.B2C(r2, r1, r0)
            X.AnonymousClass68E.A00()
            java.lang.String r0 = "RC Reduce"
            X.AnonymousClass6RN.A00(r0)
            X.6Kq r1 = A00(r2, r3, r4, r5, r6)
            X.AnonymousClass68E.A00()
            r0 = 0
            r2.A00 = r0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6T6.A02(android.content.Context, X.6Kq, X.6Aw, java.lang.Object, int, long):X.6Kq");
    }
}
