package X;

import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;

/* renamed from: X.2bU  reason: invalid class name */
public abstract class AnonymousClass2bU extends AnonymousClass3T1 implements AnonymousClass4RU {
    public long A00;
    public C65013Qj A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public final Object A0A = C36441kJ.A11();
    public volatile int A0B;
    public volatile AnonymousClass6Q6 A0C;

    public synchronized void A1D(byte[] bArr, boolean z) {
        float f;
        int i;
        C65013Qj r4 = this.A01;
        if (r4 != null) {
            if (bArr != null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                int i2 = options.outWidth;
                if (i2 > 0 && (i = options.outHeight) > 0) {
                    f = ((float) i) / ((float) i2);
                    r4.A00 = f;
                }
            }
            f = -1.0f;
            r4.A00 = f;
        }
        super.A1D(bArr, z);
    }

    public synchronized boolean A1Q() {
        boolean z;
        z = true;
        if (!super.A1Q()) {
            C65013Qj r0 = this.A01;
            if (r0 == null || r0.A00 <= 0.0f) {
                z = false;
            }
        }
        return z;
    }

    public static C65013Qj A00(AnonymousClass2bU r0) {
        C65013Qj r02 = r0.A01;
        C18740tg.A06(r02);
        return r02;
    }

    public static File A01(AnonymousClass2bU r0) {
        C65013Qj r02 = r0.A01;
        C18740tg.A06(r02);
        return r02.A0I;
    }

    public static boolean A03(String str) {
        if (str == null || !str.contains("static.whatsapp.net/downloadable?category=PSA")) {
            return false;
        }
        return true;
    }

