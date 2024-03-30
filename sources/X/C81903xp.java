package X;

import java.io.File;

/* renamed from: X.3xp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C81903xp implements AnonymousClass004 {
    public final /* synthetic */ AnonymousClass179 A00;
    public final /* synthetic */ AnonymousClass36X A01;
    public final /* synthetic */ C20830yE A02;
    public final /* synthetic */ C20060wx A03;

    public /* synthetic */ C81903xp(AnonymousClass179 r1, AnonymousClass36X r2, C20830yE r3, C20060wx r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final Object get() {
        AnonymousClass179 r0 = this.A00;
        return new C20850yG(this.A02, this.A03, C36441kJ.A0w((File) r0.A01.get(), ".trash"));
    }
}
