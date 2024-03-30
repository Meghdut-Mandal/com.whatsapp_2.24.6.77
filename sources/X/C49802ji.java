package X;

import android.os.SystemClock;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.Collection;

/* renamed from: X.2ji  reason: invalid class name and case insensitive filesystem */
public final class C49802ji extends C132446Tt {
    public final int A00;
    public final int A01 = R.string.f12nameremoved;
    public final int A02;
    public final long A03;
    public final long A04;
    public final AnonymousClass17Y A05;
    public final AnonymousClass164 A06;
    public final C144576sT A07;
    public final C19420v0 A08;
    public final C25281Fr A09;
    public final AnonymousClass16E A0A;
    public final C20810yC A0B;
    public final C29731Xt A0C;
    public final WeakReference A0D;
    public final Collection A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r6 != 3) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r8) {
        /*
            r7 = this;
            X.16E r0 = r7.A0A
            int r6 = r7.A00
            java.util.Collection r5 = r7.A0E
            r0.A0F(r5, r6)
            X.6sT r0 = r7.A07
            r0.A01()
            X.1Xt r4 = r7.A0C
            X.2Ns r3 = new X.2Ns
            r3.<init>()
            r2 = 1
            if (r6 == 0) goto L_0x0064
            r1 = 3
            if (r6 == r2) goto L_0x0069
            r0 = 2
            if (r6 == r0) goto L_0x005f
            if (r6 == r1) goto L_0x0064
        L_0x0020:
            X.0yW r0 = r4.A07
            r0.Bly(r3)
            X.164 r1 = r7.A06
            com.whatsapp.jobqueue.job.SendStatusPrivacyListJob r0 = new com.whatsapp.jobqueue.job.SendStatusPrivacyListJob
            r0.<init>(r5, r6)
            r1.A01(r0)
            X.0v0 r0 = r7.A08
            r0.A11()
            long r2 = r7.A03
            long r0 = r7.A04
            X.C225314u.A0S(r2, r0)
            boolean r0 = r7.A0I
            if (r0 == 0) goto L_0x0097
            X.0yC r1 = r7.A0B
            r0 = 7906(0x1ee2, float:1.1079E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0053
            X.1Fr r5 = r7.A09
            r4 = 1
        L_0x004c:
            X.12P r0 = r5.A06
            X.1M0 r3 = r0.A05()
            goto L_0x0070
        L_0x0053:
            r0 = 7905(0x1ee1, float:1.1077E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0097
            X.1Fr r5 = r7.A09
            r4 = 0
            goto L_0x004c
        L_0x005f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x006d
        L_0x0064:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x006d
        L_0x0069:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x006d:
            r3.A00 = r0
            goto L_0x0020
        L_0x0070:
            X.71s r2 = r3.B1k()     // Catch:{ all -> 0x008a }
            r1 = 0
            r0 = 0
            r5.A02(r1, r0, r4)     // Catch:{ all -> 0x0080 }
            r2.A00()     // Catch:{ all -> 0x0080 }
            r2.close()     // Catch:{ all -> 0x008a }
            goto L_0x0094
        L_0x0080:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0085 }
            goto L_0x0089
        L_0x0085:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x008a }
        L_0x0089:
            throw r1     // Catch:{ all -> 0x008a }
        L_0x008a:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x008f }
            throw r1
        L_0x008f:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0094:
            r3.close()
        L_0x0097:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49802ji.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C225314u A0W = C36411kG.A0W(this.A0D);
        if (A0W != null && !A0W.BLh()) {
            if (this.A0G) {
                A0W.Bnv();
            }
            int i = this.A02;
            if (i != -1) {
                this.A05.A06(this.A01, i);
            }
            if (this.A0H) {
                A0W.setResult(-1, C53092ql.A00(A0W.getIntent()));
            }
            if (this.A0F) {
                A0W.finish();
            }
        } else if (this.A0G) {
            this.A05.A02();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C49802ji(C225314u r4, AnonymousClass17Y r5, AnonymousClass164 r6, C144576sT r7, C19970wo r8, C19420v0 r9, C25281Fr r10, AnonymousClass16E r11, C20810yC r12, C29731Xt r13, Collection collection, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(r4, z3);
        C36321k7.A1B(r4, r8, r12, r5, r11);
        C36321k7.A1C(r6, r7, r13, r9, r10);
        this.A0B = r12;
        this.A05 = r5;
        this.A0A = r11;
        this.A06 = r6;
        this.A07 = r7;
        this.A0C = r13;
        this.A08 = r9;
        this.A09 = r10;
        this.A00 = i;
        this.A0E = collection;
        this.A04 = j;
        this.A0G = z;
        this.A0H = z2;
        this.A02 = i2;
        this.A0F = z4;
        this.A0I = z5;
        this.A0D = AnonymousClass001.A0F(r4);
        this.A03 = SystemClock.elapsedRealtime();
    }
}
