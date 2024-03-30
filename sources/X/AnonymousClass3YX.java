package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: X.3YX  reason: invalid class name */
public class AnonymousClass3YX implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public AnonymousClass3YX(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        this.A05 = i2;
        this.A01 = obj;
        this.A04 = str;
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void onClick(View view) {
        String str;
        int i;
        C001600r r4;
        AnonymousClass11F r9;
        Context A0F;
        long j;
        int i2;
        int i3 = this.A05;
        Object obj = this.A01;
        switch (i3) {
            case 0:
                C42401yl r7 = (C42401yl) obj;
                str = this.A04;
                i = this.A00;
                C80193v0 r3 = (C80193v0) this.A02;
                r4 = (C001600r) this.A03;
                C21010yW r2 = r7.A05;
                C45492Ro r1 = new C45492Ro();
                C55572uq.A00(r1, str, 3, i);
                r2.Bly(r1);
                A0F = C36441kJ.A0F(r7);
                r9 = r3.A01();
                j = r3.A00.A0I;
                i2 = 0;
                break;
            case 1:
                C42431yo r72 = (C42431yo) obj;
                str = this.A04;
                i = this.A00;
                r4 = (C001600r) this.A03;
                C21010yW r22 = r72.A06;
                C45492Ro r12 = new C45492Ro();
                C55572uq.A00(r12, str, 5, i);
                r22.Bly(r12);
                r9 = null;
                A0F = C36441kJ.A0F(r72);
                j = ((AnonymousClass37U) this.A02).A01;
                i2 = 1;
                break;
            default:
                C42431yo r73 = (C42431yo) obj;
                str = this.A04;
                i = this.A00;
                r4 = (C001600r) this.A03;
                C21010yW r23 = r73.A06;
                C45492Ro r13 = new C45492Ro();
                C55572uq.A00(r13, str, 4, i);
                r23.Bly(r13);
                r9 = null;
                A0F = C36441kJ.A0F(r73);
                j = ((AnonymousClass37U) this.A02).A01;
                i2 = 2;
                break;
        }
        Intent className = C36431kI.A0D().setClassName(A0F.getPackageName(), "com.whatsapp.storage.StorageUsageGalleryActivity");
        className.putExtra("gallery_type", i2);
        C36421kH.A0m(className, r9);
        className.putExtra("memory_size", j);
        className.putExtra("session_id", str);
        className.putExtra("entry_point", i);
        r4.A0D(className);
    }
}
