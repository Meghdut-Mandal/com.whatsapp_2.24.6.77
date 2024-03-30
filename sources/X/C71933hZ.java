package X;

import java.util.Iterator;

/* renamed from: X.3hZ  reason: invalid class name and case insensitive filesystem */
public class C71933hZ implements AnonymousClass4V8 {
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ AnonymousClass3B8 A05;
    public final /* synthetic */ AnonymousClass3DA A06;
    public final /* synthetic */ C64413Nw A07;

    public boolean BtY() {
        return false;
    }

    public C71933hZ(AnonymousClass3B8 r1, AnonymousClass3DA r2, C64413Nw r3, int i, int i2) {
        this.A07 = r3;
        this.A04 = i;
        this.A03 = i2;
        this.A05 = r1;
        this.A06 = r2;
    }

    public void BY0() {
        AnonymousClass1FD r1 = this.A07.A02;
        AnonymousClass3B8 r0 = this.A05;
        r1.A05(r0);
        AnonymousClass11F r6 = r0.A07;
        AnonymousClass3DA r5 = this.A06;
        C65503Si r7 = r5.A01;
        AnonymousClass1DG r2 = r7.A03;
        C66753Xe A002 = AnonymousClass1DG.A00(r2, r6);
        C36341k9.A0u(C19420v0.A00(r7.A01).remove("storage_usage_deletion_jid").remove("storage_usage_deletion_current_msg_cnt"), "storage_usage_deletion_all_msg_cnt");
        C229516p r3 = r7.A00;
        C66753Xe A003 = AnonymousClass1DG.A00(r2, r6);
        AnonymousClass00C.A0D(r6, 1);
        r3.A0R(new C80193v0(A003, r6, r6.getRawString()));
        Iterator it = r7.A07.iterator();
        while (it.hasNext()) {
            ((C88764Ty) it.next()).BVI(A002, r6);
        }
        r5.A00.BY0();
    }

    public void Bdh(int i, int i2) {
        int i3 = this.A02;
        if (i3 == -1) {
            i3 = Math.max(this.A03 / 100, 1);
            this.A02 = i3;
        }
        int i4 = this.A04 + i;
        this.A00 = i4;
        if (i4 - this.A01 > i3) {
            this.A06.A00(this.A05.A07, i4, this.A03);
            this.A01 = this.A00;
        }
    }

    public void Bh7() {
        this.A00 = this.A04;
    }
}
