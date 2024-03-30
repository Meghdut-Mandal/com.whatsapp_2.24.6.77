package X;

import android.os.ConditionVariable;
import android.text.TextUtils;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.9oI  reason: invalid class name and case insensitive filesystem */
public class C203559oI {
    public static final String A08 = A04("xｘ#＃~～");
    public static final Map A09;
    public static final Logger A0A = C165587tf.A0p(C203559oI.class);
    public static final Pattern A0B = Pattern.compile("(\\p{Nd})");
    public static final Pattern A0C;
    public static final Pattern A0D = Pattern.compile("\\(?\\$1\\)?");
    public static final Pattern A0E = Pattern.compile("(\\$\\d)");
    public static final Pattern A0F = Pattern.compile("(\\D+)");
    public static final Pattern A0G = Pattern.compile("[+＋]+");
    public static final Pattern A0H = Pattern.compile("[\\\\/] *x");
    public static final Pattern A0I = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");
    public static final Pattern A0J = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
    public static final Pattern A0K = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
    public static final Pattern A0L;
    public static final Pattern A0M = Pattern.compile("[+＋\\p{Nd}]");
    public static final Map A0N;
    public static final Pattern A0O = Pattern.compile("\\$CC");
    public static final Pattern A0P = Pattern.compile("\\$FG");
    public static final Pattern A0Q = Pattern.compile("\\$NP");
    public static volatile C203559oI A0R;
    public AnonymousClass9PS A00 = new AnonymousClass9PS(100);
    public AnonymousClass1N4 A01;
    public Map A02 = null;
    public final Map A03 = C165607th.A12();
    public final Map A04 = C165607th.A12();
    public final Set A05 = C36441kJ.A16();
    public final Set A06 = new HashSet(35);
    public final Set A07 = new HashSet(320);

