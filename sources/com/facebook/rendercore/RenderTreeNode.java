package com.facebook.rendercore;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.C000800j;
import X.C001400p;
import X.C123055vr;
import X.C132456Tu;
import X.C153827Pv;
import X.C90494aF;
import X.C90524aI;
import android.graphics.Rect;
import java.util.Arrays;
import java.util.Locale;

public final class RenderTreeNode {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Rect A03;
    public final Rect A04;
    public final RenderTreeNode A05;
    public final C132456Tu A06;
    public final Object A07;
    public final AnonymousClass00T A08;

    public final String A00(C123055vr r13) {
        int i;
        long j;
        C132456Tu r0 = this.A06;
        long A062 = r0.A06();
        String A082 = r0.A08();
        if (r13 != null) {
            i = AnonymousClass000.A0I(r13.A01.A06(C90494aF.A0U(), A062));
        } else {
            i = -1;
        }
        String shortString = this.A03.toShortString();
        AnonymousClass00C.A08(shortString);
        int size = C90524aI.A0q(this.A08).size();
        RenderTreeNode renderTreeNode = this.A05;
        if (renderTreeNode != null) {
            j = renderTreeNode.A06.A06();
        } else {
            j = -1;
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        AnonymousClass000.A1M(objArr, 0, A062);
        objArr[1] = A082;
        AnonymousClass000.A1L(objArr, i, 2);
        AnonymousClass000.A1L(objArr, this.A02, 3);
        objArr[4] = shortString;
        AnonymousClass000.A1L(objArr, this.A00, 5);
        AnonymousClass000.A1L(objArr, this.A01, 6);
        AnonymousClass000.A1L(objArr, size, 7);
        AnonymousClass000.A1M(objArr, 8, j);
        return C90494aF.A0e(locale, "Id=%d; renderUnit='%s'; indexInTree=%d; posInParent=%d; bounds=%s; absPosition=[%d, %d]; childCount=%d; parentId=%d;", Arrays.copyOf(objArr, 9));
    }

    public RenderTreeNode(Rect rect, Rect rect2, RenderTreeNode renderTreeNode, C132456Tu r7, Object obj, int i) {
        int i2;
        this.A05 = renderTreeNode;
        this.A06 = r7;
        this.A07 = obj;
        this.A03 = rect;
        this.A04 = rect2;
        this.A02 = i;
        int i3 = 0;
        if (renderTreeNode != null) {
            i2 = renderTreeNode.A00;
        } else {
            i2 = 0;
        }
        this.A00 = i2 + rect.left;
        this.A01 = (renderTreeNode != null ? renderTreeNode.A01 : i3) + rect.top;
        this.A08 = C001400p.A00(C000800j.NONE, C153827Pv.A00);
    }
}
