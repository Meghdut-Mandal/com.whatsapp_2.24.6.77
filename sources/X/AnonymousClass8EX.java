package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.8EX  reason: invalid class name */
public abstract class AnonymousClass8EX extends C21032A3v {
    public static Map zzd = C90524aI.A0s();
    public C201569jt zzb = C201569jt.A05;
    public int zzc = -1;

    public static AnonymousClass8EH A01(AnonymousClass8EX r1) {
        return (AnonymousClass8EH) r1.A09(5);
    }

    public static void A07(Object[] objArr) {
        objArr[0] = "zzc";
        objArr[1] = "zzd";
    }

    public static void A08(Object[] objArr) {
        objArr[0] = "zzc";
        objArr[1] = "zzd";
        objArr[2] = "zze";
        objArr[3] = "zzf";
    }

    public final /* synthetic */ AnonymousClass8EX Byz() {
        return (AnonymousClass8EX) A09(6);
    }

    public static int A00(B3T b3t, Object obj) {
        C21032A3v a3v = (C21032A3v) obj;
        AnonymousClass8EX r2 = (AnonymousClass8EX) a3v;
        int i = r2.zzc;
        if (i != -1) {
            return i;
        }
        int zzb2 = b3t.zzb(a3v);
        r2.zzc = zzb2;
        return zzb2;
    }

    public static void A05(Object obj, Object obj2) {
        zzd.put(obj, obj2);
    }

