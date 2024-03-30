package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.65S  reason: invalid class name */
public final class AnonymousClass65S {
    public long A00;
    public long A01;
    public C135066c4 A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public List A0M;
    public List A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;

    public AnonymousClass68B A00() {
        if (TextUtils.isEmpty(this.A0E)) {
            this.A0E = this.A05;
        }
        if (TextUtils.isEmpty(this.A0G)) {
            this.A0G = this.A07;
        }
        if (TextUtils.isEmpty(this.A0I)) {
            this.A0I = this.A08;
        }
        if (TextUtils.isEmpty(this.A03)) {
            this.A03 = this.A04;
        }
        if (!this.A0V) {
            C18740tg.A07(this.A0E, "sticker pack id cannot be null");
            C18740tg.A07(this.A0G, "sticker pack name cannot be null");
            C18740tg.A07(this.A0I, "sticker pack publisher cannot be null");
        }
        if (this.A0M == null) {
            this.A0M = AnonymousClass001.A0I();
        }
        if (this.A0N == null) {
            this.A0N = AnonymousClass001.A0I();
        }
        return new AnonymousClass68B(this);
    }
}
