package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.17W  reason: invalid class name */
public class AnonymousClass17W {
    public final AnonymousClass163 A00;

    public static String A00(int[] iArr) {
        int length = iArr.length;
        StringBuilder sb = new StringBuilder();
        sb.append("message_type");
        sb.append(" NOT IN (");
        sb.append(iArr[0]);
        for (int i = 1; i < length; i++) {
            sb.append(",");
            sb.append(iArr[i]);
        }
        sb.append(")");
        return sb.toString();
    }

    public static void A02(StringBuilder sb, boolean z) {
        String str;
        if (z) {
            sb.append(" AND sort_id < ?");
            str = " ORDER BY sort_id DESC";
        } else {
            sb.append(" AND sort_id > ?");
            str = " ORDER BY sort_id ASC";
        }
        sb.append(str);
    }

    public AnonymousClass00I A03(AnonymousClass3T1 r11) {
        String str;
        ArrayList arrayList = new ArrayList();
        List<AnonymousClass11F> A0e = r11.A0e();
        if (A0e == null || A0e.size() < r11.A0B) {
            arrayList.add(String.valueOf(r11.A0I));
            arrayList.add(r11.A1J.A01);
            arrayList.add(String.valueOf(r11.A1N));
            str = " WHERE timestamp = ? AND from_me = 1 AND key_id = ? AND _id!=?";
        } else {
            arrayList.add(r11.A1J.A01);
            AnonymousClass163 r9 = this.A00;
            HashMap hashMap = new HashMap();
            for (AnonymousClass11F r1 : A0e) {
                long A08 = r9.A08(r1);
                if (A08 != -1) {
                    hashMap.put(r1, Long.valueOf(A08));
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(" WHERE from_me=1 AND key_id=? AND chat_row_id IN ");
            sb.append(AnonymousClass1M2.A00(hashMap.size()));
            str = sb.toString();
            for (Object obj : hashMap.values()) {
                arrayList.add(obj.toString());
            }
        }
        return new AnonymousClass00I(str, arrayList);
    }

    public AnonymousClass17W(AnonymousClass163 r1) {
        this.A00 = r1;
    }

    public static void A01(StringBuilder sb, List list) {
        String str;
        if (list.isEmpty()) {
            str = " ";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" AND message_type NOT IN ('");
            sb2.append(list.get(0));
            sb2.append("'");
            sb.append(sb2.toString());
            for (int i = 1; i < list.size(); i++) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", '");
                sb3.append(list.get(i));
                sb3.append("'");
                sb.append(sb3.toString());
            }
            str = ") ";
        }
        sb.append(str);
    }
}
