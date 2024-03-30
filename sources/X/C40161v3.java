package X;

import android.content.Context;
import android.database.Cursor;

/* renamed from: X.1v3  reason: invalid class name and case insensitive filesystem */
public class C40161v3 extends C03760Hp {
    public C02680Bk A00;
    public Cursor A01;
    public final C18820ts A02;
    public final AnonymousClass11F A03;
    public final C88094Rj A04;
    public final String A05;

    public /* bridge */ /* synthetic */ Object A06() {
        Cursor BE9;
        synchronized (this) {
            if (!AnonymousClass000.A1V(this.A01)) {
                this.A00 = new C02680Bk();
            } else {
                throw new AnonymousClass02S();
            }
        }
        try {
            AnonymousClass1S3 r3 = new AnonymousClass1S3(this.A02);
            r3.A04(this.A05);
            BE9 = this.A04.BE9(this.A00, this.A03, r3);
            if (BE9 != null) {
                BE9.getCount();
            }
            synchronized (this) {
                this.A00 = null;
            }
            return BE9;
        } catch (RuntimeException e) {
            BE9.close();
            throw e;
        } catch (Throwable th) {
            th = th;
            synchronized (this) {
                try {
                    this.A00 = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                throw th;
            }
        }
    }

    public void A08() {
        synchronized (this) {
            C02680Bk r0 = this.A00;
            if (r0 != null) {
                r0.A03();
            }
        }
    }

    public void A03() {
        Cursor cursor = this.A01;
        if (cursor != null) {
            A04(cursor);
        }
        boolean z = this.A03;
        this.A03 = false;
        this.A04 |= z;
        if (z || this.A01 == null) {
            A09();
        }
    }

    public /* bridge */ /* synthetic */ void A0B(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: A0C */
    public void A04(Cursor cursor) {
        if (!this.A05) {
            Cursor cursor2 = this.A01;
            this.A01 = cursor;
            if (this.A06) {
                super.A04(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    public C40161v3(Context context, C18820ts r2, AnonymousClass11F r3, C88094Rj r4, String str) {
        super(context);
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = str;
        this.A03 = r3;
    }

    public void A01() {
        A00();
        Cursor cursor = this.A01;
        if (cursor != null && !cursor.isClosed()) {
            this.A01.close();
        }
        this.A01 = null;
    }

    public void A02() {
        A00();
    }
}
