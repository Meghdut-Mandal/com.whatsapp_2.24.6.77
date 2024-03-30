package X;

import android.util.Base64;
import java.util.Map;

/* renamed from: X.3LH  reason: invalid class name */
public abstract class AnonymousClass3LH {
    public void A00(int i, int i2) {
        AnonymousClass4WR r2 = (AnonymousClass4WR) this;
        if (5 - r2.A01 == 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("WamsysRegistrationWrapper/send-funnel-log/status/");
            A0u.append(i);
            C36321k7.A1T("/failureReason/", A0u, i2);
            ((AnonymousClass3PM) r2.A00).A02((Object) null);
        }
    }

    public void A01(int i, int i2, String str, int i3) {
        int i4;
        AnonymousClass4WR r1 = (AnonymousClass4WR) this;
        if (3 - r1.A01 == 0) {
            AnonymousClass3PM r4 = (AnonymousClass3PM) r1.A00;
            if (i != 1) {
                i4 = 0;
                if (i != 3) {
                    i4 = -1;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("WamsysRegistrationWrapper/wfs-auth-unspecified; response-status ");
                    A0u.append(i);
                    C36321k7.A1S(" failure-reason ", A0u, i2);
                }
            } else {
                i4 = 1;
            }
            r4.A02(new C64333No(AnonymousClass3Sd.A00(i2), str, i4, AnonymousClass000.A1O(i3)));
        }
    }

