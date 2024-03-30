package X;

import android.database.Cursor;

/* renamed from: X.2bs  reason: invalid class name and case insensitive filesystem */
public class C46912bs extends AnonymousClass2bL implements AnonymousClass4RU, AnonymousClass4RV {
    public String A00;
    public String A01;
    public String A02;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.2bs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.2bs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: X.2cB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.2bs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.2bs} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ X.AnonymousClass3T1 B31(X.C64933Qa r13, long r14) {
        /*
            r12 = this;
            r2 = r12
            boolean r0 = r12 instanceof X.AnonymousClass2cA
            r1 = r13
            r4 = r14
            if (r0 == 0) goto L_0x000f
            r6 = 0
        L_0x0008:
            r3 = 5
        L_0x0009:
            X.2bs r0 = new X.2bs
            r0.<init>(r1, r2, r3, r4, r6)
            return r0
        L_0x000f:
            boolean r0 = r12 instanceof X.AnonymousClass2cB
            if (r0 == 0) goto L_0x002a
            X.2cB r2 = (X.AnonymousClass2cB) r2
            r6 = 0
            X.AnonymousClass00C.A0D(r13, r6)
            boolean r0 = X.C203369nr.A07(r2)
            if (r0 != 0) goto L_0x0008
            X.2cB r0 = new X.2cB
            r11 = 0
            r6 = r0
            r7 = r13
            r8 = r2
            r9 = r14
            r6.<init>(r7, r8, r9, r11)
            return r0
        L_0x002a:
            r6 = 0
            int r3 = r12.A1I
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46912bs.B31(X.3Qa, long):X.3T1");
    }

    public /* bridge */ /* synthetic */ AnonymousClass3T1 B32(C64933Qa r10) {
        C64933Qa r3 = r10;
        if (this instanceof AnonymousClass2cB) {
            AnonymousClass2cB r4 = (AnonymousClass2cB) this;
            AnonymousClass00C.A0D(r10, 0);
            return new AnonymousClass2cB(r3, r4, r4.A0I, true);
        } else if (this instanceof AnonymousClass2cA) {
            AnonymousClass2cA r42 = (AnonymousClass2cA) this;
            return new AnonymousClass2cA(r10, r42, r42.A0I);
        } else {
            return new C46912bs(r3, this, this.A1I, this.A0I, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r1.startsWith(r2) != false) goto L_0x001d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A1Z() {
        /*
            r4 = this;
            java.lang.String r2 = r4.A01
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r4.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x005c
            if (r1 == 0) goto L_0x004e
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x001d
            X.C18740tg.A06(r2)
            boolean r0 = r1.startsWith(r2)
            if (r0 == 0) goto L_0x004e
        L_0x001d:
            java.lang.String r3 = r4.A00
        L_0x001f:
            X.C18740tg.A06(r3)
        L_0x0022:
            r1 = 300(0x12c, float:4.2E-43)
            int r0 = r3.length()
            if (r0 <= r1) goto L_0x002f
            r0 = 0
            java.lang.String r3 = r3.substring(r0, r1)
        L_0x002f:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "https://maps.google.com/maps?q="
            r2.append(r0)
            java.lang.String r1 = "\\s+"
            java.lang.String r0 = "+"
            java.lang.String r0 = r3.replaceAll(r1, r0)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r2.append(r0)
            java.lang.String r0 = "&sll="
            java.lang.String r0 = X.AnonymousClass2bL.A00(r4, r0, r2)
            return r0
        L_0x004e:
            java.lang.String r0 = r4.A1a()
            if (r0 == 0) goto L_0x0059
            java.lang.String r3 = r4.A1a()
            goto L_0x001f
        L_0x0059:
            java.lang.String r3 = ""
            goto L_0x0022
        L_0x005c:
            java.lang.String r0 = r4.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46912bs.A1Z():java.lang.String");
    }

    public String A1a() {
        String str = this.A01;
        String str2 = this.A00;
        if (str2 != null) {
            return AnonymousClass000.A0p("\n", str2, AnonymousClass000.A0v(str));
        }
        return str;
    }

    public void A1X(Cursor cursor) {
        super.A1X(cursor);
        this.A01 = C36341k9.A0f(cursor, "place_name");
        this.A00 = C36341k9.A0f(cursor, "place_address");
        this.A02 = C36341k9.A0f(cursor, "url");
    }

    public void A1Y(Cursor cursor, C19730wQ r3) {
        super.A1Y(cursor, r3);
        this.A01 = C36341k9.A0f(cursor, "place_name");
        this.A00 = C36341k9.A0f(cursor, "place_address");
        this.A02 = C36341k9.A0f(cursor, "url");
    }

    public C46912bs(C64933Qa r1, int i, long j) {
        super(r1, i, j);
    }

    public C46912bs(C64933Qa r2, C46912bs r3, int i, long j, boolean z) {
        super(r2, r3, i, j, z);
        this.A01 = r3.A01;
        this.A00 = r3.A00;
        this.A02 = r3.A02;
    }

    public C46912bs(C64933Qa r2, long j) {
        super(r2, 5, j);
    }
}
