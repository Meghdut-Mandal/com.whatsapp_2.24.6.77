package X;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.9oW  reason: invalid class name and case insensitive filesystem */
public class C203679oW {
    public static final Pattern A0M = Pattern.compile("\\[([^\\[\\]])*\\]");
    public static final Pattern A0N = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)+");
    public static final Pattern A0O = Pattern.compile("[- ]");
    public static final Pattern A0P = Pattern.compile("\\d(?=[^,}][^,}])");
    public static final AU4 A0Q;
    public static final Pattern A0R = Pattern.compile(" ");
    public int A00 = 0;
    public int A01 = 0;
    public AU4 A02;
    public AnonymousClass9PS A03 = new AnonymousClass9PS(64);
    public String A04 = "";
    public String A05 = "";
    public StringBuilder A06 = AnonymousClass000.A0u();
    public StringBuilder A07 = AnonymousClass000.A0u();
    public StringBuilder A08 = AnonymousClass000.A0u();
    public StringBuilder A09 = AnonymousClass000.A0u();
    public StringBuilder A0A = AnonymousClass000.A0u();
    public List A0B = AnonymousClass001.A0I();
    public boolean A0C = true;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public int A0G = 0;
    public AU4 A0H;
    public String A0I = "";
    public String A0J;
    public boolean A0K = false;
    public final C203559oI A0L = C203559oI.A00();

    static {
        AU4 au4 = new AU4();
        au4.hasInternationalPrefix = true;
        au4.internationalPrefix_ = "NA";
        A0Q = au4;
    }

    private AU4 A00(String str) {
        int i;
        C203559oI r4 = this.A0L;
        if (str == null || !r4.A07.contains(str)) {
            Logger logger = C203559oI.A0A;
            Level level = Level.WARNING;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            A0u.append(str);
            logger.log(level, AnonymousClass000.A0q(") provided.", A0u));
            i = 0;
        } else {
            AU4 A0E2 = r4.A0E(str);
            if (A0E2 != null) {
                i = A0E2.countryCode_;
            } else {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("Invalid region code: ");
                throw AnonymousClass000.A0c(str, A0u2);
            }
        }
        AU4 A0E3 = r4.A0E(r4.A0I(i));
        if (A0E3 == null) {
            return A0Q;
        }
        return A0E3;
    }

    private String A01() {
        AU4 au4;
        List<AU3> list;
        List list2;
        StringBuilder sb = this.A09;
        if (sb.length() < 3) {
            return A06(sb.toString());
        }
        String substring = sb.substring(0, 3);
        AU4 au42 = this.A02;
        if (au42 != null) {
            if (!this.A0D || (list2 = au42.intlNumberFormat_) == null || list2.size() <= 0) {
                au4 = this.A02;
                list = au4.numberFormat_;
            } else {
                au4 = this.A02;
                list = au4.intlNumberFormat_;
            }
            boolean z = au4.hasNationalPrefix;
            for (AU3 au3 : list) {
                if ((!z || this.A0D || au3.nationalPrefixOptionalWhenFormatting_ || C36361kB.A1Z(au3.nationalPrefixFormattingRule_, C203559oI.A0D)) && C36361kB.A1Z(au3.format_, A0N)) {
                    this.A0B.add(au3);
                }
            }
            A07(substring);
        }
        if (A0A()) {
            return A02();
        }
        return this.A06.toString();
    }

    private String A02() {
        StringBuilder sb;
        String A042;
        StringBuilder sb2 = this.A09;
        int length = sb2.length();
        if (length > 0) {
            int i = 0;
            do {
                A042 = A04(sb2.charAt(i));
                i++;
            } while (i < length);
            if (this.A0C) {
                return A06(A042);
            }
            sb = this.A06;
        } else {
            sb = this.A0A;
        }
        return sb.toString();
    }

    private String A03() {
        AU4 au4 = this.A02;
        boolean z = false;
        if (au4 != null && au4.countryCode_ == 1) {
            StringBuilder sb = this.A09;
            if (!(sb.charAt(0) != '1' || sb.charAt(1) == '0' || sb.charAt(1) == '1')) {
                z = true;
            }
        }
        int i = 1;
        if (z) {
            StringBuilder sb2 = this.A0A;
            sb2.append('1');
            sb2.append(' ');
            this.A0D = true;
        } else {
            AU4 au42 = this.A02;
            if (au42 != null && au42.hasNationalPrefixForParsing) {
                Pattern A002 = this.A03.A00(au42.nationalPrefixForParsing_);
                StringBuilder sb3 = this.A09;
                Matcher matcher = A002.matcher(sb3);
                if (matcher.lookingAt()) {
                    this.A0D = true;
                    i = matcher.end();
                    this.A0A.append(sb3.substring(0, i));
                }
            }
            i = 0;
        }
        StringBuilder sb4 = this.A09;
        String substring = sb4.substring(0, i);
        sb4.delete(0, i);
        return substring;
    }

    private String A04(char c) {
        Pattern pattern = A0R;
        StringBuilder sb = this.A08;
        Matcher matcher = pattern.matcher(sb);
        if (matcher.find(this.A0G)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c));
            sb.replace(0, replaceFirst.length(), replaceFirst);
            int start = matcher.start();
            this.A0G = start;
            return sb.substring(0, start + 1);
        }
        if (this.A0B.size() == 1) {
            this.A0C = false;
        }
        this.A0I = "";
        return this.A06.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r7.A08() != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (X.C36361kB.A1Z(java.lang.Character.toString(r8), X.C203559oI.A0G) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A05(X.C203679oW r7, char r8, boolean r9) {
        /*
            java.lang.StringBuilder r2 = r7.A06
            r2.append(r8)
            if (r9 == 0) goto L_0x000d
            int r0 = r2.length()
            r7.A00 = r0
        L_0x000d:
            boolean r0 = java.lang.Character.isDigit(r8)
            r5 = 1
            if (r0 != 0) goto L_0x0026
            int r0 = r2.length()
            if (r0 != r5) goto L_0x00a3
            java.util.regex.Pattern r1 = X.C203559oI.A0G
            java.lang.String r0 = java.lang.Character.toString(r8)
            boolean r0 = X.C36361kB.A1Z(r0, r1)
            if (r0 == 0) goto L_0x00a3
        L_0x0026:
            r3 = 0
            r4 = 1
            if (r5 != 0) goto L_0x007e
            r7.A0C = r3
            r7.A0K = r4
        L_0x002e:
            boolean r0 = r7.A0C
            if (r0 != 0) goto L_0x00a5
            boolean r0 = r7.A0K
            if (r0 != 0) goto L_0x0157
            boolean r0 = r7.A09()
            if (r0 == 0) goto L_0x0050
            boolean r0 = r7.A08()
            if (r0 == 0) goto L_0x0157
        L_0x0042:
            r7.A0C = r4
            r7.A0E = r3
            java.util.List r0 = r7.A0B
            r0.clear()
            java.lang.String r0 = r7.A01()
            return r0
        L_0x0050:
            java.lang.String r1 = r7.A05
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0068
            java.lang.StringBuilder r0 = r7.A09
            r0.insert(r3, r1)
            java.lang.StringBuilder r1 = r7.A0A
            java.lang.String r0 = r7.A05
            int r0 = r1.lastIndexOf(r0)
            r1.setLength(r0)
        L_0x0068:
            java.lang.String r1 = r7.A05
            java.lang.String r0 = r7.A03()
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0157
            java.lang.StringBuilder r1 = r7.A0A
            r0 = 32
            r1.append(r0)
            goto L_0x0042
        L_0x007e:
            r0 = 43
            if (r8 != r0) goto L_0x0091
            java.lang.StringBuilder r1 = r7.A07
            r0 = r1
        L_0x0085:
            r1.append(r8)
            if (r9 == 0) goto L_0x002e
            int r0 = r0.length()
            r7.A01 = r0
            goto L_0x002e
        L_0x0091:
            r1 = 10
            int r0 = java.lang.Character.digit(r8, r1)
            char r8 = java.lang.Character.forDigit(r0, r1)
            java.lang.StringBuilder r0 = r7.A07
            r0.append(r8)
            java.lang.StringBuilder r1 = r7.A09
            goto L_0x0085
        L_0x00a3:
            r5 = 0
            goto L_0x0026
        L_0x00a5:
            java.lang.StringBuilder r0 = r7.A07
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0157
            if (r1 == r4) goto L_0x0157
            r0 = 2
            if (r1 == r0) goto L_0x0157
            r0 = 3
            if (r1 != r0) goto L_0x00bd
            boolean r0 = r7.A09()
            if (r0 == 0) goto L_0x014c
            r7.A0E = r4
        L_0x00bd:
            boolean r0 = r7.A0E
            if (r0 == 0) goto L_0x00dc
            boolean r0 = r7.A08()
            if (r0 == 0) goto L_0x00c9
            r7.A0E = r3
        L_0x00c9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.StringBuilder r0 = r7.A0A
            r1.append(r0)
            java.lang.StringBuilder r0 = r7.A09
            X.C36351kA.A1K(r0, r1)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x00dc:
            java.util.List r1 = r7.A0B
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0147
            java.lang.String r4 = r7.A04(r8)
            java.util.Iterator r6 = r1.iterator()
        L_0x00ec:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0127
            java.lang.Object r5 = r6.next()
            X.AU3 r5 = (X.AU3) r5
            X.9PS r1 = r7.A03
            java.lang.String r0 = r5.pattern_
            java.util.regex.Pattern r1 = r1.A00(r0)
            java.lang.StringBuilder r0 = r7.A09
            java.util.regex.Matcher r3 = r1.matcher(r0)
            boolean r0 = r3.matches()
            if (r0 == 0) goto L_0x00ec
            java.util.regex.Pattern r1 = A0O
            java.lang.String r0 = r5.nationalPrefixFormattingRule_
            boolean r0 = X.C165587tf.A1a(r0, r1)
            r7.A0F = r0
            java.lang.String r0 = r5.format_
            java.lang.String r0 = r3.replaceAll(r0)
            java.lang.String r1 = r7.A06(r0)
        L_0x0120:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x012a
            return r1
        L_0x0127:
            java.lang.String r1 = ""
            goto L_0x0120
        L_0x012a:
            java.lang.StringBuilder r0 = r7.A09
            java.lang.String r0 = r0.toString()
            r7.A07(r0)
            boolean r0 = r7.A0A()
            if (r0 == 0) goto L_0x013e
            java.lang.String r0 = r7.A02()
            return r0
        L_0x013e:
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = r7.A06(r4)
            return r0
        L_0x0147:
            java.lang.String r0 = r7.A01()
            return r0
        L_0x014c:
            java.lang.String r0 = r7.A03()
            r7.A05 = r0
            java.lang.String r0 = r7.A01()
            return r0
        L_0x0157:
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203679oW.A05(X.9oW, char, boolean):java.lang.String");
    }

    private String A06(String str) {
        StringBuilder A11;
        StringBuilder sb = this.A0A;
        int length = sb.length();
        if (!this.A0F || length <= 0 || sb.charAt(length - 1) == ' ') {
            A11 = C36381kD.A11(sb);
        } else {
            A11 = AnonymousClass000.A0u();
            A11.append(new String(sb));
            A11.append(' ');
        }
        return AnonymousClass000.A0q(str, A11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = X.AnonymousClass000.A0u();
        r3 = r5.A0L;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A08() {
        /*
            r5 = this;
            java.lang.StringBuilder r4 = r5.A09
            int r0 = r4.length()
            r1 = 0
            if (r0 == 0) goto L_0x0045
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            X.9oI r3 = r5.A0L
            int r2 = r3.A0B(r4, r0)
            if (r2 == 0) goto L_0x0045
            r4.setLength(r1)
            r4.append(r0)
            java.lang.String r1 = r3.A0I(r2)
            java.lang.String r0 = "001"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            X.AU4 r0 = r3.A0D(r2)
        L_0x002b:
            r5.A02 = r0
        L_0x002d:
            java.lang.String r1 = java.lang.Integer.toString(r2)
            java.lang.StringBuilder r0 = r5.A0A
            X.C165587tf.A1O(r0, r1)
            r0 = 1
            return r0
        L_0x0038:
            java.lang.String r0 = r5.A0J
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002d
            X.AU4 r0 = r5.A00(r1)
            goto L_0x002b
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203679oW.A08():boolean");
    }

    private boolean A09() {
        AU4 au4 = this.A02;
        if (au4 != null) {
            AnonymousClass9PS r2 = this.A03;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("\\+|");
            Pattern A002 = r2.A00(AnonymousClass000.A0q(au4.internationalPrefix_, A0u));
            StringBuilder sb = this.A07;
            Matcher matcher = A002.matcher(sb);
            if (matcher.lookingAt()) {
                this.A0D = true;
                int end = matcher.end();
                StringBuilder sb2 = this.A09;
                sb2.setLength(0);
                sb2.append(sb.substring(end));
                StringBuilder sb3 = this.A0A;
                sb3.setLength(0);
                sb3.append(sb.substring(0, end));
                if (sb.charAt(0) != '+') {
                    sb3.append(' ');
                }
                return true;
            }
        }
        return false;
    }

    private boolean A0A() {
        String replaceAll;
        Iterator it = this.A0B.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.A0C = false;
                break;
            }
            AU3 au3 = (AU3) it.next();
            String str = au3.pattern_;
            if (this.A0I.equals(str)) {
                break;
            }
            if (str.indexOf(124) == -1) {
                String replaceAll2 = A0P.matcher(A0M.matcher(str).replaceAll("\\\\d")).replaceAll("\\\\d");
                StringBuilder sb = this.A08;
                sb.setLength(0);
                String str2 = au3.format_;
                Matcher matcher = this.A03.A00(replaceAll2).matcher("999999999999999");
                matcher.find();
                String group = matcher.group();
                if (group.length() < this.A09.length()) {
                    replaceAll = "";
                } else {
                    replaceAll = group.replaceAll(replaceAll2, str2).replaceAll("9", " ");
                }
                if (replaceAll.length() > 0) {
                    sb.append(replaceAll);
                    this.A0I = str;
                    this.A0F = C165587tf.A1a(au3.nationalPrefixFormattingRule_, A0O);
                    this.A0G = 0;
                    return true;
                }
            }
            it.remove();
        }
        return false;
    }

    public void A0B() {
        this.A04 = "";
        this.A06.setLength(0);
        this.A07.setLength(0);
        this.A08.setLength(0);
        this.A0G = 0;
        this.A0I = "";
        this.A0A.setLength(0);
        this.A05 = "";
        this.A09.setLength(0);
        this.A0C = true;
        this.A0K = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A0D = false;
        this.A0E = false;
        this.A0B.clear();
        this.A0F = false;
        AU4 au4 = this.A02;
        if (au4 == null || !au4.equals(this.A0H)) {
            this.A02 = A00(this.A0J);
        }
    }

    public C203679oW(String str) {
        this.A0J = str;
        AU4 A002 = A00(str);
        this.A02 = A002;
        this.A0H = A002;
    }

    private void A07(String str) {
        int length = str.length() - 3;
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            AU3 au3 = (AU3) it.next();
            if (au3.leadingDigitsPattern_.size() > length && !this.A03.A00(C36401kF.A0s(au3.leadingDigitsPattern_, length)).matcher(str).lookingAt()) {
                it.remove();
            }
        }
    }
}
