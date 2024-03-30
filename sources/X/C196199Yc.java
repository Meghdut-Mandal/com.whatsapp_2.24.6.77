package X;

import android.content.Context;
import android.content.DialogInterface;
import com.whatsapp.R;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Yc  reason: invalid class name and case insensitive filesystem */
public abstract class C196199Yc {
    public final int A00;
    public final C24801Dv A01;
    public final C33771fu A02;
    public final AnonymousClass16D A03;
    public final AnonymousClass171 A04;
    public final C19970wo A05;
    public final C18820ts A06;
    public final C20810yC A07;
    public final AnonymousClass1FR A08;

    public boolean A04(C198299dE r8, C198019cl r9) {
        if (r8 == null) {
            return false;
        }
        if (r9 != null && r8.A08.A01 == r9.A03) {
            int A072 = this.A07.A07(988);
            long abs = Math.abs(C19970wo.A00(this.A05) - r9.A02);
            if (A072 < 1 || abs < TimeUnit.HOURS.toMillis((long) A072)) {
                return false;
            }
        }
        return true;
    }

    public int A00() {
        if (this instanceof C178418fu) {
            return R.string.f12nameremoved;
        }
        return R.string.f12nameremoved;
    }

    public int A01() {
        if (this instanceof C178418fu) {
            return R.string.f12nameremoved;
        }
        return R.string.f12nameremoved;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (android.text.TextUtils.equals(r2, (java.lang.String) X.C36371kC.A0r(r0.A00, r1)) != false) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(X.C175728ax r7, com.whatsapp.jid.UserJid r8, X.C198299dE r9) {
        /*
            r6 = this;
            X.16D r0 = r6.A03
            X.141 r0 = r0.A0D(r8)
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0061
            X.9bz r3 = r9.A0A
            boolean r0 = r3.A01
            r5 = 3
            r4 = 1
            if (r0 == 0) goto L_0x0039
            if (r7 == 0) goto L_0x003a
            X.9fB r0 = r9.A08
            long r0 = r0.A01
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r1 = r6.A00
            X.9by r0 = r7.A02
            if (r0 != 0) goto L_0x002b
            X.9by r0 = new X.9by
            r0.<init>()
            r7.A02 = r0
        L_0x002b:
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = X.C36371kC.A0r(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r5 = 1
        L_0x003a:
            int r3 = r3.A00
            if (r5 != r4) goto L_0x0060
            if (r3 <= 0) goto L_0x0060
            if (r7 == 0) goto L_0x0060
            X.9u4 r2 = r7.A03
            if (r2 == 0) goto L_0x0060
            X.9fB r0 = r9.A08
            long r0 = r0.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.util.HashMap r0 = r2.A00
            java.lang.Object r0 = r0.get(r1)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 == 0) goto L_0x0060
            int r0 = r0.size()
            if (r0 < r3) goto L_0x005f
            r4 = 2
        L_0x005f:
            return r4
        L_0x0060:
            return r5
        L_0x0061:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196199Yc.A02(X.8ax, com.whatsapp.jid.UserJid, X.9dE):int");
    }

    public C196199Yc(C24801Dv r1, C33771fu r2, AnonymousClass16D r3, AnonymousClass171 r4, C19970wo r5, C18820ts r6, C20810yC r7, AnonymousClass1FR r8, int i) {
        this.A05 = r5;
        this.A07 = r7;
        this.A02 = r2;
        this.A01 = r1;
        this.A08 = r8;
        this.A04 = r4;
        this.A06 = r6;
        this.A03 = r3;
        this.A00 = i;
    }

    public AnonymousClass0FM A03(Context context) {
        C39001qm A002 = AnonymousClass3LW.A00(context);
        A002.A0d(R.string.f12nameremoved);
        A002.A0c(R.string.f12nameremoved);
        A002.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
        A002.A0h(new B8F(context, this, 8), R.string.f12nameremoved);
        return A002.create();
    }
}
