package X;

import com.facebook.rendercore.RenderTreeNode;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.5vr  reason: invalid class name and case insensitive filesystem */
public final class C123055vr {
    public final long A00;
    public final C000700i A01;
    public final RenderTreeNode A02;
    public final RenderTreeNode[] A03;
    public final Object A04;

    public C123055vr(RenderTreeNode renderTreeNode, Object obj, RenderTreeNode[] renderTreeNodeArr, long j) {
        AnonymousClass00C.A0D(renderTreeNodeArr, 2);
        this.A02 = renderTreeNode;
        this.A03 = renderTreeNodeArr;
        this.A00 = j;
        this.A04 = obj;
        int length = renderTreeNodeArr.length;
        this.A01 = new C000700i(length);
        int i = 0;
        while (i < length) {
            C000700i r4 = this.A01;
            RenderTreeNode[] renderTreeNodeArr2 = this.A03;
            RenderTreeNode renderTreeNode2 = renderTreeNodeArr2[i];
            int A0I = AnonymousClass000.A0I(r4.A06(-1, renderTreeNode2.A06.A06()));
            if (A0I == -1) {
                this.A01.A0A(this.A03[i].A06.A06(), Integer.valueOf(i));
                i++;
            } else {
                RenderTreeNode renderTreeNode3 = renderTreeNodeArr2[A0I];
                Locale locale = Locale.US;
                Object[] objArr = new Object[5];
                C36331k8.A1W(objArr, i);
                objArr[1] = renderTreeNode2.A00((C123055vr) null);
                AnonymousClass000.A1L(objArr, A0I, 2);
                objArr[3] = renderTreeNode3.A00((C123055vr) null);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("RenderTree details:\n");
                Object[] objArr2 = new Object[1];
                boolean A1b = C36361kB.A1b(objArr2, r4);
                A0u.append(C90494aF.A0e(locale, "Full child list (size = %d):\n", Arrays.copyOf(objArr2, 1)));
                for (RenderTreeNode A002 : renderTreeNodeArr2) {
                    A0u.append(C90494aF.A0e(locale, "%s\n", C90524aI.A0x(A002.A00(this), new Object[1], A1b ? 1 : 0, 1)));
                }
                throw AnonymousClass001.A09(C90494aF.A0e(locale, "RenderTrees must not have RenderUnits with the same ID:\nAttempted to add item with existing ID at index %d: %s\nExisting item at index %d: %s\nFull RenderTree: %s", C90524aI.A0x(C36381kD.A0y(A0u), objArr, 4, 5)));
            }
        }
    }
}
