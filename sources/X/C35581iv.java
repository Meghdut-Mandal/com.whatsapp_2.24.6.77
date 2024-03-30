package X;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1iv  reason: invalid class name and case insensitive filesystem */
public class C35581iv implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D = 1;

    public C35581iv(Context context, C225014r r3, AnonymousClass4UL r4, AnonymousClass1XY r5, AnonymousClass3XT r6, C207219uk r7, Integer num, String str, String str2, HashMap hashMap, List list, List list2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = r5;
        this.A0C = z;
        this.A08 = list;
        this.A09 = list2;
        this.A0A = str;
        this.A00 = i;
        this.A0B = z2;
        this.A05 = context;
        this.A04 = r3;
        this.A03 = r6;
        this.A06 = r4;
        this.A01 = i2;
        this.A07 = hashMap;
    }

    public final void run() {
        if (this.A0D != 0) {
            boolean z = this.A0C;
            String str = this.A0A;
            int i = this.A00;
            boolean z2 = this.A0B;
            Context context = (Context) this.A05;
            C225014r r2 = (C225014r) this.A04;
            AnonymousClass3XT r5 = (AnonymousClass3XT) this.A03;
            AnonymousClass4UL r3 = (AnonymousClass4UL) this.A06;
            int i2 = this.A01;
            AnonymousClass1XY.A00(context, r2, r3, (AnonymousClass1XY) this.A02, r5, str, (HashMap) this.A07, (List) this.A08, (List) this.A09, i, i2, z, z2);
            return;
        }
        AnonymousClass1XY r14 = (AnonymousClass1XY) this.A02;
        List<Uri> list = (List) this.A03;
        HashMap hashMap = (HashMap) this.A08;
        boolean z3 = this.A0B;
        List list2 = (List) this.A09;
        String str2 = this.A0A;
        int i3 = this.A00;
        boolean z4 = this.A0C;
        Context context2 = (Context) this.A06;
        C225014r r12 = (C225014r) this.A05;
        AnonymousClass3XT r15 = (AnonymousClass3XT) this.A04;
        AnonymousClass4UL r13 = (AnonymousClass4UL) this.A07;
        int i4 = this.A01;
        for (Uri uri : list) {
            hashMap.put(uri, Integer.valueOf(r14.A09.A00(uri)));
        }
        String str3 = str2;
        HashMap hashMap2 = hashMap;
        r14.A01.A0H(new C35581iv(context2, r12, r13, r14, r15, (C207219uk) null, (Integer) null, str3, (String) null, hashMap2, list2, list, i3, i4, 1, z3, z4, false, false));
    }

    public C35581iv(Context context, C225014r r3, AnonymousClass4UL r4, AnonymousClass1XY r5, AnonymousClass3XT r6, String str, HashMap hashMap, List list, List list2, int i, int i2, boolean z, boolean z2) {
        this.A02 = r5;
        this.A03 = list;
        this.A08 = hashMap;
        this.A0B = z;
        this.A09 = list2;
        this.A0A = str;
        this.A00 = i;
        this.A0C = z2;
        this.A06 = context;
        this.A05 = r3;
        this.A04 = r6;
        this.A07 = r4;
        this.A01 = i2;
    }
}
