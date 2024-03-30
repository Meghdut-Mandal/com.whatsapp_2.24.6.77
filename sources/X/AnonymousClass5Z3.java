package X;

import java.util.HashSet;

/* renamed from: X.5Z3  reason: invalid class name */
public class AnonymousClass5Z3 extends HashSet {
    public final int A00;

    public AnonymousClass5Z3(String str) {
        C188598zq r0;
        this.A00 = 0;
        if (str.equals("Facebook")) {
            r0 = C188598zq.A01;
        } else if (str.equals("Instagram")) {
            r0 = C188598zq.A04;
        } else {
            return;
        }
        add(r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r2 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ boolean contains(java.lang.Object r2) {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x0011;
                case 2: goto L_0x0011;
                case 3: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.contains(r2)
            return r0
        L_0x000a:
            if (r2 != 0) goto L_0x0011
        L_0x000c:
            boolean r0 = super.contains(r2)
            return r0
        L_0x0011:
            boolean r0 = r2 instanceof X.C188598zq
            if (r0 != 0) goto L_0x000c
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Z3.contains(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r2 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ boolean remove(java.lang.Object r2) {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x0011;
                case 2: goto L_0x0011;
                case 3: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.remove(r2)
            return r0
        L_0x000a:
            if (r2 != 0) goto L_0x0011
        L_0x000c:
            boolean r0 = super.remove(r2)
            return r0
        L_0x0011:
            boolean r0 = r2 instanceof X.C188598zq
            if (r0 != 0) goto L_0x000c
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Z3.remove(java.lang.Object):boolean");
    }

    public final /* bridge */ int size() {
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
                return super.size();
            default:
                return super.size();
        }
    }

    public AnonymousClass5Z3(int i) {
        Object obj;
        this.A00 = i;
        switch (i) {
            case 1:
            case 3:
                add(C188598zq.A01);
                obj = C188598zq.A02;
                break;
            default:
                obj = "com.whatsapp.w4b";
                break;
        }
        add(obj);
    }

    public AnonymousClass5Z3(AnonymousClass6OK r2) {
        this.A00 = 2;
        if (r2.A02(5987)) {
            add(C188598zq.A04);
        }
    }
}
