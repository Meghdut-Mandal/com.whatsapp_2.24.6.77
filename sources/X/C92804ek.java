package X;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.4ek  reason: invalid class name and case insensitive filesystem */
public final class C92804ek extends FrameLayout implements AnonymousClass7f0 {
    public float A00 = 0.0533f;
    public AnonymousClass6LB A01 = AnonymousClass6LB.A05;
    public List A02 = Collections.emptyList();
    public final WebView A03;
    public final C92334dc A04;

    public C92804ek(Context context) {
        super(context, (AttributeSet) null);
        C92334dc r1 = new C92334dc(context, (AttributeSet) null);
        this.A04 = r1;
        C92614eG r0 = new C92614eG(context, this);
        this.A03 = r0;
        r0.setBackgroundColor(0);
        addView(r1);
        addView(r0);
    }

    public static String A00(int i) {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1J(objArr, Color.red(i));
        AnonymousClass000.A1K(objArr, Color.green(i));
        C36331k8.A1V(objArr, Color.blue(i));
        objArr[3] = Double.valueOf(((double) Color.alpha(i)) / 255.0d);
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public void BwW(AnonymousClass6LB r8, List list, float f, float f2, int i) {
        AnonymousClass6LB r2 = r8;
        this.A01 = r8;
        float f3 = f;
        this.A00 = f;
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        if (0 < list.size()) {
            list.get(0);
            throw AnonymousClass001.A0A("bitmap");
        }
        if (!this.A02.isEmpty() || !A0I2.isEmpty()) {
            this.A02 = A0I2;
            A01();
        }
        this.A04.BwW(r2, A0I, f3, f2, 0);
        invalidate();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01() {
        /*
            r9 = this;
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            r0 = 4
            java.lang.Object[] r3 = new java.lang.Object[r0]
            X.6LB r0 = r9.A01
            int r0 = r0.A03
            java.lang.String r0 = A00(r0)
            r6 = 0
            r3[r6] = r0
            float r4 = r9.A00
            r9.getHeight()
            int r0 = r9.getHeight()
            int r2 = X.AnonymousClass000.A0D(r9, r0)
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00f3
            float r0 = (float) r2
            float r4 = r4 * r0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00f3
            android.content.Context r0 = r9.getContext()
            float r0 = X.C36341k9.A00(r0)
            float r4 = r4 / r0
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            X.AnonymousClass000.A1I(r2, r4, r6)
            java.lang.String r1 = "%.2fpx"
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
        L_0x0044:
            r4 = 1
            r3[r4] = r0
            r0 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r0 = 2
            r3[r0] = r1
            X.6LB r7 = r9.A01
            int r1 = r7.A02
            if (r1 == r4) goto L_0x00d2
            if (r1 == r0) goto L_0x00c5
            r0 = 3
            if (r1 == r0) goto L_0x00b8
            r0 = 4
            if (r1 == r0) goto L_0x00df
            java.lang.String r1 = "unset"
        L_0x0061:
            r0 = 3
            r3[r0] = r1
            java.lang.String r0 = "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2fem;text-shadow:%s;'>"
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r0 = java.lang.String.format(r8, r0, r3)
            r5.append(r0)
            java.util.HashMap r7 = X.AnonymousClass001.A0J()
            java.lang.String r2 = "default_bg"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "."
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ",."
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " *"
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.6LB r0 = r9.A01
            int r0 = r0.A00
            java.lang.String r0 = A00(r0)
            r1[r6] = r0
            java.lang.String r0 = "background-color:%s;"
            java.lang.String r0 = java.lang.String.format(r8, r0, r1)
            r7.put(r2, r0)
            java.util.List r0 = r9.A02
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x00f7
            java.util.List r0 = r9.A02
            r0.get(r6)
            java.lang.String r0 = "position"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00b8:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            int r0 = r7.A01
            java.lang.String r0 = A00(r0)
            r2[r6] = r0
            java.lang.String r1 = "0.06em 0.08em 0.15em %s"
            goto L_0x00eb
        L_0x00c5:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            int r0 = r7.A01
            java.lang.String r0 = A00(r0)
            r2[r6] = r0
            java.lang.String r1 = "0.1em 0.12em 0.15em %s"
            goto L_0x00eb
        L_0x00d2:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            int r0 = r7.A01
            java.lang.String r0 = A00(r0)
            r2[r6] = r0
            java.lang.String r1 = "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s"
            goto L_0x00eb
        L_0x00df:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            int r0 = r7.A01
            java.lang.String r0 = A00(r0)
            r2[r6] = r0
            java.lang.String r1 = "-0.05em -0.05em 0.15em %s"
        L_0x00eb:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = java.lang.String.format(r0, r1, r2)
            goto L_0x0061
        L_0x00f3:
            java.lang.String r0 = "unset"
            goto L_0x0044
        L_0x00f7:
            java.lang.String r0 = "</div></body></html>"
            java.lang.StringBuilder r3 = X.C90484aE.A0q(r0, r5)
            java.lang.String r0 = "<html><head><style>"
            r3.append(r0)
            java.util.Iterator r2 = X.C90484aE.A0s(r7)
        L_0x0106:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0125
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)
            r3.append(r1)
            java.lang.String r0 = "{"
            r3.append(r0)
            java.lang.String r0 = X.C90504aG.A0l(r1, r7)
            r3.append(r0)
            java.lang.String r0 = "}"
            r3.append(r0)
            goto L_0x0106
        L_0x0125:
            java.lang.String r0 = "</style></head>"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r3)
            r5.insert(r6, r0)
            android.webkit.WebView r3 = r9.A03
            java.lang.String r1 = r5.toString()
            java.nio.charset.Charset r0 = X.C114085gc.A05
            byte[] r0 = r1.getBytes(r0)
            java.lang.String r2 = android.util.Base64.encodeToString(r0, r4)
            java.lang.String r1 = "text/html"
            java.lang.String r0 = "base64"
            r3.loadData(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92804ek.A01():void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.A02.isEmpty()) {
            A01();
        }
    }
}
