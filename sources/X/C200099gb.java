package X;

import android.view.View;

/* renamed from: X.9gb  reason: invalid class name and case insensitive filesystem */
public final class C200099gb {
    public final View.OnClickListener A00;
    public final View.OnLongClickListener A01;
    public final View.OnTouchListener A02;
    public final C47002cZ A03;
    public final AnonymousClass1SV A04;
    public final AnonymousClass4SO A05;
    public final Runnable A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C200099gb) {
                C200099gb r5 = (C200099gb) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || this.A08 != r5.A08 || this.A0B != r5.A0B || this.A07 != r5.A07 || this.A0A != r5.A0A || this.A09 != r5.A09 || this.A0C != r5.A0C || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A00(C20810yC r2) {
        if (!this.A0A || !this.A0B || !this.A07 || this.A09) {
            return false;
        }
        if (this.A08) {
            return this.A0C;
        }
        return r2.A0E(3482);
    }

    public int hashCode() {
        return (((((((((((((((((((((((AnonymousClass000.A0H(this.A03) * 31) + C36341k9.A01(this.A08 ? 1 : 0)) * 31) + C36341k9.A01(this.A0B ? 1 : 0)) * 31) + C36341k9.A01(this.A07 ? 1 : 0)) * 31) + C36341k9.A01(this.A0A ? 1 : 0)) * 31) + C36341k9.A01(this.A09 ? 1 : 0)) * 31) + C36341k9.A01(this.A0C ? 1 : 0)) * 31) + AnonymousClass000.A0H(this.A04)) * 31) + AnonymousClass000.A0H(this.A06)) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A05);
    }

    public C200099gb(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, View.OnTouchListener onTouchListener, C47002cZ r4, AnonymousClass1SV r5, AnonymousClass4SO r6, Runnable runnable, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A03 = r4;
        this.A08 = z;
        this.A0B = z2;
        this.A07 = z3;
        this.A0A = z4;
        this.A09 = z5;
        this.A0C = z6;
        this.A04 = r5;
        this.A06 = runnable;
        this.A00 = onClickListener;
        this.A01 = onLongClickListener;
        this.A02 = onTouchListener;
        this.A05 = r6;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UiState(message=");
        A0u.append(this.A03);
        A0u.append(", isActive=");
        A0u.append(this.A08);
        A0u.append(", isMediaTransferSuccessful=");
        A0u.append(this.A0B);
        A0u.append(", canPlayPtv=");
        A0u.append(this.A07);
        A0u.append(", isAttached=");
        A0u.append(this.A0A);
        A0u.append(", isAnimating=");
        A0u.append(this.A09);
        A0u.append(", playWhenReadyAndActive=");
        A0u.append(this.A0C);
        A0u.append(", messageThumbCache=");
        A0u.append(this.A04);
        A0u.append(", onFileReadError=");
        A0u.append(this.A06);
        A0u.append(", onClickListener=");
        A0u.append(this.A00);
        A0u.append(", onLongClickListener=");
        A0u.append(this.A01);
        A0u.append(", onTouchListener=");
        A0u.append(this.A02);
        A0u.append(", playerStateChangedListener=");
        return AnonymousClass000.A0m(this.A05, A0u);
    }

    public C200099gb() {
        this((View.OnClickListener) null, (View.OnLongClickListener) null, (View.OnTouchListener) null, (C47002cZ) null, (AnonymousClass1SV) null, (AnonymousClass4SO) null, (Runnable) null, false, false, false, false, false, false);
    }
}
