package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3U1  reason: invalid class name */
public class AnonymousClass3U1 {
    public int A00;
    public C235618y A01;
    public UserJid A02;
    public C80113ur A03;
    public boolean A04;
    public Boolean A05;
    public Boolean A06;

    public static int A00(AnonymousClass3L0 r2) {
        if (r2 != null) {
            if (r2.A09) {
                return 4;
            }
            if (r2.A02()) {
                return 2;
            }
            if (r2.A01()) {
                return 3;
            }
        }
        return 1;
    }

    public static String A01(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
            return "https://www.whatsapp.com/security";
        }
        if (i == 16 || i == 17) {
            return "https://faq.whatsapp.com/1520500555178162";
        }
        return "https://faq.whatsapp.com/1148840052398648";
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3U1 r5 = (AnonymousClass3U1) obj;
            if (!(this.A00 == r5.A00 && this.A04 == r5.A04 && this.A03.equals(r5.A03))) {
                return false;
            }
        }
        return true;
    }

    private boolean A02(int i, int i2, int i3, boolean z) {
        if (this.A00 == i) {
            C80113ur r1 = this.A03;
            if (r1.actualActors == i2 && r1.hostStorage == i3 && this.A04 == z) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r0 != null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05() {
        /*
            r3 = this;
            com.whatsapp.jid.UserJid r2 = r3.A02
            r1 = 0
            if (r2 == 0) goto L_0x0012
            X.18y r0 = r3.A01
            if (r0 == 0) goto L_0x0012
            X.0wQ r0 = r0.A00
            boolean r0 = r0.A0M(r2)
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            java.lang.Boolean r0 = r3.A05
            if (r0 != 0) goto L_0x0028
            if (r2 == 0) goto L_0x0011
            X.18y r0 = r3.A01
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.A01(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A05 = r0
            if (r0 == 0) goto L_0x0011
        L_0x0028:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0011
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U1.A05():boolean");
    }

    public boolean A07() {
        Boolean bool = this.A06;
        if (bool == null) {
            if (this.A01 != null) {
                bool = C36381kD.A0j();
                this.A06 = bool;
            }
            return false;
        }
        if (!bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r2 != 3) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3U1(X.AnonymousClass3L0 r4) {
        /*
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L_0x001b
            int r2 = r4.A03
            X.3ur r1 = r4.A00()
            int r0 = A00(r4)
            r3.A03 = r1
            r3.A00 = r0
            r1 = 3
            r0 = 1
            if (r2 == r1) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r3.A04 = r0
            return
        L_0x001b:
            r1 = 1
            X.3ur r0 = new X.3ur
            r0.<init>()
            r3.A03 = r0
            r3.A00 = r1
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U1.<init>(X.3L0):void");
    }

    public int A03() {
        if (A07()) {
            if (!A02(3, 1, 2, false)) {
                if (!A02(3, 1, 2, true)) {
                    if (!A02(3, 2, 1, false)) {
                        if (!A02(3, 2, 1, true)) {
                            if (!A02(3, 2, 2, false)) {
                                if (!A02(3, 2, 2, true)) {
                                    if (this.A00 != 4) {
                                        if (!A05()) {
                                            return 17;
                                        }
                                        return 16;
                                    }
                                    return 15;
                                }
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 7;
                }
                return 6;
            }
            return 5;
        }
        if (!A05()) {
            if (this.A00 != 4) {
                if (!A02(1, 1, 1, false)) {
                    if (!A02(2, 1, 1, false)) {
                        if (!A02(2, 1, 1, true)) {
                            if (!A02(3, 1, 1, false)) {
                                if (!A02(3, 1, 1, true)) {
                                    if (!A02(3, 1, 2, false)) {
                                        if (!A02(3, 1, 2, true)) {
                                            if (!A02(3, 2, 1, false)) {
                                                if (!A02(3, 2, 1, true)) {
                                                    if (!A02(3, 2, 2, false)) {
                                                        if (!A02(3, 2, 2, true)) {
                                                            if (!A02(1, 0, 0, false)) {
                                                                if (!A02(2, 0, 0, false)) {
                                                                    if (!A02(2, 0, 0, true)) {
                                                                        if (!A02(3, 0, 0, false)) {
                                                                            if (A02(3, 0, 0, true)) {
                                                                                return 4;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return 9;
                                                }
                                                return 8;
                                            }
                                            return 7;
                                        }
                                        return 6;
                                    }
                                    return 5;
                                }
                                return 4;
                            }
                            return 3;
                        }
                        return 2;
                    }
                    return 1;
                }
                return 0;
            }
            return 15;
        }
        return 16;
        return 10;
    }

    public boolean A04() {
        int A032 = A03();
        if (A032 == 5 || A032 == 6 || A032 == 9 || A032 == 10 || A032 == 15) {
            return true;
        }
        return false;
    }

    public boolean A06() {
        int A032 = A03();
        if (A032 == 0 || A032 == 1 || A032 == 2 || A032 == 3 || A032 == 4) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.A03;
        AnonymousClass000.A1K(A1Q, this.A00);
        return AnonymousClass000.A0M(Boolean.valueOf(this.A04), A1Q, 2);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessState{privacyMode=");
        A0u.append(this.A03);
        A0u.append(", client=");
        A0u.append(this.A00);
        A0u.append(", isVerified=");
        A0u.append(this.A04);
        A0u.append(", stateId=");
        A0u.append(A03());
        return AnonymousClass000.A0s(A0u);
    }

    public AnonymousClass3U1(C80113ur r2, int i, int i2) {
        this.A03 = r2 == null ? new C80113ur() : r2;
        this.A00 = i;
        this.A04 = AnonymousClass000.A1S(i2, 3);
    }

    public AnonymousClass3U1(AnonymousClass185 r2, C235618y r3, UserJid userJid) {
        this(r2.A02(userJid));
        this.A02 = userJid;
        this.A01 = r3;
    }
}