    public static final void A06(StringBuilder sb, int i, String str, Object obj) {
        String A00;
        if (obj instanceof List) {
            Iterator A13 = C90514aH.A13(obj);
            while (A13.hasNext()) {
                A06(sb, i, str, A13.next());
            }
        } else if (obj instanceof Map) {
            Iterator A0y = AnonymousClass000.A0y((Map) obj);
            while (A0y.hasNext()) {
                A06(sb, i, str, A0y.next());
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                C21673AUw aUw = C21673AUw.A00;
                A00 = AnonymousClass95T.A00(new AnonymousClass8E0(((String) obj).getBytes(C197089b7.A00)));
            } else if (obj instanceof C21673AUw) {
                sb.append(": \"");
                A00 = AnonymousClass95T.A00((C21673AUw) obj);
            } else {
                if (obj instanceof AnonymousClass8EX) {
                    sb.append(" {");
                    A04((C21032A3v) obj, sb, i + 2);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i4 = i + 2;
                    A06(sb, i4, "key", entry.getKey());
                    A06(sb, i4, "value", entry.getValue());
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    C165567td.A1M(obj, ": ", sb);
                    return;
                }
                sb.append("}");
                return;
            }
            sb.append(A00);
            sb.append('\"');
        }
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [X.0oS, java.lang.Object, X.9iH] */
    /* JADX WARNING: type inference failed for: r3v13, types: [X.0oS, java.lang.Object, X.9iH] */
    /* JADX WARNING: type inference failed for: r3v20, types: [X.0oS, java.lang.Object, X.9iH] */
    /* JADX WARNING: type inference failed for: r3v27, types: [X.0oS, java.lang.Object, X.9iH] */
    /* JADX WARNING: type inference failed for: r3v34, types: [X.0oS, java.lang.Object, X.9iH] */
    /* JADX WARNING: type inference failed for: r3v41, types: [X.0oS, java.lang.Object, X.9iH] */
    /* JADX WARNING: type inference failed for: r3v48, types: [X.0oS, java.lang.Object, X.9iH] */
    /* JADX WARNING: type inference failed for: r3v55, types: [X.0oS, java.lang.Object, X.9iH] */
    /* JADX WARNING: type inference failed for: r3v62, types: [X.0oS, java.lang.Object, X.9iH] */
    /* JADX WARNING: type inference failed for: r3v69, types: [X.0oS, java.lang.Object, X.9iH] */
    /* JADX WARNING: type inference failed for: r3v76, types: [X.0oS, java.lang.Object, X.9iH] */
    /* JADX WARNING: type inference failed for: r3v83, types: [X.0oS, java.lang.Object, X.9iH] */
    /* JADX WARNING: type inference failed for: r3v90, types: [X.0oS, java.lang.Object, X.9iH] */
    /* JADX WARNING: type inference failed for: r3v97, types: [X.0oS, java.lang.Object, X.9iH] */
    /* JADX WARNING: type inference failed for: r3v104, types: [X.0oS, java.lang.Object, X.9iH] */
    public Object A09(int i) {
        ? r3;
        ? r32;
        ? r33;
        ? r34;
        ? r35;
        ? r36;
        ? r37;
        ? r38;
        ? r39;
        ? r310;
        ? r311;
        ? r312;
        ? r313;
        ? r314;
        ? r315;
        if (this instanceof AnonymousClass8ER) {
            switch (C1905898z.A00[i - 1]) {
                case 1:
                    return new AnonymousClass8ER();
                case 2:
                    return new AnonymousClass8EG();
                case 3:
                    Object[] objArr = new Object[6];
                    A08(objArr);
                    objArr[4] = "zzg";
                    objArr[5] = "zzh";
                    return new C21031A3u(AnonymousClass8ER.zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", objArr);
                case 4:
                    return AnonymousClass8ER.zzi;
                case 5:
                    synchronized (AnonymousClass8ER.class) {
                        C200829iJ r0 = C200809iH.A01;
                        r315 = new C200809iH(AnonymousClass8ER.zzi);
                        AnonymousClass8ER.zzj = r315;
                    }
                    return r315;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8EP) {
            switch (C1905898z.A00[i - 1]) {
                case 1:
                    return new AnonymousClass8EP();
                case 2:
                    return new AnonymousClass8EF();
                case 3:
                    Object[] objArr2 = new Object[5];
                    A08(objArr2);
                    objArr2[4] = "zzg";
                    return new C21031A3u(AnonymousClass8EP.zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", objArr2);
                case 4:
                    return AnonymousClass8EP.zzh;
                case 5:
                    synchronized (AnonymousClass8EP.class) {
                        C200829iJ r02 = C200809iH.A01;
                        r314 = new C200809iH(AnonymousClass8EP.zzh);
                        AnonymousClass8EP.zzi = r314;
                    }
                    return r314;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8EM) {
            switch (C1905898z.A00[i - 1]) {
                case 1:
                    return new AnonymousClass8EM();
                case 2:
                    return new AnonymousClass8EE();
                case 3:
                    Object[] A1Q = C36441kJ.A1Q();
                    A07(A1Q);
                    A1Q[2] = "zze";
                    return new C21031A3u(AnonymousClass8EM.zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", A1Q);
                case 4:
                    return AnonymousClass8EM.zzf;
                case 5:
                    synchronized (AnonymousClass8EM.class) {
                        C200829iJ r03 = C200809iH.A01;
                        r313 = new C200809iH(AnonymousClass8EM.zzf);
                        AnonymousClass8EM.zzg = r313;
                    }
                    return r313;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8EL) {
            switch (C1905898z.A00[i - 1]) {
                case 1:
                    return new AnonymousClass8EL();
                case 2:
                    return new AnonymousClass8ED();
                case 3:
                    Object[] A1Q2 = C36441kJ.A1Q();
                    A07(A1Q2);
                    A1Q2[2] = "zze";
                    return new C21031A3u(AnonymousClass8EL.zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", A1Q2);
                case 4:
                    return AnonymousClass8EL.zzf;
                case 5:
                    synchronized (AnonymousClass8EL.class) {
                        C200829iJ r04 = C200809iH.A01;
                        r312 = new C200809iH(AnonymousClass8EL.zzf);
                        AnonymousClass8EL.zzg = r312;
                    }
                    return r312;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8EU) {
            switch (C1905898z.A00[i - 1]) {
                case 1:
                    return new AnonymousClass8EU();
                case 2:
                    return new AnonymousClass8EC();
                case 3:
                    Object[] objArr3 = new Object[7];
                    A08(objArr3);
                    objArr3[4] = "zzg";
                    objArr3[5] = "zzh";
                    objArr3[6] = "zzi";
                    return new C21031A3u(AnonymousClass8EU.zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", objArr3);
                case 4:
                    return AnonymousClass8EU.zzj;
                case 5:
                    synchronized (AnonymousClass8EU.class) {
                        C200829iJ r05 = C200809iH.A01;
                        r311 = new C200809iH(AnonymousClass8EU.zzj);
                        AnonymousClass8EU.zzk = r311;
                    }
                    return r311;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8EQ) {
            switch (C1905898z.A00[i - 1]) {
                case 1:
                    return new AnonymousClass8EQ();
                case 2:
                    return new AnonymousClass8EB();
                case 3:
                    Object[] objArr4 = new Object[7];
                    A07(objArr4);
                    objArr4[2] = C21027A3q.A00;
                    objArr4[3] = "zze";
                    objArr4[4] = "zzf";
                    objArr4[5] = "zzh";
                    objArr4[6] = "zzg";
                    return new C21031A3u(AnonymousClass8EQ.zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", objArr4);
                case 4:
                    return AnonymousClass8EQ.zzi;
                case 5:
                    synchronized (AnonymousClass8EQ.class) {
                        C200829iJ r06 = C200809iH.A01;
                        r310 = new C200809iH(AnonymousClass8EQ.zzi);
                        AnonymousClass8EQ.zzj = r310;
                    }
                    return r310;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8EO) {
            switch (C1905898z.A00[i - 1]) {
                case 1:
                    return new AnonymousClass8EO();
                case 2:
                    return new AnonymousClass8EA();
                case 3:
                    Object[] objArr5 = new Object[5];
                    A08(objArr5);
                    objArr5[4] = AnonymousClass8EW.class;
                    return new C21031A3u(AnonymousClass8EO.zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", objArr5);
                case 4:
                    return AnonymousClass8EO.zzg;
                case 5:
                    synchronized (AnonymousClass8EO.class) {
                        C200829iJ r07 = C200809iH.A01;
                        r39 = new C200809iH(AnonymousClass8EO.zzg);
                        AnonymousClass8EO.zzh = r39;
                    }
                    return r39;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8ET) {
            switch (C1905898z.A00[i - 1]) {
                case 1:
                    return new AnonymousClass8ET();
                case 2:
                    return new AnonymousClass8E9();
                case 3:
                    Object[] objArr6 = new Object[7];
                    A08(objArr6);
                    objArr6[4] = "zzg";
                    objArr6[5] = "zzh";
                    objArr6[6] = "zzi";
                    return new C21031A3u(AnonymousClass8ET.zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", objArr6);
                case 4:
                    return AnonymousClass8ET.zzj;
                case 5:
                    synchronized (AnonymousClass8ET.class) {
                        C200829iJ r08 = C200809iH.A01;
                        r38 = new C200809iH(AnonymousClass8ET.zzj);
                        AnonymousClass8ET.zzk = r38;
                    }
                    return r38;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8ES) {
            switch (C1905898z.A00[i - 1]) {
                case 1:
                    return new AnonymousClass8ES();
                case 2:
                    return new AnonymousClass8E8();
                case 3:
                    Object[] objArr7 = new Object[10];
                    A07(objArr7);
                    objArr7[2] = C21026A3p.A00;
                    objArr7[3] = "zze";
                    objArr7[4] = C21025A3o.A00;
                    objArr7[5] = "zzf";
                    objArr7[6] = C21024A3n.A00;
                    objArr7[7] = "zzg";
                    objArr7[8] = "zzh";
                    objArr7[9] = "zzi";
                    return new C21031A3u(AnonymousClass8ES.zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", objArr7);
                case 4:
                    return AnonymousClass8ES.zzj;
                case 5:
                    synchronized (AnonymousClass8ES.class) {
                        C200829iJ r09 = C200809iH.A01;
                        r37 = new C200809iH(AnonymousClass8ES.zzj);
                        AnonymousClass8ES.zzk = r37;
                    }
                    return r37;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8EW) {
            switch (C1905898z.A00[i - 1]) {
                case 1:
                    return new AnonymousClass8EW();
                case 2:
                    return new AnonymousClass8E7();
                case 3:
                    Object[] objArr8 = new Object[11];
                    A08(objArr8);
                    objArr8[4] = "zzg";
                    objArr8[5] = C21023A3m.A00;
                    objArr8[6] = "zzh";
                    objArr8[7] = "zzi";
                    objArr8[8] = "zzj";
                    objArr8[9] = "zzk";
                    objArr8[10] = AnonymousClass8EP.class;
                    return new C21031A3u(AnonymousClass8EW.zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", objArr8);
                case 4:
                    return AnonymousClass8EW.zzl;
                case 5:
                    synchronized (AnonymousClass8EW.class) {
                        C200829iJ r010 = C200809iH.A01;
                        r36 = new C200809iH(AnonymousClass8EW.zzl);
                        AnonymousClass8EW.zzm = r36;
                    }
                    return r36;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8EV) {
            switch (C1905898z.A00[i - 1]) {
                case 1:
                    return new AnonymousClass8EV();
                case 2:
                    return new AnonymousClass8E6();
                case 3:
                    Object[] objArr9 = new Object[10];
                    A08(objArr9);
                    objArr9[4] = C21022A3l.A00;
                    objArr9[5] = "zzg";
                    objArr9[6] = "zzh";
                    objArr9[7] = "zzi";
                    objArr9[8] = "zzj";
                    objArr9[9] = "zzk";
                    return new C21031A3u(AnonymousClass8EV.zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", objArr9);
                case 4:
                    return AnonymousClass8EV.zzl;
                case 5:
                    synchronized (AnonymousClass8EV.class) {
                        C200829iJ r011 = C200809iH.A01;
                        r35 = new C200809iH(AnonymousClass8EV.zzl);
                        AnonymousClass8EV.zzm = r35;
                    }
                    return r35;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8EI) {
            switch (C1905898z.A00[i - 1]) {
                case 1:
                    return new AnonymousClass8EI();
                case 2:
                    return new AnonymousClass8E5();
                case 3:
                    Object[] A0M = AnonymousClass001.A0M();
                    A0M[0] = "zzc";
                    A0M[1] = AnonymousClass8EM.class;
                    return new C21031A3u(AnonymousClass8EI.zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", A0M);
                case 4:
                    return AnonymousClass8EI.zzd;
                case 5:
                    synchronized (AnonymousClass8EI.class) {
                        C200829iJ r012 = C200809iH.A01;
                        r34 = new C200809iH(AnonymousClass8EI.zzd);
                        AnonymousClass8EI.zze = r34;
                    }
                    return r34;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8EN) {
            switch (C1905898z.A00[i - 1]) {
                case 1:
                    return new AnonymousClass8EN();
                case 2:
                    return new AnonymousClass8E4();
                case 3:
                    Object[] objArr10 = new Object[6];
                    A07(objArr10);
                    objArr10[2] = C21028A3r.A00;
                    objArr10[3] = "zze";
                    objArr10[4] = C21029A3s.A00;
                    objArr10[5] = "zzf";
                    return new C21031A3u(AnonymousClass8EN.zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", objArr10);
                case 4:
                    return AnonymousClass8EN.zzg;
                case 5:
                    synchronized (AnonymousClass8EN.class) {
                        C200829iJ r013 = C200809iH.A01;
                        r33 = new C200809iH(AnonymousClass8EN.zzg);
                        AnonymousClass8EN.zzh = r33;
                    }
                    return r33;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else {
            boolean z = this instanceof AnonymousClass8EJ;
            int[] iArr = C1905898z.A00;
            if (z) {
                switch (iArr[i - 1]) {
                    case 1:
                        return new AnonymousClass8EJ();
                    case 2:
                        return new AnonymousClass8E3();
                    case 3:
                        Object[] A0M2 = AnonymousClass001.A0M();
                        A0M2[0] = "zzc";
                        A0M2[1] = C21028A3r.A00;
                        return new C21031A3u(AnonymousClass8EJ.zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", A0M2);
                    case 4:
                        return AnonymousClass8EJ.zze;
                    case 5:
                        synchronized (AnonymousClass8EJ.class) {
                            C200829iJ r014 = C200809iH.A01;
                            r32 = new C200809iH(AnonymousClass8EJ.zze);
                            AnonymousClass8EJ.zzf = r32;
                        }
                        return r32;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw AnonymousClass001.A0D();
                }
            } else {
                switch (iArr[i - 1]) {
                    case 1:
                        return new AnonymousClass8EK();
                    case 2:
                        return new AnonymousClass8E2();
                    case 3:
                        Object[] A1Q3 = C36441kJ.A1Q();
                        A07(A1Q3);
                        A1Q3[2] = "zze";
                        return new C21031A3u(AnonymousClass8EK.zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", A1Q3);
                    case 4:
                        return AnonymousClass8EK.zzf;
                    case 5:
                        synchronized (AnonymousClass8EK.class) {
                            C200829iJ r015 = C200809iH.A01;
                            r3 = new C200809iH(AnonymousClass8EK.zzf);
                            AnonymousClass8EK.zzg = r3;
                        }
                        return r3;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw AnonymousClass001.A0D();
                }
            }
        }
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return C198729e6.A02.A00(cls).ByI(this, obj);
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zza = C198729e6.A02.A00(getClass()).zza(this);
        this.zza = zza;
        return zza;
    }

    public static Object A02(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw C90524aI.A0e("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw C90524aI.A0e("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final String A03(String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        for (int i = 0; i < str.length(); i++) {
            A0u.append(Character.toLowerCase(C165607th.A00(str, A0u, i)));
        }
        return A0u.toString();
    }

    public static void A04(C23119B5y b5y, StringBuilder sb, int i) {
        String str;
        int ordinal;
        Object obj;
        Method method;
        String A03;
        HashMap A0J = AnonymousClass001.A0J();
        HashMap A0J2 = AnonymousClass001.A0J();
        TreeSet treeSet = new TreeSet();
        for (Method A1O : b5y.getClass().getDeclaredMethods()) {
            C165607th.A1O(A1O, treeSet, A0J2, A0J);
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            if (A0C.startsWith("get")) {
                str = A0C.substring(3);
            } else {
                str = A0C;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String A0c = C90464aC.A0c(C165597tg.A0m(str), str.substring(1, str.length() - 4));
                method = (Method) A0J.get(A0C);
                if (method != null && method.getReturnType().equals(List.class)) {
                    A03 = A03(A0c);
                    A06(sb, i, A03, A02(method, b5y, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String A0c2 = C90464aC.A0c(C165597tg.A0m(str), str.substring(1, str.length() - 3));
                method = (Method) A0J.get(A0C);
                if (method != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && C165597tg.A1T(method)) {
                    A03 = A03(A0c2);
                    A06(sb, i, A03, A02(method, b5y, new Object[0]));
                }
            }
            if (A0J2.get(C90464aC.A0c("set", str)) != null && (!str.endsWith("Bytes") || !A0J.containsKey(C90464aC.A0c("get", str.substring(0, str.length() - 5))))) {
                String A0c3 = C90464aC.A0c(C165597tg.A0m(str), str.substring(1));
                Method method2 = (Method) A0J.get(C90464aC.A0c("get", str));
                Method method3 = (Method) A0J.get(C90464aC.A0c("has", str));
                if (method2 != null) {
                    Object A02 = A02(method2, b5y, new Object[0]);
                    if (method3 == null) {
                        if (A02 instanceof Boolean) {
                            ordinal = AnonymousClass000.A1X(A02);
                        } else if (A02 instanceof Integer) {
                            ordinal = AnonymousClass000.A0I(A02);
                        } else if (A02 instanceof Float) {
                            ordinal = (C36441kJ.A03(A02) > 0.0f ? 1 : (C36441kJ.A03(A02) == 0.0f ? 0 : -1));
                        } else if (A02 instanceof Double) {
                            ordinal = (C90504aG.A01(A02) > 0.0d ? 1 : (C90504aG.A01(A02) == 0.0d ? 0 : -1));
                        } else {
                            if (A02 instanceof String) {
                                obj = "";
                            } else if (A02 instanceof C21673AUw) {
                                obj = C21673AUw.A00;
                            } else if (A02 instanceof C23119B5y) {
                                if (A02 == ((C22893Axo) A02).Byz()) {
                                }
                            } else if (A02 instanceof Enum) {
                                ordinal = ((Enum) A02).ordinal();
                            }
                            if (A02.equals(obj)) {
                            }
                        }
                        if (ordinal == 0) {
                        }
                    } else if (!AnonymousClass000.A1X(A02(method3, b5y, new Object[0]))) {
                    }
                    A06(sb, i, A03(A0c3), A02);
                }
            }
        }
        C201569jt r3 = ((AnonymousClass8EX) b5y).zzb;
        if (r3 != null) {
            for (int i2 = 0; i2 < r3.A00; i2++) {
                A06(sb, i, String.valueOf(r3.A03[i2] >>> 3), r3.A04[i2]);
            }
        }
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("# ");
        A0u.append(obj);
        A04(this, A0u, 0);
        return A0u.toString();
    }
}
