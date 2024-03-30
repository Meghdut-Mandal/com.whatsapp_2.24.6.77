package X;

import android.util.Log;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0BU  reason: invalid class name */
public abstract class AnonymousClass0BU {
    public boolean A00 = false;
    public boolean A01 = false;
    public final ViewGroup A02;
    public final ArrayList A03 = new ArrayList();
    public final ArrayList A04 = new ArrayList();

    public void A05() {
        String str;
        String str2;
        if (AnonymousClass01z.A0E(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.A02;
        boolean A022 = C011304x.A02(viewGroup);
        ArrayList arrayList = this.A03;
        synchronized (arrayList) {
            A01();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AnonymousClass0Bl) it.next()).A03();
            }
            Iterator it2 = new ArrayList(this.A04).iterator();
            while (it2.hasNext()) {
                AnonymousClass0Bl r4 = (AnonymousClass0Bl) it2.next();
                if (AnonymousClass01z.A0E(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (A022) {
                        str2 = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(viewGroup);
                        sb2.append(" is not attached to window. ");
                        str2 = sb2.toString();
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(r4);
                    Log.v("FragmentManager", sb.toString());
                }
                r4.A04();
            }
            Iterator it3 = new ArrayList(arrayList).iterator();
            while (it3.hasNext()) {
                AnonymousClass0Bl r42 = (AnonymousClass0Bl) it3.next();
                if (AnonymousClass01z.A0E(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (A022) {
                        str = "";
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Container ");
                        sb4.append(viewGroup);
                        sb4.append(" is not attached to window. ");
                        str = sb4.toString();
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(r42);
                    Log.v("FragmentManager", sb3.toString());
                }
                r42.A04();
            }
        }
    }

    private void A01() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            AnonymousClass0Bl r2 = (AnonymousClass0Bl) it.next();
            if (r2.A01 == C023109s.A01) {
                r2.A05(C02670Bj.A00(r2.A04.A0d().getVisibility()), C023109s.A00);
            }
        }
    }

    public static void A02(C022909q r6, AnonymousClass0BU r7, Integer num, Integer num2) {
        ArrayList arrayList = r7.A03;
        synchronized (arrayList) {
            C02680Bk r5 = new C02680Bk();
            AnonymousClass02E r4 = r6.A02;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    AnonymousClass0Bl r2 = new AnonymousClass0Bl(r5, r6, num, num2);
                    arrayList.add(r2);
                    C02710Bo r0 = new C02710Bo(r2, r7);
                    List list = r2.A06;
                    list.add(r0);
                    list.add(new C02720Bp(r2, r7));
                    break;
                }
                AnonymousClass0Bl r1 = (AnonymousClass0Bl) it.next();
                if (r1.A04.equals(r4) && !r1.A02) {
                    r1.A05(num, num2);
                    break;
                }
            }
        }
    }

    public void A06() {
        boolean z;
        ArrayList arrayList = this.A03;
        synchronized (arrayList) {
            A01();
            this.A00 = false;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                AnonymousClass0Bl r3 = (AnonymousClass0Bl) arrayList.get(size);
                Integer A012 = C02670Bj.A01(r3.A04.A0F);
                Integer num = r3.A00;
                Integer num2 = C023109s.A01;
                if (num == num2 && A012 != num2) {
                    C023009r r0 = r3.A04.A0H;
                    if (r0 == null) {
                        z = false;
                    } else {
                        z = r0.A0E;
                    }
                    this.A00 = z;
                }
            }
        }
    }

    public AnonymousClass0BU(ViewGroup viewGroup) {
        this.A02 = viewGroup;
    }

    public static AnonymousClass0BU A00(ViewGroup viewGroup) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof AnonymousClass0BU) {
            return (AnonymousClass0BU) tag;
        }
        AnonymousClass0BV r1 = new AnonymousClass0BV(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, r1);
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02b5, code lost:
        if (r0 != null) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02b9, code lost:
        if (r13 == null) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02bb, code lost:
        r13 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02c0, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02c5, code lost:
        if (r12 >= r13.size()) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02c7, code lost:
        r16 = r11.indexOf(r13.get(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02d3, code lost:
        if (r16 == -1) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02d5, code lost:
        r11.set(r16, r14.get(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02df, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02e2, code lost:
        r0 = r33.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02e6, code lost:
        if (r0 == null) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02e8, code lost:
        r13 = r0.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02ea, code lost:
        if (r13 != null) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02ec, code lost:
        r13 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02f1, code lost:
        r15 = r11.size();
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02f6, code lost:
        if (r12 >= r15) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02f8, code lost:
        r2.put(r11.get(r12), r13.get(r12));
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x030a, code lost:
        if (X.AnonymousClass01z.A0E(2) == false) goto L_0x035e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x030c, code lost:
        android.util.Log.v("FragmentManager", ">>> entering view names <<<");
        r15 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x031b, code lost:
        if (r15.hasNext() == false) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x031d, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("Name: ");
        r0.append((java.lang.String) r15.next());
        android.util.Log.v("FragmentManager", r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0336, code lost:
        android.util.Log.v("FragmentManager", ">>> exiting view names <<<");
        r15 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0343, code lost:
        if (r15.hasNext() == false) goto L_0x035e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0345, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("Name: ");
        r0.append((java.lang.String) r15.next());
        android.util.Log.v("FragmentManager", r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x035e, code lost:
        r14 = new X.AnonymousClass008();
        r8.A08(r18.A0F, r14);
        r14.A0A(r11);
        r2.A0A(r14.keySet());
        r12 = new X.AnonymousClass008();
        r8.A08(r33.A0F, r12);
        r12.A0A(r13);
        r12.A0A(r2.values());
        r0 = X.C06990Vx.A00;
        r15 = r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0390, code lost:
        r15 = r15 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0392, code lost:
        if (r15 < 0) goto L_0x03a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x039c, code lost:
        if (r12.containsKey(r2.A06(r15)) != false) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x039e, code lost:
        r2.A05(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03a2, code lost:
        X.AnonymousClass0BV.A01(r14, r2.keySet());
        X.AnonymousClass0BV.A01(r12, r2.values());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03b4, code lost:
        if (r2.isEmpty() == false) goto L_0x03bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03b6, code lost:
        r26.clear();
        r25.clear();
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03bf, code lost:
        X.C09020bh.A00(r3, new X.C11950hG(r12, r8, r6, r7));
        r26.addAll(r14.values());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03d4, code lost:
        if (r11.isEmpty() != false) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03d6, code lost:
        r10 = (android.view.View) r14.get(r11.get(0));
        r9.A09(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03e4, code lost:
        r25.addAll(r12.values());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03f1, code lost:
        if (r13.isEmpty() != false) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03f3, code lost:
        r12 = (android.view.View) r12.get(r13.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03fe, code lost:
        if (r12 == null) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0400, code lost:
        X.C09020bh.A00(r3, new X.C11960hH(r27, r12, r8, r9));
        r24 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x040c, code lost:
        r9.A0B(r0, r1, r26);
        r9.A0E(r1, (java.lang.Object) null, (java.lang.Object) null, r1, (java.util.ArrayList) null, (java.util.ArrayList) null, r25);
        r4.put(r7, true);
        r4.put(r6, true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r42 = this;
            r21 = r42
            r0 = r21
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x001c
            r0 = r21
            android.view.ViewGroup r0 = r0.A02
            boolean r0 = X.C011304x.A02(r0)
            r32 = 0
            if (r0 != 0) goto L_0x001d
            r21.A05()
            r1 = 0
            r0 = r21
            r0.A01 = r1
        L_0x001c:
            return
        L_0x001d:
            r0 = r21
            java.util.ArrayList r0 = r0.A03
            r19 = r0
            monitor-enter(r19)
            boolean r0 = r19.isEmpty()     // Catch:{ all -> 0x0873 }
            if (r0 != 0) goto L_0x0871
            r0 = r21
            java.util.ArrayList r5 = r0.A04     // Catch:{ all -> 0x0873 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0873 }
            r0.<init>(r5)     // Catch:{ all -> 0x0873 }
            r5.clear()     // Catch:{ all -> 0x0873 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0873 }
        L_0x003a:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0873 }
            r20 = 2
            if (r0 == 0) goto L_0x006f
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x0873 }
            X.0Bl r3 = (X.AnonymousClass0Bl) r3     // Catch:{ all -> 0x0873 }
            boolean r0 = X.AnonymousClass01z.A0E(r20)     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x0064
            java.lang.String r2 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0873 }
            r1.<init>()     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = "SpecialEffectsController: Cancelling operation "
            r1.append(r0)     // Catch:{ all -> 0x0873 }
            r1.append(r3)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0873 }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x0873 }
        L_0x0064:
            r3.A04()     // Catch:{ all -> 0x0873 }
            boolean r0 = r3.A03     // Catch:{ all -> 0x0873 }
            if (r0 != 0) goto L_0x003a
            r5.add(r3)     // Catch:{ all -> 0x0873 }
            goto L_0x003a
        L_0x006f:
            r21.A01()     // Catch:{ all -> 0x0873 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0873 }
            r0 = r19
            r2.<init>(r0)     // Catch:{ all -> 0x0873 }
            r19.clear()     // Catch:{ all -> 0x0873 }
            r5.addAll(r2)     // Catch:{ all -> 0x0873 }
            boolean r0 = X.AnonymousClass01z.A0E(r20)     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x008c
            java.lang.String r1 = "FragmentManager"
            java.lang.String r0 = "SpecialEffectsController: Executing pending operations"
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0873 }
        L_0x008c:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0873 }
        L_0x0090:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0873 }
            X.0Bl r0 = (X.AnonymousClass0Bl) r0     // Catch:{ all -> 0x0873 }
            r0.A03()     // Catch:{ all -> 0x0873 }
            goto L_0x0090
        L_0x00a0:
            r0 = r21
            boolean r1 = r0.A01     // Catch:{ all -> 0x0873 }
            r8 = r21
            X.0BV r8 = (X.AnonymousClass0BV) r8     // Catch:{ all -> 0x0873 }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ all -> 0x0873 }
            r5 = 0
            r7 = r5
        L_0x00ae:
            r6 = r5
        L_0x00af:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0873 }
            r9 = 3
            r30 = 1
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r5 = r10.next()     // Catch:{ all -> 0x0873 }
            X.0Bl r5 = (X.AnonymousClass0Bl) r5     // Catch:{ all -> 0x0873 }
            X.02E r0 = r5.A04     // Catch:{ all -> 0x0873 }
            android.view.View r0 = r0.A0F     // Catch:{ all -> 0x0873 }
            java.lang.Integer r4 = X.C02670Bj.A01(r0)     // Catch:{ all -> 0x0873 }
            java.lang.Integer r0 = r5.A00     // Catch:{ all -> 0x0873 }
            int r3 = r0.intValue()     // Catch:{ all -> 0x0873 }
            r0 = 2
            if (r3 == r0) goto L_0x00dc
            if (r3 == r9) goto L_0x00dc
            r0 = 0
            if (r3 == r0) goto L_0x00dc
            r0 = 1
            if (r3 != r0) goto L_0x00af
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ all -> 0x0873 }
            if (r4 == r0) goto L_0x00af
            goto L_0x00ae
        L_0x00dc:
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ all -> 0x0873 }
            if (r4 != r0) goto L_0x00af
            if (r7 != 0) goto L_0x00af
            r7 = r5
            goto L_0x00af
        L_0x00e4:
            boolean r0 = X.AnonymousClass01z.A0E(r20)     // Catch:{ all -> 0x0873 }
            java.lang.String r22 = " to "
            java.lang.String r5 = "FragmentManager"
            if (r0 == 0) goto L_0x010a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0873 }
            r3.<init>()     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = "Executing operations from "
            r3.append(r0)     // Catch:{ all -> 0x0873 }
            r3.append(r7)     // Catch:{ all -> 0x0873 }
            r0 = r22
            r3.append(r0)     // Catch:{ all -> 0x0873 }
            r3.append(r6)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0873 }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0873 }
        L_0x010a:
            java.util.ArrayList r29 = new java.util.ArrayList     // Catch:{ all -> 0x0873 }
            r29.<init>()     // Catch:{ all -> 0x0873 }
            java.util.ArrayList r31 = new java.util.ArrayList     // Catch:{ all -> 0x0873 }
            r31.<init>()     // Catch:{ all -> 0x0873 }
            java.util.ArrayList r23 = new java.util.ArrayList     // Catch:{ all -> 0x0873 }
            r0 = r23
            r0.<init>(r2)     // Catch:{ all -> 0x0873 }
            int r0 = r2.size()     // Catch:{ all -> 0x0873 }
            int r0 = r0 + -1
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x0873 }
            X.0Bl r0 = (X.AnonymousClass0Bl) r0     // Catch:{ all -> 0x0873 }
            X.02E r4 = r0.A04     // Catch:{ all -> 0x0873 }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ all -> 0x0873 }
        L_0x012d:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x0150
            java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x0873 }
            X.0Bl r0 = (X.AnonymousClass0Bl) r0     // Catch:{ all -> 0x0873 }
            X.02E r0 = r0.A04     // Catch:{ all -> 0x0873 }
            X.09r r3 = r0.A0H     // Catch:{ all -> 0x0873 }
            X.09r r9 = r4.A0H     // Catch:{ all -> 0x0873 }
            int r0 = r9.A01     // Catch:{ all -> 0x0873 }
            r3.A01 = r0     // Catch:{ all -> 0x0873 }
            int r0 = r9.A02     // Catch:{ all -> 0x0873 }
            r3.A02 = r0     // Catch:{ all -> 0x0873 }
            int r0 = r9.A04     // Catch:{ all -> 0x0873 }
            r3.A04 = r0     // Catch:{ all -> 0x0873 }
            int r0 = r9.A05     // Catch:{ all -> 0x0873 }
            r3.A05 = r0     // Catch:{ all -> 0x0873 }
            goto L_0x012d
        L_0x0150:
            java.util.Iterator r10 = r2.iterator()     // Catch:{ all -> 0x0873 }
        L_0x0154:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x01a3
            java.lang.Object r3 = r10.next()     // Catch:{ all -> 0x0873 }
            X.0Bl r3 = (X.AnonymousClass0Bl) r3     // Catch:{ all -> 0x0873 }
            X.0Bk r0 = new X.0Bk     // Catch:{ all -> 0x0873 }
            r0.<init>()     // Catch:{ all -> 0x0873 }
            r3.A03()     // Catch:{ all -> 0x0873 }
            java.util.HashSet r9 = r3.A05     // Catch:{ all -> 0x0873 }
            r9.add(r0)     // Catch:{ all -> 0x0873 }
            X.0Co r2 = new X.0Co     // Catch:{ all -> 0x0873 }
            r2.<init>(r0, r3, r1)     // Catch:{ all -> 0x0873 }
            r0 = r29
            r0.add(r2)     // Catch:{ all -> 0x0873 }
            X.0Bk r4 = new X.0Bk     // Catch:{ all -> 0x0873 }
            r4.<init>()     // Catch:{ all -> 0x0873 }
            r3.A03()     // Catch:{ all -> 0x0873 }
            r9.add(r4)     // Catch:{ all -> 0x0873 }
            r0 = 0
            if (r1 == 0) goto L_0x0189
            if (r3 != r7) goto L_0x018c
        L_0x0187:
            r0 = 1
            goto L_0x018c
        L_0x0189:
            if (r3 != r6) goto L_0x018c
            goto L_0x0187
        L_0x018c:
            X.0Cp r2 = new X.0Cp     // Catch:{ all -> 0x0873 }
            r2.<init>(r4, r3, r1, r0)     // Catch:{ all -> 0x0873 }
            r0 = r31
            r0.add(r2)     // Catch:{ all -> 0x0873 }
            X.0Cq r2 = new X.0Cq     // Catch:{ all -> 0x0873 }
            r0 = r23
            r2.<init>(r8, r3, r0)     // Catch:{ all -> 0x0873 }
            java.util.List r0 = r3.A06     // Catch:{ all -> 0x0873 }
            r0.add(r2)     // Catch:{ all -> 0x0873 }
            goto L_0x0154
        L_0x01a3:
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0873 }
            r4.<init>()     // Catch:{ all -> 0x0873 }
            java.util.Iterator r11 = r31.iterator()     // Catch:{ all -> 0x0873 }
            r9 = 0
        L_0x01ad:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x022f
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x0873 }
            X.0Cp r10 = (X.C02970Cp) r10     // Catch:{ all -> 0x0873 }
            boolean r0 = r10.A02()     // Catch:{ all -> 0x0873 }
            if (r0 != 0) goto L_0x01ad
            java.lang.Object r2 = r10.A01     // Catch:{ all -> 0x0873 }
            X.0YI r1 = X.C02970Cp.A00(r10, r2)     // Catch:{ all -> 0x0873 }
            java.lang.Object r3 = r10.A00     // Catch:{ all -> 0x0873 }
            X.0YI r0 = X.C02970Cp.A00(r10, r3)     // Catch:{ all -> 0x0873 }
            if (r1 == 0) goto L_0x01d2
            if (r0 == 0) goto L_0x01d3
            if (r1 == r0) goto L_0x01d3
            goto L_0x01dc
        L_0x01d2:
            r1 = r0
        L_0x01d3:
            if (r9 != 0) goto L_0x01d7
            r9 = r1
            goto L_0x01ad
        L_0x01d7:
            if (r1 == 0) goto L_0x01ad
            if (r9 == r1) goto L_0x01ad
            goto L_0x0207
        L_0x01dc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0873 }
            r1.<init>()     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0873 }
            X.0Bl r0 = r10.A01     // Catch:{ all -> 0x0873 }
            X.02E r0 = r0.A04     // Catch:{ all -> 0x0873 }
            r1.append(r0)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = " returned Transition "
            r1.append(r0)     // Catch:{ all -> 0x0873 }
            r1.append(r2)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = " which uses a different Transition  type than its shared element transition "
            r1.append(r0)     // Catch:{ all -> 0x0873 }
            r1.append(r3)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0873 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0873 }
            r1.<init>(r0)     // Catch:{ all -> 0x0873 }
            goto L_0x022e
        L_0x0207:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0873 }
            r1.<init>()     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0873 }
            X.0Bl r0 = r10.A01     // Catch:{ all -> 0x0873 }
            X.02E r0 = r0.A04     // Catch:{ all -> 0x0873 }
            r1.append(r0)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = " returned Transition "
            r1.append(r0)     // Catch:{ all -> 0x0873 }
            r1.append(r2)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = " which uses a different Transition  type than other Fragments."
            r1.append(r0)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0873 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0873 }
            r1.<init>(r0)     // Catch:{ all -> 0x0873 }
        L_0x022e:
            throw r1     // Catch:{ all -> 0x0873 }
        L_0x022f:
            if (r9 != 0) goto L_0x024e
            java.util.Iterator r3 = r31.iterator()     // Catch:{ all -> 0x0873 }
        L_0x0235:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x069d
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0873 }
            X.0Cn r2 = (X.C02950Cn) r2     // Catch:{ all -> 0x0873 }
            X.0Bl r1 = r2.A01     // Catch:{ all -> 0x0873 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r32)     // Catch:{ all -> 0x0873 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0873 }
            r2.A01()     // Catch:{ all -> 0x0873 }
            goto L_0x0235
        L_0x024e:
            android.view.ViewGroup r3 = r8.A02     // Catch:{ all -> 0x0873 }
            android.content.Context r1 = r3.getContext()     // Catch:{ all -> 0x0873 }
            android.view.View r28 = new android.view.View     // Catch:{ all -> 0x0873 }
            r0 = r28
            r0.<init>(r1)     // Catch:{ all -> 0x0873 }
            android.graphics.Rect r27 = new android.graphics.Rect     // Catch:{ all -> 0x0873 }
            r27.<init>()     // Catch:{ all -> 0x0873 }
            java.util.ArrayList r26 = new java.util.ArrayList     // Catch:{ all -> 0x0873 }
            r26.<init>()     // Catch:{ all -> 0x0873 }
            java.util.ArrayList r25 = new java.util.ArrayList     // Catch:{ all -> 0x0873 }
            r25.<init>()     // Catch:{ all -> 0x0873 }
            X.008 r2 = new X.008     // Catch:{ all -> 0x0873 }
            r2.<init>()     // Catch:{ all -> 0x0873 }
            java.util.Iterator r17 = r31.iterator()     // Catch:{ all -> 0x0873 }
            r1 = 0
            r10 = 0
            r24 = 0
        L_0x0277:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x0432
            java.lang.Object r0 = r17.next()     // Catch:{ all -> 0x0873 }
            X.0Cp r0 = (X.C02970Cp) r0     // Catch:{ all -> 0x0873 }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x0277
            if (r7 == 0) goto L_0x0277
            if (r6 == 0) goto L_0x0277
            java.lang.Object r0 = r9.A03(r0)     // Catch:{ all -> 0x0873 }
            java.lang.Object r1 = r9.A04(r0)     // Catch:{ all -> 0x0873 }
            X.02E r0 = r6.A04     // Catch:{ all -> 0x0873 }
            r33 = r0
            X.09r r0 = r0.A0H     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x029f
            java.util.ArrayList r11 = r0.A0C     // Catch:{ all -> 0x0873 }
            if (r11 != 0) goto L_0x02a4
        L_0x029f:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0873 }
            r11.<init>()     // Catch:{ all -> 0x0873 }
        L_0x02a4:
            X.02E r0 = r7.A04     // Catch:{ all -> 0x0873 }
            r18 = r0
            X.09r r0 = r0.A0H     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x02b0
            java.util.ArrayList r14 = r0.A0C     // Catch:{ all -> 0x0873 }
            if (r14 != 0) goto L_0x02b7
        L_0x02b0:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0873 }
            r14.<init>()     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x02bb
        L_0x02b7:
            java.util.ArrayList r13 = r0.A0D     // Catch:{ all -> 0x0873 }
            if (r13 != 0) goto L_0x02c0
        L_0x02bb:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0873 }
            r13.<init>()     // Catch:{ all -> 0x0873 }
        L_0x02c0:
            r12 = 0
        L_0x02c1:
            int r0 = r13.size()     // Catch:{ all -> 0x0873 }
            if (r12 >= r0) goto L_0x02e2
            java.lang.Object r0 = r13.get(r12)     // Catch:{ all -> 0x0873 }
            int r16 = r11.indexOf(r0)     // Catch:{ all -> 0x0873 }
            r0 = -1
            r15 = r0
            r0 = r16
            if (r0 == r15) goto L_0x02df
            java.lang.Object r0 = r14.get(r12)     // Catch:{ all -> 0x0873 }
            r15 = r0
            r0 = r16
            r11.set(r0, r15)     // Catch:{ all -> 0x0873 }
        L_0x02df:
            int r12 = r12 + 1
            goto L_0x02c1
        L_0x02e2:
            r0 = r33
            X.09r r0 = r0.A0H     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x02ec
            java.util.ArrayList r13 = r0.A0D     // Catch:{ all -> 0x0873 }
            if (r13 != 0) goto L_0x02f1
        L_0x02ec:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0873 }
            r13.<init>()     // Catch:{ all -> 0x0873 }
        L_0x02f1:
            int r15 = r11.size()     // Catch:{ all -> 0x0873 }
            r12 = 0
        L_0x02f6:
            if (r12 >= r15) goto L_0x0306
            java.lang.Object r14 = r11.get(r12)     // Catch:{ all -> 0x0873 }
            java.lang.Object r0 = r13.get(r12)     // Catch:{ all -> 0x0873 }
            r2.put(r14, r0)     // Catch:{ all -> 0x0873 }
            int r12 = r12 + 1
            goto L_0x02f6
        L_0x0306:
            boolean r0 = X.AnonymousClass01z.A0E(r20)     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x035e
            java.lang.String r0 = ">>> entering view names <<<"
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0873 }
            java.util.Iterator r15 = r13.iterator()     // Catch:{ all -> 0x0873 }
        L_0x0315:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0873 }
            java.lang.String r12 = "Name: "
            if (r0 == 0) goto L_0x0336
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x0873 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0873 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0873 }
            r0.<init>()     // Catch:{ all -> 0x0873 }
            r0.append(r12)     // Catch:{ all -> 0x0873 }
            r0.append(r14)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0873 }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0873 }
            goto L_0x0315
        L_0x0336:
            java.lang.String r0 = ">>> exiting view names <<<"
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0873 }
            java.util.Iterator r15 = r11.iterator()     // Catch:{ all -> 0x0873 }
        L_0x033f:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x035e
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x0873 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0873 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0873 }
            r0.<init>()     // Catch:{ all -> 0x0873 }
            r0.append(r12)     // Catch:{ all -> 0x0873 }
            r0.append(r14)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0873 }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0873 }
            goto L_0x033f
        L_0x035e:
            X.008 r14 = new X.008     // Catch:{ all -> 0x0873 }
            r14.<init>()     // Catch:{ all -> 0x0873 }
            r0 = r18
            android.view.View r0 = r0.A0F     // Catch:{ all -> 0x0873 }
            r8.A08(r0, r14)     // Catch:{ all -> 0x0873 }
            r14.A0A(r11)     // Catch:{ all -> 0x0873 }
            java.util.Set r0 = r14.keySet()     // Catch:{ all -> 0x0873 }
            r2.A0A(r0)     // Catch:{ all -> 0x0873 }
            X.008 r12 = new X.008     // Catch:{ all -> 0x0873 }
            r12.<init>()     // Catch:{ all -> 0x0873 }
            r0 = r33
            android.view.View r0 = r0.A0F     // Catch:{ all -> 0x0873 }
            r8.A08(r0, r12)     // Catch:{ all -> 0x0873 }
            r12.A0A(r13)     // Catch:{ all -> 0x0873 }
            java.util.Collection r0 = r2.values()     // Catch:{ all -> 0x0873 }
            r12.A0A(r0)     // Catch:{ all -> 0x0873 }
            X.0YI r0 = X.C06990Vx.A00     // Catch:{ all -> 0x0873 }
            int r15 = r2.size()     // Catch:{ all -> 0x0873 }
        L_0x0390:
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x03a2
            java.lang.Object r0 = r2.A06(r15)     // Catch:{ all -> 0x0873 }
            boolean r0 = r12.containsKey(r0)     // Catch:{ all -> 0x0873 }
            if (r0 != 0) goto L_0x0390
            r2.A05(r15)     // Catch:{ all -> 0x0873 }
            goto L_0x0390
        L_0x03a2:
            java.util.Set r0 = r2.keySet()     // Catch:{ all -> 0x0873 }
            X.AnonymousClass0BV.A01(r14, r0)     // Catch:{ all -> 0x0873 }
            java.util.Collection r0 = r2.values()     // Catch:{ all -> 0x0873 }
            X.AnonymousClass0BV.A01(r12, r0)     // Catch:{ all -> 0x0873 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x03bf
            r26.clear()     // Catch:{ all -> 0x0873 }
            r25.clear()     // Catch:{ all -> 0x0873 }
            r1 = 0
            goto L_0x0277
        L_0x03bf:
            X.0hG r0 = new X.0hG     // Catch:{ all -> 0x0873 }
            r0.<init>(r12, r8, r6, r7)     // Catch:{ all -> 0x0873 }
            X.C09020bh.A00(r3, r0)     // Catch:{ all -> 0x0873 }
            java.util.Collection r15 = r14.values()     // Catch:{ all -> 0x0873 }
            r0 = r26
            r0.addAll(r15)     // Catch:{ all -> 0x0873 }
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x0873 }
            if (r0 != 0) goto L_0x03e4
            r0 = 0
            java.lang.Object r0 = r11.get(r0)     // Catch:{ all -> 0x0873 }
            java.lang.Object r10 = r14.get(r0)     // Catch:{ all -> 0x0873 }
            android.view.View r10 = (android.view.View) r10     // Catch:{ all -> 0x0873 }
            r9.A09(r10, r1)     // Catch:{ all -> 0x0873 }
        L_0x03e4:
            java.util.Collection r11 = r12.values()     // Catch:{ all -> 0x0873 }
            r0 = r25
            r0.addAll(r11)     // Catch:{ all -> 0x0873 }
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x0873 }
            if (r0 != 0) goto L_0x040c
            r0 = 0
            java.lang.Object r0 = r13.get(r0)     // Catch:{ all -> 0x0873 }
            java.lang.Object r12 = r12.get(r0)     // Catch:{ all -> 0x0873 }
            android.view.View r12 = (android.view.View) r12     // Catch:{ all -> 0x0873 }
            if (r12 == 0) goto L_0x040c
            X.0hH r11 = new X.0hH     // Catch:{ all -> 0x0873 }
            r0 = r27
            r11.<init>(r0, r12, r8, r9)     // Catch:{ all -> 0x0873 }
            X.C09020bh.A00(r3, r11)     // Catch:{ all -> 0x0873 }
            r24 = 1
        L_0x040c:
            r11 = r28
            r0 = r26
            r9.A0B(r11, r1, r0)     // Catch:{ all -> 0x0873 }
            r35 = 0
            r37 = r1
            r38 = r35
            r39 = r35
            r33 = r9
            r34 = r1
            r36 = r35
            r40 = r25
            r33.A0E(r34, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0873 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r30)     // Catch:{ all -> 0x0873 }
            r4.put(r7, r0)     // Catch:{ all -> 0x0873 }
            r4.put(r6, r0)     // Catch:{ all -> 0x0873 }
            goto L_0x0277
        L_0x0432:
            java.util.ArrayList r18 = new java.util.ArrayList     // Catch:{ all -> 0x0873 }
            r18.<init>()     // Catch:{ all -> 0x0873 }
            java.util.Iterator r17 = r31.iterator()     // Catch:{ all -> 0x0873 }
            r13 = 0
            r16 = 0
        L_0x043e:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x0508
            java.lang.Object r12 = r17.next()     // Catch:{ all -> 0x0873 }
            X.0Cp r12 = (X.C02970Cp) r12     // Catch:{ all -> 0x0873 }
            boolean r0 = r12.A02()     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x045d
            X.0Bl r11 = r12.A01     // Catch:{ all -> 0x0873 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r32)     // Catch:{ all -> 0x0873 }
            r4.put(r11, r0)     // Catch:{ all -> 0x0873 }
            r12.A01()     // Catch:{ all -> 0x0873 }
            goto L_0x043e
        L_0x045d:
            java.lang.Object r0 = r12.A01     // Catch:{ all -> 0x0873 }
            java.lang.Object r15 = r9.A03(r0)     // Catch:{ all -> 0x0873 }
            X.0Bl r14 = r12.A01     // Catch:{ all -> 0x0873 }
            if (r1 == 0) goto L_0x046d
            if (r14 == r7) goto L_0x046b
            if (r14 != r6) goto L_0x046d
        L_0x046b:
            r11 = 1
            goto L_0x046e
        L_0x046d:
            r11 = 0
        L_0x046e:
            if (r15 != 0) goto L_0x047d
            if (r11 != 0) goto L_0x043e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r32)     // Catch:{ all -> 0x0873 }
            r4.put(r14, r0)     // Catch:{ all -> 0x0873 }
            r12.A01()     // Catch:{ all -> 0x0873 }
            goto L_0x043e
        L_0x047d:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0873 }
            r12.<init>()     // Catch:{ all -> 0x0873 }
            X.02E r0 = r14.A04     // Catch:{ all -> 0x0873 }
            r41 = r0
            android.view.View r0 = r0.A0F     // Catch:{ all -> 0x0873 }
            r8.A07(r0, r12)     // Catch:{ all -> 0x0873 }
            if (r11 == 0) goto L_0x049a
            if (r14 != r7) goto L_0x0495
            r0 = r26
            r12.removeAll(r0)     // Catch:{ all -> 0x0873 }
            goto L_0x049a
        L_0x0495:
            r0 = r25
            r12.removeAll(r0)     // Catch:{ all -> 0x0873 }
        L_0x049a:
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x04b1
            r0 = r28
            r9.A08(r0, r15)     // Catch:{ all -> 0x0873 }
        L_0x04a5:
            java.lang.Integer r11 = r14.A00     // Catch:{ all -> 0x0873 }
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ all -> 0x0873 }
            if (r11 != r0) goto L_0x04f6
            r0 = r18
            r0.addAll(r12)     // Catch:{ all -> 0x0873 }
            goto L_0x04ee
        L_0x04b1:
            r9.A0F(r15, r12)     // Catch:{ all -> 0x0873 }
            r35 = r15
            r37 = r13
            r39 = r13
            r40 = r13
            r33 = r9
            r34 = r15
            r36 = r13
            r38 = r12
            r33.A0E(r34, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0873 }
            java.lang.Integer r0 = r14.A00     // Catch:{ all -> 0x0873 }
            java.lang.Integer r11 = X.C023109s.A0C     // Catch:{ all -> 0x0873 }
            if (r0 != r11) goto L_0x04a5
            r0 = r23
            r0.remove(r14)     // Catch:{ all -> 0x0873 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0873 }
            r11.<init>(r12)     // Catch:{ all -> 0x0873 }
            r0 = r41
            android.view.View r0 = r0.A0F     // Catch:{ all -> 0x0873 }
            r11.remove(r0)     // Catch:{ all -> 0x0873 }
            r0 = r41
            android.view.View r0 = r0.A0F     // Catch:{ all -> 0x0873 }
            r9.A0A(r0, r15, r11)     // Catch:{ all -> 0x0873 }
            X.0gL r0 = new X.0gL     // Catch:{ all -> 0x0873 }
            r0.<init>(r8, r12)     // Catch:{ all -> 0x0873 }
            X.C09020bh.A00(r3, r0)     // Catch:{ all -> 0x0873 }
            goto L_0x04a5
        L_0x04ee:
            if (r24 == 0) goto L_0x04f9
            r0 = r27
            r9.A07(r0, r15)     // Catch:{ all -> 0x0873 }
            goto L_0x04f9
        L_0x04f6:
            r9.A09(r10, r15)     // Catch:{ all -> 0x0873 }
        L_0x04f9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r30)     // Catch:{ all -> 0x0873 }
            r4.put(r14, r0)     // Catch:{ all -> 0x0873 }
            r0 = r16
            java.lang.Object r16 = r9.A06(r0, r15, r13)     // Catch:{ all -> 0x0873 }
            goto L_0x043e
        L_0x0508:
            r0 = r16
            java.lang.Object r10 = r9.A05(r0, r13, r1)     // Catch:{ all -> 0x0873 }
            if (r10 == 0) goto L_0x069d
            java.util.Iterator r16 = r31.iterator()     // Catch:{ all -> 0x0873 }
        L_0x0514:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x0570
            java.lang.Object r14 = r16.next()     // Catch:{ all -> 0x0873 }
            X.0Cp r14 = (X.C02970Cp) r14     // Catch:{ all -> 0x0873 }
            boolean r0 = r14.A02()     // Catch:{ all -> 0x0873 }
            if (r0 != 0) goto L_0x0514
            java.lang.Object r11 = r14.A01     // Catch:{ all -> 0x0873 }
            X.0Bl r15 = r14.A01     // Catch:{ all -> 0x0873 }
            if (r1 == 0) goto L_0x0532
            if (r15 == r7) goto L_0x0530
            if (r15 != r6) goto L_0x0532
        L_0x0530:
            r0 = 1
            goto L_0x0533
        L_0x0532:
            r0 = 0
        L_0x0533:
            if (r11 != 0) goto L_0x0537
            if (r0 == 0) goto L_0x0514
        L_0x0537:
            boolean r0 = X.C011304x.A03(r3)     // Catch:{ all -> 0x0873 }
            if (r0 != 0) goto L_0x0563
            boolean r0 = X.AnonymousClass01z.A0E(r20)     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x055f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0873 }
            r11.<init>()     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = "SpecialEffectsController: Container "
            r11.append(r0)     // Catch:{ all -> 0x0873 }
            r11.append(r3)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = " has not been laid out. Completing operation "
            r11.append(r0)     // Catch:{ all -> 0x0873 }
            r11.append(r15)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x0873 }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0873 }
        L_0x055f:
            r14.A01()     // Catch:{ all -> 0x0873 }
            goto L_0x0514
        L_0x0563:
            X.02E r12 = r15.A04     // Catch:{ all -> 0x0873 }
            X.0Bk r11 = r14.A00     // Catch:{ all -> 0x0873 }
            X.0h2 r0 = new X.0h2     // Catch:{ all -> 0x0873 }
            r0.<init>(r14, r8, r15)     // Catch:{ all -> 0x0873 }
            r9.A0D(r11, r12, r10, r0)     // Catch:{ all -> 0x0873 }
            goto L_0x0514
        L_0x0570:
            boolean r0 = X.C011304x.A03(r3)     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x069d
            r12 = 4
            X.0YI r0 = X.C06990Vx.A00     // Catch:{ all -> 0x0873 }
            int r11 = r18.size()     // Catch:{ all -> 0x0873 }
        L_0x057d:
            int r11 = r11 + -1
            if (r11 < 0) goto L_0x058b
            r0 = r18
            android.view.View r0 = X.AnonymousClass000.A0Z(r0, r11)     // Catch:{ all -> 0x0873 }
            r0.setVisibility(r12)     // Catch:{ all -> 0x0873 }
            goto L_0x057d
        L_0x058b:
            java.util.ArrayList r17 = new java.util.ArrayList     // Catch:{ all -> 0x0873 }
            r17.<init>()     // Catch:{ all -> 0x0873 }
            int r14 = r25.size()     // Catch:{ all -> 0x0873 }
            r12 = 0
        L_0x0595:
            if (r12 >= r14) goto L_0x05ae
            r0 = r25
            java.lang.Object r15 = r0.get(r12)     // Catch:{ all -> 0x0873 }
            android.view.View r15 = (android.view.View) r15     // Catch:{ all -> 0x0873 }
            java.lang.String r11 = X.C011004s.A03(r15)     // Catch:{ all -> 0x0873 }
            r0 = r17
            r0.add(r11)     // Catch:{ all -> 0x0873 }
            X.C011004s.A08(r15, r13)     // Catch:{ all -> 0x0873 }
            int r12 = r12 + 1
            goto L_0x0595
        L_0x05ae:
            boolean r0 = X.AnonymousClass01z.A0E(r20)     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x0621
            java.lang.String r0 = ">>>>> Beginning transition <<<<<"
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = ">>>>> SharedElementFirstOutViews <<<<<"
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0873 }
            java.util.Iterator r15 = r26.iterator()     // Catch:{ all -> 0x0873 }
        L_0x05c2:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0873 }
            java.lang.String r14 = " Name: "
            java.lang.String r12 = "View: "
            if (r0 == 0) goto L_0x05ef
            java.lang.Object r0 = r15.next()     // Catch:{ all -> 0x0873 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x0873 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0873 }
            r11.<init>()     // Catch:{ all -> 0x0873 }
            r11.append(r12)     // Catch:{ all -> 0x0873 }
            r11.append(r0)     // Catch:{ all -> 0x0873 }
            r11.append(r14)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = X.C011004s.A03(r0)     // Catch:{ all -> 0x0873 }
            r11.append(r0)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x0873 }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0873 }
            goto L_0x05c2
        L_0x05ef:
            java.lang.String r0 = ">>>>> SharedElementLastInViews <<<<<"
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0873 }
            java.util.Iterator r15 = r25.iterator()     // Catch:{ all -> 0x0873 }
        L_0x05f8:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x0621
            java.lang.Object r0 = r15.next()     // Catch:{ all -> 0x0873 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x0873 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0873 }
            r11.<init>()     // Catch:{ all -> 0x0873 }
            r11.append(r12)     // Catch:{ all -> 0x0873 }
            r11.append(r0)     // Catch:{ all -> 0x0873 }
            r11.append(r14)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = X.C011004s.A03(r0)     // Catch:{ all -> 0x0873 }
            r11.append(r0)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x0873 }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0873 }
            goto L_0x05f8
        L_0x0621:
            r9.A0C(r3, r10)     // Catch:{ all -> 0x0873 }
            int r14 = r25.size()     // Catch:{ all -> 0x0873 }
            java.util.ArrayList r16 = new java.util.ArrayList     // Catch:{ all -> 0x0873 }
            r16.<init>()     // Catch:{ all -> 0x0873 }
            r12 = 0
        L_0x062e:
            if (r12 >= r14) goto L_0x066d
            r0 = r26
            java.lang.Object r10 = r0.get(r12)     // Catch:{ all -> 0x0873 }
            android.view.View r10 = (android.view.View) r10     // Catch:{ all -> 0x0873 }
            java.lang.String r11 = X.C011004s.A03(r10)     // Catch:{ all -> 0x0873 }
            r0 = r16
            r0.add(r11)     // Catch:{ all -> 0x0873 }
            if (r11 == 0) goto L_0x066a
            X.C011004s.A08(r10, r13)     // Catch:{ all -> 0x0873 }
            java.lang.Object r15 = r2.get(r11)     // Catch:{ all -> 0x0873 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0873 }
            r10 = 0
        L_0x064d:
            if (r10 >= r14) goto L_0x066a
            r0 = r17
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x0873 }
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x0667
            r0 = r25
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x0873 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x0873 }
            X.C011004s.A08(r0, r11)     // Catch:{ all -> 0x0873 }
            goto L_0x066a
        L_0x0667:
            int r10 = r10 + 1
            goto L_0x064d
        L_0x066a:
            int r12 = r12 + 1
            goto L_0x062e
        L_0x066d:
            X.0hN r0 = new X.0hN     // Catch:{ all -> 0x0873 }
            r31 = r0
            r32 = r9
            r33 = r25
            r34 = r17
            r35 = r26
            r36 = r16
            r37 = r14
            r31.<init>(r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x0873 }
            X.C09020bh.A00(r3, r0)     // Catch:{ all -> 0x0873 }
            int r3 = r18.size()     // Catch:{ all -> 0x0873 }
        L_0x0687:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0696
            r0 = r18
            android.view.View r2 = X.AnonymousClass000.A0Z(r0, r3)     // Catch:{ all -> 0x0873 }
            r0 = 0
            r2.setVisibility(r0)     // Catch:{ all -> 0x0873 }
            goto L_0x0687
        L_0x0696:
            r2 = r26
            r0 = r25
            r9.A0G(r1, r2, r0)     // Catch:{ all -> 0x0873 }
        L_0x069d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r30)     // Catch:{ all -> 0x0873 }
            boolean r17 = r4.containsValue(r0)     // Catch:{ all -> 0x0873 }
            android.view.ViewGroup r9 = r8.A02     // Catch:{ all -> 0x0873 }
            android.content.Context r3 = r9.getContext()     // Catch:{ all -> 0x0873 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0873 }
            r12.<init>()     // Catch:{ all -> 0x0873 }
            java.util.Iterator r16 = r29.iterator()     // Catch:{ all -> 0x0873 }
            r15 = 0
        L_0x06b5:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0873 }
            java.lang.String r2 = " has started."
            if (r0 == 0) goto L_0x0762
            java.lang.Object r1 = r16.next()     // Catch:{ all -> 0x0873 }
            X.0Co r1 = (X.C02960Co) r1     // Catch:{ all -> 0x0873 }
            boolean r0 = r1.A02()     // Catch:{ all -> 0x0873 }
            if (r0 != 0) goto L_0x0706
            X.0WQ r0 = r1.A03(r3)     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x0706
            android.animation.Animator r11 = r0.A00     // Catch:{ all -> 0x0873 }
            if (r11 != 0) goto L_0x06d7
            r12.add(r1)     // Catch:{ all -> 0x0873 }
            goto L_0x06b5
        L_0x06d7:
            X.0Bl r10 = r1.A01     // Catch:{ all -> 0x0873 }
            X.02E r13 = r10.A04     // Catch:{ all -> 0x0873 }
            java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0873 }
            java.lang.Object r0 = r4.get(r10)     // Catch:{ all -> 0x0873 }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x070a
            boolean r0 = X.AnonymousClass01z.A0E(r20)     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x0706
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0873 }
            r2.<init>()     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = "Ignoring Animator set on "
            r2.append(r0)     // Catch:{ all -> 0x0873 }
            r2.append(r13)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = " as this Fragment was involved in a Transition."
            r2.append(r0)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0873 }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0873 }
        L_0x0706:
            r1.A01()     // Catch:{ all -> 0x0873 }
            goto L_0x06b5
        L_0x070a:
            java.lang.Integer r14 = r10.A00     // Catch:{ all -> 0x0873 }
            java.lang.Integer r0 = X.C023109s.A0C     // Catch:{ all -> 0x0873 }
            r30 = 0
            if (r14 != r0) goto L_0x0719
            r30 = 1
            r0 = r23
            r0.remove(r10)     // Catch:{ all -> 0x0873 }
        L_0x0719:
            android.view.View r13 = r13.A0F     // Catch:{ all -> 0x0873 }
            r9.startViewTransition(r13)     // Catch:{ all -> 0x0873 }
            X.0DH r0 = new X.0DH     // Catch:{ all -> 0x0873 }
            r24 = r0
            r25 = r13
            r26 = r9
            r27 = r1
            r28 = r8
            r29 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0873 }
            r11.addListener(r0)     // Catch:{ all -> 0x0873 }
            r11.setTarget(r13)     // Catch:{ all -> 0x0873 }
            r11.start()     // Catch:{ all -> 0x0873 }
            boolean r0 = X.AnonymousClass01z.A0E(r20)     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x0755
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0873 }
            r13.<init>()     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = "Animator from operation "
            r13.append(r0)     // Catch:{ all -> 0x0873 }
            r13.append(r10)     // Catch:{ all -> 0x0873 }
            r13.append(r2)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x0873 }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0873 }
        L_0x0755:
            X.0Bk r1 = r1.A00     // Catch:{ all -> 0x0873 }
            X.0ch r0 = new X.0ch     // Catch:{ all -> 0x0873 }
            r0.<init>(r11, r8, r10)     // Catch:{ all -> 0x0873 }
            r1.A05(r0)     // Catch:{ all -> 0x0873 }
            r15 = 1
            goto L_0x06b5
        L_0x0762:
            java.util.Iterator r13 = r12.iterator()     // Catch:{ all -> 0x0873 }
        L_0x0766:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x0822
            java.lang.Object r11 = r13.next()     // Catch:{ all -> 0x0873 }
            X.0Co r11 = (X.C02960Co) r11     // Catch:{ all -> 0x0873 }
            X.0Bl r10 = r11.A01     // Catch:{ all -> 0x0873 }
            X.02E r12 = r10.A04     // Catch:{ all -> 0x0873 }
            java.lang.String r4 = "Ignoring Animation set on "
            if (r17 == 0) goto L_0x079b
            boolean r0 = X.AnonymousClass01z.A0E(r20)     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x0797
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0873 }
            r1.<init>()     // Catch:{ all -> 0x0873 }
            r1.append(r4)     // Catch:{ all -> 0x0873 }
            r1.append(r12)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = " as Animations cannot run alongside Transitions."
        L_0x078d:
            r1.append(r0)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0873 }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0873 }
        L_0x0797:
            r11.A01()     // Catch:{ all -> 0x0873 }
            goto L_0x0766
        L_0x079b:
            if (r15 == 0) goto L_0x07b1
            boolean r0 = X.AnonymousClass01z.A0E(r20)     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x0797
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0873 }
            r1.<init>()     // Catch:{ all -> 0x0873 }
            r1.append(r4)     // Catch:{ all -> 0x0873 }
            r1.append(r12)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = " as Animations cannot run alongside Animators."
            goto L_0x078d
        L_0x07b1:
            android.view.View r4 = r12.A0F     // Catch:{ all -> 0x0873 }
            X.0WQ r0 = r11.A03(r3)     // Catch:{ all -> 0x0873 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0873 }
            android.view.animation.Animation r12 = r0.A01     // Catch:{ all -> 0x0873 }
            java.util.Objects.requireNonNull(r12)     // Catch:{ all -> 0x0873 }
            java.lang.Integer r1 = r10.A00     // Catch:{ all -> 0x0873 }
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ all -> 0x0873 }
            if (r1 == r0) goto L_0x07e2
            r4.startAnimation(r12)     // Catch:{ all -> 0x0873 }
            r11.A01()     // Catch:{ all -> 0x0873 }
        L_0x07cb:
            X.0Bk r1 = r11.A00     // Catch:{ all -> 0x0873 }
            X.0ci r0 = new X.0ci     // Catch:{ all -> 0x0873 }
            r24 = r0
            r25 = r4
            r26 = r9
            r27 = r11
            r28 = r8
            r29 = r10
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0873 }
            r1.A05(r0)     // Catch:{ all -> 0x0873 }
            goto L_0x081f
        L_0x07e2:
            r9.startViewTransition(r4)     // Catch:{ all -> 0x0873 }
            X.0EX r1 = new X.0EX     // Catch:{ all -> 0x0873 }
            r1.<init>(r4, r9, r12)     // Catch:{ all -> 0x0873 }
            X.0c2 r0 = new X.0c2     // Catch:{ all -> 0x0873 }
            r24 = r0
            r25 = r4
            r26 = r9
            r27 = r11
            r28 = r8
            r29 = r10
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0873 }
            r1.setAnimationListener(r0)     // Catch:{ all -> 0x0873 }
            r4.startAnimation(r1)     // Catch:{ all -> 0x0873 }
            boolean r0 = X.AnonymousClass01z.A0E(r20)     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x07cb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0873 }
            r1.<init>()     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = "Animation from operation "
            r1.append(r0)     // Catch:{ all -> 0x0873 }
            r1.append(r10)     // Catch:{ all -> 0x0873 }
            r1.append(r2)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0873 }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0873 }
            goto L_0x07cb
        L_0x081f:
            r15 = 0
            goto L_0x0766
        L_0x0822:
            java.util.Iterator r3 = r23.iterator()     // Catch:{ all -> 0x0873 }
        L_0x0826:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x083c
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0873 }
            X.0Bl r2 = (X.AnonymousClass0Bl) r2     // Catch:{ all -> 0x0873 }
            X.02E r0 = r2.A04     // Catch:{ all -> 0x0873 }
            android.view.View r1 = r0.A0F     // Catch:{ all -> 0x0873 }
            java.lang.Integer r0 = r2.A00     // Catch:{ all -> 0x0873 }
            X.C02670Bj.A02(r1, r0)     // Catch:{ all -> 0x0873 }
            goto L_0x0826
        L_0x083c:
            r23.clear()     // Catch:{ all -> 0x0873 }
            boolean r0 = X.AnonymousClass01z.A0E(r20)     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x0861
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0873 }
            r1.<init>()     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = "Completed executing operations from "
            r1.append(r0)     // Catch:{ all -> 0x0873 }
            r1.append(r7)     // Catch:{ all -> 0x0873 }
            r0 = r22
            r1.append(r0)     // Catch:{ all -> 0x0873 }
            r1.append(r6)     // Catch:{ all -> 0x0873 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0873 }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0873 }
        L_0x0861:
            r1 = 0
            r0 = r21
            r0.A01 = r1     // Catch:{ all -> 0x0873 }
            boolean r0 = X.AnonymousClass01z.A0E(r20)     // Catch:{ all -> 0x0873 }
            if (r0 == 0) goto L_0x0871
            java.lang.String r0 = "SpecialEffectsController: Finished executing pending operations"
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0873 }
        L_0x0871:
            monitor-exit(r19)     // Catch:{ all -> 0x0873 }
            return
        L_0x0873:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x0873 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BU.A04():void");
    }
}
