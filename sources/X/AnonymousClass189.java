package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.189  reason: invalid class name */
public class AnonymousClass189 {
    public C235218u A00;
    public C235318v A01;
    public final C233418c A02;
    public final C19730wQ A03;
    public final C21100yf A04;
    public final C232417s A05;
    public final C234518n A06;
    public final C234318l A07;
    public final C234418m A08;
    public final C234618o A09;
    public final C234218k A0A;
    public final C233618e A0B;
    public final C234718p A0C;
    public final C19970wo A0D;
    public final C19630wG A0E;
    public final C19420v0 A0F;
    public final C233218a A0G;
    public final C234918r A0H;
    public final C234818q A0I = new C234818q();
    public final AnonymousClass187 A0J;
    public final AnonymousClass18I A0K;
    public final AnonymousClass18M A0L;
    public final C234118j A0M;
    public final C20810yC A0N;
    public final C000100b A0O;
    public final AnonymousClass13F A0P;

    public AnonymousClass189(C19700wN r22, C233418c r23, C19730wQ r24, C21100yf r25, C232417s r26, C234518n r27, C234318l r28, C234418m r29, C234218k r30, C233618e r31, C19970wo r32, C19630wG r33, C19420v0 r34, C233218a r35, AnonymousClass187 r36, AnonymousClass18I r37, AnonymousClass18M r38, C234118j r39, C20810yC r40, C000100b r41, AnonymousClass13F r42) {
        C19970wo r4 = r32;
        AnonymousClass18M r3 = r38;
        C21100yf r7 = r25;
        C234618o r10 = new C234618o(r7, r4, r3);
        C234718p r13 = new C234718p(r4, r3);
        C234918r r1 = new C234918r(this);
        this.A0H = r1;
        this.A0D = r4;
        C20810yC r5 = r40;
        this.A0N = r5;
        C000100b r2 = r41;
        this.A0O = r2;
        this.A03 = r24;
        this.A04 = r7;
        this.A0K = r37;
        this.A0G = r35;
        AnonymousClass187 r0 = r36;
        this.A0J = r0;
        this.A0L = r3;
        this.A02 = r23;
        this.A09 = r10;
        C233618e r12 = r31;
        this.A0B = r12;
        this.A05 = r26;
        this.A0F = r34;
        C234218k r11 = r30;
        this.A0A = r11;
        this.A0M = r39;
        C234318l r9 = r28;
        this.A07 = r9;
        this.A0C = r13;
        this.A08 = r29;
        C234518n r8 = r27;
        this.A06 = r8;
        this.A00 = new C235218u(r22, new C235018s(r7, r8, r9, r10, r11, r12, r13, this), r4, r0, r5);
        this.A01 = new C235318v(r7, r10, r4, r5, r2);
        r3.A00 = r1;
        this.A0P = r42;
        this.A0E = r33;
    }

    public static C121865tq A00(byte[] bArr, int i) {
        byte[] A062 = ((AnonymousClass8QT) C170918Hz.A08(AnonymousClass8QT.DEFAULT_INSTANCE, bArr)).publicKey_.A06();
        int length = A062.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(A062, 1, bArr2, 0, length);
        return new C121865tq(C203239na.A03(i), bArr2, (byte[]) null);
    }

    public static void A02(C198789eC r1) {
        if (r1.A01.A00.aliceBaseKey_.A06().length == 0) {
            throw new IOException("Alice base key missing from session");
        }
    }

