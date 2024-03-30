package X;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: X.67h  reason: invalid class name and case insensitive filesystem */
public class C1271867h {
    public ByteBuffer A00 = C90474aD.A0l(0);
    public final C120985sP A01;
    public final C132206Sq A02;
    public final AnonymousClass6V3 A03;
    public final ByteBuffer[] A04;
    public final C125085zI A05;

    public C1271867h(C120985sP r4, C132206Sq r5, AnonymousClass6V3 r6, C125085zI r7) {
        HashMap A032;
        int i = 0;
        this.A02 = r5;
        this.A01 = r4;
        this.A05 = r7;
        AnonymousClass6QD r1 = r7.A05;
        if (!(r1 == null || (A032 = r1.A03(AnonymousClass5TE.AUDIO)) == null)) {
            i = A032.size();
        }
        this.A04 = new ByteBuffer[i];
        this.A03 = r6;
    }
}
