package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.1S3  reason: invalid class name */
public class AnonymousClass1S3 {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass00I A03;
    public AnonymousClass11F A04;
    public C193889Nh A05;
    public C134786bb A06;
    public Boolean A07 = null;
    public Boolean A08 = null;
    public List A09;
    public List A0A = null;
    public List A0B;
    public List A0C;
    public Map A0D;
    public boolean A0E = true;
    public boolean A0F = true;
    public CharSequence A0G;
    public final Object A0H = new Object();
    public final C18820ts A0I;

    public static AnonymousClass00I A00(AnonymousClass1S3 r3) {
        AnonymousClass00I A002;
        if (TextUtils.isEmpty(r3.A0G)) {
            A002 = new AnonymousClass00I(new ArrayList(), new ArrayList());
        } else {
            A002 = C202859mm.A00(r3.A0I, r3.A02(), false);
        }
        r3.A03 = A002;
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean A01() {
        /*
            r2 = this;
            java.lang.Boolean r0 = r2.A08
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1S3.A01():java.lang.Boolean");
    }

    public String A02() {
        if (this.A0G == null) {
            AnonymousClass00I r0 = this.A03;
            if (r0 == null) {
                return "";
            }
            Object obj = r0.A01;
            C18740tg.A06(obj);
            if (((List) obj).isEmpty()) {
                return "";
            }
        }
        CharSequence charSequence = this.A0G;
        if (charSequence == null) {
            return TextUtils.join(" ", A03());
        }
        return charSequence.toString();
    }

    public List A03() {
        List list;
        AnonymousClass00I r0 = this.A03;
        if (r0 != null && (list = (List) r0.A01) != null && !list.isEmpty()) {
            return list;
        }
        Object obj = A00(this).A01;
        C18740tg.A06(obj);
        return (List) obj;
    }

    public void A04(CharSequence charSequence) {
        this.A0G = charSequence;
        this.A03 = null;
    }

    public void A05(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        if (this.A03 == null) {
            this.A03 = new AnonymousClass00I(new ArrayList(), list);
        }
        this.A0G = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0086, code lost:
        if (r0 != false) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = super.toString()
            r2.append(r0)
            java.lang.String r0 = "\n\tnormal: \""
            r2.append(r0)
            java.lang.String r0 = r3.A02()
            r2.append(r0)
            java.lang.String r0 = "\";\ttokens: "
            r2.append(r0)
            java.util.List r0 = r3.A03()
            r2.append(r0)
            java.lang.String r0 = "\n\tlabel: \""
            r2.append(r0)
            java.util.List r0 = r3.A0C
            if (r0 != 0) goto L_0x0032
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0032:
            r2.append(r0)
            java.lang.String r0 = "\";\tjid: "
            r2.append(r0)
            X.11F r0 = r3.A04
            r2.append(r0)
            java.lang.String r0 = "\";\tstarred: "
            r2.append(r0)
            java.lang.Boolean r0 = r3.A01()
            r2.append(r0)
            java.lang.String r0 = "\n\tpage: "
            r2.append(r0)
            int r0 = r3.A00
            r2.append(r0)
            java.lang.String r0 = "; pageSize: "
            r2.append(r0)
            int r0 = r3.A01
            r2.append(r0)
            java.lang.String r0 = "\n\tcontact filters:"
            r2.append(r0)
            java.util.List r0 = r3.A09
            r2.append(r0)
            java.lang.String r0 = "\n\tcontact prefilters:"
            r2.append(r0)
            java.util.List r0 = r3.A0A
            r2.append(r0)
            java.lang.String r0 = "\n\tmapping: "
            r2.append(r0)
            X.00I r0 = r3.A03
            if (r0 == 0) goto L_0x0088
            java.lang.Object r1 = r0.A00
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0088
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0091
        L_0x0088:
            X.00I r0 = A00(r3)
            java.lang.Object r1 = r0.A00
            X.C18740tg.A06(r1)
        L_0x0091:
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1S3.toString():java.lang.String");
    }

    public AnonymousClass1S3(C18820ts r2) {
        this.A0I = r2;
    }
}
