package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1A5  reason: invalid class name */
public class AnonymousClass1A5 implements AnonymousClass00M {
    public List A00;
    public Map A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass17X A03;
    public final C20510xg A04;
    public final C19770wU A05;
    public final Object A06 = new Object();
    public final AnonymousClass171 A07;
    public final AnonymousClass1A6 A08;

    public static boolean A00(AnonymousClass11F r2, List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((AnonymousClass4Q7) it.next()).B7L(r2)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass141 A01(AnonymousClass11F r5) {
        AnonymousClass141 A0D = this.A02.A0D(r5);
        AnonymousClass171 r2 = this.A07;
        AnonymousClass11F r1 = A0D.A0H;
        if (AnonymousClass143.A0G(r1) && !(r1 instanceof AnonymousClass146) && (r2.A0g(A0D, -1) || TextUtils.isEmpty(A0D.A0V))) {
            this.A05.Boy(new C35631j0(this, A0D, r5, 6));
        }
        return A0D;
    }

    public ArrayList A02(int i) {
        ArrayList A042 = this.A08.A04();
        ArrayList arrayList = new ArrayList(Math.min(A042.size(), i));
        for (int i2 = 0; i2 < A042.size() && arrayList.size() < i; i2++) {
            A042.get(i2);
            AnonymousClass141 A012 = A01((AnonymousClass11F) A042.get(i2));
            if (!TextUtils.isEmpty(A012.A0J())) {
                arrayList.add(A012);
            }
        }
        return arrayList;
    }

    public List A03() {
        List list;
        synchronized (this.A06) {
            if (this.A00 == null) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.A00 = copyOnWriteArrayList;
                this.A02.A0n(copyOnWriteArrayList);
            }
            list = this.A00;
        }
        return list;
    }

    public Map A04() {
        Map map;
        AnonymousClass11F r1;
        synchronized (this.A06) {
            if (this.A01 == null) {
                List<AnonymousClass141> A032 = A03();
                this.A01 = new HashMap(A032.size(), 1.0f);
                for (AnonymousClass141 r7 : A032) {
                    Class<AnonymousClass11F> cls = AnonymousClass11F.class;
                    AnonymousClass141 r0 = (AnonymousClass141) this.A01.get(r7.A06(cls));
                    if ((r0 == null || r0.A0I() > r7.A0I()) && (r1 = (AnonymousClass11F) r7.A06(cls)) != null) {
                        this.A01.put(r1, r7);
                    }
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.A08.A04().iterator();
                while (it.hasNext()) {
                    AnonymousClass11F r2 = (AnonymousClass11F) it.next();
                    if (this.A01.get(r2) == null) {
                        AnonymousClass141 A012 = A01(r2);
                        arrayList.add(A012);
                        this.A01.put(r2, A012);
                    }
                }
                List list = this.A00;
                C18740tg.A06(list);
                list.addAll(arrayList);
            }
            map = this.A01;
        }
        return map;
    }

    public AnonymousClass1A5(AnonymousClass16D r2, AnonymousClass171 r3, AnonymousClass1A6 r4, AnonymousClass17X r5, C20510xg r6, C19770wU r7) {
        this.A05 = r7;
        this.A02 = r2;
        this.A07 = r3;
        this.A08 = r4;
        this.A04 = r6;
        this.A03 = r5;
    }
}
