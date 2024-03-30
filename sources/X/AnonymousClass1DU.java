package X;

import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Pair;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1DU  reason: invalid class name */
public class AnonymousClass1DU {
    public final C20810yC A00;

    public static String A01(String str) {
        StringBuilder sb;
        String str2 = str;
        String[] strArr = C56852wz.A03;
        int i = 0;
        while (true) {
            String str3 = strArr[i];
            if (!A02(str, str3)) {
                i++;
                if (i >= 2) {
                    sb = new StringBuilder();
                    sb.append("https://");
                    sb.append(str);
                    break;
                }
            } else if (str3.equals("https") && str2.regionMatches(false, 0, str3, 0, str3.length())) {
                return str2;
            } else {
                sb = new StringBuilder();
                sb.append("https");
                sb.append(str2.substring(str3.length()));
            }
        }
        return sb.toString();
    }

    public static boolean A02(String str, String str2) {
        int length = str2.length();
        String str3 = str;
        if (!str3.regionMatches(true, 0, str2, 0, length) || !str3.regionMatches(false, length, "://", 0, 3)) {
            return false;
        }
        return true;
    }

    public String A03(String str) {
        String str2;
        ArrayList A05 = A05(str, true);
        if (A05 == null || (str2 = (String) A05.get(0)) == null) {
            return null;
        }
        return A01(str2);
    }

    public ArrayList A04(String str) {
        ArrayList A05 = A05(str, false);
        if (A05 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(A05.size());
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            String A01 = A01((String) it.next());
            if (!arrayList.contains(A01)) {
                arrayList.add(A01);
            }
        }
        return arrayList;
    }

    public static Pair A00(CharSequence charSequence, int i, int i2) {
        if (i != 0 && charSequence.charAt(i - 1) == '@') {
            return null;
        }
        if (charSequence.length() <= i2 || charSequence.charAt(i2) != '/') {
            while (".,!?".indexOf(charSequence.charAt(i2 - 1)) != -1) {
                i2--;
            }
        } else {
            i2++;
        }
        return C200739i8.A00(new Pair(Integer.valueOf(i), Integer.valueOf(i2)), C200739i8.A01, charSequence);
    }

    public void A06(Spannable spannable) {
        CharSequence charSequence;
        Pair A002;
        Pattern pattern = C56852wz.A00;
        if (spannable.length() > 4096) {
            charSequence = spannable.subSequence(0, ZipDecompressor.UNZIP_BUFFER_SIZE);
        } else {
            charSequence = spannable;
        }
        Matcher matcher = pattern.matcher(charSequence);
        while (matcher.find()) {
            String group = matcher.group(5);
            String group2 = matcher.group(6);
            if ((TextUtils.isEmpty(group) || TextUtils.isEmpty(group2) || C56852wz.A02.matcher(group2).matches()) && (A002 = A00(spannable, matcher.start(), matcher.end())) != null) {
                String A01 = A01(spannable.subSequence(((Number) A002.first).intValue(), ((Number) A002.second).intValue()).toString());
                spannable.setSpan(new URLSpan(A01), ((Number) A002.first).intValue(), ((Number) A002.second).intValue(), 33);
            }
        }
    }

    public AnonymousClass1DU(C20810yC r1) {
        this.A00 = r1;
    }

    public ArrayList A05(String str, boolean z) {
        Pattern pattern;
        String str2;
        ArrayList arrayList = null;
        if (!TextUtils.isEmpty(str)) {
            boolean A01 = C20800yB.A01(C21000yV.A02, this.A00, 6517);
            if (A01) {
                pattern = C56852wz.A00;
            } else {
                pattern = C56852wz.A01;
            }
            if (str.length() > 4096) {
                str2 = str.substring(0, ZipDecompressor.UNZIP_BUFFER_SIZE);
            } else {
                str2 = str;
            }
            Matcher matcher = pattern.matcher(str2);
            while (matcher.find()) {
                Pair A002 = A00(str, matcher.start(), matcher.end());
                if (A002 != null) {
                    String substring = str.substring(((Number) A002.first).intValue(), ((Number) A002.second).intValue());
                    if (!A01) {
                        String[] strArr = C56852wz.A03;
                        int i = 0;
                        while (true) {
                            if (A02(substring, strArr[i])) {
                                break;
                            }
                            i++;
                            if (i >= 2) {
                                break;
                            }
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        arrayList.add(substring);
                        if (z) {
                            return arrayList;
                        }
                    } else if (!arrayList.contains(substring)) {
                        arrayList.add(substring);
                    }
                }
            }
        }
        return arrayList;
    }
}
