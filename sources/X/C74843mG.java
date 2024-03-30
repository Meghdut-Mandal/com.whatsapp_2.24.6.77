package X;

import android.database.ContentObserver;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3mG  reason: invalid class name and case insensitive filesystem */
public final class C74843mG implements C88924Uo {
    public final int A00;
    public final C88924Uo A01;
    public final HashMap A02;
    public final List A03;
    public final boolean A04;
    public final /* synthetic */ C74873mJ A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (r5.isEmpty() == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C74843mG(X.C74873mJ r3, X.C88924Uo r4, java.util.List r5) {
        /*
            r2 = this;
            r0 = 2
            X.AnonymousClass00C.A0D(r4, r0)
            r2.A05 = r3
            r2.<init>()
            r2.A01 = r4
            r2.A03 = r5
            java.util.HashMap r0 = r4.B90()
            r2.A02 = r0
            int r1 = r4.getCount()
            int r0 = r5.size()
            int r1 = r1 + r0
            r2.A00 = r1
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x002b
            boolean r1 = r5.isEmpty()
            r0 = 1
            if (r1 != 0) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            r2.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74843mG.<init>(X.3mJ, X.4Uo, java.util.List):void");
    }

    public AnonymousClass4V2 BDy(int i) {
        List list = this.A03;
        if (i < list.size()) {
            return (AnonymousClass4V2) list.get(i);
        }
        return this.A01.BDy(i - list.size());
    }

    public AnonymousClass4V2 BmQ(int i) {
        List list = this.A03;
        if (i >= list.size()) {
            return this.A01.BmQ(i - list.size());
        }
        return (AnonymousClass4V2) list.get(i);
    }

    public void BoI() {
        this.A01.BoI();
    }

    public void close() {
        this.A01.close();
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        this.A01.registerContentObserver(contentObserver);
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        this.A01.unregisterContentObserver(contentObserver);
    }

    public HashMap B90() {
        return this.A02;
    }

    public int getCount() {
        return this.A00;
    }

    public boolean isEmpty() {
        return this.A04;
    }
}
