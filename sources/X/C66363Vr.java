package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.3Vr  reason: invalid class name and case insensitive filesystem */
public class C66363Vr implements C25711Hj {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C66363Vr(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj4;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public final void accept(Object obj) {
        if (this.A04 != 0) {
            Reference reference = (Reference) this.A00;
            AnonymousClass17Y r1 = (AnonymousClass17Y) this.A01;
            C24801Dv r4 = (C24801Dv) this.A02;
            AnonymousClass2bU r3 = (AnonymousClass2bU) this.A03;
            Uri uri = (Uri) obj;
            C36331k8.A1G(reference, 0, uri);
            Context A0G = C36441kJ.A0G(reference);
            if (A0G != null) {
                r1.A02();
                Intent A0C = C36431kI.A0C();
                A0C.setDataAndType(uri, r3.A05);
                A0C.setFlags(1);
                r4.A06(A0G, A0C);
                return;
            }
            return;
        }
        Uri uri2 = (Uri) obj;
        ((AnonymousClass1X4) this.A00).A0F(uri2, (C24801Dv) this.A02, (AnonymousClass2bU) this.A03, (WeakReference) this.A01);
    }
}
