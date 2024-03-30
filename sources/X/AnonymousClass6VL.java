package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6VL  reason: invalid class name */
public class AnonymousClass6VL {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public final C20690y0 A0A;
    public final C24461Cn A0B;
    public final C132716Uy A0C;
    public final C24431Ck A0D;
    public final AnonymousClass3S1 A0E;
    public final C33101ei A0F;
    public final C33121ek A0G;
    public final C1273267v A0H;
    public final C131096Ns A0I;
    public final C33131el A0J;
    public final C133226Xi A0K;
    public final AnonymousClass179 A0L;
    public final C24341Cb A0M;
    public final C19970wo A0N;
    public final C19630wG A0O;
    public final C20830yE A0P;
    public final C19420v0 A0Q;
    public final AnonymousClass1Q9 A0R;
    public final AnonymousClass12P A0S;
    public final C20810yC A0T;
    public final C21010yW A0U;
    public final C1042758y A0V;
    public final AnonymousClass19A A0W;
    public final C21570zS A0X;
    public final AnonymousClass005 A0Y;
    public final String A0Z;
    public final Map A0a = C90524aI.A0s();
    public final AtomicInteger A0b = C90484aE.A0v();
    public final AtomicLong A0c = new AtomicLong(0);
    public final AtomicLong A0d;
    public final AtomicLong A0e = new AtomicLong(0);
    public final AtomicLong A0f;
    public final boolean A0g;
    public final AnonymousClass7fW A0h;
    public final List A0i;

    public static String A00(C1042758y r6) {
        int i;
        int i2;
        int i3;
        int i4;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[9];
        Double d = r6.A0A;
        if (d != null) {
            i = (int) d.doubleValue();
        } else {
            i = -1;
        }
        AnonymousClass000.A1J(objArr, i);
        Double d2 = r6.A06;
        if (d2 != null) {
            i2 = (int) d2.doubleValue();
        } else {
            i2 = -1;
        }
        AnonymousClass000.A1K(objArr, i2);
        Double d3 = r6.A08;
        if (d3 != null) {
            i3 = (int) d3.doubleValue();
        } else {
            i3 = -1;
        }
        C36331k8.A1V(objArr, i3);
        Double d4 = r6.A07;
        if (d4 != null) {
            i4 = (int) d4.doubleValue();
        } else {
            i4 = -1;
        }
        C36341k9.A1T(objArr, i4);
        objArr[4] = r6.A0f;
        objArr[5] = r6.A00;
        objArr[6] = r6.A0c;
        objArr[7] = r6.A0W;
        objArr[8] = r6.A0V;
        return String.format(locale, "total size:%d, chat size:%d, media size:%d, media files count:%d retryCount:%d includeVideos:%b wifi-on-finish:%b backup-stage:%d result:%d", objArr);
    }

    private final void A01() {
        C1042758y r2;
        long j;
        long j2;
        double d;
        try {
            C20810yC r1 = this.A0T;
            AnonymousClass00C.A0D(r1, 0);
            if (r1.A0E(2997)) {
                Iterator A14 = C90514aH.A14(this.A0R.A0O(3));
                d = 0.0d;
                while (A14.hasNext()) {
                    d += (double) C90504aG.A0a(A14).length();
                }
            } else {
                File A0I2 = this.A0R.A0I();
                if (A0I2 != null) {
                    d = (double) A0I2.length();
                } else {
                    d = 0.0d;
                }
            }
            r2 = this.A0V;
            r2.A06 = Double.valueOf(d);
        } catch (IOException e) {
            Log.e("gdrive/backup", e);
            r2 = this.A0V;
            r2.A06 = Double.valueOf(0.0d);
        }
        double d2 = (double) this.A0d.get();
        Double d3 = r2.A06;
        if (d3 != null) {
            r2.A08 = Double.valueOf(Math.max(d2 - d3.doubleValue(), 0.0d));
            r2.A0A = C90524aI.A0Z(this.A05);
            Iterator it = this.A0i.iterator();
            long j3 = 0;
            while (it.hasNext()) {
                File A0a2 = C90504aG.A0a(it);
                long j4 = 0;
                if (A0a2.exists()) {
                    if (A0a2.isDirectory()) {
                        LinkedList A0l = C90524aI.A0l();
                        A0l.add(A0a2);
                        long j5 = 0;
                        while (A0l.peek() != null) {
                            Object poll = A0l.poll();
                            C18740tg.A06(poll);
                            File[] listFiles = ((File) poll).listFiles();
                            if (listFiles != null) {
                                for (File file : listFiles) {
                                    if (file.exists()) {
                                        if (file.isDirectory()) {
                                            A0l.add(file);
                                        } else {
                                            if (file.length() > 0) {
                                                j2 = 1;
                                            } else {
                                                j2 = 0;
                                            }
                                            j5 += j2;
                                        }
                                    }
                                }
                            }
                        }
                        j4 = j5;
                    } else if (A0a2.length() > 0) {
                        j4 = 1;
                    }
                }
                j3 += j4;
            }
            r2.A07 = C90524aI.A0Z(j3);
            C19420v0 r12 = this.A0Q;
            r2.A0f = C36441kJ.A0y(r12.A0M());
            r2.A00 = Boolean.valueOf(r12.A2E());
            if (this.A0F.A00 == 1) {
                j = 1;
            } else {
                j = 0;
            }
            r2.A0c = Long.valueOf(j);
            if (r2.A0W == null) {
                r2.A0W = 1;
            }
            C133226Xi r4 = this.A0K;
            r2.A09 = Double.valueOf((double) (r4.A06.A00 + r4.A0A.get()));
            Integer num = r2.A0V;
            if (num == null || num.intValue() == 1) {
                r2.A0V = C36361kB.A0j();
            }
            r2.A02 = Boolean.valueOf(this.A0B.A08());
            for (AnonymousClass1CP A0G2 : (Iterable) C36411kG.A0v(this.A0Y)) {
                A0G2.A0G(r2);
            }
            this.A0U.Blw(r2);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("gdrive/backup ");
            C36321k7.A1a(A0u, A00(r2));
            return;
        }
        throw C36381kD.A0k();
    }

    private final boolean A02(AtomicReference atomicReference, int i) {
        StringBuilder A0v;
        String str;
        if (!this.A0F.A0Q.get()) {
            Log.i("gdrive/backup/cancelled.");
            return true;
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            Log.i("gdrive/backup", th);
            if ((th instanceof C101884yR) || (th instanceof C101874yQ) || (th instanceof C101794yI) || (th instanceof C101804yJ) || (th instanceof C101864yP) || (th instanceof C101784yH) || (th instanceof C101774yG)) {
                throw th;
            }
        }
        AtomicLong atomicLong = this.A0d;
        if (atomicLong.get() > 0) {
            AtomicLong atomicLong2 = this.A0e;
            if (C90474aD.A00(atomicLong2, atomicLong) > 1.0d) {
                A0v = AnonymousClass000.A0v("gdrive/backup/too-many-failures/");
                A0v.append(C90474aD.A00(atomicLong2, atomicLong));
                str = "% bytes";
                C36321k7.A1a(A0v, str);
                C1042758y.A00(this.A0V, 38);
                return true;
            }
        }
        if (i <= 0) {
            return false;
        }
        AtomicInteger atomicInteger = this.A0b;
        double d = (double) i;
        if ((((double) atomicInteger.get()) * 100.0d) / d <= 1.0d) {
            return false;
        }
        A0v = AnonymousClass000.A0v("gdrive/backup/too-many-failures/");
        A0v.append((((double) atomicInteger.get()) * 100.0d) / d);
        str = "% files";
        C36321k7.A1a(A0v, str);
        C1042758y.A00(this.A0V, 38);
        return true;
    }

