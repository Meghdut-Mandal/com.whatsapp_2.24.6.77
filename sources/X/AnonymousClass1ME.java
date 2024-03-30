package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1ME  reason: invalid class name */
public abstract class AnonymousClass1ME {
    public static Map A00 = new HashMap();

    public abstract int A01(double d, int i, int i2, long j, long j2, long j3);

    static {
        A00(new C36031je(10), "bm bo dz id ig ii in ja jbo jv jw kde kea km ko lkt lo ms my nqo osa root sah ses sg su th to vi wo yo yue zh");
        A00(new C36031je(21), "am as bn fa gu hi kn zu");
        A00(new C36031je(29), "ff fr hy kab");
        A00.put("pt", new C36031je(30));
        A00(new C36031je(31), "ast ca de en et fi fy gl ia io it ji nl pt_PT sc scn sv sw ur yi");
        A00.put("si", new C36031je(32));
        A00(new C36031je(33), "ak bho guw ln mg nso pa ti wa");
        A00.put("tzm", new C36031je(34));
        A00(new C36031je(35), "af an asa az bem bez bg brx ce cgg chr ckb dv ee el eo es eu fo fur gsw ha haw hu jgo jmc ka kaj kcg kk kkj kl ks ksb ku ky lb lg mas mgo ml mn mr nah nb nd ne nn nnh no nr ny nyn om or os pap ps rm rof rwk saq sd sdh seh sn so sq ss ssy st syr ta te teo tig tk tn tr ts ug uz ve vo vun wae xh xog");
        A00.put("da", new C36031je(0));
        A00.put("is", new C36031je(1));
        A00.put("mk", new C36031je(2));
        A00(new C36031je(3), "ceb fil tl");
        A00(new C36031je(4), "lv prg");
        A00.put("lag", new C36031je(5));
        A00.put("ksh", new C36031je(6));
        A00(new C36031je(7), "iu naq se sma smi smj smn sms");
        A00.put("shi", new C36031je(8));
        A00(new C36031je(9), "mo ro");
        A00(new C36031je(11), "bs hr sh sr");
        A00.put("gd", new C36031je(12));
        A00.put("sl", new C36031je(13));
        A00(new C36031je(14), "dsb hsb");
        A00(new C36031je(15), "he iw");
        A00(new C36031je(16), "cs sk");
        A00.put("pl", new C36031je(17));
        A00.put("be", new C36031je(18));
        A00.put("lt", new C36031je(19));
        A00.put("mt", new C36031je(20));
        A00(new C36031je(22), "ru uk");
        A00.put("br", new C36031je(23));
        A00.put("ga", new C36031je(24));
        A00.put("gv", new C36031je(25));
        A00.put("kw", new C36031je(26));
        A00(new C36031je(27), "ar ars");
        A00.put("cy", new C36031je(28));
    }

    public static void A00(AnonymousClass1ME r8, String str) {
        for (String str2 : str.split(" ")) {
            Map map = A00;
            map.put(str2, r8);
            if ("pt_PT".equals(str2)) {
                Iterator it = AnonymousClass1MD.A01.iterator();
                while (it.hasNext()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("pt_");
                    sb.append((String) it.next());
                    map.put(sb.toString(), r8);
                }
            }
        }
    }
}
