package X;

import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

/* renamed from: X.75I  reason: invalid class name */
public abstract class AnonymousClass75I implements Runnable, C159517jU, C159537jW {
    public C160117kU A00;
    public final C146476vf A01;

    public static final void A00(AnonymousClass75I r1, boolean z) {
        C160117kU r0;
        synchronized (r1) {
            r0 = r1.A00;
        }
        if (r0 == null) {
            return;
        }
        if (z) {
            r0.B2V();
        } else {
            r0.cancel();
        }
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x023e  */
    public X.C117395mC A02() {
        /*
            r20 = this;
            r8 = r20
            r0 = r8
            boolean r1 = r8 instanceof X.AnonymousClass5C1     // Catch:{ 5V9 -> 0x028e }
            if (r1 == 0) goto L_0x001d
            X.5C1 r0 = (X.AnonymousClass5C1) r0     // Catch:{ 5V9 -> 0x028e }
            X.6c4 r1 = r0.A01     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r1 = r1.A0H     // Catch:{ 5V9 -> 0x028e }
            X.6yj r3 = new X.6yj     // Catch:{ 5V9 -> 0x028e }
            r3.<init>(r1)     // Catch:{ 5V9 -> 0x028e }
            java.io.File r1 = r0.A03     // Catch:{ 5V9 -> 0x028e }
            X.1Gl r0 = X.C25471Gl.A0d     // Catch:{ 5V9 -> 0x028e }
        L_0x0016:
            X.6LX r10 = new X.6LX     // Catch:{ 5V9 -> 0x028e }
            r10.<init>(r0, r3, r1)     // Catch:{ 5V9 -> 0x028e }
            goto L_0x01f8
        L_0x001d:
            boolean r1 = r8 instanceof X.C104915By     // Catch:{ 5V9 -> 0x028e }
            if (r1 == 0) goto L_0x0034
            X.5By r0 = (X.C104915By) r0     // Catch:{ 5V9 -> 0x028e }
            X.6c9 r1 = r0.A00     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r1 = r1.A05     // Catch:{ 5V9 -> 0x028e }
            X.C18740tg.A06(r1)     // Catch:{ 5V9 -> 0x028e }
            X.6yj r3 = new X.6yj     // Catch:{ 5V9 -> 0x028e }
            r3.<init>(r1)     // Catch:{ 5V9 -> 0x028e }
            java.io.File r1 = r0.A03     // Catch:{ 5V9 -> 0x028e }
            X.1Gl r0 = X.C25471Gl.A0D     // Catch:{ 5V9 -> 0x028e }
            goto L_0x0016
        L_0x0034:
            boolean r1 = r8 instanceof X.C104925Bz     // Catch:{ 5V9 -> 0x028e }
            if (r1 == 0) goto L_0x008a
            X.5Bz r0 = (X.C104925Bz) r0     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r3 = r0.A08     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r15 = X.C18750th.A04(r3)     // Catch:{ 5V9 -> 0x028e }
            X.0yC r1 = r0.A05     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r16 = "ppic"
            r11 = 0
            X.5JY r13 = new X.5JY     // Catch:{ 5V9 -> 0x028e }
            r19 = r11
            r14 = r1
            r17 = r11
            r18 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch:{ 5V9 -> 0x028e }
            X.0wG r1 = r0.A04     // Catch:{ 5V9 -> 0x028e }
            android.content.Context r4 = r1.A00     // Catch:{ 5V9 -> 0x028e }
            X.AnonymousClass00C.A08(r4)     // Catch:{ 5V9 -> 0x028e }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r1 = "https://pps.whatsapp.net"
            java.lang.String r1 = X.AnonymousClass000.A0p(r1, r3, r2)     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r3 = android.webkit.URLUtil.guessFileName(r1, r11, r11)     // Catch:{ 5V9 -> 0x028e }
            java.io.File r2 = r4.getCacheDir()     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r1 = "NewsletterProfilePictureTemp"
            java.io.File r1 = X.C36441kJ.A0w(r2, r1)     // Catch:{ 5V9 -> 0x028e }
            r1.mkdirs()     // Catch:{ 5V9 -> 0x028e }
            java.io.File r15 = X.C36441kJ.A0w(r1, r3)     // Catch:{ 5V9 -> 0x028e }
            r0.A00 = r15     // Catch:{ 5V9 -> 0x028e }
            X.1Gl r12 = X.C25471Gl.A0D     // Catch:{ 5V9 -> 0x028e }
            X.AnonymousClass00C.A09(r12)     // Catch:{ 5V9 -> 0x028e }
            r17 = 0
            X.6LX r10 = new X.6LX     // Catch:{ 5V9 -> 0x028e }
            r14 = r11
            r16 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ 5V9 -> 0x028e }
            goto L_0x01f8
        L_0x008a:
            boolean r1 = r8 instanceof X.C104895Bw     // Catch:{ 5V9 -> 0x028e }
            if (r1 == 0) goto L_0x009f
            X.5Bw r0 = (X.C104895Bw) r0     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r2 = r0.A03     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r1 = r0.A02     // Catch:{ 5V9 -> 0x028e }
            X.6yi r3 = new X.6yi     // Catch:{ 5V9 -> 0x028e }
            r3.<init>(r2, r1)     // Catch:{ 5V9 -> 0x028e }
            java.io.File r1 = r0.A01     // Catch:{ 5V9 -> 0x028e }
            X.1Gl r0 = r0.A00     // Catch:{ 5V9 -> 0x028e }
            goto L_0x0016
        L_0x009f:
            boolean r1 = r8 instanceof X.AnonymousClass5C0     // Catch:{ 5V9 -> 0x028e }
            if (r1 == 0) goto L_0x00f7
            X.5C0 r0 = (X.AnonymousClass5C0) r0     // Catch:{ 5V9 -> 0x028e }
            r1 = 1
            r0.A0A = r1     // Catch:{ 5V9 -> 0x028e }
            X.0yC r3 = r0.A03     // Catch:{ 5V9 -> 0x028e }
            X.5xp r6 = r0.A04     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r1 = r6.A05     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r5 = r6.A04     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r16 = "ppic"
            r11 = 0
            X.5JY r13 = new X.5JY     // Catch:{ 5V9 -> 0x028e }
            r19 = r11
            r14 = r3
            r15 = r1
            r17 = r11
            r18 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch:{ 5V9 -> 0x028e }
            X.0wG r1 = r0.A02     // Catch:{ 5V9 -> 0x028e }
            android.content.Context r4 = r1.A00     // Catch:{ 5V9 -> 0x028e }
            java.net.URL r2 = r6.A06     // Catch:{ 5V9 -> 0x028e }
            int r1 = r6.A02     // Catch:{ 5V9 -> 0x028e }
            java.io.File r15 = X.AnonymousClass1OC.A00(r4, r5, r2, r1)     // Catch:{ 5V9 -> 0x028e }
            r0.A09 = r15     // Catch:{ 5V9 -> 0x028e }
            X.1Gl r12 = X.C25471Gl.A0D     // Catch:{ 5V9 -> 0x028e }
            r0 = 1
            if (r1 != r0) goto L_0x00f4
            java.lang.String r6 = "manual"
        L_0x00d5:
            java.lang.String r4 = "profile_picture"
            X.AnonymousClass00C.A0D(r3, r0)     // Catch:{ 5V9 -> 0x028e }
            r17 = 0
            X.64M r14 = new X.64M     // Catch:{ 5V9 -> 0x028e }
            r7 = 0
            r1 = r14
            r2 = r3
            r3 = r11
            r5 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ 5V9 -> 0x028e }
            r0 = 3
            X.AnonymousClass00C.A0D(r12, r0)     // Catch:{ 5V9 -> 0x028e }
            X.6LX r10 = new X.6LX     // Catch:{ 5V9 -> 0x028e }
            r16 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ 5V9 -> 0x028e }
            goto L_0x01f8
        L_0x00f4:
            java.lang.String r6 = "full"
            goto L_0x00d5
        L_0x00f7:
            boolean r1 = r8 instanceof X.C104885Bv     // Catch:{ 5V9 -> 0x028e }
            if (r1 == 0) goto L_0x013a
            X.5Bv r0 = (X.C104885Bv) r0     // Catch:{ 5V9 -> 0x028e }
            X.685 r4 = new X.685     // Catch:{ 5V9 -> 0x028e }
            r4.<init>()     // Catch:{ 5V9 -> 0x028e }
            X.4xN r3 = r0.A00     // Catch:{ 5V9 -> 0x028e }
            X.68C r2 = r3.A0f     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r1 = r2.A0F     // Catch:{ 5V9 -> 0x028e }
            r4.A04 = r1     // Catch:{ 5V9 -> 0x028e }
            X.1Gl r12 = r2.A0A     // Catch:{ 5V9 -> 0x028e }
            boolean r1 = X.AnonymousClass6Y1.A06(r12)     // Catch:{ 5V9 -> 0x028e }
            if (r1 == 0) goto L_0x0137
            java.lang.String r1 = r2.A0H     // Catch:{ 5V9 -> 0x028e }
        L_0x0114:
            r4.A08 = r1     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r1 = r12.A02     // Catch:{ 5V9 -> 0x028e }
            r4.A07 = r1     // Catch:{ 5V9 -> 0x028e }
            X.5JY r13 = r4.A00()     // Catch:{ 5V9 -> 0x028e }
            java.io.File r15 = r3.A03     // Catch:{ 5V9 -> 0x028e }
            X.6Fk r11 = r3.A0j     // Catch:{ 5V9 -> 0x028e }
            X.64M r14 = X.C101334xN.A02(r3)     // Catch:{ 5V9 -> 0x028e }
            boolean r1 = r0.A01     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r0 = r2.A0J     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r16 = X.AnonymousClass6YC.A08(r0)     // Catch:{ 5V9 -> 0x028e }
            X.6LX r10 = new X.6LX     // Catch:{ 5V9 -> 0x028e }
            r17 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ 5V9 -> 0x028e }
            goto L_0x01f8
        L_0x0137:
            java.lang.String r1 = r2.A0G     // Catch:{ 5V9 -> 0x028e }
            goto L_0x0114
        L_0x013a:
            boolean r1 = r8 instanceof X.C104905Bx     // Catch:{ 5V9 -> 0x028e }
            if (r1 == 0) goto L_0x015e
            X.5Bx r0 = (X.C104905Bx) r0     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r1 = r0.A04     // Catch:{ 5V9 -> 0x028e }
            X.6yj r13 = new X.6yj     // Catch:{ 5V9 -> 0x028e }
            r13.<init>(r1)     // Catch:{ 5V9 -> 0x028e }
            java.io.File r15 = r0.A03     // Catch:{ 5V9 -> 0x028e }
            X.1Gl r12 = r0.A01     // Catch:{ 5V9 -> 0x028e }
            X.6Fk r11 = r0.A00     // Catch:{ 5V9 -> 0x028e }
            X.64M r14 = r0.A02     // Catch:{ 5V9 -> 0x028e }
            r0 = 3
            X.AnonymousClass00C.A0D(r12, r0)     // Catch:{ 5V9 -> 0x028e }
            r16 = 0
            r17 = 0
            X.6LX r10 = new X.6LX     // Catch:{ 5V9 -> 0x028e }
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ 5V9 -> 0x028e }
            goto L_0x01f8
        L_0x015e:
            boolean r1 = r8 instanceof X.AnonymousClass5Bs     // Catch:{ 5V9 -> 0x028e }
            if (r1 == 0) goto L_0x01ca
            X.5Bs r0 = (X.AnonymousClass5Bs) r0     // Catch:{ 5V9 -> 0x028e }
            X.1Av r1 = r0.A00     // Catch:{ 5V9 -> 0x028e }
            X.6c4 r4 = r0.A01     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r6 = r4.A0E     // Catch:{ 5V9 -> 0x028e }
            X.0y0 r1 = r1.A00     // Catch:{ 5V9 -> 0x028e }
            java.io.File r5 = r1.A0G()     // Catch:{ 5V9 -> 0x028e }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 5V9 -> 0x028e }
            r2 = 47
            r1 = 45
            java.lang.String r1 = r6.replace(r2, r1)     // Catch:{ 5V9 -> 0x028e }
            r3.append(r1)     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r1 = ".tmp"
            java.io.File r13 = X.C90464aC.A0K(r5, r1, r3)     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r3 = r4.A09     // Catch:{ 5V9 -> 0x028e }
            if (r3 == 0) goto L_0x01bd
            java.lang.String r1 = r4.A0C     // Catch:{ 5V9 -> 0x028e }
            if (r1 == 0) goto L_0x01b0
            X.1Gl r11 = X.C25471Gl.A0d     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r1 = "sticker"
            X.685 r2 = new X.685     // Catch:{ 5V9 -> 0x028e }
            r2.<init>()     // Catch:{ 5V9 -> 0x028e }
            r2.A08 = r3     // Catch:{ 5V9 -> 0x028e }
            r2.A07 = r1     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r1 = r4.A07     // Catch:{ 5V9 -> 0x028e }
            r2.A04 = r1     // Catch:{ 5V9 -> 0x028e }
            X.5JY r12 = r2.A00()     // Catch:{ 5V9 -> 0x028e }
            java.io.File r14 = r0.A03     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r15 = r4.A0C     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r0 = r4.A0E     // Catch:{ 5V9 -> 0x028e }
            X.5xn r10 = new X.5xn     // Catch:{ 5V9 -> 0x028e }
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ 5V9 -> 0x028e }
            goto L_0x01f8
        L_0x01b0:
            java.lang.String r0 = "StickerBitmapNetworkFetcher/StickerDownload/makeRequest failed to find media key for sticker"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 5V9 -> 0x028e }
            r0 = 29
            X.5V9 r1 = new X.5V9     // Catch:{ 5V9 -> 0x028e }
            r1.<init>(r0)     // Catch:{ 5V9 -> 0x028e }
            goto L_0x01c9
        L_0x01bd:
            java.lang.String r0 = "StickerBitmapNetworkFetcher/StickerDownload/makeRequest failed to find enc file hash for sticker"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 5V9 -> 0x028e }
            r0 = 27
            X.5V9 r1 = new X.5V9     // Catch:{ 5V9 -> 0x028e }
            r1.<init>(r0)     // Catch:{ 5V9 -> 0x028e }
        L_0x01c9:
            throw r1     // Catch:{ 5V9 -> 0x028e }
        L_0x01ca:
            X.5Br r0 = (X.C104855Br) r0     // Catch:{ 5V9 -> 0x028e }
            X.1Gl r11 = X.C25471Gl.A0M     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r3 = "md-app-state"
            X.685 r2 = new X.685     // Catch:{ 5V9 -> 0x028e }
            r2.<init>()     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r1 = r0.A04     // Catch:{ 5V9 -> 0x028e }
            r2.A08 = r1     // Catch:{ 5V9 -> 0x028e }
            r2.A07 = r3     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r1 = r0.A03     // Catch:{ 5V9 -> 0x028e }
            r2.A04 = r1     // Catch:{ 5V9 -> 0x028e }
            X.5JY r12 = r2.A00()     // Catch:{ 5V9 -> 0x028e }
            java.io.File r13 = r0.A01     // Catch:{ 5V9 -> 0x028e }
            X.C18740tg.A06(r13)     // Catch:{ 5V9 -> 0x028e }
            java.io.File r14 = r0.A00     // Catch:{ 5V9 -> 0x028e }
            X.C18740tg.A06(r14)     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r15 = r0.A02     // Catch:{ 5V9 -> 0x028e }
            java.lang.String r0 = r0.A05     // Catch:{ 5V9 -> 0x028e }
            X.5xn r10 = new X.5xn     // Catch:{ 5V9 -> 0x028e }
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ 5V9 -> 0x028e }
        L_0x01f8:
            r0 = r8
            boolean r1 = r8 instanceof X.AnonymousClass5C2
            if (r1 == 0) goto L_0x023e
            X.5C2 r0 = (X.AnonymousClass5C2) r0
            X.6LX r10 = (X.AnonymousClass6LX) r10
            r5 = 0
            X.AnonymousClass00C.A0D(r10, r5)
            X.0yC r3 = r0.A03
            X.0wx r2 = r0.A02
            java.io.File r1 = r10.A04
            X.6vr r4 = new X.6vr
            r4.<init>(r2, r3, r1)
            X.7hT r3 = r10.A02
            boolean r2 = r10.A06
            java.lang.String r1 = r10.A05
            X.5vA r7 = new X.5vA
            r7.<init>(r4, r3, r1, r2)
            X.6Fk r6 = r10.A00
            if (r6 != 0) goto L_0x0226
            X.1Gl r1 = r10.A01
            X.6Fk r6 = new X.6Fk
            r6.<init>(r1, r5)
        L_0x0226:
            X.0wo r4 = r0.A01
            X.0ww r3 = r0.A00
            X.1BS r9 = r0.A05
            X.1BV r5 = r0.A04
            boolean r0 = r0 instanceof X.C104905Bx
            if (r0 == 0) goto L_0x023c
            r11 = 1
        L_0x0233:
            X.64M r10 = r10.A03
            X.76y r2 = new X.76y
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x023a:
            monitor-enter(r8)
            goto L_0x0271
        L_0x023c:
            r11 = 0
            goto L_0x0233
        L_0x023e:
            X.5Bt r0 = (X.C104865Bt) r0
            X.5xn r10 = (X.C124225xn) r10
            r1 = 0
            X.AnonymousClass00C.A0D(r10, r1)
            X.0yC r3 = r0.A03
            X.0wx r2 = r0.A02
            java.io.File r1 = r10.A03
            X.6vr r12 = new X.6vr
            r12.<init>(r2, r3, r1)
            X.7hT r14 = r10.A02
            java.lang.String r15 = r10.A04
            java.lang.String r1 = r10.A05
            X.1Gl r13 = r10.A01
            X.5wJ r6 = new X.5wJ
            r11 = r6
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            X.0wo r4 = r0.A01
            X.0ww r3 = r0.A00
            X.1BS r9 = r0.A05
            X.1BV r5 = r0.A04
            X.6Fk r7 = r10.A00
            X.6vp r2 = new X.6vp
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x023a
        L_0x0271:
            X.7kU r0 = r8.A00     // Catch:{ all -> 0x028b }
            if (r0 == 0) goto L_0x0288
            java.lang.String r0 = "Attempt to run same download multiple times"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x028b }
            r1 = 24
            X.6Wx r0 = new X.6Wx     // Catch:{ all -> 0x028b }
            r0.<init>(r1)     // Catch:{ all -> 0x028b }
            X.5mC r5 = new X.5mC     // Catch:{ all -> 0x028b }
            r5.<init>(r0)     // Catch:{ all -> 0x028b }
            monitor-exit(r8)
            goto L_0x02a1
        L_0x0288:
            r8.A00 = r2     // Catch:{ all -> 0x028b }
            goto L_0x029c
        L_0x028b:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x028e:
            r0 = move-exception
            int r1 = r0.downloadStatus
            X.6Wx r0 = new X.6Wx
            r0.<init>(r1)
            X.5mC r5 = new X.5mC
            r5.<init>(r0)
            goto L_0x02a1
        L_0x029c:
            monitor-exit(r8)
            X.5mC r5 = r2.B5u()
        L_0x02a1:
            X.6Wx r4 = r5.A00
            int r1 = r4.A01
            r0 = 13
            if (r1 == r0) goto L_0x0306
            r0 = 24
            if (r1 == r0) goto L_0x0306
            X.6vf r3 = r8.A01
            boolean r0 = r8 instanceof X.AnonymousClass5C1
            if (r0 == 0) goto L_0x02d4
            X.5C1 r8 = (X.AnonymousClass5C1) r8
            X.6Fp r2 = new X.6Fp
            r2.<init>()
            X.6c4 r1 = r8.A01
        L_0x02bc:
            int r0 = r1.A03
            r2.A0A(r0)
            int r0 = r1.A02
            r2.A08(r0)
        L_0x02c6:
            boolean r0 = r4.A03()
            r2.A0F(r0)
            r2.A07()
        L_0x02d0:
            r3.BW7(r4, r2)
            return r5
        L_0x02d4:
            boolean r0 = r8 instanceof X.C104915By
            if (r0 != 0) goto L_0x0300
            boolean r0 = r8 instanceof X.C104925Bz
            if (r0 != 0) goto L_0x0300
            boolean r0 = r8 instanceof X.C104895Bw
            if (r0 != 0) goto L_0x0300
            boolean r0 = r8 instanceof X.AnonymousClass5C0
            if (r0 != 0) goto L_0x0300
            boolean r0 = r8 instanceof X.C104885Bv
            if (r0 != 0) goto L_0x0300
            boolean r0 = r8 instanceof X.C104905Bx
            if (r0 != 0) goto L_0x0300
            boolean r0 = r8 instanceof X.AnonymousClass5Bs
            if (r0 == 0) goto L_0x02fa
            X.5Bs r8 = (X.AnonymousClass5Bs) r8
            X.6Fp r2 = new X.6Fp
            r2.<init>()
            X.6c4 r1 = r8.A01
            goto L_0x02bc
        L_0x02fa:
            X.6Fp r2 = new X.6Fp
            r2.<init>()
            goto L_0x02c6
        L_0x0300:
            X.6Fp r2 = new X.6Fp
            r2.<init>()
            goto L_0x02d0
        L_0x0306:
            X.6vf r1 = r8.A01
            boolean r0 = r4.A05
            r1.BW6(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass75I.A02():X.5mC");
    }

    public void B0M(C160107kT r6) {
        C146476vf r4 = this.A01;
        C25721Hk r2 = r4.A01;
        C164977sg r0 = new C164977sg(r6, 8);
        Executor executor = r4.A03;
        r2.A03(r0, executor);
        r4.A02.A03(new C164977sg(r6, 7), executor);
        r4.A00.A03(new C164977sg(r6, 9), executor);
    }

    public void B2X(boolean z) {
        String str;
        if (this instanceof AnonymousClass5Bs) {
            str = "StickerBitmapNetworkFetcher/StickerDownload/cancelMediaDownload attempted to cancel download";
        } else {
            if (this instanceof AnonymousClass5C1) {
                str = "AvatarStickerBitmapNetworkFetcher/StickerDownload/cancelMediaDownload attempted to cancel download";
            }
            A00(this, false);
        }
        Log.i(str);
        A00(this, false);
    }

    public void BW5(long j) {
        this.A01.BW4(j);
    }

    public AnonymousClass75I(Executor executor) {
        this.A01 = new C146476vf(executor);
    }

    public C160107kT A01() {
        return this.A01;
    }

    public void run() {
        A02();
    }
}
