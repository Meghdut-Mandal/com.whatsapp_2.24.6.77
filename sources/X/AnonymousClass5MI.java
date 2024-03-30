package X;

import java.io.File;

/* renamed from: X.5MI  reason: invalid class name */
public class AnonymousClass5MI extends C132446Tt {
    public Exception A00;
    public final C20690y0 A01;
    public final C25371Ga A02;
    public final String A03;
    public final String A04;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        File file = (File) obj;
        if (file != null) {
            this.A02.BXx(file, this.A04, (byte[]) null);
            return;
        }
        Exception exc = this.A00;
        if (exc != null) {
            this.A02.onFailure(exc);
        }
    }

    public AnonymousClass5MI(C20690y0 r1, C25371Ga r2, String str, String str2) {
        this.A01 = r1;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = r2;
    }
}
