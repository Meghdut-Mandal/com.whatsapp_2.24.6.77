package X;

import android.graphics.RectF;
import android.net.Uri;
import java.io.File;

/* renamed from: X.65P  reason: invalid class name */
public final class AnonymousClass65P {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final RectF A06;
    public final C1262263a A07;
    public final C25471Gl A08;
    public final AnonymousClass3S2 A09;
    public final File A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public final File A00() {
        Uri parse;
        String str = this.A0E;
        if (str == null || (parse = Uri.parse(str)) == null || !parse.isAbsolute()) {
            return null;
        }
        return AnonymousClass6YY.A03(parse);
    }

    public AnonymousClass65P(RectF rectF, C1262263a r4, C25471Gl r5, AnonymousClass3S2 r6, File file, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A0B = str;
        this.A0A = file;
        this.A0E = str2;
        this.A0C = str3;
        this.A0D = str4;
        this.A08 = r5;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = j;
        this.A05 = j2;
        this.A03 = i3;
        this.A02 = i4;
        this.A06 = rectF;
        this.A0H = z;
        this.A0G = z2;
        this.A0M = z3;
        this.A0F = z4;
        this.A09 = r6;
        this.A07 = r4;
        this.A0K = z5;
        this.A0L = z6;
        this.A0I = z7;
        this.A0J = z8;
        if (!z4) {
            return;
        }
        if (r5 == C25471Gl.A0D || r5 == C25471Gl.A0l || r5 == C25471Gl.A0J || r5 == C25471Gl.A0b || r5 == C25471Gl.A08 || r5 == C25471Gl.A0O || r5 == C25471Gl.A09 || r5 == C25471Gl.A0T || r5 == C25471Gl.A0G || r5 == C25471Gl.A0H) {
            C18740tg.A0F(AnonymousClass000.A1V(r4), "Image transcoding should have quality settings");
        }
    }
}
