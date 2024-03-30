package X;

import java.util.ArrayDeque;

/* renamed from: X.09E  reason: invalid class name */
public class AnonymousClass09E implements AnonymousClass04V {
    public final AnonymousClass023 A00;
    public final /* synthetic */ AnonymousClass01W A01;

    public AnonymousClass09E(AnonymousClass023 r1, AnonymousClass01W r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void cancel() {
        ArrayDeque arrayDeque = this.A01.A00;
        AnonymousClass023 r0 = this.A00;
        arrayDeque.remove(r0);
        r0.A00.remove(this);
    }
}
