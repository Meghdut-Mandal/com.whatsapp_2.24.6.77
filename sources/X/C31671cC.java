package X;

import android.text.TextUtils;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.LinkedHashSet;

/* renamed from: X.1cC  reason: invalid class name and case insensitive filesystem */
public class C31671cC implements C236319f {
    public final C19700wN A00;
    public final C19730wQ A01;
    public final AnonymousClass164 A02;
    public final AnonymousClass1LV A03;
    public final MemberSuggestedGroupsManager A04;
    public final AnonymousClass16D A05;
    public final C19970wo A06;
    public final C19630wG A07;
    public final C25271Fq A08;
    public final C220412q A09;
    public final AnonymousClass182 A0A;
    public final C20810yC A0B;
    public final C20350xQ A0C;
    public final C31681cD A0D;
    public final AnonymousClass1C4 A0E;
    public final C31691cE A0F;
    public final C19770wU A0G;
    public final C230717b A0H;
    public final C20510xg A0I;
    public final AnonymousClass19L A0J;

    public int[] BCF() {
        return new int[]{209};
    }

    public static LinkedHashSet A00(C203399nx r10, int i) {
        long j;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C203399nx r3 : r10.A0j("group")) {
            GroupJid groupJid = (GroupJid) r3.A0X(AnonymousClass147.class, "jid");
            String str = "";
            try {
                str = r3.A0i("subject", (String) null);
                j = ((long) r3.A0S("subject_ts", 0)) * 1000;
            } catch (C235919b e) {
                Log.e("cannot get group subject from notification", e);
                j = 0;
            }
            if (groupJid != null && !TextUtils.isEmpty(str)) {
                linkedHashSet.add(new AnonymousClass3QK(groupJid, str, i, j));
            }
        }
        return linkedHashSet;
    }

    public C31671cC(C19700wN r2, C19730wQ r3, AnonymousClass164 r4, AnonymousClass1LV r5, MemberSuggestedGroupsManager memberSuggestedGroupsManager, AnonymousClass16D r7, C19970wo r8, C19630wG r9, C25271Fq r10, C220412q r11, AnonymousClass182 r12, C20810yC r13, C20350xQ r14, C230717b r15, C20510xg r16, C31681cD r17, AnonymousClass1C4 r18, AnonymousClass19L r19, C31691cE r20, C19770wU r21) {
        this.A06 = r8;
        this.A0B = r13;
        this.A00 = r2;
        this.A01 = r3;
        this.A07 = r9;
        this.A0G = r21;
        this.A09 = r11;
        this.A0E = r18;
        this.A02 = r4;
        this.A0H = r15;
        this.A05 = r7;
        this.A0D = r17;
        this.A0C = r14;
        this.A0I = r16;
        this.A0J = r19;
        this.A03 = r5;
        this.A0F = r20;
        this.A08 = r10;
        this.A04 = memberSuggestedGroupsManager;
        this.A0A = r12;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v214, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v398, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v215, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v216, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v100, resolved type: com.whatsapp.jid.PhoneUserJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v231, resolved type: X.2cQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v232, resolved type: X.8nZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v233, resolved type: X.8nL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v234, resolved type: X.8nF} */
    /* JADX WARNING: type inference failed for: r0v322, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r9v101, types: [X.1ib] */
    /* JADX WARNING: type inference failed for: r12v63, types: [X.1ia] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1113:0x21c0 A[Catch:{ all -> 0x23d3, 0wR -> 0x2921 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1117:0x21d1 A[Catch:{ all -> 0x23d3, 0wR -> 0x2921 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1167:0x23d8 A[Catch:{ all -> 0x23d3, 0wR -> 0x2921 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1175:0x244b A[Catch:{ all -> 0x23d3, 0wR -> 0x2921 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1176:0x2452 A[Catch:{ all -> 0x23d3, 0wR -> 0x2921 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1193:0x24a2 A[Catch:{ all -> 0x23d3, 0wR -> 0x2921 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1194:0x24a4 A[Catch:{ all -> 0x23d3, 0wR -> 0x2921 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1257:0x264e A[Catch:{ all -> 0x23d3, 0wR -> 0x2921 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1258:0x2651 A[Catch:{ all -> 0x23d3, 0wR -> 0x2921 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1292:0x2702 A[Catch:{ all -> 0x23d3, 0wR -> 0x2921 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1299:0x2734 A[Catch:{ all -> 0x23d3, 0wR -> 0x2921 }, LOOP:25: B:1297:0x272e->B:1299:0x2734, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:1302:0x2765 A[Catch:{ all -> 0x23d3, 0wR -> 0x2921 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1308:0x2792 A[Catch:{ all -> 0x23d3, 0wR -> 0x2921 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1315:0x27c1 A[Catch:{ all -> 0x23d3, 0wR -> 0x2921 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1330:0x2838 A[Catch:{ all -> 0x23d3, 0wR -> 0x2921 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1337:0x288b A[ADDED_TO_REGION, Catch:{ all -> 0x23d3, 0wR -> 0x2921 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1350:0x28f5 A[Catch:{ all -> 0x23d3, 0wR -> 0x2921 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1354:0x2908 A[Catch:{ all -> 0x23d3, 0wR -> 0x2921 }, LOOP:26: B:1352:0x2902->B:1354:0x2908, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:1384:0x298e  */
    /* JADX WARNING: Removed duplicated region for block: B:693:0x1318  */
    /* JADX WARNING: Removed duplicated region for block: B:708:0x1388  */
    public boolean BJl(android.os.Message r88, int r89) {
        /*
            r87 = this;
            r3 = r87
            r7 = 0
            r0 = 209(0xd1, float:2.93E-43)
            r1 = r89
            if (r1 == r0) goto L_0x000a
            return r7
        L_0x000a:
            r2 = r88
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "stanzaKey"
            android.os.Parcelable r43 = r1.getParcelable(r0)
            r0 = r43
            X.9uj r0 = (X.C207209uj) r0
            r43 = r0
            java.lang.String r1 = "stanzaKey is null"
            X.C18740tg.A07(r0, r1)
            com.whatsapp.jid.UserJid r6 = r43.A00()
            java.lang.Object r2 = r2.obj
            X.9nx r2 = (X.C203399nx) r2
            X.9nx r1 = r2.A0a()
            r9 = 0
            boolean r18 = X.AnonymousClass143.A0I(r6)
            if (r18 == 0) goto L_0x004a
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r4 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r0 = "participant_pn"
            com.whatsapp.jid.Jid r9 = r2.A0X(r4, r0)
            com.whatsapp.jid.PhoneUserJid r9 = (com.whatsapp.jid.PhoneUserJid) r9
            if (r9 == 0) goto L_0x004a
            X.0xQ r0 = r3.A0C
            r4 = r6
            X.13w r4 = (X.C223313w) r4
            X.1PE r0 = r0.A0t
            r0.A00(r4, r9)
        L_0x004a:
            X.19L r8 = r3.A0J
            r0 = r43
            long r4 = r0.A00
            r0 = 2
            X.9ju r5 = X.AnonymousClass19L.A00(r8, r0, r4)
            X.8eO r5 = (X.C177798eO) r5
            r4 = 3
            if (r5 == 0) goto L_0x0061
            java.lang.String r0 = r1.A00
            r5.A00 = r0
            r5.A04(r4)
        L_0x0061:
            java.lang.String r4 = "addressing_mode"
            r0 = 0
            java.lang.String r0 = r2.A0i(r4, r0)
            java.lang.String r37 = X.C54102sP.A00(r0)
            r0 = r43
            com.whatsapp.jid.Jid r0 = r0.A02
            r27 = r0
            X.11F r4 = X.AnonymousClass143.A00(r27)
            android.os.Parcelable$Creator r0 = X.AnonymousClass147.CREATOR
            X.147 r14 = X.C65533Sl.A03(r4)
            X.12q r12 = r3.A09
            boolean r0 = r12.A0O(r14)
            if (r0 == 0) goto L_0x00a6
            java.lang.String r4 = "lid"
            r0 = r37
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a6
            X.0wN r5 = r3.A00
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            java.lang.String r0 = " is a CAG with LID addressing mode "
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "GroupLidInfra/cag_lid_addressing_mode"
            r5.A0E(r0, r4, r7)
        L_0x00a6:
            X.17b r5 = r3.A0H
            java.lang.String r0 = r1.A00
            r15 = r0
            r10 = 3
            r0 = 0
            r4 = r37
            boolean r4 = X.C230717b.A00(r5, r14, r4)
            r8 = 1
            if (r4 == 0) goto L_0x00e0
            java.lang.String r4 = "remove"
            boolean r4 = X.C203399nx.A0I(r1, r4)
            if (r4 == 0) goto L_0x1db0
            X.0wQ r4 = r3.A01
            r4.A0G()
            com.whatsapp.jid.PhoneUserJid r13 = r4.A03
            X.C18740tg.A06(r13)
            X.0wN r11 = r3.A00
            r5 = 2
            X.1yV r4 = new X.1yV
            r4.<init>(r11, r5)
            java.util.LinkedHashMap r5 = X.AnonymousClass3UA.A07(r1, r4)
            int r4 = r5.size()
            if (r4 != r8) goto L_0x1db0
            boolean r4 = r5.containsKey(r13)
            if (r4 == 0) goto L_0x1db0
        L_0x00e0:
            java.lang.String r11 = "t"
            r4 = 0
            long r25 = r2.A0V(r11, r4)
            r74 = 1000(0x3e8, double:4.94E-321)
            long r25 = r25 * r74
            int r11 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            if (r11 != 0) goto L_0x00f6
            X.0wo r11 = r3.A06
            long r25 = X.C19970wo.A00(r11)
        L_0x00f6:
            java.lang.String r11 = "add"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x01b8
            X.0wN r4 = r3.A00
            r10 = 2
            X.1yV r2 = new X.1yV
            r2.<init>(r4, r10)
            java.util.LinkedHashMap r9 = X.AnonymousClass3UA.A07(r1, r2)
            int r2 = r9.size()
            if (r2 <= 0) goto L_0x1dcd
            X.11F r2 = X.AnonymousClass143.A00(r27)
            X.147 r2 = X.C65533Sl.A03(r2)
            X.C18740tg.A06(r2)
            X.0xQ r5 = r3.A0C
            boolean r2 = r5.A0r(r2)
            if (r2 == 0) goto L_0x1dcd
            java.lang.String r2 = "reason"
            r29 = 0
            java.lang.String r35 = r1.A0i(r2, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "groupmgr/onGroupAddUsers/"
            r2.append(r1)
            r1 = r43
            r2.append(r1)
            java.lang.String r1 = "/"
            r2.append(r1)
            java.util.Collection r1 = r9.values()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.11F r1 = X.AnonymousClass143.A00(r27)
            X.147 r6 = X.C65533Sl.A03(r1)
            X.C18740tg.A06(r6)
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L_0x0176
            boolean r1 = X.C20350xQ.A0K(r5, r6, r9)
            if (r1 == 0) goto L_0x0171
            X.0xg r1 = r5.A0k
            r1.A0E(r6, r0, r10)
        L_0x0169:
            X.1C4 r1 = r5.A0s
        L_0x016b:
            r0 = r43
            r1.A01(r0)
        L_0x0170:
            return r8
        L_0x0171:
            X.1PE r1 = r5.A0t
            r1.A02(r9)
        L_0x0176:
            X.171 r1 = r5.A0D
            r1.A0d(r6)
            X.16D r1 = r5.A0C
            X.141 r1 = r1.A0A(r6)
            X.17X r12 = r5.A0U
            X.17r r2 = r12.A07
            X.6X6 r14 = r2.A0C(r6)
            if (r1 == 0) goto L_0x01a2
            X.0wQ r2 = r5.A05
            r20 = r2
            boolean r2 = r14.A0O(r2)
            if (r2 != 0) goto L_0x1dd1
            r20.A0G()
            r2 = r20
            com.whatsapp.jid.PhoneUserJid r2 = r2.A03
            boolean r2 = r9.containsKey(r2)
            if (r2 != 0) goto L_0x1dd1
        L_0x01a2:
            java.lang.String r2 = "groupmgr/onGroupAddUsers/requerygroupinfo"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0xg r2 = r5.A0k
            r2.A0E(r6, r0, r10)
            X.1O8 r2 = r5.A0u
            if (r1 != 0) goto L_0x01b5
            r0 = 0
        L_0x01b1:
            r2.A01(r6, r0, r10)
            goto L_0x0169
        L_0x01b5:
            int r0 = r1.A06
            goto L_0x01b1
        L_0x01b8:
            java.lang.String r11 = "create"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x01d8
            X.9nx r9 = r1.A0a()
            java.lang.String r11 = "type"
            java.lang.String r34 = ""
            r2 = r34
            java.lang.String r12 = r1.A0i(r11, r2)
            java.lang.String r2 = "group"
            boolean r2 = X.C203399nx.A0I(r9, r2)
            if (r2 == 0) goto L_0x1dcd
            goto L_0x1f20
        L_0x01d8:
            java.lang.String r11 = "delete"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x03c3
            java.lang.String r2 = "reason"
            java.lang.String r2 = r1.A0i(r2, r0)
            java.lang.String r1 = "delete_parent"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02db
            r4 = 1
        L_0x01ef:
            X.0xQ r1 = r3.A0C
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "groupmgr/onGroupDelete/"
            r3.append(r2)
            r2 = r43
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.11F r2 = X.AnonymousClass143.A00(r27)
            X.147 r5 = X.C65533Sl.A03(r2)
            if (r5 == 0) goto L_0x068d
            X.17u r2 = r1.A0T
            java.util.Map r2 = r2.A07
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L_0x068d
            r9 = 2
            if (r4 != r9) goto L_0x022f
            X.12q r4 = r1.A0M
            int r3 = r4.A06(r5)
            r14 = 0
            if (r3 == r8) goto L_0x0304
            if (r3 == r10) goto L_0x068d
            java.lang.String r0 = "groupmgr/onGroupDelete/Integrity Deactivate notification received for non-CAG"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r4 = 0
        L_0x022f:
            X.C20350xQ.A0F(r1, r5)
            X.1C4 r2 = r1.A0s
            r0 = r43
            r2.A01(r0)
            r11 = 3020(0xbcc, float:4.232E-42)
            if (r4 != r8) goto L_0x02c2
            X.1EM r0 = r1.A11
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0274
            X.12q r0 = r1.A0M
            int r0 = r0.A06(r5)
            if (r0 == r8) goto L_0x0274
            X.1Oo r13 = r1.A0c
            X.19x r3 = r1.A0x
            X.171 r2 = r1.A0D
            X.1LV r0 = r1.A08
            X.147 r0 = r0.A02(r5)
            java.lang.String r12 = r2.A0U(r0)
            X.19w r0 = r3.A01
            X.3Qa r7 = r0.A02(r5, r8)
            r4 = 87
            X.8nP r0 = new X.8nP
            r2 = r25
            r0.<init>(r7, r4, r2)
            r0.A00 = r12
            r0.A0q(r6)
            r13.BJb(r0, r9)
        L_0x0274:
            X.12q r7 = r1.A0M
            int r0 = r7.A06(r5)
            if (r0 != r8) goto L_0x0295
            X.1LV r0 = r1.A08
            r0.A0C(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "groupmgr/onGroupDelete/deletedParentGroup/jid = "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0295:
            int r2 = r7.A06(r5)
            if (r2 == r10) goto L_0x0300
            r0 = 6
            if (r2 != r0) goto L_0x0170
            X.0yC r3 = r1.A0a
            r2 = 5021(0x139d, float:7.036E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r3, r2)
            if (r0 == 0) goto L_0x0170
            X.C20350xQ.A0E(r1, r5)
            X.1Oo r4 = r1.A0c
            r7.A05(r5)
        L_0x02b2:
            X.8nT r3 = new X.8nT
            r0 = r25
            r2 = r43
            r3.<init>((X.C207209uj) r2, (long) r0)
            r3.A0q(r6)
            r4.BJb(r3, r11)
            return r8
        L_0x02c2:
            if (r4 != r10) goto L_0x02f2
            X.0yC r3 = r1.A0a
            r2 = 5021(0x139d, float:7.036E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r3, r2)
            if (r0 == 0) goto L_0x0170
            X.C20350xQ.A0E(r1, r5)
            X.1Oo r4 = r1.A0c
            X.12q r0 = r1.A0M
            r0.A05(r5)
            goto L_0x02b2
        L_0x02db:
            java.lang.String r1 = "integrity_delete_parent"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02e6
            r4 = 2
            goto L_0x01ef
        L_0x02e6:
            java.lang.String r1 = "deactivate_general_chat"
            boolean r1 = r1.equals(r2)
            r4 = 0
            if (r1 == 0) goto L_0x01ef
            r4 = 3
            goto L_0x01ef
        L_0x02f2:
            if (r4 != 0) goto L_0x0170
            X.0yC r3 = r1.A0a
            r2 = 5021(0x139d, float:7.036E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r3, r2)
            if (r0 == 0) goto L_0x0170
        L_0x0300:
            X.C20350xQ.A0E(r1, r5)
            return r8
        L_0x0304:
            X.1LV r12 = r1.A08
            X.17d r3 = r12.A08
            X.3QK r13 = r3.A00(r5)
            java.util.HashSet r11 = r12.A04(r5)
            java.util.Iterator r6 = r11.iterator()
        L_0x0314:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0329
            java.lang.Object r3 = r6.next()
            X.3QK r3 = (X.AnonymousClass3QK) r3
            int r3 = r3.A00
            if (r3 != r10) goto L_0x0314
            r6.remove()
            r14 = 1
            goto L_0x0314
        L_0x0329:
            X.1Lr r10 = r12.A09
            X.17d r6 = r10.A01
            r3 = 5
            X.3Tw r2 = new X.3Tw
            r2.<init>(r10, r3)
            java.util.HashSet r10 = r6.A01(r2, r5)
            X.16D r2 = r1.A0C
            r2.A0a(r5, r8)
            X.C20350xQ.A0F(r1, r5)
            if (r14 == 0) goto L_0x0366
            if (r13 == 0) goto L_0x0366
            com.whatsapp.jid.GroupJid r3 = r13.A02
            X.147 r6 = X.C65533Sl.A03(r3)
            X.C18740tg.A06(r6)
            X.C20350xQ.A0F(r1, r6)
            r2.A0a(r6, r8)
            X.1Oo r3 = r1.A0c
            X.19x r2 = r1.A0x
            r17 = 17
            r16 = r0
            r13 = r2
            r14 = r6
            r15 = r0
            r18 = r25
            X.8nz r0 = r13.A06(r14, r15, r16, r17, r18)
            r3.BJb(r0, r9)
        L_0x0366:
            X.0wU r3 = r12.A0C
            r2 = 18
            X.1iV r0 = new X.1iV
            r0.<init>(r11, r12, r5, r2)
            r3.Boy(r0)
            X.1iV r0 = new X.1iV
            r0.<init>(r10, r12, r5, r2)
            r3.Boy(r0)
            java.util.Iterator r11 = r11.iterator()
        L_0x037e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x068d
            java.lang.Object r0 = r11.next()
            X.3QK r0 = (X.AnonymousClass3QK) r0
            X.1Oo r9 = r1.A0c
            com.whatsapp.jid.GroupJid r0 = r0.A02
            X.147 r2 = X.C65533Sl.A03(r0)
            java.lang.String r0 = r4.A0D(r5)
            X.9Wj r10 = new X.9Wj
            r10.<init>(r5, r0, r8, r7)
            X.19x r0 = r1.A0x
            X.19w r0 = r0.A01
            X.3Qa r0 = r0.A02(r2, r8)
            X.8np r6 = new X.8np
            r2 = r25
            r6.<init>(r0, r2)
            com.whatsapp.jid.GroupJid r3 = r10.A02
            java.lang.String r2 = r10.A03
            X.9Wj r0 = new X.9Wj
            r0.<init>(r3, r2, r8, r7)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.AnonymousClass00C.A08(r0)
            r6.A1f(r0)
            r0 = 3010(0xbc2, float:4.218E-42)
            r9.BJb(r6, r0)
            goto L_0x037e
        L_0x03c3:
            java.lang.String r11 = "demote"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x0499
            X.0wN r2 = r3.A00
            r6 = 2
            X.1yV r0 = new X.1yV
            r0.<init>(r2, r6)
            java.util.LinkedHashMap r0 = X.AnonymousClass3UA.A07(r1, r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x1dcd
            X.0xQ r1 = r3.A0C
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "groupmgr/onGroupDemoteUsers/"
            r3.append(r2)
            r2 = r43
            r3.append(r2)
            java.lang.String r2 = "/"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.11F r2 = X.AnonymousClass143.A00(r27)
            X.147 r11 = X.C65533Sl.A03(r2)
            if (r11 == 0) goto L_0x068d
            X.17X r14 = r1.A0U
            X.17r r2 = r14.A07
            X.6X6 r13 = r2.A0C(r11)
            X.12q r3 = r1.A0M
            int r2 = r3.A05(r11)
            if (r2 == r10) goto L_0x041b
            r19 = 1
            if (r2 != r8) goto L_0x041d
        L_0x041b:
            r19 = 0
        L_0x041d:
            boolean r18 = r3.A0P(r11)
            X.17b r2 = r1.A0i
            boolean r17 = r2.A02(r11)
            X.1PE r2 = r1.A0t
            r2.A02(r0)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r16 = r0.iterator()
            r15 = 0
        L_0x0444:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x2931
            java.lang.Object r2 = r16.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getValue()
            X.3Kj r0 = (X.C63523Kj) r0
            boolean r3 = r0.A00()
            r5 = 0
            if (r3 == 0) goto L_0x0491
            X.13w r2 = r0.A00
            com.whatsapp.jid.UserJid r0 = r0.A02
            if (r17 == 0) goto L_0x0466
            r9.add(r0)
        L_0x0466:
            X.6PM r4 = X.C20350xQ.A01(r13, r1, r0, r7)
            X.C18740tg.A06(r4)
            if (r17 == 0) goto L_0x0473
            X.6PM r5 = X.C20350xQ.A01(r13, r1, r2, r7)
        L_0x0473:
            X.0wQ r3 = r1.A05
            com.whatsapp.jid.UserJid r2 = r4.A03
            boolean r2 = r3.A0M(r2)
            if (r2 == 0) goto L_0x047e
            r15 = 1
        L_0x047e:
            boolean r0 = X.AnonymousClass143.A0I(r0)
            if (r0 == 0) goto L_0x048d
            r10.add(r4)
        L_0x0487:
            if (r5 == 0) goto L_0x0444
            r10.add(r5)
            goto L_0x0444
        L_0x048d:
            r12.add(r4)
            goto L_0x0487
        L_0x0491:
            java.lang.Object r0 = r2.getKey()
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r2 = r5
            goto L_0x0466
        L_0x0499:
            java.lang.String r11 = "linked_group_demote"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x053c
            X.0wN r5 = r3.A00
            r2 = 2
            X.1yV r4 = new X.1yV
            r4.<init>(r5, r2)
            java.util.LinkedHashMap r4 = X.AnonymousClass3UA.A07(r1, r4)
            X.1C4 r5 = r3.A0E
            r1 = r43
            r5.A01(r1)
            X.0xQ r6 = r3.A0C
            X.1EM r1 = r6.A11
            boolean r1 = r1.A01()
            if (r1 == 0) goto L_0x0170
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0170
            X.11F r1 = X.AnonymousClass143.A00(r27)
            X.147 r5 = X.C65533Sl.A03(r1)
            X.C18740tg.A06(r5)
            int r1 = r12.A05(r5)
            if (r1 != r10) goto L_0x0170
            X.17X r1 = r6.A0U
            boolean r1 = r1.A0D(r5)
            if (r1 != 0) goto L_0x04ea
            X.0wQ r1 = r6.A05
            r1.A0G()
            com.whatsapp.jid.PhoneUserJid r1 = r1.A03
            boolean r1 = r4.containsKey(r1)
            if (r1 == 0) goto L_0x0510
        L_0x04ea:
            X.1PE r1 = r6.A0t
            r1.A02(r4)
            X.1Oo r7 = r6.A0c
            X.19x r9 = r6.A0x
            r15 = 82
        L_0x04f5:
            com.whatsapp.jid.UserJid r12 = r43.A00()
            java.util.Set r6 = r4.keySet()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r6)
            r10 = r0
            r11 = r5
            r13 = r43
            r14 = r1
            r16 = r25
            X.8nz r0 = r9.A03(r10, r11, r12, r13, r14, r15, r16)
            r7.BJb(r0, r2)
        L_0x0510:
            X.0wQ r0 = r3.A01
            r0.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r0.A03
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x0170
            X.0yC r4 = r3.A0B
            r1 = 4184(0x1058, float:5.863E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r4, r1)
            if (r0 == 0) goto L_0x0170
            X.1LV r0 = r3.A03
            X.147 r4 = r0.A02(r5)
            if (r4 == 0) goto L_0x0170
            X.0wU r1 = r3.A0G
            X.1j3 r0 = new X.1j3
            r0.<init>(r5, r4, r3, r2)
            r1.Boy(r0)
            return r8
        L_0x053c:
            java.lang.String r11 = "modify"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x06a2
            X.0wN r2 = r3.A00
            r5 = 2
            X.1yV r0 = new X.1yV
            r0.<init>(r2, r5)
            java.util.LinkedHashMap r17 = X.AnonymousClass3UA.A07(r1, r0)
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x1dcd
            X.11F r0 = X.AnonymousClass143.A00(r27)
            X.147 r0 = X.C65533Sl.A03(r0)
            X.C18740tg.A06(r0)
            java.util.Collection r0 = r17.values()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            X.3Kj r0 = (X.C63523Kj) r0
            com.whatsapp.jid.UserJid r11 = r0.A02
            com.whatsapp.jid.PhoneUserJid r7 = r0.A01
            X.0xQ r1 = r3.A0C
            X.C18740tg.A06(r6)
            X.C18740tg.A06(r11)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "groupmgr/onGroupParticipantChangedNumber/"
            r2.append(r0)
            r0 = r43
            r2.append(r0)
            java.lang.String r0 = "/oldjid:"
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = "/newjid:"
            r2.append(r0)
            r2.append(r11)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11F r0 = X.AnonymousClass143.A00(r27)
            X.147 r12 = X.C65533Sl.A03(r0)
            X.C18740tg.A06(r12)
            X.16D r0 = r1.A0C
            X.141 r10 = r0.A0A(r12)
            X.17X r4 = r1.A0U
            X.17r r0 = r4.A07
            X.6X6 r3 = r0.A0C(r12)
            X.6PM r2 = r3.A08(r6)
            r3.A09(r6)
            X.0wQ r0 = r1.A05
            boolean r13 = r0.A0M(r11)
            if (r13 == 0) goto L_0x05cc
            r3.A09(r11)
        L_0x05cc:
            X.17i r13 = r1.A0Z
            java.util.HashSet r21 = r13.A0B(r11)
            r16 = 0
            if (r2 == 0) goto L_0x069f
            int r13 = r2.A01
        L_0x05d8:
            r23 = 0
            r24 = 1
            r19 = r3
            r20 = r11
            r22 = r13
            X.AnonymousClass6X6.A00(r19, r20, r21, r22, r23, r24)
            X.1P5 r14 = r1.A0p
            java.util.List r13 = java.util.Collections.singletonList(r6)
            r14.A0W(r12, r13)
            java.util.List r13 = java.util.Collections.singletonList(r6)
            X.C20350xQ.A0B(r1, r12, r13)
            if (r10 == 0) goto L_0x05ff
            boolean r13 = r3.A0O(r0)
            if (r13 == 0) goto L_0x05ff
            if (r2 != 0) goto L_0x0642
        L_0x05ff:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r13 = "groupmgr/onGroupParticipantChangedNumber/sendgetgroupinfo/"
            r14.append(r13)
            r15 = 1
            r13 = 0
            if (r10 != 0) goto L_0x060e
            r13 = 1
        L_0x060e:
            r14.append(r13)
            java.lang.String r13 = "/"
            r14.append(r13)
            boolean r0 = r3.A0O(r0)
            r0 = r0 ^ 1
            r14.append(r0)
            r14.append(r13)
            if (r2 == 0) goto L_0x0625
            r15 = 0
        L_0x0625:
            r14.append(r15)
            java.lang.String r0 = r14.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0xg r2 = r1.A0k
            r0 = 0
            r2.A0E(r12, r0, r5)
            X.1O8 r2 = r1.A0u
            if (r10 == 0) goto L_0x063d
            int r0 = r10.A06
            r16 = r0
        L_0x063d:
            r0 = r16
            r2.A01(r12, r0, r5)
        L_0x0642:
            X.1PE r2 = r1.A0t
            r0 = r17
            r2.A02(r0)
            if (r18 == 0) goto L_0x0698
            if (r9 == 0) goto L_0x0698
        L_0x064d:
            boolean r0 = X.AnonymousClass143.A0I(r11)
            if (r0 == 0) goto L_0x0691
            if (r7 == 0) goto L_0x0691
        L_0x0655:
            X.12q r0 = r1.A0M
            int r2 = r0.A05(r12)
            r0 = 3
            if (r2 != r0) goto L_0x066a
            boolean r0 = r4.A0D(r12)
            if (r0 != 0) goto L_0x066a
            boolean r0 = r4.A0J(r12, r11)
            if (r0 == 0) goto L_0x068d
        L_0x066a:
            if (r9 == 0) goto L_0x068d
            if (r7 == 0) goto L_0x068d
            X.1Oo r10 = r1.A0c
            X.19x r11 = r1.A0x
            X.19w r0 = r11.A01
            X.3Qa r6 = r0.A02(r12, r8)
            r0 = 10
            X.8nA r4 = new X.8nA
            r2 = r25
            r4.<init>(r6, r0, r2)
            X.0wN r0 = r11.A00
            r4.A02 = r0
            r4.A01 = r9
            r4.A1Z(r7)
            r10.BJb(r4, r5)
        L_0x068d:
            X.1C4 r1 = r1.A0s
            goto L_0x016b
        L_0x0691:
            boolean r0 = r11 instanceof com.whatsapp.jid.PhoneUserJid
            r7 = 0
            if (r0 == 0) goto L_0x0655
            r7 = r11
            goto L_0x0655
        L_0x0698:
            boolean r0 = r6 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 != 0) goto L_0x069d
            r6 = 0
        L_0x069d:
            r9 = r6
            goto L_0x064d
        L_0x069f:
            r13 = 0
            goto L_0x05d8
        L_0x06a2:
            java.lang.String r9 = "promote"
            boolean r9 = X.C203399nx.A0I(r1, r9)
            if (r9 == 0) goto L_0x0756
            X.0wN r2 = r3.A00
            r4 = 2
            X.1yV r0 = new X.1yV
            r0.<init>(r2, r4)
            java.util.LinkedHashMap r2 = X.AnonymousClass3UA.A07(r1, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x1dcd
            X.11F r0 = X.AnonymousClass143.A00(r27)
            X.147 r0 = X.C65533Sl.A03(r0)
            X.C18740tg.A06(r0)
            X.0xQ r1 = r3.A0C
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "groupmgr/onGroupPromoteUsers/"
            r3.append(r0)
            r0 = r43
            r3.append(r0)
            java.lang.String r0 = "/"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11F r0 = X.AnonymousClass143.A00(r27)
            X.147 r5 = X.C65533Sl.A03(r0)
            if (r5 == 0) goto L_0x068d
            X.17X r0 = r1.A0U
            X.17r r0 = r0.A07
            X.6X6 r7 = r0.A0C(r5)
            X.12q r0 = r1.A0M
            int r9 = r0.A05(r5)
            if (r9 == r10) goto L_0x0704
            r15 = 1
            if (r9 != r8) goto L_0x0705
        L_0x0704:
            r15 = 0
        L_0x0705:
            X.17b r0 = r1.A0i
            boolean r14 = r0.A02(r5)
            X.1PE r0 = r1.A0t
            r0.A02(r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r0 = r2.values()
            java.util.Iterator r13 = r0.iterator()
            r12 = 0
        L_0x0723:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x1075
            java.lang.Object r2 = r13.next()
            X.3Kj r2 = (X.C63523Kj) r2
            com.whatsapp.jid.UserJid r10 = r2.A02
            r11 = 0
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x073a
            X.13w r11 = r2.A00
        L_0x073a:
            X.6PM r2 = X.C20350xQ.A01(r7, r1, r10, r8)
            if (r14 == 0) goto L_0x0749
            X.6PM r0 = X.C20350xQ.A01(r7, r1, r11, r8)
            if (r0 == 0) goto L_0x0749
            r3.add(r0)
        L_0x0749:
            r6.add(r2)
            X.0wQ r0 = r1.A05
            boolean r0 = r0.A0M(r10)
            if (r0 == 0) goto L_0x0723
            r12 = 1
            goto L_0x0723
        L_0x0756:
            java.lang.String r9 = "linked_group_promote"
            boolean r9 = X.C203399nx.A0I(r1, r9)
            if (r9 == 0) goto L_0x07b7
            X.0wN r5 = r3.A00
            r2 = 2
            X.1yV r4 = new X.1yV
            r4.<init>(r5, r2)
            java.util.LinkedHashMap r4 = X.AnonymousClass3UA.A07(r1, r4)
            X.1C4 r5 = r3.A0E
            r1 = r43
            r5.A01(r1)
            X.0xQ r6 = r3.A0C
            X.1EM r1 = r6.A11
            boolean r1 = r1.A01()
            if (r1 == 0) goto L_0x0170
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0170
            X.11F r1 = X.AnonymousClass143.A00(r27)
            X.147 r5 = X.C65533Sl.A03(r1)
            X.C18740tg.A06(r5)
            int r1 = r12.A05(r5)
            if (r1 != r10) goto L_0x0170
            X.1LV r10 = r6.A08
            X.147 r9 = r10.A02(r5)
            if (r9 == 0) goto L_0x07aa
            X.0wQ r1 = r6.A05
            r1.A0G()
            com.whatsapp.jid.PhoneUserJid r1 = r1.A03
            boolean r1 = r4.containsKey(r1)
            if (r1 == 0) goto L_0x07aa
            r10.A0E(r9, r7)
        L_0x07aa:
            X.1PE r1 = r6.A0t
            r1.A02(r4)
            X.1Oo r7 = r6.A0c
            X.19x r9 = r6.A0x
            r15 = 81
            goto L_0x04f5
        L_0x07b7:
            java.lang.String r9 = "remove"
            boolean r9 = X.C203399nx.A0I(r1, r9)
            if (r9 == 0) goto L_0x0848
            java.lang.String r2 = "subject"
            r28 = 0
            java.lang.String r22 = r1.A0i(r2, r0)
            X.0wN r5 = r3.A00
            r4 = 2
            X.1yV r2 = new X.1yV
            r2.<init>(r5, r4)
            java.util.LinkedHashMap r2 = X.AnonymousClass3UA.A07(r1, r2)
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x1dcd
            X.11F r5 = X.AnonymousClass143.A00(r27)
            X.147 r5 = X.C65533Sl.A03(r5)
            X.C18740tg.A06(r5)
            X.0xQ r7 = r3.A0C
            boolean r5 = r7.A0r(r5)
            if (r5 == 0) goto L_0x1dcd
            java.lang.String r3 = "reason"
            java.lang.String r21 = r1.A0i(r3, r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "groupmgr/onGroupRemoveUsers/"
            r3.append(r1)
            r1 = r43
            r3.append(r1)
            java.lang.String r1 = "jids:"
            r3.append(r1)
            java.util.Set r1 = r2.keySet()
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.deepToString(r1)
            r3.append(r1)
            java.lang.String r1 = "/removedBy:"
            r3.append(r1)
            r3.append(r6)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.11F r1 = X.AnonymousClass143.A00(r27)
            X.147 r10 = X.C65533Sl.A03(r1)
            X.C18740tg.A06(r10)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x1107
            boolean r1 = X.C20350xQ.A0K(r7, r10, r2)
            if (r1 == 0) goto L_0x1107
            X.1C4 r2 = r7.A0s
            r1 = r43
            r2.A01(r1)
            X.0xg r1 = r7.A0k
            r1.A0E(r10, r0, r4)
            return r8
        L_0x0848:
            java.lang.String r9 = "subject"
            boolean r11 = X.C203399nx.A0I(r1, r9)
            if (r11 == 0) goto L_0x0896
            java.lang.String r2 = r1.A0i(r9, r0)
            java.lang.String r0 = "s_t"
            long r9 = r1.A0U(r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "s_o"
            com.whatsapp.jid.Jid r4 = r1.A0X(r4, r0)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            boolean r0 = X.AnonymousClass143.A0I(r4)
            if (r0 == 0) goto L_0x0880
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r5 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r0 = "s_o_pn"
            com.whatsapp.jid.Jid r5 = r1.A0X(r5, r0)
            com.whatsapp.jid.PhoneUserJid r5 = (com.whatsapp.jid.PhoneUserJid) r5
            if (r5 == 0) goto L_0x0880
            X.0xQ r0 = r3.A0C
            r1 = r4
            X.13w r1 = (X.C223313w) r1
            X.1PE r0 = r0.A0t
            r0.A00(r1, r5)
        L_0x0880:
            X.11F r0 = X.AnonymousClass143.A00(r27)
            X.147 r5 = X.C65533Sl.A03(r0)
            X.C18740tg.A06(r5)
            X.182 r0 = r3.A0A
            r22 = r0
            X.181 r1 = r0.A00
            java.util.Map r6 = r1.A02
            monitor-enter(r6)
            goto L_0x139d
        L_0x0896:
            java.lang.String r11 = "invite"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x08f6
            java.lang.String r2 = "code"
            java.lang.String r4 = r1.A0i(r2, r0)
            X.0xQ r5 = r3.A0C
            X.11F r1 = X.AnonymousClass143.A00(r27)
            X.C18740tg.A06(r1)
            X.147 r3 = X.C65533Sl.A03(r1)
            if (r3 == 0) goto L_0x29ee
            if (r4 == 0) goto L_0x29ee
            java.util.Map r1 = r5.A14
            r1.put(r3, r4)
            r2 = 6
            X.34g r1 = new X.34g
            r1.<init>(r3, r4)
            r5.A0T(r2, r1)
            X.1Oo r4 = r5.A0c
            X.19x r3 = r5.A0x
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "SystemMessageFactory/newInviteLinkRevokedMessage/stanzaKey="
            r2.append(r1)
            r1 = r43
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r13 = 21
            r11 = r0
            r9 = r3
            r10 = r0
            r12 = r43
            r14 = r25
            X.8nz r1 = r9.A04(r10, r11, r12, r13, r14)
            com.whatsapp.jid.UserJid r0 = r43.A00()
            r1.A0q(r0)
            r0 = 2
            r4.BJb(r1, r0)
            return r8
        L_0x08f6:
            java.lang.String r12 = "description"
            boolean r11 = X.C203399nx.A0I(r1, r12)
            if (r11 == 0) goto L_0x0a7e
            X.3QL r5 = X.AnonymousClass3UA.A05(r2, r2)
            com.whatsapp.jid.UserJid r0 = r5.A02
            r19 = r0
            boolean r0 = X.AnonymousClass143.A0I(r19)
            if (r0 == 0) goto L_0x091b
            com.whatsapp.jid.PhoneUserJid r2 = r5.A01
            if (r2 == 0) goto L_0x091b
            X.0xQ r0 = r3.A0C
            r1 = r19
            X.13w r1 = (X.C223313w) r1
            X.1PE r0 = r0.A0t
            r0.A00(r1, r2)
        L_0x091b:
            X.0xQ r6 = r3.A0C
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/onGroupNewDescription/"
            r1.append(r0)
            r0 = r43
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11F r0 = X.AnonymousClass143.A00(r27)
            X.147 r9 = X.C65533Sl.A03(r0)
            X.C18740tg.A06(r9)
            X.12q r0 = r6.A0M
            int r2 = r0.A05(r9)
            X.16D r1 = r6.A0C
            X.141 r0 = r1.A0A(r9)
            if (r2 != r8) goto L_0x09ff
            if (r0 == 0) goto L_0x2b91
            X.3QL r0 = r0.A0K
            if (r0 == 0) goto L_0x2b91
            java.lang.String r0 = r0.A03
            java.lang.String r11 = r5.A03
            boolean r0 = android.text.TextUtils.equals(r0, r11)
            if (r0 != 0) goto L_0x0a77
            java.lang.String r0 = "groupmgr/onParentGroupNewDescription/changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A0c(r9, r5)
            X.147 r12 = X.C20350xQ.A02(r6, r9)
            if (r12 == 0) goto L_0x09f9
            X.1Cv r0 = r6.A0W
            X.3T1 r10 = r0.A05(r9)
            X.3T1 r4 = r0.A05(r12)
            if (r10 == 0) goto L_0x29f4
            boolean r0 = r4 instanceof X.AnonymousClass2bI
            if (r0 == 0) goto L_0x29f4
            r7 = r4
            X.2bI r7 = (X.AnonymousClass2bI) r7
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r5.A00
            long r0 = r0.toMillis(r2)
            long r13 = r7.A0I
            boolean r18 = X.AnonymousClass6XI.A04(r13, r0)
            long r13 = r7.A0I
            long r0 = r0 - r13
            long r16 = java.lang.Math.abs(r0)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 15
            long r13 = r13.toMillis(r0)
            r15 = 1
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            r14 = 0
            if (r0 > 0) goto L_0x09a9
            r14 = 1
        L_0x09a9:
            java.lang.String r0 = r7.A0b()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x09ba
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r13 = 1
            if (r0 == 0) goto L_0x09bb
        L_0x09ba:
            r13 = 0
        L_0x09bb:
            int r1 = r7.A00
            r0 = 131(0x83, float:1.84E-43)
            if (r1 != r0) goto L_0x09fd
            X.11F r1 = r7.A0J()
            if (r1 == 0) goto L_0x09fd
            r0 = r19
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x09fd
        L_0x09cf:
            if (r18 == 0) goto L_0x29f4
            if (r14 == 0) goto L_0x29f4
            if (r13 == 0) goto L_0x29f4
            if (r15 == 0) goto L_0x29f4
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r0.toMillis(r2)
            r10.A0I = r0
            r10.A16(r11)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r0.toMillis(r2)
            r4.A0I = r0
            r4.A16(r11)
            X.1Oo r1 = r6.A0c
            r0 = 3016(0xbc8, float:4.226E-42)
            r1.BJb(r10, r0)
        L_0x09f4:
            r0 = 3015(0xbc7, float:4.225E-42)
            r6.A0T(r0, r4)
        L_0x09f9:
            X.1C4 r1 = r6.A0s
            goto L_0x016b
        L_0x09fd:
            r15 = 0
            goto L_0x09cf
        L_0x09ff:
            if (r0 == 0) goto L_0x2a1a
            X.3QL r0 = r0.A0K
            java.lang.String r0 = r0.A03
            java.lang.String r11 = r5.A03
            boolean r0 = android.text.TextUtils.equals(r0, r11)
            if (r0 != 0) goto L_0x0a74
            java.lang.String r0 = "groupmgr/onGroupNewDescription/changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A0c(r9, r5)
            X.1Cv r0 = r6.A0W
            X.3T1 r4 = r0.A05(r9)
            boolean r0 = r4 instanceof X.AnonymousClass2bI
            r12 = 3006(0xbbe, float:4.212E-42)
            if (r0 == 0) goto L_0x2a0e
            r10 = r4
            X.2bI r10 = (X.AnonymousClass2bI) r10
            long r2 = r10.A0I
            long r0 = r5.A00
            long r0 = r0 * r74
            boolean r17 = X.AnonymousClass6XI.A04(r2, r0)
            long r2 = r10.A0I
            long r13 = r0 - r2
            long r15 = java.lang.Math.abs(r13)
            r13 = 90000(0x15f90, double:4.4466E-319)
            int r2 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            r14 = 0
            if (r2 > 0) goto L_0x0a3f
            r14 = 1
        L_0x0a3f:
            java.lang.String r2 = r10.A0b()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0a50
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            r13 = 1
            if (r2 == 0) goto L_0x0a51
        L_0x0a50:
            r13 = 0
        L_0x0a51:
            int r3 = r10.A00
            r2 = 27
            if (r3 != r2) goto L_0x0a66
            X.11F r3 = r10.A0J()
            if (r3 == 0) goto L_0x0a66
            r2 = r19
            boolean r3 = r3.equals(r2)
            r2 = 1
            if (r3 != 0) goto L_0x0a67
        L_0x0a66:
            r2 = 0
        L_0x0a67:
            if (r17 == 0) goto L_0x2a0e
            if (r14 == 0) goto L_0x2a0e
            if (r13 == 0) goto L_0x2a0e
            if (r2 == 0) goto L_0x2a0e
            r4.A0I = r0
            r4.A0m = r11
            goto L_0x09f4
        L_0x0a74:
            java.lang.String r0 = "groupmgr/onGroupNewSubject/did not change"
            goto L_0x0a79
        L_0x0a77:
            java.lang.String r0 = "groupmgr/onParentGroupNewDescription/did not change"
        L_0x0a79:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x09f9
        L_0x0a7e:
            java.lang.String r11 = "auto_add_disabled"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x0abb
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "creator"
            com.whatsapp.jid.Jid r10 = r1.A0X(r2, r0)
            X.11F r10 = (X.AnonymousClass11F) r10
            X.0xQ r5 = r3.A0C
            X.8zi r0 = X.C188518zi.AUTO_ADD_DISABLED_GROUP_IS_FULL
            java.lang.String r4 = r0.reason
            X.11F r0 = X.AnonymousClass143.A00(r27)
            X.147 r9 = X.C65533Sl.A03(r0)
            X.C18740tg.A06(r9)
            X.16D r2 = r5.A0C
            X.141 r0 = r2.A0A(r9)
            if (r0 != 0) goto L_0x0ab0
            java.lang.String r0 = "groupmgr/onGroupAutoAddDisabled/new group"
        L_0x0aab:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x1dcd
        L_0x0ab0:
            X.17X r0 = r5.A0U
            boolean r0 = r0.A0C(r9)
            if (r0 != 0) goto L_0x1504
            java.lang.String r0 = "groupmgr/onGroupAutoAddDisabled/not participant"
            goto L_0x0aab
        L_0x0abb:
            java.lang.String r11 = "locked"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x0ad6
            X.0xQ r2 = r3.A0C
            java.lang.String r0 = "threshold"
            int r4 = r1.A0S(r0, r7)
            r7 = 1
            r1 = r2
        L_0x0acd:
            r2 = r6
            r3 = r43
            r5 = r25
            r1.A0h(r2, r3, r4, r5, r7)
            return r8
        L_0x0ad6:
            java.lang.String r11 = "unlocked"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x0ae3
            X.0xQ r0 = r3.A0C
            r4 = 0
            r1 = r0
            goto L_0x0acd
        L_0x0ae3:
            java.lang.String r11 = "announcement"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x0aef
            r9 = 1
        L_0x0aec:
            monitor-enter(r3)
            goto L_0x2a1e
        L_0x0aef:
            java.lang.String r11 = "not_announcement"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x0af9
            r9 = 0
            goto L_0x0aec
        L_0x0af9:
            java.lang.String r11 = "no_frequently_forwarded"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x0b6e
            X.0xQ r2 = r3.A0C
            r7 = 1
        L_0x0b04:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "groupmgr/onGroupNoFrequentlyForwardedToggled/"
            r3.append(r1)
            r1 = r43
            r3.append(r1)
            java.lang.String r1 = "/"
            r3.append(r1)
            r3.append(r7)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.11F r1 = X.AnonymousClass143.A00(r27)
            X.147 r5 = X.C65533Sl.A03(r1)
            X.C18740tg.A06(r5)
            X.16D r4 = r2.A0C
            X.141 r1 = r4.A0A(r5)
            if (r1 == 0) goto L_0x2b33
            boolean r1 = r1.A11
            if (r1 == r7) goto L_0x1533
            java.lang.String r1 = "groupmgr/onGroupAnnouncementsToggled/changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.141 r3 = r4.A0D(r5)
            boolean r1 = r3.A11
            if (r1 == r7) goto L_0x0b52
            r3.A11 = r7
            X.16p r1 = r4.A05
            r1.A0U(r3)
            X.16z r1 = r4.A04
            r1.A0A(r3)
        L_0x0b52:
            r4 = 3016(0xbc8, float:4.226E-42)
            X.19x r1 = r2.A0x
            r13 = 54
            if (r7 == 0) goto L_0x0b5c
            r13 = 53
        L_0x0b5c:
            r9 = r1
            r10 = r0
            r11 = r5
            r12 = r43
            r14 = r25
            X.8nz r0 = r9.A04(r10, r11, r12, r13, r14)
            r0.A0q(r6)
        L_0x0b6a:
            r2.A0T(r4, r0)
            return r8
        L_0x0b6e:
            java.lang.String r11 = "frequently_forwarded_ok"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x0b79
            X.0xQ r2 = r3.A0C
            goto L_0x0b04
        L_0x0b79:
            java.lang.String r11 = "revoke"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x0bcc
            java.lang.String r0 = "participant"
            java.util.List r0 = r1.A0j(r0)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r10 = r0.iterator()
        L_0x0b95:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x153c
            java.lang.Object r9 = r10.next()
            X.9nx r9 = (X.C203399nx) r9
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r7 = r9.A0X(r1, r0)
            if (r7 == 0) goto L_0x0b95
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r1 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r0 = "phone_number"
            com.whatsapp.jid.Jid r1 = r9.A0X(r1, r0)
            boolean r0 = X.AnonymousClass143.A0I(r7)
            if (r0 == 0) goto L_0x0bbe
            if (r1 == 0) goto L_0x0bbe
            r2.put(r7, r1)
        L_0x0bbe:
            java.lang.String r0 = "expiration"
            long r0 = r9.A0V(r0, r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.put(r7, r0)
            goto L_0x0b95
        L_0x0bcc:
            java.lang.String r11 = "not_ephemeral"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x0c30
            X.0xQ r2 = r3.A0C
            r1 = 0
        L_0x0bd7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "groupmgr/onGroupEphemeralChanged/"
            r3.append(r0)
            r0 = r43
            r3.append(r0)
            java.lang.String r0 = "/"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r1 >= 0) goto L_0x0bf8
            r1 = 0
        L_0x0bf8:
            X.11F r0 = X.AnonymousClass143.A00(r27)
            X.147 r3 = X.C65533Sl.A03(r0)
            X.C18740tg.A06(r3)
            X.1P4 r0 = r2.A0e
            X.AnonymousClass00C.A0D(r3, r7)
            X.16D r0 = r0.A00
            X.141 r0 = r0.A0A(r3)
            if (r0 == 0) goto L_0x15c4
            int r0 = r0.A02
            if (r0 == r1) goto L_0x15c1
            java.lang.String r0 = "groupmgr/onGroupEphemeralChanged/changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.16D r0 = r2.A0C
            r0.A0b(r3, r1)
            r4 = 3017(0xbc9, float:4.228E-42)
            X.19x r0 = r2.A0x
            r9 = r0
            r10 = r3
            r11 = r6
            r12 = r43
            r13 = r1
            r14 = r25
            X.8nV r0 = r9.A09(r10, r11, r12, r13, r14)
            goto L_0x0b6a
        L_0x0c30:
            java.lang.String r11 = "ephemeral"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x0c41
            java.lang.String r0 = "expiration"
            int r1 = r1.A0R(r0)
            X.0xQ r2 = r3.A0C
            goto L_0x0bd7
        L_0x0c41:
            java.lang.String r11 = "expire"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x0c8a
            java.lang.String r0 = "timestamp"
            long r0 = r1.A0V(r0, r4)
            X.0xQ r6 = r3.A0C
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "groupmgr/onGroupExpirationChanged/"
            r3.append(r2)
            r2 = r43
            r3.append(r2)
            java.lang.String r2 = "/"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0c75
            r0 = 0
        L_0x0c75:
            X.11F r2 = X.AnonymousClass143.A00(r27)
            X.147 r3 = X.C65533Sl.A03(r2)
            if (r3 == 0) goto L_0x09f9
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0e63
            X.0v0 r0 = r6.A0J
            r0.A1I(r3)
            goto L_0x09f9
        L_0x0c8a:
            java.lang.String r11 = "suspended"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x0c9a
            X.0xQ r1 = r3.A0C
            r0 = r43
            r1.A0i(r0, r8)
            return r8
        L_0x0c9a:
            java.lang.String r11 = "unsuspended"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x0caa
            X.0xQ r1 = r3.A0C
            r0 = r43
            r1.A0i(r0, r7)
            return r8
        L_0x0caa:
            java.lang.String r11 = "link"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x0cf3
            X.11F r2 = X.AnonymousClass143.A00(r27)
            X.147 r10 = X.C65533Sl.A03(r2)
            X.C18740tg.A06(r10)
            java.lang.String r2 = "link_type"
            java.lang.String r5 = r1.A0i(r2, r0)
            java.lang.String r0 = "sub_group"
            boolean r0 = r0.equals(r5)
            r2 = 2
            if (r0 == 0) goto L_0x0e6a
            java.util.LinkedHashSet r4 = A00(r1, r2)
            X.0xQ r3 = r3.A0C
            X.19x r0 = r3.A0x
            X.19w r0 = r0.A01
            X.3Qa r2 = r0.A02(r10, r8)
            X.8nk r5 = new X.8nk
            r0 = r25
            r5.<init>(r2, r0)
        L_0x0ce1:
            r0 = r43
            r5.A03 = r0
            r5.A0q(r6)
            r5.A1h(r4)
            X.1Oo r1 = r3.A0c
            r0 = 3010(0xbc2, float:4.218E-42)
            r1.BJb(r5, r0)
            return r8
        L_0x0cf3:
            java.lang.String r11 = "unlink"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x0d4f
            X.11F r2 = X.AnonymousClass143.A00(r27)
            X.147 r10 = X.C65533Sl.A03(r2)
            X.C18740tg.A06(r10)
            java.lang.String r2 = "unlink_type"
            java.lang.String r5 = r1.A0i(r2, r0)
            java.lang.String r2 = "unlink_reason"
            java.lang.String r2 = r1.A0i(r2, r0)
            java.lang.String r0 = "unlink_group"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0d3a
            r4 = 1
        L_0x0d1b:
            java.lang.String r0 = "sub_group"
            boolean r0 = r0.equals(r5)
            r2 = 2
            if (r0 == 0) goto L_0x0eb1
            java.util.LinkedHashSet r4 = A00(r1, r2)
            X.0xQ r3 = r3.A0C
            X.19x r0 = r3.A0x
            X.19w r0 = r0.A01
            X.3Qa r2 = r0.A02(r10, r8)
            X.8nl r5 = new X.8nl
            r0 = r25
            r5.<init>(r2, r0)
            goto L_0x0ce1
        L_0x0d3a:
            java.lang.String r0 = "delete_parent"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0d44
            r4 = 2
            goto L_0x0d1b
        L_0x0d44:
            java.lang.String r0 = "integrity_delete_parent"
            boolean r0 = r0.equals(r2)
            r4 = 0
            if (r0 == 0) goto L_0x0d1b
            r4 = 3
            goto L_0x0d1b
        L_0x0d4f:
            java.lang.String r11 = "growth_locked"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x0d77
            X.3UA r0 = X.AnonymousClass3UA.A00
            X.3G4 r5 = r0.A0B(r2)
            if (r5 == 0) goto L_0x0d73
            X.0xQ r4 = r3.A0C
            X.11F r0 = X.AnonymousClass143.A00(r27)
            X.147 r2 = X.C65533Sl.A03(r0)
            X.C18740tg.A06(r2)
            r0 = r25
            r4.A0f(r2, r5, r0)
            goto L_0x1dcd
        L_0x0d73:
            java.lang.String r0 = "GroupNotificationHandler/handleAnnouncement/null growth lock, ignoring"
            goto L_0x0aab
        L_0x0d77:
            java.lang.String r11 = "growth_unlocked"
            boolean r11 = X.C203399nx.A0I(r1, r11)
            if (r11 == 0) goto L_0x0d98
            X.0xQ r9 = r3.A0C
            X.11F r0 = X.AnonymousClass143.A00(r27)
            X.147 r6 = X.C65533Sl.A03(r0)
            X.C18740tg.A06(r6)
            X.3G4 r2 = new X.3G4
            r2.<init>(r7, r4)
            r0 = r25
            r9.A0f(r6, r2, r0)
            goto L_0x1dcd
        L_0x0d98:
            java.lang.String r4 = "membership_approval_mode"
            boolean r4 = X.C203399nx.A0I(r1, r4)
            if (r4 == 0) goto L_0x0e57
            X.11F r2 = X.AnonymousClass143.A00(r27)
            X.147 r4 = X.C65533Sl.A03(r2)
            X.C18740tg.A06(r4)
            java.lang.String r2 = "group_join"
            java.util.List r9 = r1.A0j(r2)
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L_0x1dcd
            int r5 = r9.size()
            r2 = 1
            if (r5 == r8) goto L_0x0dbf
            r2 = 0
        L_0x0dbf:
            X.C18740tg.A0C(r2)
            java.lang.Object r5 = r9.get(r7)
            X.9nx r5 = (X.C203399nx) r5
            java.lang.String r2 = "state"
            java.lang.String r2 = r5.A0h(r2)
            java.lang.String r5 = "triggered"
            java.lang.String r5 = r1.A0i(r5, r0)
            java.lang.String r1 = "server"
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L_0x0ddd
            r6 = 0
        L_0x0ddd:
            java.lang.String r1 = "on"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0e4b
            X.0xQ r9 = r3.A0C
            r10 = 1
        L_0x0de8:
            X.17X r1 = r9.A0U
            boolean r1 = r1.A0D(r4)
            if (r1 == 0) goto L_0x0e48
            java.lang.String r7 = "admin"
        L_0x0df2:
            X.16D r5 = r9.A0C
            X.141 r2 = r5.A0D(r4)
            boolean r1 = r2.A12
            if (r1 == r10) goto L_0x0e08
            r2.A12 = r10
            X.16p r1 = r5.A05
            r1.A0U(r2)
            X.16z r1 = r5.A04
            r1.A0A(r2)
        L_0x0e08:
            if (r10 != 0) goto L_0x0e14
            X.1PF r1 = r9.A0R
            r1.A01(r4)
            X.1Nq r1 = r9.A0Y
            r1.A00(r4)
        L_0x0e14:
            r5 = 3021(0xbcd, float:4.233E-42)
            X.19x r2 = r9.A0x
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "SystemMessageFactory/newGroupMembershipApprovalModeChangeSystemMessage/gjid="
            r11.append(r1)
            r11.append(r4)
            java.lang.String r1 = r11.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r14 = 85
            if (r10 == 0) goto L_0x0e32
            r14 = 84
        L_0x0e32:
            r13 = r0
            r10 = r2
            r11 = r0
            r12 = r4
            r15 = r25
            X.8nz r0 = r10.A04(r11, r12, r13, r14, r15)
            X.8nO r0 = (X.C181388nO) r0
            r0.A0q(r6)
            r0.A00 = r7
            r9.A0T(r5, r0)
            goto L_0x1dcd
        L_0x0e48:
            java.lang.String r7 = "regular"
            goto L_0x0df2
        L_0x0e4b:
            java.lang.String r1 = "off"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x2b74
            X.0xQ r9 = r3.A0C
            r10 = 0
            goto L_0x0de8
        L_0x0e57:
            java.lang.String r4 = "membership_approval_request"
            boolean r4 = X.C203399nx.A0I(r1, r4)
            if (r4 == 0) goto L_0x15d6
            java.lang.String r0 = "GroupNotificationHandler/handleGroupMembershipApprovalRequest/this client will process newer notification format in handleCreatedGroupMembershipApprovalRequests , ignoring"
            goto L_0x0aab
        L_0x0e63:
            X.0v0 r2 = r6.A0J
            r2.A1J(r3, r0)
            goto L_0x09f9
        L_0x0e6a:
            java.lang.String r0 = "parent_group"
            boolean r0 = r0.equals(r5)
            r12 = 1
            if (r0 == 0) goto L_0x0f94
            java.util.LinkedHashSet r2 = A00(r1, r8)
            X.0xQ r1 = r3.A0C
            int r0 = r2.size()
            if (r0 != r8) goto L_0x068d
            java.util.List r0 = java.util.Collections.singletonList(r10)
            java.util.ArrayList r3 = X.C20350xQ.A04(r1, r0)
            int r0 = r3.size()
            if (r0 != r8) goto L_0x068d
            java.util.Iterator r0 = r2.iterator()
            java.lang.Object r2 = r0.next()
            X.3QK r2 = (X.AnonymousClass3QK) r2
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            java.lang.Object r0 = r3.get(r7)
            X.3QK r0 = (X.AnonymousClass3QK) r0
            r17 = 0
            r18 = 0
            r9 = r0
            r10 = r2
            r11 = r1
            r12 = r6
            r13 = r43
            r15 = r25
            X.C20350xQ.A0A(r9, r10, r11, r12, r13, r14, r15, r17, r18)
            return r8
        L_0x0eb1:
            java.lang.String r0 = "parent_group"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0f64
            java.util.LinkedHashSet r5 = A00(r1, r8)
            X.0xQ r12 = r3.A0C
            int r0 = r5.size()
            if (r0 != r8) goto L_0x0edd
            r0 = 3
            if (r4 == r0) goto L_0x0edd
            X.12q r0 = r12.A0M
            int r1 = r0.A05(r10)
            r0 = 6
            if (r1 != r0) goto L_0x0ee1
            X.0yC r3 = r12.A0a
            r1 = 5021(0x139d, float:7.036E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r3, r1)
            if (r0 == 0) goto L_0x0ee1
        L_0x0edd:
            X.1C4 r1 = r12.A0s
            goto L_0x016b
        L_0x0ee1:
            java.util.Iterator r0 = r5.iterator()
            java.lang.Object r14 = r0.next()
            X.3QK r14 = (X.AnonymousClass3QK) r14
            java.util.List r0 = java.util.Collections.singletonList(r10)
            java.util.ArrayList r9 = X.C20350xQ.A04(r12, r0)
            X.1LV r5 = r12.A08
            com.whatsapp.jid.GroupJid r11 = r14.A02
            X.147 r3 = X.C65533Sl.A03(r11)
            X.AnonymousClass00C.A0D(r3, r7)
            X.0wU r7 = r5.A0C
            r1 = 18
            X.1iV r0 = new X.1iV
            r0.<init>(r9, r5, r3, r1)
            r7.Boy(r0)
            X.1EM r13 = r12.A11
            boolean r0 = r13.A01()
            r9 = 3010(0xbc2, float:4.218E-42)
            if (r0 == 0) goto L_0x0f3c
            if (r4 != r2) goto L_0x0f3c
            java.lang.String r0 = "groupChatManager/unlink due to delete parent group"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Oo r7 = r12.A0c
            X.19x r1 = r12.A0x
            X.171 r0 = r12.A0D
            java.lang.String r5 = r0.A0U(r11)
            X.19w r0 = r1.A01
            X.3Qa r4 = r0.A02(r10, r8)
            r3 = 87
            X.8nP r2 = new X.8nP
            r0 = r25
            r2.<init>(r4, r3, r0)
            r2.A00 = r5
            r2.A0q(r6)
            r7.BJb(r2, r9)
        L_0x0f3c:
            boolean r0 = r13.A01()
            if (r0 == 0) goto L_0x0edd
            X.19x r3 = r12.A0x
            java.lang.String r5 = r14.A04
            X.19w r0 = r3.A01
            X.3Qa r4 = r0.A02(r10, r8)
            X.8ne r2 = new X.8ne
            r0 = r25
            r2.<init>(r4, r0)
            r0 = r43
            r2.A03 = r0
            r2.A1g(r11, r5)
            r0 = 0
            X.C238019x.A01(r6, r2, r3, r0)
            X.1Oo r0 = r12.A0c
            r0.BJb(r2, r9)
            return r8
        L_0x0f64:
            java.lang.String r0 = "sibling_group"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x1d9b
            java.util.LinkedHashSet r2 = A00(r1, r2)
            X.0xQ r1 = r3.A0C
            r11 = 0
            r12 = 0
            java.util.Iterator r4 = r2.iterator()
        L_0x0f78:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0ff1
            java.lang.Object r0 = r4.next()
            X.3QK r0 = (X.AnonymousClass3QK) r0
            com.whatsapp.jid.GroupJid r0 = r0.A02
            X.147 r3 = X.C65533Sl.A03(r0)
            if (r3 == 0) goto L_0x0f78
            X.1LV r0 = r1.A08
            X.17d r0 = r0.A08
            r0.A05(r3)
            goto L_0x0f78
        L_0x0f94:
            java.lang.String r0 = "sibling_group"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x15cd
            java.util.LinkedHashSet r2 = A00(r1, r2)
            int r0 = r2.size()
            if (r0 != r8) goto L_0x1072
            X.0yC r5 = r3.A0B
            X.0yV r4 = X.C21000yV.A01
            r0 = 3864(0xf18, float:5.415E-42)
            boolean r0 = X.C20800yB.A01(r4, r5, r0)
            if (r0 == 0) goto L_0x1072
            java.lang.String r0 = "group"
            java.util.List r1 = r1.A0j(r0)
            int r0 = r1.size()
            if (r0 != r8) goto L_0x1072
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1072
            java.lang.Object r4 = r1.next()
            X.9nx r4 = (X.C203399nx) r4
            java.lang.String r1 = "breakout"
            r0 = 0
            java.lang.String r1 = r4.A0i(r1, r0)
            java.lang.String r0 = "true"
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 == 0) goto L_0x1072
        L_0x0fdd:
            X.0xQ r1 = r3.A0C
            r11 = 1
            X.1LV r9 = r1.A08
            X.147 r5 = r9.A02(r10)
            if (r5 != 0) goto L_0x105c
            X.0wN r4 = r1.A03
            java.lang.String r3 = "groupChatManager/nullParent"
            java.lang.String r0 = "Could not find parent group to link"
            r4.A0E(r3, r0, r8)
        L_0x0ff1:
            X.1EM r0 = r1.A11
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x068d
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x068d
            X.0yC r4 = r1.A0a
            X.0yV r3 = X.C21000yV.A01
            r0 = 3864(0xf18, float:5.415E-42)
            boolean r0 = X.C20800yB.A01(r3, r4, r0)
            if (r0 == 0) goto L_0x2b36
            if (r11 == 0) goto L_0x2b36
            if (r12 == 0) goto L_0x2b36
            X.1LV r3 = r1.A08
            X.147 r0 = r3.A02(r10)
            if (r0 == 0) goto L_0x2b36
            int r0 = r2.size()
            if (r0 != r8) goto L_0x2b36
            java.util.Iterator r0 = r2.iterator()
            java.lang.Object r2 = r0.next()
            X.3QK r2 = (X.AnonymousClass3QK) r2
            X.19x r0 = r1.A0x
            X.147 r11 = r3.A02(r10)
            com.whatsapp.jid.GroupJid r9 = r2.A02
            java.lang.String r5 = r2.A04
            X.19w r0 = r0.A01
            X.3Qa r10 = r0.A02(r10, r8)
            X.8nE r4 = new X.8nE
            r2 = r25
            r0 = r43
            r4.<init>(r10, r0, r2)
            java.lang.String r0 = ""
            r4.A1h(r11, r0)
            X.AnonymousClass00C.A0D(r9, r7)
            java.util.List r3 = r4.A00
            r2 = 2
            X.9Wj r0 = new X.9Wj
            r0.<init>(r9, r5, r2, r7)
            r3.add(r0)
            r4.A0q(r6)
            X.1Oo r0 = r1.A0c
            r0.BJb(r4, r2)
            return r8
        L_0x105c:
            java.util.Iterator r4 = r2.iterator()
        L_0x1060:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0ff1
            java.lang.Object r3 = r4.next()
            X.3QK r3 = (X.AnonymousClass3QK) r3
            X.17d r0 = r9.A08
            r0.A04(r3, r5)
            goto L_0x1060
        L_0x1072:
            r12 = 0
            goto L_0x0fdd
        L_0x1075:
            if (r14 == 0) goto L_0x1078
            r6 = r3
        L_0x1078:
            r1.A0b(r5, r6)
            X.16D r0 = r1.A0C
            X.141 r6 = r0.A0A(r5)
            if (r12 == 0) goto L_0x1102
            X.17Y r3 = r1.A04
            r2 = 6
            X.1j9 r0 = new X.1j9
            r0.<init>(r1, r5, r2)
            r3.A0H(r0)
            if (r6 == 0) goto L_0x10c8
            boolean r0 = r6.A0d
            if (r0 == 0) goto L_0x10c8
            X.0y7 r0 = r7.A07()
            int r7 = r0.size()
            if (r9 == r8) goto L_0x10c8
            X.0yC r3 = r1.A0a
            r0 = 934(0x3a6, float:1.309E-42)
            X.0yV r2 = X.C21000yV.A02
            int r0 = X.C20800yB.A00(r2, r3, r0)
            if (r7 < r0) goto L_0x10c8
            r0 = 1946(0x79a, float:2.727E-42)
            int r0 = X.C20800yB.A00(r2, r3, r0)
            if (r7 > r0) goto L_0x10c8
            X.19w r0 = r1.A0w
            X.3Qa r9 = r0.A02(r5, r8)
            X.0wo r0 = r1.A0I
            long r2 = X.C19970wo.A00(r0)
            X.5J0 r7 = new X.5J0
            r7.<init>(r9, r2)
            X.0xM r0 = r1.A0O
            r0.A0h(r7)
        L_0x10c8:
            if (r15 == 0) goto L_0x1102
            X.1Oo r2 = r1.A0c
            X.19x r3 = r1.A0x
            r19 = 15
            com.whatsapp.jid.UserJid r16 = r43.A00()
            X.0wQ r0 = r1.A05
            r0.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r0.A03
            java.util.List r18 = java.util.Collections.singletonList(r0)
            r14 = 0
            r13 = r3
            r15 = r5
            r17 = r43
            r20 = r25
            X.8nz r0 = r13.A03(r14, r15, r16, r17, r18, r19, r20)
            r2.BJb(r0, r4)
        L_0x10ed:
            X.1C4 r2 = r1.A0s
            r0 = r43
            r2.A01(r0)
            if (r12 == 0) goto L_0x0170
            if (r6 == 0) goto L_0x0170
            boolean r0 = r6.A12
            if (r0 == 0) goto L_0x0170
            X.1PG r0 = r1.A0S
            r0.A00(r5)
            return r8
        L_0x1102:
            r0 = 5
            r1.A0T(r0, r5)
            goto L_0x10ed
        L_0x1107:
            X.171 r1 = r7.A0D
            r1.A0d(r10)
            X.0wQ r11 = r7.A05
            r11.A0G()
            com.whatsapp.jid.PhoneUserJid r5 = r11.A03
            X.C18740tg.A06(r5)
            X.13w r3 = r11.A08()
            X.16D r15 = r7.A0C
            X.141 r9 = r15.A0A(r10)
            X.1PE r1 = r7.A0t
            r1.A02(r2)
            r20 = 1
            if (r6 == 0) goto L_0x112f
            boolean r1 = r6.equals(r5)
            if (r1 == 0) goto L_0x113c
        L_0x112f:
            int r1 = r2.size()
            if (r1 != r8) goto L_0x113c
            boolean r1 = r2.containsKey(r5)
            r5 = 1
            if (r1 != 0) goto L_0x113d
        L_0x113c:
            r5 = 0
        L_0x113d:
            if (r6 == 0) goto L_0x1145
            boolean r1 = r6.equals(r3)
            if (r1 == 0) goto L_0x1152
        L_0x1145:
            int r1 = r2.size()
            if (r1 != r8) goto L_0x1152
            boolean r3 = r2.containsKey(r3)
            r1 = 1
            if (r3 != 0) goto L_0x1153
        L_0x1152:
            r1 = 0
        L_0x1153:
            if (r5 != 0) goto L_0x1295
            if (r1 != 0) goto L_0x1295
            if (r9 == 0) goto L_0x12a2
            X.17X r13 = r7.A0U
            boolean r1 = r13.A0C(r10)
            if (r1 == 0) goto L_0x12a2
            X.17r r0 = r13.A07
            r24 = r0
            X.6X6 r14 = r0.A0C(r10)
            java.util.Set r0 = r2.keySet()
            boolean r20 = r14.A0R(r0)
            if (r20 == 0) goto L_0x1176
            r13.A06(r14)
        L_0x1176:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r17 = r0.iterator()
        L_0x118d:
            boolean r0 = r17.hasNext()
            java.lang.String r2 = "default_sub_group_demote"
            if (r0 == 0) goto L_0x124b
            java.lang.Object r0 = r17.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r5 = r0.getKey()
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.Object r1 = r0.getValue()
            X.3Kj r1 = (X.C63523Kj) r1
            X.6PM r0 = r14.A09(r5)
            if (r0 == 0) goto L_0x11d5
            r12.add(r5)
            boolean r0 = X.AnonymousClass143.A0I(r5)
            if (r0 == 0) goto L_0x11d5
            boolean r0 = r11.A0M(r5)
            if (r0 == 0) goto L_0x11d5
            r11.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r11.A03
            X.C18740tg.A06(r0)
            X.6PM r0 = r14.A09(r0)
            if (r0 == 0) goto L_0x11d5
            r11.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r11.A03
            X.C18740tg.A06(r0)
            r12.add(r0)
        L_0x11d5:
            r0 = r21
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x121e
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x121e
            java.lang.String r2 = r1.A04
            java.lang.String r0 = "superadmin"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x121e
            java.lang.String r0 = "admin"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x121e
            X.13w r0 = r1.A00
            r23 = r0
            X.17i r1 = r7.A0Z
            java.util.HashSet r0 = r1.A0B(r0)
            java.util.HashSet r2 = X.AnonymousClass6X6.A02(r0)
            X.6PM r16 = new X.6PM
            r1 = 0
            r4 = r2
            r2 = r23
            r0 = r16
            r0.<init>(r2, r4, r1, r1)
            r0 = r18
            r0.add(r5)
            r1 = r19
            r0 = r16
            r1.add(r0)
        L_0x121e:
            boolean r0 = r11.A0M(r5)
            if (r0 == 0) goto L_0x118d
            X.0wU r2 = r7.A12
            r1 = 7
            X.1j9 r0 = new X.1j9
            r0.<init>(r7, r10, r1)
            r2.Bp1(r0)
            X.1P5 r1 = r7.A0p
            java.lang.Class<X.147> r0 = X.AnonymousClass147.class
            com.whatsapp.jid.Jid r0 = r9.A06(r0)
            X.C18740tg.A06(r0)
            X.147 r0 = (X.AnonymousClass147) r0
            r1.A0X(r0)
            X.1PF r0 = r7.A0R
            r0.A01(r10)
            X.1Nq r0 = r7.A0Y
            r0.A00(r10)
            goto L_0x118d
        L_0x124b:
            r0 = r21
            boolean r5 = r2.equals(r0)
            if (r5 == 0) goto L_0x12bc
            r0 = r19
            X.C20350xQ.A08(r14, r7, r0)
            X.12P r0 = r13.A06
            X.1M0 r4 = r0.A05()
            X.71s r3 = r4.B1k()     // Catch:{ all -> 0x29e1 }
            java.util.Iterator r2 = r18.iterator()     // Catch:{ all -> 0x29d7 }
        L_0x1266:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x29d7 }
            if (r0 == 0) goto L_0x1278
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x29d7 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x29d7 }
            r0 = r24
            r0.A0N(r10, r1)     // Catch:{ all -> 0x29d7 }
            goto L_0x1266
        L_0x1278:
            java.util.Iterator r2 = r19.iterator()     // Catch:{ all -> 0x29d7 }
        L_0x127c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x29d7 }
            if (r0 == 0) goto L_0x128e
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x29d7 }
            X.6PM r1 = (X.AnonymousClass6PM) r1     // Catch:{ all -> 0x29d7 }
            r0 = r24
            r0.A0H(r1, r10)     // Catch:{ all -> 0x29d7 }
            goto L_0x127c
        L_0x128e:
            r3.A00()     // Catch:{ all -> 0x29d7 }
            r3.close()     // Catch:{ all -> 0x29e1 }
            goto L_0x12b9
        L_0x1295:
            java.lang.String r0 = "groupmgr/onGroupRemoveUsers/me leaving"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.List r0 = java.util.Collections.singletonList(r10)
            r7.A0k(r0, r8)
            goto L_0x12b4
        L_0x12a2:
            java.lang.String r1 = "groupmgr/onGroupRemoveUsers/requerygroupinfo"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0xg r1 = r7.A0k
            r1.A0E(r10, r0, r4)
            X.1O8 r1 = r7.A0u
            if (r9 != 0) goto L_0x12b6
            r0 = 0
        L_0x12b1:
            r1.A01(r10, r0, r4)
        L_0x12b4:
            r3 = 0
            goto L_0x1314
        L_0x12b6:
            int r0 = r9.A06
            goto L_0x12b1
        L_0x12b9:
            r4.close()
        L_0x12bc:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x12ca
            X.1P5 r0 = r7.A0p
            r0.A0W(r10, r12)
            X.C20350xQ.A0B(r7, r10, r12)
        L_0x12ca:
            java.util.List r1 = X.C20350xQ.A05(r7, r10, r12)
            r2 = 7
            if (r6 == 0) goto L_0x139a
            boolean r0 = r1.contains(r6)
            if (r0 == 0) goto L_0x139a
            r1.remove(r6)
            X.19x r0 = r7.A0x
            r33 = 5
            r29 = r0
            r30 = r10
            r31 = r6
            r32 = r43
            r34 = r25
            X.8nz r3 = r29.A06(r30, r31, r32, r33, r34)
            X.1Oo r0 = r7.A0c
            r0.BJb(r3, r2)
            r3 = 1
        L_0x12f2:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x1314
            if (r5 == 0) goto L_0x1392
            r33 = 94
        L_0x12fc:
            X.19x r0 = r7.A0x
            r27 = r0
            r29 = r10
            r30 = r6
            r31 = r43
            r32 = r1
            r34 = r25
            X.8nz r1 = r27.A03(r28, r29, r30, r31, r32, r33, r34)
            X.1Oo r0 = r7.A0c
            r0.BJb(r1, r2)
            r3 = 1
        L_0x1314:
            r3 = r3 ^ 1
            if (r20 == 0) goto L_0x1388
            X.17X r0 = r7.A0U
            boolean r0 = r0.A0B(r10)
            if (r0 == 0) goto L_0x1382
            X.8du r2 = r11.A07()
        L_0x1324:
            X.C18740tg.A06(r2)
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            X.189 r0 = r7.A0K
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x1367
            r0 = r43
            X.C20350xQ.A0C(r7, r2, r10, r0, r3)
        L_0x1336:
            if (r9 == 0) goto L_0x0170
            boolean r0 = android.text.TextUtils.isEmpty(r22)
            if (r0 != 0) goto L_0x0170
            java.lang.String r0 = r9.A0J()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = "groupmgr/onGroupRemoveUsers/subjectchanged"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.141 r1 = r15.A0D(r10)
            r0 = r22
            r1.A0P = r0
            X.16p r0 = r15.A05
            r0.A0U(r1)
            X.16z r0 = r15.A04
            r0.A0A(r1)
            X.1LW r1 = r7.A0P
            r0 = r22
            r1.A02(r10, r0)
            return r8
        L_0x1367:
            X.187 r0 = r7.A0L
            X.1ie r1 = new X.1ie
            r28 = 1
            r23 = r1
            r24 = r7
            r25 = r43
            r26 = r10
            r27 = r2
            r29 = r3
            r23.<init>(r24, r25, r26, r27, r28, r29)
            java.util.concurrent.ThreadPoolExecutor r0 = r0.A00
            r0.submit(r1)
            goto L_0x1336
        L_0x1382:
            r11.A0G()
            X.13x r2 = r11.A02
            goto L_0x1324
        L_0x1388:
            if (r3 == 0) goto L_0x1336
            X.1C4 r1 = r7.A0s
            r0 = r43
            r1.A01(r0)
            goto L_0x1336
        L_0x1392:
            r33 = 14
            if (r6 != 0) goto L_0x12fc
            r33 = 13
            goto L_0x12fc
        L_0x139a:
            r3 = 0
            goto L_0x12f2
        L_0x139d:
            java.lang.Object r0 = r6.get(r5)     // Catch:{ all -> 0x29eb }
            X.9K6 r0 = (X.AnonymousClass9K6) r0     // Catch:{ all -> 0x29eb }
            if (r0 != 0) goto L_0x13a9
            X.9K6 r0 = X.AnonymousClass181.A00(r1, r5)     // Catch:{ all -> 0x29eb }
        L_0x13a9:
            long r0 = r0.A01     // Catch:{ all -> 0x29eb }
            monitor-exit(r6)     // Catch:{ all -> 0x29eb }
            int r6 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r6 > 0) goto L_0x1db9
            X.0xQ r0 = r3.A0C
            long r74 = r74 * r9
            X.11F r1 = X.AnonymousClass143.A00(r27)
            X.147 r1 = X.C65533Sl.A03(r1)
            X.C18740tg.A06(r1)
            X.12q r3 = r0.A0M
            int r11 = r3.A06(r1)
            r15 = 0
            r3 = 3
            r6 = 1
            if (r11 == r3) goto L_0x13ce
            r6 = 0
            if (r11 != r8) goto L_0x13ce
            r15 = 1
        L_0x13ce:
            r14 = 0
            if (r6 == 0) goto L_0x1501
            X.1LV r3 = r0.A08
            X.147 r11 = r3.A02(r1)
        L_0x13d7:
            X.16D r3 = r0.A0C
            X.141 r12 = r3.A0A(r1)
            if (r12 == 0) goto L_0x1466
            X.171 r7 = r0.A0D
            java.lang.String r7 = r7.A0H(r12)
            boolean r12 = r7.equals(r2)
            if (r12 != 0) goto L_0x1460
            X.C20350xQ.A0I(r0, r1, r11, r2, r6)
            java.lang.String r12 = "groupmgr/onGroupNewSubject/changed"
            com.whatsapp.util.Log.i((java.lang.String) r12)
            X.141 r13 = r3.A0D(r1)
            r13.A0P = r2
            X.16p r12 = r3.A05
            r12.A0U(r13)
            X.16z r3 = r3.A04
            r3.A0A(r13)
            if (r15 == 0) goto L_0x141d
            X.17Y r4 = r0.A04
            r3 = 5
            X.1j9 r2 = new X.1j9
            r2.<init>(r0, r1, r3)
            r4.A0H(r2)
        L_0x1410:
            X.1C4 r1 = r0.A0s
            r0 = r43
            r1.A01(r0)
        L_0x1417:
            r0 = r22
            r0.A01(r5, r9)
            return r8
        L_0x141d:
            r12 = 4
            if (r6 == 0) goto L_0x1445
            X.0yC r13 = r0.A0a
            r6 = 982(0x3d6, float:1.376E-42)
            X.0yV r3 = X.C21000yV.A02
            boolean r3 = X.C20800yB.A01(r3, r13, r6)
            if (r3 == 0) goto L_0x1445
            X.1Oo r3 = r0.A0c
            X.19x r0 = r0.A0x
            r13 = r0
            r14 = r1
            r15 = r11
            r16 = r4
            r17 = r43
            r18 = r7
            r19 = r2
            r20 = r74
            X.8ns r0 = r13.A0B(r14, r15, r16, r17, r18, r19, r20)
        L_0x1441:
            r3.BJb(r0, r12)
            goto L_0x1417
        L_0x1445:
            X.1Oo r3 = r0.A0c
            X.19x r0 = r0.A0x
            r17 = 1
            r13 = r0
            r15 = r1
            r16 = r43
            r18 = r74
            X.8nz r0 = r13.A04(r14, r15, r16, r17, r18)
            X.8nX r0 = (X.C181478nX) r0
            r0.A1a(r2)
            r0.A01 = r7
            r0.A0q(r4)
            goto L_0x1441
        L_0x1460:
            java.lang.String r1 = "groupmgr/onGroupNewSubject/did not change"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            goto L_0x1410
        L_0x1466:
            X.C20350xQ.A0I(r0, r1, r11, r2, r6)
            java.lang.String r6 = "groupmgr/onGroupNewSubject/new group"
            com.whatsapp.util.Log.i((java.lang.String) r6)
            X.17b r6 = r0.A0i
            int r11 = r6.A01(r1)
            X.6X6 r6 = new X.6X6
            r6.<init>(r1, r11)
            X.141 r11 = new X.141
            r11.<init>(r1)
            X.3QL r69 = X.AnonymousClass3QL.A05
            java.lang.String r71 = "pn"
            r72 = 0
            r73 = 0
            r76 = 0
            r77 = 0
            r78 = 0
            r79 = 0
            r80 = 0
            r81 = 0
            r82 = 0
            r83 = 0
            r84 = 0
            r85 = 0
            r86 = 0
            r66 = r3
            r67 = r11
            r68 = r14
            r70 = r2
            r66.A0W(r67, r68, r69, r70, r71, r72, r73, r74, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86)
            X.17u r3 = r0.A0T
            X.C18740tg.A06(r1)
            X.AnonymousClass00C.A0D(r1, r7)
            java.util.Map r3 = r3.A07
            r3.put(r1, r6)
            if (r15 != 0) goto L_0x14f2
            X.1Oo r7 = r0.A0c
            X.19x r3 = r0.A0x
            r17 = 11
            r13 = r3
            r15 = r1
            r16 = r43
            r18 = r74
            X.8nz r3 = r13.A04(r14, r15, r16, r17, r18)
            r3.A16(r2)
            r3.A0q(r4)
            r7.BJb(r3, r8)
        L_0x14cf:
            X.0yC r4 = r0.A0a
            r3 = 7053(0x1b8d, float:9.883E-42)
            X.0yV r2 = X.C21000yV.A02
            boolean r2 = X.C20800yB.A01(r2, r4, r3)
            r7 = 2
            if (r2 == 0) goto L_0x14fa
            int r2 = r6.A00
            if (r2 != 0) goto L_0x14fa
            X.0xg r4 = r0.A0k
            java.lang.String r3 = r6.A0E()
            java.lang.String r2 = "new_subject"
            X.3S5 r0 = new X.3S5
            r0.<init>(r2, r7, r3)
            r4.A09(r0, r1)
            goto L_0x1417
        L_0x14f2:
            X.1C4 r3 = r0.A0s
            r2 = r43
            r3.A01(r2)
            goto L_0x14cf
        L_0x14fa:
            X.0xg r2 = r0.A0k
            r2.A0E(r1, r14, r7)
            goto L_0x1417
        L_0x1501:
            r11 = r14
            goto L_0x13d7
        L_0x1504:
            X.12q r1 = r5.A0M
            boolean r0 = r1.A0S(r9)
            if (r0 == 0) goto L_0x1dcd
            r2.A0Y(r9)
            java.lang.String r7 = r1.A0D(r9)
            X.1Oo r6 = r5.A0c
            X.8zi r5 = X.AnonymousClass97S.A00(r4)
            X.8na r4 = new X.8na
            r0 = r25
            r2 = r43
            r4.<init>((X.C207209uj) r2, (long) r0)
            int r0 = r5.versionId
            r4.A1i(r9, r7, r0)
            r4.A16(r7)
            r4.A0q(r10)
            r0 = 2
            r6.BJb(r4, r0)
            goto L_0x1dcd
        L_0x1533:
            java.lang.String r0 = "groupmgr/onGroupNoFrequentlyForwardedToggled/did not change"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1C4 r1 = r2.A0s
            goto L_0x016b
        L_0x153c:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x1549
            X.0xQ r0 = r3.A0C
            X.1PE r0 = r0.A0t
            r0.A01(r2)
        L_0x1549:
            X.0xQ r4 = r3.A0C
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/onGroupInvitesRevoked/"
            r1.append(r0)
            r0 = r43
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11F r0 = X.AnonymousClass143.A00(r27)
            X.147 r11 = X.C65533Sl.A03(r0)
            X.C18740tg.A06(r11)
            com.whatsapp.jid.UserJid r3 = r43.A00()
            X.C18740tg.A06(r3)
            X.0wQ r1 = r4.A05
            boolean r0 = r1.A0M(r3)
            if (r0 == 0) goto L_0x1590
            X.1PB r1 = r4.A0Q
            X.0wU r2 = r1.A04
            r17 = 11
            X.1ia r0 = new X.1ia
            r12 = r0
            r13 = r1
            r14 = r6
            r15 = r11
            r16 = r43
            r12.<init>(r13, r14, r15, r16, r17)
        L_0x158c:
            r2.Boy(r0)
            return r8
        L_0x1590:
            r1.A0G()
            com.whatsapp.jid.PhoneUserJid r2 = r1.A03
            boolean r0 = r6.containsKey(r2)
            if (r0 == 0) goto L_0x15b8
            X.1PB r1 = r4.A0Q
            java.lang.Object r0 = r6.get(r2)
            X.C18740tg.A06(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r15 = r0.longValue()
            X.0wU r2 = r1.A04
            X.1ib r0 = new X.1ib
            r14 = 1
            r9 = r0
            r10 = r1
            r12 = r3
            r13 = r43
            r9.<init>(r10, r11, r12, r13, r14, r15)
            goto L_0x158c
        L_0x15b8:
            java.lang.String r0 = "GroupChatManager/onGroupInvitesRevoked invalid notification received"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1C4 r1 = r4.A0s
            goto L_0x016b
        L_0x15c1:
            java.lang.String r0 = "groupmgr/onGroupEphemeralChanged/did not change"
            goto L_0x15c6
        L_0x15c4:
            java.lang.String r0 = "groupmgr/onGroupEphemeralChanged/new group"
        L_0x15c6:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1C4 r1 = r2.A0s
            goto L_0x016b
        L_0x15cd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GroupNotificationHandler/handleGroupLinked/incorrect link type = "
            goto L_0x1da2
        L_0x15d6:
            java.lang.String r4 = "revoked_membership_requests"
            boolean r4 = X.C203399nx.A0I(r1, r4)
            if (r4 == 0) goto L_0x1636
            X.11F r0 = X.AnonymousClass143.A00(r27)
            X.147 r4 = X.C65533Sl.A03(r0)
            X.C18740tg.A06(r4)
            X.0wN r5 = r3.A00
            r2 = 2
            X.1yV r0 = new X.1yV
            r0.<init>(r5, r2)
            java.util.LinkedHashMap r2 = X.AnonymousClass3UA.A07(r1, r0)
            X.0xQ r5 = r3.A0C
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x1602
            X.1PE r0 = r5.A0t
            r0.A02(r2)
        L_0x1602:
            X.17X r0 = r5.A0U
            boolean r1 = r0.A0D(r4)
            java.util.Set r0 = r2.keySet()
            java.util.Iterator r2 = r0.iterator()
            if (r1 == 0) goto L_0x1624
        L_0x1612:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x1dcd
            java.lang.Object r1 = r2.next()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1PF r0 = r5.A0R
            r0.A02(r4, r1)
            goto L_0x1612
        L_0x1624:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x1dcd
            java.lang.Object r1 = r2.next()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1Nq r0 = r5.A0Y
            r0.A01(r4, r1)
            goto L_0x1624
        L_0x1636:
            java.lang.String r4 = "member_add_mode"
            boolean r4 = X.C203399nx.A0I(r1, r4)
            if (r4 == 0) goto L_0x16cd
            X.1C4 r4 = r3.A0E
            r2 = r43
            r4.A01(r2)
            X.0xQ r5 = r3.A0C
            java.lang.String r2 = r1.A0e()
            java.lang.String r1 = "all_member_add"
            boolean r9 = r1.equals(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "groupmgr/onGroupMemberAddModeToggled/"
            r2.append(r1)
            r1 = r43
            r2.append(r1)
            java.lang.String r1 = "/"
            r2.append(r1)
            r2.append(r9)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.11F r1 = X.AnonymousClass143.A00(r27)
            X.147 r7 = X.C65533Sl.A03(r1)
            X.C18740tg.A06(r7)
            X.16D r3 = r5.A0C
            X.141 r1 = r3.A0A(r7)
            if (r1 == 0) goto L_0x2b8e
            int r1 = r1.A04
            if (r1 == r9) goto L_0x2b8b
            java.lang.String r1 = "groupmgr/onGroupMemberAddModeToggled/changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.141 r2 = r3.A0D(r7)
            r2.A04 = r9
            X.16p r1 = r3.A05
            r1.A0U(r2)
            X.16z r1 = r3.A04
            r1.A0A(r2)
            r4 = 3022(0xbce, float:4.235E-42)
            r3 = 0
            if (r9 != r8) goto L_0x16a1
            r3 = 1
        L_0x16a1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "SystemMessageFactory/newGroupMemberAddModeModeChangeSystemMessage/gjid="
            r2.append(r1)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r12 = 92
            if (r3 == 0) goto L_0x16bb
            r12 = 91
        L_0x16bb:
            X.8nz r1 = new X.8nz
            r9 = r1
            r10 = r0
            r11 = r43
            r13 = r25
            r9.<init>((X.AnonymousClass6X6) r10, (X.C207209uj) r11, (int) r12, (long) r13)
            r1.A0q(r6)
            r5.A0T(r4, r1)
            return r8
        L_0x16cd:
            java.lang.String r4 = "created_membership_requests"
            boolean r4 = X.C203399nx.A0I(r1, r4)
            if (r4 == 0) goto L_0x18a4
            java.lang.String r4 = "notify"
            r13 = 0
            java.lang.String r19 = r2.A0i(r4, r0)
            X.11F r2 = X.AnonymousClass143.A00(r27)
            X.147 r5 = X.C65533Sl.A03(r2)
            X.C18740tg.A06(r5)
            java.lang.String r2 = "request_method"
            java.lang.String r2 = r1.A0h(r2)
            java.lang.String r10 = X.C181468nW.A00(r2)
            if (r10 == 0) goto L_0x2b97
            java.lang.String r2 = "parent_group_jid"
            java.lang.String r4 = r1.A0i(r2, r0)
            X.3Sl r2 = X.AnonymousClass147.A01
            X.147 r29 = r2.A06(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r9 = "non_admin_add"
            boolean r2 = r9.equals(r10)
            if (r2 == 0) goto L_0x1760
            java.lang.String r0 = "requested_user"
            java.util.List r0 = r1.A0j(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x1716:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x1777
            java.lang.Object r7 = r12.next()
            X.9nx r7 = (X.C203399nx) r7
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r11 = r7.A0X(r2, r0)
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r2 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r0 = "phone_number"
            com.whatsapp.jid.Jid r7 = r7.A0X(r2, r0)
            com.whatsapp.jid.PhoneUserJid r7 = (com.whatsapp.jid.PhoneUserJid) r7
            boolean r0 = X.AnonymousClass143.A0I(r11)
            if (r0 == 0) goto L_0x1748
            if (r7 == 0) goto L_0x1748
            X.0xQ r0 = r3.A0C
            r2 = r11
            X.13w r2 = (X.C223313w) r2
            X.1PE r0 = r0.A0t
            r0.A00(r2, r7)
        L_0x1748:
            X.C18740tg.A06(r11)
            X.3K1 r0 = new X.3K1
            r27 = r0
            r28 = r5
            r30 = r11
            r31 = r6
            r32 = r10
            r33 = r25
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r4.add(r0)
            goto L_0x1716
        L_0x1760:
            X.C18740tg.A06(r6)
            X.3K1 r2 = new X.3K1
            r27 = r2
            r28 = r5
            r30 = r6
            r31 = r0
            r32 = r10
            r33 = r25
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r4.add(r2)
        L_0x1777:
            X.0xQ r2 = r3.A0C
            java.lang.String r7 = "suppress_sys_msg"
            java.lang.String r0 = "false"
            java.lang.String r0 = r1.A0i(r7, r0)
            boolean r12 = java.lang.Boolean.parseBoolean(r0)
            X.17X r0 = r2.A0U
            boolean r7 = r0.A0D(r5)
            X.16D r11 = r2.A0C
            X.141 r1 = r11.A0D(r5)
            int r0 = r1.A04
            r10 = 1
            if (r0 == r8) goto L_0x1797
            r10 = 0
        L_0x1797:
            if (r7 != 0) goto L_0x17c5
            if (r10 == 0) goto L_0x1d29
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r4.iterator()
        L_0x17a4:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x1d24
            java.lang.Object r0 = r11.next()
            X.3K1 r0 = (X.AnonymousClass3K1) r0
            com.whatsapp.jid.UserJid r9 = r0.A03
            com.whatsapp.jid.UserJid r7 = r0.A04
            long r0 = r0.A00
            X.3JV r4 = new X.3JV
            r15 = r7
            r16 = r0
            r12 = r4
            r13 = r5
            r14 = r9
            r12.<init>(r13, r14, r15, r16)
            r10.add(r4)
            goto L_0x17a4
        L_0x17c5:
            X.1PF r0 = r2.A0R
            r0.A03(r4)
            r7 = 0
            X.141 r1 = r11.A0D(r5)
            boolean r0 = r1.A0u
            if (r0 == r7) goto L_0x17df
            r1.A0u = r7
            X.16p r0 = r11.A05
            r0.A0U(r1)
            X.16z r0 = r11.A04
            r0.A0A(r1)
        L_0x17df:
            if (r12 != 0) goto L_0x1d29
            if (r10 == 0) goto L_0x185e
            java.lang.Object r0 = r4.get(r7)
            X.3K1 r0 = (X.AnonymousClass3K1) r0
            java.lang.String r0 = r0.A05
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x185e
            r5 = 3026(0xbd2, float:4.24E-42)
            X.19x r11 = r2.A0x
            java.lang.Object r10 = r4.get(r7)
            X.3K1 r10 = (X.AnonymousClass3K1) r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SystemMessageFactory/newGroupMembershipApprovalRequestsNonAdminAddSystemMessage/groupjid="
            r1.append(r0)
            X.147 r9 = r10.A01
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r0 = r10.A00
            r16 = 120(0x78, float:1.68E-43)
            r14 = r9
            r15 = r13
            r17 = r0
            r12 = r11
            X.8nz r11 = r12.A04(r13, r14, r15, r16, r17)
            X.8nN r11 = (X.C181378nN) r11
            com.whatsapp.jid.UserJid r0 = r10.A04
            r11.A0q(r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r1 = r4.iterator()
        L_0x182e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1840
            java.lang.Object r0 = r1.next()
            X.3K1 r0 = (X.AnonymousClass3K1) r0
            com.whatsapp.jid.UserJid r0 = r0.A04
            r9.add(r0)
            goto L_0x182e
        L_0x1840:
            com.whatsapp.jid.UserJid r1 = r10.A03
            X.C18740tg.A06(r1)
            X.AnonymousClass00C.A0D(r1, r7)
            r11.A00 = r1
            r11.A01 = r9
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r8]
            r0[r7] = r1
            java.util.ArrayList r0 = X.AnonymousClass03T.A03(r0)
            r0.addAll(r9)
            r11.A01 = r0
            r2.A0T(r5, r11)
            goto L_0x1d29
        L_0x185e:
            java.util.Iterator r10 = r4.iterator()
        L_0x1862:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x1d29
            java.lang.Object r7 = r10.next()
            X.3K1 r7 = (X.AnonymousClass3K1) r7
            r5 = 3020(0xbcc, float:4.232E-42)
            X.19x r9 = r2.A0x
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SystemMessageFactory/newGroupMembershipApprovalRequestSystemMessage/groupjid="
            r1.append(r0)
            X.147 r4 = r7.A01
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r0 = r7.A00
            r16 = 83
            r14 = r4
            r15 = r13
            r17 = r0
            r12 = r9
            X.8nz r1 = r12.A04(r13, r14, r15, r16, r17)
            X.8nW r1 = (X.C181468nW) r1
            com.whatsapp.jid.UserJid r0 = r7.A04
            r1.A0q(r0)
            java.lang.String r0 = r7.A05
            r1.A00 = r0
            r2.A0T(r5, r1)
            goto L_0x1862
        L_0x18a4:
            java.lang.String r4 = "allow_non_admin_sub_group_creation"
            boolean r4 = X.C203399nx.A0I(r1, r4)
            if (r4 == 0) goto L_0x18b0
            r4 = 1
        L_0x18ad:
            monitor-enter(r3)
            goto L_0x2bae
        L_0x18b0:
            java.lang.String r4 = "not_allow_non_admin_sub_group_creation"
            boolean r4 = X.C203399nx.A0I(r1, r4)
            if (r4 == 0) goto L_0x18ba
            r4 = 0
            goto L_0x18ad
        L_0x18ba:
            java.lang.String r4 = "allow_admin_reports"
            boolean r4 = X.C203399nx.A0I(r1, r4)
            if (r4 == 0) goto L_0x1907
            r7 = 1
        L_0x18c3:
            X.11F r0 = X.AnonymousClass143.A00(r27)
            X.147 r5 = X.C65533Sl.A03(r0)
            X.C18740tg.A06(r5)
            X.0xQ r4 = r3.A0C
            X.1Or r0 = r4.A0y
            X.0yC r2 = r0.A00
            r1 = 3695(0xe6f, float:5.178E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x1dcd
            X.16D r2 = r4.A0C
            X.141 r1 = r2.A0D(r5)
            boolean r0 = r1.A0p
            if (r0 == r7) goto L_0x18f4
            r1.A0p = r7
            X.16p r0 = r2.A05
            r0.A0U(r1)
            X.16z r0 = r2.A04
            r0.A0A(r1)
        L_0x18f4:
            r1 = 3027(0xbd3, float:4.242E-42)
            X.19x r0 = r4.A0x
            r9 = r0
            r10 = r5
            r11 = r6
            r12 = r25
            r14 = r7
            X.8nz r0 = r9.A07(r10, r11, r12, r14)
            r4.A0T(r1, r0)
            goto L_0x1dcd
        L_0x1907:
            java.lang.String r4 = "not_allow_admin_reports"
            boolean r4 = X.C203399nx.A0I(r1, r4)
            if (r4 != 0) goto L_0x18c3
            java.lang.String r4 = "reports"
            boolean r4 = X.C203399nx.A0I(r1, r4)
            if (r4 == 0) goto L_0x1929
            X.1C4 r1 = r3.A0E
            r0 = r43
            r1.A01(r0)
            X.0wU r4 = r3.A0G
            X.1j3 r1 = new X.1j3
            r1.<init>(r2, r0, r3, r10)
            r4.Boy(r1)
            return r8
        L_0x1929:
            java.lang.String r4 = "created_sub_group_suggestion"
            boolean r5 = X.C203399nx.A0I(r1, r4)
            if (r5 == 0) goto L_0x1ad9
            java.lang.String r1 = "notification"
            X.C203399nx.A0A(r2, r1)
            java.lang.String r1 = "participant"
            java.lang.String[] r19 = new java.lang.String[]{r1}
            java.lang.Class<com.whatsapp.jid.UserJid> r15 = com.whatsapp.jid.UserJid.class
            r10 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.lang.Long r16 = java.lang.Long.valueOf(r10)
            r10 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            java.lang.Long r17 = java.lang.Long.valueOf(r10)
            r20 = 0
            r14 = r2
            r18 = r0
            X.C203379ns.A03(r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r1 = "sub_group_suggestion"
            java.lang.String r5 = "jid"
            java.lang.String[] r23 = new java.lang.String[]{r4, r1, r5}
            java.lang.Class<X.147> r19 = X.AnonymousClass147.class
            r14 = 0
            r24 = 0
            r18 = r2
            r20 = r16
            r21 = r17
            r22 = r0
            java.lang.Object r13 = X.C203379ns.A03(r18, r19, r20, r21, r22, r23, r24)
            X.147 r13 = (X.AnonymousClass147) r13
            java.lang.String r5 = "creator"
            java.lang.String[] r23 = new java.lang.String[]{r4, r1, r5}
            r19 = r15
            java.lang.Object r15 = X.C203379ns.A03(r18, r19, r20, r21, r22, r23, r24)
            r5 = r15
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            r15 = r5
            java.lang.String r5 = "creation"
            java.lang.String[] r23 = new java.lang.String[]{r4, r1, r5}
            java.lang.Class<java.lang.Long> r19 = java.lang.Long.class
            r10 = 0
            java.lang.Long r20 = java.lang.Long.valueOf(r10)
            java.lang.Object r11 = X.C203379ns.A03(r18, r19, r20, r21, r22, r23, r24)
            java.lang.Number r11 = (java.lang.Number) r11
            java.lang.String r5 = "#elementValue"
            java.lang.String[] r21 = new java.lang.String[]{r4, r1, r9, r5}
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r9 = 1
            java.lang.Long r18 = java.lang.Long.valueOf(r9)
            r9 = 65536(0x10000, double:3.2379E-319)
            java.lang.Long r19 = java.lang.Long.valueOf(r9)
            r22 = 0
            r16 = r2
            r20 = r0
            java.lang.Object r10 = X.C203379ns.A03(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r10 = (java.lang.String) r10
            X.AMB r9 = X.AMB.A00
            java.lang.String[] r5 = new java.lang.String[r7]
            X.C203539oF.A06(r2, r9, r5)
            java.lang.String[] r9 = new java.lang.String[]{r4, r1, r12}
            X.6xz r5 = X.C147916xz.A00
            X.C203379ns.A02(r2, r5, r9)
            java.lang.String r5 = "is_existing_group"
            java.lang.String[] r9 = new java.lang.String[]{r4, r1, r5}
            X.AMC r5 = X.AMC.A00
            java.lang.Object r9 = X.C203379ns.A02(r2, r5, r9)
            X.8sh r9 = (X.C184598sh) r9
            java.lang.String r5 = "participant_count"
            java.lang.String[] r12 = new java.lang.String[]{r4, r1, r5}
            X.6y0 r5 = X.C147926y0.A00
            java.lang.Object r5 = X.C203379ns.A02(r2, r5, r12)
            X.1jK r5 = (X.C35831jK) r5
            java.lang.String[] r18 = new java.lang.String[]{r4, r1}
            X.3pm r17 = X.C76993pm.A00
            r19 = 1
            r21 = 1
            java.util.ArrayList r1 = X.C203539oF.A09(r16, r17, r18, r19, r21)
            java.lang.Object r1 = r1.get(r7)
            X.9nx r1 = (X.C203399nx) r1
            java.lang.String r4 = "notify"
            java.lang.String r19 = r2.A0i(r4, r0)
            X.11F r0 = X.AnonymousClass143.A00(r27)
            X.147 r2 = X.C65533Sl.A03(r0)
            X.C18740tg.A06(r2)
            X.3QL r0 = X.AnonymousClass3UA.A05(r1, r1)
            java.lang.String r7 = r0.A03
            if (r5 == 0) goto L_0x1a19
            java.lang.Object r0 = r5.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r14 = r0.intValue()
        L_0x1a19:
            if (r9 == 0) goto L_0x1a9f
            java.lang.String r0 = r9.A00
            boolean r37 = java.lang.Boolean.parseBoolean(r0)
        L_0x1a21:
            X.0xQ r4 = r3.A0C
            long r33 = r11.longValue()
            long r0 = (long) r14
            X.3KN r5 = new X.3KN
            r30 = r15
            r31 = r10
            r32 = r7
            r35 = r0
            r27 = r5
            r28 = r2
            r29 = r13
            r27.<init>(r28, r29, r30, r31, r32, r33, r35, r37)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r0 = r4.A0A
            r0.A04(r5, r2)
            X.0wQ r1 = r4.A05
            com.whatsapp.jid.UserJid r0 = r43.A00()
            boolean r0 = r1.A0M(r0)
            if (r0 != 0) goto L_0x1d29
            X.0yC r5 = r4.A0a
            r1 = 4184(0x1058, float:5.863E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r5, r1)
            if (r0 == 0) goto L_0x1d29
            X.17X r14 = r4.A0U
            boolean r0 = r14.A0D(r2)
            if (r0 == 0) goto L_0x1d29
            X.1Oo r13 = r4.A0c
            X.19x r1 = r4.A0x
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "SystemMessageFactory/newSubGroupSuggestionSystemMessage/groupjid="
            r0.append(r12)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.19w r11 = r1.A01
            X.3Qa r9 = r11.A02(r2, r8)
            r7 = 145(0x91, float:2.03E-43)
            X.8nz r5 = new X.8nz
            r0 = r25
            r5.<init>(r9, r7, r0)
            r5.A0q(r15)
            r5.A16(r10)
            r7 = 3018(0xbca, float:4.229E-42)
            r13.BJb(r5, r7)
            X.147 r1 = X.C20350xQ.A02(r4, r2)
            if (r1 != 0) goto L_0x1aa2
            java.lang.String r0 = "groupmgr/onSubgroupSuggestion/no cag"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x1d29
        L_0x1a9f:
            r37 = 0
            goto L_0x1a21
        L_0x1aa2:
            boolean r0 = r14.A0C(r1)
            if (r0 != 0) goto L_0x1aaf
            java.lang.String r0 = "groupmgr/onSubgroupSuggestion/not participant"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x1d29
        L_0x1aaf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Qa r5 = r11.A02(r1, r8)
            r4 = 145(0x91, float:2.03E-43)
            X.8nz r2 = new X.8nz
            r0 = r25
            r2.<init>(r5, r4, r0)
            r2.A0q(r15)
            r2.A16(r10)
            r13.BJb(r2, r7)
            goto L_0x1d29
        L_0x1ad9:
            java.lang.String r4 = "revoked_sub_group_suggestions"
            boolean r4 = X.C203399nx.A0I(r1, r4)
            if (r4 == 0) goto L_0x1b8d
            java.lang.String r4 = "notify"
            java.lang.String r4 = r2.A0i(r4, r0)
            X.11F r2 = X.AnonymousClass143.A00(r27)
            X.147 r9 = X.C65533Sl.A03(r2)
            X.C18740tg.A06(r9)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r2 = "sub_group_suggestion"
            java.util.List r1 = r1.A0j(r2)
            java.util.Iterator r13 = r1.iterator()
        L_0x1b01:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x1b35
            java.lang.Object r12 = r13.next()
            X.9nx r12 = (X.C203399nx) r12
            java.lang.Class<X.147> r2 = X.AnonymousClass147.class
            java.lang.String r1 = "jid"
            com.whatsapp.jid.Jid r11 = r12.A0X(r2, r1)
            X.147 r11 = (X.AnonymousClass147) r11
            java.lang.String r1 = "reason"
            java.lang.String r10 = r12.A0i(r1, r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            java.lang.String r1 = "creator"
            com.whatsapp.jid.Jid r1 = r12.A0X(r2, r1)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.3Iv r2 = new X.3Iv
            r2.<init>(r9, r11, r1)
            X.011 r1 = new X.011
            r1.<init>(r2, r10)
            r5.add(r1)
            goto L_0x1b01
        L_0x1b35:
            X.0xQ r0 = r3.A0C
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r10 = r0.A0A
            X.AnonymousClass00C.A0D(r9, r7)
            r0 = 10
            int r0 = X.AnonymousClass03U.A06(r5, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r5.iterator()
        L_0x1b4b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1b5d
            java.lang.Object r0 = r1.next()
            X.011 r0 = (X.AnonymousClass011) r0
            java.lang.Object r0 = r0.first
            r2.add(r0)
            goto L_0x1b4b
        L_0x1b5d:
            X.1PL r0 = r10.A05
            r0.A01(r9, r2)
            java.util.SortedSet r1 = r10.A03(r9)
            X.4JL r0 = new X.4JL
            r0.<init>(r2)
            X.AnonymousClass03Y.A0C(r1, r0)
            X.17Y r2 = r10.A00
            r1 = 25
            X.1iV r0 = new X.1iV
            r0.<init>(r10, r9, r5, r1)
            r2.A0H(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x1dcd
            X.16D r1 = r3.A05
            X.141 r0 = r1.A0D(r6)
            r0.A0a = r4
            r1.A0R(r0)
            goto L_0x1dcd
        L_0x1b8d:
            java.lang.String r4 = "change_number"
            boolean r4 = X.C203399nx.A0I(r1, r4)
            if (r4 == 0) goto L_0x1d3e
            java.lang.String r4 = "notify"
            java.lang.String r19 = r2.A0i(r4, r0)
            X.11F r0 = X.AnonymousClass143.A00(r27)
            X.147 r11 = X.C65533Sl.A03(r0)
            X.C18740tg.A06(r11)
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            java.lang.String r4 = "jid"
            com.whatsapp.jid.Jid r10 = r1.A0X(r0, r4)
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.String r0 = "sub_group_suggestion"
            java.util.List r0 = r1.A0j(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x1bbf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x1bdc
            java.lang.Object r1 = r2.next()
            X.9nx r1 = (X.C203399nx) r1
            java.lang.Class<X.147> r0 = X.AnonymousClass147.class
            com.whatsapp.jid.Jid r1 = r1.A0X(r0, r4)
            X.147 r1 = (X.AnonymousClass147) r1
            X.3Iv r0 = new X.3Iv
            r0.<init>(r11, r1, r6)
            r9.add(r0)
            goto L_0x1bbf
        L_0x1bdc:
            X.0xQ r0 = r3.A0C
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r12 = r0.A0A
            X.AnonymousClass00C.A0D(r11, r7)
            r0 = 2
            X.AnonymousClass00C.A0D(r6, r0)
            r0 = 3
            X.AnonymousClass00C.A0D(r10, r0)
            X.1PM r2 = r12.A01
            java.lang.Object r0 = r2.A09(r11)
            r18 = 0
            if (r0 != 0) goto L_0x1bf7
            r18 = 1
        L_0x1bf7:
            X.1PL r0 = r12.A05
            X.16r r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x1c8b }
            X.1M0 r4 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x1c8b }
            X.71s r17 = r4.B1k()     // Catch:{ all -> 0x1c84 }
            java.util.Iterator r16 = r9.iterator()     // Catch:{ all -> 0x1c7b }
        L_0x1c07:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x1c7b }
            if (r0 == 0) goto L_0x1c71
            java.lang.Object r13 = r16.next()     // Catch:{ all -> 0x1c7b }
            X.3Iv r13 = (X.C63123Iv) r13     // Catch:{ all -> 0x1c7b }
            r0 = 8
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x1c7b }
            r1.<init>(r0)     // Catch:{ all -> 0x1c7b }
            java.lang.String r5 = r10.getRawString()     // Catch:{ all -> 0x1c7b }
            java.lang.String r0 = "creator_jid"
            r1.put(r0, r5)     // Catch:{ all -> 0x1c7b }
            com.whatsapp.jid.UserJid r14 = r13.A01     // Catch:{ all -> 0x1c7b }
            r5 = 2
            if (r14 == 0) goto L_0x1c51
            X.14e r0 = r4.A02     // Catch:{ all -> 0x1c7b }
            r20 = r0
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x1c7b }
            java.lang.String r15 = r11.getRawString()     // Catch:{ all -> 0x1c7b }
            r0[r7] = r15     // Catch:{ all -> 0x1c7b }
            X.147 r13 = r13.A00     // Catch:{ all -> 0x1c7b }
            java.lang.String r13 = r13.getRawString()     // Catch:{ all -> 0x1c7b }
            r0[r8] = r13     // Catch:{ all -> 0x1c7b }
            java.lang.String r13 = r14.getRawString()     // Catch:{ all -> 0x1c7b }
            r0[r5] = r13     // Catch:{ all -> 0x1c7b }
            java.lang.String r22 = "member_suggested_groups_v2"
            java.lang.String r23 = "parent_group_jid = ?  AND group_jid = ?  AND creator_jid = ?"
            java.lang.String r24 = "UPDATE_MEMBER_SUGGESTED_GROUPS_CREATOR"
        L_0x1c49:
            r21 = r1
            r25 = r0
            r20.A01(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x1c7b }
            goto L_0x1c07
        L_0x1c51:
            java.lang.String r0 = "updateSubgroupSuggestionCreatorHelper/Deprecated sql UPDATE_MEMBER_SUGGESTED_GROUPS is used, missing creator"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x1c7b }
            X.14e r0 = r4.A02     // Catch:{ all -> 0x1c7b }
            r20 = r0
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ all -> 0x1c7b }
            java.lang.String r5 = r11.getRawString()     // Catch:{ all -> 0x1c7b }
            r0[r7] = r5     // Catch:{ all -> 0x1c7b }
            X.147 r5 = r13.A00     // Catch:{ all -> 0x1c7b }
            java.lang.String r5 = r5.getRawString()     // Catch:{ all -> 0x1c7b }
            r0[r8] = r5     // Catch:{ all -> 0x1c7b }
            java.lang.String r22 = "member_suggested_groups_v2"
            java.lang.String r23 = "parent_group_jid = ?  AND group_jid = ?"
            java.lang.String r24 = "UPDATE_MEMBER_SUGGESTED_GROUPS"
            goto L_0x1c49
        L_0x1c71:
            r17.A00()     // Catch:{ all -> 0x1c7b }
            r17.close()     // Catch:{ all -> 0x1c84 }
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x1c8b }
            goto L_0x1c8f
        L_0x1c7b:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x1c7d }
        L_0x1c7d:
            r1 = move-exception
            r0 = r17
            X.C05600Qi.A00(r0, r5)     // Catch:{ all -> 0x1c84 }
            throw r1     // Catch:{ all -> 0x1c84 }
        L_0x1c84:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x1c86 }
        L_0x1c86:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x1c8b }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x1c8b }
        L_0x1c8b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x1c8f:
            java.util.SortedSet r1 = r12.A03(r11)
            if (r18 != 0) goto L_0x1d17
            r0 = 10
            int r0 = X.AnonymousClass03U.A06(r1, r0)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r0)
            java.util.Iterator r15 = r1.iterator()
        L_0x1ca4:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x1d0a
            java.lang.Object r7 = r15.next()
            X.3KN r7 = (X.AnonymousClass3KN) r7
            boolean r0 = r9 instanceof java.util.Collection
            if (r0 == 0) goto L_0x1cbe
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x1cbe
        L_0x1cba:
            r14.add(r7)
            goto L_0x1ca4
        L_0x1cbe:
            java.util.Iterator r4 = r9.iterator()
        L_0x1cc2:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x1cba
            java.lang.Object r1 = r4.next()
            X.3Iv r1 = (X.C63123Iv) r1
            X.147 r0 = r1.A00
            X.147 r13 = r7.A02
            boolean r0 = X.AnonymousClass00C.A0J(r0, r13)
            if (r0 == 0) goto L_0x1cc2
            com.whatsapp.jid.UserJid r0 = r1.A01
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)
            if (r0 == 0) goto L_0x1cc2
            X.147 r0 = r7.A03
            r21 = r0
            java.lang.String r0 = r7.A06
            r18 = r0
            java.lang.String r0 = r7.A05
            r17 = r0
            long r4 = r7.A00
            long r0 = r7.A01
            boolean r7 = r7.A07
            r16 = r7
            X.3KN r7 = new X.3KN
            r23 = r10
            r24 = r18
            r25 = r17
            r26 = r4
            r28 = r0
            r30 = r16
            r20 = r7
            r22 = r13
            r20.<init>(r21, r22, r23, r24, r25, r26, r28, r30)
            goto L_0x1cba
        L_0x1d0a:
            X.1PQ r1 = r12.A04
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>(r1)
            X.C007103b.A0i(r14, r0)
            r2.A0D(r11, r0)
        L_0x1d17:
            X.17Y r2 = r12.A00
            r1 = 26
            X.1j2 r0 = new X.1j2
            r0.<init>(r12, r11, r1)
            r2.A0H(r0)
            goto L_0x1d29
        L_0x1d24:
            X.1Nq r0 = r2.A0Y
            r0.A02(r10)
        L_0x1d29:
            boolean r0 = android.text.TextUtils.isEmpty(r19)
            if (r0 != 0) goto L_0x1dcd
            X.16D r2 = r3.A05
            X.141 r1 = r2.A0D(r6)
            r0 = r19
            r1.A0a = r0
            r2.A0R(r1)
            goto L_0x1dcd
        L_0x1d3e:
            java.lang.String r2 = "group_history"
            boolean r2 = X.C203399nx.A0I(r1, r2)
            if (r2 == 0) goto L_0x1d4a
            r7 = 1
        L_0x1d47:
            monitor-enter(r3)
            goto L_0x2bf7
        L_0x1d4a:
            java.lang.String r2 = "no_group_history"
            boolean r2 = X.C203399nx.A0I(r1, r2)
            if (r2 != 0) goto L_0x1d47
            java.lang.String r2 = "groups_dirty"
            boolean r2 = X.C203399nx.A0I(r1, r2)
            if (r2 == 0) goto L_0x1d8d
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r2 = "group"
            java.util.List r1 = r1.A0j(r2)
            java.util.Iterator r4 = r1.iterator()
        L_0x1d69:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x1d82
            java.lang.Object r2 = r4.next()
            X.9nx r2 = (X.C203399nx) r2
            java.lang.String r1 = "jid"
            java.lang.String r1 = r2.A0i(r1, r0)
            X.C18740tg.A06(r1)
            r5.add(r1)
            goto L_0x1d69
        L_0x1d82:
            X.164 r1 = r3.A02
            X.Aug r0 = new X.Aug
            r0.<init>(r5)
            r1.A01(r0)
            goto L_0x1dcd
        L_0x1d8d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GroupNotificationHandler/handleXmppMessage: unknown tag="
            r1.append(r0)
            r1.append(r15)
            goto L_0x1da8
        L_0x1d9b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GroupNotificationHandler/handleGroupUnlinked/incorrect link type = "
        L_0x1da2:
            r1.append(r0)
            r1.append(r5)
        L_0x1da8:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x1dcd
        L_0x1db0:
            X.0xg r2 = r3.A0I
            r1 = 5
            java.lang.String r0 = "lid_migration"
            r2.A0E(r14, r0, r1)
            goto L_0x1dcd
        L_0x1db9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GroupNotificationHandler/handleSubject/old timestamp, gjid="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x1dcd:
            X.1C4 r1 = r3.A0E
            goto L_0x016b
        L_0x1dd1:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r0 = r9.size()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r0)
            boolean r0 = r12.A0D(r6)
            r17 = 1
            r16 = r0 ^ 1
            boolean r0 = r1.A12
            if (r0 == 0) goto L_0x1e87
            boolean r0 = r12.A0D(r6)
            if (r0 == 0) goto L_0x1e87
        L_0x1df1:
            java.util.Collection r0 = r9.values()
            java.util.Iterator r15 = r0.iterator()
        L_0x1df9:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x1e8b
            java.lang.Object r11 = r15.next()
            X.3Kj r11 = (X.C63523Kj) r11
            com.whatsapp.jid.UserJid r3 = r11.A02
            java.lang.String r1 = r11.A04
            r4.add(r3)
            X.AnonymousClass00C.A0D(r1, r7)
            java.lang.String r0 = "admin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x1e7c
            r2 = 1
        L_0x1e18:
            X.17i r0 = r5.A0Z
            r19 = r0
            java.util.HashSet r0 = r0.A0B(r3)
            java.util.HashSet r1 = X.AnonymousClass6X6.A02(r0)
            X.6PM r0 = new X.6PM
            r0.<init>(r3, r1, r2, r7)
            r13.add(r0)
            boolean r0 = r11.A00()
            if (r0 == 0) goto L_0x1e60
            X.17b r0 = r5.A0i
            X.AnonymousClass00C.A0D(r6, r7)
            X.16D r0 = r0.A01
            r18 = r0
            X.141 r0 = r0.A0A(r6)
            if (r0 == 0) goto L_0x1e6f
            java.lang.String r0 = r0.A0M
            r1 = r0
            java.lang.String r0 = "lid"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x1e6f
        L_0x1e4c:
            X.13w r1 = r11.A00
            r0 = r19
            java.util.HashSet r0 = r0.A0B(r1)
            java.util.HashSet r11 = X.AnonymousClass6X6.A02(r0)
            X.6PM r0 = new X.6PM
            r0.<init>(r1, r11, r2, r7)
            r13.add(r0)
        L_0x1e60:
            if (r17 == 0) goto L_0x1e67
            X.1PF r0 = r5.A0R
            r0.A02(r6, r3)
        L_0x1e67:
            if (r16 == 0) goto L_0x1df9
            X.1Nq r0 = r5.A0Y
            r0.A01(r6, r3)
            goto L_0x1df9
        L_0x1e6f:
            r0 = r18
            X.141 r0 = r0.A0A(r6)
            if (r0 == 0) goto L_0x1e60
            boolean r0 = r0.A0j
            if (r0 == 0) goto L_0x1e60
            goto L_0x1e4c
        L_0x1e7c:
            java.lang.String r0 = "superadmin"
            boolean r0 = r0.equals(r1)
            r2 = 0
            if (r0 == 0) goto L_0x1e18
            r2 = 2
            goto L_0x1e18
        L_0x1e87:
            r17 = 0
            goto L_0x1df1
        L_0x1e8b:
            X.1Nr r0 = r5.A0G
            com.whatsapp.jid.UserJid[] r1 = new com.whatsapp.jid.UserJid[r7]
            java.lang.Object[] r1 = r4.toArray(r1)
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1
            r0.A01(r1, r10)
            X.0wU r2 = r5.A12
            r1 = 17
            X.1j9 r0 = new X.1j9
            r0.<init>(r5, r4, r1)
            r2.Boy(r0)
            X.C20350xQ.A08(r14, r5, r13)
            X.17b r0 = r5.A0i
            boolean r0 = r0.A02(r6)
            if (r0 == 0) goto L_0x1eb2
            r12.A07(r14)
        L_0x1eb2:
            r1 = 22
            X.1j0 r0 = new X.1j0
            r0.<init>(r5, r6, r9, r1)
            r2.Boy(r0)
            java.util.List r1 = X.C20350xQ.A05(r5, r6, r4)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x1f1e
            boolean r0 = r12.A0D(r6)
            if (r0 != 0) goto L_0x1f16
            X.12q r0 = r5.A0M
            boolean r0 = r0.A0O(r6)
            if (r0 == 0) goto L_0x1f16
            com.whatsapp.jid.UserJid r1 = r43.A00()
            r0 = r20
            boolean r0 = r0.A0M(r1)
            if (r0 == 0) goto L_0x1f16
        L_0x1ee0:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x1f16
            com.whatsapp.jid.UserJid r32 = r43.A00()
            X.12q r0 = r5.A0M
            int r39 = r0.A05(r6)
            r33 = r29
            r36 = r29
            r37 = r29
            r42 = 0
            r27 = r5
            r28 = r14
            r30 = r29
            r31 = r6
            r34 = r43
            r38 = r4
            r40 = r25
            r27.A0V(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42)
        L_0x1f09:
            X.17Y r2 = r5.A04
            r1 = 21
            X.1j0 r0 = new X.1j0
            r0.<init>(r5, r6, r14, r1)
            r2.A0H(r0)
            return r8
        L_0x1f16:
            X.1C4 r1 = r5.A0s
            r0 = r43
            r1.A01(r0)
            goto L_0x1f09
        L_0x1f1e:
            r4 = r1
            goto L_0x1ee0
        L_0x1f20:
            java.lang.String r2 = "id"
            java.lang.String r2 = r9.A0i(r2, r0)     // Catch:{ 0wR -> 0x2921 }
            X.C18740tg.A06(r2)     // Catch:{ 0wR -> 0x2921 }
            X.147 r6 = X.AnonymousClass143.A02(r2)     // Catch:{ 0wR -> 0x2921 }
            X.C18740tg.A06(r6)     // Catch:{ 0wR -> 0x2921 }
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "creator"
            com.whatsapp.jid.Jid r31 = r9.A0X(r4, r2)     // Catch:{ 0wR -> 0x2921 }
            r2 = r31
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ 0wR -> 0x2921 }
            r31 = r2
            java.lang.String r2 = "creation"
            java.lang.String r2 = r9.A0i(r2, r0)     // Catch:{ 0wR -> 0x2921 }
            r4 = 0
            long r23 = X.AnonymousClass6R8.A01(r2, r4)     // Catch:{ 0wR -> 0x2921 }
            long r23 = r23 * r74
            X.0xQ r2 = r3.A0C     // Catch:{ 0wR -> 0x2921 }
            r10 = r31
            r2.A0g(r10, r9)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r10 = "reason"
            java.lang.String r42 = r1.A0i(r10, r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r10 = "key"
            java.lang.String r45 = r1.A0i(r10, r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r10 = "new"
            boolean r32 = r10.equalsIgnoreCase(r12)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r10 = "subject"
            java.lang.String r39 = r9.A0i(r10, r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r10 = "s_t"
            java.lang.String r10 = r9.A0i(r10, r0)     // Catch:{ 0wR -> 0x2921 }
            long r20 = X.AnonymousClass6R8.A01(r10, r4)     // Catch:{ 0wR -> 0x2921 }
            long r20 = r20 * r74
            java.lang.String r10 = "a_v_id"
            long r40 = r9.A0V(r10, r4)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r4 = "ack"
            java.lang.String r5 = r9.A0i(r4, r0)     // Catch:{ 0wR -> 0x2921 }
            if (r5 == 0) goto L_0x1f8f
            java.lang.String r4 = "false"
            boolean r4 = r5.equals(r4)     // Catch:{ 0wR -> 0x2921 }
            r30 = 0
            if (r4 != 0) goto L_0x1f91
        L_0x1f8f:
            r30 = 1
        L_0x1f91:
            java.lang.String r11 = r9.A0i(r11, r0)     // Catch:{ 0wR -> 0x2921 }
            X.0wN r5 = r3.A00     // Catch:{ 0wR -> 0x2921 }
            r4 = 2
            X.1yV r0 = new X.1yV     // Catch:{ 0wR -> 0x2921 }
            r0.<init>(r5, r4)     // Catch:{ 0wR -> 0x2921 }
            java.util.LinkedHashMap r36 = X.AnonymousClass3UA.A07(r9, r0)     // Catch:{ 0wR -> 0x2921 }
            X.3UA r4 = X.AnonymousClass3UA.A00     // Catch:{ 0wR -> 0x2921 }
            int r27 = X.AnonymousClass3UA.A00(r9)     // Catch:{ 0wR -> 0x2921 }
            X.3G4 r78 = r4.A0B(r9)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r5 = "size"
            java.lang.String r0 = "0"
            java.lang.String r0 = r9.A0i(r5, r0)     // Catch:{ 0wR -> 0x2921 }
            X.C18740tg.A06(r0)     // Catch:{ 0wR -> 0x2921 }
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = "description"
            X.9nx r0 = r9.A0c(r0)     // Catch:{ 0wR -> 0x2921 }
            X.3QL r15 = X.AnonymousClass3UA.A05(r9, r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = "support"
            X.9nx r0 = r9.A0c(r0)     // Catch:{ 0wR -> 0x2921 }
            r14 = 0
            if (r0 == 0) goto L_0x1fce
            r14 = 1
        L_0x1fce:
            java.lang.String r0 = "locked"
            X.9nx r0 = r9.A0c(r0)     // Catch:{ 0wR -> 0x2921 }
            r52 = 0
            if (r0 == 0) goto L_0x1fda
            r52 = 1
        L_0x1fda:
            java.lang.String r0 = "announcement"
            X.9nx r0 = r9.A0c(r0)     // Catch:{ 0wR -> 0x2921 }
            r47 = 0
            if (r0 == 0) goto L_0x1fe6
            r47 = 1
        L_0x1fe6:
            java.lang.String r0 = "no_frequently_forwarded"
            X.9nx r0 = r9.A0c(r0)     // Catch:{ 0wR -> 0x2921 }
            r66 = 0
            if (r0 == 0) goto L_0x1ff2
            r66 = 1
        L_0x1ff2:
            java.lang.String r0 = "suspended"
            X.9nx r0 = r9.A0c(r0)     // Catch:{ 0wR -> 0x2921 }
            r67 = 0
            if (r0 == 0) goto L_0x1ffe
            r67 = 1
        L_0x1ffe:
            int r0 = r36.size()     // Catch:{ 0wR -> 0x2921 }
            int r51 = java.lang.Math.max(r5, r0)     // Catch:{ 0wR -> 0x2921 }
            int r38 = X.AnonymousClass3UA.A02(r9)     // Catch:{ 0wR -> 0x2921 }
            X.147 r10 = X.AnonymousClass3UA.A03(r9)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = "incognito"
            X.9nx r0 = r9.A0c(r0)     // Catch:{ 0wR -> 0x2921 }
            r19 = 0
            if (r0 == 0) goto L_0x201a
            r19 = 1
        L_0x201a:
            boolean r44 = X.AnonymousClass3UA.A08(r9)     // Catch:{ 0wR -> 0x2921 }
            int r50 = r4.A09(r9)     // Catch:{ 0wR -> 0x2921 }
            int r49 = X.AnonymousClass3UA.A01(r9)     // Catch:{ 0wR -> 0x2921 }
            java.lang.Class<com.whatsapp.jid.GroupJid> r4 = com.whatsapp.jid.GroupJid.class
            java.lang.String r0 = "context_group_jid"
            com.whatsapp.jid.Jid r29 = r1.A0X(r4, r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r29
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0     // Catch:{ 0wR -> 0x2921 }
            r29 = r0
            java.lang.String r0 = "allow_admin_reports"
            X.9nx r0 = r9.A0c(r0)     // Catch:{ 0wR -> 0x2921 }
            r70 = 0
            if (r0 == 0) goto L_0x2040
            r70 = 1
        L_0x2040:
            java.lang.String r0 = "allow_non_admin_sub_group_creation"
            X.9nx r0 = r9.A0c(r0)     // Catch:{ 0wR -> 0x2921 }
            r13 = 0
            if (r0 == 0) goto L_0x204a
            r13 = 1
        L_0x204a:
            java.lang.String r0 = "group_history"
            X.9nx r0 = r9.A0c(r0)     // Catch:{ 0wR -> 0x2921 }
            r22 = 0
            if (r0 == 0) goto L_0x2056
            r22 = 1
        L_0x2056:
            java.lang.String r0 = "auto_add_disabled"
            X.9nx r0 = r9.A0c(r0)     // Catch:{ 0wR -> 0x2921 }
            r12 = 0
            if (r0 == 0) goto L_0x2060
            r12 = 1
        L_0x2060:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ 0wR -> 0x2921 }
            r4.<init>()     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r35 = "groupmgr/onGroupNewGroup/"
            r0 = r35
            r4.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r23
            r4.append(r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r5 = "/"
            r4.append(r5)     // Catch:{ 0wR -> 0x2921 }
            r0 = r20
            r4.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r4.append(r5)     // Catch:{ 0wR -> 0x2921 }
            r4.append(r11)     // Catch:{ 0wR -> 0x2921 }
            r4.append(r5)     // Catch:{ 0wR -> 0x2921 }
            r0 = r42
            r4.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r4.append(r5)     // Catch:{ 0wR -> 0x2921 }
            r4.append(r14)     // Catch:{ 0wR -> 0x2921 }
            r4.append(r5)     // Catch:{ 0wR -> 0x2921 }
            r0 = r52
            r4.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r4.append(r5)     // Catch:{ 0wR -> 0x2921 }
            r0 = r47
            r4.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r4.append(r5)     // Catch:{ 0wR -> 0x2921 }
            r0 = r27
            r4.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r4.append(r5)     // Catch:{ 0wR -> 0x2921 }
            r0 = r38
            r4.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r4.append(r5)     // Catch:{ 0wR -> 0x2921 }
            r0 = r19
            r4.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r4.append(r5)     // Catch:{ 0wR -> 0x2921 }
            r0 = r44
            r4.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r4.append(r5)     // Catch:{ 0wR -> 0x2921 }
            r0 = r50
            r4.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r4.append(r5)     // Catch:{ 0wR -> 0x2921 }
            r4.append(r13)     // Catch:{ 0wR -> 0x2921 }
            r4.append(r5)     // Catch:{ 0wR -> 0x2921 }
            r0 = r22
            r4.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r4.append(r5)     // Catch:{ 0wR -> 0x2921 }
            r4.append(r12)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = r4.toString()     // Catch:{ 0wR -> 0x2921 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 0wR -> 0x2921 }
            r1.<init>()     // Catch:{ 0wR -> 0x2921 }
            r0 = r35
            r1.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r36
            r1.append(r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = r1.toString()     // Catch:{ 0wR -> 0x2921 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 0wR -> 0x2921 }
            r1.<init>()     // Catch:{ 0wR -> 0x2921 }
            r0 = r35
            r1.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r1.append(r15)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = r1.toString()     // Catch:{ 0wR -> 0x2921 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0wR -> 0x2921 }
            X.12q r0 = r2.A0M     // Catch:{ 0wR -> 0x2921 }
            r84 = r0
            boolean r0 = r0.A0M(r6)     // Catch:{ 0wR -> 0x2921 }
            r16 = r0 ^ 1
            com.whatsapp.jid.UserJid r28 = r43.A00()     // Catch:{ 0wR -> 0x2921 }
            X.0wQ r0 = r2.A05     // Catch:{ 0wR -> 0x2921 }
            r83 = r0
            r1 = r31
            boolean r0 = r0.A0M(r1)     // Catch:{ 0wR -> 0x2921 }
            if (r0 == 0) goto L_0x2132
            r1 = r28
            r0 = r83
            boolean r0 = r0.A0M(r1)     // Catch:{ 0wR -> 0x2921 }
            r17 = 1
            if (r0 != 0) goto L_0x2134
        L_0x2132:
            r17 = 0
        L_0x2134:
            if (r28 == 0) goto L_0x2142
            r1 = r36
            r0 = r28
            boolean r0 = r1.containsKey(r0)     // Catch:{ 0wR -> 0x2921 }
            r18 = 1
            if (r0 == 0) goto L_0x2144
        L_0x2142:
            r18 = 0
        L_0x2144:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 0wR -> 0x2921 }
            r1.<init>()     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = "groupmgr/onGroupNewGroup/ new:"
            r1.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r16
            r1.append(r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = " mecreator:"
            r1.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r17
            r1.append(r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = " numberchange:"
            r1.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r18
            r1.append(r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = r1.toString()     // Catch:{ 0wR -> 0x2921 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0wR -> 0x2921 }
            java.util.HashMap r33 = new java.util.HashMap     // Catch:{ 0wR -> 0x2921 }
            r33.<init>()     // Catch:{ 0wR -> 0x2921 }
            if (r17 == 0) goto L_0x21b9
            boolean r0 = android.text.TextUtils.isEmpty(r45)     // Catch:{ 0wR -> 0x2921 }
            if (r0 == 0) goto L_0x2189
            X.C18740tg.A06(r39)     // Catch:{ 0wR -> 0x2921 }
            X.3BZ r4 = X.AnonymousClass146.A01     // Catch:{ 0wR -> 0x2921 }
            r1 = r39
            r0 = r83
            X.146 r4 = r4.A00(r0, r1)     // Catch:{ 0wR -> 0x2921 }
            goto L_0x21b6
        L_0x2189:
            android.os.Parcelable$Creator r0 = X.AnonymousClass146.CREATOR     // Catch:{ 0wR -> 0x2921 }
            if (r45 == 0) goto L_0x21b9
            int r0 = r45.length()     // Catch:{ 0wR -> 0x2921 }
            r4 = 0
            if (r0 == 0) goto L_0x21b9
            com.whatsapp.jid.Jid r1 = X.C222513o.A00(r45)     // Catch:{ all -> 0x21a9 }
            boolean r0 = r1 instanceof X.AnonymousClass146     // Catch:{ all -> 0x21a9 }
            if (r0 == 0) goto L_0x21a1
            X.146 r1 = (X.AnonymousClass146) r1     // Catch:{ all -> 0x21a9 }
            if (r1 == 0) goto L_0x21a1
            goto L_0x21af
        L_0x21a1:
            X.0wR r1 = new X.0wR     // Catch:{ all -> 0x21a9 }
            r0 = r45
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x21a9 }
            throw r1     // Catch:{ all -> 0x21a9 }
        L_0x21a9:
            r0 = move-exception
            X.03N r1 = new X.03N     // Catch:{ 0wR -> 0x2921 }
            r1.<init>(r0)     // Catch:{ 0wR -> 0x2921 }
        L_0x21af:
            boolean r0 = r1 instanceof X.AnonymousClass03N     // Catch:{ 0wR -> 0x2921 }
            if (r0 != 0) goto L_0x21b4
            r4 = r1
        L_0x21b4:
            X.144 r4 = (X.AnonymousClass144) r4     // Catch:{ 0wR -> 0x2921 }
        L_0x21b6:
            if (r4 == 0) goto L_0x21b9
            goto L_0x21ba
        L_0x21b9:
            r4 = 0
        L_0x21ba:
            boolean r0 = r36.isEmpty()     // Catch:{ 0wR -> 0x2921 }
            if (r0 != 0) goto L_0x21c7
            X.1PE r1 = r2.A0t     // Catch:{ 0wR -> 0x2921 }
            r0 = r36
            r1.A02(r0)     // Catch:{ 0wR -> 0x2921 }
        L_0x21c7:
            if (r4 == 0) goto L_0x23d8
            r0 = r84
            boolean r0 = r0.A0M(r4)     // Catch:{ 0wR -> 0x2921 }
            if (r0 == 0) goto L_0x23d8
            X.17X r15 = r2.A0U     // Catch:{ 0wR -> 0x2921 }
            X.17r r1 = r15.A07     // Catch:{ 0wR -> 0x2921 }
            X.6X6 r48 = r1.A0C(r4)     // Catch:{ 0wR -> 0x2921 }
            X.1LW r0 = r2.A0P     // Catch:{ 0wR -> 0x2921 }
            java.lang.String[] r14 = new java.lang.String[r8]     // Catch:{ 0wR -> 0x2921 }
            X.163 r13 = r0.A01     // Catch:{ 0wR -> 0x2921 }
            long r11 = r13.A08(r4)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r9 = java.lang.String.valueOf(r11)     // Catch:{ 0wR -> 0x2921 }
            r14[r7] = r9     // Catch:{ 0wR -> 0x2921 }
            X.12P r0 = r0.A03     // Catch:{ 0wR -> 0x2921 }
            X.1M0 r46 = r0.A05()     // Catch:{ 0wR -> 0x2921 }
            X.71s r45 = r46.B1k()     // Catch:{ all -> 0x23ce }
            r0 = r46
            X.14e r0 = r0.A02     // Catch:{ all -> 0x23c4 }
            r12 = r0
            java.lang.String r11 = "message"
            java.lang.String r9 = "_id IN (   SELECT _id   FROM deleted_messages_ids_view   WHERE chat_row_id = ?)"
            java.lang.String r0 = "updateTempGroup/DELETE_MESSAGE"
            r12.A03(r11, r9, r0, r14)     // Catch:{ all -> 0x23c4 }
            r13.A0I(r4)     // Catch:{ all -> 0x23c4 }
            r45.A00()     // Catch:{ all -> 0x23c4 }
            r45.close()     // Catch:{ all -> 0x23ce }
            r46.close()     // Catch:{ 0wR -> 0x2921 }
            X.12P r0 = r15.A06     // Catch:{ 0wR -> 0x2921 }
            X.1M0 r46 = r0.A05()     // Catch:{ 0wR -> 0x2921 }
            X.71s r45 = r46.B1k()     // Catch:{ all -> 0x23ce }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x23c4 }
            r9.<init>()     // Catch:{ all -> 0x23c4 }
            java.lang.String r0 = "participant-user-store/updateTempGroup/"
            r9.append(r0)     // Catch:{ all -> 0x23c4 }
            r9.append(r4)     // Catch:{ all -> 0x23c4 }
            r9.append(r5)     // Catch:{ all -> 0x23c4 }
            r9.append(r6)     // Catch:{ all -> 0x23c4 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x23c4 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x23c4 }
            X.12P r0 = r1.A06     // Catch:{ all -> 0x23c4 }
            X.1M0 r9 = r0.A05()     // Catch:{ all -> 0x23c4 }
            X.12j r0 = r1.A05     // Catch:{ all -> 0x23ba }
            long r11 = r0.A07(r4)     // Catch:{ all -> 0x23ba }
            long r13 = r0.A07(r6)     // Catch:{ all -> 0x23ba }
            java.lang.String[] r5 = new java.lang.String[r8]     // Catch:{ all -> 0x23ba }
            java.lang.String r0 = java.lang.Long.toString(r11)     // Catch:{ all -> 0x23ba }
            r5[r7] = r0     // Catch:{ all -> 0x23ba }
            r11 = 2
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ all -> 0x23ba }
            r0.<init>(r11)     // Catch:{ all -> 0x23ba }
            java.lang.String r12 = "group_jid_row_id"
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x23ba }
            r0.put(r12, r11)     // Catch:{ all -> 0x23ba }
            java.lang.String r12 = "pending"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x23ba }
            r0.put(r12, r11)     // Catch:{ all -> 0x23ba }
            X.14e r11 = r9.A02     // Catch:{ all -> 0x23ba }
            java.lang.String r55 = "group_participant_user"
            java.lang.String r56 = "group_jid_row_id = ?"
            java.lang.String r57 = "updateTempGroup/UPDATE_GROUP_PARTICIPANT_USER"
            r53 = r11
            r54 = r0
            r58 = r5
            r53.A01(r54, r55, r56, r57, r58)     // Catch:{ all -> 0x23ba }
            r9.close()     // Catch:{ all -> 0x23c4 }
            X.17u r0 = r1.A04     // Catch:{ all -> 0x23c4 }
            java.util.Map r0 = r0.A07     // Catch:{ all -> 0x23c4 }
            r0.remove(r4)     // Catch:{ all -> 0x23c4 }
            r45.A00()     // Catch:{ all -> 0x23c4 }
            r45.close()     // Catch:{ all -> 0x23ce }
            r46.close()     // Catch:{ 0wR -> 0x2921 }
            android.os.Handler r5 = X.C20350xQ.A1H     // Catch:{ 0wR -> 0x2921 }
            r1 = 20
            X.1j9 r0 = new X.1j9     // Catch:{ 0wR -> 0x2921 }
            r0.<init>(r2, r4, r1)     // Catch:{ 0wR -> 0x2921 }
            r5.post(r0)     // Catch:{ 0wR -> 0x2921 }
            X.16D r5 = r2.A0C     // Catch:{ 0wR -> 0x2921 }
            X.141 r11 = r5.A0D(r4)     // Catch:{ 0wR -> 0x2921 }
            r0 = r44
            r11.A12 = r0     // Catch:{ 0wR -> 0x2921 }
            r83.A0G()     // Catch:{ 0wR -> 0x2921 }
            r0 = r83
            com.whatsapp.jid.PhoneUserJid r0 = r0.A03     // Catch:{ 0wR -> 0x2921 }
            r11.A0I = r0     // Catch:{ 0wR -> 0x2921 }
            r0 = r49
            r11.A04 = r0     // Catch:{ 0wR -> 0x2921 }
            r0 = r47
            r11.A0d = r0     // Catch:{ 0wR -> 0x2921 }
            r0 = r52
            r11.A13 = r0     // Catch:{ 0wR -> 0x2921 }
            X.16p r9 = r5.A05     // Catch:{ 0wR -> 0x2921 }
            X.14g r13 = new X.14g     // Catch:{ 0wR -> 0x2921 }
            r13.<init>((boolean) r8)     // Catch:{ 0wR -> 0x2921 }
            r13.A03()     // Catch:{ 0wR -> 0x2921 }
            r0 = 3
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ 0wR -> 0x2921 }
            r1.<init>(r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r12 = r6.getRawString()     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = "jid"
            r1.put(r0, r12)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r12 = "display_name"
            r0 = r39
            r1.put(r12, r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r12 = java.lang.Long.toString(r23)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = "phone_label"
            r1.put(r0, r12)     // Catch:{ 0wR -> 0x2921 }
            X.11F r0 = r11.A0H     // Catch:{ 0wR -> 0x2921 }
            X.C229516p.A09(r1, r9, r0)     // Catch:{ 0wR -> 0x2921 }
            X.C229516p.A0D(r9, r11, r6)     // Catch:{ 0wR -> 0x2921 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ 0wR -> 0x2921 }
            r9.<init>()     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = "updated temp group"
            r9.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r34
            r9.append(r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = " creationTime="
            r9.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r23
            r9.append(r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = " oldJid="
            r9.append(r0)     // Catch:{ 0wR -> 0x2921 }
            X.11F r0 = r11.A0H     // Catch:{ 0wR -> 0x2921 }
            r9.append(r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = " newJid="
            r9.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r9.append(r6)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = " | time: "
            r9.append(r0)     // Catch:{ 0wR -> 0x2921 }
            long r0 = r13.A00()     // Catch:{ 0wR -> 0x2921 }
            r9.append(r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = r9.toString()     // Catch:{ 0wR -> 0x2921 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0wR -> 0x2921 }
            X.16z r1 = r5.A04     // Catch:{ 0wR -> 0x2921 }
            java.lang.Class<X.146> r0 = X.AnonymousClass146.class
            com.whatsapp.jid.Jid r0 = r11.A06(r0)     // Catch:{ 0wR -> 0x2921 }
            java.util.Map r1 = r1.A01     // Catch:{ 0wR -> 0x2921 }
            r1.remove(r0)     // Catch:{ 0wR -> 0x2921 }
            r1.remove(r6)     // Catch:{ 0wR -> 0x2921 }
            r5.A0D(r6)     // Catch:{ 0wR -> 0x2921 }
            X.1A6 r9 = r2.A0H     // Catch:{ 0wR -> 0x2921 }
            X.12q r0 = r9.A02     // Catch:{ 0wR -> 0x2921 }
            X.C220412q.A00(r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 0wR -> 0x2921 }
            r1.<init>()     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = "conversationsmgr/replacecontact:"
            r1.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r1.append(r4)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = " -> "
            r1.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r1.append(r6)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = r1.toString()     // Catch:{ 0wR -> 0x2921 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r25
            X.AnonymousClass1A6.A00(r9, r4, r6, r0)     // Catch:{ 0wR -> 0x2921 }
            java.util.Set r0 = r36.entrySet()     // Catch:{ 0wR -> 0x2921 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ 0wR -> 0x2921 }
        L_0x2362:
            boolean r0 = r9.hasNext()     // Catch:{ 0wR -> 0x2921 }
            if (r0 == 0) goto L_0x2446
            java.lang.Object r1 = r9.next()     // Catch:{ 0wR -> 0x2921 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ 0wR -> 0x2921 }
            java.lang.Object r4 = r1.getKey()     // Catch:{ 0wR -> 0x2921 }
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ 0wR -> 0x2921 }
            r0 = r48
            X.6PM r0 = r0.A08(r4)     // Catch:{ 0wR -> 0x2921 }
            if (r0 != 0) goto L_0x2362
            java.lang.Object r4 = r1.getKey()     // Catch:{ 0wR -> 0x2921 }
            X.11F r4 = (X.AnonymousClass11F) r4     // Catch:{ 0wR -> 0x2921 }
            r0 = r83
            boolean r0 = r0.A0M(r4)     // Catch:{ 0wR -> 0x2921 }
            if (r0 != 0) goto L_0x2362
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ 0wR -> 0x2921 }
            r4.<init>()     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = "groupmgr/onGroupNewGroup/ identified new participant:"
            r4.append(r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ 0wR -> 0x2921 }
            r4.append(r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = r4.toString()     // Catch:{ 0wR -> 0x2921 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0wR -> 0x2921 }
            r1.getValue()     // Catch:{ 0wR -> 0x2921 }
            java.lang.Object r4 = r1.getKey()     // Catch:{ 0wR -> 0x2921 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ 0wR -> 0x2921 }
            X.3Kj r0 = (X.C63523Kj) r0     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r1 = r0.A04     // Catch:{ 0wR -> 0x2921 }
            r0 = r33
            r0.put(r4, r1)     // Catch:{ 0wR -> 0x2921 }
            r9.remove()     // Catch:{ 0wR -> 0x2921 }
            goto L_0x2362
        L_0x23ba:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x23bf }
            goto L_0x23c3
        L_0x23bf:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x23c4 }
        L_0x23c3:
            throw r1     // Catch:{ all -> 0x23c4 }
        L_0x23c4:
            r1 = move-exception
            r45.close()     // Catch:{ all -> 0x23c9 }
            goto L_0x23cd
        L_0x23c9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x23ce }
        L_0x23cd:
            throw r1     // Catch:{ all -> 0x23ce }
        L_0x23ce:
            r1 = move-exception
            r46.close()     // Catch:{ all -> 0x23d3 }
            goto L_0x23d7
        L_0x23d3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 0wR -> 0x2921 }
        L_0x23d7:
            throw r1     // Catch:{ 0wR -> 0x2921 }
        L_0x23d8:
            X.16D r5 = r2.A0C     // Catch:{ 0wR -> 0x2921 }
            X.141 r4 = r5.A08(r6)     // Catch:{ 0wR -> 0x2921 }
            if (r4 != 0) goto L_0x240b
            X.141 r0 = new X.141     // Catch:{ 0wR -> 0x2921 }
            r0.<init>(r6)     // Catch:{ 0wR -> 0x2921 }
            r53 = r5
            r54 = r0
            r55 = r31
            r56 = r15
            r57 = r39
            r58 = r37
            r59 = r27
            r60 = r49
            r61 = r23
            r63 = r14
            r64 = r52
            r65 = r47
            r68 = r19
            r69 = r44
            r71 = r13
            r72 = r22
            r73 = r12
            r53.A0W(r54, r55, r56, r57, r58, r59, r60, r61, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73)     // Catch:{ 0wR -> 0x2921 }
            goto L_0x2446
        L_0x240b:
            X.1O8 r9 = r2.A0u     // Catch:{ 0wR -> 0x2921 }
            int r1 = r4.A06     // Catch:{ 0wR -> 0x2921 }
            r0 = 2
            r9.A01(r6, r1, r0)     // Catch:{ 0wR -> 0x2921 }
            r53 = r4
            r54 = r2
            r55 = r31
            r56 = r15
            r57 = r39
            r58 = r37
            r59 = r49
            r60 = r23
            r62 = r14
            r63 = r52
            r64 = r47
            r65 = r66
            r66 = r67
            r67 = r19
            r68 = r44
            r69 = r70
            r70 = r13
            r71 = r22
            r72 = r12
            boolean r0 = X.C20350xQ.A0J(r53, r54, r55, r56, r57, r58, r59, r60, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)     // Catch:{ 0wR -> 0x2921 }
            if (r0 == 0) goto L_0x2446
            r0 = r27
            r4.A02 = r0     // Catch:{ 0wR -> 0x2921 }
            r5.A0S(r4)     // Catch:{ 0wR -> 0x2921 }
        L_0x2446:
            r1 = 3
            r0 = r38
            if (r0 != r1) goto L_0x2452
            r0 = 1
            r1 = r51
            X.C20350xQ.A0G(r2, r6, r1)     // Catch:{ 0wR -> 0x2921 }
            goto L_0x2485
        L_0x2452:
            r0 = 0
            r1 = r38
            if (r1 != r8) goto L_0x2485
            r1 = r84
            X.3Qp r1 = r1.A09(r6, r7)     // Catch:{ 0wR -> 0x2921 }
            if (r1 == 0) goto L_0x2470
            X.1LV r11 = r2.A08     // Catch:{ 0wR -> 0x2921 }
            r1 = r84
            X.3Qp r9 = r1.A09(r6, r7)     // Catch:{ 0wR -> 0x2921 }
            if (r9 == 0) goto L_0x2485
            r4 = 1
            r1 = r50
            if (r1 == r8) goto L_0x247e
            r4 = 0
            goto L_0x247e
        L_0x2470:
            if (r16 == 0) goto L_0x2485
            r4 = 1
            r1 = r50
            if (r1 == r8) goto L_0x2478
            r4 = 0
        L_0x2478:
            X.1FG r1 = r2.A09     // Catch:{ 0wR -> 0x2921 }
            r1.A01(r6, r4)     // Catch:{ 0wR -> 0x2921 }
            goto L_0x2485
        L_0x247e:
            r9.A0n = r4     // Catch:{ 0wR -> 0x2921 }
            X.1Eu r1 = r11.A03     // Catch:{ 0wR -> 0x2921 }
            r1.A00(r9)     // Catch:{ 0wR -> 0x2921 }
        L_0x2485:
            r9 = r2
            r11 = r6
            r12 = r39
            r13 = r38
            r14 = r20
            X.C20350xQ.A0H(r9, r10, r11, r12, r13, r14)     // Catch:{ 0wR -> 0x2921 }
            X.17X r1 = r2.A0U     // Catch:{ 0wR -> 0x2921 }
            X.17r r1 = r1.A07     // Catch:{ 0wR -> 0x2921 }
            X.6X6 r14 = r1.A0C(r6)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r4 = "lid"
            r1 = r37
            boolean r13 = r4.equals(r1)     // Catch:{ 0wR -> 0x2921 }
            if (r13 == 0) goto L_0x24a4
            r1 = 3
            goto L_0x24ad
        L_0x24a4:
            if (r0 == 0) goto L_0x24ab
            r1 = 2
        L_0x24a7:
            if (r19 != 0) goto L_0x24ad
            r1 = 0
            goto L_0x24ad
        L_0x24ab:
            r1 = 1
            goto L_0x24a7
        L_0x24ad:
            r14.A00 = r1     // Catch:{ 0wR -> 0x2921 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ 0wR -> 0x2921 }
            r4.<init>()     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r1 = "groupmgr/onGroupNewGroup oldparticipants:"
            r4.append(r1)     // Catch:{ 0wR -> 0x2921 }
            X.0y7 r1 = r14.A05()     // Catch:{ 0wR -> 0x2921 }
            r4.append(r1)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r1 = r4.toString()     // Catch:{ 0wR -> 0x2921 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 0wR -> 0x2921 }
            r1 = r83
            boolean r15 = r14.A0O(r1)     // Catch:{ 0wR -> 0x2921 }
            r12 = 0
            r1 = 2
            X.3S5 r4 = new X.3S5     // Catch:{ 0wR -> 0x2921 }
            r4.<init>(r12, r1)     // Catch:{ 0wR -> 0x2921 }
            if (r47 == 0) goto L_0x24de
            r9 = r83
            boolean r9 = r14.A0P(r9)     // Catch:{ 0wR -> 0x2921 }
            if (r9 == 0) goto L_0x24e6
        L_0x24de:
            X.0xR r9 = r2.A0d     // Catch:{ 0wR -> 0x2921 }
            boolean r9 = r9.A02     // Catch:{ 0wR -> 0x2921 }
            r53 = 1
            if (r9 == 0) goto L_0x24e8
        L_0x24e6:
            r53 = 0
        L_0x24e8:
            if (r13 != 0) goto L_0x24ee
            r54 = 0
            if (r19 == 0) goto L_0x24f0
        L_0x24ee:
            r54 = 1
        L_0x24f0:
            r50 = 0
            r51 = 0
            r52 = 1
            r45 = r14
            r46 = r2
            r47 = r4
            r48 = r12
            r49 = r36
            X.C20350xQ.A00(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)     // Catch:{ 0wR -> 0x2921 }
            X.171 r4 = r2.A0D     // Catch:{ 0wR -> 0x2921 }
            r4.A0d(r6)     // Catch:{ 0wR -> 0x2921 }
            if (r16 == 0) goto L_0x26b2
            boolean r4 = X.C20350xQ.A0L(r2, r6, r0)     // Catch:{ 0wR -> 0x2921 }
            if (r4 == 0) goto L_0x2527
            X.1Oo r4 = r2.A0c     // Catch:{ 0wR -> 0x2921 }
            X.19x r9 = r2.A0x     // Catch:{ 0wR -> 0x2921 }
            r49 = 99
            r45 = r9
            r46 = r12
            r47 = r6
            r50 = r25
            X.8nz r9 = r45.A04(r46, r47, r48, r49, r50)     // Catch:{ 0wR -> 0x2921 }
            X.0xM r4 = r4.A01     // Catch:{ 0wR -> 0x2921 }
            r4.A0h(r9)     // Catch:{ 0wR -> 0x2921 }
        L_0x2527:
            r53 = 1
            if (r0 == 0) goto L_0x2561
            java.lang.String r1 = "default_sub_group_admin_add"
            r0 = r42
            boolean r0 = r1.equals(r0)     // Catch:{ 0wR -> 0x2921 }
            if (r0 != 0) goto L_0x2605
            java.lang.String r1 = "invite"
            r0 = r42
            boolean r0 = r1.equals(r0)     // Catch:{ 0wR -> 0x2921 }
            if (r0 != 0) goto L_0x2605
            java.lang.String r1 = "auto_add"
            r0 = r42
            boolean r0 = r1.equals(r0)     // Catch:{ 0wR -> 0x2921 }
            if (r0 != 0) goto L_0x2605
            java.lang.String r1 = "linked_group_join"
            r0 = r42
            boolean r0 = r1.equals(r0)     // Catch:{ 0wR -> 0x2921 }
            if (r0 != 0) goto L_0x2605
            java.lang.String r1 = "invite_auto_add"
            r0 = r42
            boolean r0 = r1.equals(r0)     // Catch:{ 0wR -> 0x2921 }
            if (r0 != 0) goto L_0x2605
            if (r17 == 0) goto L_0x2605
            goto L_0x2627
        L_0x2561:
            int r0 = r36.size()     // Catch:{ 0wR -> 0x2921 }
            if (r0 != r8) goto L_0x25a4
            if (r10 == 0) goto L_0x25a4
            r0 = r38
            if (r0 != r1) goto L_0x25a4
            X.0yC r4 = r2.A0a     // Catch:{ 0wR -> 0x2921 }
            r1 = 3966(0xf7e, float:5.558E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ 0wR -> 0x2921 }
            boolean r0 = X.C20800yB.A01(r0, r4, r1)     // Catch:{ 0wR -> 0x2921 }
            if (r0 == 0) goto L_0x25a4
            r0 = r84
            java.lang.String r11 = r0.A0D(r10)     // Catch:{ 0wR -> 0x2921 }
            X.8nL r4 = new X.8nL     // Catch:{ 0wR -> 0x2921 }
            r0 = r23
            r9 = r43
            r4.<init>((X.C207209uj) r9, (long) r0)     // Catch:{ 0wR -> 0x2921 }
            r4.A1h(r10, r11)     // Catch:{ 0wR -> 0x2921 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r44)     // Catch:{ 0wR -> 0x2921 }
            r0 = r39
            r4.A1i(r6, r1, r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r31
            r4.A0q(r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r39
            r4.A16(r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r42
            r4.A01 = r0     // Catch:{ 0wR -> 0x2921 }
            goto L_0x263f
        L_0x25a4:
            if (r17 == 0) goto L_0x25d6
            X.1EM r1 = r2.A11     // Catch:{ 0wR -> 0x2921 }
            r0 = r38
            boolean r0 = r1.A02(r0)     // Catch:{ 0wR -> 0x2921 }
            if (r0 == 0) goto L_0x25d6
            r0 = r84
            java.lang.String r11 = r0.A0D(r10)     // Catch:{ 0wR -> 0x2921 }
            X.8nZ r4 = new X.8nZ     // Catch:{ 0wR -> 0x2921 }
            r0 = r23
            r9 = r43
            r4.<init>((X.C207209uj) r9, (long) r0)     // Catch:{ 0wR -> 0x2921 }
            r4.A1h(r10, r11)     // Catch:{ 0wR -> 0x2921 }
            r0 = r39
            r4.A1i(r6, r0, r8)     // Catch:{ 0wR -> 0x2921 }
            r0 = r31
            r4.A0q(r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r39
            r4.A16(r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r42
            r4.A0m = r0     // Catch:{ 0wR -> 0x2921 }
            goto L_0x263f
        L_0x25d6:
            r0 = r38
            if (r0 != r8) goto L_0x25db
            goto L_0x260a
        L_0x25db:
            X.0yC r4 = r2.A0a     // Catch:{ 0wR -> 0x2921 }
            r1 = 4579(0x11e3, float:6.417E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ 0wR -> 0x2921 }
            boolean r0 = X.C20800yB.A01(r0, r4, r1)     // Catch:{ 0wR -> 0x2921 }
            if (r0 == 0) goto L_0x2605
            r1 = r31
            r0 = r83
            boolean r0 = r0.A0M(r1)     // Catch:{ 0wR -> 0x2921 }
            if (r0 == 0) goto L_0x2644
            X.19x r0 = r2.A0x     // Catch:{ 0wR -> 0x2921 }
            X.19w r0 = r0.A01     // Catch:{ 0wR -> 0x2921 }
            X.3Qa r9 = r0.A02(r6, r8)     // Catch:{ 0wR -> 0x2921 }
            X.2cQ r4 = new X.2cQ     // Catch:{ 0wR -> 0x2921 }
            r0 = r23
            r4.<init>(r9, r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r43
            r4.A03 = r0     // Catch:{ 0wR -> 0x2921 }
            goto L_0x261c
        L_0x2605:
            X.19x r0 = r2.A0x     // Catch:{ 0wR -> 0x2921 }
            r48 = 11
            goto L_0x260e
        L_0x260a:
            X.19x r0 = r2.A0x     // Catch:{ 0wR -> 0x2921 }
            r48 = 167(0xa7, float:2.34E-43)
        L_0x260e:
            r44 = r0
            r45 = r12
            r46 = r6
            r47 = r43
            r49 = r23
            X.8nz r4 = r44.A04(r45, r46, r47, r48, r49)     // Catch:{ 0wR -> 0x2921 }
        L_0x261c:
            r0 = r39
            r4.A16(r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r31
            r4.A0q(r0)     // Catch:{ 0wR -> 0x2921 }
            goto L_0x263f
        L_0x2627:
            X.8nF r4 = new X.8nF     // Catch:{ 0wR -> 0x2921 }
            r0 = r23
            r9 = r43
            r4.<init>((X.C207209uj) r9, (long) r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r39
            r4.A1h(r10, r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r31
            r4.A0q(r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r39
            r4.A16(r0)     // Catch:{ 0wR -> 0x2921 }
        L_0x263f:
            X.1Oo r0 = r2.A0c     // Catch:{ 0wR -> 0x2921 }
            r0.BJb(r4, r8)     // Catch:{ 0wR -> 0x2921 }
        L_0x2644:
            java.lang.String r1 = "linked_group_join"
            r0 = r42
            boolean r52 = r1.equals(r0)     // Catch:{ 0wR -> 0x2921 }
            if (r10 == 0) goto L_0x2651
            r49 = 0
            goto L_0x2654
        L_0x2651:
            r45 = 0
            goto L_0x265f
        L_0x2654:
            X.3QK r45 = new X.3QK     // Catch:{ 0wR -> 0x2921 }
            r48 = 1
            r46 = r10
            r47 = r34
            r45.<init>(r46, r47, r48, r49)     // Catch:{ 0wR -> 0x2921 }
        L_0x265f:
            int r0 = r36.size()     // Catch:{ 0wR -> 0x2921 }
            if (r0 != r8) goto L_0x266d
            if (r10 == 0) goto L_0x266d
            r1 = 2
            r0 = r38
            if (r0 != r1) goto L_0x266d
            goto L_0x2670
        L_0x266d:
            r53 = 0
            goto L_0x267c
        L_0x2670:
            X.0yC r4 = r2.A0a     // Catch:{ 0wR -> 0x2921 }
            r1 = 3966(0xf7e, float:5.558E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ 0wR -> 0x2921 }
            boolean r0 = X.C20800yB.A01(r0, r4, r1)     // Catch:{ 0wR -> 0x2921 }
            if (r0 == 0) goto L_0x266d
        L_0x267c:
            X.3QK r4 = new X.3QK     // Catch:{ 0wR -> 0x2921 }
            r46 = r4
            r47 = r6
            r48 = r39
            r49 = r38
            r50 = r20
            r46.<init>(r47, r48, r49, r50)     // Catch:{ 0wR -> 0x2921 }
            int r0 = r4.A00     // Catch:{ 0wR -> 0x2921 }
            if (r0 != r8) goto L_0x269c
            com.whatsapp.jid.GroupJid r0 = r4.A02     // Catch:{ 0wR -> 0x2921 }
            X.147 r1 = X.C65533Sl.A03(r0)     // Catch:{ 0wR -> 0x2921 }
            if (r1 == 0) goto L_0x269c
            com.whatsapp.group.GetSubgroupsManager r0 = r2.A0b     // Catch:{ 0wR -> 0x2921 }
            r0.A03(r1)     // Catch:{ 0wR -> 0x2921 }
        L_0x269c:
            r49 = r12
            r44 = r4
            r46 = r2
            r47 = r31
            r48 = r12
            r50 = r23
            X.C20350xQ.A0A(r44, r45, r46, r47, r48, r49, r50, r52, r53)     // Catch:{ 0wR -> 0x2921 }
            if (r52 == 0) goto L_0x2700
            X.1LW r1 = r2.A0P     // Catch:{ 0wR -> 0x2921 }
            r79 = r39
            goto L_0x26f5
        L_0x26b2:
            if (r17 != 0) goto L_0x2700
            r0 = r84
            X.3Qp r0 = r0.A09(r6, r7)     // Catch:{ 0wR -> 0x2921 }
            if (r0 != 0) goto L_0x26be
            r1 = 0
            goto L_0x26c0
        L_0x26be:
            X.3G4 r1 = r0.A0e     // Catch:{ 0wR -> 0x2921 }
        L_0x26c0:
            X.1Nt r4 = r2.A0o     // Catch:{ 0wR -> 0x2921 }
            X.0wo r9 = r2.A0I     // Catch:{ 0wR -> 0x2921 }
            long r48 = X.C19970wo.A00(r9)     // Catch:{ 0wR -> 0x2921 }
            r44 = r4
            r45 = r6
            r46 = r1
            r47 = r78
            X.8nz r9 = r44.A00(r45, r46, r47, r48)     // Catch:{ 0wR -> 0x2921 }
            if (r9 == 0) goto L_0x26dd
            X.1Oo r4 = r2.A0c     // Catch:{ 0wR -> 0x2921 }
            r1 = 8
            r4.BJb(r9, r1)     // Catch:{ 0wR -> 0x2921 }
        L_0x26dd:
            X.1LW r1 = r2.A0P     // Catch:{ 0wR -> 0x2921 }
            r79 = r39
            boolean r4 = android.text.TextUtils.isEmpty(r39)     // Catch:{ 0wR -> 0x2921 }
            if (r4 == 0) goto L_0x26f5
            java.lang.String r4 = r0.A08()     // Catch:{ 0wR -> 0x2921 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ 0wR -> 0x2921 }
            if (r4 != 0) goto L_0x26f5
            java.lang.String r79 = r0.A08()     // Catch:{ 0wR -> 0x2921 }
        L_0x26f5:
            r76 = r1
            r77 = r6
            r80 = r38
            r81 = r23
            r76.A03(r77, r78, r79, r80, r81)     // Catch:{ 0wR -> 0x2921 }
        L_0x2700:
            if (r22 == 0) goto L_0x271e
            X.1Oo r4 = r2.A0c     // Catch:{ 0wR -> 0x2921 }
            X.19x r0 = r2.A0x     // Catch:{ 0wR -> 0x2921 }
            r48 = 150(0x96, float:2.1E-43)
            r47 = r12
            r44 = r0
            r45 = r12
            r46 = r6
            r49 = r23
            X.8nz r1 = r44.A04(r45, r46, r47, r48, r49)     // Catch:{ 0wR -> 0x2921 }
            r1.A0q(r12)     // Catch:{ 0wR -> 0x2921 }
            r0 = 3019(0xbcb, float:4.23E-42)
            r4.BJb(r1, r0)     // Catch:{ 0wR -> 0x2921 }
        L_0x271e:
            if (r17 == 0) goto L_0x2780
            boolean r0 = r33.isEmpty()     // Catch:{ 0wR -> 0x2921 }
            if (r0 != 0) goto L_0x2780
            java.util.Set r0 = r33.entrySet()     // Catch:{ 0wR -> 0x2921 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ 0wR -> 0x2921 }
        L_0x272e:
            boolean r0 = r11.hasNext()     // Catch:{ 0wR -> 0x2921 }
            if (r0 == 0) goto L_0x275d
            java.lang.Object r9 = r11.next()     // Catch:{ 0wR -> 0x2921 }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ 0wR -> 0x2921 }
            java.lang.Object r4 = r9.getKey()     // Catch:{ 0wR -> 0x2921 }
            X.3ER r1 = new X.3ER     // Catch:{ 0wR -> 0x2921 }
            r1.<init>()     // Catch:{ 0wR -> 0x2921 }
            java.lang.Object r0 = r9.getKey()     // Catch:{ 0wR -> 0x2921 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ 0wR -> 0x2921 }
            r1.A00 = r0     // Catch:{ 0wR -> 0x2921 }
            java.lang.Object r0 = r9.getValue()     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ 0wR -> 0x2921 }
            r1.A04 = r0     // Catch:{ 0wR -> 0x2921 }
            X.3Kj r1 = r1.A00()     // Catch:{ 0wR -> 0x2921 }
            r0 = r36
            r0.put(r4, r1)     // Catch:{ 0wR -> 0x2921 }
            goto L_0x272e
        L_0x275d:
            r1 = 2
            X.3S5 r0 = new X.3S5     // Catch:{ 0wR -> 0x2921 }
            r0.<init>(r12, r1)     // Catch:{ 0wR -> 0x2921 }
            if (r13 != 0) goto L_0x2769
            r53 = 0
            if (r19 == 0) goto L_0x276b
        L_0x2769:
            r53 = 1
        L_0x276b:
            r49 = 1
            r50 = 0
            r51 = 0
            r52 = 0
            r44 = r14
            r45 = r2
            r46 = r0
            r47 = r12
            r48 = r36
            X.C20350xQ.A00(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)     // Catch:{ 0wR -> 0x2921 }
        L_0x2780:
            r83.A0G()     // Catch:{ 0wR -> 0x2921 }
            r0 = r83
            com.whatsapp.jid.PhoneUserJid r1 = r0.A03     // Catch:{ 0wR -> 0x2921 }
            X.C18740tg.A06(r1)     // Catch:{ 0wR -> 0x2921 }
            r0 = r36
            boolean r0 = r0.containsKey(r1)     // Catch:{ 0wR -> 0x2921 }
            if (r0 != 0) goto L_0x279e
            X.13w r1 = r83.A08()     // Catch:{ 0wR -> 0x2921 }
            r0 = r36
            boolean r0 = r0.containsKey(r1)     // Catch:{ 0wR -> 0x2921 }
            if (r0 == 0) goto L_0x287e
        L_0x279e:
            if (r17 != 0) goto L_0x287e
            if (r15 != 0) goto L_0x287e
            if (r18 != 0) goto L_0x287e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 0wR -> 0x2921 }
            r1.<init>()     // Catch:{ 0wR -> 0x2921 }
            r0 = r35
            r1.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r83.A0G()     // Catch:{ 0wR -> 0x2921 }
            r0 = r83
            com.whatsapp.jid.PhoneUserJid r0 = r0.A03     // Catch:{ 0wR -> 0x2921 }
            r1.append(r0)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = r1.toString()     // Catch:{ 0wR -> 0x2921 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0wR -> 0x2921 }
            if (r16 != 0) goto L_0x2838
            X.0yC r4 = r2.A0a     // Catch:{ 0wR -> 0x2921 }
            r1 = 2367(0x93f, float:3.317E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ 0wR -> 0x2921 }
            boolean r0 = X.C20800yB.A01(r0, r4, r1)     // Catch:{ 0wR -> 0x2921 }
            if (r0 == 0) goto L_0x284f
            r1 = 2
            r0 = r38
            if (r0 == r1) goto L_0x27d5
            r1 = 6
            if (r0 != r1) goto L_0x284f
        L_0x27d5:
            if (r10 == 0) goto L_0x284f
            r0 = r84
            java.lang.String r13 = r0.A0D(r10)     // Catch:{ 0wR -> 0x2921 }
            int r4 = r2.A0O(r6)     // Catch:{ 0wR -> 0x2921 }
            if (r4 == r8) goto L_0x280c
            r0 = 4
            if (r4 == r0) goto L_0x27e7
            goto L_0x283b
        L_0x27e7:
            X.19x r4 = r2.A0x     // Catch:{ 0wR -> 0x2921 }
            X.19w r0 = r4.A01     // Catch:{ 0wR -> 0x2921 }
            X.3Qa r11 = r0.A02(r6, r8)     // Catch:{ 0wR -> 0x2921 }
            X.8nm r9 = new X.8nm     // Catch:{ 0wR -> 0x2921 }
            r0 = r25
            r9.<init>(r11, r0)     // Catch:{ 0wR -> 0x2921 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ 0wR -> 0x2921 }
            r1.<init>()     // Catch:{ 0wR -> 0x2921 }
            X.9Wj r0 = new X.9Wj     // Catch:{ 0wR -> 0x2921 }
            r0.<init>(r10, r12, r8, r7)     // Catch:{ 0wR -> 0x2921 }
            r1.add(r0)     // Catch:{ 0wR -> 0x2921 }
            r9.A1f(r1)     // Catch:{ 0wR -> 0x2921 }
            r0 = r31
            X.C238019x.A01(r0, r9, r4, r8)     // Catch:{ 0wR -> 0x2921 }
            goto L_0x2830
        L_0x280c:
            X.19x r11 = r2.A0x     // Catch:{ 0wR -> 0x2921 }
            X.19w r0 = r11.A01     // Catch:{ 0wR -> 0x2921 }
            X.3Qa r4 = r0.A02(r6, r8)     // Catch:{ 0wR -> 0x2921 }
            X.8no r9 = new X.8no     // Catch:{ 0wR -> 0x2921 }
            r0 = r25
            r9.<init>(r4, r0)     // Catch:{ 0wR -> 0x2921 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ 0wR -> 0x2921 }
            r1.<init>()     // Catch:{ 0wR -> 0x2921 }
            X.9Wj r0 = new X.9Wj     // Catch:{ 0wR -> 0x2921 }
            r0.<init>(r10, r13, r8, r7)     // Catch:{ 0wR -> 0x2921 }
            r1.add(r0)     // Catch:{ 0wR -> 0x2921 }
            r9.A1f(r1)     // Catch:{ 0wR -> 0x2921 }
            r0 = r31
            X.C238019x.A01(r0, r9, r11, r8)     // Catch:{ 0wR -> 0x2921 }
        L_0x2830:
            X.1Oo r1 = r2.A0c     // Catch:{ 0wR -> 0x2921 }
            r0 = 3013(0xbc5, float:4.222E-42)
            r1.BJb(r9, r0)     // Catch:{ 0wR -> 0x2921 }
            goto L_0x284f
        L_0x2838:
            r43 = r12
            goto L_0x284f
        L_0x283b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 0wR -> 0x2921 }
            r1.<init>()     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = "GroupChatManager/displaySubGroupLinkedWithJoinModeDisclaimer Unhandled groupJoinMode "
            r1.append(r0)     // Catch:{ 0wR -> 0x2921 }
            r1.append(r4)     // Catch:{ 0wR -> 0x2921 }
            java.lang.String r0 = r1.toString()     // Catch:{ 0wR -> 0x2921 }
            X.C18740tg.A0D(r7, r0)     // Catch:{ 0wR -> 0x2921 }
        L_0x284f:
            r83.A0G()     // Catch:{ 0wR -> 0x2921 }
            r0 = r83
            com.whatsapp.jid.PhoneUserJid r0 = r0.A03     // Catch:{ 0wR -> 0x2921 }
            java.util.List r55 = java.util.Collections.singletonList(r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r84
            java.lang.String r53 = r0.A0D(r10)     // Catch:{ 0wR -> 0x2921 }
            r44 = r2
            r45 = r12
            r46 = r29
            r47 = r10
            r48 = r6
            r49 = r28
            r50 = r31
            r51 = r43
            r52 = r42
            r54 = r39
            r56 = r38
            r57 = r25
            r59 = r16
            r44.A0V(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r59)     // Catch:{ 0wR -> 0x2921 }
            goto L_0x2887
        L_0x287e:
            if (r16 != 0) goto L_0x2887
            X.1C4 r1 = r2.A0s     // Catch:{ 0wR -> 0x2921 }
            r0 = r43
            r1.A01(r0)     // Catch:{ 0wR -> 0x2921 }
        L_0x2887:
            r0 = 3017(0xbc9, float:4.228E-42)
            if (r27 <= 0) goto L_0x28b0
            if (r32 == 0) goto L_0x28b0
            if (r17 == 0) goto L_0x28cb
            if (r18 != 0) goto L_0x28e5
            r1 = r27
            r5.A0b(r6, r1)     // Catch:{ 0wR -> 0x2921 }
            X.19x r4 = r2.A0x     // Catch:{ 0wR -> 0x2921 }
            r83.A0G()     // Catch:{ 0wR -> 0x2921 }
            r1 = r83
            com.whatsapp.jid.PhoneUserJid r1 = r1.A03     // Catch:{ 0wR -> 0x2921 }
            r31 = r4
            r32 = r6
            r33 = r1
            r34 = r12
            r35 = r27
            r36 = r25
            X.8nV r1 = r31.A09(r32, r33, r34, r35, r36)     // Catch:{ 0wR -> 0x2921 }
            goto L_0x28e2
        L_0x28b0:
            if (r17 != 0) goto L_0x28e5
            if (r27 <= 0) goto L_0x28e5
            if (r15 != 0) goto L_0x28e5
            if (r18 != 0) goto L_0x28e5
            X.19x r1 = r2.A0x     // Catch:{ 0wR -> 0x2921 }
            r34 = r12
            r31 = r1
            r32 = r6
            r33 = r12
            r35 = r27
            r36 = r25
            X.8nV r1 = r31.A09(r32, r33, r34, r35, r36)     // Catch:{ 0wR -> 0x2921 }
            goto L_0x28e2
        L_0x28cb:
            r1 = r27
            r5.A0b(r6, r1)     // Catch:{ 0wR -> 0x2921 }
            X.19x r1 = r2.A0x     // Catch:{ 0wR -> 0x2921 }
            r32 = r1
            r33 = r6
            r34 = r31
            r35 = r12
            r36 = r27
            r37 = r25
            X.8nV r1 = r32.A09(r33, r34, r35, r36, r37)     // Catch:{ 0wR -> 0x2921 }
        L_0x28e2:
            r2.A0T(r0, r1)     // Catch:{ 0wR -> 0x2921 }
        L_0x28e5:
            X.1Oq r0 = r2.A0X     // Catch:{ 0wR -> 0x2921 }
            r0.A00(r6)     // Catch:{ 0wR -> 0x2921 }
            X.1C6 r1 = r2.A0z     // Catch:{ 0wR -> 0x2921 }
            r4 = r30
            r0 = r28
            r1.A05(r6, r0, r4)     // Catch:{ 0wR -> 0x2921 }
            if (r16 != 0) goto L_0x28f8
            r5.A0Z(r6, r7)     // Catch:{ 0wR -> 0x2921 }
        L_0x28f8:
            X.1Np r0 = r2.A0f     // Catch:{ 0wR -> 0x2921 }
            java.lang.Iterable r0 = r0.getObservers()     // Catch:{ 0wR -> 0x2921 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ 0wR -> 0x2921 }
        L_0x2902:
            boolean r0 = r1.hasNext()     // Catch:{ 0wR -> 0x2921 }
            if (r0 == 0) goto L_0x2912
            java.lang.Object r0 = r1.next()     // Catch:{ 0wR -> 0x2921 }
            X.1hW r0 = (X.C34711hW) r0     // Catch:{ 0wR -> 0x2921 }
            r0.A00(r14, r6)     // Catch:{ 0wR -> 0x2921 }
            goto L_0x2902
        L_0x2912:
            X.182 r2 = r3.A0A     // Catch:{ 0wR -> 0x2921 }
            long r20 = r20 / r74
            r0 = r20
            r2.A01(r6, r0)     // Catch:{ 0wR -> 0x2921 }
            r0 = r40
            r2.A00(r6, r0)     // Catch:{ 0wR -> 0x2921 }
            return r8
        L_0x2921:
            r1 = move-exception
            java.lang.String r0 = "GroupNotificationHandler/handleCreate/invalid-jid"
            com.whatsapp.util.Log.w(r0, r1)
            X.0wN r2 = r3.A00
            java.lang.String r1 = "GroupNotificationHandler/handleCreate"
            java.lang.String r0 = "invalid-jid-received"
            r2.A0E(r1, r0, r8)
            return r8
        L_0x2931:
            if (r18 == 0) goto L_0x296c
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            if (r15 == 0) goto L_0x2970
            X.0y7 r0 = r13.A07()
            X.14x r5 = r0.iterator()
        L_0x2942:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x2981
            java.lang.Object r4 = r5.next()
            X.6PM r4 = (X.AnonymousClass6PM) r4
            int r0 = r4.A01
            if (r0 != 0) goto L_0x2942
            if (r17 != 0) goto L_0x295e
            X.0wQ r3 = r1.A05
            com.whatsapp.jid.UserJid r0 = r4.A03
            boolean r0 = r3.A0M(r0)
            if (r0 != 0) goto L_0x2942
        L_0x295e:
            com.whatsapp.jid.UserJid r0 = r4.A03
            r2.add(r0)
            goto L_0x2942
        L_0x2964:
            X.0wQ r0 = r1.A05
            boolean r0 = r13.A0P(r0)
            if (r0 == 0) goto L_0x298c
        L_0x296c:
            r1.A0b(r11, r12)
            goto L_0x298c
        L_0x2970:
            X.0wQ r0 = r1.A05
            boolean r0 = r13.A0P(r0)
            if (r0 != 0) goto L_0x2981
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x2981
            r2.addAll(r9)
        L_0x2981:
            r13.A0L(r2)
            r14.A08(r11, r2)
            if (r17 == 0) goto L_0x2964
            r1.A0b(r11, r10)
        L_0x298c:
            if (r15 == 0) goto L_0x29cb
            X.17Y r3 = r1.A04
            r2 = 22
            X.1j9 r0 = new X.1j9
            r0.<init>(r1, r11, r2)
            r3.A0H(r0)
            X.0wU r3 = r1.A12
            r2 = 23
            X.1j9 r0 = new X.1j9
            r0.<init>(r1, r11, r2)
            r3.Boy(r0)
            if (r19 == 0) goto L_0x29cb
            X.1Oo r3 = r1.A0c
            X.19x r2 = r1.A0x
            r15 = 16
            com.whatsapp.jid.UserJid r12 = r43.A00()
            X.0wQ r0 = r1.A05
            r0.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r0.A03
            java.util.List r14 = java.util.Collections.singletonList(r0)
            r10 = 0
            r9 = r2
            r13 = r43
            r16 = r25
            X.8nz r0 = r9.A03(r10, r11, r12, r13, r14, r15, r16)
            r3.BJb(r0, r6)
            return r8
        L_0x29cb:
            X.1C4 r2 = r1.A0s
            r0 = r43
            r2.A01(r0)
            r0 = 5
            r1.A0T(r0, r11)
            return r8
        L_0x29d7:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x29dc }
            goto L_0x29e0
        L_0x29dc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x29e1 }
        L_0x29e0:
            throw r1     // Catch:{ all -> 0x29e1 }
        L_0x29e1:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x29e6 }
            throw r1
        L_0x29e6:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x29eb:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x29eb }
            throw r0
        L_0x29ee:
            java.lang.String r0 = "GroupChatManager/onGroupNewInviteCode received invite code for non-permanent group jid"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r8
        L_0x29f4:
            X.1Oo r3 = r6.A0c
            X.19x r2 = r6.A0x
            r0 = r43
            X.8nz r1 = r2.A08(r9, r5, r0, r8)
            r0 = 3015(0xbc7, float:4.225E-42)
            r3.BJb(r1, r0)
            r0 = 0
            X.8nz r1 = r2.A08(r12, r5, r0, r8)
            r0 = 3006(0xbbe, float:4.212E-42)
            r6.A0T(r0, r1)
            return r8
        L_0x2a0e:
            X.19x r1 = r6.A0x
            r0 = r43
            X.8nz r0 = r1.A08(r9, r5, r0, r7)
            r6.A0T(r12, r0)
            return r8
        L_0x2a1a:
            java.lang.String r0 = "groupmgr/onGroupNewDescription/new group"
            goto L_0x2b93
        L_0x2a1e:
            X.11F r2 = X.AnonymousClass143.A00(r27)     // Catch:{ all -> 0x2c8f }
            X.147 r7 = X.C65533Sl.A03(r2)     // Catch:{ all -> 0x2c8f }
            X.C18740tg.A06(r7)     // Catch:{ all -> 0x2c8f }
            java.lang.String r2 = "v_id"
            long r1 = r1.A0V(r2, r4)     // Catch:{ all -> 0x2c8f }
            X.182 r10 = r3.A0A     // Catch:{ all -> 0x2c8f }
            X.181 r5 = r10.A00     // Catch:{ all -> 0x2c8f }
            java.util.Map r11 = r5.A02     // Catch:{ all -> 0x2c8f }
            monitor-enter(r11)     // Catch:{ all -> 0x2c8f }
            java.lang.Object r4 = r11.get(r7)     // Catch:{ all -> 0x2b30 }
            X.9K6 r4 = (X.AnonymousClass9K6) r4     // Catch:{ all -> 0x2b30 }
            if (r4 != 0) goto L_0x2a42
            X.9K6 r4 = X.AnonymousClass181.A00(r5, r7)     // Catch:{ all -> 0x2b30 }
        L_0x2a42:
            long r4 = r4.A00     // Catch:{ all -> 0x2b30 }
            monitor-exit(r11)     // Catch:{ all -> 0x2b30 }
            int r11 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x2b0b
            X.0xQ r11 = r3.A0C     // Catch:{ all -> 0x2c8f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x2c8f }
            r5.<init>()     // Catch:{ all -> 0x2c8f }
            java.lang.String r4 = "groupmgr/onGroupAnnouncementsToggled/"
            r5.append(r4)     // Catch:{ all -> 0x2c8f }
            r4 = r43
            r5.append(r4)     // Catch:{ all -> 0x2c8f }
            java.lang.String r4 = "/"
            r5.append(r4)     // Catch:{ all -> 0x2c8f }
            r5.append(r9)     // Catch:{ all -> 0x2c8f }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x2c8f }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x2c8f }
            X.11F r4 = X.AnonymousClass143.A00(r27)     // Catch:{ all -> 0x2c8f }
            X.147 r12 = X.C65533Sl.A03(r4)     // Catch:{ all -> 0x2c8f }
            X.C18740tg.A06(r12)     // Catch:{ all -> 0x2c8f }
            X.16D r13 = r11.A0C     // Catch:{ all -> 0x2c8f }
            X.141 r4 = r13.A0A(r12)     // Catch:{ all -> 0x2c8f }
            if (r4 == 0) goto L_0x2aea
            boolean r4 = r4.A0d     // Catch:{ all -> 0x2c8f }
            if (r4 == r9) goto L_0x2add
            java.lang.String r4 = "groupmgr/onGroupAnnouncementsToggled/changed"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x2c8f }
            X.141 r5 = r13.A0D(r12)     // Catch:{ all -> 0x2c8f }
            boolean r4 = r5.A0d     // Catch:{ all -> 0x2c8f }
            if (r4 == r9) goto L_0x2a99
            r5.A0d = r9     // Catch:{ all -> 0x2c8f }
            X.16p r4 = r13.A05     // Catch:{ all -> 0x2c8f }
            r4.A0U(r5)     // Catch:{ all -> 0x2c8f }
            X.16z r4 = r13.A04     // Catch:{ all -> 0x2c8f }
            r4.A0A(r5)     // Catch:{ all -> 0x2c8f }
        L_0x2a99:
            X.1Oo r5 = r11.A0c     // Catch:{ all -> 0x2c8f }
            X.19x r4 = r11.A0x     // Catch:{ all -> 0x2c8f }
            r17 = 32
            if (r9 == 0) goto L_0x2aa3
            r17 = 31
        L_0x2aa3:
            r13 = r4
            r14 = r0
            r15 = r12
            r16 = r43
            r18 = r25
            X.8nz r4 = r13.A04(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x2c8f }
            r4.A0q(r6)     // Catch:{ all -> 0x2c8f }
            r0 = 3009(0xbc1, float:4.217E-42)
            r5.BJb(r4, r0)     // Catch:{ all -> 0x2c8f }
            if (r9 != 0) goto L_0x2b06
            X.17X r0 = r11.A0U     // Catch:{ all -> 0x2c8f }
            X.17r r0 = r0.A07     // Catch:{ all -> 0x2c8f }
            int r9 = r0.A0A(r12)     // Catch:{ all -> 0x2c8f }
            X.12q r0 = r11.A0M     // Catch:{ all -> 0x2c8f }
            int r6 = r0.A05(r12)     // Catch:{ all -> 0x2c8f }
            X.0yC r5 = r11.A0a     // Catch:{ all -> 0x2c8f }
            r0 = 934(0x3a6, float:1.309E-42)
            X.0yV r4 = X.C21000yV.A02     // Catch:{ all -> 0x2c8f }
            int r0 = X.C20800yB.A00(r4, r5, r0)     // Catch:{ all -> 0x2c8f }
            if (r9 < r0) goto L_0x2b06
            r0 = 1946(0x79a, float:2.727E-42)
            int r0 = X.C20800yB.A00(r4, r5, r0)     // Catch:{ all -> 0x2c8f }
            if (r9 > r0) goto L_0x2b06
            if (r6 == r8) goto L_0x2b06
            goto L_0x2af0
        L_0x2add:
            java.lang.String r0 = "groupmgr/onGroupAnnouncementsToggled/did not change"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x2c8f }
            X.1C4 r4 = r11.A0s     // Catch:{ all -> 0x2c8f }
            r0 = r43
            r4.A01(r0)     // Catch:{ all -> 0x2c8f }
            goto L_0x2b06
        L_0x2aea:
            java.lang.String r0 = "groupmgr/onGroupAnnouncementsToggled/new group"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x2c8f }
            goto L_0x2b06
        L_0x2af0:
            X.19w r0 = r11.A0w     // Catch:{ all -> 0x2c8f }
            X.3Qa r9 = r0.A02(r12, r8)     // Catch:{ all -> 0x2c8f }
            X.0wo r0 = r11.A0I     // Catch:{ all -> 0x2c8f }
            long r4 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x2c8f }
            X.5J0 r6 = new X.5J0     // Catch:{ all -> 0x2c8f }
            r6.<init>(r9, r4)     // Catch:{ all -> 0x2c8f }
            X.0xM r0 = r11.A0O     // Catch:{ all -> 0x2c8f }
            r0.A0h(r6)     // Catch:{ all -> 0x2c8f }
        L_0x2b06:
            r10.A00(r7, r1)     // Catch:{ all -> 0x2c8f }
            goto L_0x2c8d
        L_0x2b0b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x2c8f }
            r4.<init>()     // Catch:{ all -> 0x2c8f }
            java.lang.String r0 = "GroupNotificationHandler/handleAnnouncement/old version, gjid="
            r4.append(r0)     // Catch:{ all -> 0x2c8f }
            r4.append(r7)     // Catch:{ all -> 0x2c8f }
            java.lang.String r0 = "; version="
            r4.append(r0)     // Catch:{ all -> 0x2c8f }
            r4.append(r1)     // Catch:{ all -> 0x2c8f }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x2c8f }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x2c8f }
            X.1C4 r1 = r3.A0E     // Catch:{ all -> 0x2c8f }
            r0 = r43
            r1.A01(r0)     // Catch:{ all -> 0x2c8f }
            goto L_0x2c8d
        L_0x2b30:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x2b30 }
            throw r0     // Catch:{ all -> 0x2c8f }
        L_0x2b33:
            java.lang.String r0 = "groupmgr/onGroupNoFrequentlyForwardedToggled/new group"
            goto L_0x2b93
        L_0x2b36:
            X.1Oo r3 = r1.A0c
            X.1LV r0 = r1.A08
            X.147 r4 = r0.A02(r10)
            X.19x r0 = r1.A0x
            X.19w r0 = r0.A01
            X.3Qa r9 = r0.A02(r10, r8)
            if (r11 == 0) goto L_0x2b6c
            X.8ni r5 = new X.8ni
            r0 = r25
            r5.<init>(r9, r0)
        L_0x2b4f:
            r0 = r43
            r5.A03 = r0
            r5.A0q(r6)
            if (r4 == 0) goto L_0x2b63
            java.util.List r6 = r5.A00
            r1 = 0
            X.9Wj r0 = new X.9Wj
            r0.<init>(r4, r1, r8, r7)
            r6.add(r0)
        L_0x2b63:
            r5.A1h(r2)
            r0 = 3011(0xbc3, float:4.22E-42)
            r3.BJb(r5, r0)
            return r8
        L_0x2b6c:
            X.8nj r5 = new X.8nj
            r0 = r25
            r5.<init>(r9, r0)
            goto L_0x2b4f
        L_0x2b74:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GroupNotificationHandler/handleGroupMembershipApprovalModeChange/incorrect group_join.state="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x2b8b:
            java.lang.String r0 = "groupmgr/onGroupMemberAddModeToggled/did not change"
            goto L_0x2b93
        L_0x2b8e:
            java.lang.String r0 = "groupmgr/onGroupMemberAddModeToggled/new group"
            goto L_0x2b93
        L_0x2b91:
            java.lang.String r0 = "groupmgr/onParentGroupNewDescription/new community"
        L_0x2b93:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r8
        L_0x2b97:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GroupNotificationHandler/handleCreatedGroupMembershipApprovalRequests/incorrect membership_approval_request.requestMethod="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x2bae:
            X.0xQ r2 = r3.A0C     // Catch:{ all -> 0x2c8f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x2c8f }
            r1.<init>()     // Catch:{ all -> 0x2c8f }
            java.lang.String r0 = "groupmgr/onAllowNonAdminSubGroupCreation/"
            r1.append(r0)     // Catch:{ all -> 0x2c8f }
            r0 = r43
            r1.append(r0)     // Catch:{ all -> 0x2c8f }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x2c8f }
            r1.append(r4)     // Catch:{ all -> 0x2c8f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x2c8f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x2c8f }
            X.11F r0 = X.AnonymousClass143.A00(r27)     // Catch:{ all -> 0x2c8f }
            X.147 r11 = X.C65533Sl.A03(r0)     // Catch:{ all -> 0x2c8f }
            if (r11 != 0) goto L_0x2be6
            java.lang.String r0 = "groupmgr/onAllowNonAdminSubGroupCreation/parent not group"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x2c8f }
        L_0x2bdd:
            X.1C4 r1 = r3.A0E     // Catch:{ all -> 0x2c8f }
            r0 = r43
            r1.A01(r0)     // Catch:{ all -> 0x2c8f }
            goto L_0x2c8d
        L_0x2be6:
            X.0wU r1 = r2.A12     // Catch:{ all -> 0x2c8f }
            X.3vd r0 = new X.3vd     // Catch:{ all -> 0x2c8f }
            r9 = r0
            r10 = r2
            r12 = r6
            r13 = r25
            r15 = r4
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x2c8f }
            r1.Boy(r0)     // Catch:{ all -> 0x2c8f }
            goto L_0x2bdd
        L_0x2bf7:
            X.0xQ r5 = r3.A0C     // Catch:{ all -> 0x2c8f }
            X.0yC r4 = r5.A0a     // Catch:{ all -> 0x2c8f }
            r2 = 5046(0x13b6, float:7.071E-42)
            X.0yV r1 = X.C21000yV.A02     // Catch:{ all -> 0x2c8f }
            boolean r1 = X.C20800yB.A01(r1, r4, r2)     // Catch:{ all -> 0x2c8f }
            if (r1 == 0) goto L_0x2c32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x2c8f }
            r2.<init>()     // Catch:{ all -> 0x2c8f }
            java.lang.String r1 = "groupmgr/onGroupHistory/"
            r2.append(r1)     // Catch:{ all -> 0x2c8f }
            r1 = r43
            r2.append(r1)     // Catch:{ all -> 0x2c8f }
            java.lang.String r1 = "/"
            r2.append(r1)     // Catch:{ all -> 0x2c8f }
            r2.append(r7)     // Catch:{ all -> 0x2c8f }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x2c8f }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x2c8f }
            X.11F r1 = X.AnonymousClass143.A00(r27)     // Catch:{ all -> 0x2c8f }
            X.147 r4 = X.C65533Sl.A03(r1)     // Catch:{ all -> 0x2c8f }
            if (r4 != 0) goto L_0x2c3a
            java.lang.String r0 = "groupmgr/onGroupHistory/not group"
        L_0x2c2f:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x2c8f }
        L_0x2c32:
            X.1C4 r1 = r3.A0E     // Catch:{ all -> 0x2c8f }
            r0 = r43
            r1.A01(r0)     // Catch:{ all -> 0x2c8f }
            goto L_0x2c8d
        L_0x2c3a:
            X.16D r9 = r5.A0C     // Catch:{ all -> 0x2c8f }
            X.141 r1 = r9.A0A(r4)     // Catch:{ all -> 0x2c8f }
            if (r1 != 0) goto L_0x2c45
            java.lang.String r0 = "groupmgr/onGroupHistory/new group"
            goto L_0x2c2f
        L_0x2c45:
            boolean r1 = r1.A0h     // Catch:{ all -> 0x2c8f }
            if (r1 != r7) goto L_0x2c4c
            java.lang.String r0 = "groupmgr/onGroupHistory/did not change"
            goto L_0x2c2f
        L_0x2c4c:
            java.lang.String r1 = "groupmgr/onGroupHistory/changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x2c8f }
            X.17X r1 = r5.A0U     // Catch:{ all -> 0x2c8f }
            boolean r1 = r1.A0C(r4)     // Catch:{ all -> 0x2c8f }
            if (r1 != 0) goto L_0x2c5c
            java.lang.String r0 = "groupmgr/onGroupHistory/not participant"
            goto L_0x2c2f
        L_0x2c5c:
            X.141 r2 = r9.A0D(r4)     // Catch:{ all -> 0x2c8f }
            boolean r1 = r2.A0h     // Catch:{ all -> 0x2c8f }
            if (r1 == r7) goto L_0x2c70
            r2.A0h = r7     // Catch:{ all -> 0x2c8f }
            X.16p r1 = r9.A05     // Catch:{ all -> 0x2c8f }
            r1.A0U(r2)     // Catch:{ all -> 0x2c8f }
            X.16z r1 = r9.A04     // Catch:{ all -> 0x2c8f }
            r1.A0A(r2)     // Catch:{ all -> 0x2c8f }
        L_0x2c70:
            X.1Oo r2 = r5.A0c     // Catch:{ all -> 0x2c8f }
            X.19x r1 = r5.A0x     // Catch:{ all -> 0x2c8f }
            r13 = 151(0x97, float:2.12E-43)
            if (r7 == 0) goto L_0x2c7a
            r13 = 150(0x96, float:2.1E-43)
        L_0x2c7a:
            r12 = r0
            r9 = r1
            r10 = r0
            r11 = r4
            r14 = r25
            X.8nz r1 = r9.A04(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x2c8f }
            r1.A0q(r6)     // Catch:{ all -> 0x2c8f }
            r0 = 3019(0xbcb, float:4.23E-42)
            r2.BJb(r1, r0)     // Catch:{ all -> 0x2c8f }
            goto L_0x2c32
        L_0x2c8d:
            monitor-exit(r3)
            return r8
        L_0x2c8f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31671cC.BJl(android.os.Message, int):boolean");
    }
}
