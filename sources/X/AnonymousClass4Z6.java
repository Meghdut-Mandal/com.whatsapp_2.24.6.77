package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.List;

/* renamed from: X.4Z6  reason: invalid class name */
public class AnonymousClass4Z6 implements AnonymousClass4SG {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public String A08;
    public boolean A09;
    public final int A0A;

    public AnonymousClass4Z6(Context context, Uri uri, C225014r r3, AnonymousClass4UL r4, AnonymousClass1XY r5, AnonymousClass3XT r6, String str, List list, int i, int i2, boolean z) {
        this.A0A = i2;
        this.A01 = r5;
        this.A00 = i;
        this.A03 = uri;
        this.A09 = z;
        this.A04 = context;
        this.A08 = str;
        this.A05 = list;
        this.A06 = r4;
        this.A07 = r3;
        this.A02 = r6;
    }

    public final void BXw(File file) {
        C19770wU r0;
        C35591iw r1;
        int i = this.A0A;
        AnonymousClass1XY r6 = (AnonymousClass1XY) this.A01;
        File file2 = file;
        if (i != 0) {
            int i2 = this.A00;
            boolean z = this.A09;
            Context context = (Context) this.A04;
            AnonymousClass4UL r5 = (AnonymousClass4UL) this.A06;
            C225014r r4 = (C225014r) this.A07;
            AnonymousClass3XT r7 = (AnonymousClass3XT) this.A02;
            r0 = r6.A0F;
            r1 = new C35591iw(context, (Uri) this.A03, r4, r5, r6, r7, file2, this.A08, (List) this.A05, i2, z);
        } else {
            int i3 = this.A00;
            boolean z2 = this.A09;
            Context context2 = (Context) this.A04;
            AnonymousClass4UL r52 = (AnonymousClass4UL) this.A06;
            C225014r r42 = (C225014r) this.A07;
            AnonymousClass3XT r72 = (AnonymousClass3XT) this.A02;
            r0 = r6.A0F;
            r1 = new C35591iw(context2, (Uri) this.A03, r42, r52, r6, r72, file2, (Integer) null, this.A08, (List) this.A05, i3, 1, z2);
        }
        r0.Boy(r1);
    }
}
