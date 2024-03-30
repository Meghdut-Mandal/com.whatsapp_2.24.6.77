package X;

import android.content.Context;
import android.media.MediaFormat;
import java.util.List;
import java.util.Map;

/* renamed from: X.6ED  reason: invalid class name */
public class AnonymousClass6ED {
    public C109695Yo A00;
    public Map A01 = AnonymousClass001.A0J();
    public Map A02 = AnonymousClass001.A0J();
    public boolean A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final Context A07;
    public final MediaFormat A08;
    public final AnonymousClass65N A09;
    public final AnonymousClass7ez A0A;
    public final C131456Pc A0B;
    public final C109635Yi A0C;
    public final AnonymousClass6VP A0D;
    public final C159097io A0E;
    public final C125085zI A0F;
    public final C159107ip A0G;
    public final C160937lp A0H;
    public final List A0I = AnonymousClass001.A0I();
    public final C129246Ga A0J;

    public synchronized void A00() {
        AnonymousClass6MV r5 = new AnonymousClass6MV();
        Map map = this.A01;
        new C162577oo(r5, (C160987lu) map.get(0), 0).A00();
        Map map2 = this.A02;
        new C162577oo(r5, (C141246mu) map2.get(0), 1).A00();
        map2.clear();
        map.clear();
    }

    public synchronized void A01() {
        AnonymousClass6MV r6 = new AnonymousClass6MV();
        Map map = this.A02;
        C141246mu r2 = (C141246mu) map.get(0);
        if (r2 != null && r2.A05) {
            this.A0B.A0R = true;
            new C162577oo(r6, r2, 2).A00();
        }
        Map map2 = this.A01;
        AnonymousClass60I.A00(new C162577oo(r6, (C160987lu) map2.get(0), 4));
        map.clear();
        map2.clear();
        Throwable th = r6.A01;
        if (th != null) {
            throw th;
        }
    }

    public void A02(long j) {
        Map map = this.A01;
        Integer A0m = C36381kD.A0m();
        if (map.get(A0m) != null) {
            ((C160987lu) map.get(A0m)).Bo7(j);
            ((C160987lu) map.get(A0m)).B5j(j);
        }
    }

    public AnonymousClass6ED(Context context, MediaFormat mediaFormat, C129246Ga r5, AnonymousClass65N r6, AnonymousClass7ez r7, C131456Pc r8, C109635Yi r9, AnonymousClass6VP r10, C159097io r11, C125085zI r12, C159107ip r13, C160937lp r14, int i, long j, long j2) {
        this.A0C = r9;
        this.A0E = r11;
        this.A0F = r12;
        this.A0B = r8;
        this.A0A = r7;
        this.A07 = context;
        this.A04 = i;
        this.A08 = mediaFormat;
        this.A0H = r14;
        this.A0D = r10;
        this.A0J = r5;
        this.A0G = r13;
        this.A06 = j;
        this.A05 = j2;
        this.A09 = r6;
    }
}
