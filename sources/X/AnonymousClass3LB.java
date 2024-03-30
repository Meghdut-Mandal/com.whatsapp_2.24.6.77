package X;

import android.app.PendingIntent;
import android.content.Context;
import com.whatsapp.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3LB  reason: invalid class name */
public abstract class AnonymousClass3LB {
    public final C19970wo A00;
    public final C25271Fq A01;
    public final C19420v0 A02;

    public PendingIntent A00(AnonymousClass3JN r4) {
        boolean z = this instanceof C47032cc;
        Context context = r4.A02;
        if (z) {
            PendingIntent A03 = C65743Th.A03(context, AnonymousClass190.A07(context), 6);
            AnonymousClass00C.A08(A03);
            return A03;
        }
        PendingIntent A032 = C65743Th.A03(context, AnonymousClass190.A05(context), 2);
        AnonymousClass00C.A08(A032);
        return A032;
    }

    public String A01(AnonymousClass3JN r13) {
        String str;
        Context context;
        int i;
        Object[] objArr;
        Context context2;
        int i2;
        AnonymousClass141 A08;
        if (this instanceof C47032cc) {
            C47032cc r9 = (C47032cc) this;
            Map map = r13.A01;
            if (map != null) {
                Collection values = map.values();
                AnonymousClass00C.A0D(values, 0);
                Iterator it = values.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    i3 += C36341k9.A0A(it);
                }
                int size = map.size();
                if (size != 1) {
                    AnonymousClass16D r2 = r9.A00;
                    AnonymousClass141 A082 = r2.A08((AnonymousClass11F) AnonymousClass3R6.A00(map.keySet()));
                    Set keySet = map.keySet();
                    if (size != 2) {
                        A08 = r2.A08((AnonymousClass11F) C007103b.A0K(keySet, 1));
                        if (!(A082 == null || A08 == null)) {
                            context = r13.A02;
                            i = R.string.f12nameremoved;
                            objArr = new Object[3];
                            AnonymousClass000.A1L(objArr, i3, 0);
                            AnonymousClass171 r0 = r9.A01;
                            C36361kB.A1F(r0, A082, objArr, 1);
                            C36361kB.A1F(r0, A08, objArr, 2);
                            str = context.getString(i, objArr);
                            AnonymousClass00C.A08(str);
                            return str;
                        }
                    } else {
                        A08 = r2.A08((AnonymousClass11F) C007103b.A0J(keySet));
                        if (!(A082 == null || A08 == null)) {
                            context = r13.A02;
                            i = R.string.f12nameremoved;
                            objArr = new Object[3];
                            AnonymousClass000.A1L(objArr, i3, 0);
                            AnonymousClass171 r02 = r9.A01;
                            C36361kB.A1F(r02, A082, objArr, 1);
                            C36361kB.A1F(r02, A08, objArr, 2);
                            str = context.getString(i, objArr);
                            AnonymousClass00C.A08(str);
                            return str;
                        }
                    }
                    C36321k7.A1P("story_post_push_notification", " contact does not exist", AnonymousClass000.A0u());
                } else {
                    AnonymousClass141 A083 = r9.A00.A08((AnonymousClass11F) AnonymousClass3R6.A00(map.keySet()));
                    if (A083 != null) {
                        context = r13.A02;
                        i = R.string.f12nameremoved;
                        objArr = new Object[2];
                        AnonymousClass000.A1L(objArr, i3, 0);
                        C36361kB.A1F(r9.A01, A083, objArr, 1);
                        str = context.getString(i, objArr);
                        AnonymousClass00C.A08(str);
                        return str;
                    }
                }
            }
        } else {
            C47022cb r8 = (C47022cb) this;
            List list = r13.A00;
            if (list != null) {
                int size2 = list.size();
                if (size2 != 1) {
                    AnonymousClass16D r03 = r8.A00;
                    AnonymousClass141 A0Z = C36381kD.A0Z(r03, list, 0);
                    AnonymousClass141 A0Z2 = C36381kD.A0Z(r03, list, 1);
                    if (size2 != 2) {
                        if (!(A0Z == null || A0Z2 == null)) {
                            context2 = r13.A02;
                            i2 = R.string.f12nameremoved;
                        }
                        C36321k7.A1P("recently_joined_contact_push_notification", " contact does not exist", AnonymousClass000.A0u());
                    } else {
                        if (!(A0Z == null || A0Z2 == null)) {
                            context2 = r13.A02;
                            i2 = R.string.f12nameremoved;
                        }
                        C36321k7.A1P("recently_joined_contact_push_notification", " contact does not exist", AnonymousClass000.A0u());
                    }
                    objArr = new Object[2];
                    AnonymousClass171 r04 = r8.A01;
                    C36361kB.A1F(r04, A0Z, objArr, 0);
                    C36361kB.A1F(r04, A0Z2, objArr, 1);
                    str = context.getString(i, objArr);
                    AnonymousClass00C.A08(str);
                    return str;
                }
                AnonymousClass141 A0Z3 = C36381kD.A0Z(r8.A00, list, 0);
                if (A0Z3 != null) {
                    context = r13.A02;
                    i = R.string.f12nameremoved;
                    objArr = new Object[1];
                    C36361kB.A1F(r8.A01, A0Z3, objArr, 0);
                    str = context.getString(i, objArr);
                    AnonymousClass00C.A08(str);
                    return str;
                }
            }
        }
        str = r13.A02.getString(R.string.f12nameremoved);
        AnonymousClass00C.A08(str);
        return str;
    }

    public String A02(AnonymousClass3JN r3) {
        boolean z = this instanceof C47032cc;
        Context context = r3.A02;
        if (z) {
            return C36361kB.A0m(context, R.string.f12nameremoved);
        }
        return C36361kB.A0m(context, R.string.f12nameremoved);
    }

    public boolean A03() {
        C20810yC r1;
        int i;
        if (this instanceof C47032cc) {
            r1 = ((C47032cc) this).A02;
            i = 6168;
        } else {
            r1 = ((C47022cb) this).A02;
            i = 6169;
        }
        return r1.A0E(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r1 != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.AnonymousClass3JN r3) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.C47032cc
            if (r0 == 0) goto L_0x0013
            java.util.Map r0 = r3.A01
            if (r0 == 0) goto L_0x000f
            boolean r1 = r0.isEmpty()
        L_0x000c:
            r0 = 0
            if (r1 == 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r0 = r0 ^ 1
            return r0
        L_0x0013:
            java.util.List r0 = r3.A00
            if (r0 == 0) goto L_0x000f
            boolean r1 = r0.isEmpty()
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LB.A04(X.3JN):boolean");
    }

    public AnonymousClass3LB(C19970wo r1, C25271Fq r2, C19420v0 r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
