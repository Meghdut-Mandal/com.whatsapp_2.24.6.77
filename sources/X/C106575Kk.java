package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.5Kk  reason: invalid class name and case insensitive filesystem */
public class C106575Kk extends C107175Mv implements C160517l8 {
    public final C19420v0 A00;
    public final AnonymousClass3GT A01;
    public final C133356Xz A02;
    public final boolean A03;
    public volatile int A04;
    public volatile int A05;
    public volatile List A06 = C36441kJ.A14(0);
    public volatile List A07 = C36441kJ.A14(0);

    public Void A0G(Void... voidArr) {
        C133356Xz r3 = this.A02;
        ArrayList A08 = r3.A0C.A08(0);
        this.A05 = A08.size();
        AnonymousClass005 r1 = r3.A0F;
        this.A04 = ((AnonymousClass1XM) r1.get()).A04().size();
        if (this.A03) {
            this.A06 = ((C104665Ar) r1.get()).A0F();
            this.A07 = A08;
        }
        return super.A0G(voidArr);
    }

    public void Bc5(AnonymousClass68B r5) {
        C133356Xz r3 = this.A02;
        HashSet hashSet = r3.A0I;
        String str = r5.A0F;
        hashSet.remove(str);
        if (r3.A04 != null) {
            for (int i = 0; i < r3.A04.size(); i++) {
                if (AnonymousClass68B.A00(str, r3.A04, i)) {
                    r3.A04.set(i, r5);
                    C133356Xz.A02(r3, (String) null, r3.A04);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bc6(java.util.List r7) {
        /*
            r6 = this;
            int r0 = r6.A04
            boolean r3 = X.AnonymousClass000.A1R(r0)
            int r0 = r6.A05
            boolean r2 = X.AnonymousClass000.A1R(r0)
            X.6Xz r5 = r6.A02
            r5.A05 = r3
            r5.A06 = r2
            X.3GT r1 = r6.A01
            int r0 = r7.size()
            r1.A00(r0)
            if (r3 == 0) goto L_0x0036
            java.lang.String r0 = "recents"
        L_0x001f:
            X.C133356Xz.A01(r5, r0, r7)
        L_0x0022:
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x0035
            java.util.List r2 = r6.A06
            java.util.List r0 = r6.A07
            X.3rU r1 = r5.A00
            if (r1 == 0) goto L_0x0035
            java.util.ArrayList r0 = r5.A03(r2, r0)
            r1.A03(r0)
        L_0x0035:
            return
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            java.lang.String r0 = "starred"
            goto L_0x001f
        L_0x003b:
            int r0 = r7.size()
            r4 = 0
            if (r0 <= 0) goto L_0x0061
            java.util.Iterator r3 = r7.iterator()
        L_0x0046:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0061
            X.68B r2 = X.C90514aH.A0g(r3)
            boolean r1 = r2.A0R
            X.005 r0 = r5.A0F
            java.lang.Object r0 = r0.get()
            X.5Ar r0 = (X.C104665Ar) r0
            boolean r0 = r0.A0E
            if (r1 != r0) goto L_0x0046
            java.lang.String r0 = r2.A0F
            goto L_0x001f
        L_0x0061:
            X.C133356Xz.A01(r5, r4, r7)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106575Kk.Bc6(java.util.List):void");
    }

    public void Bc7() {
        this.A02.A02 = null;
    }

    public void Bc8(String str) {
        C133356Xz r2 = this.A02;
        r2.A0I.remove(str);
        if (r2.A04 != null) {
            for (int i = 0; i < r2.A04.size(); i++) {
                if (AnonymousClass68B.A00(str, r2.A04, i)) {
                    r2.A04.remove(i);
                    C133356Xz.A02(r2, (String) null, r2.A04);
                    return;
                }
            }
        }
    }

    public C106575Kk(C19420v0 r3, AnonymousClass1AP r4, AnonymousClass3GT r5, C133356Xz r6, boolean z) {
        super(r4);
        this.A02 = r6;
        this.A00 = r3;
        this.A01 = r5;
        this.A00 = this;
        this.A03 = z;
    }
}
