package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* renamed from: X.1iw  reason: invalid class name and case insensitive filesystem */
public class C35591iw implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public String A09;
    public boolean A0A;
    public final int A0B = 1;

    public C35591iw(Context context, Uri uri, C225014r r4, AnonymousClass4UL r5, AnonymousClass1XY r6, AnonymousClass3XT r7, File file, String str, List list, int i, boolean z) {
        this.A01 = r6;
        this.A00 = i;
        this.A03 = uri;
        this.A0A = z;
        this.A04 = context;
        this.A09 = str;
        this.A05 = file;
        this.A06 = list;
        this.A07 = r5;
        this.A08 = r4;
        this.A02 = r7;
    }

    public final void run() {
        int i;
        Object obj;
        Object obj2;
        AnonymousClass17Y r0;
        int i2 = this.A0B;
        AnonymousClass1XY r7 = (AnonymousClass1XY) this.A01;
        int i3 = this.A00;
        Object obj3 = this.A03;
        boolean z = this.A0A;
        if (i2 != 0) {
            File file = (File) this.A04;
            obj = this.A05;
            String str = this.A09;
            List list = (List) this.A06;
            Object obj4 = this.A07;
            obj2 = this.A08;
            try {
                if (!r7.A09((AnonymousClass3XT) this.A02, (AnonymousClass3T1) null, C25471Gl.A05, file, str, list, i3, z, true, false)) {
                    AnonymousClass17Y r6 = r7.A01;
                    Objects.requireNonNull(obj4);
                    r6.A0H(new C35641j1(obj4, 46));
                }
                r7.A01.A0H(new C35621iz(obj4, obj3, 13));
            } catch (IOException e) {
                e = e;
                r0 = r7.A01;
                i = 3;
                r0.A0H(new C35371ia(r7, e, obj2, obj, i));
            }
        } else {
            obj = this.A04;
            String str2 = this.A09;
            File file2 = (File) this.A05;
            List list2 = (List) this.A06;
            Object obj5 = this.A07;
            obj2 = this.A08;
            try {
                r7.A09((AnonymousClass3XT) this.A02, (AnonymousClass3T1) null, C25471Gl.A04, file2, str2, list2, i3, z, true, false);
                r7.A01.A0H(new C35621iz(obj5, obj3, 12));
            } catch (IOException e2) {
                e = e2;
                r0 = r7.A01;
                i = 2;
                r0.A0H(new C35371ia(r7, e, obj2, obj, i));
            }
        }
    }

    public C35591iw(Context context, Uri uri, C225014r r4, AnonymousClass4UL r5, AnonymousClass1XY r6, AnonymousClass3XT r7, File file, Integer num, String str, List list, int i, int i2, boolean z) {
        this.A01 = r6;
        this.A00 = i;
        this.A03 = uri;
        this.A0A = z;
        this.A04 = file;
        this.A05 = context;
        this.A09 = str;
        this.A06 = list;
        this.A07 = r5;
        this.A08 = r4;
        this.A02 = r7;
    }
}