    public void A02(String str, int i, int i2, int i3, int i4, long j) {
        AnonymousClass4WR r1 = (AnonymousClass4WR) this;
        if (2 - r1.A01 == 0) {
            AnonymousClass3PM r12 = (AnonymousClass3PM) r1.A00;
            int i5 = 1;
            int i6 = i2;
            if (i == 1) {
                i5 = 2;
            } else if (i != 2) {
                i5 = -1;
                if (i == 3) {
                    if (i2 == 6) {
                        i5 = 13;
                    } else if (i2 == 23) {
                        i5 = 10;
                    } else if (i2 == 32) {
                        i5 = 14;
                    } else if (i2 == 8) {
                        i5 = 12;
                    } else if (i2 == 9) {
                        i5 = 11;
                    }
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("WamsysRegistrationWrapper/send-device-confirmation-status-unspecified; response-status ");
                A0u.append(i);
                C36321k7.A1S(" failure-reason ", A0u, i2);
            }
            String str2 = str;
            r12.A02(new AnonymousClass3KC(str2, String.valueOf(j), i5, i6, AnonymousClass000.A1S(i3, 1), AnonymousClass000.A1S(i4, 1)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r13 != 32) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.lang.String r11, int r12, int r13, int r14, long r15, boolean r17) {
        /*
            r10 = this;
            r1 = r10
            X.4WR r1 = (X.AnonymousClass4WR) r1
            int r0 = r1.A01
            int r0 = 4 - r0
            if (r0 != 0) goto L_0x0048
            java.lang.Object r2 = r1.A00
            X.3PM r2 = (X.AnonymousClass3PM) r2
            r3 = 1
            r7 = r13
            if (r12 == r3) goto L_0x0052
            r0 = 3
            if (r12 != r0) goto L_0x0023
            if (r13 == r3) goto L_0x004f
            r0 = 6
            if (r13 == r0) goto L_0x004c
            r0 = 23
            if (r13 == r0) goto L_0x0049
            r0 = 32
            r6 = 13
            if (r13 == r0) goto L_0x0035
        L_0x0023:
            r6 = -1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WamsysRegistrationWrapper/fetch-device-confirmation-status-unspecified; response-status "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " failure-reason "
            X.C36321k7.A1S(r0, r1, r13)
        L_0x0035:
            boolean r8 = X.AnonymousClass000.A1S(r14, r3)
            java.lang.String r5 = java.lang.String.valueOf(r15)
            X.3KD r3 = new X.3KD
            r4 = r11
            r9 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2.A02(r3)
        L_0x0048:
            return
        L_0x0049:
            r6 = 11
            goto L_0x0035
        L_0x004c:
            r6 = 12
            goto L_0x0035
        L_0x004f:
            r6 = 10
            goto L_0x0035
        L_0x0052:
            r6 = 1
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LH.A03(java.lang.String, int, int, int, long, boolean):void");
    }

    public void A04(String str, String str2, int i, int i2, long j) {
        int i3;
        int i4;
        AnonymousClass4WR r1 = (AnonymousClass4WR) this;
        if (r1.A01 == 0) {
            AnonymousClass3PM r2 = (AnonymousClass3PM) r1.A00;
            if (i != 1) {
                i3 = 0;
                if (i != 3) {
                    i3 = -1;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("WamsysRegistrationWrapper/reg-onboard-abprop-request-status-unspecified; response-status ");
                    A0u.append(i);
                    C36321k7.A1S(" failure-reason ", A0u, i2);
                }
            } else {
                i3 = 1;
            }
            if (i2 != 6) {
                i4 = 1;
                if (i2 != 33) {
                    i4 = -1;
                }
            } else {
                i4 = 0;
            }
            r2.A02(new C64363Nr(str, str2, i3, i4, j));
        }
    }

    public void A05(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, long j2, long j3, long j4) {
        C52032om r3;
        AnonymousClass4WR r1 = (AnonymousClass4WR) this;
        if (1 - r1.A01 == 0) {
            AnonymousClass3PM r12 = (AnonymousClass3PM) r1.A00;
            int i9 = i;
            int i10 = i2;
            if (i9 != 3) {
                if (i9 == 5) {
                    r3 = C52032om.VERIFIED_CAPTCHA;
                }
                r3 = C52032om.ERROR_UNSPECIFIED;
            } else if (i10 == 2) {
                r3 = C52032om.FAIL_BLOCKED;
            } else if (i10 == 6) {
                r3 = C52032om.FAIL_TEMPORARILY_UNAVAILABLE;
            } else if (i10 != 11) {
                switch (i2) {
                    case 18:
                        r3 = C52032om.ERROR_NO_ROUTES;
                        break;
                    case 19:
                        r3 = C52032om.FAIL_MISMATCH;
                        break;
                    case 20:
                        r3 = C52032om.FAIL_GUESSED_TOO_FAST;
                        break;
                    case 21:
                        r3 = C52032om.FAIL_MISSING;
                        break;
                    case 22:
                        r3 = C52032om.FAIL_STALE;
                        break;
                }
                r3 = C52032om.ERROR_UNSPECIFIED;
            } else {
                r3 = C52032om.FAIL_TOO_MANY_GUESSES;
            }
            if (r3 == C52032om.ERROR_UNSPECIFIED) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("WamsysRegistrationWrapper/verifycaptcha-status-unspecified; response-status ");
                A0u.append(i9);
                C36321k7.A1S(" failure-reason ", A0u, i10);
            }
            AnonymousClass3BD r2 = new AnonymousClass3BD(r3);
            r2.A09 = str;
            r2.A06 = str2;
            r2.A03 = i3;
            r2.A02 = i4;
            r2.A0A = String.valueOf(j);
            r2.A0B = String.valueOf(j2);
            r2.A0C = String.valueOf(j3);
            r2.A08 = String.valueOf(j4);
            r2.A01 = i5;
            r2.A04 = i6;
            r2.A0D = AnonymousClass000.A1O(i7);
            r2.A05 = new AnonymousClass3XC(str3, (String) null, (String) null, str4, -1, false);
            r2.A00 = i8;
            r2.A07 = str5;
            r12.A02(r2);
        }
    }

    public void A06(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Map map, Map map2, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z) {
        AnonymousClass4WR r1 = (AnonymousClass4WR) this;
        if (7 - r1.A01 == 0) {
            AnonymousClass3PM r2 = (AnonymousClass3PM) r1.A00;
            int i8 = i;
            int i9 = i2;
            C52082or A01 = AnonymousClass3Sd.A01(i8, i9);
            if (A01 == C52082or.ERROR_UNSPECIFIED) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("WamsysRegistrationWrapper/request-code-status-unspecified; response-status ");
                A0u.append(i8);
                C36321k7.A1S(" failure-reason ", A0u, i9);
            }
            C66713Xa r12 = new C66713Xa(A01);
            r12.A03 = i9;
            r12.A0G = str;
            boolean z2 = false;
            r12.A0T = AnonymousClass000.A1S(i3, 1);
            if (i4 == 1) {
                z2 = true;
            }
            r12.A0S = z2;
            r12.A0K = String.valueOf(j);
            r12.A0C = str2;
            r12.A0I = str3;
            r12.A0M = String.valueOf(j2);
            r12.A0O = String.valueOf(j3);
            r12.A0P = String.valueOf(j4);
            r12.A0D = String.valueOf(j5);
            r12.A0J = str4;
            r12.A0R = str5;
            r12.A0Q = str6;
            r12.A04 = j6;
            r12.A02 = i5;
            r12.A0B = str7;
            r12.A0E = String.valueOf(j7);
            String str16 = str8;
            r12.A05 = new AnonymousClass3XC(str16, str9, (String) null, str10, -1, z);
            r12.A00 = i6;
            r12.A0A = str11;
            r12.A0F = str12;
            r12.A09 = str13;
            r12.A08 = C55272uM.A00(map);
            r12.A07 = C55262uL.A00(map2);
            r12.A01 = i7;
            r12.A0L = str14;
            r12.A0N = str15;
            r2.A02(r12);
        }
    }

    public void A08(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, Map map2, int i, int i2, int i3, int i4, int i5, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        AnonymousClass4WR r1 = (AnonymousClass4WR) this;
        if (10 - r1.A01 == 0) {
            AnonymousClass3PM r4 = (AnonymousClass3PM) r1.A00;
            int i6 = i2;
            int i7 = i;
            C52072oq A02 = AnonymousClass3Sd.A02(i7, i6);
            if (A02 == C52072oq.ERROR_UNSPECIFIED) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("WamsysRegistrationWrapper/verify-code-status-unspecified; response-status ");
                A0u.append(i7);
                C36321k7.A1S(" failure-reason ", A0u, i6);
            }
            AnonymousClass3BM r3 = new AnonymousClass3BM(A02);
            r3.A08 = str;
            boolean z4 = true;
            r3.A0F = AnonymousClass000.A1S(i3, 1);
            if (i4 != 1) {
                z4 = false;
            }
            r3.A0E = z4;
            r3.A0D = z;
            r3.A0A = String.valueOf(j);
            r3.A09 = str2;
            r3.A0C = str3;
            r3.A0B = str4;
            r3.A03 = j2;
            r3.A00 = i5;
            r3.A0G = z3;
            r3.A01 = j3;
            r3.A02 = j4;
            r3.A04 = new AnonymousClass3XC(str6, str7, (String) null, str8, -1, z2);
            String str9 = str5;
            if (str5 != null) {
                r3.A0H = Base64.decode(str9, 0);
            }
            r3.A07 = C55272uM.A00(map);
            r3.A06 = C55262uL.A00(map2);
            r4.A02(r3);
        }
    }

    public void A09(String str, String str2, String str3, String str4, String str5, Map map, Map map2, int i, int i2, int i3, int i4, int i5, long j, long j2, long j3, boolean z, boolean z2) {
        C52052oo r4;
        AnonymousClass4WR r1 = (AnonymousClass4WR) this;
        if (11 - r1.A01 == 0) {
            AnonymousClass3PM r2 = (AnonymousClass3PM) r1.A00;
            if (i == 1 || i == 2) {
                r4 = C52052oo.YES;
            } else {
                if (i == 3) {
                    if (i2 == 1) {
                        r4 = C52052oo.FAIL_INCORRECT;
                    } else if (i2 == 2) {
                        r4 = C52052oo.FAIL_BLOCKED;
                    } else if (i2 == 6) {
                        r4 = C52052oo.FAIL_TEMPORARILY_UNAVAILABLE;
                    } else if (i2 == 11) {
                        r4 = C52052oo.FAIL_TOO_MANY_GUESSES;
                    } else if (i2 == 22) {
                        r4 = C52052oo.FAIL_STALE;
                    } else if (i2 == 28) {
                        r4 = C52052oo.FAIL_RESET_TOO_SOON;
                    } else if (i2 == 19) {
                        r4 = C52052oo.FAIL_MISMATCH;
                    } else if (i2 == 20) {
                        r4 = C52052oo.FAIL_GUESSED_TOO_FAST;
                    }
                }
                r4 = C52052oo.ERROR_UNSPECIFIED;
            }
            if (r4 == C52052oo.ERROR_UNSPECIFIED) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("WamsysRegistrationWrapper/security-status-unspecified; response-status ");
                A0u.append(i);
                C36321k7.A1S(" failure-reason ", A0u, i2);
            }
            AnonymousClass3BH r3 = new AnonymousClass3BH(r4);
            r3.A07 = str;
            boolean z3 = true;
            r3.A0D = AnonymousClass000.A1S(i3, 1);
            if (i4 != 1) {
                z3 = false;
            }
            r3.A0C = z3;
            r3.A0B = z;
            r3.A06 = String.valueOf(i5);
            r3.A00 = j;
            r3.A08 = str2;
            r3.A0A = str3;
            r3.A09 = str4;
            r3.A02 = j2;
            r3.A01 = j3;
            r3.A0E = z2;
            if (str5 != null) {
                r3.A0F = Base64.decode(str5, 0);
            }
            r3.A05 = C55272uM.A00(map);
            r3.A04 = C55262uL.A00(map2);
            r2.A02(r3);
        }
    }

    public void A0A(String str, String str2, String str3, Map map, Map map2, int i, int i2, int i3, int i4, long j) {
        AnonymousClass4WR r1 = (AnonymousClass4WR) this;
        if (9 - r1.A01 == 0) {
            AnonymousClass3PM r2 = (AnonymousClass3PM) r1.A00;
            int i5 = i;
            int i6 = i2;
            C52072oq A02 = AnonymousClass3Sd.A02(i5, i6);
            if (A02 == C52072oq.ERROR_UNSPECIFIED) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("WamsysRegistrationWrapper/verify-code-status-standalone-unspecified; response-status ");
                A0u.append(i5);
                C36321k7.A1S(" failure-reason ", A0u, i6);
            }
            AnonymousClass3BM r12 = new AnonymousClass3BM(A02);
            r12.A08 = str;
            r12.A0F = AnonymousClass000.A1O(i3);
            r12.A0A = String.valueOf(j);
            r12.A04 = new AnonymousClass3XC(Integer.toString(i4), (String) null, (String) null, str3, 0, false);
            if (str2 != null) {
                r12.A0H = Base64.decode(str2, 0);
            }
            r12.A07 = C55272uM.A00(map);
            r12.A06 = C55262uL.A00(map2);
            r2.A02(r12);
        }
    }

    public void A0B(String str, Map map, Map map2, int i, int i2) {
        int i3;
        AnonymousClass4WR r1 = (AnonymousClass4WR) this;
        if (12 - r1.A01 == 0) {
            AnonymousClass3PM r3 = (AnonymousClass3PM) r1.A00;
            if (i != 2) {
                i3 = 0;
                if (i != 3) {
                    i3 = -1;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("WamsysRegistrationWrapper/autoconf-request-status-unspecified; response-status ");
                    A0u.append(i);
                    C36321k7.A1S(" failure-reason ", A0u, i2);
                }
            } else {
                i3 = 1;
            }
            AnonymousClass39S r12 = new AnonymousClass39S(i3);
            r12.A00 = i2;
            r12.A03 = str;
            r12.A02 = C55272uM.A00(map);
            r12.A01 = C55262uL.A00(map2);
            r3.A02(r12);
        }
    }

    public void A0C(Map map, Map map2, int i, int i2) {
        int i3;
        AnonymousClass4WR r1 = (AnonymousClass4WR) this;
        if (13 - r1.A01 == 0) {
            AnonymousClass3PM r3 = (AnonymousClass3PM) r1.A00;
            if (i != 1) {
                i3 = 0;
                if (i != 3) {
                    i3 = -1;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("WamsysRegistrationWrapper/autoconf-verifier-request-status-unspecified; response-status ");
                    A0u.append(i);
                    C36321k7.A1S(" failure-reason ", A0u, i2);
                }
            } else {
                i3 = 1;
            }
            C63283Jl r12 = new C63283Jl(i3);
            r12.A00 = i2;
            r12.A02 = C55272uM.A00(map);
            r12.A01 = C55262uL.A00(map2);
            r3.A02(r12);
        }
    }

    public void A0D(Map map, Map map2, int i, int i2, int i3, long j, long j2) {
        AnonymousClass4WR r1 = (AnonymousClass4WR) this;
        if (8 - r1.A01 == 0) {
            AnonymousClass3PM r3 = (AnonymousClass3PM) r1.A00;
            C52082or A01 = AnonymousClass3Sd.A01(i, i2);
            if (A01 == C52082or.ERROR_UNSPECIFIED) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("WamsysRegistrationWrapper/request-code-status-standalone-unspecified; response-status ");
                A0u.append(i);
                C36321k7.A1S(" failure-reason ", A0u, i2);
            }
            C66713Xa r12 = new C66713Xa(A01);
            r12.A03 = i2;
            r12.A0K = String.valueOf(j);
            r12.A0M = String.valueOf(j2);
            r12.A02 = i3;
            r12.A08 = C55272uM.A00(map);
            r12.A07 = C55262uL.A00(map2);
            r3.A02(r12);
        }
    }

    public void A07(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Map map, Map map2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z, boolean z2, boolean z3) {
        int i15;
        AnonymousClass3OL r1;
        AnonymousClass4WR r12 = (AnonymousClass4WR) this;
        if (6 - r12.A01 == 0) {
            AnonymousClass3PM r2 = (AnonymousClass3PM) r12.A00;
            int i16 = i;
            if (i16 != 1) {
                i15 = 0;
                if (i16 != 3) {
                    i15 = -1;
                    C36321k7.A1S("WamsysRegistrationWrapper/unknown-exist-status ", AnonymousClass000.A0u(), i16);
                }
            } else {
                i15 = 1;
            }
            boolean z4 = false;
            if (i15 == 1) {
                boolean A1S = AnonymousClass000.A1S(i3, 1);
                if (i4 == 1) {
                    z4 = true;
                }
                r1 = new AnonymousClass3OL(str, A1S, z4, z);
            } else {
                r1 = new AnonymousClass3OL(AnonymousClass3Sd.A00(i2), i15);
                r1.A0I = String.valueOf(j);
                r1.A06 = i5;
                r1.A05 = i6;
                r1.A0K = String.valueOf(j2);
                r1.A0L = String.valueOf(j3);
                r1.A0M = String.valueOf(j4);
                r1.A0F = String.valueOf(j5);
                r1.A09 = j6;
                r1.A0H = str2;
                r1.A0O = str3;
                r1.A0N = str4;
                r1.A0A = j7;
                r1.A08 = j8;
                r1.A0P = z2;
                r1.A03 = i7;
                r1.A0Q = AnonymousClass000.A1S(i9, 1);
                String str13 = str6;
                r1.A0B = new AnonymousClass3XC(str13, str8, str7, str9, i8, z3);
                r1.A0J = str10;
                r1.A0G = str12;
                int i17 = i12;
                if (i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4) {
                    r1.A07 = i17;
                } else {
                    r1.A07 = 0;
                }
                String str14 = str5;
                if (str5 != null) {
                    r1.A0R = Base64.decode(str14, 0);
                }
            }
            r1.A01 = i10;
            r1.A00 = i11;
            r1.A0D = C55272uM.A00(map);
            r1.A0C = C55262uL.A00(map2);
            r1.A02 = i13;
            r1.A0E = str11;
            r1.A04 = i14;
            r2.A02(r1);
        }
    }
}
