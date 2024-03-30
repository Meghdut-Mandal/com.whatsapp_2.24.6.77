package X;

import android.os.Handler;
import android.os.Looper;

@Deprecated
/* renamed from: X.1PU  reason: invalid class name */
public class AnonymousClass1PU extends Handler {
    public final AnonymousClass17Y A00;
    public final C21100yf A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass171 A03;
    public final C19630wG A04;
    public final C18820ts A05;
    public final C20310xM A06;
    public final AnonymousClass17X A07;
    public final C20810yC A08;
    public final C27541Op A09;
    public final AnonymousClass1PT A0A;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x05a9, code lost:
        r2.A00.A0K(r6.toString(), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x05b2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x071d, code lost:
        r0 = r3.getString(r2, new java.lang.Object[]{r5.obj});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0727, code lost:
        r6.A0K(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x072a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x072b, code lost:
        r3 = r2.A04.A00;
        r2 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x074d, code lost:
        r3 = r2.A00;
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x07b2, code lost:
        r3.A04(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x07b5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x080f, code lost:
        r3.A06(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0812, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0829, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x082c, code lost:
        r3 = (X.AnonymousClass3T1) r5.obj;
        r2.A06.A0h(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r18) {
        /*
            r17 = this;
            r5 = r18
            int r1 = r5.what
            r0 = 3
            r2 = r17
            if (r1 == r0) goto L_0x081d
            r0 = 5
            if (r1 == r0) goto L_0x0813
            r0 = 6
            if (r1 == r0) goto L_0x05d8
            r7 = 1
            r4 = 0
            switch(r1) {
                case 1001: goto L_0x05b3;
                case 1002: goto L_0x07b6;
                case 1003: goto L_0x07c5;
                case 1004: goto L_0x05b3;
                case 1005: goto L_0x07d4;
                case 1006: goto L_0x07d4;
                case 1007: goto L_0x07e3;
                case 1008: goto L_0x0801;
                default: goto L_0x0014;
            }
        L_0x0014:
            switch(r1) {
                case 2001: goto L_0x067a;
                case 2002: goto L_0x0685;
                case 2003: goto L_0x0690;
                case 2004: goto L_0x06a6;
                case 2005: goto L_0x06b0;
                case 2006: goto L_0x06c6;
                case 2007: goto L_0x06dc;
                case 2008: goto L_0x06f2;
                case 2009: goto L_0x0708;
                case 2010: goto L_0x0733;
                case 2011: goto L_0x0739;
                case 2012: goto L_0x073f;
                case 2013: goto L_0x074d;
                case 2014: goto L_0x0753;
                case 2015: goto L_0x0759;
                case 2016: goto L_0x075f;
                case 2017: goto L_0x0765;
                case 2018: goto L_0x076b;
                case 2019: goto L_0x0771;
                case 2020: goto L_0x0777;
                case 2021: goto L_0x077d;
                case 2022: goto L_0x0783;
                case 2023: goto L_0x0789;
                case 2024: goto L_0x078f;
                case 2025: goto L_0x0795;
                case 2026: goto L_0x079b;
                case 2027: goto L_0x07a1;
                case 2028: goto L_0x07a7;
                default: goto L_0x0017;
            }
        L_0x0017:
            r3 = 403(0x193, float:5.65E-43)
            r12 = 419(0x1a3, float:5.87E-43)
            r11 = 406(0x196, float:5.69E-43)
            r10 = 404(0x194, float:5.66E-43)
            java.lang.String r9 = "/"
            java.lang.String r8 = "\n"
            switch(r1) {
                case 3001: goto L_0x00d1;
                case 3002: goto L_0x043d;
                case 3003: goto L_0x04b1;
                case 3004: goto L_0x052a;
                case 3005: goto L_0x066b;
                case 3006: goto L_0x0672;
                case 3007: goto L_0x0745;
                case 3008: goto L_0x0676;
                default: goto L_0x0026;
            }
        L_0x0026:
            switch(r1) {
                case 3010: goto L_0x0656;
                case 3011: goto L_0x065d;
                case 3012: goto L_0x0664;
                default: goto L_0x0029;
            }
        L_0x0029:
            switch(r1) {
                case 3014: goto L_0x0620;
                case 3015: goto L_0x063e;
                case 3016: goto L_0x064e;
                case 3017: goto L_0x0652;
                default: goto L_0x002c;
            }
        L_0x002c:
            switch(r1) {
                case 3019: goto L_0x0030;
                case 3020: goto L_0x0606;
                case 3021: goto L_0x0611;
                case 3022: goto L_0x0615;
                case 3023: goto L_0x060a;
                case 3024: goto L_0x0619;
                case 3025: goto L_0x07ad;
                case 3026: goto L_0x082c;
                case 3027: goto L_0x0827;
                default: goto L_0x002f;
            }
        L_0x002f:
            return
        L_0x0030:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Object r0 = r5.obj
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r13 = r0.iterator()
        L_0x0041:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x05a9
            java.lang.Object r10 = r13.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r5 = r10.getKey()
            X.11F r5 = (X.AnonymousClass11F) r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/add-cadmins/error/"
            r1.append(r0)
            r1.append(r5)
            r1.append(r9)
            java.lang.Object r0 = r10.getValue()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r10.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.16D r0 = r2.A02
            X.141 r11 = r0.A0D(r5)
            if (r1 == r3) goto L_0x00c5
            if (r1 == r12) goto L_0x00a1
            X.0wG r0 = r2.A04
            android.content.Context r10 = r0.A00
            r5 = 2131889267(0x7f120c73, float:1.9413193E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.171 r0 = r2.A03
            java.lang.String r0 = r0.A0H(r11)
            r1[r4] = r0
            java.lang.String r0 = r10.getString(r5, r1)
        L_0x009a:
            r6.append(r0)
            r6.append(r8)
            goto L_0x0041
        L_0x00a1:
            X.17X r0 = r2.A07
            X.0yC r5 = r0.A0B
            r1 = 1655(0x677, float:2.319E-42)
            X.0yV r0 = X.C21000yV.A02
            int r11 = X.C20800yB.A00(r0, r5, r1)
            X.0wG r0 = r2.A04
            android.content.Context r0 = r0.A00
            android.content.res.Resources r10 = r0.getResources()
            r5 = 2131755121(0x7f100071, float:1.9141112E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1[r4] = r0
            java.lang.String r0 = r10.getQuantityString(r5, r11, r1)
            goto L_0x009a
        L_0x00c5:
            X.0wG r0 = r2.A04
            android.content.Context r1 = r0.A00
            r0 = 2131889269(0x7f120c75, float:1.9413197E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x009a
        L_0x00d1:
            java.lang.Object r0 = r5.obj
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x002f
            int r6 = r0.size()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r15 = r0.iterator()
        L_0x00e8:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x013c
            java.lang.Object r13 = r15.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r5 = r13.getKey()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "groupmgr/add-participant/error/"
            r14.append(r0)
            r14.append(r5)
            r14.append(r9)
            java.lang.Object r0 = r13.getValue()
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r13 = r13.getValue()
            boolean r0 = r1.containsKey(r13)
            if (r0 == 0) goto L_0x0130
            java.lang.Object r0 = r1.get(r13)
            if (r0 == 0) goto L_0x0130
            java.lang.Object r0 = r1.get(r13)
            java.util.List r0 = (java.util.List) r0
            r0.add(r5)
            goto L_0x00e8
        L_0x0130:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r5)
            r1.put(r13, r0)
            goto L_0x00e8
        L_0x013c:
            r0 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.remove(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0168
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0168
            X.17Y r3 = r2.A00
            X.0wG r0 = r2.A04
            android.content.Context r2 = r0.A00
            r0 = 2131890191(0x7f12100f, float:1.9415067E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131890190(0x7f12100e, float:1.9415065E38)
        L_0x0160:
            java.lang.String r0 = r2.getString(r0)
            r3.A0L(r1, r0, r4)
            return
        L_0x0168:
            r0 = 421419(0x66e2b, float:5.90534E-40)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.remove(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x018e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x018e
            X.17Y r3 = r2.A00
            X.0wG r0 = r2.A04
            android.content.Context r2 = r0.A00
            r0 = 2131889289(0x7f120c89, float:1.9413237E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131889288(0x7f120c88, float:1.9413235E38)
            goto L_0x0160
        L_0x018e:
            r0 = 421(0x1a5, float:5.9E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.remove(r0)
            r0 = 409(0x199, float:5.73E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.remove(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.remove(r0)
            r0 = 417(0x1a1, float:5.84E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.remove(r0)
            r0 = 412(0x19c, float:5.77E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.remove(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r1.remove(r0)
            r0 = 451(0x1c3, float:6.32E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.remove(r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r16 = r0.iterator()
        L_0x01d6:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r12 = r16.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r0 = r12.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0398
            r0 = 402(0x192, float:5.63E-43)
            if (r1 == r0) goto L_0x02c5
            if (r1 == r10) goto L_0x0332
            if (r1 == r11) goto L_0x028a
            r0 = 408(0x198, float:5.72E-43)
            if (r1 == r0) goto L_0x03e9
            r0 = 421304(0x66db8, float:5.90373E-40)
            if (r1 == r0) goto L_0x023c
            r9.setLength(r4)
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r14 = r0.iterator()
        L_0x020e:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x03d3
            java.lang.Object r13 = r14.next()
            X.11F r13 = (X.AnonymousClass11F) r13
            X.0wG r0 = r2.A04
            android.content.Context r11 = r0.A00
            r5 = 2131889267(0x7f120c73, float:1.9413193E38)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            X.171 r1 = r2.A03
            X.16D r0 = r2.A02
            X.141 r0 = r0.A0D(r13)
            java.lang.String r0 = r1.A0H(r0)
            r3[r4] = r0
            java.lang.String r0 = r11.getString(r5, r3)
            r9.append(r0)
            r9.append(r8)
            goto L_0x020e
        L_0x023c:
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r0 != r7) goto L_0x025a
            X.17Y r13 = r2.A00
            X.0wG r0 = r2.A04
            android.content.Context r14 = r0.A00
            r0 = 2131889287(0x7f120c87, float:1.9413233E38)
            java.lang.String r11 = r14.getString(r0)
            r5 = 2131889312(0x7f120ca0, float:1.9413284E38)
            goto L_0x034e
        L_0x025a:
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r0 != r6) goto L_0x0278
            X.17Y r3 = r2.A00
            X.0wG r0 = r2.A04
            android.content.Context r5 = r0.A00
            r0 = 2131889287(0x7f120c87, float:1.9413233E38)
            java.lang.String r1 = r5.getString(r0)
            r0 = 2131889272(0x7f120c78, float:1.9413203E38)
            goto L_0x038f
        L_0x0278:
            X.17Y r13 = r2.A00
            X.0wG r0 = r2.A04
            android.content.Context r14 = r0.A00
            r0 = 2131889332(0x7f120cb4, float:1.9413325E38)
            java.lang.String r11 = r14.getString(r0)
            r5 = 2131889331(0x7f120cb3, float:1.9413323E38)
            goto L_0x0321
        L_0x028a:
            r9.setLength(r4)
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r14 = r0.iterator()
        L_0x0297:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x03d3
            java.lang.Object r13 = r14.next()
            X.11F r13 = (X.AnonymousClass11F) r13
            X.0wG r0 = r2.A04
            android.content.Context r11 = r0.A00
            r5 = 2131889270(0x7f120c76, float:1.9413199E38)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            X.171 r1 = r2.A03
            X.16D r0 = r2.A02
            X.141 r0 = r0.A0D(r13)
            java.lang.String r0 = r1.A0H(r0)
            r3[r4] = r0
            java.lang.String r0 = r11.getString(r5, r3)
            r9.append(r0)
            r9.append(r8)
            goto L_0x0297
        L_0x02c5:
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r0 != r7) goto L_0x02e2
            X.17Y r13 = r2.A00
            X.0wG r0 = r2.A04
            android.content.Context r14 = r0.A00
            r0 = 2131890260(0x7f121054, float:1.9415207E38)
            java.lang.String r11 = r14.getString(r0)
            r5 = 2131889313(0x7f120ca1, float:1.9413286E38)
            goto L_0x034e
        L_0x02e2:
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r0 != r6) goto L_0x0300
            X.17Y r3 = r2.A00
            X.0wG r0 = r2.A04
            android.content.Context r5 = r0.A00
            r0 = 2131890260(0x7f121054, float:1.9415207E38)
            java.lang.String r1 = r5.getString(r0)
            r0 = 2131889273(0x7f120c79, float:1.9413205E38)
            goto L_0x038f
        L_0x0300:
            X.17Y r13 = r2.A00
            X.0wG r0 = r2.A04
            android.content.Context r14 = r0.A00
            r0 = 2131890316(0x7f12108c, float:1.941532E38)
            java.lang.String r11 = r14.getString(r0)
            r5 = 2131889333(0x7f120cb5, float:1.9413327E38)
            goto L_0x0321
        L_0x0311:
            X.17Y r13 = r2.A00
            X.0wG r0 = r2.A04
            android.content.Context r14 = r0.A00
            r0 = 2131890316(0x7f12108c, float:1.941532E38)
            java.lang.String r11 = r14.getString(r0)
            r5 = 2131889334(0x7f120cb6, float:1.9413329E38)
        L_0x0321:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0368
        L_0x0332:
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r0 != r7) goto L_0x0373
            X.17Y r13 = r2.A00
            X.0wG r0 = r2.A04
            android.content.Context r14 = r0.A00
            r0 = 2131890260(0x7f121054, float:1.9415207E38)
            java.lang.String r11 = r14.getString(r0)
            r5 = 2131889314(0x7f120ca2, float:1.9413288E38)
        L_0x034e:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            X.171 r1 = r2.A03
            X.16D r15 = r2.A02
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r4)
            X.11F r0 = (X.AnonymousClass11F) r0
            X.141 r0 = r15.A0D(r0)
            java.lang.String r0 = r1.A0H(r0)
        L_0x0368:
            r3[r4] = r0
            java.lang.String r0 = r14.getString(r5, r3)
            r13.A0L(r11, r0, r4)
            goto L_0x0423
        L_0x0373:
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r0 != r6) goto L_0x0311
            X.17Y r3 = r2.A00
            X.0wG r0 = r2.A04
            android.content.Context r5 = r0.A00
            r0 = 2131890260(0x7f121054, float:1.9415207E38)
            java.lang.String r1 = r5.getString(r0)
            r0 = 2131889274(0x7f120c7a, float:1.9413207E38)
        L_0x038f:
            java.lang.String r0 = r5.getString(r0)
            r3.A0L(r1, r0, r4)
            goto L_0x0423
        L_0x0398:
            r9.setLength(r4)
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r14 = r0.iterator()
        L_0x03a5:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x03d3
            java.lang.Object r13 = r14.next()
            X.11F r13 = (X.AnonymousClass11F) r13
            X.0wG r0 = r2.A04
            android.content.Context r11 = r0.A00
            r5 = 2131889268(0x7f120c74, float:1.9413195E38)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            X.171 r1 = r2.A03
            X.16D r0 = r2.A02
            X.141 r0 = r0.A0D(r13)
            java.lang.String r0 = r1.A0H(r0)
            r3[r4] = r0
            java.lang.String r0 = r11.getString(r5, r3)
            r9.append(r0)
            r9.append(r8)
            goto L_0x03a5
        L_0x03d3:
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0423
            X.17Y r1 = r2.A00
            java.lang.String r0 = r9.toString()
            r1.A0K(r0, r4)
            goto L_0x0423
        L_0x03e9:
            java.lang.Object r13 = r12.getValue()
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x0423
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0423
            int r11 = r13.size()
            X.0wG r0 = r2.A04
            if (r11 != r7) goto L_0x0427
            android.content.Context r12 = r0.A00
            r11 = 2131889271(0x7f120c77, float:1.94132E38)
            java.lang.Object[] r5 = new java.lang.Object[r7]
            X.171 r3 = r2.A03
            X.16D r1 = r2.A02
            java.lang.Object r0 = r13.get(r4)
            X.11F r0 = (X.AnonymousClass11F) r0
            X.141 r0 = r1.A0D(r0)
            java.lang.String r0 = r3.A0H(r0)
            r5[r4] = r0
            java.lang.String r1 = r12.getString(r11, r5)
        L_0x041e:
            X.17Y r0 = r2.A00
            r0.A0K(r1, r4)
        L_0x0423:
            r11 = 406(0x196, float:5.69E-43)
            goto L_0x01d6
        L_0x0427:
            android.content.Context r0 = r0.A00
            android.content.res.Resources r5 = r0.getResources()
            r3 = 2131755108(0x7f100064, float:1.9141086E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1[r4] = r0
            java.lang.String r1 = r5.getQuantityString(r3, r11, r1)
            goto L_0x041e
        L_0x043d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Object r0 = r5.obj
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r13 = r0.iterator()
        L_0x044e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x05a3
            java.lang.Object r5 = r13.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r3 = r5.getKey()
            X.11F r3 = (X.AnonymousClass11F) r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/remove-participant/error/"
            r1.append(r0)
            r1.append(r3)
            r1.append(r9)
            java.lang.Object r0 = r5.getValue()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r5.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.16D r0 = r2.A02
            X.141 r12 = r0.A0D(r3)
            if (r1 == r10) goto L_0x044e
            X.0wG r0 = r2.A04
            android.content.Context r5 = r0.A00
            r3 = 2131889328(0x7f120cb0, float:1.9413316E38)
            if (r1 == r11) goto L_0x049c
            r3 = 2131889327(0x7f120caf, float:1.9413314E38)
        L_0x049c:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.171 r0 = r2.A03
            java.lang.String r0 = r0.A0H(r12)
            r1[r4] = r0
            java.lang.String r0 = r5.getString(r3, r1)
            r6.append(r0)
            r6.append(r8)
            goto L_0x044e
        L_0x04b1:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Object r0 = r5.obj
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r13 = r0.iterator()
        L_0x04c2:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x05a9
            java.lang.Object r5 = r13.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r3 = r5.getKey()
            X.11F r3 = (X.AnonymousClass11F) r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/add-admins/error/"
            r1.append(r0)
            r1.append(r3)
            r1.append(r9)
            java.lang.Object r0 = r5.getValue()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r5.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.16D r0 = r2.A02
            X.141 r11 = r0.A0D(r3)
            if (r1 == r10) goto L_0x0522
            if (r1 != r12) goto L_0x0522
            X.0wG r0 = r2.A04
            android.content.Context r5 = r0.A00
            r3 = 2131896612(0x7f122924, float:1.942809E38)
        L_0x050d:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.171 r0 = r2.A03
            java.lang.String r0 = r0.A0H(r11)
            r1[r4] = r0
            java.lang.String r0 = r5.getString(r3, r1)
            r6.append(r0)
            r6.append(r8)
            goto L_0x04c2
        L_0x0522:
            X.0wG r0 = r2.A04
            android.content.Context r5 = r0.A00
            r3 = 2131889267(0x7f120c73, float:1.9413193E38)
            goto L_0x050d
        L_0x052a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Object r0 = r5.obj
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r13 = r0.iterator()
        L_0x053b:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x05a9
            java.lang.Object r5 = r13.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r3 = r5.getKey()
            X.11F r3 = (X.AnonymousClass11F) r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/remove-admins/error/"
            r1.append(r0)
            r1.append(r3)
            r1.append(r9)
            java.lang.Object r0 = r5.getValue()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r5.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.16D r0 = r2.A02
            X.141 r12 = r0.A0D(r3)
            if (r1 == r10) goto L_0x059b
            if (r1 != r11) goto L_0x059b
            X.0wG r0 = r2.A04
            android.content.Context r5 = r0.A00
            r3 = 2131889325(0x7f120cad, float:1.941331E38)
        L_0x0586:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.171 r0 = r2.A03
            java.lang.String r0 = r0.A0H(r12)
            r1[r4] = r0
            java.lang.String r0 = r5.getString(r3, r1)
            r6.append(r0)
            r6.append(r8)
            goto L_0x053b
        L_0x059b:
            X.0wG r0 = r2.A04
            android.content.Context r5 = r0.A00
            r3 = 2131889327(0x7f120caf, float:1.9413314E38)
            goto L_0x0586
        L_0x05a3:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x002f
        L_0x05a9:
            X.17Y r1 = r2.A00
            java.lang.String r0 = r6.toString()
            r1.A0K(r0, r4)
            return
        L_0x05b3:
            java.lang.Object r1 = r5.obj
            X.11F r1 = (X.AnonymousClass11F) r1
            X.16D r0 = r2.A02
            X.141 r6 = r0.A0A(r1)
            if (r6 == 0) goto L_0x002f
            X.17Y r5 = r2.A00
            X.0wG r0 = r2.A04
            android.content.Context r3 = r0.A00
            r2 = 2131889556(0x7f120d94, float:1.9413779E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r6.A0J()
            r1[r4] = r0
            java.lang.String r0 = r3.getString(r2, r1)
            r5.A0E(r0, r4)
            return
        L_0x05d8:
            X.1PT r0 = r2.A0A
            java.lang.Object r4 = r5.obj
            X.34g r4 = (X.C595234g) r4
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r3 = r0.iterator()
        L_0x05e6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r3.next()
            X.32z r0 = (X.C591932z) r0
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity r2 = r0.A00
            X.147 r1 = r2.A07
            if (r1 == 0) goto L_0x05e6
            X.147 r0 = r4.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x05e6
            java.lang.String r0 = r4.A01
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity.A01(r2, r0)
            goto L_0x05e6
        L_0x0606:
            java.lang.String r0 = "groupmgr/handle groupchat membership approval request"
            goto L_0x0829
        L_0x060a:
            X.17Y r3 = r2.A00
            r1 = 2131889290(0x7f120c8a, float:1.941324E38)
            goto L_0x07b2
        L_0x0611:
            java.lang.String r0 = "groupmgr/handle groupchat membership approval mode change"
            goto L_0x0829
        L_0x0615:
            java.lang.String r0 = "groupmgr/handle group member add mode change"
            goto L_0x0829
        L_0x0619:
            X.17Y r3 = r2.A00
            r1 = 2131889291(0x7f120c8b, float:1.9413241E38)
            goto L_0x07b2
        L_0x0620:
            X.0yf r1 = r2.A01
            X.0yh r0 = X.C21100yf.A1W
            int r0 = r1.A04(r0)
            X.17Y r6 = r2.A00
            X.0ts r8 = r2.A05
            r5 = 2131755436(0x7f1001ac, float:1.9141751E38)
            long r1 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r4] = r0
            java.lang.String r0 = r8.A0L(r3, r5, r1)
            goto L_0x0727
        L_0x063e:
            java.lang.String r0 = "groupmgr/handle groupchat description updated"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r3 = r5.obj
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            X.0xM r0 = r2.A06
            r0.A0k(r3)
            goto L_0x0835
        L_0x064e:
            java.lang.String r0 = "groupmgr/handle groupchat no frequently forwarded change"
            goto L_0x0829
        L_0x0652:
            java.lang.String r0 = "groupmgr/handle groupchat ephemeral setting changed"
            goto L_0x0829
        L_0x0656:
            X.17Y r3 = r2.A00
            r1 = 2131889563(0x7f120d9b, float:1.9413793E38)
            goto L_0x07b2
        L_0x065d:
            X.17Y r3 = r2.A00
            r1 = 2131889564(0x7f120d9c, float:1.9413795E38)
            goto L_0x07b2
        L_0x0664:
            X.17Y r3 = r2.A00
            r1 = 2131889562(0x7f120d9a, float:1.9413791E38)
            goto L_0x07b2
        L_0x066b:
            X.17Y r3 = r2.A00
            r1 = 2131890138(0x7f120fda, float:1.941496E38)
            goto L_0x07b2
        L_0x0672:
            java.lang.String r0 = "groupmgr/handle groupchat description change"
            goto L_0x0829
        L_0x0676:
            java.lang.String r0 = "groupmgr/handle groupchat restrict mode change"
            goto L_0x0829
        L_0x067a:
            X.17Y r6 = r2.A00
            X.0wG r0 = r2.A04
            android.content.Context r3 = r0.A00
            r2 = 2131890144(0x7f120fe0, float:1.9414972E38)
            goto L_0x071d
        L_0x0685:
            X.17Y r6 = r2.A00
            X.0wG r0 = r2.A04
            android.content.Context r3 = r0.A00
            r2 = 2131890147(0x7f120fe3, float:1.9414978E38)
            goto L_0x071d
        L_0x0690:
            X.17Y r6 = r2.A00
            X.0yC r3 = r2.A08
            r1 = 3088(0xc10, float:4.327E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r3, r1)
            if (r0 != 0) goto L_0x072b
            X.0wG r0 = r2.A04
            android.content.Context r3 = r0.A00
            r2 = 2131890146(0x7f120fe2, float:1.9414976E38)
            goto L_0x071d
        L_0x06a6:
            X.17Y r6 = r2.A00
            X.0wG r0 = r2.A04
            android.content.Context r3 = r0.A00
            r2 = 2131890148(0x7f120fe4, float:1.941498E38)
            goto L_0x071d
        L_0x06b0:
            X.17Y r3 = r2.A00
            X.0yC r2 = r2.A08
            r1 = 3088(0xc10, float:4.327E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r1 = 2131890164(0x7f120ff4, float:1.9415012E38)
            if (r0 == 0) goto L_0x07b2
            r1 = 2131890156(0x7f120fec, float:1.9414996E38)
            goto L_0x07b2
        L_0x06c6:
            X.17Y r3 = r2.A00
            X.0yC r2 = r2.A08
            r1 = 3088(0xc10, float:4.327E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r1 = 2131890166(0x7f120ff6, float:1.9415016E38)
            if (r0 == 0) goto L_0x07b2
            r1 = 2131890158(0x7f120fee, float:1.9415E38)
            goto L_0x07b2
        L_0x06dc:
            X.17Y r3 = r2.A00
            X.0yC r2 = r2.A08
            r1 = 3088(0xc10, float:4.327E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r1 = 2131890167(0x7f120ff7, float:1.9415018E38)
            if (r0 == 0) goto L_0x07b2
            r1 = 2131890159(0x7f120fef, float:1.9415002E38)
            goto L_0x07b2
        L_0x06f2:
            X.17Y r3 = r2.A00
            X.0yC r2 = r2.A08
            r1 = 3088(0xc10, float:4.327E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r1 = 2131890165(0x7f120ff5, float:1.9415014E38)
            if (r0 == 0) goto L_0x07b2
            r1 = 2131890157(0x7f120fed, float:1.9414998E38)
            goto L_0x07b2
        L_0x0708:
            X.17Y r6 = r2.A00
            X.0yC r3 = r2.A08
            r1 = 3088(0xc10, float:4.327E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r3, r1)
            if (r0 != 0) goto L_0x072b
            X.0wG r0 = r2.A04
            android.content.Context r3 = r0.A00
            r2 = 2131890168(0x7f120ff8, float:1.941502E38)
        L_0x071d:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Object r0 = r5.obj
            r1[r4] = r0
            java.lang.String r0 = r3.getString(r2, r1)
        L_0x0727:
            r6.A0K(r0, r4)
            return
        L_0x072b:
            X.0wG r0 = r2.A04
            android.content.Context r3 = r0.A00
            r2 = 2131890145(0x7f120fe1, float:1.9414974E38)
            goto L_0x071d
        L_0x0733:
            X.17Y r3 = r2.A00
            r1 = 2131890134(0x7f120fd6, float:1.9414951E38)
            goto L_0x07b2
        L_0x0739:
            X.17Y r3 = r2.A00
            r1 = 2131890136(0x7f120fd8, float:1.9414955E38)
            goto L_0x07b2
        L_0x073f:
            X.17Y r3 = r2.A00
            r1 = 2131890137(0x7f120fd9, float:1.9414957E38)
            goto L_0x07b2
        L_0x0745:
            X.17Y r1 = r2.A00
            r0 = 2131890133(0x7f120fd5, float:1.941495E38)
            r1.A04(r0, r4)
        L_0x074d:
            X.17Y r3 = r2.A00
            r1 = 2131890135(0x7f120fd7, float:1.9414953E38)
            goto L_0x07b2
        L_0x0753:
            X.17Y r3 = r2.A00
            r1 = 2131890160(0x7f120ff0, float:1.9415004E38)
            goto L_0x07b2
        L_0x0759:
            X.17Y r3 = r2.A00
            r1 = 2131890162(0x7f120ff2, float:1.9415008E38)
            goto L_0x07b2
        L_0x075f:
            X.17Y r3 = r2.A00
            r1 = 2131890163(0x7f120ff3, float:1.941501E38)
            goto L_0x07b2
        L_0x0765:
            X.17Y r3 = r2.A00
            r1 = 2131890161(0x7f120ff1, float:1.9415006E38)
            goto L_0x07b2
        L_0x076b:
            X.17Y r3 = r2.A00
            r1 = 2131890139(0x7f120fdb, float:1.9414961E38)
            goto L_0x07b2
        L_0x0771:
            X.17Y r3 = r2.A00
            r1 = 2131890141(0x7f120fdd, float:1.9414965E38)
            goto L_0x07b2
        L_0x0777:
            X.17Y r3 = r2.A00
            r1 = 2131890142(0x7f120fde, float:1.9414967E38)
            goto L_0x07b2
        L_0x077d:
            X.17Y r3 = r2.A00
            r1 = 2131890140(0x7f120fdc, float:1.9414963E38)
            goto L_0x07b2
        L_0x0783:
            X.17Y r3 = r2.A00
            r1 = 2131890153(0x7f120fe9, float:1.941499E38)
            goto L_0x07b2
        L_0x0789:
            X.17Y r3 = r2.A00
            r1 = 2131890155(0x7f120feb, float:1.9414994E38)
            goto L_0x07b2
        L_0x078f:
            X.17Y r3 = r2.A00
            r1 = 2131890154(0x7f120fea, float:1.9414992E38)
            goto L_0x07b2
        L_0x0795:
            X.17Y r3 = r2.A00
            r1 = 2131890152(0x7f120fe8, float:1.9414988E38)
            goto L_0x07b2
        L_0x079b:
            X.17Y r3 = r2.A00
            r1 = 2131890143(0x7f120fdf, float:1.941497E38)
            goto L_0x07b2
        L_0x07a1:
            X.17Y r3 = r2.A00
            r1 = 2131888540(0x7f12099c, float:1.9411718E38)
            goto L_0x07b2
        L_0x07a7:
            X.17Y r3 = r2.A00
            r1 = 2131890688(0x7f121200, float:1.9416075E38)
            goto L_0x07b2
        L_0x07ad:
            X.17Y r3 = r2.A00
            r1 = 2131889292(0x7f120c8c, float:1.9413243E38)
        L_0x07b2:
            r3.A04(r1, r4)
            return
        L_0x07b6:
            java.lang.Object r1 = r5.obj
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1Op r0 = r2.A09
            r0.A02(r1)
            X.17Y r3 = r2.A00
            r1 = 2131890134(0x7f120fd6, float:1.9414951E38)
            goto L_0x080f
        L_0x07c5:
            java.lang.Object r1 = r5.obj
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1Op r0 = r2.A09
            r0.A02(r1)
            X.17Y r3 = r2.A00
            r1 = 2131890160(0x7f120ff0, float:1.9415004E38)
            goto L_0x080f
        L_0x07d4:
            java.lang.Object r1 = r5.obj
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1Op r0 = r2.A09
            r0.A02(r1)
            X.17Y r3 = r2.A00
            r1 = 2131890139(0x7f120fdb, float:1.9414961E38)
            goto L_0x080f
        L_0x07e3:
            java.lang.Object r1 = r5.obj
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1Op r0 = r2.A09
            r0.A02(r1)
            X.17Y r3 = r2.A00
            X.0yC r2 = r2.A08
            r1 = 3088(0xc10, float:4.327E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r1 = 2131890164(0x7f120ff4, float:1.9415012E38)
            if (r0 == 0) goto L_0x080f
            r1 = 2131890156(0x7f120fec, float:1.9414996E38)
            goto L_0x080f
        L_0x0801:
            java.lang.Object r1 = r5.obj
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1Op r0 = r2.A09
            r0.A02(r1)
            X.17Y r3 = r2.A00
            r1 = 2131890143(0x7f120fdf, float:1.941497E38)
        L_0x080f:
            r3.A06(r1, r4)
            return
        L_0x0813:
            java.lang.Object r1 = r5.obj
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1Op r0 = r2.A09
            r0.A02(r1)
            return
        L_0x081d:
            java.lang.String r0 = "groupmgr/conversations/leave group"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r3 = r5.obj
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            goto L_0x0835
        L_0x0827:
            java.lang.String r0 = "groupmgr/handle groupchat report to admin status change"
        L_0x0829:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x082c:
            java.lang.Object r3 = r5.obj
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            X.0xM r0 = r2.A06
            r0.A0h(r3)
        L_0x0835:
            X.1Op r1 = r2.A09
            X.3Qa r0 = r3.A1J
            X.11F r0 = r0.A00
            r1.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PU.handleMessage(android.os.Message):void");
    }

    public AnonymousClass1PU(AnonymousClass17Y r2, C21100yf r3, AnonymousClass16D r4, AnonymousClass171 r5, C19630wG r6, C18820ts r7, C20310xM r8, AnonymousClass17X r9, C20810yC r10, C27541Op r11, AnonymousClass1PT r12) {
        super(Looper.getMainLooper());
        this.A08 = r10;
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r7;
        this.A06 = r8;
        this.A09 = r11;
        this.A07 = r9;
        this.A0A = r12;
    }
}