    public final void A04(boolean z) {
        this.A0G.A07(false);
        if (z) {
            C19420v0 r5 = this.A0Q;
            int i = C36341k9.A0E(r5).getInt("gdrive_successive_backup_failed_count", 0) + 1;
            C36321k7.A1T("wa-shared-preferences/increment-backup-failed-count/updated-count/", AnonymousClass000.A0u(), i);
            C36321k7.A0q(r5, "gdrive_successive_backup_failed_count", i);
            if (r5.A0M() >= 4) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("gdrive/backup ");
                A0u.append(r5.A0M());
                C36321k7.A1Z(A0u, " successive backups have failed, this is probably unusual.");
            }
        }
        A01();
        this.A05 = 0;
        this.A0Q.A1A(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v443, resolved type: X.6Te} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x05bf */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x04e4 A[Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x05c5 A[Catch:{ 4yE -> 0x064d }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x066b A[Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0784 A[Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0be4 A[Catch:{ 4yI -> 0x0bfd, 5VQ -> 0x0bf3, 1ej -> 0x0c13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:492:0x0594 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:504:0x083e A[EDGE_INSN: B:504:0x083e->B:233:0x083e ?: BREAK  , SYNTHETIC] */
    public final boolean A05() {
        /*
            r64 = this;
            r0 = r64
            X.1ek r1 = r0.A0G
            r63 = r1
            java.util.Iterator r2 = X.C36361kB.A0s(r63)
        L_0x000a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x001a
            java.lang.Object r1 = r2.next()
            X.1eo r1 = (X.C33151eo) r1
            r1.BS0()
            goto L_0x000a
        L_0x001a:
            X.0v0 r1 = r0.A0Q
            r62 = r1
            r20 = 1
            r2 = 1
            r1.A1A(r2)
            X.1ei r1 = r0.A0F
            r61 = r1
            boolean r6 = r0.A0g
            X.005 r1 = r1.A0P
            java.lang.Object r1 = r1.get()
            X.15t r1 = (X.C227815t) r1
            X.15u r3 = r1.A00
            if (r6 == 0) goto L_0x003c
            boolean r1 = r3.A01()
            if (r1 == 0) goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            r1 = r61
            r1.A08 = r2
            r1.A09(r3)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "gdrive/backup/force-backup-over-cellular/"
            r2.append(r1)
            r1 = r61
            boolean r1 = r1.A04
            X.C36331k8.A1S(r2, r1)
            X.58y r1 = r0.A0V
            X.1Ck r2 = r0.A0D
            r60 = r2
            X.0v0 r2 = r2.A03
            r59 = r2
            boolean r4 = r59.A2I()
            r2 = 0
            if (r4 == 0) goto L_0x00aa
            java.lang.Long r4 = X.C90474aD.A0Y()
        L_0x006a:
            r1.A0b = r4
            X.6Xi r4 = r0.A0K
            r21 = r4
            X.782 r4 = r4.A06
            r58 = r4
            r8 = 0
            r4.A00 = r8
            r4 = r21
            java.util.concurrent.atomic.AtomicInteger r4 = r4.A0A
            r57 = r4
            r4.set(r8)
            java.util.concurrent.atomic.AtomicLong r4 = r0.A0e
            r56 = r4
            r4.set(r2)
            java.util.concurrent.atomic.AtomicInteger r4 = r0.A0b
            r55 = r4
            r4.set(r8)
            java.util.concurrent.atomic.AtomicLong r4 = r0.A0c
            r44 = r4
            r4.set(r2)
            r0.A05 = r2
            r0.A01 = r8
            r0.A00 = r8
            r0.A07 = r2
            r0.A02 = r2
            r0.A03 = r2
            r0.A08 = r2
            r0.A06 = r2
            r0.A09 = r2
            r0.A04 = r2
            goto L_0x00af
        L_0x00aa:
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            goto L_0x006a
        L_0x00af:
            java.lang.Integer r27 = X.C36361kB.A0j()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = r27
            r1.A0W = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.1el r4 = r0.A0J     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r54 = r4
            r7 = 14
            r5 = r4
            r4 = r21
            boolean r4 = X.AnonymousClass6YN.A0C(r5, r4, r7)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x0bcf
            java.lang.String r29 = "gdrive/backup/files"
            com.whatsapp.util.Log.i((java.lang.String) r29)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = r63
            r4.A00 = r8     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.Iterator r5 = X.C36361kB.A0s(r63)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x00d3:
            boolean r4 = r5.hasNext()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x00e3
            java.lang.Object r4 = r5.next()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.1eo r4 = (X.C33151eo) r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4.BRy()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x00d3
        L_0x00e3:
            java.lang.Integer r4 = X.C36421kH.A0U()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r1.A0W = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.List r28 = java.util.Collections.synchronizedList(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.4xu r8 = new X.4xu     // Catch:{ 5VQ -> 0x0bb3 }
            r4 = r28
            r8.<init>(r0, r4)     // Catch:{ 5VQ -> 0x0bb3 }
            java.lang.String r5 = "gdrive/backup/getLatestMessageStoreBackupFiles looking for message store backup files"
            r4 = r54
            java.lang.Object r4 = X.AnonymousClass6UR.A01(r8, r4, r5, r7)     // Catch:{ 5VQ -> 0x0bb3 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ 5VQ -> 0x0bb3 }
            if (r4 == 0) goto L_0x0ba6
            boolean r4 = r4.booleanValue()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x0ba6
            X.AnonymousClass00C.A0B(r28)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.Iterator r5 = r28.iterator()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x0111:
            boolean r4 = r5.hasNext()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x011f
            java.io.File r4 = X.C90504aG.A0a(r5)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4.getName()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x0111
        L_0x011f:
            r9 = 0
            java.util.Iterator r8 = r28.iterator()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x0124:
            boolean r4 = r8.hasNext()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x0143
            java.io.File r7 = X.C90504aG.A0a(r8)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r7 == 0) goto L_0x0124
            java.lang.String r5 = r7.getName()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "msgstore.db"
            boolean r4 = r5.startsWith(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x0124
            boolean r4 = r7.exists()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x0124
            r9 = 1
        L_0x0143:
            r4 = 31
            java.lang.Integer r30 = java.lang.Integer.valueOf(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r9 != 0) goto L_0x0156
            java.lang.String r4 = "gdrive/backup/files/chatdb doesn't exist"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x0150:
            r4 = r30
            r1.A0V = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x0bd9
        L_0x0156:
            r4 = r61
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.A0Q     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r52 = r4
            boolean r4 = r52.get()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r25 = "gdrive/backup/files/cancelled"
            if (r4 == 0) goto L_0x0ba2
            java.lang.Integer r26 = X.C36371kC.A0n()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = r26
            r1.A0W = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = r0.A0Z     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r7 = r54
            r8 = r21
            r5 = r29
            X.6Te r19 = X.AnonymousClass6YN.A01(r7, r8, r4, r5)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r19 != 0) goto L_0x019c
            r5 = 1
            X.7oz r7 = new X.7oz     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r7.<init>(r8, r4, r5)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r5 = r54
            r4 = r29
            java.lang.Object r19 = X.AnonymousClass6UR.A00(r7, r5, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = r19
            X.6Te r4 = (X.C132346Te) r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r19 = r4
            if (r4 != 0) goto L_0x019c
            r4 = 30
            X.C1042758y.A00(r1, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "gdrive/backup/files unable to create backup"
        L_0x0197:
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x0bd9
        L_0x019c:
            boolean r4 = r52.get()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x0ba2
            java.lang.Integer r4 = X.C36371kC.A0o()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r1.A0W = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.0wo r4 = r0.A0N     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r24 = r4
            X.0yC r4 = r0.A0T     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r51 = r4
            long r40 = X.AnonymousClass6YO.A02(r4, r6)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r5 = 4777(0x12a9, float:6.694E-42)
            boolean r4 = r4.A0E(r5)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 != 0) goto L_0x01c0
            r8 = 0
            goto L_0x03b9
        L_0x01c0:
            X.135 r22 = new X.135     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r22.<init>()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r5 = "backupEstimatedDeltaSize"
            r4 = r22
            r4.A02 = r5     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r5 = "backup-size-estimation"
            X.14g r18 = new X.14g     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = r18
            r4.<init>((java.lang.String) r5)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0bbc }
            r4 = r28
            r8.addAll(r4)     // Catch:{ all -> 0x0bbc }
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0bbc }
            X.179 r4 = r0.A0L     // Catch:{ all -> 0x0bbc }
            java.io.File r5 = r4.A02()     // Catch:{ all -> 0x0bbc }
            r4 = r61
            X.AnonymousClass6Y6.A04(r4, r5, r7)     // Catch:{ all -> 0x0bbc }
            r8.addAll(r7)     // Catch:{ all -> 0x0bbc }
            java.util.Iterator r7 = r8.iterator()     // Catch:{ all -> 0x0bbc }
            r8 = 0
        L_0x01f5:
            boolean r4 = r7.hasNext()     // Catch:{ all -> 0x0bbc }
            if (r4 == 0) goto L_0x0205
            java.io.File r4 = X.C90504aG.A0a(r7)     // Catch:{ all -> 0x0bbc }
            long r4 = r4.length()     // Catch:{ all -> 0x0bbc }
            long r8 = r8 + r4
            goto L_0x01f5
        L_0x0205:
            java.lang.String r13 = r62.A0c()     // Catch:{ all -> 0x0bbc }
            X.1Cn r4 = r0.A0B     // Catch:{ all -> 0x0bbc }
            r23 = r4
            if (r13 == 0) goto L_0x026b
            int r4 = r13.length()     // Catch:{ all -> 0x0bbc }
            if (r4 == 0) goto L_0x026b
            r4 = r23
            X.00T r11 = r4.A01     // Catch:{ all -> 0x0bbc }
            android.content.SharedPreferences r7 = X.C36411kG.A0E(r11)     // Catch:{ all -> 0x0bbc }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0bbc }
            java.lang.String r4 = "backup_stats_media_size:"
            java.lang.String r4 = X.AnonymousClass000.A0p(r4, r13, r5)     // Catch:{ all -> 0x0bbc }
            long r32 = r7.getLong(r4, r2)     // Catch:{ all -> 0x0bbc }
            android.content.SharedPreferences r7 = X.C36411kG.A0E(r11)     // Catch:{ all -> 0x0bbc }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0bbc }
            java.lang.String r4 = "backup_stats_timestamp:"
            java.lang.String r4 = X.AnonymousClass000.A0p(r4, r13, r5)     // Catch:{ all -> 0x0bbc }
            long r34 = r7.getLong(r4, r2)     // Catch:{ all -> 0x0bbc }
            android.content.SharedPreferences r10 = X.C36411kG.A0E(r11)     // Catch:{ all -> 0x0bbc }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0bbc }
            java.lang.String r4 = "backup_stats_msg_id:"
            java.lang.String r7 = X.AnonymousClass000.A0p(r4, r13, r5)     // Catch:{ all -> 0x0bbc }
            r4 = -1
            long r36 = r10.getLong(r7, r4)     // Catch:{ all -> 0x0bbc }
            android.content.SharedPreferences r11 = X.C36411kG.A0E(r11)     // Catch:{ all -> 0x0bbc }
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0bbc }
            java.lang.String r7 = "backup_stats_prem_msg_id:"
            java.lang.String r7 = X.AnonymousClass000.A0p(r7, r13, r10)     // Catch:{ all -> 0x0bbc }
            long r38 = r11.getLong(r7, r4)     // Catch:{ all -> 0x0bbc }
            X.6C6 r17 = new X.6C6     // Catch:{ all -> 0x0bbc }
            r31 = r17
            r31.<init>(r32, r34, r36, r38)     // Catch:{ all -> 0x0bbc }
            goto L_0x027a
        L_0x026b:
            r36 = -1
            X.6C6 r17 = new X.6C6     // Catch:{ all -> 0x0bbc }
            r32 = 0
            r34 = 0
            r38 = -1
            r31 = r17
            r31.<init>(r32, r34, r36, r38)     // Catch:{ all -> 0x0bbc }
        L_0x027a:
            if (r6 != 0) goto L_0x030b
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0bbc }
            r4 = r17
            long r4 = r4.A03     // Catch:{ all -> 0x0bbc }
            long r10 = r10 - r4
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            long r10 = r10 / r4
            r5 = 7406(0x1cee, float:1.0378E-41)
            r4 = r51
            long r5 = X.C36441kJ.A0B(r4, r5)     // Catch:{ all -> 0x0bbc }
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x030b
            java.lang.String r4 = "gdrive/backup/backup-size-estimation/incremental calculation"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0bbc }
            java.lang.String r5 = "partial"
            r4 = r22
            r4.A01 = r5     // Catch:{ all -> 0x0bbc }
            r4 = r17
            long r4 = r4.A00     // Catch:{ all -> 0x0bbc }
            X.3S1 r13 = r0.A0E     // Catch:{ all -> 0x0bbc }
            X.67v r14 = r0.A0H     // Catch:{ all -> 0x0bbc }
            boolean r10 = r59.A2I()     // Catch:{ all -> 0x0bbc }
            r6 = r17
            long r6 = r6.A01     // Catch:{ all -> 0x0bbc }
            java.lang.Long r15 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0bbc }
            if (r10 == 0) goto L_0x02b9
            r6 = 16
            goto L_0x02bb
        L_0x02b9:
            r6 = 0
        L_0x02bb:
            r10 = 0
            X.14g r12 = new X.14g     // Catch:{ all -> 0x0bbc }
            r12.<init>((boolean) r10)     // Catch:{ all -> 0x0bbc }
            java.lang.String r10 = "gdrive/backup/quota/calculateBackupSize"
            r12.A04(r10)     // Catch:{ all -> 0x0bbc }
            X.0yC r11 = r13.A03     // Catch:{ all -> 0x0bbc }
            r10 = 5250(0x1482, float:7.357E-42)
            int r11 = r11.A07(r10)     // Catch:{ all -> 0x0bbc }
            X.3d7 r10 = new X.3d7     // Catch:{ all -> 0x0bbc }
            r10.<init>(r13, r15, r11)     // Catch:{ all -> 0x0bbc }
            X.00I r10 = X.AnonymousClass3S1.A01(r10, r13, r14, r6)     // Catch:{ all -> 0x0bbc }
            java.lang.Object r10 = r10.A00     // Catch:{ all -> 0x0bbc }
            long r16 = X.C90524aI.A07(r10)     // Catch:{ all -> 0x0bbc }
            X.0v5 r10 = r13.A00     // Catch:{ all -> 0x0bbc }
            boolean r10 = r10.A05()     // Catch:{ all -> 0x0bbc }
            if (r10 == 0) goto L_0x0304
            X.3d4 r11 = new X.3d4     // Catch:{ all -> 0x0bbc }
            r11.<init>(r13)     // Catch:{ all -> 0x0bbc }
            r15 = 0
            X.14g r10 = new X.14g     // Catch:{ all -> 0x0bbc }
            r10.<init>((boolean) r15)     // Catch:{ all -> 0x0bbc }
            java.lang.String r15 = "gdrive/backup/quota/calculatePremiumMessageMediaBackupSize"
            r10.A04(r15)     // Catch:{ all -> 0x0bbc }
            X.00I r6 = X.AnonymousClass3S1.A01(r11, r13, r14, r6)     // Catch:{ all -> 0x0bbc }
            java.lang.Object r6 = r6.A00     // Catch:{ all -> 0x0bbc }
            long r6 = X.C90524aI.A07(r6)     // Catch:{ all -> 0x0bbc }
            long r16 = r16 + r6
            r10.A01()     // Catch:{ all -> 0x0bbc }
        L_0x0304:
            r12.A01()     // Catch:{ all -> 0x0bbc }
            long r4 = r4 + r16
            goto L_0x039c
        L_0x030b:
            java.lang.String r4 = "gdrive/backup/backup-size-estimation/full calculation"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0bbc }
            java.lang.String r5 = "full"
            r4 = r22
            r4.A01 = r5     // Catch:{ all -> 0x0bbc }
            X.3S1 r11 = r0.A0E     // Catch:{ all -> 0x0bbc }
            X.67v r14 = r0.A0H     // Catch:{ all -> 0x0bbc }
            boolean r4 = r59.A2I()     // Catch:{ all -> 0x0bbc }
            r5 = 0
            if (r4 == 0) goto L_0x0324
            r6 = 16
            goto L_0x0326
        L_0x0324:
            r6 = 0
        L_0x0326:
            X.14g r16 = new X.14g     // Catch:{ all -> 0x0bbc }
            r10 = 0
            r4 = r16
            r4.<init>((boolean) r10)     // Catch:{ all -> 0x0bbc }
            java.lang.String r10 = "gdrive/backup/quota/calculateBackupSize"
            r4.A04(r10)     // Catch:{ all -> 0x0bbc }
            X.0yC r10 = r11.A03     // Catch:{ all -> 0x0bbc }
            r4 = 5250(0x1482, float:7.357E-42)
            int r10 = r10.A07(r4)     // Catch:{ all -> 0x0bbc }
            X.3d7 r4 = new X.3d7     // Catch:{ all -> 0x0bbc }
            r4.<init>(r11, r5, r10)     // Catch:{ all -> 0x0bbc }
            X.00I r4 = X.AnonymousClass3S1.A01(r4, r11, r14, r6)     // Catch:{ all -> 0x0bbc }
            java.lang.Object r5 = r4.A01     // Catch:{ all -> 0x0bbc }
            long r36 = X.C90524aI.A07(r5)     // Catch:{ all -> 0x0bbc }
            java.lang.Object r4 = r4.A00     // Catch:{ all -> 0x0bbc }
            long r4 = X.C90524aI.A07(r4)     // Catch:{ all -> 0x0bbc }
            X.0v5 r10 = r11.A00     // Catch:{ all -> 0x0bbc }
            boolean r10 = r10.A05()     // Catch:{ all -> 0x0bbc }
            if (r10 == 0) goto L_0x03a4
            X.3d4 r12 = new X.3d4     // Catch:{ all -> 0x0bbc }
            r12.<init>(r11)     // Catch:{ all -> 0x0bbc }
            X.14g r15 = new X.14g     // Catch:{ all -> 0x0bbc }
            r10 = 0
            r15.<init>((boolean) r10)     // Catch:{ all -> 0x0bbc }
            java.lang.String r10 = "gdrive/backup/quota/calculatePremiumMessageMediaBackupSize"
            r15.A04(r10)     // Catch:{ all -> 0x0bbc }
            X.00I r7 = X.AnonymousClass3S1.A01(r12, r11, r14, r6)     // Catch:{ all -> 0x0bbc }
            java.lang.Object r6 = r7.A00     // Catch:{ all -> 0x0bbc }
            long r10 = X.C90524aI.A07(r6)     // Catch:{ all -> 0x0bbc }
            long r4 = r4 + r10
            java.lang.Object r6 = r7.A01     // Catch:{ all -> 0x0bbc }
            long r38 = X.C90524aI.A07(r6)     // Catch:{ all -> 0x0bbc }
            r15.A01()     // Catch:{ all -> 0x0bbc }
        L_0x037c:
            r16.A01()     // Catch:{ all -> 0x0bbc }
            long r34 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0bbc }
            X.6C6 r6 = new X.6C6     // Catch:{ all -> 0x0bbc }
            r31 = r6
            r32 = r4
            r31.<init>(r32, r34, r36, r38)     // Catch:{ all -> 0x0bbc }
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0bbc }
            java.lang.String r10 = "gdrive/backup/backup-size-estimation/new stats "
            r7 = r17
            X.C36321k7.A1K(r7, r10, r11)     // Catch:{ all -> 0x0bbc }
            r7 = r23
            r7.A04(r6, r13)     // Catch:{ all -> 0x0bbc }
        L_0x039c:
            long r8 = r8 + r4
            r0.A05 = r8     // Catch:{ all -> 0x0bbc }
            r4 = r19
            long r4 = r4.A04     // Catch:{ all -> 0x0bbc }
            goto L_0x03a7
        L_0x03a4:
            r38 = -1
            goto L_0x037c
        L_0x03a7:
            long r8 = r8 - r4
            long r4 = r18.A01()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = r22
            r4.A00 = r5     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.0yW r5 = r0.A0U     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r5.Bly(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x03b9:
            X.4y4 r4 = new X.4y4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r37 = r4
            r38 = r19
            r39 = r24
            r42 = r8
            r37.<init>(r38, r39, r40, r42)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r6 = r54
            r5 = r29
            java.lang.Object r5 = X.AnonymousClass6UR.A00(r4, r6, r5)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r20)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = r22
            if (r5 != r4) goto L_0x06c2
            java.lang.String r4 = "gdrive/backup/files loading files"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            boolean r4 = r54.A00()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x0bd9
            java.lang.Integer r4 = X.C36371kC.A0p()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r1.A0W = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.List r11 = java.util.Collections.synchronizedList(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.AnonymousClass00C.A0B(r11)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = 1
            X.AnonymousClass00C.A0D(r11, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.Map r8 = r0.A0a     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r8.clear()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r5 = r19
            java.util.Map r4 = X.AnonymousClass6YN.A06(r6, r5, r11)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 != 0) goto L_0x040a
            java.lang.String r4 = "gdrive/backup/failed to load files for backup"
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x0150
        L_0x040a:
            r8.putAll(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.Collection r5 = r4.values()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = r60
            X.AnonymousClass6YN.A08(r4, r5)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            boolean r4 = r52.get()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x0ba2
            X.12P r4 = r0.A0S     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            int r4 = r4.A02()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r4 = (long) r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r49 = r4
            java.util.concurrent.atomic.AtomicLong r4 = r0.A0d     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r48 = r4
            r4.set(r2)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = r44
            r4.set(r2)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.Integer r4 = X.C36381kD.A0n()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r1.A0W = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = 1000(0x3e8, float:1.401E-42)
            java.util.ArrayList r4 = X.C36441kJ.A14(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.List r12 = java.util.Collections.synchronizedList(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = -1
            java.util.concurrent.atomic.AtomicLong r23 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r6 = r23
            r6.<init>(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.concurrent.atomic.AtomicLong r24 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r6 = r24
            r6.<init>(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.AnonymousClass00C.A0B(r12)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "gdrive/backup/collectFilesToBackupAndRemove/collect media files referenced from messages"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = 1
            X.AnonymousClass00C.A0D(r12, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "gdrive/backup/perf/collect-referenced-files-with-constraints"
            X.14g r9 = new X.14g     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r9.<init>((java.lang.String) r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.ArrayList r14 = X.AnonymousClass001.A0I()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = r28
            r14.addAll(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.179 r4 = r0.A0L     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r47 = r4
            java.io.File r5 = r47.A02()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = r61
            X.AnonymousClass6Y6.A04(r4, r5, r6)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r14.addAll(r6)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r5 = 4777(0x12a9, float:6.694E-42)
            r4 = r51
            boolean r4 = r4.A0E(r5)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 != 0) goto L_0x04c0
            java.util.Iterator r10 = r14.iterator()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r6 = 0
        L_0x0491:
            boolean r4 = r10.hasNext()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x04a1
            java.io.File r4 = X.C90504aG.A0a(r10)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r4 = r4.length()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r6 = r6 + r4
            goto L_0x0491
        L_0x04a1:
            X.3S1 r5 = r0.A0E     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.HashSet r4 = r5.A03()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r15 = r5.A02(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r4 = r6 + r15
            r0.A05 = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r10 = "gdrive/backup/collectReferencedFilesToBackupWithConstraints essential files size "
            r13.append(r10)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r13.append(r6)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r6 = ", estimated total size "
            X.C36321k7.A1V(r6, r13, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x04c0:
            boolean r4 = r0.A06(r14, r12, r11)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 != 0) goto L_0x052a
            java.lang.String r4 = "gdrive/backup/collectReferencedFilesToBackupWithConstraints processing essential files failed"
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x04cb:
            r9.A01()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r14 = 0
            java.lang.Integer r4 = X.C36431kI.A14()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r1.A0V = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "gdrive/backup/collectFilesToBackupAndRemove/files failed to generate list of files to be uploaded."
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x04da:
            java.util.Iterator r13 = X.AnonymousClass000.A0z(r8)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x04de:
            boolean r4 = r13.hasNext()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x0654
            java.lang.Object r9 = r13.next()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.6Pk r9 = (X.C131526Pk) r9     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r7 = r9.A01()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = r47
            java.lang.String r5 = X.C34191gb.A06(r4, r7)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r5 == 0) goto L_0x0523
            boolean r4 = X.C90484aE.A1W(r5)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x0523
            java.io.File r6 = X.C90524aI.A0S(r5)     // Catch:{ IOException -> 0x051c }
            java.lang.String r5 = r6.getCanonicalPath()     // Catch:{ IOException -> 0x051c }
            X.67v r4 = r0.A0H     // Catch:{ IOException -> 0x051c }
            boolean r10 = r4.A01(r5)     // Catch:{ IOException -> 0x051c }
            if (r10 == 0) goto L_0x04de
            boolean r4 = r4.A00(r6, r5)     // Catch:{ IOException -> 0x051c }
            if (r4 != 0) goto L_0x04de
            r6.length()     // Catch:{ IOException -> 0x051c }
            r8.remove(r7)     // Catch:{ IOException -> 0x051c }
            r11.add(r9)     // Catch:{ IOException -> 0x051c }
            goto L_0x04de
        L_0x051c:
            r5 = move-exception
            java.lang.String r4 = "gdrive/backup/collectFilesToBackupAndRemove/failed to get canonical path"
            com.whatsapp.util.Log.e(r4, r5)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x04de
        L_0x0523:
            r8.remove(r7)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r11.add(r9)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x04de
        L_0x052a:
            X.3S1 r13 = r0.A0E     // Catch:{ 4yE -> 0x064d }
            X.67v r10 = r0.A0H     // Catch:{ 4yE -> 0x064d }
            r4 = 0
            X.14g r7 = new X.14g     // Catch:{ 4yE -> 0x064d }
            r7.<init>((boolean) r4)     // Catch:{ 4yE -> 0x064d }
            java.lang.String r4 = "gdrive/backup/quota/getMostRecentMediaList"
            r7.A04(r4)     // Catch:{ 4yE -> 0x064d }
            java.util.Set r4 = r8.keySet()     // Catch:{ 4yE -> 0x064d }
            java.util.HashSet r38 = X.C90524aI.A0k(r4)     // Catch:{ 4yE -> 0x064d }
            X.0yC r5 = r13.A03     // Catch:{ 4yE -> 0x064d }
            r4 = 5251(0x1483, float:7.358E-42)
            int r6 = r5.A07(r4)     // Catch:{ 4yE -> 0x064d }
            r5 = 0
            X.3d7 r4 = new X.3d7     // Catch:{ 4yE -> 0x064d }
            r4.<init>(r13, r5, r6)     // Catch:{ 4yE -> 0x064d }
            r31 = r4
            r32 = r13
            r33 = r0
            r34 = r7
            r35 = r12
            r36 = r11
            r37 = r8
            long r31 = X.AnonymousClass3S1.A00(r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ 4yE -> 0x064d }
            X.0v5 r4 = r13.A00     // Catch:{ 4yE -> 0x064d }
            boolean r4 = r4.A05()     // Catch:{ 4yE -> 0x064d }
            if (r4 == 0) goto L_0x05d0
            X.3d4 r6 = new X.3d4     // Catch:{ 4yE -> 0x064d }
            r6.<init>(r13)     // Catch:{ 4yE -> 0x064d }
            r4 = 0
            X.14g r5 = new X.14g     // Catch:{ 4yE -> 0x064d }
            r5.<init>((boolean) r4)     // Catch:{ 4yE -> 0x064d }
            java.lang.String r4 = "gdrive/backup/quota/getMostRecentPremiumMessageMediaList"
            r5.A04(r4)     // Catch:{ 4yE -> 0x064d }
            r39 = r6
            r40 = r13
            r41 = r0
            r42 = r7
            r43 = r12
            r44 = r11
            r45 = r8
            r46 = r38
            long r16 = X.AnonymousClass3S1.A00(r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ 4yE -> 0x064d }
            r5.A01()     // Catch:{ 4yE -> 0x064d }
        L_0x0590:
            java.util.Iterator r15 = r38.iterator()     // Catch:{ 4yE -> 0x064d }
        L_0x0594:
            boolean r4 = r15.hasNext()     // Catch:{ 4yE -> 0x064d }
            if (r4 == 0) goto L_0x05d3
            java.lang.String r14 = X.AnonymousClass001.A0C(r15)     // Catch:{ 4yE -> 0x064d }
            boolean r4 = r8.containsKey(r14)     // Catch:{ 4yE -> 0x064d }
            if (r4 == 0) goto L_0x0594
            X.179 r6 = r13.A01     // Catch:{ 4yE -> 0x064d }
            java.lang.String r4 = "_INTERNAL_FILES_"
            boolean r4 = r14.startsWith(r4)     // Catch:{ 4yE -> 0x064d }
            r5 = 0
            if (r4 != 0) goto L_0x05bf
            java.lang.String r4 = "_INTERNAL_DATABASES_"
            boolean r4 = r14.startsWith(r4)     // Catch:{ 4yE -> 0x064d }
            if (r4 != 0) goto L_0x05bf
            java.io.File r4 = r6.A07(r14)     // Catch:{ IOException -> 0x05bf }
            java.lang.String r5 = r4.getCanonicalPath()     // Catch:{ IOException -> 0x05bf }
        L_0x05bf:
            boolean r4 = r10.A01(r5)     // Catch:{ 4yE -> 0x064d }
            if (r4 == 0) goto L_0x0594
            java.lang.Object r4 = r8.get(r14)     // Catch:{ 4yE -> 0x064d }
            r11.add(r4)     // Catch:{ 4yE -> 0x064d }
            r8.remove(r14)     // Catch:{ 4yE -> 0x064d }
            goto L_0x0594
        L_0x05d0:
            r16 = -1
            goto L_0x0590
        L_0x05d3:
            r7.A01()     // Catch:{ 4yE -> 0x064d }
            java.lang.Long r5 = java.lang.Long.valueOf(r31)     // Catch:{ 4yE -> 0x064d }
            java.lang.Long r4 = java.lang.Long.valueOf(r16)     // Catch:{ 4yE -> 0x064d }
            X.00I r6 = X.C36441kJ.A0W(r5, r4)     // Catch:{ 4yE -> 0x064d }
            java.lang.Object r4 = r6.A00     // Catch:{ 4yE -> 0x064d }
            X.AnonymousClass00C.A07(r4)     // Catch:{ 4yE -> 0x064d }
            long r4 = X.C36431kI.A09(r4)     // Catch:{ 4yE -> 0x064d }
            r7 = r23
            r7.set(r4)     // Catch:{ 4yE -> 0x064d }
            java.lang.Object r4 = r6.A01     // Catch:{ 4yE -> 0x064d }
            X.AnonymousClass00C.A07(r4)     // Catch:{ 4yE -> 0x064d }
            long r4 = X.C36431kI.A09(r4)     // Catch:{ 4yE -> 0x064d }
            r6 = r24
            r6.set(r4)     // Catch:{ 4yE -> 0x064d }
            r9.A01()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r14 = 1
            java.util.Iterator r9 = r12.iterator()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = 0
        L_0x0608:
            boolean r6 = r9.hasNext()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r6 == 0) goto L_0x061a
            java.lang.Object r6 = r9.next()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.6FR r6 = (X.AnonymousClass6FR) r6     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r6 = r6.A00()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r4 = r4 + r6
            goto L_0x0608
        L_0x061a:
            java.util.Collection r7 = r8.values()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r6 = 0
            X.AnonymousClass00C.A0D(r7, r6)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.Iterator r13 = r7.iterator()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r9 = 0
        L_0x0628:
            boolean r6 = r13.hasNext()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r6 == 0) goto L_0x063f
            java.lang.Object r7 = r13.next()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.6Pk r7 = (X.C131526Pk) r7     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.6Cl r6 = r7.A02     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r6 == 0) goto L_0x063b
            long r6 = r6.A00     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x063d
        L_0x063b:
            long r6 = r7.A00     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x063d:
            long r9 = r9 + r6
            goto L_0x0628
        L_0x063f:
            long r4 = r4 + r9
            r0.A05 = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r6 = "gdrive/backup/collectFilesToBackupAndRemove/files/estimated total size of backup "
            X.C36321k7.A1V(r6, r7, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x04da
        L_0x064d:
            java.lang.String r4 = "gdrive/backup/collectReferencedFilesToBackupWithConstraints processing referenced media files failed"
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x04cb
        L_0x0654:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "gdrive/backup/collectFilesToBackupAndRemove/files/ file to upload: "
            X.C36371kC.A1R(r4, r5, r12)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = " and remove: "
            r5.append(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            int r4 = r11.size()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.C36321k7.A1Y(r5, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r14 == 0) goto L_0x0bd9
            long r41 = java.lang.System.currentTimeMillis()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            boolean r4 = r54.A00()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x0bd9
            java.lang.String r7 = "gdrive_backup_start_timestamp"
            r4 = r62
            long r17 = r4.A0V(r7)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            int r4 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x068c
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r6 = r62
            r4 = r17
            r6.A1h(r7, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x068c:
            java.lang.Integer r4 = X.C36391kE.A0r()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r1.A0W = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            int r10 = r11.size()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r5 = 0
        L_0x0697:
            if (r5 >= r10) goto L_0x06ca
            int r9 = r5 + 2500
            r4 = r9
            if (r9 <= r10) goto L_0x069f
            r4 = r10
        L_0x069f:
            java.util.List r7 = r11.subList(r5, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.4xz r6 = new X.4xz     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r5 = r21
            r4 = r19
            r6.<init>(r4, r5, r7)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r5 = r54
            r4 = r29
            java.lang.Object r5 = X.AnonymousClass6UR.A00(r6, r5, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = r22
            if (r5 != r4) goto L_0x06ba
            r5 = r9
            goto L_0x0697
        L_0x06ba:
            r4 = r30
            r1.A0V = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "gdrive/backup/files/failed to delete files"
            goto L_0x0197
        L_0x06c2:
            r4 = r30
            r1.A0V = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "gdrive/backup/files unable to start transaction"
            goto L_0x0197
        L_0x06ca:
            java.lang.Integer r4 = X.C36401kF.A0h()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r1.A0W = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            int r9 = r12.size()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "gdrive/backup/files/files-to-be-uploaded/count/"
            X.C36321k7.A1T(r4, r5, r9)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.Iterator r14 = r12.iterator()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r33 = 0
            r13 = 0
            r10 = 0
        L_0x06e5:
            boolean r4 = r14.hasNext()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r15 = 1
            if (r4 == 0) goto L_0x0725
            java.lang.Object r7 = r14.next()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.6FR r7 = (X.AnonymousClass6FR) r7     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r6 = r7.A03     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.AnonymousClass00C.A07(r6)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r5 = "-increment-"
            r4 = 0
            boolean r4 = X.AnonymousClass099.A0O(r6, r5, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x0709
            long r33 = r33 + r15
            r4 = r27
            r1.A0Z = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r10 = 1
            goto L_0x071b
        L_0x0709:
            java.lang.String r5 = "msgstore.db"
            r4 = 0
            boolean r4 = X.AnonymousClass099.A0O(r6, r5, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x071b
            long r33 = r33 + r15
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r1.A0Z = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r13 = 1
        L_0x071b:
            long r4 = r7.A00()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r6 = r48
            r6.addAndGet(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x06e5
        L_0x0725:
            r32 = 1
            java.lang.Long r4 = java.lang.Long.valueOf(r33)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r1.A0h = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r13 == 0) goto L_0x0735
            if (r10 == 0) goto L_0x0735
            r4 = r26
            r1.A0Z = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x0735:
            boolean r4 = r54.A00()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x0bd9
            r4 = r61
            int r5 = r4.A00     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = 1
            if (r5 != r4) goto L_0x0835
            java.lang.Long r4 = java.lang.Long.valueOf(r15)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x0746:
            r1.A0e = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x0748:
            android.content.SharedPreferences r5 = X.C36341k9.A0E(r62)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "gdrive_already_uploaded_bytes"
            long r4 = r5.getLong(r4, r2)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.concurrent.atomic.AtomicLong r6 = r0.A0f     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r53 = r6
            r6.set(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r6 = r48
            r6.addAndGet(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r6 = r53.get()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r4 = r48.get()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r10 = r63
            r10.A04(r6, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = 1
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r10.<init>(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.concurrent.atomic.AtomicReference r7 = X.C90514aH.A18()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.concurrent.CountDownLatch r6 = new java.util.concurrent.CountDownLatch     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r6.<init>(r9)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.Iterator r31 = r12.iterator()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x077e:
            boolean r4 = r31.hasNext()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x083e
            java.lang.Object r12 = r31.next()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.6FR r12 = (X.AnonymousClass6FR) r12     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            boolean r4 = r0.A02(r7, r9)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 != 0) goto L_0x0bd9
            X.AnonymousClass00C.A0B(r12)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = 1
            X.AnonymousClass00C.A0D(r12, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.io.File r4 = r12.A02     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            boolean r5 = r4.exists()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r5 != 0) goto L_0x07b6
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "gdrive/backup/backup-file file "
            r5.append(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "<file>"
            r5.append(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = " does not exist"
            X.C36321k7.A1a(r5, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r6.countDown()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x082e
        L_0x07b6:
            boolean r4 = r4.isDirectory()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x07d2
            r4 = r30
            r1.A0V = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "gdrive-service/backup-file/expected-file-got-directory-instead/"
            r5.append(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "<file>"
            X.C36321k7.A1Z(r5, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x07ce:
            r6.countDown()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x0830
        L_0x07d2:
            boolean r4 = r52.get()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 != 0) goto L_0x07de
            java.lang.String r4 = "gdrive/backup/backup-file backup has been cancelled."
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x07ce
        L_0x07de:
            long r13 = r48.get()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0814
            r5 = r56
            r4 = r48
            double r26 = X.C90474aD.A00(r5, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r26 > r13 ? 1 : (r26 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0814
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0u()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "gdrive/backup/backup-file/too-many-failures upload-failed:"
            r12.append(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r4 = r56.get()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r12.append(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r5 = " upload-total:"
            r4 = r48
            X.C36321k7.A1K(r4, r5, r12)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r6.countDown()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = 38
            X.C1042758y.A00(r1, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x0830
        L_0x0814:
            java.util.concurrent.Executor r5 = X.AnonymousClass6Y6.A00     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r40 = 2
            X.75A r4 = new X.75A     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r33 = r4
            r34 = r7
            r35 = r0
            r36 = r19
            r37 = r12
            r38 = r10
            r39 = r6
            r33.<init>(r34, r35, r36, r37, r38, r39, r40)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r5.execute(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x082e:
            r4 = 1
            goto L_0x0831
        L_0x0830:
            r4 = 0
        L_0x0831:
            r32 = r32 & r4
            goto L_0x077e
        L_0x0835:
            r4 = 2
            if (r5 != r4) goto L_0x0748
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x0746
        L_0x083e:
            java.lang.String r4 = "gdrive/backup/files waiting for backup to finish..."
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x084f }
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            boolean r4 = r6.await(r4, r12)     // Catch:{ InterruptedException -> 0x084f }
            r32 = r32 & r4
            goto L_0x085b
        L_0x084f:
            r5 = move-exception
            java.lang.String r4 = "gdrive/backup/files upload interrupted"
            com.whatsapp.util.Log.e(r4, r5)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = r30
            r1.A0V = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r32 = 0
        L_0x085b:
            boolean r4 = r0.A02(r7, r9)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 != 0) goto L_0x0bd9
            boolean r4 = r10.get()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r32 = r32 & r4
            if (r32 == 0) goto L_0x0880
            java.lang.String r5 = "message-store-backups-not-uploaded"
            r4 = r28
            r0.A03(r5, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.Integer r4 = X.C36401kF.A0i()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r1.A0W = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r5 = "gdrive/backup/perf/build-metadata"
            X.14g r31 = new X.14g     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = r31
            r4.<init>((java.lang.String) r5)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x088b
        L_0x0880:
            java.lang.String r4 = "gdrive/backup/files failed to uploadFiles"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.Integer r4 = r1.A0V     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 != 0) goto L_0x0bd9
            goto L_0x0150
        L_0x088b:
            java.lang.String r5 = "gdrive/backup/perf/build-metadata/filter-files-and-build-stats"
            X.14g r27 = new X.14g     // Catch:{ IOException -> 0x0a88 }
            r4 = r27
            r4.<init>((java.lang.String) r5)     // Catch:{ IOException -> 0x0a88 }
            X.1Q9 r4 = r0.A0R     // Catch:{ IOException -> 0x0a88 }
            java.io.File[] r4 = r4.A0R()     // Catch:{ IOException -> 0x0a88 }
            java.util.List r4 = X.C90494aF.A0j(r4)     // Catch:{ IOException -> 0x0a88 }
            java.util.HashSet r14 = X.C90524aI.A0k(r4)     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r4 = "msgstore.db.crypt(\\d+)|msgstore-increment-(\\d+).db.crypt(\\d+)"
            java.util.regex.Pattern r13 = java.util.regex.Pattern.compile(r4)     // Catch:{ IOException -> 0x0a88 }
            java.util.ArrayList r6 = X.C36411kG.A13(r13)     // Catch:{ IOException -> 0x0a88 }
            java.io.File r5 = r47.A02()     // Catch:{ IOException -> 0x0a88 }
            r4 = r61
            X.AnonymousClass6Y6.A04(r4, r5, r6)     // Catch:{ IOException -> 0x0a88 }
            java.util.HashSet r12 = X.C90524aI.A0k(r6)     // Catch:{ IOException -> 0x0a88 }
            X.C18740tg.A06(r8)     // Catch:{ IOException -> 0x0a88 }
            java.util.Iterator r26 = X.AnonymousClass000.A0z(r8)     // Catch:{ IOException -> 0x0a88 }
        L_0x08c0:
            boolean r4 = r26.hasNext()     // Catch:{ IOException -> 0x0a88 }
            if (r4 == 0) goto L_0x0964
            java.lang.Object r5 = r26.next()     // Catch:{ IOException -> 0x0a88 }
            X.6Pk r5 = (X.C131526Pk) r5     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r6 = r5.A01()     // Catch:{ IOException -> 0x0a88 }
            r4 = r47
            java.lang.String r4 = X.C34191gb.A06(r4, r6)     // Catch:{ IOException -> 0x0a88 }
            if (r4 == 0) goto L_0x08c0
            java.io.File r9 = X.C90524aI.A0S(r4)     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r8 = r9.getCanonicalPath()     // Catch:{ IOException -> 0x0a88 }
            X.6Cl r4 = r5.A02     // Catch:{ IOException -> 0x0a88 }
            if (r4 == 0) goto L_0x08e7
            long r6 = r4.A00     // Catch:{ IOException -> 0x0a88 }
            goto L_0x08e9
        L_0x08e7:
            long r6 = r5.A00     // Catch:{ IOException -> 0x0a88 }
        L_0x08e9:
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x08f7
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r4 = "gdrive/backup/build-stats/file-size-is-not-positive"
            X.C36321k7.A1J(r5, r4, r6)     // Catch:{ IOException -> 0x0a88 }
            goto L_0x08c0
        L_0x08f7:
            r5 = 2997(0xbb5, float:4.2E-42)
            r4 = r51
            boolean r4 = r4.A0E(r5)     // Catch:{ IOException -> 0x0a88 }
            if (r4 == 0) goto L_0x0924
            java.lang.String r4 = r9.getName()     // Catch:{ IOException -> 0x0a88 }
            boolean r4 = X.C36361kB.A1Z(r4, r13)     // Catch:{ IOException -> 0x0a88 }
            if (r4 == 0) goto L_0x0910
            long r4 = r0.A03     // Catch:{ IOException -> 0x0a88 }
            long r4 = r4 + r6
            r0.A03 = r4     // Catch:{ IOException -> 0x0a88 }
        L_0x0910:
            X.67v r10 = r0.A0H     // Catch:{ IOException -> 0x0a88 }
            boolean r4 = r10.A01(r8)     // Catch:{ IOException -> 0x0a88 }
            if (r4 == 0) goto L_0x092d
            long r4 = r0.A06     // Catch:{ IOException -> 0x0a88 }
            long r4 = r4 + r6
            r0.A06 = r4     // Catch:{ IOException -> 0x0a88 }
            int r4 = r0.A00     // Catch:{ IOException -> 0x0a88 }
            int r4 = r4 + 1
            r0.A00 = r4     // Catch:{ IOException -> 0x0a88 }
            goto L_0x092d
        L_0x0924:
            boolean r4 = r14.contains(r9)     // Catch:{ IOException -> 0x0a88 }
            if (r4 == 0) goto L_0x0910
            r0.A03 = r6     // Catch:{ IOException -> 0x0a88 }
            goto L_0x0910
        L_0x092d:
            if (r8 == 0) goto L_0x0952
            java.lang.String r4 = r10.A04     // Catch:{ IOException -> 0x0a88 }
            boolean r4 = r8.startsWith(r4)     // Catch:{ IOException -> 0x0a88 }
            if (r4 != 0) goto L_0x093f
            java.lang.String r4 = r10.A02     // Catch:{ IOException -> 0x0a88 }
            boolean r4 = r8.startsWith(r4)     // Catch:{ IOException -> 0x0a88 }
            if (r4 == 0) goto L_0x0944
        L_0x093f:
            long r4 = r0.A09     // Catch:{ IOException -> 0x0a88 }
            long r4 = r4 + r6
            r0.A09 = r4     // Catch:{ IOException -> 0x0a88 }
        L_0x0944:
            java.lang.String r4 = r10.A01     // Catch:{ IOException -> 0x0a88 }
            boolean r4 = r8.startsWith(r4)     // Catch:{ IOException -> 0x0a88 }
            if (r4 == 0) goto L_0x0952
            int r4 = r0.A01     // Catch:{ IOException -> 0x0a88 }
            int r4 = r4 + 1
            r0.A01 = r4     // Catch:{ IOException -> 0x0a88 }
        L_0x0952:
            boolean r4 = r12.contains(r9)     // Catch:{ IOException -> 0x0a88 }
            if (r4 == 0) goto L_0x095d
            long r4 = r0.A08     // Catch:{ IOException -> 0x0a88 }
            long r4 = r4 + r6
            r0.A08 = r4     // Catch:{ IOException -> 0x0a88 }
        L_0x095d:
            long r4 = r0.A02     // Catch:{ IOException -> 0x0a88 }
            long r4 = r4 + r6
            r0.A02 = r4     // Catch:{ IOException -> 0x0a88 }
            goto L_0x08c0
        L_0x0964:
            r27.A01()     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r4 = "gdrive/backup/perf/build-metadata/metadata"
            X.14g r6 = new X.14g     // Catch:{ IOException -> 0x0a88 }
            r6.<init>((java.lang.String) r4)     // Catch:{ IOException -> 0x0a88 }
            java.util.HashMap r8 = X.AnonymousClass001.A0J()     // Catch:{ IOException -> 0x0a88 }
            java.lang.Long r5 = java.lang.Long.valueOf(r49)     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r4 = "numOfMessages"
            r8.put(r4, r5)     // Catch:{ IOException -> 0x0a88 }
            r4 = r62
            X.C90504aG.A1C(r4, r8)     // Catch:{ IOException -> 0x0a88 }
            int r4 = r0.A01     // Catch:{ IOException -> 0x0a88 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r4 = "numOfPhotos"
            r8.put(r4, r5)     // Catch:{ IOException -> 0x0a88 }
            int r4 = r0.A00     // Catch:{ IOException -> 0x0a88 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r4 = "numOfMediaFiles"
            r8.put(r4, r5)     // Catch:{ IOException -> 0x0a88 }
            long r4 = r0.A06     // Catch:{ IOException -> 0x0a88 }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r4 = "mediaSize"
            r8.put(r4, r5)     // Catch:{ IOException -> 0x0a88 }
            long r4 = r0.A09     // Catch:{ IOException -> 0x0a88 }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r4 = "videoSize"
            r8.put(r4, r5)     // Catch:{ IOException -> 0x0a88 }
            X.1Cn r4 = r0.A0B     // Catch:{ IOException -> 0x0a88 }
            X.00T r9 = r4.A01     // Catch:{ IOException -> 0x0a88 }
            android.content.SharedPreferences r7 = X.C36411kG.A0E(r9)     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r5 = "_new_user"
            r4 = 0
            boolean r4 = r7.getBoolean(r5, r4)     // Catch:{ IOException -> 0x0a88 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ IOException -> 0x0a88 }
            r8.put(r5, r4)     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r7 = "bg_gpb_eligible_timestamp"
            android.content.SharedPreferences r4 = X.C36411kG.A0E(r9)     // Catch:{ IOException -> 0x0a88 }
            long r4 = X.C36371kC.A08(r4, r7)     // Catch:{ IOException -> 0x0a88 }
            X.C36421kH.A1K(r7, r8, r4)     // Catch:{ IOException -> 0x0a88 }
            java.util.HashMap r5 = r62.A0n()     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r4 = "localSettings"
            r8.put(r4, r5)     // Catch:{ IOException -> 0x0a88 }
            boolean r4 = r59.A2I()     // Catch:{ IOException -> 0x0a88 }
            if (r4 == 0) goto L_0x09f2
            java.lang.String r5 = X.AnonymousClass6YN.A03(r8)     // Catch:{ IOException -> 0x0a88 }
            r4 = r60
            java.lang.String r5 = r4.A01(r5)     // Catch:{ IOException -> 0x0a88 }
            r8.clear()     // Catch:{ IOException -> 0x0a88 }
            if (r5 == 0) goto L_0x09f2
            java.lang.String r4 = "encryptedData"
            r8.put(r4, r5)     // Catch:{ IOException -> 0x0a88 }
        L_0x09f2:
            boolean r4 = r59.A2I()     // Catch:{ IOException -> 0x0a88 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r5 = "encryptedBackupEnabled"
            r4 = 1
            java.lang.Integer r5 = X.C90514aH.A0l(r5, r7, r8, r4)     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r4 = "backupVersion"
            r8.put(r4, r5)     // Catch:{ IOException -> 0x0a88 }
            long r4 = r0.A02     // Catch:{ IOException -> 0x0a88 }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r4 = "backupSize"
            r8.put(r4, r5)     // Catch:{ IOException -> 0x0a88 }
            long r4 = r0.A03     // Catch:{ IOException -> 0x0a88 }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r4 = "chatdbSize"
            r8.put(r4, r5)     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r5 = X.C18930u3.A01()     // Catch:{ IOException -> 0x0a88 }
            X.AnonymousClass00C.A08(r5)     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r4 = "versionOfAppWhenBackup"
            r8.put(r4, r5)     // Catch:{ IOException -> 0x0a88 }
            X.6Uy r10 = r0.A0C     // Catch:{ IOException -> 0x0a88 }
            org.json.JSONObject r9 = X.C36441kJ.A1B()     // Catch:{ IOException -> 0x0a88 }
            java.util.HashMap r7 = X.C132716Uy.A01(r10)     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r5 = "backup_version"
            java.util.Iterator r13 = X.AnonymousClass000.A0z(r7)     // Catch:{ JSONException -> 0x0a75 }
        L_0x0a38:
            r12 = 1
        L_0x0a39:
            boolean r4 = r13.hasNext()     // Catch:{ JSONException -> 0x0a75 }
            if (r4 == 0) goto L_0x0a50
            java.lang.Object r4 = r13.next()     // Catch:{ JSONException -> 0x0a75 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ JSONException -> 0x0a75 }
            if (r12 == 0) goto L_0x0a4e
            boolean r4 = r4.booleanValue()     // Catch:{ JSONException -> 0x0a75 }
            if (r4 == 0) goto L_0x0a4e
            goto L_0x0a38
        L_0x0a4e:
            r12 = 0
            goto L_0x0a39
        L_0x0a50:
            if (r12 == 0) goto L_0x0a54
            r4 = 1
            goto L_0x0a56
        L_0x0a54:
            int r4 = r10.A00     // Catch:{ JSONException -> 0x0a75 }
        L_0x0a56:
            r9.put(r5, r4)     // Catch:{ JSONException -> 0x0a75 }
            java.util.List r4 = r10.A02     // Catch:{ JSONException -> 0x0a75 }
            java.util.Iterator r10 = r4.iterator()     // Catch:{ JSONException -> 0x0a75 }
        L_0x0a5f:
            boolean r4 = r10.hasNext()     // Catch:{ JSONException -> 0x0a75 }
            if (r4 == 0) goto L_0x0a7b
            java.lang.String r5 = X.AnonymousClass001.A0C(r10)     // Catch:{ JSONException -> 0x0a75 }
            java.lang.Object r4 = X.C90514aH.A0o(r5, r7)     // Catch:{ JSONException -> 0x0a75 }
            boolean r4 = X.AnonymousClass000.A1X(r4)     // Catch:{ JSONException -> 0x0a75 }
            r9.put(r5, r4)     // Catch:{ JSONException -> 0x0a75 }
            goto L_0x0a5f
        L_0x0a75:
            r5 = move-exception
            java.lang.String r4 = "BackupExpiryManager/getGoogleBackupJsonMetadata failed to create json"
            com.whatsapp.util.Log.e(r4, r5)     // Catch:{ IOException -> 0x0a88 }
        L_0x0a7b:
            java.lang.String r5 = X.C36381kD.A0y(r9)     // Catch:{ IOException -> 0x0a88 }
            java.lang.String r4 = "backupExpiry"
            r8.put(r4, r5)     // Catch:{ IOException -> 0x0a88 }
            r6.A01()     // Catch:{ IOException -> 0x0a88 }
            goto L_0x0a8f
        L_0x0a88:
            r5 = move-exception
            java.lang.String r4 = "gdrive/backup/build-metadata"
            com.whatsapp.util.Log.e(r4, r5)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r8 = 0
        L_0x0a8f:
            r31.A01()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r8 != 0) goto L_0x0aa0
            java.lang.String r4 = "gdrive/backup/files/failed to build metadata"
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = r30
            r1.A0V = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r6 = 0
            goto L_0x0b35
        L_0x0aa0:
            boolean r4 = r52.get()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x0ba2
            boolean r4 = r52.get()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x0ba2
            java.util.Iterator r9 = r11.iterator()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x0ab0:
            boolean r4 = r9.hasNext()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r4 == 0) goto L_0x0ac9
            java.lang.Object r4 = r9.next()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.6Pk r4 = (X.C131526Pk) r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r6 = r0.A04     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r4 = r4.A00     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r6 = r6 + r4
            r0.A04 = r6     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r4 = r0.A07     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r4 = r4 + r15
            r0.A07 = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x0ab0
        L_0x0ac9:
            java.lang.String r5 = "message-store-backups-deleted"
            r4 = r28
            r0.A03(r5, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.19A r6 = r0.A0W     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            r6.A0B(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.Integer r4 = X.C36401kF.A0j()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r1.A0W = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.4y2 r4 = new X.4y2     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r5 = r19
            r4.<init>(r5, r8)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r5 = r54
            r6 = r29
            java.lang.Object r4 = X.AnonymousClass6UR.A00(r4, r5, r6)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r6 = 1
            r5 = r22
            if (r4 != r5) goto L_0x0b20
            long r4 = r0.A06     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r43 = r23.get()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r45 = r24.get()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r8 = r62.A0c()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            int r7 = (r43 > r2 ? 1 : (r43 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0b08
            int r7 = (r45 > r2 ? 1 : (r45 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x0b2b
        L_0x0b08:
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x0b2b
            java.lang.String r7 = "gdrive/backup/backup-size-estimation: updating stats after backup"
            com.whatsapp.util.Log.i((java.lang.String) r7)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.6C6 r7 = new X.6C6     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r38 = r7
            r39 = r4
            r38.<init>(r39, r41, r43, r45)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.1Cn r4 = r0.A0B     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4.A04(r7, r8)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x0b35
        L_0x0b20:
            r6 = 0
            r4 = r30
            r1.A0V = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "gdrive/backup/files failed to commit backup"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x0b35
        L_0x0b2b:
            java.lang.String r4 = "gdrive/backup/backup-size-estimation: removing old stats after backup"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.1Cn r4 = r0.A0B     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4.A05(r8)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x0b35:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.util.Locale r9 = java.util.Locale.ENGLISH     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r4 = r4 - r17
            X.C90494aF.A1S(r8, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r7)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r7 = "gdrive/backup/files total wall time for backup: %2f seconds."
            java.lang.String r7 = java.lang.String.format(r9, r7, r8)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.AnonymousClass00C.A08(r7)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r9 = r53.get()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r7 = r56.get()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r9 = r9 + r7
            java.lang.Double r7 = X.C90524aI.A0Z(r9)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r1.A0C = r7     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r7 = r56.get()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.Double r7 = X.C90524aI.A0Z(r7)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r1.A0B = r7     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r10 = r48.get()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            long r7 = r0.A05     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            int r9 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            boolean r7 = X.AnonymousClass000.A1Q(r9)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r1.A01 = r7     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r1.A0g = r4     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "gdrive/backup/files backup finished (success ="
            r5.append(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = X.C36321k7.A0H(r5, r6)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            if (r6 == 0) goto L_0x0bda
            r5 = 0
            r4 = r62
            r4.A1A(r5)     // Catch:{ 4yI -> 0x0bfd, 5VQ -> 0x0bf3, 1ej -> 0x0c13 }
            X.7fW r5 = r0.A0h     // Catch:{ 4yI -> 0x0bfd, 5VQ -> 0x0bf3, 1ej -> 0x0c13 }
            r4 = 10
            r5.onError(r4)     // Catch:{ 4yI -> 0x0bfd, 5VQ -> 0x0bf3, 1ej -> 0x0c13 }
            goto L_0x0c22
        L_0x0ba2:
            com.whatsapp.util.Log.i((java.lang.String) r25)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x0bd9
        L_0x0ba6:
            java.lang.String r4 = "gdrive/backup/getLatestMessageStoreBackupFiles message store base backup file does not exist. The user deleted it or local backup is currently running."
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "Message store base backup file does not exist."
            X.4yK r6 = new X.4yK     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r6.<init>(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x0bce
        L_0x0bb3:
            r5 = move-exception
            java.lang.String r4 = "Unexpected failure: "
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r6.<init>(r4, r5)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            goto L_0x0bce
        L_0x0bbc:
            r6 = move-exception
            long r4 = r18.A01()     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r4 = r22
            r4.A00 = r5     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            X.0yW r5 = r0.A0U     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            r5.Bly(r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x0bce:
            throw r6     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x0bcf:
            r4 = 31
            X.C1042758y.A00(r1, r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
            java.lang.String r4 = "gdrive/backup/fetch-token/network-failure-at-token-fetch-stage"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 4yI -> 0x0bfa, 5VQ -> 0x0bf0, 1ej -> 0x0bed }
        L_0x0bd9:
            r6 = 0
        L_0x0bda:
            r4 = r61
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.A0Q     // Catch:{ 4yI -> 0x0bfd, 5VQ -> 0x0bf3, 1ej -> 0x0c13 }
            boolean r4 = r4.get()     // Catch:{ 4yI -> 0x0bfd, 5VQ -> 0x0bf3, 1ej -> 0x0c13 }
            if (r4 == 0) goto L_0x0e2d
            X.7fW r5 = r0.A0h     // Catch:{ 4yI -> 0x0bfd, 5VQ -> 0x0bf3, 1ej -> 0x0c13 }
            r4 = 14
            r5.onError(r4)     // Catch:{ 4yI -> 0x0bfd, 5VQ -> 0x0bf3, 1ej -> 0x0c13 }
            goto L_0x0e2d
        L_0x0bed:
            r5 = move-exception
            r6 = 0
            goto L_0x0c14
        L_0x0bf0:
            r5 = move-exception
            r6 = 0
            goto L_0x0bf4
        L_0x0bf3:
            r5 = move-exception
        L_0x0bf4:
            X.7fW r4 = r0.A0h
            X.AnonymousClass6YN.A09(r5, r4)
            goto L_0x0c20
        L_0x0bfa:
            r8 = move-exception
            r6 = 0
            goto L_0x0bfe
        L_0x0bfd:
            r8 = move-exception
        L_0x0bfe:
            X.0yC r7 = r0.A0T
            X.1Cn r5 = r0.A0B
            r4 = 1
            X.C109775Zb.A00(r5, r7, r4)
            X.7fW r4 = r0.A0h
            X.AnonymousClass6YN.A09(r8, r4)
            java.lang.String r4 = r62.A0c()
            r5.A05(r4)
            goto L_0x0c20
        L_0x0c13:
            r5 = move-exception
        L_0x0c14:
            java.lang.String r4 = "gdrive/backup"
            com.whatsapp.util.Log.e(r4, r5)
            X.7fW r5 = r0.A0h
            r4 = 20
            r5.onError(r4)
        L_0x0c20:
            if (r6 == 0) goto L_0x0e2d
        L_0x0c22:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r20)
            r1.A0V = r7
            long r4 = r0.A03
            java.lang.Double r4 = X.C90524aI.A0Z(r4)
            r1.A06 = r4
            long r4 = r0.A08
            java.lang.Double r4 = X.C90524aI.A0Z(r4)
            r1.A0D = r4
            long r4 = r0.A06
            java.lang.Double r4 = X.C90524aI.A0Z(r4)
            r1.A08 = r4
            long r4 = r0.A02
            java.lang.Double r4 = X.C90524aI.A0Z(r4)
            r1.A0A = r4
            long r4 = r0.A04
            java.lang.Double r4 = X.C90524aI.A0Z(r4)
            r1.A05 = r4
            int r4 = r0.A00
            double r4 = (double) r4
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r1.A07 = r4
            long r4 = r0.A07
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.A0a = r4
            X.1Cn r10 = r0.A0B
            boolean r4 = r10.A08()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.A02 = r4
            int r4 = r62.A0M()
            java.lang.Long r4 = X.C36441kJ.A0y(r4)
            r1.A0f = r4
            boolean r4 = r62.A2E()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.A00 = r4
            r4 = r61
            int r5 = r4.A00
            r4 = 1
            if (r5 != r4) goto L_0x0e27
            java.lang.Long r4 = X.C90474aD.A0Y()
        L_0x0c8c:
            r1.A0c = r4
            java.lang.Integer r4 = r1.A0W
            if (r4 != 0) goto L_0x0c94
            r1.A0W = r7
        L_0x0c94:
            r4 = r58
            int r7 = r4.A00
            int r4 = r57.get()
            int r7 = r7 + r4
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "gdrive/backup/total-requests-in-backup-session/"
            X.C36321k7.A1T(r4, r5, r7)
            double r4 = (double) r7
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r1.A09 = r4
            java.lang.String r7 = r62.A0c()
            if (r7 == 0) goto L_0x0cef
            r4 = r62
            long r15 = r4.A0U(r7)
            long r8 = r0.A02
            r11 = -1
            int r4 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x0cef
            r11 = 14
        L_0x0cc3:
            long r4 = (long) r11
            r12 = 1073741824(0x40000000, double:5.304989477E-315)
            long r4 = r4 * r12
            r13 = 1
            long r13 = r13 + r15
            int r12 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r12 > 0) goto L_0x0e21
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 > 0) goto L_0x0e21
            X.0yC r5 = r0.A0T
            r4 = 7207(0x1c27, float:1.0099E-41)
            int r14 = r5.A07(r4)
            if (r14 == 0) goto L_0x0cef
            X.00T r13 = r10.A01
            android.content.SharedPreferences r8 = X.C36411kG.A0E(r13)
            java.lang.String r5 = "backup_current_banner_type"
            r4 = 0
            int r4 = r8.getInt(r5, r4)
            r12 = 4
            if (r4 == 0) goto L_0x0de3
            if (r4 == r12) goto L_0x0de3
        L_0x0cef:
            long r4 = java.lang.System.currentTimeMillis()
            r8 = r62
            r8.A1e(r7, r4)
            long r4 = r0.A02
            r8.A1f(r7, r4)
            long r4 = r0.A06
            r8.A1d(r7, r4)
            long r4 = r0.A09
            r8.A1g(r7, r4)
            boolean r5 = r59.A2I()
            r8.A1o(r7, r5)
            android.content.SharedPreferences$Editor r7 = X.C19420v0.A00(r62)
            java.lang.String r5 = "gdrive_successive_backup_failed_count"
            r4 = 0
            X.C36341k9.A0v(r7, r5, r4)
            android.content.SharedPreferences$Editor r5 = X.C19420v0.A00(r62)
            java.lang.String r4 = "gdrive_backup_start_timestamp"
            android.content.SharedPreferences$Editor r5 = r5.remove(r4)
            java.lang.String r4 = "gdrive_already_uploaded_bytes"
            android.content.SharedPreferences$Editor r5 = r5.remove(r4)
            java.lang.String r4 = "gdrive_user_initiated_backup"
            X.C36341k9.A0u(r5, r4)
            X.6Ns r5 = r0.A0I
            r4 = r21
            java.lang.String r4 = r4.A08
            r5.A01(r4)
            java.util.concurrent.atomic.AtomicLong r4 = r0.A0d
            r4.set(r2)
            java.util.concurrent.atomic.AtomicLong r4 = r0.A0f
            r4.set(r2)
            r4 = r56
            r4.set(r2)
            r5 = 0
            r4 = r55
            r4.set(r5)
            r4 = r61
            r4.A04 = r5
            X.AnonymousClass6UR.A02()
            boolean r4 = r21.A0D()
            if (r4 == 0) goto L_0x0d71
            r63.A00()
        L_0x0d5b:
            r0.A05 = r2
        L_0x0d5d:
            r1 = r61
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.A0Q
            r1 = 0
            r2.getAndSet(r1)
            X.0yC r3 = r0.A0T
            X.0zS r2 = r0.A0X
            X.1Cn r1 = r0.A0B
            r0 = r62
            X.C109835Zh.A00(r1, r0, r3, r2)
            return r6
        L_0x0d71:
            r5 = 1
            r4 = r63
            r4.A07(r5)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "gdrive/backup "
            r5.append(r4)
            java.lang.String r4 = A00(r1)
            X.C36321k7.A1a(r5, r4)
            X.005 r4 = r0.A0Y
            java.lang.Object r4 = X.C36411kG.A0v(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r14 = r4.iterator()
        L_0x0d93:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x0ddc
            java.lang.Object r4 = r14.next()
            X.1CP r4 = (X.AnonymousClass1CP) r4
            r4.A0G(r1)
            X.1Cn r13 = r4.A00
            java.lang.String r12 = r4.A0J()
            r4 = 0
            X.AnonymousClass00C.A0D(r12, r4)
            X.00T r11 = r13.A01
            android.content.SharedPreferences r8 = X.C36411kG.A0E(r11)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0v(r12)
            java.lang.String r4 = "_backup_size"
            java.lang.String r7 = X.AnonymousClass000.A0q(r4, r5)
            r4 = -1
            long r9 = r8.getLong(r7, r4)
            java.lang.String r8 = "_backup_google_saved_size"
            int r7 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0dd0
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            X.C24461Cn.A01(r13, r4, r12, r8)
            goto L_0x0d93
        L_0x0dd0:
            java.lang.String r5 = X.C36321k7.A0D(r12, r8)
            android.content.SharedPreferences$Editor r4 = X.C36351kA.A0A(r11)
            X.C36341k9.A0u(r4, r5)
            goto L_0x0d93
        L_0x0ddc:
            X.0yW r4 = r0.A0U
            r4.Bly(r1)
            goto L_0x0d5b
        L_0x0de3:
            r9 = 1
            int r4 = r11 - r20
            int r20 = r20 << r4
            r14 = r14 & r20
            if (r14 != 0) goto L_0x0ded
            r9 = 0
        L_0x0ded:
            android.content.SharedPreferences r5 = X.C36411kG.A0E(r13)
            java.lang.String r8 = "backup_last_threshold_crossed"
            r4 = 0
            int r14 = r5.getInt(r8, r4)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "BackupStorageBannerManager/handleCrossingSizeThreshold: threshold="
            r5.append(r4)
            r5.append(r11)
            java.lang.String r4 = "; thresholdEnabled="
            r5.append(r4)
            r5.append(r9)
            java.lang.String r4 = "; lastThreshold="
            X.C36321k7.A1T(r4, r5, r14)
            if (r9 == 0) goto L_0x0cef
            if (r11 <= r14) goto L_0x0cef
            r10.A03(r12)
            android.content.SharedPreferences$Editor r4 = X.C36351kA.A0A(r13)
            X.C36341k9.A0v(r4, r8, r11)
            goto L_0x0cef
        L_0x0e21:
            int r11 = r11 + -1
            if (r11 <= 0) goto L_0x0cef
            goto L_0x0cc3
        L_0x0e27:
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            goto L_0x0c8c
        L_0x0e2d:
            X.AnonymousClass6UR.A02()
            r4 = r56
            r4.set(r2)
            r5 = 0
            r4 = r55
            r4.set(r5)
            monitor-enter(r21)
            r4 = r21
            boolean r4 = r4.A00     // Catch:{ all -> 0x0f18 }
            monitor-exit(r21)
            if (r4 == 0) goto L_0x0e5c
            java.lang.String r4 = "gdrive/backup was canceled"
            com.whatsapp.util.Log.w((java.lang.String) r4)
            r4 = 39
            X.C1042758y.A00(r1, r4)
            r63.A00()
            r0.A01()
            r0.A05 = r2
            r1 = r62
            r1.A1A(r5)
            goto L_0x0d5d
        L_0x0e5c:
            X.1el r3 = r0.A0J
            boolean r2 = r3.A05()
            if (r2 != 0) goto L_0x0f0d
            java.lang.String r2 = "gdrive/backup failed on unavailable resource conditions"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            boolean r2 = r0 instanceof X.C101914yU
            if (r2 == 0) goto L_0x0ee6
            r3 = r0
            X.4yU r3 = (X.C101914yU) r3
            com.whatsapp.backup.google.workers.GoogleBackupWorker r5 = r3.A00
            X.4yC r2 = r5.A0A
            boolean r1 = r2.A05()
            if (r1 != 0) goto L_0x0d5d
            androidx.work.WorkerParameters r1 = r5.A01
            int r1 = r1.A00
            int r4 = r5.A00
            if (r1 >= r4) goto L_0x0ecc
            boolean r1 = r2.A03()
            if (r1 != 0) goto L_0x0eaa
            X.58y r4 = r5.A0O
            r2 = 22
        L_0x0e8c:
            X.C1042758y.A00(r4, r2)
        L_0x0e8f:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "google-backup-worker/doWork conditions were not met(result code = "
            r2.append(r1)
            X.58y r1 = r5.A0O
            java.lang.Integer r1 = r1.A0V
            r2.append(r1)
            java.lang.String r1 = "), retrying backup later"
            X.C36321k7.A1a(r2, r1)
            r1 = 0
        L_0x0ea5:
            r3.A04(r1)
            goto L_0x0d5d
        L_0x0eaa:
            boolean r1 = r2.A02()
            if (r1 != 0) goto L_0x0ec1
            X.1ei r1 = r5.A06
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0V
            boolean r1 = r1.get()
            X.58y r4 = r5.A0O
            r2 = 19
            if (r1 != 0) goto L_0x0e8c
            r2 = 20
            goto L_0x0e8c
        L_0x0ec1:
            boolean r1 = r2.A04()
            if (r1 != 0) goto L_0x0e8f
            X.58y r4 = r5.A0O
            r2 = 21
            goto L_0x0e8c
        L_0x0ecc:
            X.58y r2 = r5.A0O
            r1 = 24
            X.C1042758y.A00(r2, r1)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "google-backup-worker/doWork worker reached the maximum amount of retries("
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = "), failing"
            X.C36321k7.A1Z(r2, r1)
            r1 = 1
            goto L_0x0ea5
        L_0x0ee6:
            boolean r2 = r3.A03()
            if (r2 != 0) goto L_0x0ef2
            r2 = 34
        L_0x0eee:
            X.C1042758y.A00(r1, r2)
            goto L_0x0f12
        L_0x0ef2:
            boolean r2 = r3.A01()
            if (r2 != 0) goto L_0x0efb
            r2 = 37
            goto L_0x0eee
        L_0x0efb:
            boolean r2 = r3.A02()
            if (r2 != 0) goto L_0x0f04
            r2 = 35
            goto L_0x0eee
        L_0x0f04:
            boolean r2 = r3.A04()
            if (r2 != 0) goto L_0x0f12
            r2 = 36
            goto L_0x0eee
        L_0x0f0d:
            java.lang.String r1 = "gdrive/backup failed"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0f12:
            r1 = 1
            r0.A04(r1)
            goto L_0x0d5d
        L_0x0f18:
            r0 = move-exception
            monitor-exit(r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VL.A05():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        if (r14.length() <= 0) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(java.util.Collection r23, java.util.List r24, java.util.List r25) {
        /*
            r22 = this;
            r20 = 0
            r1 = 1
            r23.size()
            java.util.concurrent.atomic.AtomicReference r17 = X.C90514aH.A18()
            int r0 = r23.size()
            java.util.concurrent.CountDownLatch r5 = new java.util.concurrent.CountDownLatch
            r5.<init>(r0)
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r4.<init>(r1)
            int r1 = r23.size()
            r0 = 100
            if (r1 <= r0) goto L_0x008a
            int r11 = r23.size()
            int r11 = r11 / r0
        L_0x0025:
            java.util.Iterator r10 = r23.iterator()
            r1 = 0
        L_0x002a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x008c
            int r9 = r1 + 1
            java.io.File r14 = X.C90504aG.A0a(r10)
            r13 = r22
            X.1el r0 = r13.A0J
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0041
            return r20
        L_0x0041:
            int r1 = r1 % r11
            boolean r21 = X.AnonymousClass000.A1Q(r1)
            boolean r0 = r14.exists()
            r8 = 1
            if (r0 == 0) goto L_0x0058
            long r6 = r14.length()
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r3 = 1
            if (r0 > 0) goto L_0x0059
        L_0x0058:
            r3 = 0
        L_0x0059:
            java.lang.String r2 = X.AnonymousClass6YN.A02(r14)
            X.67v r1 = r13.A0H
            boolean r0 = r1.A01(r2)
            if (r0 == 0) goto L_0x006c
            boolean r0 = r1.A00(r14, r2)
            if (r0 != 0) goto L_0x006c
            r8 = 0
        L_0x006c:
            r3 = r3 & r8
            if (r3 == 0) goto L_0x0083
            X.3vz r12 = new X.3vz
            r15 = r24
            r16 = r25
            r18 = r5
            r19 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            java.util.concurrent.ThreadPoolExecutor r0 = X.C113925gM.A00
            r0.execute(r12)
        L_0x0081:
            r1 = r9
            goto L_0x002a
        L_0x0083:
            r14.length()
            r5.countDown()
            goto L_0x0081
        L_0x008a:
            r11 = 1
            goto L_0x0025
        L_0x008c:
            r5.await()     // Catch:{ InterruptedException -> 0x0090 }
            goto L_0x0096
        L_0x0090:
            r1 = move-exception
            java.lang.String r0 = "gdrive/backup/collect-files-to-be-uploaded/waiting for files to be processed was interrupted"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0096:
            java.lang.Object r1 = r17.get()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x00a9
            boolean r0 = r1 instanceof X.C101864yP
            if (r0 == 0) goto L_0x00a3
            throw r1
        L_0x00a3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00a9:
            boolean r0 = r4.get()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VL.A06(java.util.Collection, java.util.List, java.util.List):boolean");
    }

    public final void A03(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A052 = C34191gb.A05(this.A0L, C90504aG.A0a(it));
            if (this.A0a.get(A052) == null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("gdrive/backup/files/");
                A0u.append(str);
                C36321k7.A1Z(A0u, "/cancel-backup");
                throw new C101814yK(AnonymousClass000.A0p("Message store backup files are not backed up, file: ", A052, AnonymousClass000.A0u()));
            }
        }
    }

    public AnonymousClass6VL(C20690y0 r26, C24461Cn r27, C132716Uy r28, C24431Ck r29, AnonymousClass3S1 r30, C33101ei r31, C33121ek r32, C1273267v r33, C131096Ns r34, C33131el r35, C133226Xi r36, AnonymousClass7fW r37, AnonymousClass179 r38, C24341Cb r39, C19970wo r40, C19630wG r41, C20830yE r42, C19420v0 r43, AnonymousClass1Q9 r44, AnonymousClass12P r45, C20810yC r46, C21010yW r47, C1042758y r48, AnonymousClass19A r49, C21570zS r50, AnonymousClass005 r51, String str, List list, AtomicLong atomicLong, AtomicLong atomicLong2, boolean z) {
        C21010yW r9 = r47;
        C20810yC r0 = r46;
        C19630wG r14 = r41;
        C19970wo r15 = r40;
        C20690y0 r24 = r26;
        C36321k7.A1B(r14, r15, r0, r24, r9);
        AnonymousClass19A r7 = r49;
        AnonymousClass179 r17 = r38;
        C21570zS r6 = r50;
        C36321k7.A13(r17, r7, r6);
        C24341Cb r16 = r39;
        C24431Ck r22 = r29;
        C90474aD.A18(r22, r16);
        AnonymousClass12P r10 = r45;
        AnonymousClass1Q9 r13 = r44;
        C19420v0 r11 = r43;
        C20830yE r12 = r42;
        C131096Ns r18 = r34;
        C36321k7.A1D(r13, r10, r18, r12, r11);
        AnonymousClass005 r5 = r51;
        C24461Cn r23 = r27;
        C36361kB.A1M(r5, r23);
        AnonymousClass3S1 r21 = r30;
        AnonymousClass00C.A0D(r21, 19);
        C33101ei r20 = r31;
        AnonymousClass00C.A0D(r20, 20);
        List list2 = list;
        AnonymousClass00C.A0D(list2, 22);
        AtomicLong atomicLong3 = atomicLong;
        AnonymousClass00C.A0D(atomicLong3, 23);
        AtomicLong atomicLong4 = atomicLong2;
        AnonymousClass00C.A0D(atomicLong4, 24);
        C33121ek r19 = r32;
        AnonymousClass00C.A0D(r19, 28);
        C1042758y r8 = r48;
        AnonymousClass00C.A0D(r8, 29);
        this.A0O = r14;
        this.A0N = r15;
        this.A0T = r0;
        this.A0A = r24;
        this.A0U = r9;
        this.A0L = r17;
        this.A0W = r7;
        this.A0X = r6;
        this.A0D = r22;
        this.A0H = r33;
        this.A0M = r16;
        this.A0R = r13;
        this.A0S = r10;
        this.A0I = r18;
        this.A0P = r12;
        this.A0Q = r11;
        this.A0Y = r5;
        this.A0B = r23;
        this.A0E = r21;
        this.A0F = r20;
        this.A0Z = str;
        this.A0i = list2;
        this.A0f = atomicLong3;
        this.A0d = atomicLong4;
        this.A0K = r36;
        this.A0J = r35;
        this.A0g = z;
        this.A0G = r19;
        this.A0V = r8;
        this.A0C = r28;
        this.A0h = r37;
    }
}
