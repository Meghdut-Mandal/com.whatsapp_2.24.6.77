package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8YL  reason: invalid class name */
public class AnonymousClass8YL extends AnonymousClass1LZ {
    public final C220412q A00;
    public final C21158AAs A01;
    public final AnonymousClass1AB A02;
    public final AnonymousClass1A6 A03;
    public final C19970wo A04;
    public final C19420v0 A05;
    public final AnonymousClass1DP A06;
    public final AnonymousClass163 A07;
    public final AnonymousClass1CR A08;

    public String A0B() {
        return "regular_low";
    }

    public String A0C() {
        return "archive";
    }

    public boolean A0H() {
        return true;
    }

    private void A00(C65073Qp r7, C176078bX r8) {
        boolean z = r7.A0i;
        boolean z2 = r8.A02;
        if (z != z2) {
            C36321k7.A1X("ArchiveChatHandler/setArchive - ", AnonymousClass000.A0u(), z2);
            r7.A0i = z2;
            this.A07.A0E(r7);
            this.A06.A00();
            if (z2) {
                AnonymousClass1CR r1 = this.A08;
                AnonymousClass11F r5 = r8.A01;
                if (r1.A0k(r5)) {
                    r1.A0T(r5);
                    this.A02.A07(1);
                    this.A00.A0G(Collections.singleton(new C176108ba(r5, r8.A04, false)));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r1.A04 >= r10.A04) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r1.A04 >= r10.A04) goto L_0x0035;
     */
    /* renamed from: A01 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(X.C176078bX r10) {
        /*
            r9 = this;
            boolean r6 = r10.A02
            r5 = 0
            if (r6 == 0) goto L_0x0059
            X.11F r2 = r10.A01
            java.lang.String[] r1 = X.C36441kJ.A1S()
            java.lang.String r0 = "pin_v1"
            X.C165567td.A14(r2, r0, r1)
            java.lang.String r8 = X.C201669k5.A00(r1)
            X.1AC r7 = r9.A00
            X.9k5 r1 = r7.A0B(r8)
            if (r1 == 0) goto L_0x0039
            X.8SS r0 = r1.A05()
            X.C18740tg.A06(r0)
            X.8OI r0 = r0.pinAction_
            if (r0 != 0) goto L_0x0029
            X.8OI r0 = X.AnonymousClass8OI.DEFAULT_INSTANCE
        L_0x0029:
            boolean r0 = r0.pinned_
            if (r0 == 0) goto L_0x0039
            long r2 = r1.A04
            long r0 = r10.A04
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x0039
        L_0x0035:
            r9.A07(r10)
            return
        L_0x0039:
            X.9k5 r1 = r7.A0A(r8)
            if (r1 == 0) goto L_0x0059
            X.8SS r0 = r1.A05()
            X.C18740tg.A06(r0)
            X.8OI r0 = r0.pinAction_
            if (r0 != 0) goto L_0x004c
            X.8OI r0 = X.AnonymousClass8OI.DEFAULT_INSTANCE
        L_0x004c:
            boolean r0 = r0.pinned_
            if (r0 == 0) goto L_0x0059
            long r3 = r1.A04
            long r1 = r10.A04
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0059
            goto L_0x0035
        L_0x0059:
            X.11F r1 = r10.A01
            X.12q r0 = r9.A00
            X.3Qp r2 = r0.A09(r1, r5)
            if (r2 == 0) goto L_0x00a7
            if (r6 != 0) goto L_0x0072
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ArchiveChatHandler/applyMutation/setArchivedState - "
        L_0x006b:
            X.C36321k7.A1X(r0, r1, r6)
            r9.A00(r2, r10)
            goto L_0x0035
        L_0x0072:
            X.AAs r0 = r9.A01
            X.9mP r1 = r0.A04(r1, r5)
            X.9mP r0 = r10.A00
            int r1 = X.C202679mP.A00(r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x0086
            if (r1 == r0) goto L_0x009b
            r0 = 2
            if (r1 == r0) goto L_0x009b
        L_0x0086:
            X.0v0 r1 = r9.A05
            boolean r0 = r1.A2F()
            if (r0 == 0) goto L_0x0035
            boolean r0 = r1.A2G()
            if (r0 != 0) goto L_0x0035
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ArchiveChatHandler/applyMutation/A_ENCLOSES_B/setArchivedState - "
            goto L_0x006b
        L_0x009b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ArchiveChatHandler/applyMutation/B_ENCLOSES_A/setArchivedState - "
            X.C36321k7.A1X(r0, r1, r6)
            r9.A00(r2, r10)
        L_0x00a7:
            r9.A08(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8YL.A0E(X.8bX):void");
    }

    public C201669k5 A0A(C202599mH r17, String str, boolean z) {
        C202599mH r3 = r17;
        String[] strArr = r3.A06;
        C199769fw r5 = r3.A01;
        AnonymousClass8SS r4 = r3.A03;
        if (strArr.length == 2 && "archive".equals(C165617ti.A0a(strArr))) {
            AnonymousClass11F A0N = C36421kH.A0N(strArr[1]);
            if (A0N == null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("archive-chat-mutation/from-key-value unable to create chat jid from ");
                C36321k7.A1Z(A0u, strArr[1]);
            } else if (C199769fw.A03.equals(r5) && r4 != null && C165577te.A1W(r4.bitField0_) && (r4.bitField0_ & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
                AnonymousClass8PN r0 = r4.archiveChatAction_;
                AnonymousClass8PN r2 = r0;
                if (r0 == null) {
                    r0 = AnonymousClass8PN.DEFAULT_INSTANCE;
                }
                if ((r0.bitField0_ & 1) != 0) {
                    if (r2 == null) {
                        r2 = AnonymousClass8PN.DEFAULT_INSTANCE;
                    }
                    boolean A1P = AnonymousClass000.A1P(r2.bitField0_ & 2);
                    AnonymousClass8QJ r02 = r2.messageRange_;
                    if (r02 == null) {
                        r02 = AnonymousClass8QJ.DEFAULT_INSTANCE;
                    }
                    C202679mP A022 = C202679mP.A02(r02, A1P);
                    boolean z2 = r2.archived_;
                    return new C176078bX(r3.A02, A022, A0N, str, r4.timestamp_, z2, z);
                }
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r4) {
        C176078bX r42 = (C176078bX) r4;
        C65073Qp A0W = C36371kC.A0W(this.A00, r42.A01);
        if (A0W == null) {
            A04(r42);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ArchiveChatHandler/handleNotReadyToSyncPendingMutation/setArchivedState - ");
        C36331k8.A1S(A0u, r42.A02);
        A00(A0W, r42);
        A06(r42);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        if (r8.A04 <= r5.A04) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0G(X.C201669k5 r19, X.C201669k5 r20) {
        /*
            r18 = this;
            r8 = r20
            r5 = r19
            X.8bX r5 = (X.C176078bX) r5
            X.8bX r8 = (X.C176078bX) r8
            r4 = r18
            if (r8 == 0) goto L_0x0073
            X.9mP r9 = r5.A00
            X.9mP r7 = r8.A00
            int r1 = X.C202679mP.A00(r9, r7)
            if (r1 == 0) goto L_0x006e
            r0 = 1
            if (r1 == r0) goto L_0x0077
            r0 = 2
            if (r1 == r0) goto L_0x0066
            long r2 = r5.A04
            long r0 = r8.A04
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x0063
            boolean r6 = r5.A02
        L_0x0026:
            r10 = 0
            X.11F r12 = r8.A01
            long r14 = java.lang.Math.max(r2, r0)
            r17 = 1
            X.9mP r11 = X.C202679mP.A01(r9, r7)
            X.8bX r9 = new X.8bX
            r13 = r10
            r16 = r6
            r9.<init>(r10, r11, r12, r13, r14, r16, r17)
            r4.A07(r5)
            X.1AC r1 = r4.A00
            java.util.Set r0 = java.util.Collections.singleton(r9)
            r1.A0G(r0)
            X.12q r1 = r4.A00
            X.11F r0 = r9.A01
            X.3Qp r2 = X.C36371kC.A0W(r1, r0)
            if (r2 == 0) goto L_0x0062
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ArchiveChatHandler/handleMutation/setArchivedState - "
            r1.append(r0)
            boolean r0 = r9.A02
            X.C36331k8.A1S(r1, r0)
            r4.A00(r2, r9)
        L_0x0062:
            return
        L_0x0063:
            boolean r6 = r8.A02
            goto L_0x0026
        L_0x0066:
            long r6 = r8.A04
            long r1 = r5.A04
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0077
        L_0x006e:
            X.1AC r0 = r4.A00
            r0.A0F(r8)
        L_0x0073:
            r4.A0E(r5)
            return
        L_0x0077:
            r4.A07(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8YL.A0G(X.9k5, X.9k5):void");
    }

    public C176078bX A0I(AnonymousClass11F r7, boolean z) {
        long A002 = C19970wo.A00(this.A04);
        return new C176078bX(this.A01.A04(r7, false), r7, A002, z);
    }

    public AnonymousClass8YL(C21158AAs aAs, AnonymousClass1AB r2, AnonymousClass1A6 r3, C19970wo r4, C19420v0 r5, AnonymousClass1DP r6, AnonymousClass163 r7, C220412q r8, AnonymousClass1AC r9, AnonymousClass1CR r10) {
        super(r9);
        this.A04 = r4;
        this.A07 = r7;
        this.A00 = r8;
        this.A06 = r6;
        this.A01 = aAs;
        this.A02 = r2;
        this.A08 = r10;
        this.A05 = r5;
        this.A03 = r3;
    }

    public List A0D(boolean z) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = this.A03.A05().iterator();
        while (it.hasNext()) {
            AnonymousClass11F r6 = (AnonymousClass11F) it.next();
            A0I.add(new C176078bX(this.A01.A04(r6, false), r6, C19970wo.A00(this.A04), true));
        }
        return A0I;
    }
}
