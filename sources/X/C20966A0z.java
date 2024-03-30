package X;

import android.util.Log;

/* renamed from: X.A0z  reason: case insensitive filesystem */
public class C20966A0z implements C22867AxM {
    public final /* synthetic */ AnonymousClass9CJ A00;
    public final /* synthetic */ AnonymousClass94J A01;

    public C20966A0z(AnonymousClass9CJ r1, AnonymousClass94J r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BoG(C201109it r5, Throwable th) {
        String str;
        String stackTraceString;
        Object A012 = r5.A01();
        if (A012 != null) {
            str = AnonymousClass000.A0k(A012);
        } else {
            str = "<value is null>";
        }
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, System.identityHashCode(this), 0);
        AnonymousClass000.A1L(objArr, System.identityHashCode(r5), 1);
        objArr[2] = str;
        if (th == null) {
            stackTraceString = "";
        } else {
            stackTraceString = Log.getStackTraceString(th);
        }
        objArr[3] = stackTraceString;
        C132886Vq.A03("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", objArr);
    }
}
