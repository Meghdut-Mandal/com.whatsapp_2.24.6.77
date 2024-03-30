package X;

import android.content.Context;
import android.media.MediaFormat;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: X.5zN  reason: invalid class name and case insensitive filesystem */
public class C125135zN {
    public long A00 = 0;
    public long A01 = 0;
    public MediaFormat A02 = null;
    public C131456Pc A03;
    public AnonymousClass6VP A04;
    public AnonymousClass6ED A05;
    public AnonymousClass6V3 A06;
    public C131656Py A07;
    public C159107ip A08;
    public C160937lp A09;
    public File A0A;
    public ExecutorService A0B;
    public final Context A0C;
    public final C129246Ga A0D;
    public final AnonymousClass65N A0E;
    public final AnonymousClass7ez A0F;
    public final C109635Yi A0G;
    public final C109655Yk A0H;
    public final C159097io A0I;
    public final C118685oZ A0J;
    public final C132186So A0K;
    public final C109695Yo A0L;
    public final C125085zI A0M;
    public final AnonymousClass64W A0N;
    public final C109615Yg A0O;
    public final C109645Yj A0P;
    public volatile boolean A0Q;

    public C125135zN(Context context, AnonymousClass63I r12, AnonymousClass6M6 r13, C129246Ga r14, C109615Yg r15, AnonymousClass65N r16, AnonymousClass7ez r17, C109635Yi r18, C109645Yj r19, C109655Yk r20, C159097io r21, C118685oZ r22, C125085zI r23) {
        this.A0C = context;
        AnonymousClass7ez r6 = r17;
        this.A0F = r6;
        C118685oZ r9 = r22;
        this.A0J = r9;
        C125085zI r2 = r23;
        this.A0M = r2;
        this.A0G = r18;
        this.A0I = r21;
        C109645Yj r7 = r19;
        this.A0P = r7;
        C109655Yk r8 = r20;
        this.A0H = r8;
        this.A0O = r15;
        this.A0K = new C132186So(r2.A09);
        this.A0D = r14;
        this.A0L = r2.A06;
        this.A0N = new AnonymousClass64W(context, r12, r13, r6, r7, r8, r9);
        this.A0E = r16;
    }
}
