package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* renamed from: X.01y  reason: invalid class name and case insensitive filesystem */
public class C004401y extends C004201w implements AnonymousClass016, AnonymousClass017, AnonymousClass019, AnonymousClass01A, AnonymousClass01B, AnonymousClass01C, AnonymousClass01D, AnonymousClass01E, AnonymousClass01F, C004301x {
    public final Activity A00;
    public final Context A01;
    public final Handler A02;
    public final AnonymousClass01z A03 = new AnonymousClass020();
    public final /* synthetic */ AnonymousClass01I A04;

    public C004401y(AnonymousClass01I r3) {
        this.A04 = r3;
        Handler handler = new Handler();
        this.A00 = r3;
        this.A01 = r3;
        this.A02 = handler;
    }

    public View A00(int i) {
        return this.A04.findViewById(i);
    }

    public boolean A01() {
        Window window = this.A04.getWindow();
        if (window == null || window.peekDecorView() == null) {
            return false;
        }
        return true;
    }

    public void B0U(AnonymousClass027 r2) {
        this.A04.B0U(r2);
    }

    public void B0X(AnonymousClass026 r2) {
        this.A04.B0X(r2);
    }

    public void B0Z(AnonymousClass026 r2) {
        this.A04.B0Z(r2);
    }

    public void B0a(AnonymousClass026 r2) {
        this.A04.B0a(r2);
    }

    public void B0d(AnonymousClass026 r2) {
        this.A04.B0d(r2);
    }

    public AnonymousClass01X B8F() {
        return this.A04.A04;
    }

    public AnonymousClass01W BEd() {
        return this.A04.A05;
    }

    public AnonymousClass01U BGx() {
        return this.A04.A07.A01;
    }

    public AnonymousClass04J BJ7() {
        return this.A04.BJ7();
    }

    public void BRR(AnonymousClass02E r2, AnonymousClass01z r3) {
        this.A04.A22(r2);
    }

    public void Bno(AnonymousClass027 r2) {
        this.A04.Bno(r2);
    }

    public void Bnp(AnonymousClass026 r2) {
        this.A04.Bnp(r2);
    }

    public void Bnq(AnonymousClass026 r2) {
        this.A04.Bnq(r2);
    }

    public void Bnr(AnonymousClass026 r2) {
        this.A04.Bnr(r2);
    }

    public void Bnu(AnonymousClass026 r2) {
        this.A04.Bnu(r2);
    }

    public AnonymousClass01M getLifecycle() {
        return this.A04.A03;
    }
}