    static {
        HashMap A0J2 = AnonymousClass001.A0J();
        A0J2.put('0', '0');
        A0J2.put('1', '1');
        A0J2.put('2', '2');
        A0J2.put('3', '3');
        A0J2.put('4', '4');
        A0J2.put('5', '5');
        A0J2.put('6', '6');
        A0J2.put('7', '7');
        A0J2.put('8', '8');
        A0J2.put('9', '9');
        HashMap hashMap = new HashMap(40);
        A07('2', hashMap, 'A');
        A07('2', hashMap, 'B');
        A07('2', hashMap, 'C');
        A07('3', hashMap, 'D');
        A07('3', hashMap, 'E');
        A07('3', hashMap, 'F');
        A07('4', hashMap, 'G');
        A07('4', hashMap, 'H');
        A07('4', hashMap, 'I');
        A07('5', hashMap, 'J');
        A07('5', hashMap, 'K');
        A07('5', hashMap, 'L');
        A07('6', hashMap, 'M');
        A07('6', hashMap, 'N');
        A07('6', hashMap, 'O');
        A07('7', hashMap, 'P');
        A07('7', hashMap, 'Q');
        A07('7', hashMap, 'R');
        A07('7', hashMap, 'S');
        A07('8', hashMap, 'T');
        A07('8', hashMap, 'U');
        A07('8', hashMap, 'V');
        A07('9', hashMap, 'W');
        A07('9', hashMap, 'X');
        A07('9', hashMap, 'Y');
        A07('9', hashMap, 'Z');
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        A0N = unmodifiableMap;
        HashMap hashMap2 = new HashMap(100);
        hashMap2.putAll(unmodifiableMap);
        hashMap2.putAll(A0J2);
        A09 = Collections.unmodifiableMap(hashMap2);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(Arrays.toString(unmodifiableMap.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        String A0q = AnonymousClass000.A0q(Arrays.toString(unmodifiableMap.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""), A0u);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*");
        A0u2.append(A0q);
        A0u2.append("\\p{Nd}");
        String A0q2 = AnonymousClass000.A0q("]*", A0u2);
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append(",");
        String A042 = A04(AnonymousClass000.A0q("xｘ#＃~～", A0u3));
        StringBuilder A0u4 = AnonymousClass000.A0u();
        A0u4.append("(?:");
        A0u4.append(A042);
        A0C = Pattern.compile(AnonymousClass000.A0q(")$", A0u4), 66);
        StringBuilder A0u5 = AnonymousClass000.A0u();
        AnonymousClass000.A1D(A0q2, "(?:", A042, A0u5);
        A0L = Pattern.compile(AnonymousClass000.A0q(")?", A0u5), 66);
    }

    public C203559oI(AnonymousClass1N4 r9) {
        HashMap hashMap = new HashMap(286);
        ArrayList A14 = C36441kJ.A14(25);
        A14.add("US");
        A14.add("AG");
        A14.add("AI");
        A14.add("AS");
        A14.add("BB");
        A14.add("BM");
        A14.add("BS");
        A14.add("CA");
        A14.add("DM");
        A14.add("DO");
        A14.add("GD");
        A14.add("GU");
        A14.add("JM");
        A14.add("KN");
        A14.add("KY");
        A14.add("LC");
        A14.add("MP");
        A14.add("MS");
        A14.add("PR");
        A14.add("SX");
        A14.add("TC");
        A14.add("TT");
        A14.add("VC");
        A14.add("VG");
        A14.add("VI");
        hashMap.put(1, A14);
        ArrayList A142 = C36441kJ.A14(2);
        A142.add("RU");
        A142.add("KZ");
        ArrayList A052 = A05(A142, hashMap, 7, 1);
        A052.add("EG");
        ArrayList A053 = A05(A052, hashMap, 20, 1);
        A053.add("ZA");
        ArrayList A054 = A05(A053, hashMap, 27, 1);
        A054.add("GR");
        ArrayList A055 = A05(A054, hashMap, 30, 1);
        A055.add("NL");
        ArrayList A056 = A05(A055, hashMap, 31, 1);
        A056.add("BE");
        ArrayList A057 = A05(A056, hashMap, 32, 1);
        A057.add("FR");
        ArrayList A058 = A05(A057, hashMap, 33, 1);
        A058.add("ES");
        ArrayList A059 = A05(A058, hashMap, 34, 1);
        A059.add("HU");
        ArrayList A0510 = A05(A059, hashMap, 36, 1);
        A0510.add("IT");
        ArrayList A0511 = A05(A0510, hashMap, 39, 1);
        A0511.add("RO");
        ArrayList A0512 = A05(A0511, hashMap, 40, 1);
        A0512.add("CH");
        ArrayList A0513 = A05(A0512, hashMap, 41, 1);
        A0513.add("AT");
        C36331k8.A1Q(A0513, hashMap, 43);
        ArrayList A143 = C36441kJ.A14(4);
        A143.add("GB");
        A143.add("GG");
        A143.add("IM");
        A143.add("JE");
        ArrayList A0514 = A05(A143, hashMap, 44, 1);
        A0514.add("DK");
        ArrayList A0515 = A05(A0514, hashMap, 45, 1);
        A0515.add("SE");
        ArrayList A0516 = A05(A0515, hashMap, 46, 2);
        A0516.add("NO");
        A0516.add("SJ");
        ArrayList A0517 = A05(A0516, hashMap, 47, 1);
        A0517.add("PL");
        ArrayList A0518 = A05(A0517, hashMap, 48, 1);
        A0518.add("DE");
        ArrayList A0519 = A05(A0518, hashMap, 49, 1);
        A0519.add("PE");
        ArrayList A0520 = A05(A0519, hashMap, 51, 1);
        A0520.add("MX");
        ArrayList A0521 = A05(A0520, hashMap, 52, 1);
        A0521.add("CU");
        ArrayList A0522 = A05(A0521, hashMap, 53, 1);
        A0522.add("AR");
        ArrayList A0523 = A05(A0522, hashMap, 54, 1);
        A0523.add("BR");
        ArrayList A0524 = A05(A0523, hashMap, 55, 1);
        A0524.add("CL");
        ArrayList A0525 = A05(A0524, hashMap, 56, 1);
        A0525.add("CO");
        ArrayList A0526 = A05(A0525, hashMap, 57, 1);
        A0526.add("VE");
        ArrayList A0527 = A05(A0526, hashMap, 58, 1);
        A0527.add("MY");
        C36331k8.A1Q(A0527, hashMap, 60);
        ArrayList A144 = C36441kJ.A14(3);
        A144.add("AU");
        A144.add("CC");
        A144.add("CX");
        ArrayList A0528 = A05(A144, hashMap, 61, 1);
        A0528.add("ID");
        ArrayList A0529 = A05(A0528, hashMap, 62, 1);
        A0529.add("PH");
        ArrayList A0530 = A05(A0529, hashMap, 63, 1);
        A0530.add("NZ");
        ArrayList A0531 = A05(A0530, hashMap, 64, 1);
        A0531.add("SG");
        ArrayList A0532 = A05(A0531, hashMap, 65, 1);
        A0532.add("TH");
        ArrayList A0533 = A05(A0532, hashMap, 66, 1);
        A0533.add("JP");
        ArrayList A0534 = A05(A0533, hashMap, 81, 1);
        A0534.add("KR");
        ArrayList A0535 = A05(A0534, hashMap, 82, 1);
        A0535.add("VN");
        ArrayList A0536 = A05(A0535, hashMap, 84, 1);
        A0536.add("CN");
        ArrayList A0537 = A05(A0536, hashMap, 86, 1);
        A0537.add("TR");
        ArrayList A0538 = A05(A0537, hashMap, 90, 1);
        A0538.add("IN");
        ArrayList A0539 = A05(A0538, hashMap, 91, 1);
        A0539.add("PK");
        ArrayList A0540 = A05(A0539, hashMap, 92, 1);
        A0540.add("AF");
        ArrayList A0541 = A05(A0540, hashMap, 93, 1);
        A0541.add("LK");
        ArrayList A0542 = A05(A0541, hashMap, 94, 1);
        A0542.add("MM");
        ArrayList A0543 = A05(A0542, hashMap, 95, 1);
        A0543.add("IR");
        ArrayList A0544 = A05(A0543, hashMap, 98, 1);
        A0544.add("SS");
        ArrayList A0545 = A05(A0544, hashMap, 211, 2);
        A0545.add("MA");
        A0545.add("EH");
        ArrayList A0546 = A05(A0545, hashMap, 212, 1);
        A0546.add("DZ");
        ArrayList A0547 = A05(A0546, hashMap, 213, 1);
        A0547.add("TN");
        ArrayList A0548 = A05(A0547, hashMap, 216, 1);
        A0548.add("LY");
        ArrayList A0549 = A05(A0548, hashMap, 218, 1);
        A0549.add("GM");
        ArrayList A0550 = A05(A0549, hashMap, 220, 1);
        A0550.add("SN");
        ArrayList A0551 = A05(A0550, hashMap, 221, 1);
        A0551.add("MR");
        ArrayList A0552 = A05(A0551, hashMap, 222, 1);
        A0552.add("ML");
        ArrayList A0553 = A05(A0552, hashMap, 223, 1);
        A0553.add("GN");
        ArrayList A0554 = A05(A0553, hashMap, 224, 1);
        A0554.add("CI");
        ArrayList A0555 = A05(A0554, hashMap, 225, 1);
        A0555.add("BF");
        ArrayList A0556 = A05(A0555, hashMap, 226, 1);
        A0556.add("NE");
        ArrayList A0557 = A05(A0556, hashMap, 227, 1);
        A0557.add("TG");
        ArrayList A0558 = A05(A0557, hashMap, 228, 1);
        A0558.add("BJ");
        ArrayList A0559 = A05(A0558, hashMap, 229, 1);
        A0559.add("MU");
        ArrayList A0560 = A05(A0559, hashMap, 230, 1);
        A0560.add("LR");
        ArrayList A0561 = A05(A0560, hashMap, 231, 1);
        A0561.add("SL");
        ArrayList A0562 = A05(A0561, hashMap, 232, 1);
        A0562.add("GH");
        ArrayList A0563 = A05(A0562, hashMap, 233, 1);
        A0563.add("NG");
        ArrayList A0564 = A05(A0563, hashMap, 234, 1);
        A0564.add("TD");
        ArrayList A0565 = A05(A0564, hashMap, 235, 1);
        A0565.add("CF");
        ArrayList A0566 = A05(A0565, hashMap, 236, 1);
        A0566.add("CM");
        ArrayList A0567 = A05(A0566, hashMap, 237, 1);
        A0567.add("CV");
        ArrayList A0568 = A05(A0567, hashMap, 238, 1);
        A0568.add("ST");
        ArrayList A0569 = A05(A0568, hashMap, 239, 1);
        A0569.add("GQ");
        ArrayList A0570 = A05(A0569, hashMap, 240, 1);
        A0570.add("GA");
        ArrayList A0571 = A05(A0570, hashMap, 241, 1);
        A0571.add("CG");
        ArrayList A0572 = A05(A0571, hashMap, 242, 1);
        A0572.add("CD");
        ArrayList A0573 = A05(A0572, hashMap, 243, 1);
        A0573.add("AO");
        ArrayList A0574 = A05(A0573, hashMap, 244, 1);
        A0574.add("GW");
        ArrayList A0575 = A05(A0574, hashMap, 245, 1);
        A0575.add("IO");
        ArrayList A0576 = A05(A0575, hashMap, 246, 1);
        A0576.add("AC");
        ArrayList A0577 = A05(A0576, hashMap, 247, 1);
        A0577.add("SC");
        ArrayList A0578 = A05(A0577, hashMap, 248, 1);
        A0578.add("SD");
        ArrayList A0579 = A05(A0578, hashMap, 249, 1);
        A0579.add("RW");
        ArrayList A0580 = A05(A0579, hashMap, 250, 1);
        A0580.add("ET");
        ArrayList A0581 = A05(A0580, hashMap, 251, 1);
        A0581.add("SO");
        ArrayList A0582 = A05(A0581, hashMap, 252, 1);
        A0582.add("DJ");
        ArrayList A0583 = A05(A0582, hashMap, 253, 1);
        A0583.add("KE");
        ArrayList A0584 = A05(A0583, hashMap, 254, 1);
        A0584.add("TZ");
        ArrayList A0585 = A05(A0584, hashMap, 255, 1);
        A0585.add("UG");
        ArrayList A0586 = A05(A0585, hashMap, 256, 1);
        A0586.add("BI");
        ArrayList A0587 = A05(A0586, hashMap, 257, 1);
        A0587.add("MZ");
        ArrayList A0588 = A05(A0587, hashMap, 258, 1);
        A0588.add("ZM");
        ArrayList A0589 = A05(A0588, hashMap, 260, 1);
        A0589.add("MG");
        ArrayList A0590 = A05(A0589, hashMap, 261, 2);
        A0590.add("RE");
        A0590.add("YT");
        ArrayList A0591 = A05(A0590, hashMap, 262, 1);
        A0591.add("ZW");
        ArrayList A0592 = A05(A0591, hashMap, 263, 1);
        A0592.add("NA");
        ArrayList A0593 = A05(A0592, hashMap, 264, 1);
        A0593.add("MW");
        ArrayList A0594 = A05(A0593, hashMap, 265, 1);
        A0594.add("LS");
        ArrayList A0595 = A05(A0594, hashMap, 266, 1);
        A0595.add("BW");
        ArrayList A0596 = A05(A0595, hashMap, 267, 1);
        A0596.add("SZ");
        ArrayList A0597 = A05(A0596, hashMap, 268, 1);
        A0597.add("KM");
        ArrayList A0598 = A05(A0597, hashMap, 269, 1);
        A0598.add("SH");
        ArrayList A0599 = A05(A0598, hashMap, 290, 1);
        A0599.add("ER");
        ArrayList A05100 = A05(A0599, hashMap, 291, 1);
        A05100.add("AW");
        ArrayList A05101 = A05(A05100, hashMap, 297, 1);
        A05101.add("FO");
        ArrayList A05102 = A05(A05101, hashMap, 298, 1);
        A05102.add("GL");
        ArrayList A05103 = A05(A05102, hashMap, 299, 1);
        A05103.add("GI");
        ArrayList A05104 = A05(A05103, hashMap, 350, 1);
        A05104.add("PT");
        ArrayList A05105 = A05(A05104, hashMap, 351, 1);
        A05105.add("LU");
        ArrayList A05106 = A05(A05105, hashMap, 352, 1);
        A05106.add("IE");
        ArrayList A05107 = A05(A05106, hashMap, 353, 1);
        A05107.add("IS");
        ArrayList A05108 = A05(A05107, hashMap, 354, 1);
        A05108.add("AL");
        ArrayList A05109 = A05(A05108, hashMap, 355, 1);
        A05109.add("MT");
        ArrayList A05110 = A05(A05109, hashMap, 356, 1);
        A05110.add("CY");
        ArrayList A05111 = A05(A05110, hashMap, 357, 2);
        A05111.add("FI");
        A05111.add("AX");
        ArrayList A05112 = A05(A05111, hashMap, 358, 1);
        A05112.add("BG");
        ArrayList A05113 = A05(A05112, hashMap, 359, 1);
        A05113.add("LT");
        ArrayList A05114 = A05(A05113, hashMap, 370, 1);
        A05114.add("LV");
        ArrayList A05115 = A05(A05114, hashMap, 371, 1);
        A05115.add("EE");
        ArrayList A05116 = A05(A05115, hashMap, 372, 1);
        A05116.add("MD");
        ArrayList A05117 = A05(A05116, hashMap, 373, 1);
        A05117.add("AM");
        ArrayList A05118 = A05(A05117, hashMap, 374, 1);
        A05118.add("BY");
        ArrayList A05119 = A05(A05118, hashMap, 375, 1);
        A05119.add("AD");
        ArrayList A05120 = A05(A05119, hashMap, 376, 1);
        A05120.add("MC");
        ArrayList A05121 = A05(A05120, hashMap, 377, 1);
        A05121.add("SM");
        ArrayList A05122 = A05(A05121, hashMap, 378, 1);
        A05122.add("VA");
        ArrayList A05123 = A05(A05122, hashMap, 379, 1);
        A05123.add("UA");
        ArrayList A05124 = A05(A05123, hashMap, 380, 1);
        A05124.add("RS");
        ArrayList A05125 = A05(A05124, hashMap, 381, 1);
        A05125.add("ME");
        ArrayList A05126 = A05(A05125, hashMap, 382, 1);
        A05126.add("HR");
        ArrayList A05127 = A05(A05126, hashMap, 385, 1);
        A05127.add("SI");
        ArrayList A05128 = A05(A05127, hashMap, 386, 1);
        A05128.add("BA");
        ArrayList A05129 = A05(A05128, hashMap, 387, 1);
        A05129.add("MK");
        ArrayList A05130 = A05(A05129, hashMap, 389, 1);
        A05130.add("CZ");
        ArrayList A05131 = A05(A05130, hashMap, 420, 1);
        A05131.add("SK");
        ArrayList A05132 = A05(A05131, hashMap, 421, 1);
        A05132.add("LI");
        ArrayList A05133 = A05(A05132, hashMap, 423, 1);
        A05133.add("FK");
        ArrayList A05134 = A05(A05133, hashMap, 500, 1);
        A05134.add("BZ");
        ArrayList A05135 = A05(A05134, hashMap, 501, 1);
        A05135.add("GT");
        ArrayList A05136 = A05(A05135, hashMap, 502, 1);
        A05136.add("SV");
        ArrayList A05137 = A05(A05136, hashMap, 503, 1);
        A05137.add("HN");
        ArrayList A05138 = A05(A05137, hashMap, 504, 1);
        A05138.add("NI");
        ArrayList A05139 = A05(A05138, hashMap, 505, 1);
        A05139.add("CR");
        ArrayList A05140 = A05(A05139, hashMap, 506, 1);
        A05140.add("PA");
        ArrayList A05141 = A05(A05140, hashMap, 507, 1);
        A05141.add("PM");
        ArrayList A05142 = A05(A05141, hashMap, 508, 1);
        A05142.add("HT");
        ArrayList A05143 = A05(A05142, hashMap, 509, 3);
        A05143.add("GP");
        A05143.add("BL");
        A05143.add("MF");
        ArrayList A05144 = A05(A05143, hashMap, 590, 1);
        A05144.add("BO");
        ArrayList A05145 = A05(A05144, hashMap, 591, 1);
        A05145.add("GY");
        ArrayList A05146 = A05(A05145, hashMap, 592, 1);
        A05146.add("EC");
        ArrayList A05147 = A05(A05146, hashMap, 593, 1);
        A05147.add("GF");
        ArrayList A05148 = A05(A05147, hashMap, 594, 1);
        A05148.add("PY");
        ArrayList A05149 = A05(A05148, hashMap, 595, 1);
        A05149.add("MQ");
        ArrayList A05150 = A05(A05149, hashMap, 596, 1);
        A05150.add("SR");
        ArrayList A05151 = A05(A05150, hashMap, 597, 1);
        A05151.add("UY");
        ArrayList A05152 = A05(A05151, hashMap, 598, 2);
        A05152.add("CW");
        A05152.add("BQ");
        ArrayList A05153 = A05(A05152, hashMap, 599, 1);
        A05153.add("TL");
        ArrayList A05154 = A05(A05153, hashMap, 670, 1);
        A05154.add("NF");
        ArrayList A05155 = A05(A05154, hashMap, 672, 1);
        A05155.add("BN");
        ArrayList A05156 = A05(A05155, hashMap, 673, 1);
        A05156.add("NR");
        ArrayList A05157 = A05(A05156, hashMap, 674, 1);
        A05157.add("PG");
        ArrayList A05158 = A05(A05157, hashMap, 675, 1);
        A05158.add("TO");
        ArrayList A05159 = A05(A05158, hashMap, 676, 1);
        A05159.add("SB");
        ArrayList A05160 = A05(A05159, hashMap, 677, 1);
        A05160.add("VU");
        ArrayList A05161 = A05(A05160, hashMap, 678, 1);
        A05161.add("FJ");
        ArrayList A05162 = A05(A05161, hashMap, 679, 1);
        A05162.add("PW");
        ArrayList A05163 = A05(A05162, hashMap, 680, 1);
        A05163.add("WF");
        ArrayList A05164 = A05(A05163, hashMap, 681, 1);
        A05164.add("CK");
        ArrayList A05165 = A05(A05164, hashMap, 682, 1);
        A05165.add("NU");
        ArrayList A05166 = A05(A05165, hashMap, 683, 1);
        A05166.add("WS");
        ArrayList A05167 = A05(A05166, hashMap, 685, 1);
        A05167.add("KI");
        ArrayList A05168 = A05(A05167, hashMap, 686, 1);
        A05168.add("NC");
        ArrayList A05169 = A05(A05168, hashMap, 687, 1);
        A05169.add("TV");
        ArrayList A05170 = A05(A05169, hashMap, 688, 1);
        A05170.add("PF");
        ArrayList A05171 = A05(A05170, hashMap, 689, 1);
        A05171.add("TK");
        ArrayList A05172 = A05(A05171, hashMap, 690, 1);
        A05172.add("FM");
        ArrayList A05173 = A05(A05172, hashMap, 691, 1);
        A05173.add("MH");
        ArrayList A05174 = A05(A05173, hashMap, 692, 1);
        A05174.add("001");
        ArrayList A05175 = A05(A05174, hashMap, 800, 1);
        A05175.add("001");
        ArrayList A05176 = A05(A05175, hashMap, 808, 1);
        A05176.add("KP");
        ArrayList A05177 = A05(A05176, hashMap, 850, 1);
        A05177.add("HK");
        ArrayList A05178 = A05(A05177, hashMap, 852, 1);
        A05178.add("MO");
        ArrayList A05179 = A05(A05178, hashMap, 853, 1);
        A05179.add("KH");
        ArrayList A05180 = A05(A05179, hashMap, 855, 1);
        A05180.add("LA");
        ArrayList A05181 = A05(A05180, hashMap, 856, 1);
        A05181.add("001");
        ArrayList A05182 = A05(A05181, hashMap, 870, 1);
        A05182.add("001");
        ArrayList A05183 = A05(A05182, hashMap, 878, 1);
        A05183.add("BD");
        ArrayList A05184 = A05(A05183, hashMap, 880, 1);
        A05184.add("001");
        ArrayList A05185 = A05(A05184, hashMap, 881, 1);
        A05185.add("001");
        ArrayList A05186 = A05(A05185, hashMap, 882, 1);
        A05186.add("001");
        ArrayList A05187 = A05(A05186, hashMap, 883, 1);
        A05187.add("TW");
        ArrayList A05188 = A05(A05187, hashMap, 886, 1);
        A05188.add("001");
        ArrayList A05189 = A05(A05188, hashMap, 888, 1);
        A05189.add("MV");
        ArrayList A05190 = A05(A05189, hashMap, 960, 1);
        A05190.add("LB");
        ArrayList A05191 = A05(A05190, hashMap, 961, 1);
        A05191.add("JO");
        ArrayList A05192 = A05(A05191, hashMap, 962, 1);
        A05192.add("SY");
        ArrayList A05193 = A05(A05192, hashMap, 963, 1);
        A05193.add("IQ");
        ArrayList A05194 = A05(A05193, hashMap, 964, 1);
        A05194.add("KW");
        ArrayList A05195 = A05(A05194, hashMap, 965, 1);
        A05195.add("SA");
        ArrayList A05196 = A05(A05195, hashMap, 966, 1);
        A05196.add("YE");
        ArrayList A05197 = A05(A05196, hashMap, 967, 1);
        A05197.add("OM");
        ArrayList A05198 = A05(A05197, hashMap, 968, 1);
        A05198.add("PS");
        ArrayList A05199 = A05(A05198, hashMap, 970, 1);
        A05199.add("AE");
        ArrayList A05200 = A05(A05199, hashMap, 971, 1);
        A05200.add("IL");
        ArrayList A05201 = A05(A05200, hashMap, 972, 1);
        A05201.add("BH");
        ArrayList A05202 = A05(A05201, hashMap, 973, 1);
        A05202.add("QA");
        ArrayList A05203 = A05(A05202, hashMap, 974, 1);
        A05203.add("BT");
        ArrayList A05204 = A05(A05203, hashMap, 975, 1);
        A05204.add("MN");
        ArrayList A05205 = A05(A05204, hashMap, 976, 1);
        A05205.add("NP");
        ArrayList A05206 = A05(A05205, hashMap, 977, 1);
        A05206.add("001");
        ArrayList A05207 = A05(A05206, hashMap, 979, 1);
        A05207.add("TJ");
        ArrayList A05208 = A05(A05207, hashMap, 992, 1);
        A05208.add("TM");
        ArrayList A05209 = A05(A05208, hashMap, 993, 1);
        A05209.add("AZ");
        ArrayList A05210 = A05(A05209, hashMap, 994, 1);
        A05210.add("GE");
        ArrayList A05211 = A05(A05210, hashMap, 995, 1);
        A05211.add("KG");
        ArrayList A05212 = A05(A05211, hashMap, 996, 1);
        A05212.add("UZ");
        C36331k8.A1Q(A05212, hashMap, 998);
        this.A01 = r9;
        this.A02 = hashMap;
        Iterator A10 = C36371kC.A10(hashMap);
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            List list = (List) A11.getValue();
            if (list.size() != 1 || !"001".equals(C36391kE.A0t(list))) {
                this.A07.addAll(list);
            } else {
                this.A05.add(A11.getKey());
            }
        }
        if (this.A07.remove("001")) {
            A0A.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.A06.addAll((Collection) hashMap.get(1));
        ConditionVariable conditionVariable = C18740tg.A00;
    }

    public static C203559oI A00() {
        if (A0R == null) {
            synchronized (C203559oI.class) {
                if (A0R == null) {
                    A0R = new C203559oI(AnonymousClass1N4.A00());
                }
            }
        }
        return A0R;
    }

    private Integer A01(AU4 au4, String str) {
        AU2 au2 = au4.generalDesc_;
        if (au2.hasNationalNumberPattern && A09(au2, str)) {
            if (A09(au4.personalNumber_, str)) {
                return C023109s.A0W;
            }
            if (A09(au4.tollFree_, str)) {
                return C023109s.A0G;
            }
            if (A09(au4.sharedCost_, str)) {
                return C023109s.A0S;
            }
            if (A09(au4.voip_, str)) {
                return C023109s.A0V;
            }
            if (A09(au4.premiumRate_, str)) {
                return C023109s.A0R;
            }
            if (A09(au4.pager_, str)) {
                return C023109s.A0X;
            }
            if (A09(au4.uan_, str)) {
                return C023109s.A0Y;
            }
            if (A09(au4.voicemail_, str)) {
                return C023109s.A02;
            }
            boolean A092 = A09(au4.fixedLine_, str);
            boolean z = au4.sameMobileAndFixedLinePattern_;
            if (A092) {
                if (z || A09(au4.mobile_, str)) {
                    return C023109s.A0C;
                }
                return C023109s.A00;
            } else if (!z && A09(au4.mobile_, str)) {
                return C023109s.A01;
            }
        }
        return C023109s.A03;
    }

    public static String A02(AUN aun) {
        String str = "0";
        String str2 = "";
        if (aun.italianLeadingZero_) {
            str2 = str;
        }
        StringBuilder A0i = C90524aI.A0i(str2);
        if (!aun.secondLeadingZero_) {
            str = "";
        }
        A0i.append(str);
        return C36411kG.A11(A0i, aun.nationalNumber_);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0159 A[Catch:{ 172 -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.C203559oI r8, X.AUN r9, java.lang.String r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            if (r10 == 0) goto L_0x0244
            int r1 = r10.length()
            r0 = 250(0xfa, float:3.5E-43)
            if (r1 > r0) goto L_0x023a
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r0 = ";phone-context="
            int r3 = r10.indexOf(r0)
            if (r3 <= 0) goto L_0x00fb
            int r2 = r3 + 15
            char r1 = r10.charAt(r2)
            r0 = 43
            if (r1 != r0) goto L_0x002f
            r0 = 59
            int r0 = r10.indexOf(r0, r2)
            if (r0 <= 0) goto L_0x00f5
            java.lang.String r0 = r10.substring(r2, r0)
        L_0x002c:
            r4.append(r0)
        L_0x002f:
            java.lang.String r0 = "tel:"
            int r0 = r10.indexOf(r0)
            int r0 = r0 + 4
            java.lang.String r6 = r10.substring(r0, r3)
        L_0x003b:
            r4.append(r6)
            java.lang.String r0 = ";isub="
            int r1 = r4.indexOf(r0)
            if (r1 <= 0) goto L_0x004d
            int r0 = r4.length()
            r4.delete(r1, r0)
        L_0x004d:
            java.lang.String r2 = r4.toString()
            int r1 = r2.length()
            r0 = 2
            if (r1 < r0) goto L_0x0230
            java.util.regex.Pattern r5 = A0L
            boolean r0 = X.C36361kB.A1Z(r2, r5)
            if (r0 == 0) goto L_0x0230
            r7 = r8
            r3 = r11
            if (r13 == 0) goto L_0x0072
            java.lang.String r1 = r4.toString()
            if (r11 == 0) goto L_0x00d7
            java.util.Set r0 = r8.A07
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto L_0x00d7
        L_0x0072:
            if (r12 == 0) goto L_0x007c
            java.util.Objects.requireNonNull(r10)
            r0 = 1
            r9.hasRawInput = r0
            r9.rawInput_ = r10
        L_0x007c:
            java.util.regex.Pattern r0 = A0C
            java.util.regex.Matcher r6 = r0.matcher(r4)
            boolean r0 = r6.find()
            if (r0 == 0) goto L_0x00d4
            r1 = 0
            int r0 = r6.start()
            java.lang.String r2 = r4.substring(r1, r0)
            int r1 = r2.length()
            r0 = 2
            if (r1 < r0) goto L_0x00d4
            boolean r0 = X.C36361kB.A1Z(r2, r5)
            if (r0 == 0) goto L_0x00d4
            int r2 = r6.groupCount()
            r1 = 1
        L_0x00a3:
            if (r1 > r2) goto L_0x00d4
            java.lang.String r0 = r6.group(r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.String r2 = r6.group(r1)
            int r1 = r6.start()
            int r0 = r4.length()
            r4.delete(r1, r0)
        L_0x00ba:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x00c8
            java.util.Objects.requireNonNull(r2)
            r0 = 1
            r9.hasExtension = r0
            r9.extension_ = r2
        L_0x00c8:
            X.AU4 r8 = r8.A0E(r11)
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()
            goto L_0x014f
        L_0x00d1:
            int r1 = r1 + 1
            goto L_0x00a3
        L_0x00d4:
            java.lang.String r2 = ""
            goto L_0x00ba
        L_0x00d7:
            if (r1 == 0) goto L_0x00eb
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00eb
            java.util.regex.Pattern r0 = A0G
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.lookingAt()
            if (r0 != 0) goto L_0x0072
        L_0x00eb:
            X.8zA r2 = X.C188178zA.INVALID_COUNTRY_CODE
            java.lang.String r1 = "Missing or invalid default region."
            X.172 r0 = new X.172
            r0.<init>(r2, r1)
            throw r0
        L_0x00f5:
            java.lang.String r0 = r10.substring(r2)
            goto L_0x002c
        L_0x00fb:
            java.util.regex.Pattern r0 = A0M
            java.util.regex.Matcher r1 = r0.matcher(r10)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x014b
            int r0 = r1.start()
            java.lang.String r6 = r10.substring(r0)
            java.util.regex.Pattern r0 = A0J
            java.util.regex.Matcher r1 = r0.matcher(r6)
            boolean r0 = r1.find()
            r5 = 0
            if (r0 == 0) goto L_0x0135
            int r0 = r1.start()
            java.lang.String r6 = r6.substring(r5, r0)
            java.util.logging.Logger r3 = A0A
            java.util.logging.Level r2 = java.util.logging.Level.FINER
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Stripped trailing characters: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r6, r1)
            r3.log(r2, r0)
        L_0x0135:
            java.util.regex.Pattern r0 = A0H
            java.util.regex.Matcher r1 = r0.matcher(r6)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x003b
            int r0 = r1.start()
            java.lang.String r6 = r6.substring(r5, r0)
            goto L_0x003b
        L_0x014b:
            java.lang.String r6 = ""
            goto L_0x003b
        L_0x014f:
            java.lang.String r10 = r4.toString()     // Catch:{ 172 -> 0x015a }
            int r5 = r7.A0A(r8, r9, r10, r11, r12)     // Catch:{ 172 -> 0x015a }
            if (r5 != 0) goto L_0x0187
            goto L_0x01a3
        L_0x015a:
            r5 = move-exception
            java.util.regex.Pattern r1 = A0G
            java.lang.String r0 = r4.toString()
            java.util.regex.Matcher r1 = r1.matcher(r0)
            X.8zA r0 = r5.errorType
            X.8zA r2 = X.C188178zA.INVALID_COUNTRY_CODE
            if (r0 != r2) goto L_0x0226
            boolean r0 = r1.lookingAt()
            if (r0 == 0) goto L_0x0226
            int r0 = r1.end()
            java.lang.String r10 = r4.substring(r0)
            int r5 = r7.A0A(r8, r9, r10, r11, r12)
            if (r5 != 0) goto L_0x0187
            java.lang.String r1 = "Could not interpret numbers after plus-sign."
            X.172 r0 = new X.172
            r0.<init>(r2, r1)
            throw r0
        L_0x0187:
            java.lang.String r1 = r7.A0I(r5)
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x01b2
            java.lang.String r0 = "001"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x019e
            X.AU4 r8 = r7.A0D(r5)
            goto L_0x01b2
        L_0x019e:
            X.AU4 r8 = r7.A0E(r1)
            goto L_0x01b2
        L_0x01a3:
            A08(r4)
            r11.append(r4)
            if (r3 == 0) goto L_0x0202
            int r1 = r8.countryCode_
            r0 = 1
            r9.hasCountryCode = r0
            r9.countryCode_ = r1
        L_0x01b2:
            int r0 = r11.length()
            java.lang.String r3 = "The string supplied is too short to be a phone number."
            r2 = 2
            if (r0 < r2) goto L_0x021e
            if (r8 == 0) goto L_0x01d2
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            r7.A0L(r8, r11, r0)
            if (r12 == 0) goto L_0x01d2
            java.lang.String r1 = r0.toString()
            java.util.Objects.requireNonNull(r1)
            r0 = 1
            r9.hasPreferredDomesticCarrierCode = r0
            r9.preferredDomesticCarrierCode_ = r1
        L_0x01d2:
            int r1 = r11.length()
            if (r1 < r2) goto L_0x0216
            r0 = 16
            if (r1 > r0) goto L_0x020c
            r0 = 0
            char r0 = r11.charAt(r0)
            r2 = 48
            if (r0 != r2) goto L_0x01f4
            r1 = 1
            r9.hasItalianLeadingZero = r1
            r9.italianLeadingZero_ = r1
            char r0 = r11.charAt(r1)
            if (r0 != r2) goto L_0x01f4
            r9.hasSecondLeadingZero = r1
            r9.secondLeadingZero_ = r1
        L_0x01f4:
            java.lang.String r0 = r11.toString()
            long r1 = java.lang.Long.parseLong(r0)
            r0 = 1
            r9.hasNationalNumber = r0
            r9.nationalNumber_ = r1
            return
        L_0x0202:
            if (r12 == 0) goto L_0x01b2
            r0 = 0
            r9.hasCountryCodeSource = r0
            X.8yk r0 = X.C187918yk.FROM_NUMBER_WITH_PLUS_SIGN
            r9.countryCodeSource_ = r0
            goto L_0x01b2
        L_0x020c:
            X.8zA r2 = X.C188178zA.TOO_LONG
            java.lang.String r1 = "The string supplied is too long to be a phone number."
            X.172 r0 = new X.172
            r0.<init>(r2, r1)
            throw r0
        L_0x0216:
            X.8zA r1 = X.C188178zA.TOO_SHORT_NSN
            X.172 r0 = new X.172
            r0.<init>(r1, r3)
            throw r0
        L_0x021e:
            X.8zA r1 = X.C188178zA.TOO_SHORT_NSN
            X.172 r0 = new X.172
            r0.<init>(r1, r3)
            throw r0
        L_0x0226:
            X.8zA r2 = r5.errorType
            java.lang.String r1 = r5.message
            X.172 r0 = new X.172
            r0.<init>(r2, r1)
            throw r0
        L_0x0230:
            X.8zA r2 = X.C188178zA.NOT_A_NUMBER
            java.lang.String r1 = "The string supplied did not seem to be a phone number."
            X.172 r0 = new X.172
            r0.<init>(r2, r1)
            throw r0
        L_0x023a:
            X.8zA r2 = X.C188178zA.TOO_LONG
            java.lang.String r1 = "The string supplied was too long to parse."
            X.172 r0 = new X.172
            r0.<init>(r2, r1)
            throw r0
        L_0x0244:
            X.8zA r2 = X.C188178zA.NOT_A_NUMBER
            java.lang.String r1 = "The phone number supplied was null."
            X.172 r0 = new X.172
            r0.<init>(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203559oI.A06(X.9oI, X.AUN, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    private boolean A09(AU2 au2, String str) {
        AnonymousClass9PS r1 = this.A00;
        Matcher matcher = r1.A00(au2.possibleNumberPattern_).matcher(str);
        Matcher matcher2 = r1.A00(au2.nationalNumberPattern_).matcher(str);
        if (!matcher.matches() || !matcher2.matches()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        return (X.AU4) r2.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AU4 A0D(int r4) {
        /*
            r3 = this;
            java.util.Map r2 = r3.A03
            monitor-enter(r2)
            java.util.Map r0 = r3.A02     // Catch:{ all -> 0x0025 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0025 }
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0012
            r0 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            return r0
        L_0x0012:
            boolean r0 = r2.containsKey(r1)     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "001"
            r3.A0K(r0, r4)     // Catch:{ all -> 0x0025 }
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            java.lang.Object r0 = r2.get(r1)
            X.AU4 r0 = (X.AU4) r0
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203559oI.A0D(int):X.AU4");
    }

    public AU4 A0E(String str) {
        if (str == null || !this.A07.contains(str)) {
            return null;
        }
        Map map = this.A04;
        AU4 au4 = (AU4) map.get(str);
        if (au4 != null) {
            return au4;
        }
        synchronized (map) {
            if (!map.containsKey(str)) {
                A0K(str, 0);
            }
        }
        return (AU4) map.get(str);
    }

    public AUN A0F(String str, String str2) {
        AUN aun = new AUN();
        A06(this, aun, str, str2, false, true);
        return aun;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (r2 == r1) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer A0G(X.AUN r6, X.AUN r7) {
        /*
            r5 = this;
            X.AUN r4 = new X.AUN
            r4.<init>()
            r4.A00(r6)
            X.AUN r3 = new X.AUN
            r3.<init>()
            r3.A00(r7)
            r1 = 0
            r4.hasRawInput = r1
            java.lang.String r2 = ""
            r4.rawInput_ = r2
            r4.hasCountryCodeSource = r1
            X.8yk r0 = X.C187918yk.FROM_NUMBER_WITH_PLUS_SIGN
            r4.countryCodeSource_ = r0
            r4.hasPreferredDomesticCarrierCode = r1
            r4.preferredDomesticCarrierCode_ = r2
            r3.hasRawInput = r1
            r3.rawInput_ = r2
            r3.hasCountryCodeSource = r1
            r3.countryCodeSource_ = r0
            r3.hasPreferredDomesticCarrierCode = r1
            r3.preferredDomesticCarrierCode_ = r2
            boolean r0 = r4.hasExtension
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r4.extension_
            int r0 = r0.length()
            if (r0 != 0) goto L_0x003d
            r4.hasExtension = r1
            r4.extension_ = r2
        L_0x003d:
            boolean r1 = r3.hasExtension
            if (r1 == 0) goto L_0x004e
            java.lang.String r0 = r3.extension_
            int r0 = r0.length()
            if (r0 != 0) goto L_0x004e
            r1 = 0
            r3.hasExtension = r1
            r3.extension_ = r2
        L_0x004e:
            boolean r0 = r4.hasExtension
            if (r0 == 0) goto L_0x0061
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = r4.extension_
            java.lang.String r0 = r3.extension_
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0061
        L_0x005e:
            java.lang.Integer r0 = X.C023109s.A01
            return r0
        L_0x0061:
            int r2 = r4.countryCode_
            int r1 = r3.countryCode_
            if (r2 == 0) goto L_0x0072
            if (r1 == 0) goto L_0x0072
            boolean r0 = r4.A01(r3)
            if (r0 == 0) goto L_0x0080
            java.lang.Integer r0 = X.C023109s.A0R
            return r0
        L_0x0072:
            r0 = 1
            r4.hasCountryCode = r0
            r4.countryCode_ = r1
            boolean r0 = r4.A01(r3)
            if (r0 == 0) goto L_0x0082
            java.lang.Integer r0 = X.C023109s.A0G
            return r0
        L_0x0080:
            if (r2 != r1) goto L_0x005e
        L_0x0082:
            long r0 = r4.nationalNumber_
            java.lang.String r2 = java.lang.String.valueOf(r0)
            long r0 = r3.nationalNumber_
            java.lang.String r1 = java.lang.String.valueOf(r0)
            boolean r0 = r2.endsWith(r1)
            if (r0 != 0) goto L_0x009a
            boolean r0 = r1.endsWith(r2)
            if (r0 == 0) goto L_0x005e
        L_0x009a:
            java.lang.Integer r0 = X.C023109s.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203559oI.A0G(X.AUN, X.AUN):java.lang.Integer");
    }

    public Integer A0H(AUN aun, String str) {
        String str2 = str;
        try {
            return A0G(aun, A0F(str, "ZZ"));
        } catch (AnonymousClass172 e) {
            if (e.errorType == C188178zA.INVALID_COUNTRY_CODE) {
                String A0I2 = A0I(aun.countryCode_);
                try {
                    if (!A0I2.equals("ZZ")) {
                        Integer A0G2 = A0G(aun, A0F(str, A0I2));
                        if (A0G2 == C023109s.A0R) {
                            return C023109s.A0G;
                        }
                        return A0G2;
                    }
                    AUN aun2 = new AUN();
                    A06(this, aun2, str2, (String) null, false, false);
                    return A0G(aun, aun2);
                } catch (AnonymousClass172 unused) {
                    return C023109s.A00;
                }
            }
            return C023109s.A00;
        }
    }

    public String A0I(int i) {
        List list = (List) C36371kC.A0r(this.A02, i);
        if (list == null) {
            return "ZZ";
        }
        return (String) C36391kE.A0t(list);
    }

    public String A0J(AUN aun, Integer num) {
        AU4 A0E2;
        List list;
        String str;
        if (aun.nationalNumber_ == 0 && aun.hasRawInput) {
            String str2 = aun.rawInput_;
            if (str2.length() > 0) {
                return str2;
            }
        }
        StringBuilder A0h = C90524aI.A0h(20);
        A0h.setLength(0);
        int i = aun.countryCode_;
        String A022 = A02(aun);
        if (num == C023109s.A00) {
            A0h.append(A022);
            A0h.insert(0, i);
            A0h.insert(0, '+');
        } else if (!C90484aE.A1Y(this.A02, i)) {
            A0h.append(A022);
        } else {
            String A0I2 = A0I(i);
            if ("001".equals(A0I2)) {
                A0E2 = A0D(i);
            } else {
                A0E2 = A0E(A0I2);
            }
            C18740tg.A06(A0E2);
            if (A0E2.intlNumberFormat_.size() != 0) {
                Integer num2 = C023109s.A0C;
                list = A0E2.intlNumberFormat_;
            } else {
                list = A0E2.numberFormat_;
            }
            AU3 A0C2 = A0C(A022, list);
            if (A0C2 != null) {
                String str3 = A0C2.format_;
                Matcher matcher = this.A00.A00(A0C2.pattern_).matcher(A022);
                Integer num3 = C023109s.A0C;
                A022 = matcher.replaceAll(str3);
                Integer num4 = C023109s.A0G;
            }
            A0h.append(A022);
            if (aun.hasExtension) {
                String str4 = aun.extension_;
                if (str4.length() > 0) {
                    Integer num5 = C023109s.A0G;
                    if (A0E2.hasPreferredExtnPrefix) {
                        str = A0E2.preferredExtnPrefix_;
                    } else {
                        str = " ext. ";
                    }
                    A0h.append(str);
                    A0h.append(str4);
                }
            }
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    A0h.insert(0, " ");
                } else if (intValue == 3) {
                    A0h.insert(0, "-");
                    A0h.insert(0, i);
                    A0h.insert(0, '+');
                    A0h.insert(0, "tel:");
                }
            }
            A0h.insert(0, i);
            A0h.insert(0, '+');
        }
        return A0h.toString();
    }

    public void A0K(String str, int i) {
        Map map;
        Object obj;
        boolean equals = "001".equals(str);
        AnonymousClass3O9 A022 = this.A01.A02(str);
        if (A022 == null) {
            A0A.log(Level.WARNING, AnonymousClass000.A0p("phonenumberutil/empty metadata: ", str, AnonymousClass000.A0u()));
            return;
        }
        AU4 au4 = new AU4();
        String str2 = A022.A02;
        au4.hasId = true;
        au4.id_ = str2;
        int i2 = A022.A00;
        au4.hasCountryCode = true;
        au4.countryCode_ = i2;
        String str3 = A022.A01;
        au4.hasInternationalPrefix = true;
        au4.internationalPrefix_ = str3;
        LinkedList A0l = C90524aI.A0l();
        String[] strArr = A022.A09;
        if (strArr != null) {
            for (int i3 = 0; i3 < strArr.length; i3++) {
                AU3 au3 = new AU3();
                String str4 = strArr[i3];
                au3.hasPattern = true;
                au3.pattern_ = str4;
                String str5 = A022.A07[i3];
                au3.hasFormat = true;
                au3.format_ = str5;
                String[] strArr2 = A022.A08;
                if (strArr2 != null && i3 < strArr2.length && strArr2[i3] != null && !strArr2[i3].equals("N/A")) {
                    for (String str6 : TextUtils.split(strArr2[i3], "#")) {
                        Objects.requireNonNull(str6);
                        au3.leadingDigitsPattern_.add(str6);
                    }
                }
                Objects.requireNonNull(au3);
                au4.intlNumberFormat_.add(au3);
                Objects.requireNonNull(au3);
                au4.numberFormat_.add(au3);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("(");
                A0u.append(au3.pattern_);
                A0l.add(C90474aD.A0f(A0u));
            }
        }
        AU2 au2 = new AU2();
        String join = TextUtils.join("|", A0l);
        au2.hasNationalNumberPattern = true;
        au2.nationalNumberPattern_ = join;
        au2.hasPossibleNumberPattern = true;
        au2.possibleNumberPattern_ = join;
        Objects.requireNonNull(au2);
        au4.hasGeneralDesc = true;
        au4.generalDesc_ = au2;
        Objects.requireNonNull(au2);
        au4.hasPersonalNumber = true;
        au4.personalNumber_ = au2;
        if (equals) {
            map = this.A03;
            obj = Integer.valueOf(i);
        } else {
            map = this.A04;
            obj = str;
        }
        map.put(obj, au4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r1 != r0.countryCode_) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0N(X.AUN r7) {
        /*
            r6 = this;
            int r5 = r7.countryCode_
            java.util.Map r0 = r6.A02
            java.lang.Object r2 = X.C36371kC.A0r(r0, r5)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x006d
            java.lang.String r4 = A02(r7)
            java.util.logging.Logger r3 = A0A
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Missing/invalid country_code ("
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ") for number "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r1)
            r3.log(r2, r0)
        L_0x0029:
            r5 = 0
        L_0x002a:
            int r1 = r7.countryCode_
            java.lang.String r0 = "001"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0068
            X.AU4 r3 = r6.A0D(r1)
        L_0x0038:
            r2 = 0
            if (r3 == 0) goto L_0x0047
            if (r0 != 0) goto L_0x0048
            X.AU4 r0 = r6.A0E(r5)
            if (r0 == 0) goto L_0x00b4
            int r0 = r0.countryCode_
            if (r1 == r0) goto L_0x0048
        L_0x0047:
            return r2
        L_0x0048:
            X.AU2 r0 = r3.generalDesc_
            java.lang.String r1 = A02(r7)
            boolean r0 = r0.hasNationalNumberPattern
            if (r0 != 0) goto L_0x005f
            int r1 = r1.length()
            r0 = 2
            if (r1 <= r0) goto L_0x0047
            r0 = 16
            if (r1 > r0) goto L_0x0047
        L_0x005d:
            r2 = 1
            return r2
        L_0x005f:
            java.lang.Integer r1 = r6.A01(r3, r1)
            java.lang.Integer r0 = X.C023109s.A03
            if (r1 == r0) goto L_0x0047
            goto L_0x005d
        L_0x0068:
            X.AU4 r3 = r6.A0E(r5)
            goto L_0x0038
        L_0x006d:
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L_0x007b
            java.lang.Object r5 = X.C36391kE.A0t(r2)
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x002a
        L_0x007b:
            java.lang.String r4 = A02(r7)
            java.util.Iterator r3 = r2.iterator()
        L_0x0083:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.String r5 = X.AnonymousClass001.A0C(r3)
            X.AU4 r2 = r6.A0E(r5)
            if (r2 == 0) goto L_0x0083
            boolean r0 = r2.hasLeadingDigits
            if (r0 == 0) goto L_0x00aa
            X.9PS r1 = r6.A00
            java.lang.String r0 = r2.leadingDigits_
            java.util.regex.Pattern r0 = r1.A00(r0)
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r0 = r0.lookingAt()
            if (r0 == 0) goto L_0x0083
            goto L_0x002a
        L_0x00aa:
            java.lang.Integer r1 = r6.A01(r2, r4)
            java.lang.Integer r0 = X.C023109s.A03
            if (r1 == r0) goto L_0x0083
            goto L_0x002a
        L_0x00b4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid region code: "
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203559oI.A0N(X.AUN):boolean");
    }

    public static String A03(String str) {
        StringBuilder A0h = C90524aI.A0h(str.length());
        for (char digit : str.toCharArray()) {
            int digit2 = Character.digit(digit, 10);
            if (digit2 != -1) {
                A0h.append(digit2);
            }
        }
        return A0h.toString();
    }

    public static String A04(String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[");
        A0u.append(str);
        A0u.append("]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*");
        A0u.append("(\\p{Nd}{1,7})");
        A0u.append("#?|[- ]+(");
        A0u.append("\\p{Nd}");
        return AnonymousClass000.A0q("{1,5})#", A0u);
    }

    public static ArrayList A05(Object obj, AbstractMap abstractMap, int i, int i2) {
        abstractMap.put(Integer.valueOf(i), obj);
        return new ArrayList(i2);
    }

    public static void A07(Object obj, AbstractMap abstractMap, char c) {
        abstractMap.put(Character.valueOf(c), obj);
    }

    public static void A08(StringBuilder sb) {
        String str;
        String obj = sb.toString();
        if (C36361kB.A1Z(obj, A0K)) {
            Map map = A09;
            int length = obj.length();
            StringBuilder A0h = C90524aI.A0h(length);
            for (int i = 0; i < length; i++) {
                Object obj2 = map.get(Character.valueOf(Character.toUpperCase(obj.charAt(i))));
                if (obj2 != null) {
                    A0h.append(obj2);
                }
            }
            str = A0h.toString();
        } else {
            str = A03(obj);
        }
        sb.replace(0, sb.length(), str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f1, code lost:
        if (r1 == X.C023109s.A0G) goto L_0x00f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0A(X.AU4 r9, X.AUN r10, java.lang.String r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r11.length()
            r4 = 0
            if (r0 == 0) goto L_0x0119
            java.lang.StringBuilder r5 = X.C90524aI.A0i(r11)
            if (r9 == 0) goto L_0x0093
            java.lang.String r2 = r9.internationalPrefix_
        L_0x000f:
            int r0 = r5.length()
            if (r0 == 0) goto L_0x008a
            java.util.regex.Pattern r0 = A0G
            java.util.regex.Matcher r1 = r0.matcher(r5)
            boolean r0 = r1.lookingAt()
            if (r0 == 0) goto L_0x0052
            int r0 = r1.end()
            r5.delete(r4, r0)
            A08(r5)
            X.8yk r1 = X.C187918yk.FROM_NUMBER_WITH_PLUS_SIGN
        L_0x002d:
            if (r13 == 0) goto L_0x0037
            java.util.Objects.requireNonNull(r1)
            r0 = 1
            r10.hasCountryCodeSource = r0
            r10.countryCodeSource_ = r1
        L_0x0037:
            X.8yk r0 = X.C187918yk.FROM_DEFAULT_COUNTRY
            if (r1 == r0) goto L_0x00a1
            int r1 = r5.length()
            r0 = 2
            if (r1 <= r0) goto L_0x0097
            int r2 = r8.A0B(r5, r12)
            if (r2 != 0) goto L_0x0102
            X.8zA r2 = X.C188178zA.INVALID_COUNTRY_CODE
            java.lang.String r1 = "Country calling code supplied was not recognised."
            X.172 r0 = new X.172
            r0.<init>(r2, r1)
            throw r0
        L_0x0052:
            X.9PS r0 = r8.A00
            java.util.regex.Pattern r0 = r0.A00(r2)
            A08(r5)
            java.util.regex.Matcher r1 = r0.matcher(r5)
            boolean r0 = r1.lookingAt()
            if (r0 == 0) goto L_0x008a
            int r3 = r1.end()
            java.util.regex.Pattern r1 = A0B
            java.lang.String r0 = r5.substring(r3)
            java.util.regex.Matcher r2 = r1.matcher(r0)
            boolean r1 = r2.find()
            r0 = 1
            if (r1 == 0) goto L_0x008d
            java.lang.String r0 = r2.group(r0)
            java.lang.String r1 = A03(r0)
            java.lang.String r0 = "0"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008d
        L_0x008a:
            X.8yk r1 = X.C187918yk.FROM_DEFAULT_COUNTRY
            goto L_0x002d
        L_0x008d:
            r5.delete(r4, r3)
            X.8yk r1 = X.C187918yk.FROM_NUMBER_WITH_IDD
            goto L_0x002d
        L_0x0093:
            java.lang.String r2 = "NonMatch"
            goto L_0x000f
        L_0x0097:
            X.8zA r2 = X.C188178zA.TOO_SHORT_AFTER_IDD
            java.lang.String r1 = "Phone number had an IDD, but after this was not long enough to be a viable phone number."
            X.172 r0 = new X.172
            r0.<init>(r2, r1)
            throw r0
        L_0x00a1:
            if (r9 == 0) goto L_0x0114
            int r2 = r9.countryCode_
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r1 = r5.toString()
            boolean r0 = r1.startsWith(r3)
            if (r0 == 0) goto L_0x0114
            int r0 = r3.length()
            java.lang.String r0 = r1.substring(r0)
            java.lang.StringBuilder r3 = X.C90524aI.A0i(r0)
            X.AU2 r7 = r9.generalDesc_
            X.9PS r1 = r8.A00
            java.lang.String r0 = r7.nationalNumberPattern_
            java.util.regex.Pattern r6 = r1.A00(r0)
            r0 = 0
            r8.A0L(r9, r3, r0)
            java.lang.String r0 = r7.possibleNumberPattern_
            java.util.regex.Pattern r1 = r1.A00(r0)
            boolean r0 = X.C36361kB.A1Z(r5, r6)
            if (r0 != 0) goto L_0x00df
            boolean r0 = X.C36361kB.A1Z(r3, r6)
            if (r0 != 0) goto L_0x00f3
        L_0x00df:
            java.lang.String r0 = r5.toString()
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L_0x0108
            java.lang.Integer r1 = X.C023109s.A00
        L_0x00ef:
            java.lang.Integer r0 = X.C023109s.A0G
            if (r1 != r0) goto L_0x0114
        L_0x00f3:
            r12.append(r3)
            if (r13 == 0) goto L_0x0102
            X.8yk r1 = X.C187918yk.FROM_NUMBER_WITHOUT_PLUS_SIGN
            java.util.Objects.requireNonNull(r1)
            r0 = 1
            r10.hasCountryCodeSource = r0
            r10.countryCodeSource_ = r1
        L_0x0102:
            r0 = 1
            r10.hasCountryCode = r0
            r10.countryCode_ = r2
            return r2
        L_0x0108:
            boolean r0 = r1.lookingAt()
            if (r0 == 0) goto L_0x0111
            java.lang.Integer r1 = X.C023109s.A0G
            goto L_0x00ef
        L_0x0111:
            java.lang.Integer r1 = X.C023109s.A0C
            goto L_0x00ef
        L_0x0114:
            r0 = 1
            r10.hasCountryCode = r0
            r10.countryCode_ = r4
        L_0x0119:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203559oI.A0A(X.AU4, X.AUN, java.lang.String, java.lang.StringBuilder, boolean):int");
    }

    public int A0B(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            int i = 1;
            while (i <= length) {
                int parseInt = Integer.parseInt(sb.substring(0, i));
                if (!C90484aE.A1Y(this.A02, parseInt)) {
                    i++;
                    if (i > 3) {
                        break;
                    }
                } else {
                    sb2.append(sb.substring(i));
                    return parseInt;
                }
            }
        }
        return 0;
    }

    public AU3 A0C(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AU3 au3 = (AU3) it.next();
            int size = au3.leadingDigitsPattern_.size();
            if (size != 0) {
                if (!this.A00.A00(C36401kF.A0s(au3.leadingDigitsPattern_, size - 1)).matcher(str).lookingAt()) {
                    continue;
                }
            }
            if (C36361kB.A1Z(str, this.A00.A00(au3.pattern_))) {
                return au3;
            }
        }
        return null;
    }

    public boolean A0L(AU4 au4, StringBuilder sb, StringBuilder sb2) {
        int length = sb.length();
        String str = au4.nationalPrefixForParsing_;
        if (!(length == 0 || str.length() == 0)) {
            AnonymousClass9PS r2 = this.A00;
            Matcher matcher = r2.A00(str).matcher(sb);
            if (matcher.lookingAt()) {
                Pattern A002 = r2.A00(au4.generalDesc_.nationalNumberPattern_);
                boolean A1Z = C36361kB.A1Z(sb, A002);
                int groupCount = matcher.groupCount();
                String str2 = au4.nationalPrefixTransformRule_;
                if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(str2));
                    if (!A1Z || C36361kB.A1Z(sb3.toString(), A002)) {
                        if (sb2 != null && groupCount > 1) {
                            sb2.append(matcher.group(1));
                        }
                        sb.replace(0, sb.length(), sb3.toString());
                        return true;
                    }
                } else if (A1Z && !C36361kB.A1Z(sb.substring(matcher.end()), A002)) {
                    return false;
                } else {
                    if (!(sb2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (r1 > 16) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r1.lookingAt() != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0M(X.AUN r5) {
        /*
            r4 = this;
            java.lang.String r3 = A02(r5)
            int r2 = r5.countryCode_
            java.util.Map r0 = r4.A02
            boolean r0 = X.C90484aE.A1Y(r0, r2)
            if (r0 != 0) goto L_0x0017
            java.lang.Integer r1 = X.C023109s.A01
        L_0x0010:
            java.lang.Integer r0 = X.C023109s.A00
            boolean r0 = X.C36361kB.A1a(r1, r0)
            return r0
        L_0x0017:
            java.lang.String r1 = r4.A0I(r2)
            java.lang.String r0 = "001"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0060
            X.AU4 r0 = r4.A0D(r2)
        L_0x0027:
            X.C18740tg.A06(r0)
            X.AU2 r2 = r0.generalDesc_
            boolean r0 = r2.hasNationalNumberPattern
            if (r0 != 0) goto L_0x0047
            java.util.logging.Logger r2 = A0A
            java.util.logging.Level r1 = java.util.logging.Level.FINER
            java.lang.String r0 = "Checking if number is possible with incomplete metadata."
            r2.log(r1, r0)
            int r1 = r3.length()
            r0 = 2
            if (r1 < r0) goto L_0x0065
            r0 = 16
            if (r1 <= r0) goto L_0x0068
        L_0x0044:
            java.lang.Integer r1 = X.C023109s.A0G
            goto L_0x0010
        L_0x0047:
            X.9PS r1 = r4.A00
            java.lang.String r0 = r2.possibleNumberPattern_
            java.util.regex.Pattern r0 = r1.A00(r0)
            java.util.regex.Matcher r1 = r0.matcher(r3)
            boolean r0 = r1.matches()
            if (r0 != 0) goto L_0x0068
            boolean r0 = r1.lookingAt()
            if (r0 == 0) goto L_0x0065
            goto L_0x0044
        L_0x0060:
            X.AU4 r0 = r4.A0E(r1)
            goto L_0x0027
        L_0x0065:
            java.lang.Integer r1 = X.C023109s.A0C
            goto L_0x0010
        L_0x0068:
            java.lang.Integer r1 = X.C023109s.A00
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203559oI.A0M(X.AUN):boolean");
    }
}
