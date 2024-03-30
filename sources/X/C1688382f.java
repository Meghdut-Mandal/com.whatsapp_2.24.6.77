package X;

import android.text.Html;
import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;

/* renamed from: X.82f  reason: invalid class name and case insensitive filesystem */
public abstract class C1688382f extends C209039zM implements B27 {
    public final String A00;

    public C1688382f(String str) {
        super(new AnonymousClass82Y[2], new C1688282d[2]);
        this.A00 = str;
        int i = this.A00;
        C200319h9.A02(AnonymousClass000.A1S(i, r2));
        for (AnonymousClass82Z A002 : this.A0A) {
            A002.A00(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        }
    }

    public B2l A06(byte[] bArr, int i, boolean z) {
        int i2;
        AnonymousClass835 r8 = (AnonymousClass835) this;
        ArrayList A0I = AnonymousClass001.A0I();
        int i3 = 0;
        long[] jArr = new long[32];
        C202309lW r3 = new C202309lW(bArr, i);
        while (true) {
            String A0C = r3.A0C();
            if (A0C == null) {
                break;
            } else if (A0C.length() != 0) {
                try {
                    Integer.parseInt(A0C);
                    String A0C2 = r3.A0C();
                    if (A0C2 == null) {
                        C165597tg.A1H("Unexpected end", "HeroPlayer2SubripDecoder", new Object[0]);
                        break;
                    }
                    Matcher matcher = AnonymousClass835.A01.matcher(A0C2);
                    if (matcher.matches()) {
                        boolean z2 = true;
                        long A002 = A00(matcher, 1);
                        if (i3 == jArr.length) {
                            jArr = Arrays.copyOf(jArr, i3 * 2);
                        }
                        int i4 = i3;
                        int i5 = i3 + 1;
                        i3 = i5;
                        jArr[i4] = A002;
                        if (!TextUtils.isEmpty(matcher.group(6))) {
                            long A003 = A00(matcher, 6);
                            if (i5 == jArr.length) {
                                jArr = Arrays.copyOf(jArr, i5 * 2);
                            }
                            i3 = i5 + 1;
                            jArr[i5] = A003;
                        } else {
                            z2 = false;
                        }
                        StringBuilder sb = r8.A00;
                        sb.setLength(0);
                        while (true) {
                            String A0C3 = r3.A0C();
                            if (TextUtils.isEmpty(A0C3)) {
                                break;
                            }
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            sb.append(A0C3.trim());
                        }
                        A0I.add(new AnonymousClass6TI(Html.fromHtml(new C191429Cx(sb.toString()).A00)));
                        if (z2) {
                            A0I.add((Object) null);
                        }
                    } else {
                        C165597tg.A1H(AnonymousClass000.A0p("Skipping invalid timing: ", A0C2, AnonymousClass000.A0u()), "HeroPlayer2SubripDecoder", new Object[0]);
                    }
                } catch (NumberFormatException unused) {
                    C165597tg.A1H(AnonymousClass000.A0p("Skipping invalid index: ", A0C, AnonymousClass000.A0u()), "HeroPlayer2SubripDecoder", new Object[0]);
                }
            }
        }
        int size = A0I.size();
        AnonymousClass6TI[] r5 = new AnonymousClass6TI[size];
        A0I.toArray(r5);
        long[] copyOf = Arrays.copyOf(jArr, i3);
        ArrayList A0I2 = AnonymousClass001.A0I();
        for (int i6 = 0; i6 < size; i6++) {
            A0I2.add(new C21659AUb(r5[i6], copyOf[i6]));
        }
        Collections.sort(A0I2);
        for (i2 = 0; i2 < size; i2++) {
            C21659AUb aUb = (C21659AUb) A0I2.get(i2);
            r5[i2] = aUb.A01;
            copyOf[i2] = aUb.A00;
        }
        return new A08(copyOf, r5);
    }

    public static long A00(Matcher matcher, int i) {
        return ((Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }

    public final String getName() {
        return this.A00;
    }

    public /* bridge */ /* synthetic */ void A05(AnonymousClass82X r1) {
        super.A05(r1);
    }

    public final void A07(C1688282d r1) {
        super.A05(r1);
    }
}
