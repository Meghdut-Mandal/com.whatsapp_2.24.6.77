package X;

/* renamed from: X.7rW  reason: invalid class name and case insensitive filesystem */
public class C164257rW implements AnonymousClass05G {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C164257rW(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = str;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0109, code lost:
        if (X.AnonymousClass00C.A0J(r12, r11.A02) != false) goto L_0x010b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object B6N(java.lang.Object r12, X.C023509x r13) {
        /*
            r11 = this;
            int r0 = r11.A03
            if (r0 == 0) goto L_0x002c
            boolean r0 = r13 instanceof X.AnonymousClass7AE
            if (r0 == 0) goto L_0x0026
            r5 = r13
            X.7AE r5 = (X.AnonymousClass7AE) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r5.label = r2
        L_0x0016:
            java.lang.Object r1 = r5.result
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L_0x00ed
            if (r0 == r4) goto L_0x0119
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0026:
            X.7AE r5 = new X.7AE
            r5.<init>(r11, r13)
            goto L_0x0016
        L_0x002c:
            boolean r0 = r13 instanceof X.AnonymousClass7AB
            if (r0 == 0) goto L_0x004e
            r6 = r13
            X.7AB r6 = (X.AnonymousClass7AB) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004e
            int r2 = r2 - r1
            r6.label = r2
        L_0x003e:
            java.lang.Object r1 = r6.result
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r7 = 1
            if (r0 == 0) goto L_0x0054
            if (r0 == r7) goto L_0x0119
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x004e:
            X.7AB r6 = new X.7AB
            r6.<init>(r11, r13)
            goto L_0x003e
        L_0x0054:
            X.AnonymousClass0AN.A00(r1)
            java.lang.Object r5 = r11.A00
            X.05G r5 = (X.AnonymousClass05G) r5
            X.61F r12 = (X.AnonymousClass61F) r12
            boolean r0 = r12 instanceof X.AnonymousClass5IJ
            if (r0 == 0) goto L_0x0074
            X.5IJ r12 = (X.AnonymousClass5IJ) r12
            java.lang.Throwable r1 = r12.A01
            java.lang.String r0 = "Avatar sticker search error"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x006a:
            X.09w r8 = X.C023409w.A00
        L_0x006c:
            r6.label = r7
            java.lang.Object r0 = r5.B6N(r8, r6)
            goto L_0x0116
        L_0x0074:
            boolean r0 = r12 instanceof X.AnonymousClass5II
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = "Avatar sticker search not available"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x006a
        L_0x007e:
            boolean r0 = r12 instanceof X.AnonymousClass5IK
            if (r0 == 0) goto L_0x0124
            X.5IK r12 = (X.AnonymousClass5IK) r12
            java.util.List r1 = r12.A01
            java.lang.String r0 = r11.A02
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x006a
            boolean r0 = X.C36401kF.A1a(r1)
            if (r0 == 0) goto L_0x006a
            X.561 r4 = new X.561
            r4.<init>()
            java.util.ArrayList r8 = X.C36321k7.A0J(r1)
            java.util.Iterator r10 = r1.iterator()
        L_0x00a1:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r9 = r10.next()
            X.5cC r9 = (X.C111385cC) r9
            boolean r0 = r9 instanceof X.AnonymousClass5IL
            java.lang.String r1 = "sticker-"
            if (r0 == 0) goto L_0x00c8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r1)
            X.5IL r9 = (X.AnonymousClass5IL) r9
            java.lang.String r0 = r9.A00
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            X.55t r2 = new X.55t
            r2.<init>(r4, r0)
        L_0x00c4:
            r8.add(r2)
            goto L_0x00a1
        L_0x00c8:
            boolean r0 = r9 instanceof X.AnonymousClass5IM
            if (r0 == 0) goto L_0x00e0
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r1)
            X.5IM r9 = (X.AnonymousClass5IM) r9
            X.6c4 r1 = r9.A00
        L_0x00d4:
            java.lang.String r0 = r1.A06
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
            X.55v r2 = new X.55v
            r2.<init>(r4, r1, r0)
            goto L_0x00c4
        L_0x00e0:
            boolean r0 = r9 instanceof X.AnonymousClass5IN
            if (r0 == 0) goto L_0x011f
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r1)
            X.5IN r9 = (X.AnonymousClass5IN) r9
            X.6c4 r1 = r9.A00
            goto L_0x00d4
        L_0x00ed:
            X.AnonymousClass0AN.A00(r1)
            java.lang.Object r2 = r11.A01
            X.05G r2 = (X.AnonymousClass05G) r2
            java.lang.Object r0 = r11.A00
            X.5cF r0 = (X.C111415cF) r0
            X.5Ih r0 = (X.C106085Ih) r0
            java.lang.String r0 = r0.A00
            boolean r0 = X.AnonymousClass00C.A0J(r0, r12)
            if (r0 != 0) goto L_0x010b
            java.lang.String r0 = r11.A02
            boolean r1 = X.AnonymousClass00C.A0J(r12, r0)
            r0 = 0
            if (r1 == 0) goto L_0x010c
        L_0x010b:
            r0 = 1
        L_0x010c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.label = r4
            java.lang.Object r0 = r2.B6N(r0, r5)
        L_0x0116:
            if (r0 != r3) goto L_0x011c
            return r3
        L_0x0119:
            X.AnonymousClass0AN.A00(r1)
        L_0x011c:
            X.0AJ r3 = X.AnonymousClass0AJ.A00
            return r3
        L_0x011f:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x0124:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164257rW.B6N(java.lang.Object, X.09x):java.lang.Object");
    }
}