    private void A03(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(A0L((AnonymousClass6EZ) it.next()));
        }
        this.A07.A05(arrayList);
    }

    public int A04() {
        return this.A07.A03();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014d A[Catch:{ 18E -> 0x00da, all -> 0x036d }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014f A[Catch:{ 18E -> 0x00da, all -> 0x036d }] */
    public int A05(X.AnonymousClass6EZ r38, X.C121865tq r39, X.C121865tq r40, byte[] r41, byte[] r42, byte r43) {
        /*
            r37 = this;
            r4 = r37
            X.18I r2 = r4.A0K
            r1 = r38
            X.79X r19 = X.AnonymousClass18I.A00(r1, r2)
            r0 = r19
            X.AnonymousClass18I.A03(r0, r2)
            X.9eC r0 = r4.A0D(r1)     // Catch:{ all -> 0x036d }
            X.9bJ r0 = r0.A01     // Catch:{ all -> 0x036d }
            X.8S2 r0 = r0.A00     // Catch:{ all -> 0x036d }
            X.AUx r0 = r0.remoteIdentityPublic_     // Catch:{ all -> 0x036d }
            byte[] r6 = r0.A06()     // Catch:{ all -> 0x036d }
            int r5 = r6.length     // Catch:{ all -> 0x036d }
            r11 = r41
            r13 = r43
            if (r5 == 0) goto L_0x0039
            r3 = 1
            int r5 = r5 - r3
            byte[] r2 = new byte[r5]     // Catch:{ all -> 0x036d }
            r0 = 0
            java.lang.System.arraycopy(r6, r3, r2, r0, r5)     // Catch:{ all -> 0x036d }
            byte r0 = r6[r0]     // Catch:{ all -> 0x036d }
            if (r0 != r13) goto L_0x0036
            boolean r0 = java.util.Arrays.equals(r11, r2)     // Catch:{ all -> 0x036d }
            if (r0 != 0) goto L_0x0039
        L_0x0036:
            r4.A0E(r1)     // Catch:{ all -> 0x036d }
        L_0x0039:
            X.0yf r2 = r4.A04     // Catch:{ all -> 0x036d }
            X.0yi r0 = X.C21100yf.A0m     // Catch:{ all -> 0x036d }
            boolean r0 = r2.A09(r0)     // Catch:{ all -> 0x036d }
            r8 = r39
            r3 = r40
            r6 = r42
            if (r0 == 0) goto L_0x00c6
            X.18v r7 = r4.A01     // Catch:{ all -> 0x036d }
            r5 = 0
            if (r39 == 0) goto L_0x00c3
            byte[] r0 = r8.A01     // Catch:{ all -> 0x036d }
            int r4 = X.C203239na.A00(r0)     // Catch:{ all -> 0x036d }
            byte[] r10 = r8.A00     // Catch:{ all -> 0x036d }
        L_0x0056:
            byte[] r0 = r3.A01     // Catch:{ all -> 0x036d }
            int r2 = X.C203239na.A00(r0)     // Catch:{ all -> 0x036d }
            int r0 = X.C203239na.A01(r6, r5)     // Catch:{ all -> 0x036d }
            X.0wo r5 = r7.A02     // Catch:{ all -> 0x036d }
            long r28 = X.C19970wo.A00(r5)     // Catch:{ all -> 0x036d }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r28 = r28 / r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x036d }
            r6.<init>()     // Catch:{ all -> 0x036d }
            java.lang.String r5 = "wamsys/processPreKeyBundle preKeyId="
            r6.append(r5)     // Catch:{ all -> 0x036d }
            r6.append(r4)     // Catch:{ all -> 0x036d }
            java.lang.String r5 = "; signedPreKeyId="
            r6.append(r5)     // Catch:{ all -> 0x036d }
            r6.append(r2)     // Catch:{ all -> 0x036d }
            java.lang.String r5 = "; registrationId="
            r6.append(r5)     // Catch:{ all -> 0x036d }
            r6.append(r0)     // Catch:{ all -> 0x036d }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x036d }
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ all -> 0x036d }
            X.00b r8 = r7.A04     // Catch:{ all -> 0x036d }
            java.lang.String r30 = X.AnonymousClass6R2.A01(r1)     // Catch:{ all -> 0x036d }
            int r1 = r1.A00     // Catch:{ all -> 0x036d }
            byte[] r12 = r3.A00     // Catch:{ all -> 0x036d }
            byte[] r9 = r3.A02     // Catch:{ all -> 0x036d }
            r36 = 0
            com.whatsapp.wamsys.JniBridge r8 = (com.whatsapp.wamsys.JniBridge) r8     // Catch:{ all -> 0x036d }
            long r6 = (long) r1     // Catch:{ all -> 0x036d }
            long r4 = (long) r4     // Catch:{ all -> 0x036d }
            long r2 = (long) r2     // Catch:{ all -> 0x036d }
            long r0 = (long) r0     // Catch:{ all -> 0x036d }
            java.util.concurrent.atomic.AtomicReference r8 = r8.wajContext     // Catch:{ all -> 0x036d }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x036d }
            com.facebook.simplejni.NativeHolder r8 = (com.facebook.simplejni.NativeHolder) r8     // Catch:{ all -> 0x036d }
            r20 = r6
            r22 = r4
            r24 = r2
            r26 = r0
            r31 = r8
            r32 = r10
            r33 = r11
            r34 = r12
            r35 = r9
            long r0 = com.whatsapp.wamsys.JniBridge.jvidispatchIIIIIIOOOOOOO(r20, r22, r24, r26, r28, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x036d }
            int r7 = (int) r0     // Catch:{ all -> 0x036d }
            goto L_0x0367
        L_0x00c3:
            r10 = 0
            r4 = 0
            goto L_0x0056
        L_0x00c6:
            X.18u r2 = r4.A00     // Catch:{ all -> 0x036d }
            r9 = 0
            int r7 = r11.length     // Catch:{ 18E -> 0x00da }
            r5 = 1
            int r0 = r7 + 1
            byte[] r4 = new byte[r0]     // Catch:{ 18E -> 0x00da }
            r0 = 0
            r4[r0] = r43     // Catch:{ 18E -> 0x00da }
            java.lang.System.arraycopy(r11, r0, r4, r5, r7)     // Catch:{ 18E -> 0x00da }
            X.AUh r4 = X.C200529hY.A01(r4)     // Catch:{ 18E -> 0x00da }
            goto L_0x00f0
        L_0x00da:
            r5 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x036d }
            r4.<init>()     // Catch:{ all -> 0x036d }
            java.lang.String r0 = "invalid identity key returned from server during prekey fetch; address="
            r4.append(r0)     // Catch:{ all -> 0x036d }
            r4.append(r1)     // Catch:{ all -> 0x036d }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x036d }
            com.whatsapp.util.Log.e(r0, r5)     // Catch:{ all -> 0x036d }
            r4 = r9
        L_0x00f0:
            if (r39 == 0) goto L_0x011c
            byte[] r11 = r8.A00     // Catch:{ all -> 0x036d }
            if (r11 == 0) goto L_0x011c
            int r10 = r11.length     // Catch:{ 18E -> 0x0107 }
            r7 = 1
            int r0 = r10 + 1
            byte[] r5 = new byte[r0]     // Catch:{ 18E -> 0x0107 }
            r0 = 0
            r5[r0] = r43     // Catch:{ 18E -> 0x0107 }
            java.lang.System.arraycopy(r11, r0, r5, r7, r10)     // Catch:{ 18E -> 0x0107 }
            X.AUh r10 = X.C200529hY.A01(r5)     // Catch:{ 18E -> 0x0107 }
            goto L_0x011d
        L_0x0107:
            r7 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x036d }
            r5.<init>()     // Catch:{ all -> 0x036d }
            java.lang.String r0 = "invalid prekey returned from server during prekey fetch; address="
            r5.append(r0)     // Catch:{ all -> 0x036d }
            r5.append(r1)     // Catch:{ all -> 0x036d }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x036d }
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x036d }
        L_0x011c:
            r10 = r9
        L_0x011d:
            byte[] r12 = r3.A00     // Catch:{ 18E -> 0x0130 }
            int r11 = r12.length     // Catch:{ 18E -> 0x0130 }
            r7 = 1
            int r0 = r11 + 1
            byte[] r5 = new byte[r0]     // Catch:{ 18E -> 0x0130 }
            r0 = 0
            r5[r0] = r43     // Catch:{ 18E -> 0x0130 }
            java.lang.System.arraycopy(r12, r0, r5, r7, r11)     // Catch:{ 18E -> 0x0130 }
            X.AUh r9 = X.C200529hY.A01(r5)     // Catch:{ 18E -> 0x0130 }
            goto L_0x0145
        L_0x0130:
            r7 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x036d }
            r5.<init>()     // Catch:{ all -> 0x036d }
            java.lang.String r0 = "invalid signed prekey returned from server during prekey fetch; address="
            r5.append(r0)     // Catch:{ all -> 0x036d }
            r5.append(r1)     // Catch:{ all -> 0x036d }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x036d }
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x036d }
        L_0x0145:
            r0 = 0
            int r18 = X.C203239na.A01(r6, r0)     // Catch:{ all -> 0x036d }
            r7 = 0
            if (r39 != 0) goto L_0x014f
            r12 = -1
            goto L_0x0155
        L_0x014f:
            byte[] r0 = r8.A01     // Catch:{ all -> 0x036d }
            int r12 = X.C203239na.A00(r0)     // Catch:{ all -> 0x036d }
        L_0x0155:
            byte[] r0 = r3.A01     // Catch:{ all -> 0x036d }
            int r17 = X.C203239na.A00(r0)     // Catch:{ all -> 0x036d }
            byte[] r8 = r3.A02     // Catch:{ all -> 0x036d }
            X.9f5 r6 = new X.9f5     // Catch:{ all -> 0x036d }
            r6.<init>((X.C21665AUh) r4)     // Catch:{ all -> 0x036d }
            X.18s r5 = r2.A02     // Catch:{ all -> 0x036d }
            X.18t r4 = r5.A05     // Catch:{ all -> 0x036d }
            java.lang.String r2 = X.AnonymousClass6R2.A01(r1)     // Catch:{ all -> 0x036d }
            int r1 = r1.A00     // Catch:{ all -> 0x036d }
            X.6Aq r0 = new X.6Aq     // Catch:{ all -> 0x036d }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x036d }
            X.9Mt r3 = new X.9Mt     // Catch:{ all -> 0x036d }
            r22 = r5
            r23 = r5
            r20 = r3
            r21 = r5
            r24 = r4
            r25 = r0
            r20.<init>(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x036d }
            java.lang.Object r16 = X.C202579mF.A04     // Catch:{ 18E -> 0x0362, 18H -> 0x0365, Exception -> 0x0359 }
            monitor-enter(r16)     // Catch:{ 18E -> 0x0362, 18H -> 0x0365, Exception -> 0x0359 }
            X.18s r5 = r3.A00     // Catch:{ all -> 0x0356 }
            X.6Aq r4 = r3.A04     // Catch:{ all -> 0x0356 }
            X.6EZ r1 = X.AnonymousClass6R2.A00(r4)     // Catch:{ all -> 0x0356 }
            X.AUh r0 = r6.A00     // Catch:{ all -> 0x0356 }
            byte[] r2 = r0.A00     // Catch:{ all -> 0x0356 }
            X.C234318l.A01(r1, r2)     // Catch:{ all -> 0x0356 }
            if (r9 == 0) goto L_0x0346
            byte[] r1 = r9.A00()     // Catch:{ all -> 0x0356 }
            X.6Oq r0 = X.C131336Oq.A00()     // Catch:{ all -> 0x0356 }
            boolean r0 = r0.A01(r2, r1, r8)     // Catch:{ all -> 0x0356 }
            if (r0 == 0) goto L_0x034e
            X.18s r3 = r3.A02     // Catch:{ all -> 0x0356 }
            X.9eE r2 = r3.A01(r4)     // Catch:{ all -> 0x0356 }
            X.5rl r11 = X.C200529hY.A02()     // Catch:{ all -> 0x0356 }
            if (r10 != 0) goto L_0x0204
            X.Auy r8 = X.C22734Auy.A00     // Catch:{ all -> 0x0356 }
        L_0x01b2:
            boolean r0 = r8 instanceof X.C22733Aux     // Catch:{ all -> 0x0356 }
            if (r0 == 0) goto L_0x0201
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0356 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0356 }
            X.Aux r1 = new X.Aux     // Catch:{ all -> 0x0356 }
            r1.<init>(r0)     // Catch:{ all -> 0x0356 }
        L_0x01c2:
            X.9NM r13 = new X.9NM     // Catch:{ all -> 0x0356 }
            r13.<init>()     // Catch:{ all -> 0x0356 }
            r13.A04 = r11     // Catch:{ all -> 0x0356 }
            X.9Ij r0 = r5.A00()     // Catch:{ all -> 0x0356 }
            r13.A01 = r0     // Catch:{ all -> 0x0356 }
            r13.A00 = r6     // Catch:{ all -> 0x0356 }
            r13.A03 = r9     // Catch:{ all -> 0x0356 }
            r13.A02 = r9     // Catch:{ all -> 0x0356 }
            r13.A05 = r8     // Catch:{ all -> 0x0356 }
            boolean r0 = r2.A02     // Catch:{ all -> 0x0356 }
            if (r0 != 0) goto L_0x01de
            r2.A00()     // Catch:{ all -> 0x0356 }
        L_0x01de:
            X.9mV r10 = r2.A01     // Catch:{ all -> 0x0356 }
            X.9Ij r0 = r13.A01     // Catch:{ all -> 0x0356 }
            r15 = r0
            X.5rl r14 = r13.A04     // Catch:{ all -> 0x0356 }
            X.9f5 r12 = r13.A00     // Catch:{ all -> 0x0356 }
            X.AUh r9 = r13.A03     // Catch:{ all -> 0x0356 }
            X.AUh r8 = r13.A02     // Catch:{ all -> 0x0356 }
            X.AUM r0 = r13.A05     // Catch:{ all -> 0x0356 }
            X.9NN r13 = new X.9NN     // Catch:{ all -> 0x0356 }
            r20 = r13
            r21 = r12
            r22 = r15
            r23 = r9
            r24 = r8
            r25 = r14
            r26 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0356 }
            goto L_0x020a
        L_0x0201:
            X.Auy r1 = X.C22734Auy.A00     // Catch:{ all -> 0x0356 }
            goto L_0x01c2
        L_0x0204:
            X.Aux r8 = new X.Aux     // Catch:{ all -> 0x0356 }
            r8.<init>(r10)     // Catch:{ all -> 0x0356 }
            goto L_0x01b2
        L_0x020a:
            r10.A05()     // Catch:{ IOException -> 0x033f }
            X.9f5 r14 = r13.A00     // Catch:{ IOException -> 0x033f }
            r10.A09(r14)     // Catch:{ IOException -> 0x033f }
            X.9Ij r15 = r13.A01     // Catch:{ IOException -> 0x033f }
            X.9f5 r0 = r15.A00     // Catch:{ IOException -> 0x033f }
            r10.A08(r0)     // Catch:{ IOException -> 0x033f }
            X.5rl r12 = X.C200529hY.A02()     // Catch:{ IOException -> 0x033f }
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x033f }
            r8.<init>()     // Catch:{ IOException -> 0x033f }
            r0 = 32
            byte[] r9 = new byte[r0]     // Catch:{ IOException -> 0x033f }
            r0 = -1
            java.util.Arrays.fill(r9, r0)     // Catch:{ IOException -> 0x033f }
            r8.write(r9)     // Catch:{ IOException -> 0x033f }
            X.AUh r9 = r13.A03     // Catch:{ IOException -> 0x033f }
            X.5nT r0 = r15.A01     // Catch:{ IOException -> 0x033f }
            byte[] r0 = X.C200529hY.A03(r0, r9)     // Catch:{ IOException -> 0x033f }
            r8.write(r0)     // Catch:{ IOException -> 0x033f }
            X.AUh r15 = r14.A00     // Catch:{ IOException -> 0x033f }
            X.5rl r0 = r13.A04     // Catch:{ IOException -> 0x033f }
            X.5nT r14 = r0.A00     // Catch:{ IOException -> 0x033f }
            byte[] r0 = X.C200529hY.A03(r14, r15)     // Catch:{ IOException -> 0x033f }
            r8.write(r0)     // Catch:{ IOException -> 0x033f }
            byte[] r0 = X.C200529hY.A03(r14, r9)     // Catch:{ IOException -> 0x033f }
            r8.write(r0)     // Catch:{ IOException -> 0x033f }
            X.AUM r9 = r13.A05     // Catch:{ IOException -> 0x033f }
            boolean r0 = r9 instanceof X.C22733Aux     // Catch:{ IOException -> 0x033f }
            if (r0 == 0) goto L_0x025f
            java.lang.Object r0 = r9.A00()     // Catch:{ IOException -> 0x033f }
            X.AUh r0 = (X.C21665AUh) r0     // Catch:{ IOException -> 0x033f }
            byte[] r0 = X.C200529hY.A03(r14, r0)     // Catch:{ IOException -> 0x033f }
            r8.write(r0)     // Catch:{ IOException -> 0x033f }
        L_0x025f:
            byte[] r9 = r8.toByteArray()     // Catch:{ IOException -> 0x033f }
            X.Auw r14 = new X.Auw     // Catch:{ IOException -> 0x033f }
            r14.<init>()     // Catch:{ IOException -> 0x033f }
            java.lang.String r0 = "WhisperText"
            byte[] r8 = r0.getBytes()     // Catch:{ IOException -> 0x033f }
            r0 = 64
            byte[] r8 = r14.A02(r9, r8, r0)     // Catch:{ IOException -> 0x033f }
            r0 = 32
            byte[][] r9 = X.C200539hZ.A01(r8, r0, r0)     // Catch:{ IOException -> 0x033f }
            r0 = r9[r7]     // Catch:{ IOException -> 0x033f }
            X.9RA r8 = new X.9RA     // Catch:{ IOException -> 0x033f }
            r8.<init>(r14, r0)     // Catch:{ IOException -> 0x033f }
            r0 = 1
            r0 = r9[r0]     // Catch:{ IOException -> 0x033f }
            X.9iu r9 = new X.9iu     // Catch:{ IOException -> 0x033f }
            r9.<init>(r14, r0, r7)     // Catch:{ IOException -> 0x033f }
            X.AUh r0 = r13.A02     // Catch:{ IOException -> 0x033f }
            X.9U0 r8 = r8.A00(r0, r12)     // Catch:{ IOException -> 0x033f }
            r10.A0A(r0, r9)     // Catch:{ IOException -> 0x033f }
            java.lang.Object r0 = r8.A01     // Catch:{ IOException -> 0x033f }
            X.9iu r0 = (X.C201119iu) r0     // Catch:{ IOException -> 0x033f }
            r10.A0B(r12, r0)     // Catch:{ IOException -> 0x033f }
            java.lang.Object r0 = r8.A00     // Catch:{ IOException -> 0x033f }
            X.9RA r0 = (X.AnonymousClass9RA) r0     // Catch:{ IOException -> 0x033f }
            r10.A0C(r0)     // Catch:{ IOException -> 0x033f }
            X.9mV r10 = r2.A01     // Catch:{ all -> 0x0356 }
            X.AUh r8 = r11.A01     // Catch:{ all -> 0x0356 }
            X.8QU r0 = X.AnonymousClass8QU.DEFAULT_INSTANCE     // Catch:{ all -> 0x0356 }
            X.8NN r11 = r0.A0p()     // Catch:{ all -> 0x0356 }
            X.8Mq r11 = (X.C172128Mq) r11     // Catch:{ all -> 0x0356 }
            r11.A0S()     // Catch:{ all -> 0x0356 }
            X.8Hz r9 = r11.A00     // Catch:{ all -> 0x0356 }
            X.8QU r9 = (X.AnonymousClass8QU) r9     // Catch:{ all -> 0x0356 }
            int r0 = r9.bitField0_     // Catch:{ all -> 0x0356 }
            r0 = r0 | 2
            r9.bitField0_ = r0     // Catch:{ all -> 0x0356 }
            r0 = r17
            r9.signedPreKeyId_ = r0     // Catch:{ all -> 0x0356 }
            byte[] r9 = r8.A00()     // Catch:{ all -> 0x0356 }
            int r0 = r9.length     // Catch:{ all -> 0x0356 }
            X.8I5 r12 = X.C21674AUx.A01(r9, r7, r0)     // Catch:{ all -> 0x0356 }
            r11.A0S()     // Catch:{ all -> 0x0356 }
            X.8Hz r9 = r11.A00     // Catch:{ all -> 0x0356 }
            X.8QU r9 = (X.AnonymousClass8QU) r9     // Catch:{ all -> 0x0356 }
            int r0 = r9.bitField0_     // Catch:{ all -> 0x0356 }
            r0 = r0 | 4
            r9.bitField0_ = r0     // Catch:{ all -> 0x0356 }
            r9.baseKey_ = r12     // Catch:{ all -> 0x0356 }
            boolean r0 = r1 instanceof X.C22733Aux     // Catch:{ all -> 0x0356 }
            if (r0 == 0) goto L_0x02f2
            java.lang.Object r0 = r1.A00()     // Catch:{ all -> 0x0356 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0356 }
            int r9 = r0.intValue()     // Catch:{ all -> 0x0356 }
            r11.A0S()     // Catch:{ all -> 0x0356 }
            X.8Hz r1 = r11.A00     // Catch:{ all -> 0x0356 }
            X.8QU r1 = (X.AnonymousClass8QU) r1     // Catch:{ all -> 0x0356 }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x0356 }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ all -> 0x0356 }
            r1.preKeyId_ = r9     // Catch:{ all -> 0x0356 }
        L_0x02f2:
            X.8S2 r0 = r10.A00     // Catch:{ all -> 0x0356 }
            X.8NN r9 = r0.A0q()     // Catch:{ all -> 0x0356 }
            X.8N0 r9 = (X.AnonymousClass8N0) r9     // Catch:{ all -> 0x0356 }
            X.8Hz r0 = r11.A0R()     // Catch:{ all -> 0x0356 }
            X.8QU r0 = (X.AnonymousClass8QU) r0     // Catch:{ all -> 0x0356 }
            r9.A0S()     // Catch:{ all -> 0x0356 }
            X.8Hz r1 = r9.A00     // Catch:{ all -> 0x0356 }
            X.8S2 r1 = (X.AnonymousClass8S2) r1     // Catch:{ all -> 0x0356 }
            r0.getClass()     // Catch:{ all -> 0x0356 }
            r1.pendingPreKey_ = r0     // Catch:{ all -> 0x0356 }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x0356 }
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0     // Catch:{ all -> 0x0356 }
            X.8Hz r0 = r9.A0R()     // Catch:{ all -> 0x0356 }
            X.8S2 r0 = (X.AnonymousClass8S2) r0     // Catch:{ all -> 0x0356 }
            r10.A00 = r0     // Catch:{ all -> 0x0356 }
            X.9mV r1 = r2.A01     // Catch:{ all -> 0x0356 }
            X.189 r0 = r5.A06     // Catch:{ all -> 0x0356 }
            X.18l r0 = r0.A07     // Catch:{ all -> 0x0356 }
            int r0 = r0.A03()     // Catch:{ all -> 0x0356 }
            r1.A06(r0)     // Catch:{ all -> 0x0356 }
            X.9mV r1 = r2.A01     // Catch:{ all -> 0x0356 }
            r0 = r18
            r1.A07(r0)     // Catch:{ all -> 0x0356 }
            X.9mV r1 = r2.A01     // Catch:{ all -> 0x0356 }
            byte[] r0 = r8.A00()     // Catch:{ all -> 0x0356 }
            r1.A0D(r0)     // Catch:{ all -> 0x0356 }
            r3.A03(r4, r2)     // Catch:{ all -> 0x0356 }
            r5.A02(r6, r4)     // Catch:{ all -> 0x0356 }
            monitor-exit(r16)     // Catch:{ all -> 0x0356 }
            goto L_0x0367
        L_0x033f:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0356 }
            r0.<init>(r1)     // Catch:{ all -> 0x0356 }
            throw r0     // Catch:{ all -> 0x0356 }
        L_0x0346:
            java.lang.String r0 = "No signed prekey!"
            X.18E r1 = new X.18E     // Catch:{ all -> 0x0356 }
            r1.<init>(r0)     // Catch:{ all -> 0x0356 }
            goto L_0x0355
        L_0x034e:
            java.lang.String r0 = "Invalid signature on device key!"
            X.18E r1 = new X.18E     // Catch:{ all -> 0x0356 }
            r1.<init>(r0)     // Catch:{ all -> 0x0356 }
        L_0x0355:
            throw r1     // Catch:{ all -> 0x0356 }
        L_0x0356:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0356 }
            throw r0     // Catch:{ 18E -> 0x0362, 18H -> 0x0365, Exception -> 0x0359 }
        L_0x0359:
            r1 = move-exception
            java.lang.String r0 = "axolotl"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x036d }
            r7 = -1000(0xfffffffffffffc18, float:NaN)
            goto L_0x0367
        L_0x0362:
            r7 = -1002(0xfffffffffffffc16, float:NaN)
            goto L_0x0367
        L_0x0365:
            r7 = -1010(0xfffffffffffffc0e, float:NaN)
        L_0x0367:
            if (r19 == 0) goto L_0x036c
            r19.close()
        L_0x036c:
            return r7
        L_0x036d:
            r1 = move-exception
            if (r19 == 0) goto L_0x0378
            r19.close()     // Catch:{ all -> 0x0374 }
            throw r1
        L_0x0374:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0378:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass189.A05(X.6EZ, X.5tq, X.5tq, byte[], byte[], byte):int");
    }

    public C131106Nt A06(C22934Ayk ayk, AnonymousClass6EZ r12, byte[] bArr) {
        C131106Nt r0;
        B0M b0m;
        byte[] bArr2;
        AnonymousClass18I r02 = this.A0K;
        AnonymousClass79X A002 = AnonymousClass18I.A00(r12, r02);
        AnonymousClass18I.A03(A002, r02);
        try {
            C22934Ayk ayk2 = ayk;
            byte[] bArr3 = bArr;
            if (C20800yB.A01(C21000yV.A02, this.A0N, 182)) {
                C000100b r1 = this.A01.A04;
                C192039Fl r03 = new C192039Fl((NativeHolder) JniBridge.jvidispatchOIOOOO(2, (long) r12.A00, AnonymousClass6R2.A01(r12), ayk2, (NativeHolder) ((JniBridge) r1).wajContext.get(), bArr3));
                JniBridge.getInstance();
                NativeHolder nativeHolder = r03.A00;
                JniBridge.getInstance();
                r0 = new C131106Nt((byte[]) JniBridge.jvidispatchOIO(0, (long) 55, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 56, nativeHolder));
            } else {
                C235218u r04 = this.A00;
                C202579mF A052 = r04.A05(r12);
                if (ayk != null) {
                    try {
                        Objects.requireNonNull(ayk);
                        b0m = new C21801Aab(ayk);
                    } catch (AnonymousClass18B e) {
                        r0 = C235218u.A00(e, (byte[]) null, -1005);
                    } catch (AnonymousClass18C e2) {
                        r0 = C235218u.A00(e2, (byte[]) null, -1001);
                    } catch (AnonymousClass18A e3) {
                        r0 = C235218u.A00(e3, (byte[]) null, -1007);
                    } catch (AnonymousClass18D e4) {
                        r0 = C235218u.A00(e4, (byte[]) null, -1008);
                    } catch (Exception e5) {
                        Log.w("axolotl", e5);
                        r0 = C235218u.A00(e5, (byte[]) null, -1000);
                    }
                } else {
                    b0m = new C21800Aaa();
                }
                if (r04.A04.A00()) {
                    C21806Aag aag = new C21806Aag(bArr);
                    synchronized (C202579mF.A04) {
                        bArr2 = A052.A05(b0m, aag);
                    }
                } else {
                    bArr2 = A052.A05(b0m, new C21806Aag(bArr));
                }
                r0 = C235218u.A00((Exception) null, bArr2, 0);
            }
            if (A002 != null) {
                A002.close();
            }
            return r0;
        } catch (Throwable th) {
            if (A002 != null) {
                try {
                    A002.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public C131106Nt A07(C22934Ayk ayk, AnonymousClass6EZ r13, byte[] bArr) {
        C131106Nt r1;
        B0M b0m;
        byte[] bArr2;
        AnonymousClass18I r0 = this.A0K;
        AnonymousClass79X A002 = AnonymousClass18I.A00(r13, r0);
        AnonymousClass18I.A03(A002, r0);
        try {
            byte[] bArr3 = bArr;
            C21804Aae aae = new C21804Aae(bArr);
            byte[] A062 = A0D(r13).A01.A00.remoteIdentityPublic_.A06();
            if (A062.length != 0 && !Arrays.equals(A062, aae.A03.A00.A00())) {
                A0E(r13);
            }
            C22934Ayk ayk2 = ayk;
            if (C20800yB.A01(C21000yV.A02, this.A0N, 182)) {
                C000100b r12 = this.A01.A04;
                C192039Fl r02 = new C192039Fl((NativeHolder) JniBridge.jvidispatchOIOOOO(3, (long) r13.A00, AnonymousClass6R2.A01(r13), ayk2, (NativeHolder) ((JniBridge) r12).wajContext.get(), bArr3));
                JniBridge.getInstance();
                NativeHolder nativeHolder = r02.A00;
                JniBridge.getInstance();
                r1 = new C131106Nt((byte[]) JniBridge.jvidispatchOIO(0, (long) 55, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 56, nativeHolder));
            } else {
                C235218u r03 = this.A00;
                C202579mF A052 = r03.A05(r13);
                if (ayk != null) {
                    try {
                        Objects.requireNonNull(ayk);
                        b0m = new C21801Aab(ayk);
                    } catch (AnonymousClass18C e) {
                        r1 = C235218u.A00(e, (byte[]) null, -1001);
                    } catch (AnonymousClass18B e2) {
                        r1 = C235218u.A00(e2, (byte[]) null, -1005);
                    } catch (AnonymousClass18F e3) {
                        r1 = C235218u.A00(e3, (byte[]) null, -1003);
                    } catch (AnonymousClass18E e4) {
                        r1 = C235218u.A00(e4, (byte[]) null, -1002);
                    } catch (AnonymousClass18H e5) {
                        r1 = C235218u.A00(e5, (byte[]) null, -1010);
                    } catch (AnonymousClass18A e6) {
                        r1 = C235218u.A00(e6, (byte[]) null, -1007);
                    } catch (Exception e7) {
                        Log.w("axolotl", e7);
                        r1 = C235218u.A00(e7, (byte[]) null, -1000);
                    }
                } else {
                    b0m = new C21800Aaa();
                }
                if (r03.A04.A00()) {
                    synchronized (C202579mF.A04) {
                        bArr2 = A052.A04(b0m, aae);
                    }
                } else {
                    bArr2 = A052.A04(b0m, aae);
                }
                r1 = C235218u.A00((Exception) null, bArr2, 0);
            }
        } catch (AnonymousClass18B e8) {
            Log.w("axolotl", e8);
            C131106Nt r04 = new C131106Nt(e8.getMessage(), -1005);
            if (A002 != null) {
                A002.close();
            }
            return r04;
        } catch (AnonymousClass18G e9) {
            Log.w("axolotl", e9);
            r1 = new C131106Nt((byte[]) null, -1006);
        } catch (Throwable th) {
            if (A002 != null) {
                try {
                    A002.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
        if (A002 != null) {
            A002.close();
        }
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a3, code lost:
        r0 = r1.senderSigningKey_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a5, code lost:
        if (r0 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a7, code lost:
        r0 = X.C172768Pc.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a9, code lost:
        r5.A00(X.C200529hY.A01(r0.public_.A06()));
        r4 = r5.A00;
        r1 = new X.C202549mA((java.util.List) r6.A00.senderChainKeys_);
        r3 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c3, code lost:
        if (r3 > r4) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c5, code lost:
        if (r3 >= r4) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c7, code lost:
        r1 = r1.A02(r4 - r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cc, code lost:
        r6.A00(r1.A02(1));
        r4 = r1.A03();
        r1 = new X.AnonymousClass9M5(r1.A00, X.C202549mA.A01(r4[r4.length - 1], (byte) 1));
        r0 = r1.A02;
        r7 = r1.A01;
        r6 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r5 = new javax.crypto.spec.IvParameterSpec(r0);
        r4 = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
        r4.init(2, new javax.crypto.spec.SecretKeySpec(r7, "AES"), r5);
        r1 = r4.doFinal(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r10.BJg(r1);
        r11.A04(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011d, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Received message with old counter: ");
        r1.append(r3);
        r1.append(" , ");
        r1.append(r4);
        r1 = new X.AnonymousClass18C(r1.toString());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C131106Nt A08(X.C22934Ayk r15, X.AnonymousClass6EU r16, byte[] r17) {
        /*
            r14 = this;
            X.18I r0 = r14.A0K
            r5 = r16
            X.79X r13 = X.AnonymousClass18I.A01(r0, r5)
            r13.lock()
            X.0yC r2 = r14.A0N     // Catch:{ all -> 0x01ab }
            r1 = 188(0xbc, float:2.63E-43)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x01ab }
            boolean r0 = X.C20800yB.A01(r0, r2, r1)     // Catch:{ all -> 0x01ab }
            r3 = r17
            if (r0 == 0) goto L_0x0064
            X.18v r0 = r14.A01     // Catch:{ all -> 0x01ab }
            X.00b r4 = r0.A04     // Catch:{ all -> 0x01ab }
            java.lang.String r2 = r5.A01     // Catch:{ all -> 0x01ab }
            X.6EZ r0 = r5.A00     // Catch:{ all -> 0x01ab }
            java.lang.String r8 = X.AnonymousClass6R2.A01(r0)     // Catch:{ all -> 0x01ab }
            int r0 = r0.A00     // Catch:{ all -> 0x01ab }
            com.whatsapp.wamsys.JniBridge r4 = (com.whatsapp.wamsys.JniBridge) r4     // Catch:{ all -> 0x01ab }
            long r5 = (long) r0     // Catch:{ all -> 0x01ab }
            java.util.concurrent.atomic.AtomicReference r0 = r4.wajContext     // Catch:{ all -> 0x01ab }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01ab }
            com.facebook.simplejni.NativeHolder r0 = (com.facebook.simplejni.NativeHolder) r0     // Catch:{ all -> 0x01ab }
            r4 = 1
            r7 = r2
            r9 = r15
            r10 = r0
            r11 = r3
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOOOOO(r4, r5, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x01ab }
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1     // Catch:{ all -> 0x01ab }
            X.9Fl r0 = new X.9Fl     // Catch:{ all -> 0x01ab }
            r0.<init>(r1)     // Catch:{ all -> 0x01ab }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x01ab }
            com.facebook.simplejni.NativeHolder r3 = r0.A00     // Catch:{ all -> 0x01ab }
            r0 = 55
            long r1 = (long) r0     // Catch:{ all -> 0x01ab }
            r0 = 0
            java.lang.Object r4 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r0, r1, r3)     // Catch:{ all -> 0x01ab }
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x01ab }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x01ab }
            r0 = 56
            long r1 = (long) r0     // Catch:{ all -> 0x01ab }
            r0 = 1
            long r2 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r0, r1, r3)     // Catch:{ all -> 0x01ab }
            int r1 = (int) r2     // Catch:{ all -> 0x01ab }
            X.6Nt r0 = new X.6Nt     // Catch:{ all -> 0x01ab }
            r0.<init>((byte[]) r4, (int) r1)     // Catch:{ all -> 0x01ab }
            goto L_0x01a7
        L_0x0064:
            X.18u r0 = r14.A00     // Catch:{ all -> 0x01ab }
            X.18s r0 = r0.A02     // Catch:{ all -> 0x01ab }
            X.18n r11 = r0.A01     // Catch:{ all -> 0x01ab }
            X.66a r9 = X.AnonymousClass6R2.A02(r5)     // Catch:{ all -> 0x01ab }
            r2 = 0
            java.util.Objects.requireNonNull(r15)     // Catch:{ 18A -> 0x01a0, 18B -> 0x0198, 18C -> 0x0190, 18D -> 0x0188, Exception -> 0x017b }
            X.Aab r10 = new X.Aab     // Catch:{ 18A -> 0x01a0, 18B -> 0x0198, 18C -> 0x0190, 18D -> 0x0188, Exception -> 0x017b }
            r10.<init>(r15)     // Catch:{ 18A -> 0x01a0, 18B -> 0x0198, 18C -> 0x0190, 18D -> 0x0188, Exception -> 0x017b }
            java.lang.Object r12 = X.AnonymousClass9A8.A00     // Catch:{ 18A -> 0x01a0, 18B -> 0x0198, 18C -> 0x0190, 18D -> 0x0188, Exception -> 0x017b }
            monitor-enter(r12)     // Catch:{ 18A -> 0x01a0, 18B -> 0x0198, 18C -> 0x0190, 18D -> 0x0188, Exception -> 0x017b }
            X.9dh r8 = r11.A02(r9)     // Catch:{ 18E | 18F -> 0x0171 }
            java.util.LinkedList r1 = r8.A00     // Catch:{ 18E | 18F -> 0x0171 }
            boolean r0 = r1.isEmpty()     // Catch:{ 18E | 18F -> 0x0171 }
            if (r0 != 0) goto L_0x0153
            X.Aaf r5 = new X.Aaf     // Catch:{ 18E | 18F -> 0x0171 }
            r5.<init>(r3)     // Catch:{ 18E | 18F -> 0x0171 }
            int r4 = r5.A01     // Catch:{ 18E | 18F -> 0x0171 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ 18E | 18F -> 0x0171 }
        L_0x0091:
            boolean r0 = r3.hasNext()     // Catch:{ 18E | 18F -> 0x0171 }
            if (r0 == 0) goto L_0x013c
            java.lang.Object r6 = r3.next()     // Catch:{ 18E | 18F -> 0x0171 }
            X.9di r6 = (X.C198529di) r6     // Catch:{ 18E | 18F -> 0x0171 }
            X.8QS r1 = r6.A00     // Catch:{ 18E | 18F -> 0x0171 }
            int r0 = r1.senderKeyId_     // Catch:{ 18E | 18F -> 0x0171 }
            if (r0 != r4) goto L_0x0091
            X.8Pc r0 = r1.senderSigningKey_     // Catch:{ 18E | 18F -> 0x0171 }
            if (r0 != 0) goto L_0x00a9
            X.8Pc r0 = X.C172768Pc.DEFAULT_INSTANCE     // Catch:{ 18E | 18F -> 0x0171 }
        L_0x00a9:
            X.AUx r0 = r0.public_     // Catch:{ 18E | 18F -> 0x0171 }
            byte[] r0 = r0.A06()     // Catch:{ 18E | 18F -> 0x0171 }
            X.AUh r0 = X.C200529hY.A01(r0)     // Catch:{ 18E | 18F -> 0x0171 }
            r5.A00(r0)     // Catch:{ 18E | 18F -> 0x0171 }
            int r4 = r5.A00     // Catch:{ 18E | 18F -> 0x0171 }
            X.8QS r0 = r6.A00     // Catch:{ 18E | 18F -> 0x0171 }
            X.B6c r0 = r0.senderChainKeys_     // Catch:{ 18E | 18F -> 0x0171 }
            X.9mA r1 = new X.9mA     // Catch:{ 18E | 18F -> 0x0171 }
            r1.<init>((java.util.List) r0)     // Catch:{ 18E | 18F -> 0x0171 }
            int r3 = r1.A00     // Catch:{ 18E | 18F -> 0x0171 }
            if (r3 > r4) goto L_0x011d
            if (r3 >= r4) goto L_0x00cc
            int r4 = r4 - r3
            X.9mA r1 = r1.A02(r4)     // Catch:{ 18E | 18F -> 0x0171 }
        L_0x00cc:
            r0 = 1
            X.9mA r0 = r1.A02(r0)     // Catch:{ 18E | 18F -> 0x0171 }
            r6.A00(r0)     // Catch:{ 18E | 18F -> 0x0171 }
            byte[][] r4 = r1.A03()     // Catch:{ 18E | 18F -> 0x0171 }
            int r3 = r1.A00     // Catch:{ 18E | 18F -> 0x0171 }
            int r0 = r4.length     // Catch:{ 18E | 18F -> 0x0171 }
            r1 = 1
            int r0 = r0 - r1
            r0 = r4[r0]     // Catch:{ 18E | 18F -> 0x0171 }
            byte[] r0 = X.C202549mA.A01(r0, r1)     // Catch:{ 18E | 18F -> 0x0171 }
            X.9M5 r1 = new X.9M5     // Catch:{ 18E | 18F -> 0x0171 }
            r1.<init>(r3, r0)     // Catch:{ 18E | 18F -> 0x0171 }
            byte[] r0 = r1.A02     // Catch:{ 18E | 18F -> 0x0171 }
            byte[] r7 = r1.A01     // Catch:{ 18E | 18F -> 0x0171 }
            byte[] r6 = r5.A02     // Catch:{ 18E | 18F -> 0x0171 }
            javax.crypto.spec.IvParameterSpec r5 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x016a, BadPaddingException | IllegalBlockSizeException -> 0x0116, 18E | 18F -> 0x0171 }
            r5.<init>(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x016a, BadPaddingException | IllegalBlockSizeException -> 0x0116, 18E | 18F -> 0x0171 }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x016a, BadPaddingException | IllegalBlockSizeException -> 0x0116, 18E | 18F -> 0x0171 }
            r3 = 2
            java.lang.String r1 = "AES"
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x016a, BadPaddingException | IllegalBlockSizeException -> 0x0116, 18E | 18F -> 0x0171 }
            r0.<init>(r7, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x016a, BadPaddingException | IllegalBlockSizeException -> 0x0116, 18E | 18F -> 0x0171 }
            r4.init(r3, r0, r5)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x016a, BadPaddingException | IllegalBlockSizeException -> 0x0116, 18E | 18F -> 0x0171 }
            byte[] r1 = r4.doFinal(r6)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x016a, BadPaddingException | IllegalBlockSizeException -> 0x0116, 18E | 18F -> 0x0171 }
            r10.BJg(r1)     // Catch:{ 18E | 18F -> 0x0171 }
            r11.A04(r9, r8)     // Catch:{ 18E | 18F -> 0x0171 }
            monitor-exit(r12)     // Catch:{ all -> 0x0178 }
            r0 = 0
            X.6Nt r0 = X.C235218u.A00(r2, r1, r0)     // Catch:{ 18A -> 0x01a0, 18B -> 0x0198, 18C -> 0x0190, 18D -> 0x0188, Exception -> 0x017b }
            goto L_0x01a7
        L_0x0116:
            r0 = move-exception
            X.18B r1 = new X.18B     // Catch:{ 18E | 18F -> 0x0171 }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ 18E | 18F -> 0x0171 }
            goto L_0x0170
        L_0x011d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 18E | 18F -> 0x0171 }
            r1.<init>()     // Catch:{ 18E | 18F -> 0x0171 }
            java.lang.String r0 = "Received message with old counter: "
            r1.append(r0)     // Catch:{ 18E | 18F -> 0x0171 }
            r1.append(r3)     // Catch:{ 18E | 18F -> 0x0171 }
            java.lang.String r0 = " , "
            r1.append(r0)     // Catch:{ 18E | 18F -> 0x0171 }
            r1.append(r4)     // Catch:{ 18E | 18F -> 0x0171 }
            java.lang.String r0 = r1.toString()     // Catch:{ 18E | 18F -> 0x0171 }
            X.18C r1 = new X.18C     // Catch:{ 18E | 18F -> 0x0171 }
            r1.<init>(r0)     // Catch:{ 18E | 18F -> 0x0171 }
            goto L_0x0170
        L_0x013c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 18E | 18F -> 0x0171 }
            r1.<init>()     // Catch:{ 18E | 18F -> 0x0171 }
            java.lang.String r0 = "No keys for: "
            r1.append(r0)     // Catch:{ 18E | 18F -> 0x0171 }
            r1.append(r4)     // Catch:{ 18E | 18F -> 0x0171 }
            java.lang.String r0 = r1.toString()     // Catch:{ 18E | 18F -> 0x0171 }
            X.18F r1 = new X.18F     // Catch:{ 18E | 18F -> 0x0171 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 18E | 18F -> 0x0171 }
            goto L_0x0170
        L_0x0153:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 18E | 18F -> 0x0171 }
            r1.<init>()     // Catch:{ 18E | 18F -> 0x0171 }
            java.lang.String r0 = "No sender key for: "
            r1.append(r0)     // Catch:{ 18E | 18F -> 0x0171 }
            r1.append(r9)     // Catch:{ 18E | 18F -> 0x0171 }
            java.lang.String r0 = r1.toString()     // Catch:{ 18E | 18F -> 0x0171 }
            X.18D r1 = new X.18D     // Catch:{ 18E | 18F -> 0x0171 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 18E | 18F -> 0x0171 }
            goto L_0x0170
        L_0x016a:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ 18E | 18F -> 0x0171 }
            r1.<init>(r0)     // Catch:{ 18E | 18F -> 0x0171 }
        L_0x0170:
            throw r1     // Catch:{ 18E | 18F -> 0x0171 }
        L_0x0171:
            r1 = move-exception
            X.18B r0 = new X.18B     // Catch:{ all -> 0x0178 }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ all -> 0x0178 }
            throw r0     // Catch:{ all -> 0x0178 }
        L_0x0178:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0178 }
            throw r0     // Catch:{ 18A -> 0x01a0, 18B -> 0x0198, 18C -> 0x0190, 18D -> 0x0188, Exception -> 0x017b }
        L_0x017b:
            r1 = move-exception
            java.lang.String r0 = "axolotl"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x01ab }
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            X.6Nt r0 = X.C235218u.A00(r1, r2, r0)     // Catch:{ all -> 0x01ab }
            goto L_0x01a7
        L_0x0188:
            r1 = move-exception
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            X.6Nt r0 = X.C235218u.A00(r1, r2, r0)     // Catch:{ all -> 0x01ab }
            goto L_0x01a7
        L_0x0190:
            r1 = move-exception
            r0 = -1001(0xfffffffffffffc17, float:NaN)
            X.6Nt r0 = X.C235218u.A00(r1, r2, r0)     // Catch:{ all -> 0x01ab }
            goto L_0x01a7
        L_0x0198:
            r1 = move-exception
            r0 = -1005(0xfffffffffffffc13, float:NaN)
            X.6Nt r0 = X.C235218u.A00(r1, r2, r0)     // Catch:{ all -> 0x01ab }
            goto L_0x01a7
        L_0x01a0:
            r1 = move-exception
            r0 = -1007(0xfffffffffffffc11, float:NaN)
            X.6Nt r0 = X.C235218u.A00(r1, r2, r0)     // Catch:{ all -> 0x01ab }
        L_0x01a7:
            r13.close()
            return r0
        L_0x01ab:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x01b0 }
            throw r1
        L_0x01b0:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass189.A08(X.Ayk, X.6EU, byte[]):X.6Nt");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e7 A[Catch:{ all -> 0x00f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f5 A[Catch:{ all -> 0x00f8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass9K2 A09(X.AnonymousClass6EZ r11, byte[] r12) {
        /*
            r10 = this;
            X.18I r0 = r10.A0K
            X.79X r2 = X.AnonymousClass18I.A00(r11, r0)
            X.AnonymousClass18I.A03(r2, r0)
            X.0yC r1 = r10.A0N     // Catch:{ all -> 0x014b }
            X.AnonymousClass6UT.A01(r1)     // Catch:{ all -> 0x014b }
            r0 = 187(0xbb, float:2.62E-43)
            X.0yV r7 = X.C21000yV.A02     // Catch:{ all -> 0x014b }
            boolean r0 = X.C20800yB.A01(r7, r1, r0)     // Catch:{ all -> 0x014b }
            r8 = r12
            if (r0 == 0) goto L_0x0068
            X.18v r0 = r10.A01     // Catch:{ all -> 0x014b }
            X.00b r1 = r0.A04     // Catch:{ all -> 0x014b }
            java.lang.String r6 = X.AnonymousClass6R2.A01(r11)     // Catch:{ all -> 0x014b }
            int r0 = r11.A00     // Catch:{ all -> 0x014b }
            com.whatsapp.wamsys.JniBridge r1 = (com.whatsapp.wamsys.JniBridge) r1     // Catch:{ all -> 0x014b }
            long r4 = (long) r0     // Catch:{ all -> 0x014b }
            java.util.concurrent.atomic.AtomicReference r0 = r1.wajContext     // Catch:{ all -> 0x014b }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x014b }
            com.facebook.simplejni.NativeHolder r7 = (com.facebook.simplejni.NativeHolder) r7     // Catch:{ all -> 0x014b }
            r3 = 0
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOOO(r3, r4, r6, r7, r8)     // Catch:{ all -> 0x014b }
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1     // Catch:{ all -> 0x014b }
            X.9Fm r0 = new X.9Fm     // Catch:{ all -> 0x014b }
            r0.<init>(r1)     // Catch:{ all -> 0x014b }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x014b }
            com.facebook.simplejni.NativeHolder r6 = r0.A00     // Catch:{ all -> 0x014b }
            r0 = 52
            long r3 = (long) r0     // Catch:{ all -> 0x014b }
            r0 = 0
            java.lang.Object r5 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r0, r3, r6)     // Catch:{ all -> 0x014b }
            byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x014b }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x014b }
            r0 = 53
            long r3 = (long) r0     // Catch:{ all -> 0x014b }
            r0 = 1
            long r3 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r0, r3, r6)     // Catch:{ all -> 0x014b }
            int r1 = (int) r3     // Catch:{ all -> 0x014b }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x014b }
            r0 = 54
            long r3 = (long) r0     // Catch:{ all -> 0x014b }
            r0 = 1
            long r3 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r0, r3, r6)     // Catch:{ all -> 0x014b }
            int r0 = (int) r3     // Catch:{ all -> 0x014b }
            X.9K2 r3 = new X.9K2     // Catch:{ all -> 0x014b }
            r3.<init>(r5, r1, r0)     // Catch:{ all -> 0x014b }
            goto L_0x0144
        L_0x0068:
            X.18u r4 = r10.A00     // Catch:{ all -> 0x014b }
            X.9mF r6 = r4.A05(r11)     // Catch:{ all -> 0x014b }
            byte[] r3 = X.C235218u.A03(r12)     // Catch:{ all -> 0x014b }
            r5 = 0
            X.187 r0 = r4.A04     // Catch:{ IllegalArgumentException -> 0x010e }
            boolean r0 = r0.A00()     // Catch:{ IllegalArgumentException -> 0x010e }
            if (r0 == 0) goto L_0x0087
            java.lang.Object r1 = X.C202579mF.A04     // Catch:{ IllegalArgumentException -> 0x010e }
            monitor-enter(r1)     // Catch:{ IllegalArgumentException -> 0x010e }
            X.B23 r6 = r6.A03(r3)     // Catch:{ all -> 0x0084 }
            monitor-exit(r1)     // Catch:{ all -> 0x0084 }
            goto L_0x008b
        L_0x0084:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0084 }
            goto L_0x00fa
        L_0x0087:
            X.B23 r6 = r6.A03(r3)     // Catch:{ IllegalArgumentException -> 0x010e }
        L_0x008b:
            X.0yC r1 = r4.A05     // Catch:{ IllegalArgumentException -> 0x010e }
            r0 = 3391(0xd3f, float:4.752E-42)
            boolean r0 = X.C20800yB.A01(r7, r1, r0)     // Catch:{ IllegalArgumentException -> 0x010e }
            if (r0 == 0) goto L_0x00fb
            android.util.LruCache r7 = r4.A00     // Catch:{ IllegalArgumentException -> 0x010e }
            monitor-enter(r7)     // Catch:{ IllegalArgumentException -> 0x010e }
            java.lang.Object r3 = r7.get(r11)     // Catch:{ all -> 0x00f8 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x00f8 }
            boolean r9 = r6 instanceof X.C21804Aae     // Catch:{ all -> 0x00f8 }
            if (r9 == 0) goto L_0x00aa
            r0 = r6
            X.Aae r0 = (X.C21804Aae) r0     // Catch:{ all -> 0x00f8 }
            X.Aag r0 = r0.A05     // Catch:{ all -> 0x00f8 }
        L_0x00a7:
            int r8 = r0.A00     // Catch:{ all -> 0x00f8 }
            goto L_0x00b3
        L_0x00aa:
            boolean r0 = r6 instanceof X.C21806Aag     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00b2
            r0 = r6
            X.Aag r0 = (X.C21806Aag) r0     // Catch:{ all -> 0x00f8 }
            goto L_0x00a7
        L_0x00b2:
            r8 = 0
        L_0x00b3:
            if (r3 == 0) goto L_0x00ec
            if (r8 <= 0) goto L_0x00ec
            int r0 = r3.intValue()     // Catch:{ all -> 0x00f8 }
            if (r8 > r0) goto L_0x00ec
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f8 }
            r1.<init>()     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "Invalid counter for "
            r1.append(r0)     // Catch:{ all -> 0x00f8 }
            r1.append(r11)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "; current = "
            r1.append(r0)     // Catch:{ all -> 0x00f8 }
            r1.append(r3)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = " new = "
            r1.append(r0)     // Catch:{ all -> 0x00f8 }
            r1.append(r8)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00f8 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00f8 }
            X.0wN r3 = r4.A01     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = "invalid-signal-counter-used"
            if (r9 == 0) goto L_0x00f5
            java.lang.String r0 = "pkmsg"
        L_0x00e9:
            r3.A0E(r1, r0, r5)     // Catch:{ all -> 0x00f8 }
        L_0x00ec:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00f8 }
            r7.put(r11, r0)     // Catch:{ all -> 0x00f8 }
            monitor-exit(r7)     // Catch:{ all -> 0x00f8 }
            goto L_0x00fb
        L_0x00f5:
            java.lang.String r0 = "msg"
            goto L_0x00e9
        L_0x00f8:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00f8 }
        L_0x00fa:
            throw r0     // Catch:{ IllegalArgumentException -> 0x010e }
        L_0x00fb:
            int r3 = r6.getType()     // Catch:{ all -> 0x014b }
            r0 = 2
            r1 = 1
            if (r3 == r0) goto L_0x0104
            r1 = 2
        L_0x0104:
            byte[] r0 = r6.Bq0()     // Catch:{ all -> 0x014b }
            X.9K2 r3 = new X.9K2     // Catch:{ all -> 0x014b }
            r3.<init>(r0, r1, r5)     // Catch:{ all -> 0x014b }
            goto L_0x0144
        L_0x010e:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x014b }
            r1.<init>()     // Catch:{ all -> 0x014b }
            java.lang.String r0 = "SignalCoordinatorDefault/encryptForIndividual/error encrypting for "
            r1.append(r0)     // Catch:{ all -> 0x014b }
            r1.append(r11)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x014b }
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x014b }
            X.18s r4 = r4.A02     // Catch:{ all -> 0x014b }
            java.lang.String r3 = X.AnonymousClass6R2.A01(r11)     // Catch:{ all -> 0x014b }
            int r1 = r11.A00     // Catch:{ all -> 0x014b }
            X.6Aq r0 = new X.6Aq     // Catch:{ all -> 0x014b }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x014b }
            X.189 r1 = r4.A06     // Catch:{ all -> 0x014b }
            X.6EZ r0 = X.AnonymousClass6R2.A00(r0)     // Catch:{ all -> 0x014b }
            boolean r0 = r1.A0Z(r0)     // Catch:{ all -> 0x014b }
            if (r0 != 0) goto L_0x014a
            r1 = 0
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            X.9K2 r3 = new X.9K2     // Catch:{ all -> 0x014b }
            r3.<init>(r1, r5, r0)     // Catch:{ all -> 0x014b }
        L_0x0144:
            if (r2 == 0) goto L_0x0149
            r2.close()
        L_0x0149:
            return r3
        L_0x014a:
            throw r6     // Catch:{ all -> 0x014b }
        L_0x014b:
            r1 = move-exception
            if (r2 == 0) goto L_0x0156
            r2.close()     // Catch:{ all -> 0x0152 }
            throw r1
        L_0x0152:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0156:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass189.A09(X.6EZ, byte[]):X.9K2");
    }

    public AnonymousClass9K2 A0A(AnonymousClass6EU r17, byte[] bArr) {
        AnonymousClass9K2 r2;
        byte[] bArr2;
        AnonymousClass6EU r4 = r17;
        AnonymousClass79X A012 = AnonymousClass18I.A01(this.A0K, r4);
        A012.lock();
        try {
            C20810yC r22 = this.A0N;
            AnonymousClass6UT.A01(r22);
            byte[] bArr3 = bArr;
            if (C20800yB.A01(C21000yV.A02, r22, 189)) {
                C000100b r1 = this.A01.A04;
                String str = r4.A01;
                AnonymousClass6EZ r0 = r4.A00;
                C192049Fm r02 = new C192049Fm((NativeHolder) JniBridge.jvidispatchOIOOOO(1, (long) r0.A00, str, AnonymousClass6R2.A01(r0), (NativeHolder) ((JniBridge) r1).wajContext.get(), bArr3));
                JniBridge.getInstance();
                NativeHolder nativeHolder = r02.A00;
                JniBridge.getInstance();
                JniBridge.getInstance();
                r2 = new AnonymousClass9K2((byte[]) JniBridge.jvidispatchOIO(0, (long) 52, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 53, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 54, nativeHolder));
            } else {
                C234518n r8 = this.A00.A02.A01;
                new AnonymousClass9Q7(r8).A00(AnonymousClass6R2.A02(r4));
                C1268866a A022 = AnonymousClass6R2.A02(r4);
                byte[] A032 = C235218u.A03(bArr3);
                try {
                    synchronized (AnonymousClass9A8.A00) {
                        try {
                            C198519dh A023 = r8.A02(A022);
                            C198529di A002 = A023.A00();
                            C202549mA r03 = new C202549mA((List) A002.A00.senderChainKeys_);
                            byte[][] A033 = r03.A03();
                            AnonymousClass9M5 r12 = new AnonymousClass9M5(r03.A00, C202549mA.A01(A033[A033.length - 1], (byte) 1));
                            byte[] bArr4 = r12.A02;
                            byte[] bArr5 = r12.A01;
                            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
                            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                            instance.init(1, new SecretKeySpec(bArr5, "AES"), ivParameterSpec);
                            byte[] doFinal = instance.doFinal(A032);
                            AnonymousClass8QS r04 = A002.A00;
                            int i = r04.senderKeyId_;
                            int i2 = r12.A00;
                            C172768Pc r05 = r04.senderSigningKey_;
                            if (r05 == null) {
                                r05 = C172768Pc.DEFAULT_INSTANCE;
                            }
                            C21805Aaf aaf = new C21805Aaf(new C118185nT(r05.private_.A06()), doFinal, i, i2);
                            A002.A00(new C202549mA((List) A002.A00.senderChainKeys_).A02(1));
                            r8.A04(A022, A023);
                            bArr2 = aaf.A03;
                        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                            throw new AssertionError(e);
                        } catch (AnonymousClass18F e2) {
                            throw new AnonymousClass18D((Exception) e2);
                        }
                    }
                    r2 = new AnonymousClass9K2(bArr2, 4, 0);
                } catch (AnonymousClass18D unused) {
                    r2 = new AnonymousClass9K2((byte[]) null, 0, -1008);
                }
            }
            return r2;
        } finally {
            try {
                A012.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    public AnonymousClass5q1 A0C(AnonymousClass6EU r5) {
        C21803Aad aad;
        AnonymousClass79X A012 = AnonymousClass18I.A01(this.A0K, r5);
        A012.lock();
        try {
            C235218u r2 = this.A00;
            boolean A002 = r2.A04.A00();
            C195239Tg r22 = new C195239Tg(r2.A02.A04);
            C1268866a A022 = AnonymousClass6R2.A02(r5);
            if (A002) {
                synchronized (C200689hx.A00) {
                    aad = r22.A00(A022);
                }
            } else {
                aad = r22.A00(A022);
            }
            AnonymousClass5q1 r0 = new AnonymousClass5q1(aad.A04, 0);
            A012.close();
            return r0;
        } catch (Throwable th) {
            try {
                A012.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:13|14|15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        return A0E(r4);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0028 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C198789eC A0D(X.AnonymousClass6EZ r4) {
        /*
            r3 = this;
            X.18a r2 = r3.A0G
            monitor-enter(r2)
            X.9eC r0 = r2.A00(r4)     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0019
            X.18e r0 = r3.A0B     // Catch:{ all -> 0x002e }
            byte[] r1 = r0.A04(r4)     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x001b
            X.9eC r0 = new X.9eC     // Catch:{ all -> 0x002e }
            r0.<init>()     // Catch:{ all -> 0x002e }
            r2.A03(r0, r4)     // Catch:{ all -> 0x002e }
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            goto L_0x0027
        L_0x001b:
            X.9eC r0 = new X.9eC     // Catch:{ IOException -> 0x0028 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0028 }
            A02(r0)     // Catch:{ IOException -> 0x0028 }
            r2.A03(r0, r4)     // Catch:{ IOException -> 0x0028 }
            goto L_0x0019
        L_0x0027:
            return r0
        L_0x0028:
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            X.9eC r0 = r3.A0E(r4)
            return r0
        L_0x002e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass189.A0D(X.6EZ):X.9eC");
    }

    public C198789eC A0E(AnonymousClass6EZ r7) {
        C198789eC r3;
        C198789eC r32;
        boolean A012 = C20800yB.A01(C21000yV.A02, this.A0N, 4009);
        AnonymousClass1M0 A042 = this.A0L.A04();
        if (A012) {
            C1495671s B1k = A042.B1k();
            synchronized (this.A0G) {
                try {
                    this.A0B.A02(r7);
                    r32 = new C198789eC();
                    A042.B5o(new C35321iV(this, r7, r32, 49));
                    B1k.A00();
                    B1k.close();
                    A042.close();
                } catch (Throwable th) {
                    B1k.close();
                    A042.close();
                    throw th;
                }
            }
            return r32;
        }
        try {
            C1495671s B1k2 = A042.B1k();
            try {
                C233218a r1 = this.A0G;
                synchronized (r1) {
                    this.A0B.A02(r7);
                    r3 = new C198789eC();
                    r1.A03(r3, r7);
                    B1k2.A00();
                }
                B1k2.close();
                A042.close();
                return r3;
            } catch (Throwable th2) {
                B1k2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A042.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public AnonymousClass6EZ A0F(AnonymousClass6EZ r5) {
        C19730wQ r1 = this.A03;
        C223313w A082 = r1.A08();
        r1.A0G();
        PhoneUserJid phoneUserJid = r1.A03;
        if (A082 == null || phoneUserJid == null || !r5.A02.equals(A082.user)) {
            return r5;
        }
        return new AnonymousClass6EZ(phoneUserJid.user, 0, r5.A00);
    }

    public C121865tq A0G() {
        AssertionError assertionError;
        AnonymousClass79X A072 = this.A0K.A07();
        try {
            byte[] A012 = this.A0C.A01();
            if (A012 != null) {
                C100004uJ r5 = (C100004uJ) C170918Hz.A08(C100004uJ.DEFAULT_INSTANCE, A012);
                if (A072 != null) {
                    A072.close();
                }
                Log.i("axolotl loaded the latest signed pre key for sending");
                try {
                    return new C121865tq(C203239na.A03(r5.id_), new C119545pz(new AnonymousClass66J(r5.privateKey_.A06(), (byte) 5), C133256Xm.A01(r5.publicKey_.A06())).A01.A01, r5.signature_.A06());
                } catch (AnonymousClass110 e) {
                    throw new AssertionError(e);
                }
            } else {
                assertionError = new AssertionError("no signed prekey record found");
                throw assertionError;
            }
        } catch (IOException e2) {
            Log.e("failed to parse the latest signed prekey record", e2);
            assertionError = new AssertionError(e2);
        } catch (Throwable th) {
            if (A072 != null) {
                try {
                    A072.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public C121865tq A0H() {
        C234618o r7;
        Cursor A092;
        C593633q r8;
        C121865tq r4;
        C121865tq r5;
        AnonymousClass79X A072 = this.A0K.A07();
        try {
            C235218u r2 = this.A00;
            C235018s r1 = r2.A02;
            if (!r1.A04()) {
                r2.A06();
            }
            r7 = r1.A03;
            AnonymousClass18M r10 = r7.A01;
            AnonymousClass1M0 A032 = r10.get();
            try {
                A092 = A032.A02.A09("SELECT prekey_id, record FROM prekeys WHERE sent_to_server = 0 AND direct_distribution = 0 LIMIT ?", "SignalPreKeyStore/getSinglePreKey", new String[]{"1"});
                if (A092.moveToNext()) {
                    r8 = new C593633q(A092.getInt(A092.getColumnIndexOrThrow("prekey_id")), A092.getBlob(A092.getColumnIndexOrThrow("record")));
                } else {
                    r8 = null;
                }
                A092.close();
                A032.close();
                r4 = null;
                if (r8 != null) {
                    int i = r8.A00;
                    byte[] A002 = new C198539dj(r8.A01).A00().A01.A00();
                    boolean z = true;
                    int length = A002.length - 1;
                    byte[] bArr = new byte[length];
                    System.arraycopy(A002, 1, bArr, 0, length);
                    r5 = new C121865tq(C203239na.A03(i), bArr, (byte[]) null);
                    A032 = r10.A04();
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put("direct_distribution", true);
                    contentValues.put("upload_timestamp", Long.valueOf(C19970wo.A00(r7.A00) / 1000));
                    if (A032.A02.A01(contentValues, "prekeys", "prekey_id=?", "SignalPreKeyStore/markPreKeyAsDirectDistribution", new String[]{String.valueOf(i)}) != 1) {
                        z = false;
                    }
                    A032.close();
                    if (!z) {
                        Log.e("Failed to mark key as direct distribution, not sending pre-key with retry receipt");
                    }
                    r4 = r5;
                }
            } catch (Throwable th) {
                A032.close();
                throw th;
            }
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("error reading prekey ");
            int i2 = r8.A00;
            sb.append(i2);
            Log.e(sb.toString(), e);
            r7.A02(i2);
            r5 = null;
        } catch (Throwable th2) {
            if (A072 != null) {
                try {
                    A072.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
            throw th2;
        }
        if (A072 != null) {
            A072.close();
        }
        return r4;
        throw th;
    }

    public HashMap A0I(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            AnonymousClass6EZ r1 = (AnonymousClass6EZ) entry.getKey();
            hashMap.put(r1, A09(r1, (byte[]) entry.getValue()));
        }
        return hashMap;
    }

    public HashMap A0J(Set set) {
        ArrayList arrayList;
        AnonymousClass6EZ r4;
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass6EZ r1 = (AnonymousClass6EZ) it.next();
            hashMap.put(r1, A0F(r1));
        }
        HashSet hashSet = new HashSet(hashMap.values());
        HashMap hashMap2 = new HashMap();
        AnonymousClass18I r0 = this.A0K;
        HashSet A092 = r0.A09(hashSet);
        try {
            r0.A0A(A092);
            HashMap A062 = this.A07.A06(hashSet);
            arrayList = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                r4 = (AnonymousClass6EZ) entry.getKey();
                byte[] bArr = (byte[]) A062.get(entry.getValue());
                if (bArr != null) {
                    hashMap2.put(r4, new AnonymousClass3FZ(C133256Xm.A01(bArr)));
                }
                hashMap2.put(r4, (Object) null);
            }
            if (!arrayList.isEmpty()) {
                A03(arrayList);
            }
            AnonymousClass18I.A05(A092);
            return hashMap2;
        } catch (AnonymousClass110 e) {
            StringBuilder sb = new StringBuilder();
            sb.append("axolotl identity key for ");
            sb.append(r4);
            sb.append(" decoded as invalid");
            Log.e(sb.toString(), e);
            arrayList.add(r4);
        } catch (Throwable th) {
            AnonymousClass18I.A05(A092);
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:13|14|15|16|17|38|36|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        r1 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r1.hasNext() == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        A0E((X.AnonymousClass6EZ) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        return r8;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0067 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashSet A0K(java.util.List r15) {
        /*
            r14 = this;
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            X.18a r9 = r14.A0G
            monitor-enter(r9)
            java.util.HashSet r8 = r9.A01(r15)     // Catch:{ all -> 0x0091 }
            java.util.HashSet r13 = r9.A02(r15)     // Catch:{ all -> 0x0091 }
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0018
            monitor-exit(r9)     // Catch:{ all -> 0x0091 }
            return r8
        L_0x0018:
            r8.addAll(r13)     // Catch:{ all -> 0x0091 }
            X.18e r0 = r14.A0B     // Catch:{ all -> 0x0091 }
            android.database.Cursor r11 = r0.A01(r13)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "record"
            int r10 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "recipient_id"
            int r7 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "recipient_type"
            int r6 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "device_id"
            int r5 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0087 }
        L_0x0039:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x006b
            byte[] r4 = r11.getBlob(r10)     // Catch:{ all -> 0x0087 }
            long r0 = r11.getLong(r7)     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0087 }
            int r2 = r11.getInt(r6)     // Catch:{ all -> 0x0087 }
            int r0 = r11.getInt(r5)     // Catch:{ all -> 0x0087 }
            X.6EZ r1 = new X.6EZ     // Catch:{ all -> 0x0087 }
            r1.<init>(r3, r2, r0)     // Catch:{ all -> 0x0087 }
            X.9eC r0 = new X.9eC     // Catch:{ IOException -> 0x0067 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0067 }
            A02(r0)     // Catch:{ IOException -> 0x0067 }
            r9.A03(r0, r1)     // Catch:{ IOException -> 0x0067 }
            r8.remove(r1)     // Catch:{ IOException -> 0x0067 }
            goto L_0x0039
        L_0x0067:
            r12.add(r1)     // Catch:{ all -> 0x0087 }
            goto L_0x0039
        L_0x006b:
            r11.close()     // Catch:{ all -> 0x0091 }
            r9.A04(r13)     // Catch:{ all -> 0x0091 }
            monitor-exit(r9)     // Catch:{ all -> 0x0091 }
            java.util.Iterator r1 = r12.iterator()
        L_0x0076:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r1.next()
            X.6EZ r0 = (X.AnonymousClass6EZ) r0
            r14.A0E(r0)
            goto L_0x0076
        L_0x0086:
            return r8
        L_0x0087:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x008c }
            goto L_0x0090
        L_0x008c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0091 }
        L_0x0090:
            throw r1     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0091 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass189.A0K(java.util.List):java.util.HashSet");
    }

    public void A0M() {
        this.A0L.A05();
        if (this.A04.A09(C21100yf.A0m)) {
            C000100b r4 = this.A0O;
            NativeHolder nativeHolder = (NativeHolder) ((JniBridge) r4).wajContext.getAndSet(JniBridge.jvidispatchO(0));
            if (nativeHolder != null) {
                nativeHolder.release();
            }
            C20810yC r3 = this.A0N;
            if (C20800yB.A00(C21000yV.A02, r3, 5120) >= 1) {
                C54302sj.A00(this.A0E.A00, this.A0P.A00(), this.A0F, r3, r4);
            }
        }
        C233218a r1 = this.A0G;
        synchronized (r1) {
            r1.A00.clear();
            r1.A01.clear();
        }
    }

    public void A0N() {
        AnonymousClass79X A072 = this.A0K.A07();
        try {
            if (this.A04.A09(C21100yf.A0m)) {
                C235318v r6 = this.A01;
                int A002 = r6.A01.A00();
                int A042 = r6.A00.A04(C21100yf.A1z);
                if (A002 < A042) {
                    int i = A042 - A002;
                    while (true) {
                        if (i <= 0) {
                            break;
                        }
                        int min = Math.min(i, 50);
                        StringBuilder sb = new StringBuilder();
                        sb.append("wa-msys generating ");
                        sb.append(min);
                        sb.append(" new prekeys and recording them in the db");
                        Log.i(sb.toString());
                        int jvidispatchIIO = (int) JniBridge.jvidispatchIIO(4, (long) min, (NativeHolder) ((JniBridge) r6.A04).wajContext.get());
                        if (jvidispatchIIO <= 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("wa-msys generated 0 keys when expected to generate ");
                            sb2.append(min);
                            sb2.append(" keys");
                            Log.e(sb2.toString());
                            break;
                        }
                        i -= jvidispatchIIO;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("skipping key generation because already more than ");
                    sb3.append(A042);
                    sb3.append(" are unsent");
                    Log.i(sb3.toString());
                }
            } else {
                this.A00.A06();
            }
            if (A072 != null) {
                A072.close();
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A0O() {
        AnonymousClass1M0 A042;
        AnonymousClass79X A072 = this.A0K.A07();
        try {
            AnonymousClass18M r4 = this.A00.A02.A03.A01;
            AnonymousClass1M0 A043 = r4.A04();
            try {
                C1495671s B1k = A043.B1k();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("sent_to_server", false);
                    contentValues.put("upload_timestamp", 0L);
                    A043.A02.A01(contentValues, "prekeys", "sent_to_server != 0", "SignalPreKeyStore/markAllPreKeysAsUnsentToServer", (String[]) null);
                    Log.i("axolotl recorded no prekeys as received by server");
                    A042 = r4.A04();
                    int A032 = A042.A02.A03("prekey_uploads", (String) null, "SignalPreKeyStore/deleteAllPreKeyUploads", (String[]) null);
                    StringBuilder sb = new StringBuilder();
                    sb.append("axolotl deleted prekey upload timestamps:");
                    sb.append(A032);
                    Log.i(sb.toString());
                    A042.close();
                    B1k.A00();
                    B1k.close();
                    A043.close();
                    if (A072 != null) {
                        A072.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    B1k.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                A043.close();
                throw th2;
            }
        } catch (Throwable th3) {
            if (A072 != null) {
                try {
                    A072.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
            throw th3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a7, code lost:
        if (r5 != null) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P(int r18) {
        /*
            r17 = this;
            r1 = r17
            X.18I r0 = r1.A0K
            X.79X r7 = r0.A07()
            X.18p r5 = r1.A0C     // Catch:{ all -> 0x00d8 }
            r3 = 5
            java.lang.String[] r12 = new java.lang.String[r3]     // Catch:{ all -> 0x00d8 }
            r2 = 0
        L_0x000e:
            r4 = r18
            int r1 = r18 - r2
            if (r1 >= 0) goto L_0x0017
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            int r1 = r1 + r0
        L_0x0017:
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00d8 }
            r12[r2] = r0     // Catch:{ all -> 0x00d8 }
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x000e
            X.18M r0 = r5.A01     // Catch:{ all -> 0x00d8 }
            X.1M0 r2 = r0.A04()     // Catch:{ all -> 0x00d8 }
            X.71s r6 = r2.B1k()     // Catch:{ all -> 0x00ce }
            X.14e r8 = r2.A02     // Catch:{ all -> 0x00c4 }
            java.lang.String r9 = "signed_prekeys"
            java.lang.String r0 = "COUNT(1) as count"
            java.lang.String[] r10 = new java.lang.String[]{r0}     // Catch:{ all -> 0x00c4 }
            java.lang.String r11 = "prekey_id IN (?,?,?,?,?)"
            r13 = 0
            java.lang.String r16 = "SignalSignedPreKeyStore/removeOldSignedPreKeysCountRemaining"
            r15 = r13
            r14 = r13
            android.database.Cursor r5 = r8.A0A(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00c4 }
            if (r5 == 0) goto L_0x0093
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = "count"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b8 }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x00b8 }
            if (r0 != 0) goto L_0x0069
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r1.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "there would be zero signed prekeys left if this delete old signed prekey records command were executed; aborting; newSignedPreKeyId="
            r1.append(r0)     // Catch:{ all -> 0x00b8 }
            r1.append(r4)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00b8 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x00a9
        L_0x0069:
            java.lang.String r1 = "prekey_id NOT IN (?,?,?,?,?)"
            java.lang.String r0 = "SignalSignedPreKeyStore/removeOldSignedPreKeys"
            int r3 = r8.A03(r9, r1, r0, r12)     // Catch:{ all -> 0x00b8 }
            if (r3 == 0) goto L_0x008f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r1.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "deleted "
            r1.append(r0)     // Catch:{ all -> 0x00b8 }
            r1.append(r3)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = " old signed prekey records; newSignedPreKeyId="
            r1.append(r0)     // Catch:{ all -> 0x00b8 }
            r1.append(r4)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00b8 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00b8 }
        L_0x008f:
            r6.A00()     // Catch:{ all -> 0x00b8 }
            goto L_0x00a9
        L_0x0093:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r1.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "failed to query a count while trying to delete old signed prekey records; newSignedPreKeyId="
            r1.append(r0)     // Catch:{ all -> 0x00b8 }
            r1.append(r4)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00b8 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00b8 }
            if (r5 == 0) goto L_0x00ac
        L_0x00a9:
            r5.close()     // Catch:{ all -> 0x00c4 }
        L_0x00ac:
            r6.close()     // Catch:{ all -> 0x00ce }
            r2.close()     // Catch:{ all -> 0x00d8 }
            if (r7 == 0) goto L_0x00b7
            r7.close()
        L_0x00b7:
            return
        L_0x00b8:
            r1 = move-exception
            if (r5 == 0) goto L_0x00c3
            r5.close()     // Catch:{ all -> 0x00bf }
            goto L_0x00c3
        L_0x00bf:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00c4 }
        L_0x00c3:
            throw r1     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00c9 }
            goto L_0x00cd
        L_0x00c9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ce }
        L_0x00cd:
            throw r1     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00d3 }
            goto L_0x00d7
        L_0x00d3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00d8 }
        L_0x00d7:
            throw r1     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r1 = move-exception
            if (r7 == 0) goto L_0x00e3
            r7.close()     // Catch:{ all -> 0x00df }
            throw r1
        L_0x00df:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x00e3:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass189.A0P(int):void");
    }

    public void A0S(AnonymousClass6EZ r5, AnonymousClass11F r6, byte[] bArr) {
        AnonymousClass18I r0 = this.A0K;
        AnonymousClass79X A002 = AnonymousClass18I.A00(r5, r0);
        AnonymousClass18I.A03(A002, r0);
        try {
            A0U(r5, new C64933Qa(r6, "location_msg_id", true), bArr);
            if (A002 != null) {
                A002.close();
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0T(X.AnonymousClass6EZ r10, X.C64933Qa r11) {
        /*
            r9 = this;
            X.18I r0 = r9.A0K
            X.79X r6 = X.AnonymousClass18I.A00(r10, r0)
            X.AnonymousClass18I.A03(r6, r0)
            X.18m r8 = r9.A08     // Catch:{ all -> 0x0077 }
            X.0yC r2 = r8.A03     // Catch:{ all -> 0x0077 }
            r1 = 6487(0x1957, float:9.09E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x0077 }
            boolean r0 = X.C20800yB.A01(r0, r2, r1)     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0032
            X.18h r1 = r8.A01     // Catch:{ all -> 0x0077 }
            r0 = 3
            java.lang.Long r7 = r1.A00(r10, r0)     // Catch:{ all -> 0x0077 }
        L_0x001e:
            java.lang.String r4 = r8.A00(r11, r7)     // Catch:{ all -> 0x0077 }
            X.11F r0 = r11.A00     // Catch:{ all -> 0x0077 }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x0077 }
            X.18M r0 = r8.A02     // Catch:{ all -> 0x0077 }
            X.1M0 r5 = r0.A04()     // Catch:{ all -> 0x0077 }
            goto L_0x0034
        L_0x0032:
            r7 = 0
            goto L_0x001e
        L_0x0034:
            X.14e r3 = r5.A02     // Catch:{ all -> 0x0070 }
            java.lang.String r2 = "message_base_key"
            java.lang.String[] r1 = r8.A01(r10, r11, r7, r1)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "SignalMessageBaseKeyStore/removeMessageBaseKey"
            int r0 = r3.A03(r2, r4, r0, r1)     // Catch:{ all -> 0x0070 }
            long r2 = (long) r0     // Catch:{ all -> 0x0070 }
            r7 = 0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r4 = 5
            if (r0 <= 0) goto L_0x004b
            r4 = 3
        L_0x004b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r1.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "axolotl deleted "
            r1.append(r0)     // Catch:{ all -> 0x0070 }
            r1.append(r2)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = " message base key rows for "
            r1.append(r0)     // Catch:{ all -> 0x0070 }
            r1.append(r11)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0070 }
            com.whatsapp.util.Log.log((int) r4, (java.lang.String) r0)     // Catch:{ all -> 0x0070 }
            r5.close()     // Catch:{ all -> 0x0077 }
            if (r6 == 0) goto L_0x006f
            r6.close()
        L_0x006f:
            return
        L_0x0070:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x0077 }
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r1 = move-exception
            if (r6 == 0) goto L_0x0082
            r6.close()     // Catch:{ all -> 0x007e }
            throw r1
        L_0x007e:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0082:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass189.A0T(X.6EZ, X.3Qa):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(X.AnonymousClass6EZ r10, X.C64933Qa r11, byte[] r12) {
        /*
            r9 = this;
            X.18I r0 = r9.A0K
            X.79X r4 = X.AnonymousClass18I.A00(r10, r0)
            X.AnonymousClass18I.A03(r4, r0)
            X.18m r8 = r9.A08     // Catch:{ all -> 0x00b3 }
            r0 = 1
            X.AnonymousClass00C.A0D(r11, r0)     // Catch:{ all -> 0x00b3 }
            X.11F r0 = r11.A00     // Catch:{ all -> 0x00b3 }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x00b3 }
            X.18M r0 = r8.A02     // Catch:{ all -> 0x00b3 }
            X.1M0 r5 = r0.A04()     // Catch:{ all -> 0x00b3 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x00ac }
            r3.<init>()     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "msg_key_remote_jid"
            r3.put(r0, r1)     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "recipient_id"
            java.lang.String r0 = r10.A02     // Catch:{ all -> 0x00ac }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "recipient_type"
            int r0 = r10.A01     // Catch:{ all -> 0x00ac }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00ac }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "device_id"
            int r0 = r10.A00     // Catch:{ all -> 0x00ac }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00ac }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "msg_key_from_me"
            boolean r0 = r11.A02     // Catch:{ all -> 0x00ac }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00ac }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "msg_key_id"
            java.lang.String r0 = r11.A01     // Catch:{ all -> 0x00ac }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "last_alice_base_key"
            r3.put(r0, r12)     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "timestamp"
            X.0wo r0 = r8.A00     // Catch:{ all -> 0x00ac }
            long r6 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x00ac }
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0     // Catch:{ all -> 0x00ac }
            long r6 = r6 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x00ac }
            r3.put(r2, r0)     // Catch:{ all -> 0x00ac }
            X.18h r1 = r8.A01     // Catch:{ all -> 0x00ac }
            r0 = 3
            java.lang.Long r1 = r1.A00(r10, r0)     // Catch:{ all -> 0x00ac }
            if (r1 == 0) goto L_0x007d
            java.lang.String r0 = "recipient_lid_identifier"
            r3.put(r0, r1)     // Catch:{ all -> 0x00ac }
        L_0x007d:
            X.14e r2 = r5.A02     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "message_base_key"
            java.lang.String r0 = "SignalMessageBaseKeyStore/saveMessageBaseKey"
            long r1 = r2.A07(r1, r0, r3)     // Catch:{ all -> 0x00ac }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ac }
            r3.<init>()     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "axolotl saved a message base key for "
            r3.append(r0)     // Catch:{ all -> 0x00ac }
            r3.append(r11)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = " with row id "
            r3.append(r0)     // Catch:{ all -> 0x00ac }
            r3.append(r1)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00ac }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ac }
            r5.close()     // Catch:{ all -> 0x00b3 }
            if (r4 == 0) goto L_0x00ab
            r4.close()
        L_0x00ab:
            return
        L_0x00ac:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x00b3 }
            throw r0     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r1 = move-exception
            if (r4 == 0) goto L_0x00be
            r4.close()     // Catch:{ all -> 0x00ba }
            throw r1
        L_0x00ba:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x00be:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass189.A0U(X.6EZ, X.3Qa, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0V(X.AnonymousClass6EU r10) {
        /*
            r9 = this;
            X.18I r0 = r9.A0K
            X.79X r8 = X.AnonymousClass18I.A01(r0, r10)
            r8.lock()
            java.lang.String r2 = r10.A01     // Catch:{ all -> 0x0086 }
            X.8dv r0 = X.C177518dv.A00     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x0086 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x002c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r1.<init>()     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = "signalCoordinator/removefastratchetsenderkey/invalidgroupid "
            r1.append(r0)     // Catch:{ all -> 0x0086 }
            r1.append(r2)     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0086 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0086 }
            goto L_0x007b
        L_0x002c:
            X.18n r2 = r9.A06     // Catch:{ all -> 0x0086 }
            java.lang.Long r7 = X.C234518n.A00(r2, r10)     // Catch:{ all -> 0x0086 }
            if (r7 != 0) goto L_0x0041
            java.lang.String[] r6 = r10.A00()     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?"
        L_0x003a:
            X.18M r0 = r2.A03     // Catch:{ all -> 0x0086 }
            X.1M0 r4 = r0.A04()     // Catch:{ all -> 0x0086 }
            goto L_0x004c
        L_0x0041:
            long r0 = r7.longValue()     // Catch:{ all -> 0x0086 }
            java.lang.String[] r6 = X.AnonymousClass5ZZ.A00(r10, r0)     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "group_id = ? AND sender_lid_identifier = ? AND sender_type = ? AND device_id = ?"
            goto L_0x003a
        L_0x004c:
            X.14e r3 = r4.A02     // Catch:{ all -> 0x007f }
            java.lang.String r2 = "fast_ratchet_sender_keys"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            r1.<init>()     // Catch:{ all -> 0x007f }
            java.lang.String r0 = "SignalFastRatchetSenderKeyStore/removeFastRatchetSenderKey"
            r1.append(r0)     // Catch:{ all -> 0x007f }
            if (r7 == 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            java.lang.String r0 = ""
            goto L_0x0062
        L_0x0060:
            java.lang.String r0 = "_lid_identifier"
        L_0x0062:
            r1.append(r0)     // Catch:{ all -> 0x007f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x007f }
            r3.A03(r2, r5, r0, r6)     // Catch:{ all -> 0x007f }
            r4.close()     // Catch:{ all -> 0x0086 }
            X.17s r0 = r9.A05     // Catch:{ all -> 0x0086 }
            X.5zh r1 = new X.5zh     // Catch:{ all -> 0x0086 }
            r1.<init>()     // Catch:{ all -> 0x0086 }
            X.17t r0 = r0.A00     // Catch:{ all -> 0x0086 }
            r0.A01(r1)     // Catch:{ all -> 0x0086 }
        L_0x007b:
            r8.close()
            return
        L_0x007f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x0086 }
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x008b }
            throw r1
        L_0x008b:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass189.A0V(X.6EU):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.io.Serializable[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.io.Serializable[]} */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e5, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0W(java.util.List r19, int r20) {
        /*
            r18 = this;
            r5 = r18
            X.18I r0 = r5.A0K
            X.79X r11 = r0.A07()
            int r0 = r19.size()     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x010e
            X.18M r0 = r5.A0L     // Catch:{ all -> 0x0114 }
            X.1M0 r10 = r0.A04()     // Catch:{ all -> 0x0114 }
            X.71s r9 = r10.B1k()     // Catch:{ all -> 0x0104 }
            X.18o r0 = r5.A09     // Catch:{ all -> 0x00fa }
            X.18M r0 = r0.A01     // Catch:{ all -> 0x00fa }
            X.1M0 r3 = r0.A04()     // Catch:{ all -> 0x00fa }
            X.71s r7 = r3.B1k()     // Catch:{ all -> 0x00f0 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x00e6 }
            r4.<init>()     // Catch:{ all -> 0x00e6 }
            java.util.Iterator r6 = r19.iterator()     // Catch:{ all -> 0x00e6 }
        L_0x002d:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x0067
            java.lang.Object r2 = r6.next()     // Catch:{ all -> 0x00e6 }
            X.33q r2 = (X.C593633q) r2     // Catch:{ all -> 0x00e6 }
            r4.clear()     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = "prekey_id"
            int r0 = r2.A00     // Catch:{ all -> 0x00e6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00e6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = "record"
            byte[] r0 = r2.A01     // Catch:{ all -> 0x00e6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00e6 }
            java.lang.String r2 = "sent_to_server"
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00e6 }
            r4.put(r2, r1)     // Catch:{ all -> 0x00e6 }
            java.lang.String r0 = "direct_distribution"
            r4.put(r0, r1)     // Catch:{ all -> 0x00e6 }
            X.14e r2 = r3.A02     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = "prekeys"
            java.lang.String r0 = "SignalPreKeyStore/savePreKeys"
            r2.A05(r1, r0, r4)     // Catch:{ all -> 0x00e6 }
            goto L_0x002d
        L_0x0067:
            r7.A00()     // Catch:{ all -> 0x00e6 }
            r7.close()     // Catch:{ all -> 0x00f0 }
            r3.close()     // Catch:{ all -> 0x00fa }
            X.18l r2 = r5.A07     // Catch:{ all -> 0x00fa }
            java.lang.String r1 = "0"
            X.18M r0 = r2.A04     // Catch:{ all -> 0x00fa }
            X.1M0 r4 = r0.A04()     // Catch:{ all -> 0x00fa }
            r8 = 3
            java.lang.String[] r5 = new java.lang.String[r8]     // Catch:{ all -> 0x00df }
            r0 = -1
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00df }
            r7 = 0
            r5[r7] = r0     // Catch:{ all -> 0x00df }
            r6 = 1
            r5[r6] = r1     // Catch:{ all -> 0x00df }
            r3 = 2
            r5[r3] = r1     // Catch:{ all -> 0x00df }
            X.0yC r2 = r2.A05     // Catch:{ all -> 0x00df }
            r1 = 6484(0x1954, float:9.086E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x00df }
            boolean r0 = X.C20800yB.A01(r0, r2, r1)     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x00c7
            java.io.Serializable[] r1 = new java.io.Serializable[r8]     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "SignalIdentityKeyStore/saveNextPreKeyId_lid_identifier"
            r1[r7] = r0     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "recipient_lid_identifier =? AND recipient_type = ? AND device_id =?"
            r1[r6] = r0     // Catch:{ all -> 0x00df }
        L_0x00a1:
            r1[r3] = r5     // Catch:{ all -> 0x00df }
            r3 = r1[r7]     // Catch:{ all -> 0x00df }
            r2 = r1[r6]     // Catch:{ all -> 0x00df }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x00df }
            r13.<init>()     // Catch:{ all -> 0x00df }
            java.lang.String r1 = "next_prekey_id"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x00df }
            r13.put(r1, r0)     // Catch:{ all -> 0x00df }
            X.14e r12 = r4.A02     // Catch:{ all -> 0x00df }
            java.lang.String r14 = "identities"
            java.lang.String r15 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00df }
            java.lang.String r16 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00df }
            r17 = r5
            r12.A01(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00df }
            goto L_0x00d2
        L_0x00c7:
            java.io.Serializable[] r1 = new java.io.Serializable[r8]     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "SignalIdentityKeyStore/saveNextPreKeyId"
            r1[r7] = r0     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "recipient_id =? AND recipient_type = ? AND device_id =?"
            r1[r6] = r0     // Catch:{ all -> 0x00df }
            goto L_0x00a1
        L_0x00d2:
            r4.close()     // Catch:{ all -> 0x00fa }
            r9.A00()     // Catch:{ all -> 0x00fa }
            r9.close()     // Catch:{ all -> 0x0104 }
            r10.close()     // Catch:{ all -> 0x0114 }
            goto L_0x010e
        L_0x00df:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x00fa }
            throw r0     // Catch:{ all -> 0x00fa }
        L_0x00e6:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00eb }
            goto L_0x00ef
        L_0x00eb:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00f0 }
        L_0x00ef:
            throw r1     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00f5 }
            goto L_0x00f9
        L_0x00f5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00fa }
        L_0x00f9:
            throw r1     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x00ff }
            goto L_0x0103
        L_0x00ff:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0104 }
        L_0x0103:
            throw r1     // Catch:{ all -> 0x0104 }
        L_0x0104:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0109 }
            goto L_0x010d
        L_0x0109:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0114 }
        L_0x010d:
            throw r1     // Catch:{ all -> 0x0114 }
        L_0x010e:
            if (r11 == 0) goto L_0x0113
            r11.close()
        L_0x0113:
            return
        L_0x0114:
            r1 = move-exception
            if (r11 == 0) goto L_0x011f
            r11.close()     // Catch:{ all -> 0x011b }
            throw r1
        L_0x011b:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x011f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass189.A0W(java.util.List, int):void");
    }

    public boolean A0X() {
        return C20800yB.A01(C21000yV.A02, this.A0K.A04, 3165);
    }

    public boolean A0Y() {
        AnonymousClass79X A072 = this.A0K.A07();
        try {
            boolean A042 = this.A00.A02.A04();
            if (A072 != null) {
                A072.close();
            }
            return A042;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public boolean A0Z(AnonymousClass6EZ r6) {
        C233218a r4 = this.A0G;
        synchronized (r4) {
            C198789eC A002 = r4.A00(r6);
            boolean z = true;
            if (A002 == null) {
                byte[] A042 = this.A0B.A04(r6);
                if (A042 == null) {
                    r4.A03(new C198789eC(), r6);
                    return false;
                }
                try {
                    C198789eC r0 = new C198789eC(A042);
                    A02(r0);
                    r4.A03(r0, r6);
                } catch (IOException unused) {
                    A0E(r6);
                    return false;
                }
            } else if (A002.A00) {
                z = false;
            }
            return z;
        }
    }

    public boolean A0a(AnonymousClass6EZ r5, AnonymousClass11F r6) {
        AnonymousClass18I r0 = this.A0K;
        AnonymousClass79X A002 = AnonymousClass18I.A00(r5, r0);
        AnonymousClass18I.A03(A002, r0);
        try {
            boolean A0b = A0b(r5, new C64933Qa(r6, "location_msg_id", true));
            if (A002 != null) {
                A002.close();
            }
            return A0b;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ea, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0b(X.AnonymousClass6EZ r21, X.C64933Qa r22) {
        /*
            r20 = this;
            r8 = r20
            X.18I r0 = r8.A0K
            r4 = r21
            X.79X r2 = X.AnonymousClass18I.A00(r4, r0)
            X.AnonymousClass18I.A03(r2, r0)
            X.79X r3 = X.AnonymousClass18I.A00(r4, r0)     // Catch:{ all -> 0x00f7 }
            X.AnonymousClass18I.A03(r3, r0)     // Catch:{ all -> 0x00f7 }
            X.18m r10 = r8.A08     // Catch:{ all -> 0x00eb }
            java.lang.String r9 = "last_alice_base_key"
            r0 = 1
            r5 = r22
            X.AnonymousClass00C.A0D(r5, r0)     // Catch:{ all -> 0x00eb }
            X.0yC r6 = r10.A03     // Catch:{ all -> 0x00eb }
            r1 = 6487(0x1957, float:9.09E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x00eb }
            boolean r0 = X.C20800yB.A01(r0, r6, r1)     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x0045
            X.18h r1 = r10.A01     // Catch:{ all -> 0x00eb }
            r0 = 3
            java.lang.Long r7 = r1.A00(r4, r0)     // Catch:{ all -> 0x00eb }
        L_0x0031:
            java.lang.String r14 = r10.A00(r5, r7)     // Catch:{ all -> 0x00eb }
            X.11F r0 = r5.A00     // Catch:{ all -> 0x00eb }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x00eb }
            X.18M r0 = r10.A02     // Catch:{ all -> 0x00eb }
            X.1M0 r6 = r0.get()     // Catch:{ all -> 0x00eb }
            goto L_0x0047
        L_0x0045:
            r7 = 0
            goto L_0x0031
        L_0x0047:
            X.14e r11 = r6.A02     // Catch:{ all -> 0x00e4 }
            java.lang.String r12 = "message_base_key"
            java.lang.String[] r13 = new java.lang.String[]{r9}     // Catch:{ all -> 0x00e4 }
            java.lang.String[] r15 = r10.A01(r4, r5, r7, r1)     // Catch:{ all -> 0x00e4 }
            r1 = 0
            java.lang.String r19 = "SignalMessageBaseKeyStore/getMessageBaseKey"
            r18 = r1
            r16 = r1
            r17 = r1
            android.database.Cursor r7 = r11.A0A(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00e4 }
            if (r7 == 0) goto L_0x007b
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0070
            int r0 = r7.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x0074 }
            byte[] r1 = r7.getBlob(r0)     // Catch:{ all -> 0x0074 }
        L_0x0070:
            r7.close()     // Catch:{ all -> 0x00e4 }
            goto L_0x007b
        L_0x0074:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x00e4 }
            throw r0     // Catch:{ all -> 0x00e4 }
        L_0x007b:
            r6.close()     // Catch:{ all -> 0x00eb }
            if (r3 == 0) goto L_0x0083
            r3.close()     // Catch:{ all -> 0x00f7 }
        L_0x0083:
            if (r1 != 0) goto L_0x00a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r1.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = "axolotl has no saved base key for "
            r1.append(r0)     // Catch:{ all -> 0x00f7 }
            r1.append(r5)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00f7 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00f7 }
            r0 = 0
            if (r2 == 0) goto L_0x009f
            r2.close()
        L_0x009f:
            return r0
        L_0x00a0:
            X.9eC r0 = r8.A0D(r4)     // Catch:{ all -> 0x00f7 }
            X.9bJ r0 = r0.A01     // Catch:{ all -> 0x00f7 }
            X.8S2 r0 = r0.A00     // Catch:{ all -> 0x00f7 }
            X.AUx r0 = r0.aliceBaseKey_     // Catch:{ all -> 0x00f7 }
            byte[] r0 = r0.A06()     // Catch:{ all -> 0x00f7 }
            boolean r3 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x00f7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r1.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = "axolotl has "
            r1.append(r0)     // Catch:{ all -> 0x00f7 }
            if (r3 == 0) goto L_0x00bf
            goto L_0x00c2
        L_0x00bf:
            java.lang.String r0 = "different"
            goto L_0x00c4
        L_0x00c2:
            java.lang.String r0 = "matching"
        L_0x00c4:
            r1.append(r0)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = " saved base key and session for "
            r1.append(r0)     // Catch:{ all -> 0x00f7 }
            r1.append(r5)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = " and "
            r1.append(r0)     // Catch:{ all -> 0x00f7 }
            r1.append(r4)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00f7 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00f7 }
            if (r2 == 0) goto L_0x00e3
            r2.close()
        L_0x00e3:
            return r3
        L_0x00e4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e6 }
        L_0x00e6:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x00eb }
            throw r0     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r1 = move-exception
            if (r3 == 0) goto L_0x00f6
            r3.close()     // Catch:{ all -> 0x00f2 }
            goto L_0x00f6
        L_0x00f2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00f7 }
        L_0x00f6:
            throw r1     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            r1 = move-exception
            if (r2 == 0) goto L_0x0102
            r2.close()     // Catch:{ all -> 0x00fe }
            throw r1
        L_0x00fe:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0102:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass189.A0b(X.6EZ, X.3Qa):boolean");
    }

    public byte[] A0c() {
        AnonymousClass79X A072 = this.A0K.A07();
        try {
            byte[] bArr = this.A00.A04().A01.A00.A01;
            Log.i("axolotl fetched identity key for sending");
            if (A072 != null) {
                A072.close();
            }
            return bArr;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass3FZ r13, X.AnonymousClass6EZ r14, X.AnonymousClass189 r15) {
        /*
            java.util.List r3 = r15.A0L(r14)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r3)
            X.18I r0 = r15.A0K
            java.util.HashSet r2 = r0.A09(r1)
            r0.A0A(r2)     // Catch:{ all -> 0x0177 }
            java.util.HashMap r12 = r15.A0J(r1)     // Catch:{ all -> 0x0177 }
            X.18M r0 = r15.A0L     // Catch:{ all -> 0x0177 }
            X.1M0 r11 = r0.A04()     // Catch:{ all -> 0x0177 }
            X.71s r10 = r11.B1k()     // Catch:{ all -> 0x016d }
            java.util.Iterator r9 = r3.iterator()     // Catch:{ all -> 0x0163 }
        L_0x0024:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r6 = r9.next()     // Catch:{ all -> 0x0163 }
            X.6EZ r6 = (X.AnonymousClass6EZ) r6     // Catch:{ all -> 0x0163 }
            X.18l r3 = r15.A07     // Catch:{ all -> 0x0163 }
            if (r13 == 0) goto L_0x00bd
            X.3IG r0 = r13.A00     // Catch:{ all -> 0x0163 }
            byte[] r4 = r0.A00()     // Catch:{ all -> 0x0163 }
        L_0x003a:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)     // Catch:{ all -> 0x0163 }
            X.18M r0 = r3.A04     // Catch:{ all -> 0x0163 }
            X.1M0 r5 = r0.A04()     // Catch:{ all -> 0x0163 }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x00c0 }
            r7.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = "recipient_id"
            java.lang.String r0 = r6.A02     // Catch:{ all -> 0x00c0 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = "recipient_type"
            int r0 = r6.A01     // Catch:{ all -> 0x00c0 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c0 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = "device_id"
            int r0 = r6.A00     // Catch:{ all -> 0x00c0 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c0 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "public_key"
            if (r4 == 0) goto L_0x006e
            r7.put(r0, r4)     // Catch:{ all -> 0x00c0 }
            goto L_0x0071
        L_0x006e:
            r7.putNull(r0)     // Catch:{ all -> 0x00c0 }
        L_0x0071:
            X.18h r1 = r3.A03     // Catch:{ all -> 0x00c0 }
            r0 = 2
            java.lang.Long r1 = r1.A00(r6, r0)     // Catch:{ all -> 0x00c0 }
            if (r1 == 0) goto L_0x007f
            java.lang.String r0 = "recipient_lid_identifier"
            r7.put(r0, r1)     // Catch:{ all -> 0x00c0 }
        L_0x007f:
            java.lang.String r8 = "timestamp"
            X.0wo r0 = r3.A02     // Catch:{ all -> 0x00c0 }
            long r3 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x00c0 }
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0     // Catch:{ all -> 0x00c0 }
            long r3 = r3 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00c0 }
            r7.put(r8, r0)     // Catch:{ all -> 0x00c0 }
            X.14e r3 = r5.A02     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = "identities"
            java.lang.String r0 = "SignalIdentityKeyStore/saveIdentity"
            long r3 = r3.A07(r1, r0, r7)     // Catch:{ all -> 0x00c0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            r1.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "axolotl saved identity for "
            r1.append(r0)     // Catch:{ all -> 0x00c0 }
            r1.append(r6)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = " with resultant row id "
            r1.append(r0)     // Catch:{ all -> 0x00c0 }
            r1.append(r3)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c0 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c0 }
            r5.close()     // Catch:{ all -> 0x0163 }
            goto L_0x0024
        L_0x00bd:
            r4 = 0
            goto L_0x003a
        L_0x00c0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x0163 }
            throw r0     // Catch:{ all -> 0x0163 }
        L_0x00c7:
            r10.A00()     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = "axolotl saved identity completed successfully"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0163 }
            r10.close()     // Catch:{ all -> 0x016d }
            r11.close()     // Catch:{ all -> 0x0177 }
            java.util.Set r0 = r12.entrySet()     // Catch:{ all -> 0x0177 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0177 }
        L_0x00dd:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0177 }
            if (r0 == 0) goto L_0x015f
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x0177 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0177 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x0177 }
            X.6EZ r0 = (X.AnonymousClass6EZ) r0     // Catch:{ all -> 0x0177 }
            com.whatsapp.jid.DeviceJid r4 = X.C133256Xm.A03(r0)     // Catch:{ all -> 0x0177 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x0177 }
            X.3FZ r0 = (X.AnonymousClass3FZ) r0     // Catch:{ all -> 0x0177 }
            if (r4 == 0) goto L_0x00dd
            if (r13 != 0) goto L_0x0105
            if (r0 == 0) goto L_0x00dd
            X.18c r0 = r15.A02     // Catch:{ all -> 0x0177 }
            r0.A00(r4)     // Catch:{ all -> 0x0177 }
            goto L_0x00dd
        L_0x0105:
            if (r0 != 0) goto L_0x0127
            X.18c r1 = r15.A02     // Catch:{ all -> 0x0177 }
            X.18I r0 = r1.A00     // Catch:{ all -> 0x0177 }
            X.79X r3 = r0.A08(r4)     // Catch:{ all -> 0x0177 }
            java.lang.Iterable r0 = r1.getObservers()     // Catch:{ all -> 0x0153 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0153 }
        L_0x0117:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0153 }
            if (r0 == 0) goto L_0x014d
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0153 }
            X.4UK r0 = (X.AnonymousClass4UK) r0     // Catch:{ all -> 0x0153 }
            r0.BZ0(r4)     // Catch:{ all -> 0x0153 }
            goto L_0x0117
        L_0x0127:
            boolean r0 = r13.equals(r0)     // Catch:{ all -> 0x0177 }
            if (r0 != 0) goto L_0x00dd
            X.18c r1 = r15.A02     // Catch:{ all -> 0x0177 }
            X.18I r0 = r1.A00     // Catch:{ all -> 0x0177 }
            X.79X r3 = r0.A08(r4)     // Catch:{ all -> 0x0177 }
            java.lang.Iterable r0 = r1.getObservers()     // Catch:{ all -> 0x0153 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0153 }
        L_0x013d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0153 }
            if (r0 == 0) goto L_0x014d
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0153 }
            X.4UK r0 = (X.AnonymousClass4UK) r0     // Catch:{ all -> 0x0153 }
            r0.BZ1(r4)     // Catch:{ all -> 0x0153 }
            goto L_0x013d
        L_0x014d:
            if (r3 == 0) goto L_0x00dd
            r3.close()     // Catch:{ all -> 0x0177 }
            goto L_0x00dd
        L_0x0153:
            r1 = move-exception
            if (r3 == 0) goto L_0x0176
            r3.close()     // Catch:{ all -> 0x015a }
            goto L_0x0176
        L_0x015a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0177 }
            goto L_0x0176
        L_0x015f:
            X.AnonymousClass18I.A05(r2)
            return
        L_0x0163:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0168 }
            goto L_0x016c
        L_0x0168:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x016d }
        L_0x016c:
            throw r1     // Catch:{ all -> 0x016d }
        L_0x016d:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0172 }
            goto L_0x0176
        L_0x0172:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0177 }
        L_0x0176:
            throw r1     // Catch:{ all -> 0x0177 }
        L_0x0177:
            r0 = move-exception
            X.AnonymousClass18I.A05(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass189.A01(X.3FZ, X.6EZ, X.189):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0109, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0110, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0114, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3FZ A0B(X.AnonymousClass6EZ r11) {
        /*
            r10 = this;
            X.6EZ r4 = r10.A0F(r11)
            X.18I r0 = r10.A0K
            X.79X r3 = X.AnonymousClass18I.A00(r4, r0)
            X.AnonymousClass18I.A03(r3, r0)
            X.18l r2 = r10.A07     // Catch:{ all -> 0x0115 }
            r7 = 0
            X.AnonymousClass00C.A0D(r4, r7)     // Catch:{ all -> 0x0115 }
            X.0yC r5 = r2.A05     // Catch:{ all -> 0x0115 }
            r1 = 6484(0x1954, float:9.086E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x0115 }
            boolean r0 = X.C20800yB.A01(r0, r5, r1)     // Catch:{ all -> 0x0115 }
            if (r0 == 0) goto L_0x004c
            X.18h r1 = r2.A03     // Catch:{ all -> 0x0115 }
            r0 = 2
            java.lang.Long r8 = r1.A00(r4, r0)     // Catch:{ all -> 0x0115 }
            if (r8 == 0) goto L_0x004d
            r0 = 3
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0115 }
            r6[r7] = r0     // Catch:{ all -> 0x0115 }
            r1 = 1
            int r0 = r4.A01     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0115 }
            r6[r1] = r0     // Catch:{ all -> 0x0115 }
            r1 = 2
            int r0 = r4.A00     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0115 }
            r6[r1] = r0     // Catch:{ all -> 0x0115 }
            java.lang.String r7 = "SELECT public_key, timestamp FROM identities WHERE recipient_lid_identifier =? AND recipient_type = ? AND device_id =?"
        L_0x0045:
            X.18M r0 = r2.A04     // Catch:{ all -> 0x0115 }
            X.1M0 r5 = r0.get()     // Catch:{ all -> 0x0115 }
            goto L_0x0054
        L_0x004c:
            r8 = 0
        L_0x004d:
            java.lang.String[] r6 = r4.A00()     // Catch:{ all -> 0x0115 }
            java.lang.String r7 = "SELECT public_key, timestamp FROM identities WHERE recipient_id =? AND recipient_type = ? AND device_id =?"
            goto L_0x0045
        L_0x0054:
            X.14e r2 = r5.A02     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r1.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "SignalIdentityKeyStore/getIdentityPublicKey"
            r1.append(r0)     // Catch:{ all -> 0x010e }
            if (r8 == 0) goto L_0x0063
            goto L_0x0066
        L_0x0063:
            java.lang.String r0 = ""
            goto L_0x0068
        L_0x0066:
            java.lang.String r0 = "_lid_identifier"
        L_0x0068:
            r1.append(r0)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x010e }
            android.database.Cursor r8 = r2.A09(r7, r0, r6)     // Catch:{ all -> 0x010e }
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x0107 }
            if (r0 != 0) goto L_0x0094
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            r1.<init>()     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = "axolotl found no identity entry for "
            r1.append(r0)     // Catch:{ all -> 0x0107 }
            r1.append(r4)     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0107 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0107 }
            r8.close()     // Catch:{ all -> 0x010e }
            r5.close()     // Catch:{ all -> 0x0115 }
            goto L_0x0100
        L_0x0094:
            java.lang.String r0 = "public_key"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0107 }
            byte[] r9 = r8.getBlob(r0)     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = "timestamp"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0107 }
            long r0 = r8.getLong(r0)     // Catch:{ all -> 0x0107 }
            r2 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r2     // Catch:{ all -> 0x0107 }
            long r0 = r0 * r6
            java.util.Date r2 = new java.util.Date     // Catch:{ all -> 0x0107 }
            r2.<init>(r0)     // Catch:{ all -> 0x0107 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            r1.<init>()     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = "axolotl found an identity entry for "
            r1.append(r0)     // Catch:{ all -> 0x0107 }
            r1.append(r4)     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = " dated "
            r1.append(r0)     // Catch:{ all -> 0x0107 }
            r1.append(r2)     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0107 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0107 }
            r8.close()     // Catch:{ all -> 0x010e }
            r5.close()     // Catch:{ all -> 0x0115 }
            if (r9 == 0) goto L_0x0100
            X.3IG r1 = X.C133256Xm.A01(r9)     // Catch:{ 110 -> 0x00df }
            X.3FZ r0 = new X.3FZ     // Catch:{ 110 -> 0x00df }
            r0.<init>(r1)     // Catch:{ 110 -> 0x00df }
            goto L_0x0101
        L_0x00df:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r1.<init>()     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = "axolotl identity key for "
            r1.append(r0)     // Catch:{ all -> 0x0115 }
            r1.append(r4)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = " decoded as invalid"
            r1.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0115 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0115 }
            java.util.List r0 = java.util.Collections.singletonList(r4)     // Catch:{ all -> 0x0115 }
            r10.A03(r0)     // Catch:{ all -> 0x0115 }
        L_0x0100:
            r0 = 0
        L_0x0101:
            if (r3 == 0) goto L_0x0106
            r3.close()
        L_0x0106:
            return r0
        L_0x0107:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ all -> 0x010e }
            throw r0     // Catch:{ all -> 0x010e }
        L_0x010e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0110 }
        L_0x0110:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x0115 }
            throw r0     // Catch:{ all -> 0x0115 }
        L_0x0115:
            r1 = move-exception
            if (r3 == 0) goto L_0x0120
            r3.close()     // Catch:{ all -> 0x011c }
            throw r1
        L_0x011c:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0120:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass189.A0B(X.6EZ):X.3FZ");
    }

    public List A0L(AnonymousClass6EZ r7) {
        DeviceJid A032 = C133256Xm.A03(r7);
        if (A032 == null) {
            return Collections.singletonList(r7);
        }
        C234118j r2 = this.A0M;
        UserJid userJid = A032.userJid;
        AnonymousClass00C.A0D(userJid, 0);
        Set<UserJid> A0G2 = r2.A00.A0G(userJid);
        ArrayList arrayList = new ArrayList();
        for (UserJid fromUserJidAndDeviceIdNullable : A0G2) {
            DeviceJid fromUserJidAndDeviceIdNullable2 = DeviceJid.getFromUserJidAndDeviceIdNullable(fromUserJidAndDeviceIdNullable, A032.getDevice());
            boolean z = false;
            if (fromUserJidAndDeviceIdNullable2 != null) {
                z = true;
            }
            C18740tg.A0D(z, "DeviceJid must not be null");
            if (fromUserJidAndDeviceIdNullable2 != null) {
                arrayList.add(fromUserJidAndDeviceIdNullable2);
            }
        }
        return C133256Xm.A05(arrayList);
    }

    public void A0Q(AnonymousClass3FZ r3, AnonymousClass6EZ r4) {
        DeviceJid A032 = C133256Xm.A03(r4);
        C19730wQ r1 = this.A03;
        if (r1.A0N(A032)) {
            if (r1.A0L()) {
                C18740tg.A0B(r1.A0N(C133256Xm.A03(r4)));
            } else {
                Log.e("SignalCoordinator/saveIdentity - Not allowed to save my companion identity as primary");
                return;
            }
        }
        A01(r3, r4, this);
    }

    public void A0R(AnonymousClass6EZ r10) {
        DeviceJid A032;
        List<AnonymousClass6EZ> A0L2 = A0L(r10);
        HashSet hashSet = new HashSet(A0L2);
        AnonymousClass18I r0 = this.A0K;
        HashSet A092 = r0.A09(hashSet);
        try {
            r0.A0A(A092);
            C234318l r02 = this.A07;
            HashMap A062 = r02.A06(hashSet);
            HashMap A052 = r02.A05(A0L2);
            for (AnonymousClass6EZ r4 : A0L2) {
                boolean z = true;
                boolean z2 = false;
                if (A062.get(r4) != null) {
                    z2 = true;
                }
                boolean equals = Boolean.TRUE.equals(A052.get(r4));
                if (z2 && !equals) {
                    z = false;
                }
                C18740tg.A0D(z, "identity key was available but was not deleted");
                if (z2 && equals && (A032 = C133256Xm.A03(r4)) != null) {
                    this.A02.A00(A032);
                }
            }
        } finally {
            AnonymousClass18I.A05(A092);
        }
    }
}
