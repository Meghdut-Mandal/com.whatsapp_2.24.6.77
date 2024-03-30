package X;

import android.content.Context;
import android.opengl.GLES30;
import android.os.Handler;
import android.os.Message;
import android.os.Trace;
import com.facebook.cameracore.logging.spars.xplatimpl.XplatSparsLogger;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: X.A1y  reason: case insensitive filesystem */
public class C20984A1y implements C23064B2n, Handler.Callback {
    public static final int[] A0R = {0, 1, 2, 3, 4};
    public float A00 = 1.0f;
    public Handler A01;
    public C191139Bu A02;
    public C191149Bv A03;
    public C23112B5r A04;
    public C201589jv A05;
    public List A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public Long A0E;
    public final C196059Xm A0F = new C196059Xm();
    public final C20980A1u A0G;
    public final A21 A0H;
    public final C198549dl A0I;
    public final C20998A2m A0J = new C20998A2m();
    public final boolean A0K;
    public final boolean A0L;
    public final Context A0M;
    public final AnonymousClass9C3 A0N;
    public final C1894393u A0O;
    public final List A0P = AnonymousClass001.A0I();
    public final boolean A0Q;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static X.AnonymousClass9NT A00(X.C20984A1y r18, X.AnonymousClass9NT r19) {
        /*
            r5 = r18
            r4 = r19
            X.A21 r3 = r5.A0H
            X.9VB r8 = r3.A05
            java.util.List r6 = r8.A00
            int r2 = r6.size()
            r1 = 0
        L_0x000f:
            if (r1 >= r2) goto L_0x0205
            java.lang.Object r0 = r6.get(r1)
            X.A20 r0 = (X.A20) r0
            X.7lR r0 = r0.A03
            if (r0 == 0) goto L_0x0085
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = "ProcessGlRenderer"
            android.os.Trace.beginSection(r0)
            int r2 = r4.A01
            int r0 = r5.A08
            r7 = 1
            r6 = 0
            if (r2 != r0) goto L_0x0034
            int r1 = r4.A02
            int r0 = r5.A0C
            if (r1 == r0) goto L_0x0071
        L_0x0034:
            r5.A08 = r2
            int r0 = r4.A02
            r5.A0C = r0
            int r2 = r2 + r0
            int r0 = r2 % 180
            if (r0 == 0) goto L_0x0080
            int r9 = r5.A0B
            int r2 = r5.A0D
        L_0x0043:
            X.9Xm r10 = r5.A0F
            float r1 = r5.A07
            X.A2s r0 = new X.A2s
            r0.<init>(r9, r2, r1)
            r9 = 0
            r10.A01(r0, r9)
            int r0 = r5.A0C
            int r0 = r0 % 180
            if (r0 == 0) goto L_0x007b
            int r2 = r5.A09
            int r1 = r5.A0A
        L_0x005a:
            X.A2q r0 = new X.A2q
            r0.<init>(r2, r1)
            r10.A01(r0, r9)
            int r0 = r5.A0C
            int r2 = r0 / 90
            int r0 = r5.A08
            int r1 = -r0
            X.A2r r0 = new X.A2r
            r0.<init>(r2, r1)
            r10.A01(r0, r9)
        L_0x0071:
            X.9Xm r2 = r5.A0F
            X.A2t r1 = X.C21005A2t.A00
            r0 = 0
            r2.A01(r1, r0)
            monitor-enter(r3)
            goto L_0x0088
        L_0x007b:
            int r2 = r5.A0A
            int r1 = r5.A09
            goto L_0x005a
        L_0x0080:
            int r9 = r5.A0D
            int r2 = r5.A0B
            goto L_0x0043
        L_0x0085:
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0088:
            r3.A02 = r7     // Catch:{ all -> 0x01bf }
            java.util.List r0 = r8.A00     // Catch:{ all -> 0x01bf }
            r19 = r0
            int r9 = r19.size()     // Catch:{ all -> 0x01bf }
            r8 = 0
        L_0x0093:
            if (r8 >= r9) goto L_0x01c2
            r0 = r19
            java.lang.Object r10 = r0.get(r8)     // Catch:{ all -> 0x01bf }
            X.A20 r10 = (X.A20) r10     // Catch:{ all -> 0x01bf }
            r17 = 1000(0x3e8, double:4.94E-321)
            X.7lR r0 = r10.A03     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x01bb
            boolean r0 = r0.isEnabled()     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x01bb
            X.9Rm r12 = r4.A05     // Catch:{ all -> 0x01bf }
            if (r12 == 0) goto L_0x00cc
            boolean r0 = r12.A00()     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x00cc
            X.A23 r11 = X.A21.A00(r3)     // Catch:{ all -> 0x01bf }
            int r0 = r12.A01     // Catch:{ all -> 0x01bf }
            float r0 = (float) r0     // Catch:{ all -> 0x01bf }
            float r1 = r3.A00     // Catch:{ all -> 0x01bf }
            int r2 = X.C90514aH.A06(r0, r1)     // Catch:{ all -> 0x01bf }
            int r0 = r12.A00     // Catch:{ all -> 0x01bf }
            float r0 = (float) r0     // Catch:{ all -> 0x01bf }
            int r1 = X.C90514aH.A06(r0, r1)     // Catch:{ all -> 0x01bf }
            int r0 = r4.A01     // Catch:{ all -> 0x01bf }
            r11.A02(r2, r1, r0)     // Catch:{ all -> 0x01bf }
        L_0x00cc:
            X.9jv r0 = r3.A01     // Catch:{ all -> 0x01b3 }
            X.9ST r16 = r0.A02()     // Catch:{ all -> 0x01b3 }
            X.A21.A00(r3)     // Catch:{ all -> 0x01b3 }
            X.A23 r2 = X.A21.A00(r3)     // Catch:{ all -> 0x01b3 }
            if (r16 == 0) goto L_0x01a3
            monitor-enter(r2)     // Catch:{ all -> 0x01b3 }
            X.67V r15 = r4.A04     // Catch:{ all -> 0x01a0 }
            if (r15 == 0) goto L_0x019e
            java.lang.RuntimeException r0 = r2.BP0()     // Catch:{ all -> 0x0196 }
            if (r0 != 0) goto L_0x019b
            X.9Rm r13 = r2.Bwr(r4)     // Catch:{ all -> 0x0196 }
            X.9Rm r1 = r4.A05     // Catch:{ all -> 0x0196 }
            if (r1 == 0) goto L_0x019b
            if (r13 == 0) goto L_0x019b
            boolean r0 = r1.A00()     // Catch:{ all -> 0x0196 }
            if (r0 == 0) goto L_0x019b
            boolean r0 = r13.A00()     // Catch:{ all -> 0x0196 }
            if (r0 == 0) goto L_0x019b
            X.6NG r12 = r10.A05     // Catch:{ all -> 0x0196 }
            float[] r14 = r1.A03     // Catch:{ all -> 0x0196 }
            float[] r11 = r13.A03     // Catch:{ all -> 0x0196 }
            long r0 = r4.A03     // Catch:{ all -> 0x0196 }
            r12.A01 = r15     // Catch:{ all -> 0x0196 }
            r12.A04 = r14     // Catch:{ all -> 0x0196 }
            r12.A05 = r11     // Catch:{ all -> 0x0196 }
            float[] r11 = X.AnonymousClass6NG.A06     // Catch:{ all -> 0x0196 }
            r12.A03 = r11     // Catch:{ all -> 0x0196 }
            r12.A02 = r11     // Catch:{ all -> 0x0196 }
            r12.A00 = r0     // Catch:{ all -> 0x0196 }
            int r1 = r13.A01     // Catch:{ all -> 0x0196 }
            int r0 = r13.A00     // Catch:{ all -> 0x0196 }
            android.opengl.GLES20.glViewport(r6, r6, r1, r0)     // Catch:{ all -> 0x0196 }
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.opengl.GLES20.glClearColor(r0, r0, r0, r1)     // Catch:{ all -> 0x0196 }
            r0 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r0)     // Catch:{ all -> 0x0196 }
            X.7lR r14 = r10.A03     // Catch:{ all -> 0x0196 }
            if (r14 == 0) goto L_0x013d
            int r0 = r10.A01     // Catch:{ all -> 0x0196 }
            int r11 = r13.A01     // Catch:{ all -> 0x0196 }
            if (r0 != r11) goto L_0x0134
            int r1 = r10.A00     // Catch:{ all -> 0x0196 }
            int r0 = r13.A00     // Catch:{ all -> 0x0196 }
            if (r1 == r0) goto L_0x013d
        L_0x0134:
            r10.A01 = r11     // Catch:{ all -> 0x0196 }
            int r0 = r13.A00     // Catch:{ all -> 0x0196 }
            r10.A00 = r0     // Catch:{ all -> 0x0196 }
            r14.Bij(r11, r0)     // Catch:{ all -> 0x0196 }
        L_0x013d:
            X.9ST r0 = r10.A02     // Catch:{ all -> 0x0196 }
            if (r0 == 0) goto L_0x019b
            X.7lR r0 = r10.A03     // Catch:{ all -> 0x0196 }
            if (r0 == 0) goto L_0x019b
            boolean r0 = r0.isEnabled()     // Catch:{ all -> 0x0196 }
            if (r0 == 0) goto L_0x019b
            long r0 = r12.A00     // Catch:{ all -> 0x0196 }
            long r0 = r0 / r17
            boolean r11 = r10.A04     // Catch:{ all -> 0x0196 }
            if (r11 != 0) goto L_0x0158
            X.4rd r11 = r10.A07     // Catch:{ all -> 0x0196 }
            r11.BWE(r12, r0)     // Catch:{ all -> 0x0196 }
        L_0x0158:
            X.7lR r14 = r10.A03     // Catch:{ all -> 0x0196 }
            boolean r11 = r14 instanceof X.C20995A2j     // Catch:{ all -> 0x0196 }
            if (r11 == 0) goto L_0x016d
            r11 = r14
            X.A2j r11 = (X.C20995A2j) r11     // Catch:{ all -> 0x0196 }
            X.9Gy r15 = r10.A06     // Catch:{ all -> 0x0196 }
            X.9Gy r13 = r11.A0Q     // Catch:{ all -> 0x0196 }
            java.lang.Integer r11 = r15.A01     // Catch:{ all -> 0x0196 }
            r13.A01 = r11     // Catch:{ all -> 0x0196 }
            java.lang.Integer r11 = r15.A00     // Catch:{ all -> 0x0196 }
            r13.A00 = r11     // Catch:{ all -> 0x0196 }
        L_0x016d:
            boolean r0 = r14.BWE(r12, r0)     // Catch:{ all -> 0x0196 }
            if (r0 == 0) goto L_0x019b
            r2.BvO()     // Catch:{ all -> 0x0196 }
            r16.A00()     // Catch:{ all -> 0x01a0 }
            monitor-exit(r2)     // Catch:{ all -> 0x01a0 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = "GL Error after renderFrame(): "
            java.lang.String r1 = X.AnonymousClass000.A0l(r10, r0, r1)     // Catch:{ all -> 0x01b3 }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x01b3 }
            X.C200339hB.A02(r1, r0)     // Catch:{ all -> 0x01b3 }
            X.A23 r0 = X.A21.A00(r3)     // Catch:{ all -> 0x01b3 }
            X.9NT r4 = r0.A07     // Catch:{ all -> 0x01b3 }
            boolean r0 = r3.A02     // Catch:{ all -> 0x01b3 }
            r0 = r0 ^ 1
            r3.A02 = r0     // Catch:{ all -> 0x01b3 }
            goto L_0x01bb
        L_0x0196:
            r0 = move-exception
            r16.A00()     // Catch:{ all -> 0x01a0 }
            throw r0     // Catch:{ all -> 0x01a0 }
        L_0x019b:
            r16.A00()     // Catch:{ all -> 0x01a0 }
        L_0x019e:
            monitor-exit(r2)     // Catch:{ all -> 0x01a0 }
            goto L_0x01a3
        L_0x01a0:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01a0 }
            throw r0     // Catch:{ all -> 0x01b3 }
        L_0x01a3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = "GL Error after skip renderFrame(): "
            java.lang.String r1 = X.AnonymousClass000.A0l(r10, r0, r1)     // Catch:{ all -> 0x01b3 }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x01b3 }
            X.C200339hB.A02(r1, r0)     // Catch:{ all -> 0x01b3 }
            goto L_0x01bb
        L_0x01b3:
            r2 = move-exception
            X.9jv r1 = r3.A01     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = "GlRenderChain.doFrame() error!"
            X.C201589jv.A01(r1, r0, r2)     // Catch:{ all -> 0x01bf }
        L_0x01bb:
            int r8 = r8 + 1
            goto L_0x0093
        L_0x01bf:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01c2:
            monitor-exit(r3)
            android.os.Trace.endSection()
            boolean r0 = r5.A0Q
            if (r0 == 0) goto L_0x0205
            X.9jv r0 = r5.A05
            X.6Xg r0 = r0.A04
            int r1 = r0.A01
            r0 = 3
            if (r1 < r0) goto L_0x0205
            java.lang.String r0 = "WaitForGpuCompletion"
            android.os.Trace.beginSection(r0)
            java.lang.Long r0 = r5.A0E
            if (r0 == 0) goto L_0x01f2
            long r2 = r0.longValue()
            r0 = 500000000(0x1dcd6500, double:2.47032823E-315)
            android.opengl.GLES30.glClientWaitSync(r2, r7, r0)
            java.lang.Long r0 = r5.A0E
            long r0 = r0.longValue()
            android.opengl.GLES30.glDeleteSync(r0)
            r0 = 0
            r5.A0E = r0
        L_0x01f2:
            r0 = 37143(0x9117, float:5.2048E-41)
            long r0 = android.opengl.GLES30.glFenceSync(r0, r6)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0E = r0
            android.opengl.GLES20.glFlush()
            android.os.Trace.endSection()
        L_0x0205:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20984A1y.A00(X.A1y, X.9NT):X.9NT");
    }

    public static void A01(C20984A1y a1y, AnonymousClass9NT r5) {
        C194849Rm r1;
        C20980A1u a1u = a1y.A0G;
        if (a1u != null) {
            Trace.beginSection("PostProcessCpuFrames");
            if (a1u.A03 && (r1 = r5.A05) != null && r1.A00()) {
                A23 a23 = a1u.A00;
                if (a23 != null) {
                    a23.A02(r1.A01, r1.A00, r5.A01);
                }
                a1u.A01.A01(r5);
                a1u.A04 = true;
            }
            Trace.endSection();
        }
    }

    private void A03(List list) {
        Object obj;
        AnonymousClass9ST r0;
        if (this.A05 == null) {
            this.A06 = list;
            return;
        }
        List list2 = this.A0P;
        ArrayList A15 = C36441kJ.A15(list2);
        ArrayList A0I2 = AnonymousClass001.A0I();
        list2.clear();
        ArrayList A0I3 = AnonymousClass001.A0I();
        for (int i = 0; i < list.size(); i++) {
            C160697lR r2 = (C160697lR) list.get(i);
            list2.add(r2);
            if (!A15.remove(r2)) {
                A0I2.add(r2);
            }
            A20 a20 = new A20();
            C160697lR r02 = a20.A03;
            if (r02 != r2) {
                if (r02 != null) {
                    r02.Bil();
                }
                a20.A03 = r2;
                a20.A04 = r2 instanceof C17570rd;
                if (!(r2 == null || (r0 = a20.A02) == null)) {
                    r2.Bik(r0.A04);
                }
            }
            A0I3.add(a20);
        }
        int size = A15.size();
        for (int i2 = 0; i2 < size; i2++) {
            C160697lR r7 = (C160697lR) A15.get(i2);
            if (r7 instanceof C23015B0g) {
                ((C23015B0g) r7).Brw((C196059Xm) null);
            }
            if (r7 instanceof C20995A2j) {
                C20995A2j a2j = (C20995A2j) r7;
                AnonymousClass6YR.A01(C165607th.A0j(a2j), "null", "FbMsqrdRenderer", "FbMsqrdRenderer %s - setLogger %s");
                a2j.A0a = null;
            }
        }
        C196059Xm r72 = this.A0F;
        C23112B5r b5r = this.A04;
        int size2 = A0I2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C160697lR r10 = (C160697lR) A0I2.get(i3);
            if (r10 instanceof C23015B0g) {
                ((C23015B0g) r10).Brw(r72);
            }
            if (r10 instanceof C20995A2j) {
                C20995A2j a2j2 = (C20995A2j) r10;
                Integer A0j = C165607th.A0j(a2j2);
                if (b5r != null) {
                    obj = C165607th.A0j(b5r);
                } else {
                    obj = "null";
                }
                AnonymousClass6YR.A01(A0j, obj, "FbMsqrdRenderer", "FbMsqrdRenderer %s - setLogger %s");
                a2j2.A0a = b5r;
                if (b5r != null) {
                    boolean z = b5r instanceof AnonymousClass88U;
                    if (z) {
                        AnonymousClass6YR.A07("FbMsqrdRenderer", "Dummy Logger used !!!");
                    }
                    QuickPerformanceLogger A002 = C1904898p.A00();
                    if (A002 != null) {
                        short s = 2;
                        if (z) {
                            s = 3;
                        }
                        A002.markerGenerate(11282540, s, 1, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
        A21 a21 = this.A0H;
        synchronized (a21) {
            ArrayList A0I4 = AnonymousClass001.A0I();
            ArrayList A152 = C36441kJ.A15(A0I3);
            AnonymousClass9VB r8 = a21.A05;
            List list3 = r8.A00;
            int size3 = list3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                A20 a202 = (A20) list3.get(i4);
                if (A152.remove(a202)) {
                    A0I3.set(A0I3.indexOf(a202), a202);
                } else {
                    A0I4.add(a202);
                }
            }
            int size4 = A0I4.size();
            for (int i5 = 0; i5 < size4; i5++) {
                A20 a203 = (A20) A0I4.get(i5);
                if (a203 instanceof C23064B2n) {
                    a21.A01.A04(a203);
                }
            }
            int size5 = A152.size();
            for (int i6 = 0; i6 < size5; i6++) {
                A20 a204 = (A20) A152.get(i6);
                if (a204 instanceof C23064B2n) {
                    a21.A01.A03(a204);
                }
            }
            r8.A00();
            synchronized (r8) {
                if (!A0I3.isEmpty()) {
                    int size6 = A0I3.size();
                    ArrayList A0n = C165587tf.A0n(r8.A00, size6);
                    A0n.addAll(r8.A00);
                    boolean z2 = false;
                    for (int i7 = 0; i7 < size6; i7++) {
                        Object obj2 = A0I3.get(i7);
                        if (!r8.A00.contains(obj2)) {
                            A0n.add(obj2);
                            z2 = true;
                        }
                    }
                    if (z2) {
                        r8.A00 = Collections.unmodifiableList(A0n);
                    }
                }
            }
        }
    }

    public void A04(int i, int i2, int i3, int i4, int i5, boolean z) {
        Integer num;
        if (i == 0) {
            float f = this.A00;
            this.A0A = C90514aH.A06((float) i2, f);
            this.A09 = C90514aH.A06((float) i3, f);
            this.A0D = i4;
            this.A0B = i5;
            this.A07 = AnonymousClass000.A0X(this.A0M).density;
            this.A08 = 0;
            this.A0C = 0;
            C20980A1u a1u = this.A0G;
            if (a1u != null) {
                int i6 = this.A0A;
                int i7 = this.A09;
                C204269pj r3 = a1u.A05;
                if (i6 > 0 && i7 > 0) {
                    int max = Math.max(i6, i7);
                    int i8 = (i6 * 600) / max;
                    r3.A02 = i8;
                    int i9 = (i7 * 600) / max;
                    r3.A01 = i9;
                    r3.A02 = i8 - (i8 % 2);
                    r3.A01 = i9 - (i9 % 2);
                }
                if (r3.A0D) {
                    r3.A05.post(r3.A08);
                }
            }
            C196059Xm r5 = this.A0F;
            r5.A01(new C21000A2o(), (C23015B0g) null);
            r5.A01(new C21002A2q(this.A0A, this.A09), (C23015B0g) null);
            if (z) {
                num = C023109s.A00;
            } else {
                num = C023109s.A01;
            }
            r5.A01(new C21001A2p(num), (C23015B0g) null);
            r5.A01(new C21003A2r(this.A0C / 90, this.A08), (C23015B0g) null);
            r5.A01(new C21004A2s(this.A0D, this.A0B, this.A07), (C23015B0g) null);
        }
    }

    public void B1T(AnonymousClass9ST r6) {
        C196059Xm r4 = this.A0F;
        C197729cH r3 = r4.A01;
        if (r3.A00.compareAndSet(false, true)) {
            C197729cH.A00(r3);
        }
        r4.A00.A01.set(true);
    }

    public void B5N() {
        Long l = this.A0E;
        if (l != null) {
            GLES30.glDeleteSync(l.longValue());
            this.A0E = null;
        }
        C196059Xm r2 = this.A0F;
        r2.A01.A00.set(false);
        r2.A00.A01.set(false);
    }

    public void BKM(C201589jv r5) {
        this.A05 = r5;
        r5.A03(this.A0H);
        C20980A1u a1u = this.A0G;
        if (a1u != null) {
            this.A05.A03(a1u);
        }
        Handler handler = this.A01;
        if (handler == null || handler.getLooper() != this.A05.A00.getLooper()) {
            this.A01 = new Handler(this.A05.A00.getLooper(), this);
        }
        this.A0F.A02(new C21007A2v(this), AnonymousClass905.A02);
        List list = this.A06;
        if (list != null) {
            C20996A2k a2k = new C20996A2k(list);
            Objects.requireNonNull(this.A01);
            AnonymousClass000.A14(this.A01, a2k, 1);
            this.A06 = null;
        }
    }

    public boolean handleMessage(Message message) {
        C22884Axf axf;
        C23015B0g b0g;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                Object obj = message.obj;
                Objects.requireNonNull(obj);
                Object[] objArr = (Object[]) obj;
                axf = (C22884Axf) objArr[0];
                b0g = (C23015B0g) objArr[1];
            }
            return true;
        }
        Object obj2 = message.obj;
        Objects.requireNonNull(obj2);
        axf = (C22884Axf) obj2;
        b0g = null;
        A02(axf, b0g);
        return true;
    }

    public void release() {
        List list = this.A0P;
        if (list.size() > 0) {
            this.A06 = C36441kJ.A15(list);
            A03(Collections.emptyList());
        }
        C196059Xm r2 = this.A0F;
        Arrays.fill(r2.A01.A02, false);
        r2.A00.A00.A00();
        r2.A02.clear();
        if (this.A03 != null) {
            XplatSparsLogger.flushAndDestroyConsistencyHelper();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0037, code lost:
        if (android.os.Build.VERSION.SDK_INT < 29) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20984A1y(android.content.Context r6, android.os.Handler r7, android.os.Handler r8, X.C1894393u r9, X.C198549dl r10, X.C23112B5r r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            r5 = this;
            r5.<init>()
            X.9Xm r0 = new X.9Xm
            r0.<init>()
            r5.A0F = r0
            X.A2m r0 = new X.A2m
            r0.<init>()
            r5.A0J = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r5.A0P = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.A00 = r0
            X.9C3 r4 = new X.9C3
            r4.<init>(r5)
            r5.A0N = r4
            r5.A04 = r11
            r5.A0I = r10
            X.A21 r0 = new X.A21
            r0.<init>(r10)
            r5.A0H = r0
            r3 = 0
            r5.A0K = r14
            if (r15 == 0) goto L_0x0039
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r0 = 1
            if (r2 >= r1) goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            r5.A0Q = r0
            if (r12 == 0) goto L_0x0043
            X.A1u r3 = new X.A1u
            r3.<init>(r8, r4, r10)
        L_0x0043:
            r5.A0G = r3
            r5.A0M = r6
            r5.A0L = r13
            X.9Xm r2 = r5.A0F
            r1 = 0
            X.BAl r0 = new X.BAl
            r0.<init>(r5, r1)
            r2.A00(r0)
            r1 = 1
            X.BAl r0 = new X.BAl
            r0.<init>(r5, r1)
            r2.A00(r0)
            r1 = 2
            X.BAl r0 = new X.BAl
            r0.<init>(r5, r1)
            r2.A00(r0)
            if (r7 == 0) goto L_0x0073
            android.os.Looper r1 = r7.getLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1, r5)
            r5.A01 = r0
        L_0x0073:
            r5.A0O = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20984A1y.<init>(android.content.Context, android.os.Handler, android.os.Handler, X.93u, X.9dl, X.B5r, boolean, boolean, boolean, boolean):void");
    }

    private void A02(C22884Axf axf, C23015B0g b0g) {
        C191139Bu r5;
        AnonymousClass905 BIb = axf.BIb();
        int ordinal = BIb.ordinal();
        if (ordinal == 33) {
            A03(((C20996A2k) axf).A00);
        } else if (ordinal == 39) {
            throw AnonymousClass001.A0A("mIsSingleFrameSource");
        } else if (ordinal != 38) {
            this.A0F.A01(axf, b0g);
        }
        if (BIb == AnonymousClass905.A0I && (r5 = this.A02) != null) {
            List<C160697lR> list = this.A0P;
            AnonymousClass83Z r8 = r5.A00;
            C23112B5r b5r = r8.A04;
            if (b5r != null) {
                ArrayList A0I2 = AnonymousClass001.A0I();
                for (C160697lR r7 : list) {
                    if ((r7 instanceof C20995A2j) && !(r7 instanceof C98564rd) && r7.isEnabled()) {
                        C114725hj r6 = new C114725hj();
                        C20995A2j a2j = (C20995A2j) r7;
                        HashMap A0J2 = AnonymousClass001.A0J();
                        A0J2.put("filter_type", "msqrd");
                        String str = a2j.A09;
                        if (str != null) {
                            A0J2.put("effect_id", str);
                        }
                        String str2 = a2j.A0A;
                        if (str2 != null) {
                            A0J2.put("effect_instance_id", str2);
                        }
                        C195439Uh r0 = a2j.A0Z;
                        if (r0 != null) {
                            A0J2.put("effect_session_id", r0.A06);
                        }
                        r6.A00 = A0J2;
                        r7.isEnabled();
                        A0I2.add(r6);
                    }
                }
                r8.A05.BCG("Lite-Controller-Thread").post(new C1503374w(r5, A0I2, b5r, 13));
            }
        }
    }
}
