package X;

/* renamed from: X.1aZ  reason: invalid class name and case insensitive filesystem */
public final class C30661aZ {
    public final C25121Fb A00;
    public final AnonymousClass17B A01;
    public final C20520xh A02;
    public final C30681ab A03;
    public final C30671aa A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass00T A06 = new AnonymousClass00U(new C30701ad(this));
    public final AnonymousClass00T A07 = new AnonymousClass00U(new C30721af(this));
    public final AnonymousClass00T A08 = new AnonymousClass00U(new C30711ae(this));
    public final AnonymousClass00T A09 = new AnonymousClass00U(new C30691ac(this));
    public final C19460v5 A0A;

    public C30661aZ(C19460v5 r3, C25121Fb r4, AnonymousClass17B r5, C20520xh r6, C30681ab r7, C30671aa r8, AnonymousClass005 r9) {
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r9, 6);
        AnonymousClass00C.A0D(r3, 7);
        this.A04 = r8;
        this.A01 = r5;
        this.A00 = r4;
        this.A02 = r6;
        this.A03 = r7;
        this.A05 = r9;
        this.A0A = r3;
    }

    public final AnonymousClass8NK A01(AnonymousClass6CO r9, AnonymousClass3T1 r10) {
        C30671aa r3;
        String obj;
        String str;
        Integer num;
        AnonymousClass00C.A0D(r10, 0);
        this.A00.A02(r10);
        B6C b6c = (B6C) ((AnonymousClass9XG) this.A09.getValue()).A00(r10.A1I);
        AnonymousClass8NK r2 = (AnonymousClass8NK) AnonymousClass8SU.DEFAULT_INSTANCE.A0p();
        AnonymousClass00C.A0B(r2);
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass8NG A0i = AnonymousClass8SW.A0i();
        C64933Qa r1 = r10.A1J;
        A0i.A0V(r1.A01);
        A0i.A0Y(r1.A02);
        AnonymousClass11F r7 = r1.A00;
        A0i.A0X(AnonymousClass143.A03(r7));
        r2.A0W((AnonymousClass8SW) A0i.A0R());
        r2.A0V(r10.A0I / 1000);
        AnonymousClass11F A0J = r10.A0J();
        if (A0J != null && (AnonymousClass143.A0G(r7) || (r7 instanceof C177528dw))) {
            r2.A0Z(A0J.getRawString());
        }
        if (r10.A1T(134217728)) {
            r2.A0X(AnonymousClass91I.A1k);
        } else {
            try {
                b6c.B22(r9, r2, r10);
                int i = ((AnonymousClass8SU) r2.A00).bitField0_;
                if ((i & 2) == 0 && (i & 16384) == 0) {
                    String A002 = A00(r10);
                    C30671aa r32 = this.A04;
                    StringBuilder sb = new StringBuilder();
                    sb.append(A002);
                    sb.append("-serialization-invalid");
                    String obj2 = sb.toString();
                    AnonymousClass00C.A0D(obj2, 0);
                    C30671aa.A00(r32, obj2, "fmessage-history-sync-serialization-invalid", A002, new C85504Hi(r32, A002));
                    throw new C25311Fu(0, (String) null);
                }
                Object obj3 = this.A05.get();
                AnonymousClass00C.A08(obj3);
                for (B14 Bd3 : (Iterable) obj3) {
                    Bd3.Bd3(r9, r2, r10);
                }
            } catch (Exception e) {
                String A003 = A00(r10);
                if (!(e instanceof C25311Fu) || (num = ((C25311Fu) e).e2eFailureReason) == null || num.intValue() != 69) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(A003);
                    sb2.append("-serialization-failure");
                    String obj4 = sb2.toString();
                    r3 = this.A04;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(obj4);
                    sb3.append("-serialization-failed");
                    obj = sb3.toString();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(A003);
                    sb4.append(", ");
                    sb4.append(e);
                    A003 = sb4.toString();
                    str = "fmessage-history-sync-serialization-failed";
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(A003);
                    sb5.append("-serialization-not-supported");
                    obj = sb5.toString();
                    r3 = this.A04;
                    str = "fmessage-history-sync-serialization-not-supported";
                }
                AnonymousClass00C.A0D(obj, 0);
                C30671aa.A00(r3, obj, str, A003, new C85594Hr(r3, str, A003, e));
                throw e;
            }
        }
        C19460v5 r12 = this.A0A;
        if (!r12.A05()) {
            return r2;
        }
        r12.A02();
        throw new NullPointerException("traceOutgoing");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: X.ACf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: X.B15} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v142, resolved type: X.ACf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v143, resolved type: X.ACf} */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0027, code lost:
        continue;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3T1 A02(X.C1275768v r20, X.AnonymousClass8SU r21) {
        /*
            r19 = this;
            r10 = 0
            r5 = r21
            X.AnonymousClass00C.A0D(r5, r10)
            r7 = r19
            X.0v5 r1 = r7.A0A
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x001b
            r1.A02()
            java.lang.String r0 = "traceIncoming"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x001b:
            X.00T r0 = r7.A06
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r12 = r0.iterator()
        L_0x0027:
            boolean r0 = r12.hasNext()
            r6 = r20
            if (r0 == 0) goto L_0x0366
            java.lang.Object r9 = r12.next()
            X.9Vc r9 = (X.C195609Vc) r9
            X.ACe r8 = r9.A01
            int r0 = r5.bitField0_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0027
            r4 = 0
            X.91I r1 = r5.A0u()
            X.005 r0 = r8.A01
            java.lang.Object r0 = r0.get()
            X.0y2 r0 = (X.C20710y2) r0
            X.AnonymousClass00C.A0B(r1)
            int r2 = r1.ordinal()
            switch(r2) {
                case 4: goto L_0x0186;
                case 5: goto L_0x0186;
                case 6: goto L_0x0186;
                case 7: goto L_0x0186;
                case 8: goto L_0x0186;
                case 9: goto L_0x0054;
                case 10: goto L_0x0054;
                case 11: goto L_0x0054;
                case 12: goto L_0x0054;
                case 13: goto L_0x0054;
                case 14: goto L_0x0054;
                case 15: goto L_0x0054;
                case 16: goto L_0x0186;
                case 17: goto L_0x0186;
                case 18: goto L_0x0186;
                case 19: goto L_0x0054;
                case 20: goto L_0x0055;
                case 21: goto L_0x00c1;
                case 22: goto L_0x0106;
                case 23: goto L_0x00a8;
                case 24: goto L_0x010f;
                case 25: goto L_0x0118;
                case 26: goto L_0x0121;
                case 27: goto L_0x00ca;
                case 28: goto L_0x005e;
                case 29: goto L_0x0084;
                case 30: goto L_0x008d;
                case 31: goto L_0x0070;
                case 32: goto L_0x007b;
                case 33: goto L_0x00f0;
                case 34: goto L_0x00b1;
                case 35: goto L_0x00ca;
                case 36: goto L_0x005e;
                case 37: goto L_0x0054;
                case 38: goto L_0x00d5;
                case 39: goto L_0x0160;
                case 40: goto L_0x0054;
                case 41: goto L_0x0054;
                case 42: goto L_0x00fb;
                case 43: goto L_0x0067;
                case 44: goto L_0x012a;
                case 45: goto L_0x0054;
                case 46: goto L_0x0054;
                case 47: goto L_0x0054;
                case 48: goto L_0x0054;
                case 49: goto L_0x0054;
                case 50: goto L_0x0054;
                case 51: goto L_0x0054;
                case 52: goto L_0x0054;
                case 53: goto L_0x0054;
                case 54: goto L_0x01c7;
                case 55: goto L_0x01c7;
                case 56: goto L_0x01c7;
                case 57: goto L_0x0054;
                case 58: goto L_0x0054;
                case 59: goto L_0x0054;
                case 60: goto L_0x0186;
                case 61: goto L_0x0186;
                case 62: goto L_0x0054;
                case 63: goto L_0x0054;
                case 64: goto L_0x0186;
                case 65: goto L_0x0186;
                case 66: goto L_0x0054;
                case 67: goto L_0x0054;
                case 68: goto L_0x0054;
                case 69: goto L_0x0157;
                case 70: goto L_0x0174;
                case 71: goto L_0x017d;
                case 72: goto L_0x01aa;
                case 73: goto L_0x00de;
                case 74: goto L_0x0054;
                case 75: goto L_0x0198;
                case 76: goto L_0x018f;
                case 77: goto L_0x018f;
                case 78: goto L_0x018f;
                case 79: goto L_0x0160;
                case 80: goto L_0x018f;
                case 81: goto L_0x0160;
                case 82: goto L_0x018f;
                case 83: goto L_0x018f;
                case 84: goto L_0x0160;
                case 85: goto L_0x018f;
                case 86: goto L_0x0160;
                case 87: goto L_0x018f;
                case 88: goto L_0x018f;
                case 89: goto L_0x018f;
                case 90: goto L_0x018f;
                case 91: goto L_0x018f;
                case 92: goto L_0x018f;
                case 93: goto L_0x018f;
                case 94: goto L_0x0160;
                case 95: goto L_0x018f;
                case 96: goto L_0x0160;
                case 97: goto L_0x018f;
                case 98: goto L_0x018f;
                case 99: goto L_0x0186;
                case 100: goto L_0x0186;
                case 101: goto L_0x018f;
                case 102: goto L_0x018f;
                case 103: goto L_0x018f;
                case 104: goto L_0x018f;
                case 105: goto L_0x018f;
                case 106: goto L_0x018f;
                case 107: goto L_0x018f;
                case 108: goto L_0x018f;
                case 109: goto L_0x018f;
                case 110: goto L_0x018f;
                case 111: goto L_0x018f;
                case 112: goto L_0x018f;
                case 113: goto L_0x018f;
                case 114: goto L_0x018f;
                case 115: goto L_0x018f;
                case 116: goto L_0x018f;
                case 117: goto L_0x018f;
                case 118: goto L_0x01a1;
                case 119: goto L_0x0054;
                case 120: goto L_0x0054;
                case 121: goto L_0x0054;
                case 122: goto L_0x014e;
                case 123: goto L_0x01b3;
                case 124: goto L_0x0054;
                case 125: goto L_0x0054;
                case 126: goto L_0x0160;
                case 127: goto L_0x0160;
                case 128: goto L_0x0198;
                case 129: goto L_0x0198;
                case 130: goto L_0x01bc;
                case 131: goto L_0x00e7;
                case 132: goto L_0x0054;
                case 133: goto L_0x01d2;
                case 134: goto L_0x01e6;
                case 135: goto L_0x0203;
                case 136: goto L_0x0213;
                case 137: goto L_0x01ee;
                case 138: goto L_0x020b;
                case 139: goto L_0x021b;
                case 140: goto L_0x0054;
                case 141: goto L_0x01db;
                case 142: goto L_0x01f6;
                case 143: goto L_0x026c;
                case 144: goto L_0x0145;
                case 145: goto L_0x013c;
                case 146: goto L_0x0287;
                case 147: goto L_0x0096;
                case 148: goto L_0x009f;
                case 149: goto L_0x022c;
                case 150: goto L_0x0133;
                case 151: goto L_0x0237;
                case 152: goto L_0x0275;
                case 153: goto L_0x0054;
                case 154: goto L_0x027e;
                case 155: goto L_0x0054;
                case 156: goto L_0x0054;
                case 157: goto L_0x0294;
                case 158: goto L_0x0223;
                case 159: goto L_0x024c;
                case 160: goto L_0x0054;
                case 161: goto L_0x0261;
                case 162: goto L_0x02aa;
                case 163: goto L_0x01f6;
                case 164: goto L_0x01f6;
                case 165: goto L_0x01f6;
                case 166: goto L_0x01f6;
                case 167: goto L_0x01f6;
                case 168: goto L_0x01f6;
                case 169: goto L_0x0054;
                case 170: goto L_0x0054;
                case 171: goto L_0x02c5;
                case 172: goto L_0x02ce;
                case 173: goto L_0x02bc;
                case 174: goto L_0x0306;
                case 175: goto L_0x030f;
                case 176: goto L_0x02e0;
                case 177: goto L_0x02d7;
                case 178: goto L_0x02f4;
                case 179: goto L_0x02f4;
                case 180: goto L_0x02f4;
                case 181: goto L_0x02fd;
                case 182: goto L_0x02e9;
                case 183: goto L_0x0318;
                case 184: goto L_0x0054;
                case 185: goto L_0x01f6;
                case 186: goto L_0x032f;
                case 187: goto L_0x0054;
                case 188: goto L_0x0345;
                case 189: goto L_0x0338;
                case 190: goto L_0x0352;
                case 191: goto L_0x016b;
                case 192: goto L_0x029d;
                case 193: goto L_0x0160;
                case 194: goto L_0x0198;
                case 195: goto L_0x035d;
                case 196: goto L_0x016b;
                case 197: goto L_0x02b3;
                case 198: goto L_0x0054;
                case 199: goto L_0x0054;
                case 200: goto L_0x0160;
                case 201: goto L_0x0198;
                case 202: goto L_0x03ec;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x0027
        L_0x0055:
            X.0wN r0 = r0.A00
            X.8vw r13 = new X.8vw
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x005e:
            X.0wN r0 = r0.A00
            X.8w3 r13 = new X.8w3
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x0067:
            X.0wN r0 = r0.A00
            X.8vx r13 = new X.8vx
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x0070:
            X.0wN r2 = r0.A00
            X.0wQ r0 = r0.A0B
            X.8dB r13 = new X.8dB
            r13.<init>(r2, r0, r4)
            goto L_0x03f7
        L_0x007b:
            X.0wN r0 = r0.A00
            X.8w2 r13 = new X.8w2
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x0084:
            X.0wN r0 = r0.A00
            X.8w6 r13 = new X.8w6
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x008d:
            X.0wN r0 = r0.A00
            X.8w5 r13 = new X.8w5
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x0096:
            X.0wN r0 = r0.A00
            X.8wH r13 = new X.8wH
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x009f:
            X.0wN r0 = r0.A00
            X.8wG r13 = new X.8wG
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x00a8:
            X.0wN r0 = r0.A00
            X.8vz r13 = new X.8vz
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x00b1:
            X.0wN r2 = r0.A00
            X.0wQ r0 = r0.A0B
            r0.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r0.A03
            X.8wg r13 = new X.8wg
            r13.<init>(r2, r0, r4)
            goto L_0x03f7
        L_0x00c1:
            X.0wN r0 = r0.A00
            X.8w4 r13 = new X.8w4
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x00ca:
            X.0wN r2 = r0.A00
            X.0wQ r0 = r0.A0B
            X.8we r13 = new X.8we
            r13.<init>(r2, r0, r4)
            goto L_0x03f7
        L_0x00d5:
            X.0wN r0 = r0.A00
            X.8w7 r13 = new X.8w7
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x00de:
            X.0wN r0 = r0.A00
            X.8wI r13 = new X.8wI
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x00e7:
            X.0wN r0 = r0.A00
            X.8wJ r13 = new X.8wJ
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x00f0:
            X.0wN r2 = r0.A00
            X.12O r0 = r0.A0H
            X.8wh r13 = new X.8wh
            r13.<init>(r2, r0, r4)
            goto L_0x03f7
        L_0x00fb:
            X.0wN r2 = r0.A00
            X.12O r0 = r0.A0H
            X.8wd r13 = new X.8wd
            r13.<init>(r2, r0, r4)
            goto L_0x03f7
        L_0x0106:
            X.0wN r0 = r0.A00
            X.8vy r13 = new X.8vy
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x010f:
            X.0wN r0 = r0.A00
            X.8ws r13 = new X.8ws
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x0118:
            X.0wN r0 = r0.A00
            X.8wN r13 = new X.8wN
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x0121:
            X.0wN r0 = r0.A00
            X.8x3 r13 = new X.8x3
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x012a:
            X.0wN r0 = r0.A00
            X.8vs r13 = new X.8vs
            r13.<init>(r0)
            goto L_0x03f7
        L_0x0133:
            X.0wN r0 = r0.A00
            X.8wj r13 = new X.8wj
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x013c:
            X.0wN r0 = r0.A00
            X.8wP r13 = new X.8wP
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x0145:
            X.0wN r0 = r0.A00
            X.8wQ r13 = new X.8wQ
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x014e:
            X.0wN r0 = r0.A00
            X.8w8 r13 = new X.8w8
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x0157:
            X.0wN r0 = r0.A00
            X.8wM r13 = new X.8wM
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x0160:
            X.0wN r2 = r0.A00
            X.0xf r0 = r0.A0J
            X.8wk r13 = new X.8wk
            r13.<init>(r2, r0, r4)
            goto L_0x03f7
        L_0x016b:
            X.0wN r0 = r0.A00
            X.8w9 r13 = new X.8w9
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x0174:
            X.0wN r0 = r0.A00
            X.8w0 r13 = new X.8w0
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x017d:
            X.0wN r0 = r0.A00
            X.8w1 r13 = new X.8w1
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x0186:
            X.0wN r0 = r0.A00
            X.8wB r13 = new X.8wB
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x018f:
            X.0wN r0 = r0.A00
            X.8wC r13 = new X.8wC
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x0198:
            X.0wN r0 = r0.A00
            X.8wD r13 = new X.8wD
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x01a1:
            X.0wN r0 = r0.A00
            X.8wA r13 = new X.8wA
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x01aa:
            X.0wN r0 = r0.A00
            X.8wE r13 = new X.8wE
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x01b3:
            X.0wN r0 = r0.A00
            X.8wL r13 = new X.8wL
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x01bc:
            X.0wN r2 = r0.A00
            X.0wQ r0 = r0.A0B
            X.8wi r13 = new X.8wi
            r13.<init>(r2, r0, r4)
            goto L_0x03f7
        L_0x01c7:
            X.0wN r2 = r0.A00
            X.1FQ r0 = r0.A0K
            X.8wl r13 = new X.8wl
            r13.<init>(r2, r0, r4)
            goto L_0x03f7
        L_0x01d2:
            X.0wN r0 = r0.A00
            X.8wf r13 = new X.8wf
            r13.<init>(r0, r4, r4)
            goto L_0x03f7
        L_0x01db:
            X.0wN r2 = r0.A00
            X.0wQ r0 = r0.A0B
            X.8dA r13 = new X.8dA
            r13.<init>(r2, r0, r4)
            goto L_0x03f7
        L_0x01e6:
            X.9PV r0 = r0.A02
            X.8Xp r13 = r0.A00(r4)
            goto L_0x03f7
        L_0x01ee:
            X.9PW r0 = r0.A04
            X.8Xq r13 = r0.A00(r4)
            goto L_0x03f7
        L_0x01f6:
            X.0wN r3 = r0.A00
            X.12q r2 = r0.A0E
            X.19x r0 = r0.A0L
            X.8wm r13 = new X.8wm
            r13.<init>(r3, r2, r4, r0)
            goto L_0x03f7
        L_0x0203:
            X.9PU r0 = r0.A01
            X.8Xr r13 = r0.A00(r4)
            goto L_0x03f7
        L_0x020b:
            X.9PX r0 = r0.A06
            X.8Xs r13 = r0.A00(r4)
            goto L_0x03f7
        L_0x0213:
            X.9PY r0 = r0.A07
            X.8Xt r13 = r0.A00(r4)
            goto L_0x03f7
        L_0x021b:
            X.9PZ r0 = r0.A08
            X.8Xu r13 = r0.A00(r4)
            goto L_0x03f7
        L_0x0223:
            X.0wN r0 = r0.A00
            X.8vv r13 = new X.8vv
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x022c:
            X.0wN r2 = r0.A00
            X.19x r0 = r0.A0L
            X.8wb r13 = new X.8wb
            r13.<init>(r2, r4, r0)
            goto L_0x03f7
        L_0x0237:
            X.0wN r14 = r0.A00
            X.0wQ r15 = r0.A0B
            X.12q r2 = r0.A0E
            X.17c r0 = r0.A0G
            X.8dD r13 = new X.8dD
            r18 = r4
            r16 = r2
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x03f7
        L_0x024c:
            X.0wN r14 = r0.A00
            X.0wQ r15 = r0.A0B
            X.12q r2 = r0.A0E
            X.17c r0 = r0.A0G
            X.8dE r13 = new X.8dE
            r18 = r4
            r16 = r2
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x03f7
        L_0x0261:
            X.0wN r2 = r0.A00
            X.0wQ r0 = r0.A0B
            X.8dC r13 = new X.8dC
            r13.<init>(r2, r0, r4)
            goto L_0x03f7
        L_0x026c:
            X.0wN r0 = r0.A00
            X.8wK r13 = new X.8wK
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x0275:
            X.0wN r0 = r0.A00
            X.8vt r13 = new X.8vt
            r13.<init>(r0)
            goto L_0x03f7
        L_0x027e:
            X.0wN r0 = r0.A00
            X.8wF r13 = new X.8wF
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x0287:
            X.0yC r3 = r0.A0I
            X.0wN r2 = r0.A00
            X.12q r0 = r0.A0E
            X.8wn r13 = new X.8wn
            r13.<init>(r2, r0, r3, r4)
            goto L_0x03f7
        L_0x0294:
            X.0wN r0 = r0.A00
            X.8vu r13 = new X.8vu
            r13.<init>(r0)
            goto L_0x03f7
        L_0x029d:
            X.0wN r2 = r0.A00
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            X.8wZ r13 = new X.8wZ
            r13.<init>(r2, r4)
            goto L_0x03f7
        L_0x02aa:
            X.0wN r0 = r0.A00
            X.8wY r13 = new X.8wY
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x02b3:
            X.0wN r0 = r0.A00
            X.8wX r13 = new X.8wX
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x02bc:
            X.0wN r0 = r0.A00
            X.8wr r13 = new X.8wr
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x02c5:
            X.0wN r0 = r0.A00
            X.8wO r13 = new X.8wO
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x02ce:
            X.0wN r0 = r0.A00
            X.8wS r13 = new X.8wS
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x02d7:
            X.0wN r0 = r0.A00
            X.8wW r13 = new X.8wW
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x02e0:
            X.0wN r0 = r0.A00
            X.8x4 r13 = new X.8x4
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x02e9:
            X.0wN r2 = r0.A00
            X.17X r0 = r0.A0F
            X.8wz r13 = new X.8wz
            r13.<init>(r2, r0, r4)
            goto L_0x03f7
        L_0x02f4:
            X.0wN r0 = r0.A00
            X.8wV r13 = new X.8wV
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x02fd:
            X.0wN r0 = r0.A00
            X.8wR r13 = new X.8wR
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x0306:
            X.0wN r0 = r0.A00
            X.8wU r13 = new X.8wU
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x030f:
            X.0wN r0 = r0.A00
            X.8wT r13 = new X.8wT
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x0318:
            X.0wN r11 = r0.A00
            X.12q r3 = r0.A0E
            X.17X r2 = r0.A0F
            X.19x r0 = r0.A0L
            X.8wp r13 = new X.8wp
            r14 = r11
            r15 = r3
            r16 = r2
            r17 = r4
            r18 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x03f7
        L_0x032f:
            X.0wN r0 = r0.A00
            X.8x5 r13 = new X.8x5
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x0338:
            X.0wN r3 = r0.A00
            X.19x r2 = r0.A0L
            X.12q r0 = r0.A0E
            X.8x1 r13 = new X.8x1
            r13.<init>(r3, r0, r4, r2)
            goto L_0x03f7
        L_0x0345:
            X.0wN r3 = r0.A00
            X.19x r2 = r0.A0L
            X.12q r0 = r0.A0E
            X.8x0 r13 = new X.8x0
            r13.<init>(r3, r0, r4, r2)
            goto L_0x03f7
        L_0x0352:
            X.0wN r2 = r0.A00
            X.19x r0 = r0.A0L
            X.8wy r13 = new X.8wy
            r13.<init>(r2, r4, r0)
            goto L_0x03f7
        L_0x035d:
            X.0wN r0 = r0.A00
            X.8wx r13 = new X.8wx
            r13.<init>(r0, r4)
            goto L_0x03f7
        L_0x0366:
            int r0 = r5.bitField0_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x03a1
            X.91I r1 = r5.A0u()
            X.91I r0 = X.AnonymousClass91I.A31
            if (r1 == r0) goto L_0x03a1
            X.00T r0 = r7.A08
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x03a1
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03a1
            java.lang.Object r1 = r1.next()
            X.9WA r1 = (X.AnonymousClass9WA) r1
            X.B15 r0 = r1.A01
            X.3T1 r3 = r0.BlF(r6, r5)
            int r2 = r1.A00
        L_0x039c:
            java.lang.Class r0 = r0.getClass()
            goto L_0x041b
        L_0x03a1:
            int r0 = r5.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0474
            X.1ab r0 = r7.A03
            X.3Qa r3 = r0.A02(r5)
            long r1 = X.C30681ab.A00(r5)
            X.8SX r0 = r5.message_
            if (r0 != 0) goto L_0x03b7
            X.8SX r0 = X.AnonymousClass8SX.DEFAULT_INSTANCE
        L_0x03b7:
            X.AnonymousClass00C.A08(r0)
            X.9T0 r1 = X.C1899296d.A00(r0, r3, r1)
            r0 = 1
            r1.A0F = r0
            r1.A0G = r0
            X.9YL r1 = r1.A00()
            X.0xh r0 = r7.A02
            X.3T1 r3 = r0.A00(r1)
            X.00T r0 = r7.A07
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
            int r2 = r3.A1I
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r1.get(r0)
            X.9Vd r0 = (X.C195619Vd) r0
            if (r0 != 0) goto L_0x03e6
            java.lang.Class<X.1aZ> r0 = X.C30661aZ.class
            goto L_0x041b
        L_0x03e6:
            X.ACf r0 = r0.A01
            r0.A00(r6, r5, r3)
            goto L_0x039c
        L_0x03ec:
            X.0wN r3 = r0.A00
            X.12q r2 = r0.A0E
            X.19x r0 = r0.A0L
            X.8x2 r13 = new X.8x2
            r13.<init>(r3, r2, r4, r0)
        L_0x03f7:
            X.1ab r0 = r8.A00
            X.3Qa r11 = r0.A02(r5)
            long r3 = X.C30681ab.A00(r5)
            X.91I r0 = X.AnonymousClass91I.A2c
            if (r1 == r0) goto L_0x040f
            X.11F r2 = r11.A00
            r1 = 1
            java.lang.String r0 = r11.A01
            X.3Qa r11 = new X.3Qa
            r11.<init>(r2, r0, r1)
        L_0x040f:
            X.3T1 r3 = r13.A0C(r5, r11, r3)
            if (r3 == 0) goto L_0x0027
            int r2 = r9.A00
            java.lang.Class r0 = r8.getClass()
        L_0x041b:
            X.08f r1 = new X.08f
            r1.<init>(r0)
            X.9W9 r0 = new X.9W9
            r0.<init>(r3, r1, r2)
            X.3T1 r2 = r0.A00
            X.11F r0 = r2.A0J()
            if (r0 != 0) goto L_0x0449
            X.8SW r0 = r5.key_
            r1 = r0
            if (r0 != 0) goto L_0x0434
            X.8SW r0 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x0434:
            int r0 = r0.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0468
            if (r1 != 0) goto L_0x043e
            X.8SW r1 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x043e:
            java.lang.String r1 = r1.participant_
        L_0x0440:
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = r0.A02(r1)
        L_0x0446:
            r2.A0q(r0)
        L_0x0449:
            X.005 r0 = r7.A05
            java.lang.Object r0 = r0.get()
            X.AnonymousClass00C.A08(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x0458:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0473
            java.lang.Object r0 = r1.next()
            X.B14 r0 = (X.B14) r0
            r0.Bd4(r6, r5, r2)
            goto L_0x0458
        L_0x0468:
            int r0 = r5.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0471
            java.lang.String r1 = r5.participant_
            goto L_0x0440
        L_0x0471:
            r0 = 0
            goto L_0x0446
        L_0x0473:
            return r2
        L_0x0474:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            X.1Tb r1 = new X.1Tb
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30661aZ.A02(X.68v, X.8SU):X.3T1");
    }

    public static final String A00(AnonymousClass3T1 r3) {
        boolean z = r3 instanceof AnonymousClass2bI;
        StringBuilder sb = new StringBuilder();
        sb.append("type=");
        int i = r3.A1I;
        if (z) {
            sb.append(i);
            sb.append(", action=");
            i = ((AnonymousClass2bI) r3).A00;
        }
        sb.append(i);
        return sb.toString();
    }
}
