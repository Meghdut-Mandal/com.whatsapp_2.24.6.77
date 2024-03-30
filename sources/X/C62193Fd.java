package X;

import android.net.Uri;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.3Fd  reason: invalid class name and case insensitive filesystem */
public final class C62193Fd {
    public final C20810yC A00;

    public C62193Fd(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00(android.net.Uri r6) {
        /*
            r5 = this;
            java.lang.String r0 = "entry_point"
            java.lang.String r4 = r6.getQueryParameter(r0)
            if (r4 == 0) goto L_0x000e
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r4 = "click_to_chat_link"
        L_0x0010:
            r3 = 0
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0064
            X.0yC r1 = r5.A00
            r0 = 533(0x215, float:7.47E-43)
            java.lang.String r2 = X.C36431kI.A19(r1, r0)
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0065
            java.lang.String r1 = ","
            X.0fN r0 = new X.0fN
            r0.<init>((java.lang.String) r1)
            java.util.List r2 = r0.A01(r2, r3)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0061
            int r0 = r2.size()
            java.util.ListIterator r1 = r2.listIterator(r0)
        L_0x003e:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x0061
            int r0 = X.C36411kG.A0A(r1)
            if (r0 == 0) goto L_0x003e
            java.util.List r0 = X.C36411kG.A14(r2, r1)
        L_0x004e:
            java.lang.String[] r3 = X.C36431kI.A1b(r0)
            int r2 = r3.length
            r1 = 0
        L_0x0054:
            if (r1 >= r2) goto L_0x0064
            r0 = r3[r1]
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0065
            int r1 = r1 + 1
            goto L_0x0054
        L_0x0061:
            X.09w r0 = X.C023409w.A00
            goto L_0x004e
        L_0x0064:
            r4 = 0
        L_0x0065:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62193Fd.A00(android.net.Uri):java.lang.String");
    }

    public final String A01(Uri uri, boolean z) {
        List list;
        String queryParameter = uri.getQueryParameter("app");
        if (z) {
            queryParameter = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
        }
        if (queryParameter == null || queryParameter.length() == 0) {
            return queryParameter;
        }
        String A19 = C36431kI.A19(this.A00, 534);
        if (A19.length() == 0) {
            return queryParameter;
        }
        List A01 = new C10880fN(",").A01(A19, 0);
        if (!A01.isEmpty()) {
            ListIterator listIterator = A01.listIterator(A01.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (C36411kG.A0A(listIterator) != 0) {
                        list = C36411kG.A14(A01, listIterator);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        list = C023409w.A00;
        for (String equalsIgnoreCase : C36431kI.A1b(list)) {
            if (queryParameter.equalsIgnoreCase(equalsIgnoreCase)) {
                return queryParameter;
            }
        }
        return null;
    }
}
