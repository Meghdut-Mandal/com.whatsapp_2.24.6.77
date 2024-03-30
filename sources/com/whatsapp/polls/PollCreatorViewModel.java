package com.whatsapp.polls;

import X.AnonymousClass001;
import X.AnonymousClass04R;
import X.AnonymousClass1X4;
import X.AnonymousClass5HE;
import X.AnonymousClass5HF;
import X.AnonymousClass5HG;
import X.C001700s;
import X.C19970wo;
import X.C20810yC;
import X.C28201Rs;
import X.C36431kI;
import X.C36441kJ;
import X.C65493Sh;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PollCreatorViewModel extends AnonymousClass04R {
    public int A00 = -1;
    public int A01;
    public final C001700s A02 = C36431kI.A0S();
    public final C001700s A03 = C36431kI.A0S();
    public final AnonymousClass1X4 A04;
    public final C19970wo A05;
    public final C20810yC A06;
    public final AnonymousClass5HG A07 = new AnonymousClass5HG();
    public final C65493Sh A08;
    public final C28201Rs A09 = C36441kJ.A0t();
    public final C28201Rs A0A = C36441kJ.A0t();
    public final C28201Rs A0B = C36441kJ.A0t();
    public final List A0C = AnonymousClass001.A0I();
    public final List A0D = AnonymousClass001.A0I();
    public final AnonymousClass5HE A0E = new AnonymousClass5HE();

    public boolean A0S(int i) {
        int i2;
        List list = this.A0D;
        int size = list.size();
        if (size <= 0 || i != size - 1 || size != this.A06.A07(1408) || !((AnonymousClass5HF) list.get(i2)).A00.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean A0T(String str, int i) {
        List list = this.A0D;
        AnonymousClass5HF r1 = (AnonymousClass5HF) list.get(i);
        if (TextUtils.equals(r1.A00, str)) {
            return false;
        }
        r1.A00 = str;
        if (list.size() < this.A06.A07(1408)) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((AnonymousClass5HF) it.next()).A00.isEmpty()) {
                        break;
                    }
                } else {
                    int i2 = this.A01;
                    this.A01 = i2 + 1;
                    list.add(new AnonymousClass5HF(i2));
                    break;
                }
            }
        }
        A01(this);
        return true;
    }

    public PollCreatorViewModel(AnonymousClass1X4 r4, C19970wo r5, C20810yC r6, C65493Sh r7) {
        this.A05 = r5;
        this.A06 = r6;
        this.A04 = r4;
        this.A08 = r7;
        List list = this.A0D;
        list.add(new AnonymousClass5HF(0));
        list.add(new AnonymousClass5HF(1));
        this.A01 = 2;
        A01(this);
    }

    public static void A01(PollCreatorViewModel pollCreatorViewModel) {
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.add(pollCreatorViewModel.A07);
        A0I.add(pollCreatorViewModel.A0E);
        A0I.addAll(pollCreatorViewModel.A0D);
        pollCreatorViewModel.A03.A0D(A0I);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (r8 == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0U(boolean r8) {
        /*
            r7 = this;
            java.util.HashSet r3 = X.C36441kJ.A16()
            java.util.List r5 = r7.A0C
            r5.clear()
            r6 = 0
            r2 = 0
            r4 = 0
        L_0x000c:
            java.util.List r1 = r7.A0D
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0038
            java.lang.Object r0 = r1.get(r2)
            X.5HF r0 = (X.AnonymousClass5HF) r0
            java.lang.String r0 = r0.A00
            java.lang.String r1 = r0.trim()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0031
            int r4 = r4 + 1
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto L_0x0034
            r3.add(r1)
        L_0x0031:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0034:
            X.C90504aG.A10(r2, r5)
            goto L_0x0031
        L_0x0038:
            X.1Rs r3 = r7.A09
            java.util.ArrayList r2 = X.C36441kJ.A15(r5)
            boolean r0 = r5.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x0048
            r0 = 1
            if (r8 != 0) goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            android.util.Pair r0 = X.C36441kJ.A0Q(r2, r0)
            r3.A0C(r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x005d
            if (r4 <= r1) goto L_0x005d
            r6 = 1
        L_0x005d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.polls.PollCreatorViewModel.A0U(boolean):boolean");
    }
}