    public AnonymousClass6Q6 A1Y() {
        if (this.A0C == null && AnonymousClass6Q6.A00(AnonymousClass6Y1.A02(this))) {
            synchronized (this.A0A) {
                if (this.A0C == null) {
                    this.A0C = new AnonymousClass6Q6(this);
                }
            }
        }
        return this.A0C;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.2bk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.2bk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.2by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: X.2bk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.2bk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.2bk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: X.2bk} */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.2by] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2bU A1Z(X.C65013Qj r18, X.C64933Qa r19, long r20, boolean r22) {
        /*
            r17 = this;
            r4 = r17
            boolean r0 = r4 instanceof X.C46962bx
            r2 = r18
            r3 = r19
            r6 = r20
            if (r0 == 0) goto L_0x001c
            X.2bx r4 = (X.C46962bx) r4
            X.C18740tg.A06(r2)
            r14 = 0
            X.2bx r8 = new X.2bx
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r6
            r8.<init>(r9, r10, r11, r12, r14)
            return r8
        L_0x001c:
            boolean r0 = r4 instanceof X.C46952bw
            if (r0 == 0) goto L_0x0028
            java.lang.String r1 = "Order messages can not be forwarded"
            X.1X6 r0 = new X.1X6
            r0.<init>(r1)
            throw r0
        L_0x0028:
            boolean r0 = r4 instanceof X.C46892bq
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = "ViewOnce messages can not be forwarded"
            X.1X6 r0 = new X.1X6
            r0.<init>(r1)
            throw r0
        L_0x0034:
            boolean r0 = r4 instanceof X.C46882bp
            r16 = r22
            if (r0 == 0) goto L_0x00af
            X.2bp r4 = (X.C46882bp) r4
            boolean r0 = r4 instanceof X.C46852bm
            if (r0 == 0) goto L_0x004b
            X.2bm r4 = (X.C46852bm) r4
            r11 = r4
            r12 = r2
            r13 = r3
            r14 = r6
            X.2bm r8 = r11.A1j(r12, r13, r14, r16)
        L_0x004a:
            return r8
        L_0x004b:
            boolean r0 = r4 instanceof X.C46862bn
            if (r0 == 0) goto L_0x0061
            X.C18740tg.A06(r2)
            X.2bp r8 = new X.2bp
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r6
            r8.<init>(r9, r10, r11, r12)
        L_0x005b:
            if (r22 != 0) goto L_0x004a
            r0 = 0
            r8.A02 = r0
            return r8
        L_0x0061:
            boolean r0 = r4 instanceof X.C46872bo
            if (r0 == 0) goto L_0x0088
            X.2bo r4 = (X.C46872bo) r4
            r14 = 0
            X.C18740tg.A06(r2)
            X.AnonymousClass00C.A0B(r2)
            X.2bo r8 = new X.2bo
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r6
            r8.<init>((X.C65013Qj) r9, (X.C64933Qa) r10, (X.C46872bo) r11, (long) r12, (boolean) r14)
            boolean r0 = X.C203369nr.A07(r4)
            if (r0 == 0) goto L_0x0082
            X.2bp r8 = new X.2bp
            r8.<init>(r9, r10, r11, r12)
        L_0x0082:
            if (r22 != 0) goto L_0x004a
            r0 = 0
            r8.A02 = r0
            return r8
        L_0x0088:
            boolean r0 = r4 instanceof X.C46842bl
            if (r0 == 0) goto L_0x00a1
            X.2bl r4 = (X.C46842bl) r4
            X.C18740tg.A06(r2)
            r14 = 0
            X.2bl r8 = new X.2bl
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r6
            r8.<init>(r9, r10, r11, r12, r14)
            if (r22 != 0) goto L_0x004a
            r0 = 0
            r8.A02 = r0
            return r8
        L_0x00a1:
            X.C18740tg.A06(r2)
            r14 = 0
            X.2bp r8 = new X.2bp
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r6
            r8.<init>(r9, r10, r11, r12, r14)
            goto L_0x005b
        L_0x00af:
            boolean r0 = r4 instanceof X.C47012ca
            if (r0 == 0) goto L_0x00bb
            java.lang.String r1 = "ViewOnce messages can not be forwarded"
            X.1X6 r0 = new X.1X6
            r0.<init>(r1)
            throw r0
        L_0x00bb:
            boolean r0 = r4 instanceof X.AnonymousClass2cY
            if (r0 == 0) goto L_0x00d4
            X.2cY r4 = (X.AnonymousClass2cY) r4
            X.C18740tg.A06(r2)
            r14 = 0
            X.2cY r8 = new X.2cY
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r6
            r8.<init>(r9, r10, r11, r12, r14)
            if (r22 != 0) goto L_0x00d3
            r0 = 0
            r8.A02 = r0
        L_0x00d3:
            return r8
        L_0x00d4:
            boolean r0 = r4 instanceof X.C46972by
            if (r0 == 0) goto L_0x0125
            X.2by r4 = (X.C46972by) r4
            boolean r0 = r4 instanceof X.C46822bj
            if (r0 == 0) goto L_0x00f0
            X.C18740tg.A06(r2)
            r8 = 0
            r5 = 9
        L_0x00e4:
            X.2by r1 = new X.2by
            r1.<init>(r2, r3, r4, r5, r6, r8)
            if (r22 != 0) goto L_0x00ef
            r0 = 0
            r1.A1k(r0)
        L_0x00ef:
            return r1
        L_0x00f0:
            boolean r0 = r4 instanceof X.C46832bk
            if (r0 == 0) goto L_0x011e
            X.2bk r4 = (X.C46832bk) r4
            r8 = 0
            X.C18740tg.A06(r2)
            X.AnonymousClass00C.A0B(r2)
            X.2bk r1 = new X.2bk
            r15 = 0
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r6
            r9.<init>(r10, r11, r12, r13, r15)
            boolean r0 = X.C203369nr.A07(r4)
            if (r0 == 0) goto L_0x0115
            r5 = 9
            X.2by r1 = new X.2by
            r1.<init>(r2, r3, r4, r5, r6, r8)
        L_0x0115:
            if (r22 != 0) goto L_0x00ef
            r0 = 0
            r1.A02 = r0
            r1.A1k(r0)
            return r1
        L_0x011e:
            X.C18740tg.A06(r2)
            r8 = 0
            int r5 = r4.A1I
            goto L_0x00e4
        L_0x0125:
            X.2bi r4 = (X.C46812bi) r4
            boolean r0 = r4 instanceof X.C46802bh
            if (r0 == 0) goto L_0x0133
            java.lang.String r1 = "ViewOnce messages can not be forwarded"
            X.1X6 r0 = new X.1X6
            r0.<init>(r1)
            throw r0
        L_0x0133:
            X.C18740tg.A06(r2)
            r14 = 0
            X.2bi r8 = new X.2bi
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r6
            r8.<init>(r9, r10, r11, r12, r14)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2bU.A1Z(X.3Qj, X.3Qa, long, boolean):X.2bU");
    }

    public String A1a() {
        if (this instanceof C46862bn) {
            return ((C46862bn) this).A00.A02;
        }
        return this.A02;
    }

    public String A1b() {
        if (!(this instanceof C46972by)) {
            return this.A06;
        }
        String str = this.A06;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String A022 = AnonymousClass1Ax.A02(this.A05);
        if (TextUtils.isEmpty(A022)) {
            return A1a();
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(A1a());
        return AnonymousClass000.A0p(".", A022, A0u);
    }

    public void A1c(Cursor cursor, C65013Qj r4) {
        this.A01 = r4;
        A1f(C36341k9.A0f(cursor, "multicast_id"));
        this.A05 = C36341k9.A0f(cursor, "mime_type");
        this.A07 = C36341k9.A0f(cursor, "message_url");
        this.A00 = C36351kA.A07(cursor, "file_length");
        this.A06 = C36341k9.A0f(cursor, "media_name");
        this.A04 = C36341k9.A0f(cursor, "file_hash");
        this.A0B = C36351kA.A03(cursor, "media_duration");
        this.A03 = C36341k9.A0f(cursor, "enc_file_hash");
    }

    public void A1d(Cursor cursor, C65013Qj r4) {
        this.A01 = r4;
        this.A05 = C36341k9.A0f(cursor, "mime_type");
        this.A07 = C36341k9.A0f(cursor, "message_url");
        this.A00 = C36351kA.A07(cursor, "file_length");
        this.A06 = C36341k9.A0f(cursor, "media_name");
        this.A04 = C36341k9.A0f(cursor, "file_hash");
        this.A0B = C36351kA.A03(cursor, "media_duration");
        this.A03 = C36341k9.A0f(cursor, "enc_file_hash");
        if (A0V() != null) {
            A1D(C36391kE.A1b(cursor, "thumbnail"), true);
        }
    }

    public void A1e(String str) {
        C64933Qa r1 = this.A1J;
        if (r1.A00 instanceof C28981Uw) {
            return;
        }
        if (C203359nq.A0D(r1, str)) {
            this.A07 = str;
            return;
        }
        throw new C28541Tb(C36421kH.A0W());
    }

    public void A1f(String str) {
        this.A08 = str;
        if (!TextUtils.isEmpty(str)) {
            A0j(64);
        } else {
            A0k(64);
        }
    }

    public boolean A1g() {
        File file;
        C65013Qj r0 = this.A01;
        if (r0 == null || (file = r0.A0I) == null || !file.canRead()) {
            return false;
        }
        return true;
    }

    public boolean A1h() {
        if (this.A07 != null) {
            return true;
        }
        C65013Qj r0 = this.A01;
        if (r0 == null || r0.A0J == null) {
            return false;
        }
        return true;
    }

    public boolean A1i() {
        if (this instanceof AnonymousClass2cY) {
            return true;
        }
        return false;
    }

    public AnonymousClass2bU(C64933Qa r2, int i, long j) {
        super(r2, i, j);
    }

    public static boolean A02(AnonymousClass2bU r0) {
        return TextUtils.isEmpty(r0.A1a());
    }

    public C65013Qj A1X() {
        return this.A01;
    }

    public AnonymousClass2bU(C65013Qj r10, C64933Qa r11, AnonymousClass2bU r12, int i, long j, boolean z) {
        super(r12, r11, i, j, z);
        boolean z2;
        this.A01 = r10;
        this.A02 = r12.A02;
        this.A0B = r12.A0B;
        this.A03 = r12.A03;
        this.A04 = r12.A04;
        this.A05 = r12.A05;
        this.A06 = r12.A06;
        this.A00 = r12.A00;
        this.A07 = r12.A07;
        this.A08 = r12.A08;
        AnonymousClass6Q6 A1Y = r12.A1Y();
        if (A1Y != null) {
            synchronized (A1Y) {
                z2 = A1Y.A00;
            }
            if (z2) {
                AnonymousClass6Q6 A1Y2 = A1Y();
                C18740tg.A06(A1Y2);
                A1Y2.A03(A1Y.A05(), A1Y.A06());
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("FMessageVideo/Cloned message should have sidecar, but original message doesn't have it: sidecar=");
            C36331k8.A1P(this.A0C, A0u);
        }
    }
}
